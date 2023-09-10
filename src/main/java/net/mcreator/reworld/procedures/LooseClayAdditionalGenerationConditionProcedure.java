package net.mcreator.reworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LooseClayAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			LooseClayGenerationProcedure.execute(world, x, y, z);
		}
		return true;
	}
}
