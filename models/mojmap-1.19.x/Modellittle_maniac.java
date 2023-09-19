// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellittle_maniac<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "little_maniac"), "main");
	private final ModelPart general;

	public Modellittle_maniac(ModelPart root) {
		this.general = root.getChild("general");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition general = partdefinition.addOrReplaceChild("general", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition head = general.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, -3.0F));

		PartDefinition body = general.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F,
				-2.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition rightLeg = general.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 30).mirror()
				.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 30)
				.mirror().addBox(-1.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 2.0F, 0.0F));

		PartDefinition leftLeg = general.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(0.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 2.0F, 0.0F));

		PartDefinition tail = general.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(33, 23).addBox(-5.0F, 0.0F, -0.25F, 11.0F, 0.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightWing = general.addOrReplaceChild("rightWing", CubeListBuilder.create(),
				PartPose.offset(-1.75F, 1.0F, -1.75F));

		PartDefinition cube_r2 = rightWing.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 0).mirror()
						.addBox(-3.0F, -1.0F, -0.25F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition leftWing = general.addOrReplaceChild("leftWing", CubeListBuilder.create(),
				PartPose.offset(1.75F, 1.0F, -1.75F));

		PartDefinition cube_r3 = leftWing
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -0.25F, 3.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		general.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}