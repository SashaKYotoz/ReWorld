package net.mcreator.reworld;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReWorldModInitialization {
	public ReWorldModInitialization() {
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new ReWorldModInitialization();
	}

	@Mod.EventBusSubscriber
	private static class ForgeBusEvents {
		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void serverLoad(ServerStartingEvent event) {
			ReWorldModItemProperties.addCustomItemProperties();
		}
	}
}
