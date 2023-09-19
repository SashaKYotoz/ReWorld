
package net.mcreator.reworld;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

public class AliveSnowyIceAnimations {
	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(3f)
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
			.build();
	public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 8f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(0f, 12f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(180f, 0f, -17.5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(270f, 0f, 17.5f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25f, KeyframeAnimations.degreeVec(360f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 10f, -4f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-135f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 10f, -4f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.5f, KeyframeAnimations.degreeVec(-65f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition DEATH = AnimationDefinition.Builder.withLength(1f)
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -3f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -5f, -3f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("rightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -5f, -3f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftLeg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.5f, KeyframeAnimations.degreeVec(90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
}
