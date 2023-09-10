package net.mcreator.reworld.procedures;

import net.minecraft.world.item.ItemStack;

public class BundleOfAgriculturesItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("has_agriculture") > 0) {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 1);
		} else {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 0);
		}
	}
}
