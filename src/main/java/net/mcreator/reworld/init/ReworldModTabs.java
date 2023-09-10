
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReworldModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("reworld", "reworld"),
				builder -> builder.title(Component.translatable("item_group.reworld.reworld")).icon(() -> new ItemStack(ReworldModItems.REWORLDIKON.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ReworldModItems.FORESTKNIFE.get());
					tabData.accept(ReworldModItems.FORESTBOW.get());
					tabData.accept(ReworldModItems.FREEZING_SKEWER.get());
					tabData.accept(ReworldModItems.CRYSTALIZED_POMEGRANATE_SCYTHE.get());
					tabData.accept(ReworldModItems.FIBERY_HEARTED_HELMET.get());
					tabData.accept(ReworldModItems.FIBERY_HEARTED_CHESTPLATE.get());
					tabData.accept(ReworldModItems.FIBERY_HEARTED_LEGGINGS.get());
					tabData.accept(ReworldModItems.FIBERY_HEARTED_BOOTS.get());
					tabData.accept(ReworldModItems.FURRED_ICY_HELMET.get());
					tabData.accept(ReworldModItems.FURRED_ICY_CHESTPLATE.get());
					tabData.accept(ReworldModItems.FURRED_ICY_LEGGINGS.get());
					tabData.accept(ReworldModItems.FURRED_ICY_BOOTS.get());
					tabData.accept(ReworldModItems.POMEGRANATE_PRISMARINE_HELMET.get());
					tabData.accept(ReworldModItems.POMEGRANATE_PRISMARINE_CHESTPLATE.get());
					tabData.accept(ReworldModItems.POMEGRANATE_PRISMARINE_LEGGINGS.get());
					tabData.accept(ReworldModItems.POMEGRANATE_PRISMARINE_BOOTS.get());
					tabData.accept(ReworldModBlocks.BASALT_BRICK.get().asItem());
					tabData.accept(ReworldModBlocks.BASALT_BRICK_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.BASALT_BRICK_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.BASALT_BRICK_WALL.get().asItem());
					tabData.accept(ReworldModBlocks.SCARY_BASALT_BRICK.get().asItem());
					tabData.accept(ReworldModBlocks.SCARY_BASALT_BRICK_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.SCARY_BASALT_BRICK_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.SCARY_BASALT_BRICK_WALL.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_SAPLING.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_LEAVES.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_WOOD.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_LOG.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_PLANKS.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_FENCE.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_FENCE_GATE.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_PRESSURE_PLATE.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_BUTTON.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_DOOR.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRIC_TRAPDOOR.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRICVINE.get().asItem());
					tabData.accept(ReworldModBlocks.TAMORINDRICBLOOMINGVINE.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_SAPLING.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_LEAVES.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_WOOD.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_LOG.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_PLANKS.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_FENCE.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_FENCE_GATE.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_PRESSURE_PLATE.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_BUTTON.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_DOOR.get().asItem());
					tabData.accept(ReworldModBlocks.ERITIERIC_TRAPDOOR.get().asItem());
					tabData.accept(ReworldModBlocks.SNOWY_SPRUCE_LEAVES.get().asItem());
					tabData.accept(ReworldModBlocks.SNOWY_SPRUCE_SAPLING.get().asItem());
					tabData.accept(ReworldModBlocks.FIBER_BLOCK.get().asItem());
					tabData.accept(ReworldModItems.RAWFIBER.get());
					tabData.accept(ReworldModItems.PURIFIEDFIBER.get());
					tabData.accept(ReworldModItems.EDIBLEROOTS.get());
					tabData.accept(ReworldModItems.PEELEDEDIBLEROOT.get());
					tabData.accept(ReworldModBlocks.EDIBLEROOT.get().asItem());
					tabData.accept(ReworldModItems.MELOTHRIA_FOOD.get());
					tabData.accept(ReworldModBlocks.MELOTHRIA.get().asItem());
					tabData.accept(ReworldModItems.CHUFA_FOOD.get());
					tabData.accept(ReworldModBlocks.CHUFA.get().asItem());
					tabData.accept(ReworldModItems.PHYSALIS_FOOD.get());
					tabData.accept(ReworldModBlocks.PHYSALIS.get().asItem());
					tabData.accept(ReworldModItems.PITAYA_FRUIT.get());
					tabData.accept(ReworldModBlocks.PITAYA.get().asItem());
					tabData.accept(ReworldModBlocks.SANDROUSE.get().asItem());
					tabData.accept(ReworldModBlocks.ORANGE_ASTER.get().asItem());
					tabData.accept(ReworldModBlocks.GREEN_ASTER.get().asItem());
					tabData.accept(ReworldModBlocks.CROCUS.get().asItem());
					tabData.accept(ReworldModBlocks.CHOCO.get().asItem());
					tabData.accept(ReworldModBlocks.FIBROUS_BUSH.get().asItem());
					tabData.accept(ReworldModItems.BRANCH_OF_BLACK_PEPPERS.get());
					tabData.accept(ReworldModBlocks.BLACK_PEPPER.get().asItem());
					tabData.accept(ReworldModBlocks.CLOVERS_GRASS.get().asItem());
					tabData.accept(ReworldModBlocks.HANGING_COCOA.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_SLAB.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_STAIRS.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_MOSSY_STONE.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_MYCENAE_BLOCK.get().asItem());
					tabData.accept(ReworldModBlocks.BLUE_MYCENAE_HANGING.get().asItem());
					tabData.accept(ReworldModItems.BLUE_MYCENAE_FOOD.get());
					tabData.accept(ReworldModBlocks.LOOSE_CLAY.get().asItem());
					tabData.accept(ReworldModBlocks.SNOWY_BLUE_ICE.get().asItem());
					tabData.accept(ReworldModBlocks.BLOCK_SPAWN_ENT.get().asItem());
					tabData.accept(ReworldModBlocks.BLOCK_SPAWN_POMEGRANATE_GOLEM.get().asItem());
					tabData.accept(ReworldModBlocks.BLOCK_ICY_CREATURE_SPAWN.get().asItem());
					tabData.accept(ReworldModBlocks.REDSTONE_PISTON_SPIKES.get().asItem());
					tabData.accept(ReworldModBlocks.REDSTONE_MINER.get().asItem());
					tabData.accept(ReworldModItems.SPOILED_MUSHROOM_STEW.get());
					tabData.accept(ReworldModItems.MUSHROOM_ROTTEN_FLESH.get());
					tabData.accept(ReworldModItems.APPLECIDER.get());
					tabData.accept(ReworldModItems.CHORUSCIDER.get());
					tabData.accept(ReworldModItems.BROKEN_TOTEMOF_UNDYING.get());
					tabData.accept(ReworldModItems.BUNDLE_OF_ARTIFACTS.get());
					tabData.accept(ReworldModItems.BUNDLE_OF_AGRICULTURES.get());
					tabData.accept(ReworldModItems.HEART_OF_FOREST.get());
					tabData.accept(ReworldModItems.HEART_OF_ICE.get());
					tabData.accept(ReworldModItems.HEART_OF_MUSHROOMS.get());
					tabData.accept(ReworldModItems.ICY_FUR.get());
					tabData.accept(ReworldModItems.SNOWY_ICY_CREATURE_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.ENT_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.ALIVE_SNOWY_ICE_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.WHITE_BELLIED_MINAGO_BIRD_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.TAMORINDIC_LUNA_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.ALIVE_BLUE_POMEGRANATE_STONE_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.BIG_INCENSE_BURNER_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.MYCENAE_MORPHO_SPAWN_EGG.get());
					tabData.accept(ReworldModItems.POMEGRANATE_STONE_GOLEM_SPAWN_EGG.get());
				}).withSearchBar());
	}
}
