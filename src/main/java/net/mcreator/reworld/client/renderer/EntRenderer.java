
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.EntEntity;
import net.mcreator.reworld.client.model.ModelEritieric_Ent;

public class EntRenderer extends MobRenderer<EntEntity, ModelEritieric_Ent<EntEntity>> {
	public EntRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEritieric_Ent(context.bakeLayer(ModelEritieric_Ent.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EntEntity entity) {
		return new ResourceLocation("reworld:textures/entities/ent.png");
	}
}
