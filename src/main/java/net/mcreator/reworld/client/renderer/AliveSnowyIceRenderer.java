
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.AliveSnowyIceEntity;
import net.mcreator.reworld.client.model.ModelAlive_Snowy_Ice;

public class AliveSnowyIceRenderer extends MobRenderer<AliveSnowyIceEntity, ModelAlive_Snowy_Ice<AliveSnowyIceEntity>> {
	public AliveSnowyIceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAlive_Snowy_Ice(context.bakeLayer(ModelAlive_Snowy_Ice.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AliveSnowyIceEntity entity) {
		return new ResourceLocation("reworld:textures/entities/alive_snowy_ice.png");
	}
}
