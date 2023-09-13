
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DoughItem extends Item {
	public DoughItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
