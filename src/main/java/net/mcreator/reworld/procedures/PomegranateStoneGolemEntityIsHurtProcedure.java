package net.mcreator.reworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.reworld.init.ReworldModEntities;
import net.mcreator.reworld.entity.AliveSnowyIceEntity;
import net.mcreator.reworld.entity.AliveBluePomegranateStoneEntity;

public class PomegranateStoneGolemEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.25) {
			if (!(!world.getEntitiesOfClass(AliveSnowyIceEntity.class, AABB.ofSize(new Vec3(x, y, z), 9, 9, 9), e -> true).isEmpty())) {
				for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 3); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AliveBluePomegranateStoneEntity(ReworldModEntities.ALIVE_BLUE_POMEGRANATE_STONE.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
