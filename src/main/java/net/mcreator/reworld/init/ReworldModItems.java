
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.reworld.item.SpoiledMushroomStewItem;
import net.mcreator.reworld.item.ReworldikonItem;
import net.mcreator.reworld.item.RawfiberItem;
import net.mcreator.reworld.item.PurifiedfiberItem;
import net.mcreator.reworld.item.PomegranatePrismarineItem;
import net.mcreator.reworld.item.PitayaFruitItem;
import net.mcreator.reworld.item.PhysalisFoodItem;
import net.mcreator.reworld.item.PeeledediblerootItem;
import net.mcreator.reworld.item.MushroomRottenFleshItem;
import net.mcreator.reworld.item.MelothriaFoodItem;
import net.mcreator.reworld.item.IcyFurItem;
import net.mcreator.reworld.item.HeartOfMushroomsItem;
import net.mcreator.reworld.item.HeartOfIceItem;
import net.mcreator.reworld.item.HeartOfForestItem;
import net.mcreator.reworld.item.FurredIcyItem;
import net.mcreator.reworld.item.FreezingSkewerRangedItemItem;
import net.mcreator.reworld.item.FreezingSkewerItem;
import net.mcreator.reworld.item.ForestknifeItem;
import net.mcreator.reworld.item.ForestbowItem;
import net.mcreator.reworld.item.FiberyHeartedItem;
import net.mcreator.reworld.item.EdiblerootsItem;
import net.mcreator.reworld.item.CrystalizedPomegranateScytheItem;
import net.mcreator.reworld.item.ChufaFoodItem;
import net.mcreator.reworld.item.ChorusciderItem;
import net.mcreator.reworld.item.BundleOfArtifactsItem;
import net.mcreator.reworld.item.BundleOfAgriculturesItem;
import net.mcreator.reworld.item.BrokenTotemofUndyingItem;
import net.mcreator.reworld.item.BranchOfBlackPeppersItem;
import net.mcreator.reworld.item.BlueMycenaeFoodItem;
import net.mcreator.reworld.item.AppleciderItem;
import net.mcreator.reworld.ReworldMod;

public class ReworldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReworldMod.MODID);
	public static final RegistryObject<Item> FORESTKNIFE = REGISTRY.register("forestknife", () -> new ForestknifeItem());
	public static final RegistryObject<Item> FORESTBOW = REGISTRY.register("forestbow", () -> new ForestbowItem());
	public static final RegistryObject<Item> FREEZING_SKEWER = REGISTRY.register("freezing_skewer", () -> new FreezingSkewerItem());
	public static final RegistryObject<Item> CRYSTALIZED_POMEGRANATE_SCYTHE = REGISTRY.register("crystalized_pomegranate_scythe", () -> new CrystalizedPomegranateScytheItem());
	public static final RegistryObject<Item> FIBERY_HEARTED_HELMET = REGISTRY.register("fibery_hearted_helmet", () -> new FiberyHeartedItem.Helmet());
	public static final RegistryObject<Item> FIBERY_HEARTED_CHESTPLATE = REGISTRY.register("fibery_hearted_chestplate", () -> new FiberyHeartedItem.Chestplate());
	public static final RegistryObject<Item> FIBERY_HEARTED_LEGGINGS = REGISTRY.register("fibery_hearted_leggings", () -> new FiberyHeartedItem.Leggings());
	public static final RegistryObject<Item> FIBERY_HEARTED_BOOTS = REGISTRY.register("fibery_hearted_boots", () -> new FiberyHeartedItem.Boots());
	public static final RegistryObject<Item> FURRED_ICY_HELMET = REGISTRY.register("furred_icy_helmet", () -> new FurredIcyItem.Helmet());
	public static final RegistryObject<Item> FURRED_ICY_CHESTPLATE = REGISTRY.register("furred_icy_chestplate", () -> new FurredIcyItem.Chestplate());
	public static final RegistryObject<Item> FURRED_ICY_LEGGINGS = REGISTRY.register("furred_icy_leggings", () -> new FurredIcyItem.Leggings());
	public static final RegistryObject<Item> FURRED_ICY_BOOTS = REGISTRY.register("furred_icy_boots", () -> new FurredIcyItem.Boots());
	public static final RegistryObject<Item> POMEGRANATE_PRISMARINE_HELMET = REGISTRY.register("pomegranate_prismarine_helmet", () -> new PomegranatePrismarineItem.Helmet());
	public static final RegistryObject<Item> POMEGRANATE_PRISMARINE_CHESTPLATE = REGISTRY.register("pomegranate_prismarine_chestplate", () -> new PomegranatePrismarineItem.Chestplate());
	public static final RegistryObject<Item> POMEGRANATE_PRISMARINE_LEGGINGS = REGISTRY.register("pomegranate_prismarine_leggings", () -> new PomegranatePrismarineItem.Leggings());
	public static final RegistryObject<Item> POMEGRANATE_PRISMARINE_BOOTS = REGISTRY.register("pomegranate_prismarine_boots", () -> new PomegranatePrismarineItem.Boots());
	public static final RegistryObject<Item> BASALT_BRICK = block(ReworldModBlocks.BASALT_BRICK);
	public static final RegistryObject<Item> BASALT_BRICK_SLAB = block(ReworldModBlocks.BASALT_BRICK_SLAB);
	public static final RegistryObject<Item> BASALT_BRICK_STAIRS = block(ReworldModBlocks.BASALT_BRICK_STAIRS);
	public static final RegistryObject<Item> BASALT_BRICK_WALL = block(ReworldModBlocks.BASALT_BRICK_WALL);
	public static final RegistryObject<Item> SCARY_BASALT_BRICK = block(ReworldModBlocks.SCARY_BASALT_BRICK);
	public static final RegistryObject<Item> SCARY_BASALT_BRICK_SLAB = block(ReworldModBlocks.SCARY_BASALT_BRICK_SLAB);
	public static final RegistryObject<Item> SCARY_BASALT_BRICK_STAIRS = block(ReworldModBlocks.SCARY_BASALT_BRICK_STAIRS);
	public static final RegistryObject<Item> SCARY_BASALT_BRICK_WALL = block(ReworldModBlocks.SCARY_BASALT_BRICK_WALL);
	public static final RegistryObject<Item> TAMORINDRIC_SAPLING = block(ReworldModBlocks.TAMORINDRIC_SAPLING);
	public static final RegistryObject<Item> TAMORINDRIC_LEAVES = block(ReworldModBlocks.TAMORINDRIC_LEAVES);
	public static final RegistryObject<Item> TAMORINDRIC_WOOD = block(ReworldModBlocks.TAMORINDRIC_WOOD);
	public static final RegistryObject<Item> TAMORINDRIC_LOG = block(ReworldModBlocks.TAMORINDRIC_LOG);
	public static final RegistryObject<Item> TAMORINDRIC_PLANKS = block(ReworldModBlocks.TAMORINDRIC_PLANKS);
	public static final RegistryObject<Item> TAMORINDRIC_STAIRS = block(ReworldModBlocks.TAMORINDRIC_STAIRS);
	public static final RegistryObject<Item> TAMORINDRIC_SLAB = block(ReworldModBlocks.TAMORINDRIC_SLAB);
	public static final RegistryObject<Item> TAMORINDRIC_FENCE = block(ReworldModBlocks.TAMORINDRIC_FENCE);
	public static final RegistryObject<Item> TAMORINDRIC_FENCE_GATE = block(ReworldModBlocks.TAMORINDRIC_FENCE_GATE);
	public static final RegistryObject<Item> TAMORINDRIC_PRESSURE_PLATE = block(ReworldModBlocks.TAMORINDRIC_PRESSURE_PLATE);
	public static final RegistryObject<Item> TAMORINDRIC_BUTTON = block(ReworldModBlocks.TAMORINDRIC_BUTTON);
	public static final RegistryObject<Item> TAMORINDRIC_DOOR = doubleBlock(ReworldModBlocks.TAMORINDRIC_DOOR);
	public static final RegistryObject<Item> TAMORINDRIC_TRAPDOOR = block(ReworldModBlocks.TAMORINDRIC_TRAPDOOR);
	public static final RegistryObject<Item> TAMORINDRICVINE = block(ReworldModBlocks.TAMORINDRICVINE);
	public static final RegistryObject<Item> TAMORINDRICBLOOMINGVINE = block(ReworldModBlocks.TAMORINDRICBLOOMINGVINE);
	public static final RegistryObject<Item> ERITIERIC_SAPLING = block(ReworldModBlocks.ERITIERIC_SAPLING);
	public static final RegistryObject<Item> ERITIERIC_LEAVES = block(ReworldModBlocks.ERITIERIC_LEAVES);
	public static final RegistryObject<Item> ERITIERIC_WOOD = block(ReworldModBlocks.ERITIERIC_WOOD);
	public static final RegistryObject<Item> ERITIERIC_LOG = block(ReworldModBlocks.ERITIERIC_LOG);
	public static final RegistryObject<Item> ERITIERIC_PLANKS = block(ReworldModBlocks.ERITIERIC_PLANKS);
	public static final RegistryObject<Item> ERITIERIC_STAIRS = block(ReworldModBlocks.ERITIERIC_STAIRS);
	public static final RegistryObject<Item> ERITIERIC_SLAB = block(ReworldModBlocks.ERITIERIC_SLAB);
	public static final RegistryObject<Item> ERITIERIC_FENCE = block(ReworldModBlocks.ERITIERIC_FENCE);
	public static final RegistryObject<Item> ERITIERIC_FENCE_GATE = block(ReworldModBlocks.ERITIERIC_FENCE_GATE);
	public static final RegistryObject<Item> ERITIERIC_PRESSURE_PLATE = block(ReworldModBlocks.ERITIERIC_PRESSURE_PLATE);
	public static final RegistryObject<Item> ERITIERIC_BUTTON = block(ReworldModBlocks.ERITIERIC_BUTTON);
	public static final RegistryObject<Item> ERITIERIC_DOOR = doubleBlock(ReworldModBlocks.ERITIERIC_DOOR);
	public static final RegistryObject<Item> ERITIERIC_TRAPDOOR = block(ReworldModBlocks.ERITIERIC_TRAPDOOR);
	public static final RegistryObject<Item> SNOWY_SPRUCE_LEAVES = block(ReworldModBlocks.SNOWY_SPRUCE_LEAVES);
	public static final RegistryObject<Item> SNOWY_SPRUCE_SAPLING = block(ReworldModBlocks.SNOWY_SPRUCE_SAPLING);
	public static final RegistryObject<Item> FIBER_BLOCK = block(ReworldModBlocks.FIBER_BLOCK);
	public static final RegistryObject<Item> RAWFIBER = REGISTRY.register("rawfiber", () -> new RawfiberItem());
	public static final RegistryObject<Item> PURIFIEDFIBER = REGISTRY.register("purifiedfiber", () -> new PurifiedfiberItem());
	public static final RegistryObject<Item> EDIBLEROOTS = REGISTRY.register("edibleroots", () -> new EdiblerootsItem());
	public static final RegistryObject<Item> PEELEDEDIBLEROOT = REGISTRY.register("peelededibleroot", () -> new PeeledediblerootItem());
	public static final RegistryObject<Item> EDIBLEROOT = block(ReworldModBlocks.EDIBLEROOT);
	public static final RegistryObject<Item> MELOTHRIA_FOOD = REGISTRY.register("melothria_food", () -> new MelothriaFoodItem());
	public static final RegistryObject<Item> MELOTHRIA = block(ReworldModBlocks.MELOTHRIA);
	public static final RegistryObject<Item> CHUFA_FOOD = REGISTRY.register("chufa_food", () -> new ChufaFoodItem());
	public static final RegistryObject<Item> CHUFA = block(ReworldModBlocks.CHUFA);
	public static final RegistryObject<Item> PHYSALIS_FOOD = REGISTRY.register("physalis_food", () -> new PhysalisFoodItem());
	public static final RegistryObject<Item> PHYSALIS = block(ReworldModBlocks.PHYSALIS);
	public static final RegistryObject<Item> PITAYA_FRUIT = REGISTRY.register("pitaya_fruit", () -> new PitayaFruitItem());
	public static final RegistryObject<Item> PITAYA = block(ReworldModBlocks.PITAYA);
	public static final RegistryObject<Item> SANDROUSE = block(ReworldModBlocks.SANDROUSE);
	public static final RegistryObject<Item> ORANGE_ASTER = block(ReworldModBlocks.ORANGE_ASTER);
	public static final RegistryObject<Item> GREEN_ASTER = block(ReworldModBlocks.GREEN_ASTER);
	public static final RegistryObject<Item> CROCUS = block(ReworldModBlocks.CROCUS);
	public static final RegistryObject<Item> CHOCO = block(ReworldModBlocks.CHOCO);
	public static final RegistryObject<Item> FIBROUS_BUSH = block(ReworldModBlocks.FIBROUS_BUSH);
	public static final RegistryObject<Item> BRANCH_OF_BLACK_PEPPERS = REGISTRY.register("branch_of_black_peppers", () -> new BranchOfBlackPeppersItem());
	public static final RegistryObject<Item> BLACK_PEPPER = block(ReworldModBlocks.BLACK_PEPPER);
	public static final RegistryObject<Item> CLOVERS_GRASS = block(ReworldModBlocks.CLOVERS_GRASS);
	public static final RegistryObject<Item> HANGING_COCOA = block(ReworldModBlocks.HANGING_COCOA);
	public static final RegistryObject<Item> BLUE_POMEGRANATE = block(ReworldModBlocks.BLUE_POMEGRANATE);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_COBBLESTONE = block(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_COBBLESTONE_SLAB = block(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE_SLAB);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_COBBLESTONE_STAIRS = block(ReworldModBlocks.BLUE_POMEGRANATE_COBBLESTONE_STAIRS);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_BRICKS = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_MOSSY_BRICKS = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_BRICKS_SLAB = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS_SLAB);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_BRICKS_STAIRS = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_BRICKS_STAIRS);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_SLAB = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_SLAB);
	public static final RegistryObject<Item> BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_STAIRS = block(ReworldModBlocks.BLUE_POMEGRANATE_STONE_MOSSY_BRICKS_STAIRS);
	public static final RegistryObject<Item> BLUE_MOSSY_STONE = block(ReworldModBlocks.BLUE_MOSSY_STONE);
	public static final RegistryObject<Item> BLUE_MYCENAE_BLOCK = block(ReworldModBlocks.BLUE_MYCENAE_BLOCK);
	public static final RegistryObject<Item> BLUE_MYCENAE_HANGING = block(ReworldModBlocks.BLUE_MYCENAE_HANGING);
	public static final RegistryObject<Item> BLUE_MYCENAE_FOOD = REGISTRY.register("blue_mycenae_food", () -> new BlueMycenaeFoodItem());
	public static final RegistryObject<Item> LOOSE_CLAY = block(ReworldModBlocks.LOOSE_CLAY);
	public static final RegistryObject<Item> SNOWY_BLUE_ICE = block(ReworldModBlocks.SNOWY_BLUE_ICE);
	public static final RegistryObject<Item> BLOCK_SPAWN_ENT = block(ReworldModBlocks.BLOCK_SPAWN_ENT);
	public static final RegistryObject<Item> BLOCK_SPAWN_POMEGRANATE_GOLEM = block(ReworldModBlocks.BLOCK_SPAWN_POMEGRANATE_GOLEM);
	public static final RegistryObject<Item> BLOCK_ICY_CREATURE_SPAWN = block(ReworldModBlocks.BLOCK_ICY_CREATURE_SPAWN);
	public static final RegistryObject<Item> REDSTONE_PISTON_SPIKES = block(ReworldModBlocks.REDSTONE_PISTON_SPIKES);
	public static final RegistryObject<Item> REDSTONE_MINER = block(ReworldModBlocks.REDSTONE_MINER);
	public static final RegistryObject<Item> SPOILED_MUSHROOM_STEW = REGISTRY.register("spoiled_mushroom_stew", () -> new SpoiledMushroomStewItem());
	public static final RegistryObject<Item> MUSHROOM_ROTTEN_FLESH = REGISTRY.register("mushroom_rotten_flesh", () -> new MushroomRottenFleshItem());
	public static final RegistryObject<Item> APPLECIDER = REGISTRY.register("applecider", () -> new AppleciderItem());
	public static final RegistryObject<Item> CHORUSCIDER = REGISTRY.register("choruscider", () -> new ChorusciderItem());
	public static final RegistryObject<Item> BROKEN_TOTEMOF_UNDYING = REGISTRY.register("broken_totemof_undying", () -> new BrokenTotemofUndyingItem());
	public static final RegistryObject<Item> BUNDLE_OF_ARTIFACTS = REGISTRY.register("bundle_of_artifacts", () -> new BundleOfArtifactsItem());
	public static final RegistryObject<Item> BUNDLE_OF_AGRICULTURES = REGISTRY.register("bundle_of_agricultures", () -> new BundleOfAgriculturesItem());
	public static final RegistryObject<Item> HEART_OF_FOREST = REGISTRY.register("heart_of_forest", () -> new HeartOfForestItem());
	public static final RegistryObject<Item> HEART_OF_ICE = REGISTRY.register("heart_of_ice", () -> new HeartOfIceItem());
	public static final RegistryObject<Item> HEART_OF_MUSHROOMS = REGISTRY.register("heart_of_mushrooms", () -> new HeartOfMushroomsItem());
	public static final RegistryObject<Item> ICY_FUR = REGISTRY.register("icy_fur", () -> new IcyFurItem());
	public static final RegistryObject<Item> SNOWY_ICY_CREATURE_SPAWN_EGG = REGISTRY.register("snowy_icy_creature_spawn_egg", () -> new ForgeSpawnEggItem(ReworldModEntities.SNOWY_ICY_CREATURE, -10040065, -1, new Item.Properties()));
	public static final RegistryObject<Item> ENT_SPAWN_EGG = REGISTRY.register("ent_spawn_egg", () -> new ForgeSpawnEggItem(ReworldModEntities.ENT, -6737152, -13382656, new Item.Properties()));
	public static final RegistryObject<Item> ALIVE_SNOWY_ICE_SPAWN_EGG = REGISTRY.register("alive_snowy_ice_spawn_egg", () -> new ForgeSpawnEggItem(ReworldModEntities.ALIVE_SNOWY_ICE, -6710785, -3355393, new Item.Properties()));
	public static final RegistryObject<Item> WHITE_BELLIED_MINAGO_BIRD_SPAWN_EGG = REGISTRY.register("white_bellied_minago_bird_spawn_egg",
			() -> new ForgeSpawnEggItem(ReworldModEntities.WHITE_BELLIED_MINAGO_BIRD, -4225630, -13108, new Item.Properties()));
	public static final RegistryObject<Item> TAMORINDIC_LUNA_BUTTERFLY_SPAWN_EGG = REGISTRY.register("tamorindic_luna_butterfly_spawn_egg",
			() -> new ForgeSpawnEggItem(ReworldModEntities.TAMORINDIC_LUNA_BUTTERFLY, -3368704, -6697984, new Item.Properties()));
	public static final RegistryObject<Item> ALIVE_BLUE_POMEGRANATE_STONE_SPAWN_EGG = REGISTRY.register("alive_blue_pomegranate_stone_spawn_egg",
			() -> new ForgeSpawnEggItem(ReworldModEntities.ALIVE_BLUE_POMEGRANATE_STONE, -13382401, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> BIG_INCENSE_BURNER_SPAWN_EGG = REGISTRY.register("big_incense_burner_spawn_egg", () -> new ForgeSpawnEggItem(ReworldModEntities.BIG_INCENSE_BURNER, -8143057, -14267362, new Item.Properties()));
	public static final RegistryObject<Item> MYCENAE_MORPHO_SPAWN_EGG = REGISTRY.register("mycenae_morpho_spawn_egg", () -> new ForgeSpawnEggItem(ReworldModEntities.MYCENAE_MORPHO, -14737601, -12474664, new Item.Properties()));
	public static final RegistryObject<Item> POMEGRANATE_STONE_GOLEM_SPAWN_EGG = REGISTRY.register("pomegranate_stone_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(ReworldModEntities.POMEGRANATE_STONE_GOLEM, -16724788, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> REWORLDIKON = REGISTRY.register("reworldikon", () -> new ReworldikonItem());
	public static final RegistryObject<Item> TRAP_BLUE_POMEGRANTE_PLATE = block(ReworldModBlocks.TRAP_BLUE_POMEGRANTE_PLATE);
	public static final RegistryObject<Item> TRAP_MOSSY_BLUE_POMEGRANATE_PLATE = block(ReworldModBlocks.TRAP_MOSSY_BLUE_POMEGRANATE_PLATE);
	public static final RegistryObject<Item> BLUE_MYCENAE = block(ReworldModBlocks.BLUE_MYCENAE);
	public static final RegistryObject<Item> BLACK_PEPPER_BUSH = block(ReworldModBlocks.BLACK_PEPPER_BUSH);
	public static final RegistryObject<Item> FREEZING_SKEWER_RANGED_ITEM = REGISTRY.register("freezing_skewer_ranged_item", () -> new FreezingSkewerRangedItemItem());
	public static final RegistryObject<Item> REDSTONE_PISTON_SPIKES_ACTIVATED = block(ReworldModBlocks.REDSTONE_PISTON_SPIKES_ACTIVATED);
	public static final RegistryObject<Item> GROWN_PITAYA = block(ReworldModBlocks.GROWN_PITAYA);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
