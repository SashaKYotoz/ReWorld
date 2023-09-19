
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reworld.client.model.Modelsnowy_icy_creature;
import net.mcreator.reworld.client.model.Modelpomegranate_stone_golem;
import net.mcreator.reworld.client.model.Modelpomegranate_stone_armor;
import net.mcreator.reworld.client.model.Modelpoisoned_blue_mycenae;
import net.mcreator.reworld.client.model.Modelmycenae_morpho;
import net.mcreator.reworld.client.model.Modelluna_butterfly;
import net.mcreator.reworld.client.model.Modellittle_maniac;
import net.mcreator.reworld.client.model.Modelfurred_icy_armor;
import net.mcreator.reworld.client.model.Modelent_armor;
import net.mcreator.reworld.client.model.Modelbig_incense_burner;
import net.mcreator.reworld.client.model.Modelalive_blue_pomegranate_stone;
import net.mcreator.reworld.client.model.ModelIcy_Sphere;
import net.mcreator.reworld.client.model.ModelEritieric_Ent;
import net.mcreator.reworld.client.model.ModelAlive_Snowy_Ice;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ReworldModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEritieric_Ent.LAYER_LOCATION, ModelEritieric_Ent::createBodyLayer);
		event.registerLayerDefinition(Modelbig_incense_burner.LAYER_LOCATION, Modelbig_incense_burner::createBodyLayer);
		event.registerLayerDefinition(Modelfurred_icy_armor.LAYER_LOCATION, Modelfurred_icy_armor::createBodyLayer);
		event.registerLayerDefinition(Modelpomegranate_stone_armor.LAYER_LOCATION, Modelpomegranate_stone_armor::createBodyLayer);
		event.registerLayerDefinition(Modelpomegranate_stone_golem.LAYER_LOCATION, Modelpomegranate_stone_golem::createBodyLayer);
		event.registerLayerDefinition(Modelsnowy_icy_creature.LAYER_LOCATION, Modelsnowy_icy_creature::createBodyLayer);
		event.registerLayerDefinition(ModelAlive_Snowy_Ice.LAYER_LOCATION, ModelAlive_Snowy_Ice::createBodyLayer);
		event.registerLayerDefinition(Modelalive_blue_pomegranate_stone.LAYER_LOCATION, Modelalive_blue_pomegranate_stone::createBodyLayer);
		event.registerLayerDefinition(Modelpoisoned_blue_mycenae.LAYER_LOCATION, Modelpoisoned_blue_mycenae::createBodyLayer);
		event.registerLayerDefinition(Modellittle_maniac.LAYER_LOCATION, Modellittle_maniac::createBodyLayer);
		event.registerLayerDefinition(ModelIcy_Sphere.LAYER_LOCATION, ModelIcy_Sphere::createBodyLayer);
		event.registerLayerDefinition(Modelluna_butterfly.LAYER_LOCATION, Modelluna_butterfly::createBodyLayer);
		event.registerLayerDefinition(Modelmycenae_morpho.LAYER_LOCATION, Modelmycenae_morpho::createBodyLayer);
		event.registerLayerDefinition(Modelent_armor.LAYER_LOCATION, Modelent_armor::createBodyLayer);
	}
}
