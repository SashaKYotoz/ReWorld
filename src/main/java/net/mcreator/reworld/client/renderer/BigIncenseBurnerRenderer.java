
package net.mcreator.reworld.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.BigIncenseBurnerEntity;
import net.mcreator.reworld.client.model.Modelbig_incense_burner;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.Slime;

public class BigIncenseBurnerRenderer extends MobRenderer<BigIncenseBurnerEntity, Modelbig_incense_burner<BigIncenseBurnerEntity>> {
	public BigIncenseBurnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbig_incense_burner(context.bakeLayer(Modelbig_incense_burner.LAYER_LOCATION)), 0.5f);
	}
	public void render(BigIncenseBurnerEntity p_115976_, float p_115977_, float p_115978_, PoseStack p_115979_, MultiBufferSource p_115980_, int p_115981_) {
		super.render(p_115976_, p_115977_, p_115978_, p_115979_, p_115980_, p_115981_);
	}

	protected void scale(BigIncenseBurnerEntity p_115983_, PoseStack p_115984_, float p_115985_) {
		p_115984_.scale(1.5f,1.5f,1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigIncenseBurnerEntity entity) {
		return new ResourceLocation("reworld:textures/entities/big_incense_burner.png");
	}
}
