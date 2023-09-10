package net.mcreator.reworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlueMycenaeHangingAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean solidblockexits = false;
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			solidblockexits = true;
		} else if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			solidblockexits = false;
		}
		return solidblockexits;
	}
}
