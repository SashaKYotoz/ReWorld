package net.mcreator.reworld.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.reworld.entity.MycenaeMorphoEntity;
import net.mcreator.reworld.MycenaeMorphoAnimations;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Modelmycenae_morpho<T extends MycenaeMorphoEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelmycenae_morpho"), "main");
	public final ModelPart general;
	public final ModelPart root;

	public Modelmycenae_morpho(ModelPart root) {
		this.root = root;
		this.general = root.getChild("general");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(), PartPose.offset(0.0F, 21.5F, 0.0F));
		PartDefinition body = general.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(-1.5F, -2.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition horn = body.addOrReplaceChild("horn", CubeListBuilder.create().texOffs(0, 15).addBox(-4.5F, -5.0F, 0.5F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 3.0F));
		PartDefinition forwardrightWing = general.addOrReplaceChild("forwardrightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = forwardrightWing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(0.0F, 0.0F, 1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 0).mirror()
				.addBox(0.0F, 0.5F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition backrightWing2 = forwardrightWing.addOrReplaceChild("backrightWing2", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(0.0F, 0.0F, -4.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 1.0F, -3.0F));
		PartDefinition forwardleftWing = general.addOrReplaceChild("forwardleftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.0F, -1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r2 = forwardleftWing.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 0).addBox(-7.0F, 0.5F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 0).addBox(-7.0F, 0.0F, 1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition backleftWing2 = forwardleftWing.addOrReplaceChild("backleftWing2", CubeListBuilder.create().texOffs(40, 7).addBox(-5.0F, 0.0F, -4.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.0F, -3.0F));
		PartDefinition small_paws = general.addOrReplaceChild("small_paws", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.5F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition right = small_paws.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.5F));
		PartDefinition cube_r3 = right.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -1.0F, 1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, 0.5236F, 0.0F, -0.0873F));
		PartDefinition left = small_paws.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, -2.5F));
		PartDefinition cube_r4 = left.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -2.0F, 0.75F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, -1.5F, -0.5236F, 0.0F, -0.0873F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		general.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animate(entity.idleState, MycenaeMorphoAnimations.IDLE, ageInTicks);
		this.animate(entity.flyState, MycenaeMorphoAnimations.FLY, ageInTicks);
		this.animate(entity.deathState, MycenaeMorphoAnimations.DEATH, ageInTicks);
	}
}
