package net.mcreator.reworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.reworld.init.ReworldModParticleTypes;

public class SandrouseMobplayerCollidesWithPlantProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
		speed = 1;
		Yaw = entity.getYRot();
		entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), 0.25, (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ReworldModParticleTypes.SAND_STORM_PARTICLE.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}
