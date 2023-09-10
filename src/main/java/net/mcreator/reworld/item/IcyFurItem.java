
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IcyFurItem extends Item {
	public IcyFurItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
