
package net.mcreator.reworld.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.procedures.SandrouseMobplayerCollidesWithPlantProcedure;
import net.mcreator.reworld.init.ReworldModBlocks;

import java.util.List;
import java.util.Collections;

public class SandrouseBlock extends FlowerBlock {
	public SandrouseBlock() {
		super(() -> MobEffects.MOVEMENT_SLOWDOWN, 100, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.SAND).sound(SoundType.GRASS).instabreak().noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ReworldModBlocks.SANDROUSE.get()));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.SAND) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT_PATH) || groundState.is(Blocks.MYCELIUM) || groundState.is(Blocks.PODZOL);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.DESERT;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SandrouseMobplayerCollidesWithPlantProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
