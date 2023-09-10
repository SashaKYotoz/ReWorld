
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class ReworldModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == ReworldModItems.BRANCH_OF_BLACK_PEPPERS.get())
			event.setBurnTime(200);
	}
}
