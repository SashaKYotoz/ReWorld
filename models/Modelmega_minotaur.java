// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmega_minotaur extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer body;
	private final ModelRenderer cube_r7;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r15;
	private final ModelRenderer fingers;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer axe;
	private final ModelRenderer cube_r20;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public Modelmega_minotaur() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -19.0F, 0.0F);
		head.setTextureOffset(88, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.5F, false);
		head.setTextureOffset(104, 50).addBox(-3.0F, -5.0F, -10.5F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(75, 0).addBox(-3.0F, -7.0F, -7.5F, 6.0F, 1.0F, 2.0F, 0.1F, false);
		head.setTextureOffset(88, 0).addBox(4.5F, -11.0F, -1.5F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(88, 0).addBox(-6.5F, -11.0F, -1.5F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(124, 45).addBox(-2.0F, -2.0F, -11.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(124, 45).addBox(1.0F, -2.0F, -11.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(88, 40).addBox(-1.0F, 0.0F, -11.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.0F, -8.0F, -1.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.7418F, 1.5708F);
		cube_r1.setTextureOffset(116, 35).addBox(-2.5F, -0.756F, -6.4808F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.6F, -9.6936F, -0.3278F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6981F, 0.7418F, 1.5708F);
		cube_r2.setTextureOffset(116, 30).addBox(-1.0F, -1.7572F, -3.066F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.6F, -9.6936F, -0.3278F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.7418F, 1.5708F);
		cube_r3.setTextureOffset(116, 35).addBox(-1.1F, -2.6383F, -6.1906F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(5.6F, -9.6936F, -0.3278F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.7418F, 1.5708F);
		cube_r4.setTextureOffset(116, 25).addBox(-0.6F, -4.4931F, -8.6422F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -8.0F, -1.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5672F, 0.7418F, 1.5708F);
		cube_r5.setTextureOffset(116, 30).addBox(-2.4F, -1.5373F, -2.8434F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.0F, -8.0F, -1.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.7418F, 1.5708F);
		cube_r6.setTextureOffset(116, 25).addBox(-2.0F, 2.4584F, -9.3718F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(52, 102).addBox(-12.0F, -9.0F, -7.0F, 24.0F, 12.0F, 14.0F, 1.0F, false);
		body.setTextureOffset(0, 90).addBox(-8.0F, 2.0F, -5.0F, 16.0F, 13.0F, 11.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(20.5F, -5.5F, 0.5F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.48F);
		cube_r7.setTextureOffset(104, 85).addBox(-0.8045F, -1.5579F, -5.5F, 1.0F, 3.0F, 11.0F, 0.0F, false);
		cube_r7.setTextureOffset(110, 100).addBox(-8.8045F, -1.5579F, 4.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(110, 100).addBox(-8.8045F, -1.5579F, -5.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 118).addBox(-10.8F, -1.5F, -4.5F, 10.0F, 1.0F, 9.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(13.0F, -13.0F, 0.0F);
		leftarm.setTextureOffset(0, 73).addBox(0.0F, -3.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, true);
		leftarm.setTextureOffset(0, 60).addBox(0.7F, 4.0F, -2.4F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, 11.0F, -7.0F);
		leftarm.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, -0.1309F);
		cube_r8.setTextureOffset(0, 0).addBox(-1.5F, -2.2964F, -3.3884F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, 11.0F, -7.0F);
		leftarm.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1309F, 0.0F, -0.1309F);
		cube_r9.setTextureOffset(0, 0).addBox(1.0F, -2.2964F, -3.3884F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.0F, 10.0F, -7.0F);
		leftarm.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6545F, 0.0F, -0.1309F);
		cube_r10.setTextureOffset(45, 35).addBox(1.0F, -3.75F, -5.6871F, 2.0F, 2.0F, 4.0F, 0.01F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.0F, 10.0F, -7.0F);
		leftarm.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.6981F, 0.0F, -0.1309F);
		cube_r11.setTextureOffset(45, 35).addBox(-1.5F, -3.75F, -5.6871F, 2.0F, 2.0F, 4.0F, 0.01F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.0F, 14.0F, -7.0F);
		leftarm.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.7854F, 0.0F, -0.0873F);
		cube_r12.setTextureOffset(0, 0).addBox(-1.0F, -1.1684F, -2.5103F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.0F, 14.0F, -7.0F);
		leftarm.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2618F, 0.0F, -0.0873F);
		cube_r13.setTextureOffset(45, 35).addBox(-1.0F, 1.6612F, -4.807F, 2.0F, 2.0F, 4.0F, 0.01F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.2F, 9.5F, 0.1F);
		leftarm.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.1781F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(24, 64).addBox(-2.6F, -0.2861F, -2.6698F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-13.0F, -13.0F, 0.0F);
		rightarm.setTextureOffset(0, 73).addBox(-6.0F, -3.0F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, true);
		rightarm.setTextureOffset(0, 60).addBox(-5.3F, 4.0F, -2.4F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.8F, 14.5F, 0.1F);
		rightarm.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.8727F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(24, 64).addBox(-2.4F, -3.5F, -6.5F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		fingers = new ModelRenderer(this);
		fingers.setRotationPoint(-2.0F, 17.0F, -10.0F);
		rightarm.addChild(fingers);
		setRotationAngle(fingers, -0.2618F, 0.4363F, -1.5708F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -5.0F, 0.0F);
		fingers.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(0, 0).addBox(1.0F, 0.8316F, -2.9245F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r16.setTextureOffset(0, 0).addBox(-2.5F, 0.8316F, -2.9245F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -2.0F, -3.0F);
		fingers.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0908F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(45, 35).addBox(-2.5F, -0.7883F, -3.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		cube_r17.setTextureOffset(45, 35).addBox(1.0F, -0.7883F, -3.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, 0.0F, 3.0F);
		fingers.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -3.9245F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 3.0F, 0.0F);
		fingers.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(45, 35).addBox(-1.0F, -1.0F, -3.3928F, 2.0F, 2.0F, 4.0F, 0.01F, false);

		axe = new ModelRenderer(this);
		axe.setRotationPoint(-3.0F, 17.0F, -12.0F);
		rightarm.addChild(axe);
		setRotationAngle(axe, -0.4363F, 0.0F, 0.0F);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.2F, -3.5F, 12.1F);
		axe.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.8727F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(118, 0).addBox(-1.8F, 8.1F, 4.4F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r20.setTextureOffset(5, 5).addBox(-1.4F, 17.5F, -40.5F, 3.0F, 3.0F, 27.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 6).addBox(-1.4F, 14.5F, -38.5F, 3.0F, 3.0F, 12.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 0).addBox(-1.4F, 5.5F, -37.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 6).addBox(-1.4F, 11.5F, -37.5F, 3.0F, 3.0F, 9.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 43).addBox(-1.4F, 8.5F, -39.5F, 3.0F, 3.0F, 44.0F, 0.0F, true);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-4.0F, 6.0F, 0.0F);
		rightleg.setTextureOffset(60, 6).addBox(-3.1F, 0.0F, -2.9F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.1F, 21.4101F, -1.6047F);
		rightleg.addChild(cube_r21);
		setRotationAngle(cube_r21, -1.5708F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(89, 20).addBox(-1.4F, -3.0F, -4.5F, 3.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.1F, 11.2244F, 0.0388F);
		rightleg.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(60, 0).addBox(-1.5F, 2.1F, -0.8F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r22.setTextureOffset(51, 65).addBox(-2.0F, -3.2F, -1.4F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.1F, 7.0F, 0.1F);
		rightleg.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(60, 50).addBox(-2.5F, -5.0F, -1.4F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(4.0F, 6.0F, 0.0F);
		leftleg.setTextureOffset(60, 6).addBox(-2.8F, 0.0F, -2.9F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.2F, 21.4101F, -1.6047F);
		leftleg.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.5708F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(89, 20).addBox(-1.6F, -3.0F, -4.5F, 3.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.2F, 11.2244F, 0.0388F);
		leftleg.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(60, 0).addBox(-1.5F, 2.1F, -0.8F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r25.setTextureOffset(51, 65).addBox(-2.0F, -3.2F, -1.4F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.2F, 7.0F, 0.1F);
		leftleg.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(60, 50).addBox(-2.5F, -5.0F, -1.4F, 5.0F, 8.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}