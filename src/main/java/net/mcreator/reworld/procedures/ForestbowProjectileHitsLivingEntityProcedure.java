package net.mcreator.reworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.reworld.init.ReworldModParticleTypes;
import net.mcreator.reworld.init.ReworldModMobEffects;

public class ForestbowProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		loop = 0;
		particleAmount = 16;
		xRadius = 1;
		zRadius = 1;
		while (loop < particleAmount) {
			world.addParticle((SimpleParticleType) (ReworldModParticleTypes.GREENISH_GRASS_PARTICLE.get()), (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0,
					0.05, 0);
			loop = loop + 1;
		}
		if (!(sourceentity == entity)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(ReworldModMobEffects.POWEROF_FOREST.get(), 100, 0));
		}
	}
}
