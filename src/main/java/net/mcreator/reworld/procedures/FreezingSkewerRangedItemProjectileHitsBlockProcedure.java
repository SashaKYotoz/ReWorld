package net.mcreator.reworld.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class FreezingSkewerRangedItemProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState currectblock = Blocks.AIR.defaultBlockState();
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK) || !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_PORTAL_FRAME)) {
			if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
				currectblock = (world.getBlockState(BlockPos.containing(x, y, z)));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 2, z), currectblock);
			}
		}
	}
}
