package net.mcreator.reworld.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.reworld.entity.EntEntity;
import net.mcreator.reworld.EntAnimations;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ModelEritieric_Ent<T extends EntEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("reworld", "model_eritieric_ent"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart branch;
	public final ModelPart branch1;
	public final ModelPart branch2;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart rightleg;
	public final ModelPart rightleg1;
	public final ModelPart leftleg;
	public final ModelPart leftleg1;
	public final ModelPart root;

	public ModelEritieric_Ent(ModelPart root) {
		this.root = root;
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.rightleg = root.getChild("rightleg");
		this.rightleg1 = rightleg.getChild("rightleg1");
		this.leftleg = root.getChild("leftleg");
		this.leftleg1 = leftleg.getChild("leftleg1");
		this.branch = body.getChild("branch");
		this.branch1 = body.getChild("branch1");
		this.branch2 = body.getChild("branch2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-3.0F, -6.0F, -4.0F, 7.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 76).mirror().addBox(-4.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 76).mirror().addBox(4.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 100).mirror().addBox(-4.0F, 0.0F, -5.0F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.01F))
						.mirror(false).texOffs(11, 79).mirror().addBox(-4.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 48).mirror().addBox(-4.0F, -6.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(62, 48).mirror().addBox(4.0F, -6.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 48).mirror().addBox(4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(62, 48).mirror().addBox(-4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 79).mirror().addBox(4.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 93).mirror().addBox(4.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 93).mirror().addBox(-4.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 93).mirror().addBox(-2.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 94).mirror().addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 87).mirror().addBox(-3.0F, -5.0F, -5.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 85).mirror().addBox(-3.0F, -7.0F, -5.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(58, 30).mirror().addBox(-3.0F, -8.0F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 0).mirror().addBox(-4.0F, -7.0F, -4.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).addBox(-2.0F, -4.0F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(1.0F, -4.0F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 93)
						.mirror().addBox(2.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 2.0F, -16.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-0.7733F, -2.9572F, -2.0858F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -10.0F, 2.0F, -0.1745F, 0.0349F, 0.2094F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-1.0F, -3.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2029F, -10.5015F, -1.9F, 0.4363F, 0.0F, -0.0436F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-3.0F, 0.0F, -6.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.6149F, -13.6139F, -1.4F, 0.0F, 0.6981F, 0.3927F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-3.0F, 0.0F, -4.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6191F, -15.6202F, 1.6F, -0.3927F, 0.0F, 0.2618F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-3.0F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.9242F, -13.3241F, -1.4F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-1.5F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7024F, -10.5233F, -1.9F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(0.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8931F, -10.9715F, -1.9F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-3.0F, -2.0F, -0.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -12.0F, -2.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-6.0F, -11.0F, -10.0F, 13.0F, 13.0F, 10.0F, new CubeDeformation(0.01F)).mirror(false).texOffs(82, 23).mirror()
						.addBox(-6.0F, -6.0F, -1.0F, 13.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 51).mirror().addBox(-3.0F, -5.0F, 9.0F, 7.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 11)
						.addBox(-8.6F, -13.0F, -3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(61, 11).mirror().addBox(6.4F, -13.0F, -3.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 4.0F, -6.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild(
				"cube_r9", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-5.5F, -1.5F, 3.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 0).mirror()
						.addBox(-5.1F, -4.5F, 4.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 48).mirror().addBox(-6.6F, -8.25F, 2.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -4.5F, 4.5F, -0.5236F, -0.1745F, -0.384F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-5.5F, -1.5F, -6.5F, 11.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -4.5F, 4.5F, -0.5672F, 0.0F, 0.0F));
		PartDefinition branch2 = body.addOrReplaceChild("branch2", CubeListBuilder.create(), PartPose.offset(0.5F, -4.5F, 4.5F));
		PartDefinition cube_r11 = branch2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(108, 48).mirror().addBox(0.65F, -12.25F, 0.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(60, 0).mirror()
						.addBox(1.9F, -8.5F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 20).mirror().addBox(1.5F, -5.5F, 1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4887F, 0.2967F, 0.576F));
		PartDefinition branch1 = body.addOrReplaceChild("branch1", CubeListBuilder.create(), PartPose.offset(0.5F, -4.5F, 4.5F));
		PartDefinition cube_r12 = branch1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(61, 11).mirror().addBox(1.9F, -8.5F, -2.5F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 48).mirror()
						.addBox(-0.35F, -12.25F, -5.25F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(60, 0).mirror().addBox(0.9F, -8.5F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 20)
						.mirror().addBox(0.5F, -5.5F, -4.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0873F));
		PartDefinition branch = body.addOrReplaceChild("branch", CubeListBuilder.create(), PartPose.offset(0.5F, -4.5F, 4.5F));
		PartDefinition cube_r13 = branch.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(61, 11).addBox(-5.1F, -8.5F, -7.5F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(108, 48).mirror().addBox(-4.6F, -12.25F, -10.25F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false)
						.texOffs(60, 0).mirror().addBox(-3.1F, -8.5F, -8.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 20).mirror().addBox(-3.5F, -5.5F, -9.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, -0.0873F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-3.0F, -4.0F, -12.0F));
		PartDefinition cube_r14 = rightarm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0138F, 18.5996F, -11.945F, 0.5946F, 0.5038F, -1.5163F));
		PartDefinition cube_r15 = rightarm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 90).mirror().addBox(-1.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0998F, 16.2711F, -9.8071F, 0.071F, 0.5038F, -1.5163F));
		PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(1.9F, 0.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1F, 14.8262F, -13.0708F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r17 = rightarm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-2.9F, -1.5F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(87, 80).mirror()
				.addBox(-0.5F, -1.429F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 15.429F, -10.7306F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 111).mirror().addBox(-2.1F, -0.6042F, -9.6852F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.1F, 9.5071F, -1.2411F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r19 = rightarm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(110, 80).mirror().addBox(-1.9F, -9.6667F, -0.5687F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.1F, 9.5071F, -1.2411F, -0.0436F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(3.0F, -4.0F, -12.0F));
		PartDefinition cube_r20 = leftarm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(1.9F, 0.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6F, 14.8262F, -13.0708F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r21 = leftarm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-2.9F, -1.429F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false).texOffs(87, 80).mirror()
				.addBox(-0.5F, -1.5F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 15.429F, -10.7306F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r22 = leftarm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.7859F, 18.498F, -11.4908F, 0.553F, 0.4968F, 0.2861F));
		PartDefinition cube_r23 = leftarm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(65, 90).mirror().addBox(-1.5F, 0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 16.7673F, -9.6823F, 0.4815F, 0.0774F, 0.0404F));
		PartDefinition cube_r24 = leftarm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.1F, -0.6042F, -9.6852F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.2F, 9.5071F, -1.2411F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r25 = leftarm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(110, 80).mirror().addBox(-1.9F, -9.6667F, -0.5687F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.9F, 9.5071F, -1.2411F, -0.0436F, 0.0F, 0.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-3.0F, 4.0F, 0.0F));
		PartDefinition cube_r26 = rightleg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-2.0F, -5.5F, -1.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 5.5F, -2.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition rightleg1 = rightleg.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.1F, -0.67F, -3.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 10.0F, 0.5F));
		PartDefinition cube_r27 = rightleg1.addOrReplaceChild(
				"cube_r27", CubeListBuilder.create().texOffs(8, 92).addBox(-0.8333F, -1.9307F, 4.5408F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 92).mirror()
						.addBox(0.1667F, 0.5693F, -2.4592F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 92).mirror().addBox(-2.2333F, 0.5693F, -2.3592F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9333F, 8.6592F, -2.8346F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r28 = rightleg1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 92).addBox(-2.1333F, -1.6646F, -3.9291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 92).mirror()
				.addBox(0.0667F, -1.6646F, -3.9291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9333F, 8.6592F, -2.8346F, 0.6545F, 0.0F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, 0.0F));
		PartDefinition cube_r29 = leftleg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-2.0F, -5.5F, -1.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 5.5F, -2.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition leftleg1 = leftleg.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.9F, -0.67F, -3.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 10.0F, 0.5F));
		PartDefinition cube_r30 = leftleg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(8, 92).addBox(-2.1333F, -1.6646F, -3.9291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 92).mirror()
				.addBox(0.0667F, -1.6646F, -3.9291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0667F, 8.6592F, -2.8346F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r31 = leftleg1.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(8, 92).mirror().addBox(0.1667F, 0.5693F, -2.4592F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 92).mirror()
						.addBox(-0.8333F, -1.9307F, 4.5408F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 92).mirror().addBox(-2.2333F, 0.5693F, -2.3592F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0667F, 8.6592F, -2.8346F, -0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		if (Math.random() < 0.25)
			this.animate(entity.attackAnimationState, EntAnimations.ATTACK, ageInTicks);
		else if (Math.random() < 0.5) {
			this.animate(entity.attackAnimationState, EntAnimations.ATTACK1, ageInTicks);
		} else if (Math.random() < 0.125) {
			this.animate(entity.attackAnimationState, EntAnimations.ATTACK2, ageInTicks);
		} else {
			this.animate(entity.attackAnimationState, EntAnimations.ATTACK3, ageInTicks);
		}
		this.animate(entity.walkAnimationState, EntAnimations.WALK, ageInTicks);
	}
}
