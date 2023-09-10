// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmudskipper extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rightFin;
	private final ModelRenderer leftFin;
	private final ModelRenderer tailfin;
	private final ModelRenderer topFin;

	public Modelmudskipper() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 24.0F, 0.0F);
		body.setTextureOffset(16, 10).addBox(-0.5F, -3.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(-0.75F, -2.25F, -3.25F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		body.setTextureOffset(0, 21).addBox(0.75F, -2.25F, -3.25F, 1.0F, 1.0F, 1.0F, -0.1F, false);

		rightFin = new ModelRenderer(this);
		rightFin.setRotationPoint(-0.5F, 24.0F, 0.0F);
		setRotationAngle(rightFin, 0.0F, 0.6109F, 0.0F);
		rightFin.setTextureOffset(2, 16).addBox(-2.4096F, -1.75F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		leftFin = new ModelRenderer(this);
		leftFin.setRotationPoint(0.5F, 24.0F, 0.0F);
		setRotationAngle(leftFin, 0.0F, -0.6109F, 0.0F);
		leftFin.setTextureOffset(2, 12).addBox(0.4096F, -1.75F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		tailfin = new ModelRenderer(this);
		tailfin.setRotationPoint(0.0F, 24.0F, 3.0F);
		tailfin.setTextureOffset(24, -1).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		topFin = new ModelRenderer(this);
		topFin.setRotationPoint(0.0F, 21.0F, -2.0F);
		topFin.setTextureOffset(10, -1).addBox(0.0F, -4.0F, -0.9992F, 0.0F, 4.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightFin.render(matrixStack, buffer, packedLight, packedOverlay);
		leftFin.render(matrixStack, buffer, packedLight, packedOverlay);
		tailfin.render(matrixStack, buffer, packedLight, packedOverlay);
		topFin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.topFin.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.tailfin.rotateAngleZ = f3 / (180F / (float) Math.PI);
		this.rightFin.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftFin.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}