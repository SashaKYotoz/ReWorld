package net.mcreator.reworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModItems;
import net.mcreator.reworld.init.ReworldModBlocks;

public class GrownPitayaPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 4, 8); index0++) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ReworldModItems.PITAYA_FRUIT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), ReworldModBlocks.PITAYA.get().defaultBlockState(), 3);
	}
}
