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

import net.mcreator.reworld.entity.WhiteBelliedMinagoBirdEntity;
import net.mcreator.reworld.WhiteBelliedMinagoBirdAnimations;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Modellittle_maniac<T extends WhiteBelliedMinagoBirdEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "modellittle_maniac"), "main");
	public final ModelPart general;
	public final ModelPart root;

	public Modellittle_maniac(ModelPart root) {
		this.root = root;
		this.general = root.getChild("general");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition head = general.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, -3.0F));
		PartDefinition body = general.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition rightLeg = general.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 30).mirror()
				.addBox(-1.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 2.0F, 0.0F));
		PartDefinition leftLeg = general.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(0.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.0F, 0.0F));
		PartDefinition tail = general.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 23).addBox(-5.0F, 0.0F, -0.25F, 11.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition rightWing = general.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offset(-1.75F, 1.0F, -1.75F));
		PartDefinition cube_r2 = rightWing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-3.0F, -1.0F, -0.25F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition leftWing = general.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offset(1.75F, 1.0F, -1.75F));
		PartDefinition cube_r3 = leftWing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -0.25F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
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
		animate(entity.walkState, WhiteBelliedMinagoBirdAnimations.WALK, ageInTicks);
		animate(entity.flyState, WhiteBelliedMinagoBirdAnimations.FLY, ageInTicks);
		animate(entity.idleState, WhiteBelliedMinagoBirdAnimations.IDLE, ageInTicks);
		animate(entity.deathState, WhiteBelliedMinagoBirdAnimations.DEATH, ageInTicks);
	}
}
