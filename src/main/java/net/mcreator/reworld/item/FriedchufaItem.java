
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FriedchufaItem extends Item {
	public FriedchufaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.7f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 24;
	}
}
