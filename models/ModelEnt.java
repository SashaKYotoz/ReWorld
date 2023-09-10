// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelEnt extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer body;
	private final ModelRenderer cube_r9;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer leftLeg;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer rightLeg;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;

	public ModelEnt() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -15.0F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.setTextureOffset(0, 44).addBox(-4.0F, -4.0F, -1.0F, 7.0F, 9.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 76).addBox(3.0F, 2.0F, -1.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 76).addBox(-5.0F, 2.0F, -1.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 100).addBox(-5.0F, 2.0F, 3.0F, 9.0F, 3.0F, 1.0F, 0.01F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, 2.0F, 3.0F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(65, 80).addBox(3.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 48).addBox(3.0F, -4.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 48).addBox(-5.0F, -4.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 48).addBox(-5.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 48).addBox(3.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(65, 80).addBox(-5.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 100).addBox(-5.0F, 0.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 100).addBox(3.0F, 0.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(37, 97).addBox(1.0F, 1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(37, 97).addBox(-1.0F, 1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 87).addBox(-4.0F, -3.0F, 3.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 85).addBox(-4.0F, -5.0F, 3.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(58, 30).addBox(-4.0F, -6.0F, -1.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(53, 0).addBox(-5.0F, -5.0F, -1.0F, 9.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(-3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(37, 97).addBox(-3.0F, 1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.2267F, -7.9572F, -2.6642F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1265F, 0.0338F, -0.216F);
		cube_r1.setTextureOffset(19, 82).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2029F, -8.5015F, 0.9F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0436F);
		cube_r2.setTextureOffset(19, 82).addBox(-1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.6149F, -11.6139F, 0.4F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.6981F, -0.3927F);
		cube_r3.setTextureOffset(64, 85).addBox(-3.0F, 0.0F, 1.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.6191F, -13.6202F, -2.6F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, -0.2618F);
		cube_r4.setTextureOffset(64, 85).addBox(-5.0F, 0.0F, -2.5F, 8.0F, 4.0F, 7.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.9242F, -11.3241F, 0.4F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3927F);
		cube_r5.setTextureOffset(64, 85).addBox(-3.0F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.7024F, -8.5233F, 0.9F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0436F);
		cube_r6.setTextureOffset(19, 82).addBox(-0.5F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.8931F, -8.9715F, 0.9F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
		cube_r7.setTextureOffset(19, 82).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, -10.0F, 1.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.4363F);
		cube_r8.setTextureOffset(19, 82).addBox(1.0F, -2.0F, -1.1F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 28.0F, 0.0F);
		setRotationAngle(body, 0.0F, 3.1416F, 0.0F);
		body.setTextureOffset(82, 0).addBox(-7.0F, -35.0F, 4.0F, 13.0F, 13.0F, 10.0F, 0.01F, false);
		body.setTextureOffset(82, 23).addBox(-7.0F, -30.0F, -5.0F, 13.0F, 13.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(56, 51).addBox(-4.0F, -29.0F, -8.0F, 7.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -28.5F, -0.5F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(60, 0).addBox(-0.9F, -8.5F, 6.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r9.setTextureOffset(60, 0).addBox(-0.9F, -8.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r9.setTextureOffset(60, 20).addBox(-1.5F, -5.5F, 5.5F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(60, 20).addBox(-1.5F, -5.5F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(0, 18).addBox(-5.5F, -1.5F, -2.5F, 11.0F, 11.0F, 9.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-6.0F, -2.0F, -8.0F);
		setRotationAngle(rightarm, 0.0F, 3.1416F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.0138F, 16.5996F, 13.945F);
		rightarm.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.5946F, 0.5038F, 1.5163F);
		cube_r10.setTextureOffset(122, 65).addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.0998F, 14.2711F, 11.8071F);
		rightarm.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.071F, 0.5038F, 1.5163F);
		cube_r11.setTextureOffset(65, 90).addBox(0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(3.1F, 12.8262F, 15.0708F);
		rightarm.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(27, 125).addBox(-2.9F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 0).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.7F, 13.429F, 12.7306F);
		rightarm.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(69, 124).addBox(1.9F, -1.5F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r13.setTextureOffset(69, 124).addBox(-0.5F, -1.429F, -2.3F, 1.0F, 1.0F, 3.0F, 0.01F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.1F, 7.5071F, 3.2411F);
		rightarm.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(96, 111).addBox(-1.9F, -0.5071F, -2.3148F, 4.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.1F, 7.5F, 3.2411F);
		rightarm.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(110, 80).addBox(-2.1F, -9.6596F, -4.4313F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(7.0F, -2.0F, -8.0F);
		setRotationAngle(leftarm, 0.0F, 3.1416F, 0.0F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.6F, 12.8262F, 15.0708F);
		leftarm.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6545F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(27, 125).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r16.setTextureOffset(0, 0).addBox(-2.9F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.0F, 13.429F, 12.7306F);
		leftarm.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(69, 124).addBox(1.9F, -1.429F, -2.3F, 1.0F, 1.0F, 3.0F, 0.01F, false);
		cube_r17.setTextureOffset(69, 124).addBox(-0.5F, -1.5F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.7859F, 16.498F, 13.4908F);
		leftarm.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.553F, 0.4968F, -0.2861F);
		cube_r18.setTextureOffset(122, 65).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-5.0F, 14.7673F, 11.6823F);
		leftarm.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.4815F, 0.0774F, -0.0404F);
		cube_r19.setTextureOffset(65, 90).addBox(0.5F, 0.2F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.2F, 7.5071F, 3.2411F);
		leftarm.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.5672F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(0, 0).addBox(-1.9F, -0.5071F, -2.3148F, 4.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.9F, 7.5F, 3.2411F);
		leftarm.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(110, 80).addBox(-2.1F, -9.6596F, -4.4313F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(5.0F, 6.0F, 0.0F);
		setRotationAngle(leftLeg, 0.0F, 3.1416F, 0.0F);
		leftLeg.setTextureOffset(32, 0).addBox(-3.9F, 7.3314F, -4.5052F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.9333F, 16.6592F, 0.3346F);
		leftLeg.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.6545F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(60, 115).addBox(0.1333F, -1.6646F, 1.9291F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r22.setTextureOffset(60, 115).addBox(-2.0667F, -1.6646F, 1.9291F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.9333F, 16.6592F, 0.3346F);
		leftLeg.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.3491F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(60, 115).addBox(-2.1667F, 0.5693F, -0.5408F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r23.setTextureOffset(60, 115).addBox(-1.1667F, -1.9307F, -7.5408F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r23.setTextureOffset(60, 115).addBox(0.2333F, 0.5693F, -0.6408F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.0F, 3.5F, 0.1F);
		leftLeg.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2618F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(35, 32).addBox(-2.0F, -5.5F, -3.5F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-5.0F, 6.0F, 0.0F);
		setRotationAngle(rightLeg, 0.0F, 3.1416F, 0.0F);
		rightLeg.setTextureOffset(32, 0).addBox(-0.9F, 7.3314F, -4.5052F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.0667F, 16.6592F, 0.3346F);
		rightLeg.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.6545F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(60, 115).addBox(0.1333F, -1.6646F, 1.9291F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r25.setTextureOffset(60, 115).addBox(-2.0667F, -1.6646F, 1.9291F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.0667F, 16.6592F, 0.3346F);
		rightLeg.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(60, 115).addBox(-2.1667F, 0.5693F, -0.5408F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r26.setTextureOffset(60, 115).addBox(-1.1667F, -1.9307F, -7.5408F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r26.setTextureOffset(60, 115).addBox(0.2333F, 0.5693F, -0.6408F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.0F, 3.5F, 0.1F);
		rightLeg.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.2618F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(35, 32).addBox(-2.0F, -5.5F, -3.5F, 4.0F, 11.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}