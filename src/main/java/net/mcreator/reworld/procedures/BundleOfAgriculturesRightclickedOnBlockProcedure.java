package net.mcreator.reworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class BundleOfAgriculturesRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (itemstack.getOrCreateTag().getDouble("has_agriculture") > 0) {
			itemstack.getOrCreateTag().putDouble("has_agriculture", (itemstack.getOrCreateTag().getDouble("has_agriculture") - 1));
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
		}
	}
}
