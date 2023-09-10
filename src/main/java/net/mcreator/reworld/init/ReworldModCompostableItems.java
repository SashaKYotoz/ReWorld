
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReworldModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(ReworldModItems.BRANCH_OF_BLACK_PEPPERS.get(), 0.1f);
		ComposterBlock.COMPOSTABLES.put(ReworldModItems.EDIBLEROOTS.get(), 0.1f);
		ComposterBlock.COMPOSTABLES.put(ReworldModBlocks.MELOTHRIA.get().asItem(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(ReworldModBlocks.CHUFA.get().asItem(), 0.1f);
	}
}
