package net.mcreator.reworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModItems;
import net.mcreator.reworld.init.ReworldModEntities;
import net.mcreator.reworld.entity.ForestbowEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ArmorAbilitiesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double enemyX = 0;
		double enemyZ = 0;
		BlockState currectblock = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ReworldModItems.FURRED_ICY_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ReworldModItems.FURRED_ICY_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ReworldModItems.FURRED_ICY_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ReworldModItems.FURRED_ICY_BOOTS.get()) {
			loop = 0;
			particleAmount = 9;
			xRadius = 1.25;
			zRadius = 1.25;
			while (loop < particleAmount) {
				world.addParticle(ParticleTypes.SNOWFLAKE, (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.1, 0);
				loop = loop + 1;
			}
			if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2));
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ReworldModItems.FIBERY_HEARTED_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ReworldModItems.FIBERY_HEARTED_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ReworldModItems.FIBERY_HEARTED_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ReworldModItems.FIBERY_HEARTED_BOOTS.get()) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ForestbowEntity(ReworldModEntities.FORESTBOW.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 0.5, 1, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ForestbowEntity(ReworldModEntities.FORESTBOW.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((-1), 0.5, 1, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ForestbowEntity(ReworldModEntities.FORESTBOW.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 0.5, (-1), 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ForestbowEntity(ReworldModEntities.FORESTBOW.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((-1), 0.5, (-1), 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ReworldModItems.POMEGRANATE_PRISMARINE_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ReworldModItems.POMEGRANATE_PRISMARINE_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ReworldModItems.POMEGRANATE_PRISMARINE_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ReworldModItems.POMEGRANATE_PRISMARINE_BOOTS.get()) {
			sourceentity.setDeltaMovement(new Vec3(0, 1, 0));
			enemyX = sourceentity.getX();
			enemyZ = sourceentity.getZ();
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK) || !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_PORTAL_FRAME)) {
				currectblock = (world.getBlockState(BlockPos.containing(enemyX, y - 1, enemyZ)));
				world.setBlock(BlockPos.containing(enemyX, y - 1, enemyZ), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, BlockPos.containing(enemyX, y + 2, enemyZ), currectblock);
			}
		}
	}
}
