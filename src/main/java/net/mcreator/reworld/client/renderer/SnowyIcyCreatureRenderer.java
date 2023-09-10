
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.SnowyIcyCreatureEntity;
import net.mcreator.reworld.client.model.Modelsnowy_icy_creature;

public class SnowyIcyCreatureRenderer extends MobRenderer<SnowyIcyCreatureEntity, Modelsnowy_icy_creature<SnowyIcyCreatureEntity>> {
	public SnowyIcyCreatureRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnowy_icy_creature(context.bakeLayer(Modelsnowy_icy_creature.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowyIcyCreatureEntity entity) {
		return new ResourceLocation("reworld:textures/entities/snowy_icy_creature.png");
	}
}
