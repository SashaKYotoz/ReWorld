package net.mcreator.reworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class SandrouseMobplayerCollidesWithPlantProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		{
			Entity _entToDamage = entity;
			_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
		}
		speed = 1;
		Yaw = entity.getYRot();
		entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), 0.25, (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
	}
}
