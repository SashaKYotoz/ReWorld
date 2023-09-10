package net.mcreator.reworld;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.reworld.init.ReworldModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReWorldModItemProperties {
	public static void addCustomItemProperties() {
		makeBow(ReworldModItems.FORESTBOW.get());
	}

	private static void makeBow(Item item) {
		ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
			if (p_174637_ == null) {
				return 0.0F;
			} else {
				return p_174637_.getUseItem() != p_174635_
						? 0.0F
						: (float) (p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
			}
		});
		ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
			return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
		});
	}
}
