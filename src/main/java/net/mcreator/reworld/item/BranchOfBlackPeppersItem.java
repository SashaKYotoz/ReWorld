
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BranchOfBlackPeppersItem extends Item {
	public BranchOfBlackPeppersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(1f).build()));
	}
}
