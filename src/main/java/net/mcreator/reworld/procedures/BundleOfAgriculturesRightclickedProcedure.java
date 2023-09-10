package net.mcreator.reworld.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class BundleOfAgriculturesRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("reworld:agricultures"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))))
				: false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("reworld:agricultures"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			itemstack.getOrCreateTag().putDouble("has_agriculture", (itemstack.getOrCreateTag().getDouble("has_agriculture") + 1));
		}
	}
}
