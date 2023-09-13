
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlourItem extends Item {
	public FlourItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
