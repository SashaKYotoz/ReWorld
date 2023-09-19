// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAlive_Snowy_Ice<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "alive_snowy_ice"), "main");
	private final ModelPart head;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public ModelAlive_Snowy_Ice(ModelPart root) {
		this.head = root.getChild("head");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -9.5F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-7.0F, -9.5F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

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