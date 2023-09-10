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
public class Modelent_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelent_armor"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;
	public final ModelPart rightLegboots;
	public final ModelPart leftLegboots;

	public Modelent_armor(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.rightLegboots = root.getChild("rightLegboots");
		this.leftLegboots = root.getChild("leftLegboots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-1.06F, -0.34F, -6.46F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7206F, -16.4639F, 1.1912F, 0.0491F, -0.6947F, 0.0694F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(34, 0).addBox(-3.2F, -2.1F, -4.94F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5123F, -12.5775F, 1.0729F, -0.1582F, -0.6737F, -0.1544F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(42, 0).addBox(-2.96F, -0.58F, -7.6F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.347F, -14.0387F, 1.4149F, -1.1005F, -1.1505F, 1.0951F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(42, 0).addBox(-4.5F, 0.9051F, -6.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -16.6F, -1.0F, 0.2284F, -0.298F, -0.0681F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(1.04F, -2.2F, -0.76F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5646F, -11.3037F, -0.9797F, 0.1835F, -0.2047F, 0.1106F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(4.08F, -2.96F, -0.76F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5646F, -11.3037F, -0.9797F, 0.1145F, -0.3657F, 0.3799F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.64F, 0.08F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.403F, -12.4763F, -5.6999F, 0.4513F, -0.103F, -0.288F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-3.52F, -3.72F, 1.28F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.36F, 0.0F, -0.3341F, -0.103F, -0.288F));
		PartDefinition Helmet_r1 = head.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(3.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-4.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Chestplate_r1 = body.addOrReplaceChild("Chestplate_r1", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(1.015F)).texOffs(24, 0).mirror().addBox(-8.0F, -7.5F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(1.015F)).mirror(false).texOffs(24, 0).addBox(2.0F, -7.5F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 9).addBox(-2.3F, 1.7F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(0, 9).mirror().addBox(-2.3F, 1.7F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
						.texOffs(0, 16).addBox(-2.5F, 2.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.5F, 5.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(1.5F, 5.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(1.5F, 2.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.7F, 1.7F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false).texOffs(0, 9).addBox(-1.7F, 1.7F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F))
						.texOffs(0, 16).addBox(1.5F, 2.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(1.5F, 5.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.5F, 2.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.5F, 5.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition rightLegboots = partdefinition.addOrReplaceChild("rightLegboots", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition leftLegboots = partdefinition.addOrReplaceChild("leftLegboots", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0001F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegboots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegboots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
