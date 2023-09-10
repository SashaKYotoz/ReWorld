
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.reworld.ReworldMod;

public class ReworldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ReworldMod.MODID);
	public static final RegistryObject<SoundEvent> TAMORINDRIC_FOREST_SOUND = REGISTRY.register("tamorindric_forest_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("reworld", "tamorindric_forest_sound")));
	public static final RegistryObject<SoundEvent> TAMORINDIC_VOID = REGISTRY.register("tamorindic_void", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("reworld", "tamorindic_void")));
}
