package net.mcreator.reworld.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelluna_butterfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelluna_butterfly"), "main");
	public final ModelPart general;

	public Modelluna_butterfly(ModelPart root) {
		this.general = root.getChild("general");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(), PartPose.offset(0.0F, 21.5F, 0.0F));
		PartDefinition body = general.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-3.5F, -6.0F, 2.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 0).mirror()
						.addBox(-2.5F, -2.0F, 4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 0).addBox(0.5F, -2.0F, 4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0F, 0.0F, 4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition forwardrightWing = general.addOrReplaceChild("forwardrightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = forwardrightWing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(0.0F, 0.0F, -4.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition backrightWing2 = forwardrightWing.addOrReplaceChild("backrightWing2", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(0.0F, 0.0F, -9.0F, 6.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.5F, 1.0F, -2.0F));
		PartDefinition forwardleftWing = general.addOrReplaceChild("forwardleftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r4 = forwardleftWing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 0).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition backleftWing2 = forwardleftWing.addOrReplaceChild("backleftWing2", CubeListBuilder.create().texOffs(40, 7).addBox(-6.0F, 0.0F, -9.0F, 6.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 1.0F, -2.0F));
		PartDefinition small_paws = general.addOrReplaceChild("small_paws", CubeListBuilder.create().texOffs(0, 11).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.0F));
		PartDefinition small_paws_rear = small_paws.addOrReplaceChild("small_paws_rear", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, -4.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		general.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
