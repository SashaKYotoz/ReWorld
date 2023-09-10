
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.reworld.world.features.plants.TamorindicSaplingFeature;
import net.mcreator.reworld.world.features.plants.SnowySpruceSaplingFeature;
import net.mcreator.reworld.world.features.plants.SandrouseFeature;
import net.mcreator.reworld.world.features.plants.PitayaFeature;
import net.mcreator.reworld.world.features.plants.GrownPitayaFeature;
import net.mcreator.reworld.world.features.plants.FibrousBushFeature;
import net.mcreator.reworld.world.features.plants.EritiericSaplingFeature;
import net.mcreator.reworld.world.features.plants.CloversGrassFeature;
import net.mcreator.reworld.world.features.plants.BlueMycenaeFeature;
import net.mcreator.reworld.world.features.plants.BlackPepperFeature;
import net.mcreator.reworld.world.features.plants.BlackPepperBushFeature;
import net.mcreator.reworld.world.features.ores.SnowyBlueIceFeature;
import net.mcreator.reworld.world.features.ores.LooseClayFeature;
import net.mcreator.reworld.world.features.ores.BluePomegranateFeature;
import net.mcreator.reworld.world.features.ores.BlueMycenaeHangingFeature;
import net.mcreator.reworld.world.features.ores.BlueMossyStoneFeature;
import net.mcreator.reworld.world.features.WillowTreeFeature;
import net.mcreator.reworld.world.features.WildBloomingJungleTreesFeature;
import net.mcreator.reworld.world.features.WildBloomingJungleFlowersFeature;
import net.mcreator.reworld.world.features.VikingVillagerHouseFeature;
import net.mcreator.reworld.world.features.SmallredMushroomFeature;
import net.mcreator.reworld.world.features.SmallTamorindicTreeFeature;
import net.mcreator.reworld.world.features.SmallMushroomFeature;
import net.mcreator.reworld.world.features.SmallBlueMycenaeCaveFeature;
import net.mcreator.reworld.world.features.PomegranateGolemDungeonFeature;
import net.mcreator.reworld.world.features.PalmTreeFeature;
import net.mcreator.reworld.world.features.MycenaeMushroomsFeature;
import net.mcreator.reworld.world.features.MycenaeDeltasFeature;
import net.mcreator.reworld.world.features.MycenaeBlobsFeature;
import net.mcreator.reworld.world.features.JungleRuinsVariant2Feature;
import net.mcreator.reworld.world.features.JungleRuinsFeature;
import net.mcreator.reworld.world.features.JunglePyramidFeature;
import net.mcreator.reworld.world.features.IcyCreatureTowerFeature;
import net.mcreator.reworld.world.features.EritierictreeFeature;
import net.mcreator.reworld.world.features.EntTreeFeature;
import net.mcreator.reworld.world.features.BluePomegranateCastleFeature;
import net.mcreator.reworld.world.features.BlueMycenaeMushroomFeature;
import net.mcreator.reworld.world.features.BlueMycenaeMushroom1Feature;
import net.mcreator.reworld.world.features.BlueMycenaeCaveFeature;
import net.mcreator.reworld.world.features.BigRedMushroomFeature;
import net.mcreator.reworld.world.features.BigMushroomFeature;
import net.mcreator.reworld.world.features.BigBirchTreeFeature;
import net.mcreator.reworld.ReworldMod;

@Mod.EventBusSubscriber
public class ReworldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ReworldMod.MODID);
	public static final RegistryObject<Feature<?>> TAMORINDRIC_SAPLING = REGISTRY.register("tamorindric_sapling", TamorindicSaplingFeature::new);
	public static final RegistryObject<Feature<?>> ERITIERIC_SAPLING = REGISTRY.register("eritieric_sapling", EritiericSaplingFeature::new);
	public static final RegistryObject<Feature<?>> SNOWY_SPRUCE_SAPLING = REGISTRY.register("snowy_spruce_sapling", SnowySpruceSaplingFeature::new);
	public static final RegistryObject<Feature<?>> PITAYA = REGISTRY.register("pitaya", PitayaFeature::new);
	public static final RegistryObject<Feature<?>> SANDROUSE = REGISTRY.register("sandrouse", SandrouseFeature::new);
	public static final RegistryObject<Feature<?>> FIBROUS_BUSH = REGISTRY.register("fibrous_bush", FibrousBushFeature::new);
	public static final RegistryObject<Feature<?>> BLACK_PEPPER = REGISTRY.register("black_pepper", BlackPepperFeature::new);
	public static final RegistryObject<Feature<?>> CLOVERS_GRASS = REGISTRY.register("clovers_grass", CloversGrassFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_POMEGRANATE = REGISTRY.register("blue_pomegranate", BluePomegranateFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MOSSY_STONE = REGISTRY.register("blue_mossy_stone", BlueMossyStoneFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MYCENAE_HANGING = REGISTRY.register("blue_mycenae_hanging", BlueMycenaeHangingFeature::new);
	public static final RegistryObject<Feature<?>> LOOSE_CLAY = REGISTRY.register("loose_clay", LooseClayFeature::new);
	public static final RegistryObject<Feature<?>> SNOWY_BLUE_ICE = REGISTRY.register("snowy_blue_ice", SnowyBlueIceFeature::new);
	public static final RegistryObject<Feature<?>> BIG_BIRCH_TREE = REGISTRY.register("big_birch_tree", BigBirchTreeFeature::new);
	public static final RegistryObject<Feature<?>> WILLOW_TREE = REGISTRY.register("willow_tree", WillowTreeFeature::new);
	public static final RegistryObject<Feature<?>> PALM_TREE = REGISTRY.register("palm_tree", PalmTreeFeature::new);
	public static final RegistryObject<Feature<?>> JUNGLE_PYRAMID = REGISTRY.register("jungle_pyramid", JunglePyramidFeature::new);
	public static final RegistryObject<Feature<?>> JUNGLE_RUINS = REGISTRY.register("jungle_ruins", JungleRuinsFeature::new);
	public static final RegistryObject<Feature<?>> JUNGLE_RUINS_VARIANT_2 = REGISTRY.register("jungle_ruins_variant_2", JungleRuinsVariant2Feature::new);
	public static final RegistryObject<Feature<?>> VIKING_VILLAGER_HOUSE = REGISTRY.register("viking_villager_house", VikingVillagerHouseFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_MUSHROOM = REGISTRY.register("small_mushroom", SmallMushroomFeature::new);
	public static final RegistryObject<Feature<?>> SMALLRED_MUSHROOM = REGISTRY.register("smallred_mushroom", SmallredMushroomFeature::new);
	public static final RegistryObject<Feature<?>> BIG_MUSHROOM = REGISTRY.register("big_mushroom", BigMushroomFeature::new);
	public static final RegistryObject<Feature<?>> BIG_RED_MUSHROOM = REGISTRY.register("big_red_mushroom", BigRedMushroomFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MYCENAE = REGISTRY.register("blue_mycenae", BlueMycenaeFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MYCENAE_CAVE = REGISTRY.register("blue_mycenae_cave", BlueMycenaeCaveFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_BLUE_MYCENAE_CAVE = REGISTRY.register("small_blue_mycenae_cave", SmallBlueMycenaeCaveFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_TAMORINDIC_TREE = REGISTRY.register("small_tamorindic_tree", SmallTamorindicTreeFeature::new);
	public static final RegistryObject<Feature<?>> ERITIERICTREE = REGISTRY.register("eritierictree", EritierictreeFeature::new);
	public static final RegistryObject<Feature<?>> BLACK_PEPPER_BUSH = REGISTRY.register("black_pepper_bush", BlackPepperBushFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MYCENAE_MUSHROOM = REGISTRY.register("blue_mycenae_mushroom", BlueMycenaeMushroomFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_MYCENAE_MUSHROOM_1 = REGISTRY.register("blue_mycenae_mushroom_1", BlueMycenaeMushroom1Feature::new);
	public static final RegistryObject<Feature<?>> BLUE_POMEGRANATE_CASTLE = REGISTRY.register("blue_pomegranate_castle", BluePomegranateCastleFeature::new);
	public static final RegistryObject<Feature<?>> ENT_TREE = REGISTRY.register("ent_tree", EntTreeFeature::new);
	public static final RegistryObject<Feature<?>> ICY_CREATURE_TOWER = REGISTRY.register("icy_creature_tower", IcyCreatureTowerFeature::new);
	public static final RegistryObject<Feature<?>> POMEGRANATE_GOLEM_DUNGEON = REGISTRY.register("pomegranate_golem_dungeon", PomegranateGolemDungeonFeature::new);
	public static final RegistryObject<Feature<?>> GROWN_PITAYA = REGISTRY.register("grown_pitaya", GrownPitayaFeature::new);
	public static final RegistryObject<Feature<?>> MYCENAE_DELTAS = REGISTRY.register("mycenae_deltas", MycenaeDeltasFeature::new);
	public static final RegistryObject<Feature<?>> MYCENAE_MUSHROOMS = REGISTRY.register("mycenae_mushrooms", MycenaeMushroomsFeature::new);
	public static final RegistryObject<Feature<?>> MYCENAE_BLOBS = REGISTRY.register("mycenae_blobs", MycenaeBlobsFeature::new);
	public static final RegistryObject<Feature<?>> WILD_BLOOMING_JUNGLE_TREES = REGISTRY.register("wild_blooming_jungle_trees", WildBloomingJungleTreesFeature::new);
	public static final RegistryObject<Feature<?>> WILD_BLOOMING_JUNGLE_FLOWERS = REGISTRY.register("wild_blooming_jungle_flowers", WildBloomingJungleFlowersFeature::new);
}
