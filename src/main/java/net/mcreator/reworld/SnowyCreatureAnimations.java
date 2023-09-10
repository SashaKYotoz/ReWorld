package net.mcreator.reworld;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

@OnlyIn(Dist.CLIENT)
public class SnowyCreatureAnimations {
	private static float NaNf = 0;

	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(4f).looping()
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(0.5f, 0.5f, 0.5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.scaleVec(0.25f, 0.25f, 0.25f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.scaleVec(0.5f, 0.5f, 0.5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.scaleVec(0.25f, 0.25f, 0.25f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4f, KeyframeAnimations.scaleVec(0.5f, 0.5f, 0.5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(35f, 0f, 5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(25f, 0f, 10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(35f, 0f, 5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(45f, 0f, 10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4f, KeyframeAnimations.degreeVec(35f, 0f, 5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(35f, 0f, -5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(25f, 0f, -10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(35f, 0f, -5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(45f, 0f, -10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4f, KeyframeAnimations.degreeVec(35f, 0f, -5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("center",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 90f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 180f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 270f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 360f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(2f).looping()
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.scaleVec(0.5f, 0.5f, 0.5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("torse", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("center",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 90f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 180f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 270f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 360f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_bottom_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_bottom_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(NaNf, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 4f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 20f, -5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(0f, 37f, 14f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 18f, -27f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.scaleVec(1.25f, 1.25f, 1.25f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -20f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-75f, -20f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-140f, -20f, 10f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-45f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-5f, 20f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-75f, 20f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-140f, 20f, -10f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-45f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_leg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_leg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("center", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("fingers1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("fingers", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition DEATH = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -12f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -7.5f, 11f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.scaleVec(0.25f, 0.25f, 0.25f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("torse",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -12f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -13f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -13f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_leg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -11f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_leg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-60f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_leg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -11f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_leg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-60f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_bottom_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.5f, KeyframeAnimations.degreeVec(-25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_bottom_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.5f, KeyframeAnimations.degreeVec(-25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition ATTACK1 = AnimationDefinition.Builder.withLength(0.5f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ice", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(12.5f, -20f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, KeyframeAnimations.degreeVec(-90f, -20f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(12.5f, 25f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.375f, KeyframeAnimations.degreeVec(-90f, 25f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
}
