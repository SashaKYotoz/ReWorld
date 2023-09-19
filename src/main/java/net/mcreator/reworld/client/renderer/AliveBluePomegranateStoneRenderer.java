
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.AliveBluePomegranateStoneEntity;
import net.mcreator.reworld.client.model.Modelalive_blue_pomegranate_stone;

public class AliveBluePomegranateStoneRenderer extends MobRenderer<AliveBluePomegranateStoneEntity, Modelalive_blue_pomegranate_stone<AliveBluePomegranateStoneEntity>> {
	public AliveBluePomegranateStoneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalive_blue_pomegranate_stone(context.bakeLayer(Modelalive_blue_pomegranate_stone.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AliveBluePomegranateStoneEntity entity) {
		return new ResourceLocation("reworld:textures/entities/alive_blue_pomegranate_stone.png");
	}
}
