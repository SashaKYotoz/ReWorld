
package net.mcreator.reworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HeartOfMushroomsItem extends Item {
	public HeartOfMushroomsItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}
}
