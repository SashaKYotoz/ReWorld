
package net.mcreator.reworld.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.procedures.PhysalisPlantDestroyedByPlayerProcedure;
import net.mcreator.reworld.init.ReworldModItems;

public class PhysalisBlock extends CropBlock {
	public static final int MAX_AGE = 7;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public PhysalisBlock() {
		super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.1f, 0f).lightLevel(s -> 1).noCollission());
		this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
	}

	public IntegerProperty getAgeProperty() {
		return AGE;
	}

	public int getMaxAge() {
		return 7;
	}

	protected int getAge(BlockState p_52306_) {
		return p_52306_.getValue(this.getAgeProperty());
	}

	public BlockState getStateForAge(int p_52290_) {
		return this.defaultBlockState().setValue(this.getAgeProperty(), Integer.valueOf(p_52290_));
	}

	public boolean isMaxAge(BlockState p_52308_) {
		return p_52308_.getValue(this.getAgeProperty()) >= this.getMaxAge();
	}

	public boolean isRandomlyTicking(BlockState p_52288_) {
		return !this.isMaxAge(p_52288_);
	}

	public void randomTick(BlockState p_221050_, ServerLevel p_221051_, BlockPos p_221052_, RandomSource p_221053_) {
		if (!p_221051_.isAreaLoaded(p_221052_, 1))
			return; // Forge: prevent loading unloaded chunks when checking neighbor's light
		if (p_221051_.getRawBrightness(p_221052_, 0) >= 9) {
			int i = this.getAge(p_221050_);
			if (i < this.getMaxAge()) {
				float f = getGrowthSpeed(this, p_221051_, p_221052_);
				if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(p_221051_, p_221052_, p_221050_,
						p_221053_.nextInt((int) (25.0F / f) + 1) == 0)) {
					p_221051_.setBlock(p_221052_, this.getStateForAge(i + 1), 2);
					net.minecraftforge.common.ForgeHooks.onCropsGrowPost(p_221051_, p_221052_, p_221050_);
				}
			}
		}
	}

	public void growCrops(Level p_52264_, BlockPos p_52265_, BlockState p_52266_) {
		int i = this.getAge(p_52266_) + this.getBonemealAgeIncrease(p_52264_);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}
		p_52264_.setBlock(p_52265_, this.getStateForAge(i), 2);
	}

	protected int getBonemealAgeIncrease(Level p_52262_) {
		return Mth.nextInt(p_52262_.random, 2, 5);
	}

	protected static float getGrowthSpeed(Block p_52273_, BlockGetter p_52274_, BlockPos p_52275_) {
		float f = 1.0F;
		BlockPos blockpos = p_52275_.below();
		for (int i = -1; i <= 1; ++i) {
			for (int j = -1; j <= 1; ++j) {
				float f1 = 0.0F;
				BlockState blockstate = p_52274_.getBlockState(blockpos.offset(i, 0, j));
				if (blockstate.canSustainPlant(p_52274_, blockpos.offset(i, 0, j), net.minecraft.core.Direction.UP,
						(net.minecraftforge.common.IPlantable) p_52273_)) {
					f1 = 1.0F;
					if (blockstate.isFertile(p_52274_, p_52275_.offset(i, 0, j))) {
						f1 = 3.0F;
					}
				}
				if (i != 0 || j != 0) {
					f1 /= 4.0F;
				}
				f += f1;
			}
		}
		BlockPos blockpos1 = p_52275_.north();
		BlockPos blockpos2 = p_52275_.south();
		BlockPos blockpos3 = p_52275_.west();
		BlockPos blockpos4 = p_52275_.east();
		boolean flag = p_52274_.getBlockState(blockpos3).is(p_52273_) || p_52274_.getBlockState(blockpos4).is(p_52273_);
		boolean flag1 = p_52274_.getBlockState(blockpos1).is(p_52273_) || p_52274_.getBlockState(blockpos2).is(p_52273_);
		if (flag && flag1) {
			f /= 2.0F;
		} else {
			boolean flag2 = p_52274_.getBlockState(blockpos3.north()).is(p_52273_) || p_52274_.getBlockState(blockpos4.north()).is(p_52273_)
					|| p_52274_.getBlockState(blockpos4.south()).is(p_52273_) || p_52274_.getBlockState(blockpos3.south()).is(p_52273_);
			if (flag2) {
				f /= 2.0F;
			}
		}
		return f;
	}

	public void entityInside(BlockState p_52277_, Level p_52278_, BlockPos p_52279_, Entity p_52280_) {
		if (p_52280_ instanceof Ravager && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(p_52278_, p_52280_)) {
			p_52278_.destroyBlock(p_52279_, true, p_52280_);
		}
		super.entityInside(p_52277_, p_52278_, p_52279_, p_52280_);
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.FARMLAND);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CROP;
	}

	protected ItemLike getBaseSeedId() {
		return ReworldModItems.PHYSALIS.get();
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		PhysalisPlantDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}

	public boolean isValidBonemealTarget(BlockGetter p_52258_, BlockPos p_52259_, BlockState p_52260_, boolean p_52261_) {
		return !this.isMaxAge(p_52260_);
	}

	public boolean isBonemealSuccess(Level p_221045_, RandomSource p_221046_, BlockPos p_221047_, BlockState p_221048_) {
		return true;
	}

	public void performBonemeal(ServerLevel p_221040_, RandomSource p_221041_, BlockPos p_221042_, BlockState p_221043_) {
		this.growCrops(p_221040_, p_221042_, p_221043_);
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_52286_) {
		p_52286_.add(AGE);
	}
}
