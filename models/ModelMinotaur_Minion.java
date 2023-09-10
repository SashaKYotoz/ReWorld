// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMinotaur_Minion extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer leftItem;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelMinotaur_Minion() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, -0.02F, false);
		head.setTextureOffset(31, 1).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(7.0F, -6.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, -0.4363F, 0.0F);
		cube_r1.setTextureOffset(51, 9).addBox(-1.842F, -4.0F, -1.8F, 2.0F, 5.0F, 3.0F, -0.25F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.0F, -4.0F, -1.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.3562F, -0.4363F, -3.1416F);
		cube_r2.setTextureOffset(19, 32).addBox(-0.842F, -5.6F, -2.25F, 2.0F, 5.0F, 3.0F, -0.25F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.0F, -4.0F, -1.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
		cube_r3.setTextureOffset(54, 34).addBox(-1.5F, -2.0F, -0.75F, 3.0F, 3.0F, 2.0F, -0.1F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.0F, -4.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
		cube_r4.setTextureOffset(54, 40).addBox(-1.5F, -2.0F, -1.75F, 2.0F, 3.0F, 3.0F, -0.1F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(48, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		leftItem = new ModelRenderer(this);
		leftItem.setRotationPoint(1.0F, 10.0F, 1.0F);
		LeftArm.addChild(leftItem);
		setRotationAngle(leftItem, 0.7854F, 0.0F, 0.0F);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -0.4142F, -0.5858F, 1.0F, 2.0F, 2.0F, -0.01F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -2.4142F, -2.5858F, 1.0F, 2.0F, 2.0F, -0.01F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -4.4142F, -4.5858F, 1.0F, 2.0F, 2.0F, -0.01F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -6.4142F, -6.5858F, 1.0F, 2.0F, 2.0F, -0.01F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -1.4142F, -1.5858F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -5.4142F, -5.5858F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		leftItem.setTextureOffset(58, 0).addBox(-0.5F, -3.4142F, -3.5858F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -6.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -7.4142F, -6.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -8.4142F, -5.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -9.4142F, -5.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -10.4142F, -6.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -10.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -9.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -9.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -8.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -8.4142F, -10.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -8.4142F, -11.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -7.4142F, -12.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -6.4142F, -12.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -5.4142F, -11.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -4.4142F, -10.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -3.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -3.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -4.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(47, 0).addBox(-0.5F, -5.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(58, 22).addBox(-0.5F, -4.4142F, -9.5858F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftItem.setTextureOffset(59, 26).addBox(-0.5F, -7.4142F, -11.5858F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(59, 27).addBox(-0.5F, -5.4142F, -10.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -5.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -6.4142F, -10.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(56, 31).addBox(-0.5F, -7.4142F, -10.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(56, 31).addBox(-0.5F, -5.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(45, 33).addBox(-0.5F, -7.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(45, 33).addBox(-0.5F, -8.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -6.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -6.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -7.4142F, -9.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -8.4142F, -8.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -8.4142F, -6.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -9.4142F, -6.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -9.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftItem.setTextureOffset(60, 31).addBox(-0.5F, -7.4142F, -7.5858F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 32).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.24F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.24F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}