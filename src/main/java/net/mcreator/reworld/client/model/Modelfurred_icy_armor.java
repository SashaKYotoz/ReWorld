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
public class Modelfurred_icy_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelfurred_icy_armor"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;
	public final ModelPart left_boots;
	public final ModelPart right_boots;

	public Modelfurred_icy_armor(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.left_boots = root.getChild("left_boots");
		this.right_boots = root.getChild("right_boots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(44, 32).addBox(3.0F, -12.0F, 1.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 32).mirror().addBox(-7.0F, -12.0F, 1.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(39, 2).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 2).addBox(-5.5F, -3.0F, -6.0F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 2)
						.addBox(-5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2).addBox(4.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2)
						.addBox(2.4F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2).addBox(0.4F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2)
						.addBox(-1.6F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2).addBox(-3.35F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2)
						.addBox(-3.35F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2).addBox(-1.6F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2)
						.addBox(0.4F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 2).addBox(2.4F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.99F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(17, 16).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-4.0F, 9.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(1.0F, 9.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(1.0F, 10.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(2.0F, 11.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-2.0F, 12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(-4.0F, 10.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-3.0F, 11.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(-2.0F, 12.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-3.0F, 11.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(-3.0F, 10.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-4.0F, 9.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(2.0F, 10.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(3.0F, 11.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(1.0F, 9.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 16).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.7F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(1.01F)).mirror(false).texOffs(42, 58).mirror().addBox(-2.0F, 7.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(42, 58).mirror().addBox(-3.0F, 7.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 58).mirror().addBox(-1.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(42, 58).mirror().addBox(-3.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 58).mirror().addBox(-2.0F, 7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(42, 58).mirror().addBox(-1.0F, 7.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition rightArm_r1 = rightArm.addOrReplaceChild("rightArm_r1",
				CubeListBuilder.create().texOffs(42, 58).mirror().addBox(-15.5F, 0.5F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 56).mirror().addBox(-12.5F, 1.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(42, 58).mirror().addBox(-13.5F, 1.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 58).mirror().addBox(-14.5F, 1.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5F, 5.5F, -12.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(1.01F)).texOffs(42, 58).addBox(0.0F, 7.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58)
						.addBox(1.0F, 7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58).addBox(2.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58)
						.addBox(0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58).addBox(2.0F, 7.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58)
						.addBox(1.0F, 7.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition leftArm_r1 = leftArm.addOrReplaceChild("leftArm_r1", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(-15.5F, 0.5F, 10.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.5F, 5.5F, -12.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition leftArm_r2 = leftArm.addOrReplaceChild("leftArm_r2", CubeListBuilder.create().texOffs(42, 58).addBox(13.5F, 1.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 56)
				.addBox(10.5F, 1.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58).addBox(12.5F, 1.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.5F, -12.5F, 0.0F, -1.5708F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.52F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.52F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition left_boots = partdefinition.addOrReplaceChild("left_boots", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(1.01F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition right_boots = partdefinition.addOrReplaceChild("right_boots", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(1.01F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_boots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
