
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.PomegranateStoneGolemEntity;
import net.mcreator.reworld.client.model.Modelpomegranate_stone_golem;

public class PomegranateStoneGolemRenderer extends MobRenderer<PomegranateStoneGolemEntity, Modelpomegranate_stone_golem<PomegranateStoneGolemEntity>> {
	public PomegranateStoneGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpomegranate_stone_golem(context.bakeLayer(Modelpomegranate_stone_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PomegranateStoneGolemEntity entity) {
		return new ResourceLocation("reworld:textures/entities/pomegranate_stone_golem.png");
	}
}
