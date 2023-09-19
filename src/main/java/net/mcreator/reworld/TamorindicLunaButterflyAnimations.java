
package net.mcreator.reworld;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

public class TamorindicLunaButterflyAnimations {
	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("forwardrightWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 10f, -10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 7.5f, 15f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backrightWing2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 25f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardleftWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -10f, 10f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -7.5f, -15f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backleftWing2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 5f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -25f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(1.5f)
			.addAnimation("body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardrightWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -35f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 35f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, -25f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardleftWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 35f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -35f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 25f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("small_paws",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("small_paws_rear",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -0.5f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("small_paws_rear",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();
	public static final AnimationDefinition DEATH = AnimationDefinition.Builder.withLength(2f)
			.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardrightWing", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardrightWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, -17.5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backrightWing2", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backrightWing2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.5f, KeyframeAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("forwardleftWing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, -5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backleftWing2", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("backleftWing2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.5f, KeyframeAnimations.degreeVec(20f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("small_paws", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("small_paws", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(1.5f, KeyframeAnimations.degreeVec(-90f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("general",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 8f, 0f), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, -1f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("general", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1f, KeyframeAnimations.degreeVec(-180f, 0f, 0f), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5f, KeyframeAnimations.degreeVec(-180f, 0f, -10f), AnimationChannel.Interpolations.LINEAR)))
			.build();
}
