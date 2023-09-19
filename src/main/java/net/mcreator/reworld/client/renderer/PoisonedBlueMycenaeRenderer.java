
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.PoisonedBlueMycenaeEntity;
import net.mcreator.reworld.client.model.Modelpoisoned_blue_mycenae;

public class PoisonedBlueMycenaeRenderer extends MobRenderer<PoisonedBlueMycenaeEntity, Modelpoisoned_blue_mycenae<PoisonedBlueMycenaeEntity>> {
	public PoisonedBlueMycenaeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpoisoned_blue_mycenae(context.bakeLayer(Modelpoisoned_blue_mycenae.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PoisonedBlueMycenaeEntity entity) {
		return new ResourceLocation("reworld:textures/entities/alive_blue_pomegranate_stone.png");
	}
}
