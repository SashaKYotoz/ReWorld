
public class Modelsnowy_icy_creature<T extends SnowyIcyCreatureEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("reworld", "modelsnowy_icy_creature"), "main");
	public final ModelPart head;
	public final ModelPart root;
	public final ModelPart center;
	public final ModelPart ice;
	public final ModelPart torse;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart right_bottom_leg;
	public final ModelPart left_bottom_leg;

	public Modelsnowy_icy_creature(ModelPart root) {
		this.root = root;
		this.head = root.getChild("head");
		this.center = root.getChild("center");
		this.torse = root.getChild("torse");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.right_bottom_leg = right_leg.getChild("right_bottom_leg");
		this.left_bottom_leg = left_leg.getChild("left_bottom_leg");
		this.ice = center.getChild("ice");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -21.0F, -7.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 24).addBox(-3.0F, -7.5F, 1.45F, 6.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.5F, -0.75F, 1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(1.0F, -8.2925F, 6.4429F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 2).mirror().addBox(2.0F, -8.0425F, 7.4429F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.mirror(false).texOffs(0, 2)
				.addBox(-4.0F, -8.0425F, 7.4429F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(0, 0)
				.addBox(-4.0F, -8.2925F, 6.4429F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(14, 17)
				.addBox(-4.0F, -7.8148F, 5.4496F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 17).mirror()
				.addBox(-7.0F, -4.8148F, 8.6996F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(0, 17).addBox(3.0F, -4.8148F, 8.6996F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.25F))
				.texOffs(0, 6).addBox(3.25F, -8.3148F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 6).addBox(-4.25F, -8.3148F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 6).addBox(-6.25F, -5.0648F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 6).addBox(-6.25F, -7.0648F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 6).addBox(5.25F, -5.0648F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 6).addBox(5.25F, -7.0648F, 3.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 8).addBox(5.25F, -3.0648F, 3.1996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 8).addBox(-6.25F, -3.0648F, 3.1996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(33, 2).addBox(-5.0F, -6.9925F, -2.0571F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.25F))
				.texOffs(31, 1).addBox(-6.0F, -7.9925F, -0.0571F, 12.0F, 7.0F, 3.0F, new CubeDeformation(0.25F))
				.texOffs(0, 0).addBox(-5.0F, -6.8148F, 0.4496F, 10.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.4925F, -0.7429F, 1.6144F, 0.0F, 0.0F));
		PartDefinition center = partdefinition.addOrReplaceChild("center", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 2.0F));
		PartDefinition ice = center.addOrReplaceChild("ice", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -20.0F));
		PartDefinition cube_r3 = ice.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(68, 100).addBox(-7.0F, -7.0F, -7.0F, 14.0F, 14.0F, 14.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, -0.7854F, 0.0F));
		PartDefinition torse = partdefinition.addOrReplaceChild("torse", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, 2.0F));
		PartDefinition cube_r4 = torse.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(57, 90).addBox(-5.0F, 0.5075F, -3.55F, 10.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5075F, -8.75F, 1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r5 = torse.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(82, 0).addBox(-7.0F, -1.8425F, -0.5571F, 14.0F, 14.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5075F, -8.7429F, 1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r6 = torse.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 53)
						.addBox(-2.8859F, 4.78F, 14.7143F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 77)
						.addBox(-3.8859F, 3.78F, 6.7143F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7434F, -2.5501F, 0.4943F, -0.2316F, -0.1231F));
		PartDefinition cube_r7 = torse.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 77)
				.addBox(-0.107F, 2.6906F, 22.3575F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 92)
				.addBox(-1.107F, 1.6906F, 17.3575F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 77)
				.addBox(-2.107F, 0.6906F, 8.3575F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7434F, -2.5501F, 0.0021F, 0.2173F, 0.0193F));
		PartDefinition cube_r8 = torse.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(80, 80)
						.addBox(-1.107F, -1.815F, 18.937F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 77)
						.addBox(-2.107F, -2.815F, 9.937F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7434F, -2.5501F, 0.4384F, 0.2173F, 0.0193F));
		PartDefinition cube_r9 = torse.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 23).addBox(-12.0F, -11.3323F, -3.5282F, 24.0F, 12.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.55F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r10 = torse.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(64, 49).addBox(-9.0F, 6.15F, 2.25F, 18.0F, 14.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -9.75F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-10.0F, -18.0F, 0.0F));
		PartDefinition cube_r11 = right_arm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 96)
				.mirror().addBox(-13.75F, 3.2243F, 19.5495F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 96).mirror()
				.addBox(-14.55F, 2.2243F, 16.5495F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 90).mirror()
				.addBox(-15.55F, 1.2243F, 13.5495F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 96).mirror()
				.addBox(-14.75F, 3.2243F, 13.5429F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 111).mirror()
				.addBox(-13.25F, 1.4243F, 17.5495F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 96).mirror()
				.addBox(-13.25F, 0.4243F, 13.5495F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 92).mirror()
				.addBox(-14.25F, -0.5757F, -14.4505F, 5.0F, 8.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 3.4925F, -4.7429F, 0.9599F, 0.0F, 0.0873F));
		PartDefinition fingers1 = right_arm.addOrReplaceChild("fingers1", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 19.0F, -8.0F));
		PartDefinition cube_r12 = fingers1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 107).mirror()
						.addBox(-18.75F, -0.1534F, -22.8529F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(15.0F, -19.5075F, 7.2571F, 0.9599F, -0.1841F, -0.1F));
		PartDefinition smallFinger2 = right_arm.addOrReplaceChild("smallFinger2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 16.0F, -10.0F));
		PartDefinition cube_r13 = smallFinger2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 81).mirror()
						.addBox(-6.0F, -0.1534F, -26.2571F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.0F, -16.5075F, 9.2571F, 0.9599F, 0.1536F, 0.2269F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(10.0F, -18.0F, 0.0F));
		PartDefinition cube_r14 = left_arm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(45, 96)
				.addBox(2.75F, 1.4228F, 13.405F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 96)
				.addBox(3.55F, 0.4228F, 10.405F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 90)
				.addBox(3.55F, -0.5772F, 7.405F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 96)
				.addBox(2.75F, 1.4228F, 7.405F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 111)
				.addBox(1.25F, -0.3772F, 11.405F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 96)
				.addBox(0.25F, -1.3772F, 7.405F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 92).mirror()
				.addBox(0.25F, -2.3772F, -20.595F, 5.0F, 8.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.5075F, 0.2571F, 0.9599F, 0.0F, -0.0873F));
		PartDefinition fingers = left_arm.addOrReplaceChild("fingers", CubeListBuilder.create(),
				PartPose.offset(6.0F, 19.0F, -8.0F));
		PartDefinition cube_r15 = fingers.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 107).addBox(0.1631F, -6.3949F, -7.5864F, 1.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5075F, 1.2571F, 0.9761F, 0.149F, 0.1288F));
		PartDefinition smallFinger = left_arm.addOrReplaceChild("smallFinger", CubeListBuilder.create(),
				PartPose.offset(2.0F, 16.0F, -10.0F));
		PartDefinition cube_r16 = smallFinger.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 81).addBox(-3.9191F, -0.978F, -24.9267F, 1.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -16.5075F, 10.2571F, 0.9599F, -0.1222F, -0.2618F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 4.0F, 0.0F));
		PartDefinition cube_r17 = right_leg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 29).mirror()
						.addBox(-3.44F, 1.0F, -1.9F, 8.0F, 13.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-4.4F, -4.5F, 1.9F, -0.2618F, 0.0F, 0.0F));
		PartDefinition right_bottom_leg = right_leg.addOrReplaceChild("right_bottom_leg", CubeListBuilder.create()
				.texOffs(0, 70).addBox(-3.08F, 9.4934F, -7.8227F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6F, 7.5F, -0.5F));
		PartDefinition cube_r18 = right_bottom_leg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 50).addBox(-8.84F, -4.78F, -3.78F, 8.0F, 12.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 4.94F, 1.44F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(1.0F, 4.0F, 0.0F));
		PartDefinition cube_r19 = left_leg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 29).addBox(-4.2F, -1.0F, 5.85F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(3.6F, -4.5F, -6.1F, -0.2618F, 0.0F, 0.0F));
		PartDefinition left_bottom_leg = left_leg.addOrReplaceChild("left_bottom_leg",
				CubeListBuilder.create().texOffs(0, 70).mirror()
						.addBox(-3.04F, 9.4934F, -7.8227F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.6F, 7.5F, -0.5F));
		PartDefinition cube_r20 = left_bottom_leg.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 50).addBox(0.4F, -4.78F, -3.78F, 8.0F, 12.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 4.94F, 1.44F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		center.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torse.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.animate(entity.attackAnimationState, SnowyCreatureAnimations.ATTACK, ageInTicks);
		this.animate(entity.attack1AnimationState, SnowyCreatureAnimations.ATTACK1, ageInTicks);
		this.animate(entity.deathAnimationState, SnowyCreatureAnimations.DEATH, ageInTicks);
		this.animate(entity.walkAnimationState, SnowyCreatureAnimations.WALK, ageInTicks);
		this.animate(entity.idleAnimationState, SnowyCreatureAnimations.IDLE, ageInTicks);
	}
}
