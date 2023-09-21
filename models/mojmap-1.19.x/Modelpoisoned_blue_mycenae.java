
public class Modelpoisoned_blue_mycenae<T extends PoisonedBlueMycenaeEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("reworld", "modelpoisoned_blue_mycenae"), "main");
	public final ModelPart mushroom;
	private final ModelPart root;

	public Modelpoisoned_blue_mycenae(ModelPart root) {
		this.root = root;
		this.mushroom = root.getChild("mushroom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mushroom = partdefinition.addOrReplaceChild("mushroom",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 28)
						.addBox(-2.0F, -4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition cube_r1 = mushroom.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 15.0F, 3.0F, 4.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -17.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bomb = mushroom.addOrReplaceChild("bomb", CubeListBuilder.create().texOffs(48, 34).addBox(-1.0F,
				-0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mushroom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animate(entity.idleState, PoisonedBlueMycenaeAnimations.IDLE, ageInTicks);
		this.animate(entity.walkState, PoisonedBlueMycenaeAnimations.WALK, ageInTicks);
	}
}
