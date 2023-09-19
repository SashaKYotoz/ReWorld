
package net.mcreator.reworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reworld.entity.MycenaeMorphoEntity;
import net.mcreator.reworld.client.model.Modelmycenae_morpho;

public class MycenaeMorphoRenderer extends MobRenderer<MycenaeMorphoEntity, Modelmycenae_morpho<MycenaeMorphoEntity>> {
	public MycenaeMorphoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycenae_morpho(context.bakeLayer(Modelmycenae_morpho.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MycenaeMorphoEntity entity) {
		return new ResourceLocation("reworld:textures/entities/mycenae_morpho.png");
	}
}
