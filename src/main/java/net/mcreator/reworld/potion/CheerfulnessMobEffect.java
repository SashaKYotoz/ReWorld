
package net.mcreator.reworld.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.reworld.procedures.CheerfulnessOnEffectActiveTickProcedure;

public class CheerfulnessMobEffect extends MobEffect {
	public CheerfulnessMobEffect() {
		super(MobEffectCategory.NEUTRAL, -5376);
	}

	@Override
	public String getDescriptionId() {
		return "effect.reworld.cheerfulness";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CheerfulnessOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
