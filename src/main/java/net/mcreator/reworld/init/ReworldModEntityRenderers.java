
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.reworld.client.renderer.WhiteBelliedMinagoBirdRenderer;
import net.mcreator.reworld.client.renderer.TamorindicLunaButterflyRenderer;
import net.mcreator.reworld.client.renderer.SnowyIcyCreatureRenderer;
import net.mcreator.reworld.client.renderer.PomegranateStoneGolemRenderer;
import net.mcreator.reworld.client.renderer.PoisonedBlueMycenaeRenderer;
import net.mcreator.reworld.client.renderer.MycenaeMorphoRenderer;
import net.mcreator.reworld.client.renderer.FreezingSkewerRangedItemRenderer;
import net.mcreator.reworld.client.renderer.EntRenderer;
import net.mcreator.reworld.client.renderer.BigIncenseBurnerRenderer;
import net.mcreator.reworld.client.renderer.AliveSnowyIceRenderer;
import net.mcreator.reworld.client.renderer.AliveBluePomegranateStoneRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReworldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ReworldModEntities.FORESTBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.SNOWY_ICY_CREATURE.get(), SnowyIcyCreatureRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.ENT.get(), EntRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.ALIVE_SNOWY_ICE.get(), AliveSnowyIceRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.WHITE_BELLIED_MINAGO_BIRD.get(), WhiteBelliedMinagoBirdRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.TAMORINDIC_LUNA_BUTTERFLY.get(), TamorindicLunaButterflyRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.ALIVE_BLUE_POMEGRANATE_STONE.get(), AliveBluePomegranateStoneRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.POISONED_BLUE_MYCENAE.get(), PoisonedBlueMycenaeRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.BIG_INCENSE_BURNER.get(), BigIncenseBurnerRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.MYCENAE_MORPHO.get(), MycenaeMorphoRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.POMEGRANATE_STONE_GOLEM.get(), PomegranateStoneGolemRenderer::new);
		event.registerEntityRenderer(ReworldModEntities.FREEZING_SKEWER_RANGED_ITEM.get(), FreezingSkewerRangedItemRenderer::new);
	}
}
