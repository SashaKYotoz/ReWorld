
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.reworld.world.inventory.BundleOfArtifactsGUIMenu;
import net.mcreator.reworld.ReworldMod;

public class ReworldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ReworldMod.MODID);
	public static final RegistryObject<MenuType<BundleOfArtifactsGUIMenu>> BUNDLE_OF_ARTIFACTS_GUI = REGISTRY.register("bundle_of_artifacts_gui", () -> IForgeMenuType.create(BundleOfArtifactsGUIMenu::new));
}
