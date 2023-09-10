
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reworld.client.particle.SandStormParticleParticle;
import net.mcreator.reworld.client.particle.MagicParticleParticle;
import net.mcreator.reworld.client.particle.GreenishGrassParticleParticle;
import net.mcreator.reworld.client.particle.FirefliesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReworldModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ReworldModParticleTypes.FIREFLIES.get(), FirefliesParticle::provider);
		event.registerSpriteSet(ReworldModParticleTypes.MAGIC_PARTICLE.get(), MagicParticleParticle::provider);
		event.registerSpriteSet(ReworldModParticleTypes.SAND_STORM_PARTICLE.get(), SandStormParticleParticle::provider);
		event.registerSpriteSet(ReworldModParticleTypes.GREENISH_GRASS_PARTICLE.get(), GreenishGrassParticleParticle::provider);
	}
}
