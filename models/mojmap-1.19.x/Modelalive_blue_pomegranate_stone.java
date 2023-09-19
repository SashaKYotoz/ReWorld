// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelalive_blue_pomegranate_stone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "alive_blue_pomegranate_stone"), "main");
	private final ModelPart head;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public Modelalive_blue_pomegranate_stone(ModelPart root) {
		this.head = root.getChild("head");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -9.5F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-7.0F, -9.5F, -7.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition mushroom = head.addOrReplaceChild("mushroom",
				CubeListBuilder.create().texOffs(48, 28)
						.addBox(-5.0F, -5.5F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -3.5F, -1.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-6.0F, -4.5F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition cube_r1 = mushroom
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, 0.0F, 4.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition mushroom2 = mushroom.addOrReplaceChild("mushroom2",
				CubeListBuilder.create().texOffs(48, 28)
						.addBox(-2.0F, -4.8F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-3.0F, -3.9F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(4.0F, 0.5F, 4.0F));

		PartDefinition cube_r2 = mushroom2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, 0.0F, 4.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.5F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(48, 0)
				.addBox(-1.5F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 18.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(48, 0).mirror()
						.addBox(-2.5F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}