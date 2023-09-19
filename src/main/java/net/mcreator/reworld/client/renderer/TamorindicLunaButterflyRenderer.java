
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.TamorindicLunaButterflyEntity;
import net.mcreator.reworld.client.model.Modelluna_butterfly;

public class TamorindicLunaButterflyRenderer extends MobRenderer<TamorindicLunaButterflyEntity, Modelluna_butterfly<TamorindicLunaButterflyEntity>> {
	public TamorindicLunaButterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelluna_butterfly(context.bakeLayer(Modelluna_butterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TamorindicLunaButterflyEntity entity) {
		return new ResourceLocation("reworld:textures/entities/luna_butterfly.png");
	}
}
