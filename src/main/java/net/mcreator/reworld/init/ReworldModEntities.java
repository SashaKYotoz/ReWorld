
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.reworld.entity.WhiteBelliedMinagoBirdEntity;
import net.mcreator.reworld.entity.TamorindicLunaButterflyEntity;
import net.mcreator.reworld.entity.SnowyIcyCreatureEntity;
import net.mcreator.reworld.entity.PomegranateStoneGolemEntity;
import net.mcreator.reworld.entity.PoisonedBlueMycenaeEntity;
import net.mcreator.reworld.entity.MycenaeMorphoEntity;
import net.mcreator.reworld.entity.FreezingSkewerRangedItemEntity;
import net.mcreator.reworld.entity.ForestbowEntity;
import net.mcreator.reworld.entity.EntEntity;
import net.mcreator.reworld.entity.BigIncenseBurnerEntity;
import net.mcreator.reworld.entity.AliveSnowyIceEntity;
import net.mcreator.reworld.entity.AliveBluePomegranateStoneEntity;
import net.mcreator.reworld.ReworldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReworldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ReworldMod.MODID);
	public static final RegistryObject<EntityType<ForestbowEntity>> FORESTBOW = register("projectile_forestbow",
			EntityType.Builder.<ForestbowEntity>of(ForestbowEntity::new, MobCategory.MISC).setCustomClientFactory(ForestbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnowyIcyCreatureEntity>> SNOWY_ICY_CREATURE = register("snowy_icy_creature",
			EntityType.Builder.<SnowyIcyCreatureEntity>of(SnowyIcyCreatureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowyIcyCreatureEntity::new)

					.sized(1f, 3f));
	public static final RegistryObject<EntityType<EntEntity>> ENT = register("ent",
			EntityType.Builder.<EntEntity>of(EntEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EntEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<AliveSnowyIceEntity>> ALIVE_SNOWY_ICE = register("alive_snowy_ice",
			EntityType.Builder.<AliveSnowyIceEntity>of(AliveSnowyIceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AliveSnowyIceEntity::new)

					.sized(0.9f, 1f));
	public static final RegistryObject<EntityType<WhiteBelliedMinagoBirdEntity>> WHITE_BELLIED_MINAGO_BIRD = register("white_bellied_minago_bird",
			EntityType.Builder.<WhiteBelliedMinagoBirdEntity>of(WhiteBelliedMinagoBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(WhiteBelliedMinagoBirdEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<TamorindicLunaButterflyEntity>> TAMORINDIC_LUNA_BUTTERFLY = register("tamorindic_luna_butterfly",
			EntityType.Builder.<TamorindicLunaButterflyEntity>of(TamorindicLunaButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(TamorindicLunaButterflyEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AliveBluePomegranateStoneEntity>> ALIVE_BLUE_POMEGRANATE_STONE = register("alive_blue_pomegranate_stone",
			EntityType.Builder.<AliveBluePomegranateStoneEntity>of(AliveBluePomegranateStoneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AliveBluePomegranateStoneEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<PoisonedBlueMycenaeEntity>> POISONED_BLUE_MYCENAE = register("poisoned_blue_mycenae",
			EntityType.Builder.<PoisonedBlueMycenaeEntity>of(PoisonedBlueMycenaeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonedBlueMycenaeEntity::new)

					.sized(0.5f, 0.6f));
	public static final RegistryObject<EntityType<BigIncenseBurnerEntity>> BIG_INCENSE_BURNER = register("big_incense_burner",
			EntityType.Builder.<BigIncenseBurnerEntity>of(BigIncenseBurnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigIncenseBurnerEntity::new)

					.sized(1.2f, 1.5f));
	public static final RegistryObject<EntityType<MycenaeMorphoEntity>> MYCENAE_MORPHO = register("mycenae_morpho",
			EntityType.Builder.<MycenaeMorphoEntity>of(MycenaeMorphoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MycenaeMorphoEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PomegranateStoneGolemEntity>> POMEGRANATE_STONE_GOLEM = register("pomegranate_stone_golem", EntityType.Builder.<PomegranateStoneGolemEntity>of(PomegranateStoneGolemEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PomegranateStoneGolemEntity::new).fireImmune().sized(1.2f, 1.8f));
	public static final RegistryObject<EntityType<FreezingSkewerRangedItemEntity>> FREEZING_SKEWER_RANGED_ITEM = register("projectile_freezing_skewer_ranged_item",
			EntityType.Builder.<FreezingSkewerRangedItemEntity>of(FreezingSkewerRangedItemEntity::new, MobCategory.MISC).setCustomClientFactory(FreezingSkewerRangedItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SnowyIcyCreatureEntity.init();
			EntEntity.init();
			AliveSnowyIceEntity.init();
			WhiteBelliedMinagoBirdEntity.init();
			TamorindicLunaButterflyEntity.init();
			AliveBluePomegranateStoneEntity.init();
			PoisonedBlueMycenaeEntity.init();
			BigIncenseBurnerEntity.init();
			MycenaeMorphoEntity.init();
			PomegranateStoneGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SNOWY_ICY_CREATURE.get(), SnowyIcyCreatureEntity.createAttributes().build());
		event.put(ENT.get(), EntEntity.createAttributes().build());
		event.put(ALIVE_SNOWY_ICE.get(), AliveSnowyIceEntity.createAttributes().build());
		event.put(WHITE_BELLIED_MINAGO_BIRD.get(), WhiteBelliedMinagoBirdEntity.createAttributes().build());
		event.put(TAMORINDIC_LUNA_BUTTERFLY.get(), TamorindicLunaButterflyEntity.createAttributes().build());
		event.put(ALIVE_BLUE_POMEGRANATE_STONE.get(), AliveBluePomegranateStoneEntity.createAttributes().build());
		event.put(POISONED_BLUE_MYCENAE.get(), PoisonedBlueMycenaeEntity.createAttributes().build());
		event.put(BIG_INCENSE_BURNER.get(), BigIncenseBurnerEntity.createAttributes().build());
		event.put(MYCENAE_MORPHO.get(), MycenaeMorphoEntity.createAttributes().build());
		event.put(POMEGRANATE_STONE_GOLEM.get(), PomegranateStoneGolemEntity.createAttributes().build());
	}
}
