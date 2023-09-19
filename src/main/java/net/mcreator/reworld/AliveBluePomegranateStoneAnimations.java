package net.mcreator.reworld;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

public class AliveBluePomegranateStoneAnimations {
	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(2.5f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(-5f, 5f, -5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(5f, -5f, 5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(2f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-5f, 0f, -5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-35f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(15f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(15f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-35f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(15f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("mushroom",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 2.5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("mushroom2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(5f, 0f, -5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(80f, 0f, 15f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-45f, 0f, -15f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("mushroom",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition DEATH = AnimationDefinition.Builder.withLength(2f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -5f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(-8f, -5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(-8f, -6f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -90f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -180f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(8f, -5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(8f, -6f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 90f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 180f), AnimationChannel.Interpolations.LINEAR)))
			.build();
}
