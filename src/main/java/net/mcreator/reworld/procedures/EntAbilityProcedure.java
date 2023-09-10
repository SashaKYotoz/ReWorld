package net.mcreator.reworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.reworld.init.ReworldModMobEffects;
import net.mcreator.reworld.entity.EntEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntAbilityProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		if (sourceentity instanceof EntEntity) {
			if (Math.random() < 0.5) {
				speed = 1.5;
				Yaw = sourceentity.getYRot();
				entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), (Mth.nextDouble(RandomSource.create(), 0.25, 0.5)), (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
				if (!(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(ReworldModMobEffects.POWEROF_FOREST.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(ReworldModMobEffects.POWEROF_FOREST.get(), 80, 0));
				}
			}
		}
	}
}
