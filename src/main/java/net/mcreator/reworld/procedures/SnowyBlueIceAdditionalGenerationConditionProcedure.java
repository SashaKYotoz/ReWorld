package net.mcreator.reworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModBlocks;

public class SnowyBlueIceAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean place = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW)
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SNOW_BLOCK) {
			sx = -4;
			for (int index0 = 0; index0 < 8; index0++) {
				sy = -2;
				for (int index1 = 0; index1 < 4; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 8; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW_BLOCK) {
							if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), ReworldModBlocks.SNOWY_BLUE_ICE.get().defaultBlockState(), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			place = true;
		} else {
			place = false;
		}
		return place;
	}
}
