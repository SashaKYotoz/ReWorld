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

import net.mcreator.reworld.entity.BigIncenseBurnerEntity;
import net.mcreator.reworld.BigIncenseBurnerAnimations;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Modelbig_incense_burner<T extends BigIncenseBurnerEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modelbig_incense_burner"), "main");
	public final ModelPart general;
	public final ModelPart branches;
	public final ModelPart purple_body;
	public final ModelPart purple_body1;
	public final ModelPart purple_head;
	public final ModelPart bottom_jaw2;
	public final ModelPart orange_body;
	public final ModelPart orange_body1;
	public final ModelPart orange_head;
	public final ModelPart bottom_jaw1;
	public final ModelPart red_body;
	public final ModelPart red_head;
	public final ModelPart red_head1;
	public final ModelPart bottom_jaw;
	public final ModelPart general_stem;
	public final ModelPart leaves;
	public final ModelPart leaves1;
	public final ModelPart root;

	public Modelbig_incense_burner(ModelPart root) {
		this.root = root;
		this.general = root.getChild("general");
		this.branches = general.getChild("branches");
		this.purple_body = branches.getChild("purple_body");
		this.purple_body1 = purple_body.getChild("purple_body1");
		this.purple_head = purple_body1.getChild("purple_head");
		this.bottom_jaw2 = purple_head.getChild("bottom_jaw2");
		this.orange_body = branches.getChild("orange_body");
		this.orange_body1 = orange_body.getChild("orange_body1");
		this.orange_head = orange_body1.getChild("orange_head");
		this.bottom_jaw1 = orange_head.getChild("bottom_jaw1");
		this.general_stem = general.getChild("general_stem");
		this.red_body = general_stem.getChild("red_body");
		this.red_head = red_body.getChild("red_head");
		this.red_head1 = red_head.getChild("red_head1");
		this.bottom_jaw = red_head1.getChild("bottom_jaw");
		this.leaves = general.getChild("leaves");
		this.leaves1 = leaves.getChild("leaves1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition branches = general.addOrReplaceChild("branches", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition purple_body = branches.addOrReplaceChild("purple_body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 1.75F));
		PartDefinition cube_r1 = purple_body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -13.0F, -6.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition purple_body1 = purple_body.addOrReplaceChild("purple_body1", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 2.0F));
		PartDefinition cube_r2 = purple_body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition purple_head = purple_body1.addOrReplaceChild("purple_head", CubeListBuilder.create().texOffs(44, 27).addBox(-4.0F, -6.0F, 1.5F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 2.0F));
		PartDefinition cube_r3 = purple_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 44).addBox(-3.0F, -1.75F, 1.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 6.5F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r4 = purple_head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(27, 53).addBox(-4.5F, -6.0F, -6.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(-1.0F)).texOffs(0, 0).addBox(-1.0F, -6.5F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition bottom_jaw2 = purple_head.addOrReplaceChild("bottom_jaw2",
				CubeListBuilder.create().texOffs(68, 27).addBox(-4.0F, -2.0F, 1.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 36).addBox(-3.0F, -1.75F, 7.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.5F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bottom_jaw2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(20, 36).addBox(4.0F, -4.5F, -6.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(4.0F, -4.5F, -6.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(0.5F, -2.5F, -4.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(3.5F, -2.5F, -4.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(3.5F, -0.5F, -2.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(0.5F, -0.5F, -2.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.75F, 12.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition orange_body = branches.addOrReplaceChild("orange_body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, -1.75F));
		PartDefinition cube_r6 = orange_body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -13.75F, 2.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 2.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition orange_body1 = orange_body.addOrReplaceChild("orange_body1", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -2.0F));
		PartDefinition cube_r7 = orange_body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.2618F, 0.0F, 0.0F));
		PartDefinition orange_head = orange_body1.addOrReplaceChild("orange_head", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, -2.0F));
		PartDefinition cube_r8 = orange_head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(27, 53).addBox(-4.5F, -6.0F, -3.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(-1.0F)).texOffs(0, 0).addBox(-1.0F, -6.5F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r9 = orange_head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 36).addBox(-2.0F, -6.5F, -0.25F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -6.5F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r10 = orange_head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 44).addBox(-3.0F, -9.5F, 6.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bottom_jaw1 = orange_head.addOrReplaceChild("bottom_jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bottom_jaw1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(20, 36).addBox(-1.5F, 2.75F, 0.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-1.5F, 0.75F, -1.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(-2.0F, 4.75F, 2.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(2.0F, 4.75F, 2.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(1.5F, 2.75F, 0.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(1.5F, 0.75F, -1.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.75F, -11.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bottom_jaw1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(55, 36).addBox(-2.0F, -15.5F, 3.75F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 44).addBox(-3.0F, -9.5F, 3.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 3.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition general_stem = general.addOrReplaceChild("general_stem", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 0.5F));
		PartDefinition cube_r13 = general_stem.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -9.25F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r14 = general_stem.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.75F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition red_body = general_stem.addOrReplaceChild("red_body", CubeListBuilder.create(), PartPose.offset(0.817F, -9.0F, 0.25F));
		PartDefinition cube_r15 = red_body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-3.25F, -15.75F, -2.0F, 1.5F, 2.0F, 2.5F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r16 = red_body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -15.75F, -3.25F, 5.0F, 7.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(0, 0).addBox(0.25F, -14.75F, -2.0F, 2.5F, 6.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition red_head = red_body.addOrReplaceChild("red_head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r17 = red_head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 53).addBox(-8.0F, -18.0F, -5.25F, 9.0F, 2.0F, 9.0F, new CubeDeformation(-1.0F)).texOffs(0, 30)
				.addBox(-6.0F, -21.0F, -3.25F, 5.0F, 8.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(0, 0).addBox(-5.0F, -20.0F, -2.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition red_head1 = red_head.addOrReplaceChild("red_head1",
				CubeListBuilder.create().texOffs(16, 44).addBox(-1.0F, -4.75F, -4.25F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 53).addBox(5.0F, -3.75F, -3.25F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.5F, 0.5F, 0.0F, 0.0F, -1.0036F));
		PartDefinition bottom_jaw = red_head1.addOrReplaceChild("bottom_jaw",
				CubeListBuilder.create().texOffs(20, 38).addBox(6.0F, -0.75F, -3.25F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 53).addBox(0.0F, -1.0F, -4.25F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r18 = bottom_jaw.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(20, 38).addBox(0.067F, 0.0F, 3.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38).addBox(-2.183F, 2.25F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(-2.183F, 2.25F, 4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38).addBox(1.817F, -1.75F, 3.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(1.817F, -1.75F, 0.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38).addBox(0.067F, 0.0F, 0.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.933F, -1.75F, -3.25F, 0.0F, 0.0F, 0.7854F));
		PartDefinition leaves = general.addOrReplaceChild("leaves", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r19 = leaves.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(16, 8).addBox(-6.0F, -6.0F, 0.0F, 11.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r20 = leaves.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(16, 8).addBox(-6.0F, -6.0F, 0.0F, 11.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r21 = leaves.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-6, 8).addBox(0.0F, -8.0F, -3.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r22 = leaves.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-6, 8).addBox(-8.0F, -8.0F, -3.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r23 = leaves.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-4, 16).addBox(-8.0F, 0.0F, -2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.2689F));
		PartDefinition cube_r24 = leaves.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-4, 16).addBox(-8.0F, 0.0F, -2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition leaves1 = leaves.addOrReplaceChild("leaves1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r25 = leaves1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-6, 8).addBox(0.0F, -8.0F, -3.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r26 = leaves1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-6, 8).addBox(-8.0F, -8.0F, -3.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r27 = leaves1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-4, 16).addBox(-8.0F, 0.0F, -2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.2689F));
		PartDefinition cube_r28 = leaves1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-4, 16).addBox(-8.0F, 0.0F, -2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));
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

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (Math.random() < 0.5)
			this.animate(entity.attackAnimationState, BigIncenseBurnerAnimations.GENERAL_ATTACK, ageInTicks);
		else if (Math.random() < 0.125) {
			this.animate(entity.attackAnimationState, BigIncenseBurnerAnimations.RED_HEAD_ATTACK, ageInTicks);
		} else if (Math.random() < 0.25) {
			this.animate(entity.attackAnimationState, BigIncenseBurnerAnimations.ORANGE_HEAD_ATTACK, ageInTicks);
		} else if (Math.random() < 0.35) {
			this.animate(entity.attackAnimationState, BigIncenseBurnerAnimations.PURPLE_HEAD_ATTACK, ageInTicks);
		}
		this.animate(entity.idleAnimationState, BigIncenseBurnerAnimations.IDLE, ageInTicks);
	}
}
