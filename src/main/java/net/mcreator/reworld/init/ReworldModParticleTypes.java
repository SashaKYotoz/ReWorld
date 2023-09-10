
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.reworld.ReworldMod;

public class ReworldModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ReworldMod.MODID);
	public static final RegistryObject<SimpleParticleType> FIREFLIES = REGISTRY.register("fireflies", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MAGIC_PARTICLE = REGISTRY.register("magic_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SAND_STORM_PARTICLE = REGISTRY.register("sand_storm_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GREENISH_GRASS_PARTICLE = REGISTRY.register("greenish_grass_particle", () -> new SimpleParticleType(false));
}
