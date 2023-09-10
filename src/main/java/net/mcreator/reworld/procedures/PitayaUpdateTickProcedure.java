package net.mcreator.reworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModBlocks;

public class PitayaUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.025) {
			world.setBlock(BlockPos.containing(x, y, z), ReworldModBlocks.GROWN_PITAYA.get().defaultBlockState(), 3);
			world.addParticle(ParticleTypes.COMPOSTER, x, y, z, 0, 1, 0);
		}
	}
}
