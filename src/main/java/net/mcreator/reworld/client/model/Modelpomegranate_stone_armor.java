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

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpomegranate_stone_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelpomegranate_stone_armor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightBoot;
	public final ModelPart LeftBoot;

	public Modelpomegranate_stone_armor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightBoot = root.getChild("RightBoot");
		this.LeftBoot = root.getChild("LeftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.5F)).texOffs(46, 36).mirror()
						.addBox(3.6F, -12.8F, -2.1F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 36).mirror().addBox(-8.4F, -12.8F, -2.1F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)).texOffs(52, 57).addBox(-9.5F, -5.5F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 48)
						.addBox(-9.0F, -4.5F, -2.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 57).mirror().addBox(6.5F, -5.5F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 48).mirror()
						.addBox(7.0F, -4.5F, -2.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 48).addBox(1.1039F, 1.25F, -3.0935F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-0.8961F, 0.75F, -3.5935F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 8.0F, 0.0F, 1.8326F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 48).addBox(2.1039F, 7.25F, -3.0935F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(0.1039F, 6.75F, -3.5935F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 8.0F, 0.0F, 2.0071F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 48).addBox(-5.0F, 3.25F, 6.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-7.0F, 2.75F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.0F, 1.309F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(1.05F)).texOffs(24, 48)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)).texOffs(16, 32).mirror().addBox(-4.0F, -3.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.1F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(1.05F)).mirror(false).texOffs(16, 32)
				.addBox(0.0F, -3.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.1F)).texOffs(24, 48).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
