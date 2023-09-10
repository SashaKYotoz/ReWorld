// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMushroomSpider extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mushroom_r1;
	private final ModelRenderer mushroom_r2;
	private final ModelRenderer neck;
	private final ModelRenderer body;
	private final ModelRenderer mushroom_r3;
	private final ModelRenderer mushroom_r4;
	private final ModelRenderer mushroom_r5;
	private final ModelRenderer mushroom_r6;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;
	private final ModelRenderer leg8;

	public ModelMushroomSpider() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(32, 4).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		mushroom_r1 = new ModelRenderer(this);
		mushroom_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(mushroom_r1);
		setRotationAngle(mushroom_r1, -0.1745F, -1.9635F, -0.2618F);
		mushroom_r1.setTextureOffset(55, 23).addBox(-6.25F, -8.75F, 2.75F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		mushroom_r2 = new ModelRenderer(this);
		mushroom_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(mushroom_r2);
		setRotationAngle(mushroom_r2, 0.2182F, -0.0436F, -0.2618F);
		mushroom_r2.setTextureOffset(49, 22).addBox(-4.0F, -9.0F, -4.25F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		mushroom_r2.setTextureOffset(60, 28).addBox(-3.0F, -7.0F, -4.25F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 15.0F, 0.0F);
		neck.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.setTextureOffset(0, 12).addBox(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F, false);

		mushroom_r3 = new ModelRenderer(this);
		mushroom_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(mushroom_r3);
		setRotationAngle(mushroom_r3, -0.1309F, -0.9163F, 0.2182F);
		mushroom_r3.setTextureOffset(2, 16).addBox(1.25F, -6.75F, 0.25F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		mushroom_r4 = new ModelRenderer(this);
		mushroom_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(mushroom_r4);
		setRotationAngle(mushroom_r4, -0.1309F, 0.48F, 0.2182F);
		mushroom_r4.setTextureOffset(0, 21).addBox(-2.0F, -7.0F, 2.25F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		mushroom_r4.setTextureOffset(61, 29).addBox(-1.0F, -6.0F, 2.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		mushroom_r5 = new ModelRenderer(this);
		mushroom_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(mushroom_r5);
		setRotationAngle(mushroom_r5, -0.1309F, 0.48F, -0.2618F);
		mushroom_r5.setTextureOffset(61, 29).addBox(0.0F, -5.0F, -4.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		mushroom_r5.setTextureOffset(3, 19).addBox(0.0F, -6.0F, -5.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);

		mushroom_r6 = new ModelRenderer(this);
		mushroom_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(mushroom_r6);
		setRotationAngle(mushroom_r6, -0.1309F, -0.8727F, -0.2618F);
		mushroom_r6.setTextureOffset(3, 15).addBox(-2.75F, -6.25F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 15.0F, 4.0F);
		leg1.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 15.0F, 4.0F);
		leg2.setTextureOffset(18, 0).addBox(7.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 15.0F, 1.0F);
		leg3.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 15.0F, 1.0F);
		leg4.setTextureOffset(18, 0).addBox(7.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(4.0F, 15.0F, -2.0F);
		leg5.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-4.0F, 15.0F, -2.0F);
		leg6.setTextureOffset(18, 0).addBox(7.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(4.0F, 15.0F, -5.0F);
		leg7.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(-4.0F, 15.0F, -5.0F);
		leg8.setTextureOffset(18, 0).addBox(7.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		leg5.render(matrixStack, buffer, packedLight, packedOverlay);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay);
		leg8.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.neck.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.neck.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg1.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg4.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg5.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg8.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg6.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg7.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}