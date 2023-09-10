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

import net.mcreator.reworld.entity.PomegranateStoneGolemEntity;
import net.mcreator.reworld.PomegranateGolemAnimation;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Modelpomegranate_stone_golem<T extends PomegranateStoneGolemEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelpomegranate_stone_golem"), "main");
	public final ModelPart general;
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart rightLeg;
	public final ModelPart leftLeg;
	public final ModelPart root;

	public Modelpomegranate_stone_golem(ModelPart root) {
		this.root = root;
		this.general = root.getChild("general");
		this.head = general.getChild("head");
		this.body = general.getChild("body");
		this.rightArm = general.getChild("rightArm");
		this.leftArm = general.getChild("leftArm");
		this.rightLeg = general.getChild("rightLeg");
		this.leftLeg = general.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition leftLeg = general.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 4.0F, 0.0F));
		PartDefinition rightLeg = general.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 4.0F, 0.0F));
		PartDefinition leftArm = general.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-1.0F, -3.0F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 32).addBox(0.0F, 0.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, -8.0F, 0.0F));
		PartDefinition cube_r1 = leftArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 30).addBox(1.0F, -5.1F, 7.55F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 30).addBox(1.0F, -5.1F, 12.55F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 7.0F, -6.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = leftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(52, 30).addBox(5.0F, -5.1F, -3.45F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 30).addBox(5.0F, -5.1F, -8.45F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 7.0F, -6.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = leftArm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(110, 32).addBox(-1.0F, 4.0F, -3.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.5F)).texOffs(110, 32).addBox(-1.0F, -3.0F, -3.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.0F, 12.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition rightArm = general.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(82, 32).addBox(-6.0F, -3.0F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(110, 32).addBox(-4.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -8.0F, 0.0F));
		PartDefinition cube_r4 = rightArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(52, 30).addBox(5.0F, -5.1F, -8.45F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 30).addBox(5.0F, -5.1F, -3.45F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 7.0F, -6.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r5 = rightArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(52, 30).addBox(1.0F, -5.1F, 7.55F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 30).addBox(1.0F, -5.1F, 12.55F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 7.0F, -6.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r6 = rightArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(110, 32).addBox(-1.0F, 4.0F, -3.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.5F)).texOffs(110, 32).addBox(-1.0F, -3.0F, -3.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-3.0F, 12.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition body = general.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(88, 18).addBox(-6.0F, 0.0F, -4.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 0).addBox(-7.0F, -8.0F, -5.0F, 14.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-2.75F, -13.0F, 0.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 0).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 5)
						.addBox(3.0F, -9.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-2.25F, -12.0F, -1.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 24).addBox(-9.0F, -1.25F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(4, 3).addBox(-7.0F, 7.25F, 8.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-9.0F, 6.75F, 8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(4, 3).addBox(-7.0F, -0.75F, 6.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -6.0F, 0.0F, 0.0F, 1.309F, 0.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(4, 3).addBox(-0.8961F, 2.25F, -2.0935F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-2.8961F, 1.75F, -2.5935F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 8.0F, 0.0F, 1.8326F, 0.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 16).addBox(-6.0F, -14.0F, 0.0F, 12.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.0F, -1.0F, -3.1416F, 1.5272F, -2.9671F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 16).addBox(-6.0F, -14.0F, 0.0F, 12.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.0F, -1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition head = general.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1F, -5.2F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-4.0F, 1.9F, -6.2F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 30)
						.addBox(-5.0F, 4.9F, -2.2F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.9F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, 0.9F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, 0.9F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.9F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, 0.9F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, 0.9F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0).mirror().addBox(1.6F, -5.8F, -4.1F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 0)
						.addBox(-5.7F, -5.8F, -4.1F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror().addBox(1.0F, -1.1F, -5.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false).texOffs(0, 4)
						.addBox(-3.0F, -1.1F, -5.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offset(0.0F, -8.0F, -5.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 30).addBox(-5.0F, -2.1F, -0.45F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
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
		float f = ageInTicks - (float) entity.tickCount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		if (Math.random() < 0.75)
			this.animate(entity.attackAnimationState, PomegranateGolemAnimation.ATTACK, ageInTicks);
		else if (Math.random() < 0.5) {
			this.animate(entity.attackAnimationState, PomegranateGolemAnimation.ATTACK1, ageInTicks);
		} else {
			this.animate(entity.attackAnimationState, PomegranateGolemAnimation.ATTACK2, ageInTicks);
		}
		this.animate(entity.walkAnimationState, PomegranateGolemAnimation.WALK, ageInTicks, f);
	}
}
