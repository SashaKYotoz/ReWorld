
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.WhiteBelliedMinagoBirdEntity;
import net.mcreator.reworld.client.model.Modellittle_maniac;

public class WhiteBelliedMinagoBirdRenderer extends MobRenderer<WhiteBelliedMinagoBirdEntity, Modellittle_maniac<WhiteBelliedMinagoBirdEntity>> {
	public WhiteBelliedMinagoBirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellittle_maniac(context.bakeLayer(Modellittle_maniac.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteBelliedMinagoBirdEntity entity) {
		return new ResourceLocation("reworld:textures/entities/little_maniac.png");
	}
}
