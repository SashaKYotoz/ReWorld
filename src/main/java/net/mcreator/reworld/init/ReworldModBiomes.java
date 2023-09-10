
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class ReworldModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.25f, 0.8735f), Climate.Parameter.span(0.16f, 1.22f), Climate.Parameter.span(-0.18f, 0.88f), Climate.Parameter.span(-0.375f, 1.44f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.0359525193f, 0.2440474807f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "tamorindric_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.25f, 0.8735f), Climate.Parameter.span(0.16f, 1.22f), Climate.Parameter.span(-0.18f, 0.88f), Climate.Parameter.span(-0.375f, 1.44f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.0359525193f, 0.2440474807f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "tamorindric_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.95f, -0.35f), Climate.Parameter.span(-0.9f, -0.275f), Climate.Parameter.span(0.35f, 1.2f), Climate.Parameter.span(-0.72f, 0.8f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.028f, -0.3820123054f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "frosty_slippery_valley")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.95f, -0.35f), Climate.Parameter.span(-0.9f, -0.275f), Climate.Parameter.span(0.35f, 1.2f), Climate.Parameter.span(-0.72f, 0.8f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.028f, -0.3820123054f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "frosty_slippery_valley")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.35f, 0.45f), Climate.Parameter.span(0.26f, 1.24f), Climate.Parameter.span(0.31f, 0.8f), Climate.Parameter.span(0.46f, 0.94f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.0974708609f, -0.6174708609f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "mycenae_cavern")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.35f, 0.45f), Climate.Parameter.span(0.26f, 1.24f), Climate.Parameter.span(0.31f, 0.8f), Climate.Parameter.span(0.46f, 0.94f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.0974708609f, -0.6174708609f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "mycenae_cavern")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5998f, 1.2f), Climate.Parameter.span(0.4f, 1.1f), Climate.Parameter.span(-0.15f, 0.65f), Climate.Parameter.span(-0.225f, 0.725f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.525f, 0.595f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "wild_blooming_jungle")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5998f, 1.2f), Climate.Parameter.span(0.4f, 1.1f), Climate.Parameter.span(-0.15f, 0.65f), Climate.Parameter.span(-0.225f, 0.725f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.525f, 0.595f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "wild_blooming_jungle")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.35f, 0.45f), Climate.Parameter.span(0.26f, 1.24f), Climate.Parameter.span(0.31f, 0.8f), Climate.Parameter.span(0.46f, 0.94f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1.0974708609f, -0.6174708609f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "mycenae_cavern")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "mycenae_cavern")), ReworldModBlocks.BLUE_MOSSY_STONE.get().defaultBlockState(),
								ReworldModBlocks.BLUE_POMEGRANATE.get().defaultBlockState(), ReworldModBlocks.BLUE_POMEGRANATE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "tamorindric_forest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState(),
								Blocks.CLAY.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "frosty_slippery_valley")), Blocks.SNOW_BLOCK.defaultBlockState(), Blocks.ICE.defaultBlockState(),
								Blocks.ICE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "mycenae_cavern")), ReworldModBlocks.BLUE_MOSSY_STONE.get().defaultBlockState(),
								ReworldModBlocks.BLUE_POMEGRANATE.get().defaultBlockState(), ReworldModBlocks.BLUE_POMEGRANATE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("reworld", "wild_blooming_jungle")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.CLAY.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
