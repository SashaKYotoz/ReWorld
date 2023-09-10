
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.reworld.potion.PowerofForestMobEffect;
import net.mcreator.reworld.potion.CheerfulnessMobEffect;
import net.mcreator.reworld.ReworldMod;

public class ReworldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ReworldMod.MODID);
	public static final RegistryObject<MobEffect> CHEERFULNESS = REGISTRY.register("cheerfulness", () -> new CheerfulnessMobEffect());
	public static final RegistryObject<MobEffect> POWEROF_FOREST = REGISTRY.register("powerof_forest", () -> new PowerofForestMobEffect());
}
