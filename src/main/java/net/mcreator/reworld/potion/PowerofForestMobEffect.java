
package net.mcreator.reworld.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.reworld.procedures.PowerofForestOnEffectActiveTickProcedure;

public class PowerofForestMobEffect extends MobEffect {
	public PowerofForestMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711808);
	}

	@Override
	public String getDescriptionId() {
		return "effect.reworld.powerof_forest";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PowerofForestOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
