
package net.mcreator.reworld.entity;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.procedures.SnowyIcyCreatureOnEntityTickUpdateProcedure;
import net.mcreator.reworld.procedures.SnowyIcyCreatureEntityIsHurtProcedure;
import net.mcreator.reworld.init.ReworldModEntities;

public class SnowyIcyCreatureEntity extends Monster implements RangedAttackMob {
	public AnimationState attackAnimationState = new AnimationState();
	public AnimationState attackAnimationState1 = new AnimationState();
	public final AnimationState walkAnimationState = new AnimationState();
	public final AnimationState idleAnimationState = new AnimationState();
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.WHITE, ServerBossEvent.BossBarOverlay.NOTCHED_6);

	public SnowyIcyCreatureEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ReworldModEntities.SNOWY_ICY_CREATURE.get(), world);
	}

	public SnowyIcyCreatureEntity(EntityType<SnowyIcyCreatureEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.75f;
		xpReward = 15;
		setNoAi(false);
		setCustomName(Component.literal("Snowy Icy Creature"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	private boolean isMovingOnLand() {
		return this.onGround && this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D;
	}

	public void tick() {
		if (this.level.isClientSide()) {
			if (this.isMovingOnLand()) {
				this.walkAnimationState.startIfStopped(this.tickCount);
				this.idleAnimationState.stop();
			} else {
				this.walkAnimationState.stop();
				this.idleAnimationState.startIfStopped(this.tickCount);
			}
		}
		super.tick();
	}

	public void handleEntityEvent(byte p_219360_) {
		if (p_219360_ >= 4 && p_219360_ <= 20) {
			this.attackAnimationState1.start(this.tickCount);
		} else {
			super.handleEntityEvent(p_219360_);
		}
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth() + 2.0D;
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.75));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
		this.goalSelector.addGoal(7,new SnowyIcyCreatureEntity.IcySphereShoot(this));
	}
	class IcySphereShoot extends Goal {
		private final SnowyIcyCreatureEntity creature;
		private int attackTime = 0;
		float f1 = Mth.clamp(0.15F, 0.1F, 1.0F);

		public IcySphereShoot(SnowyIcyCreatureEntity p_32776_) {
			this.creature = p_32776_;
		}

		public boolean canUse() {
			return this.creature.getTarget() != null;
		}

		public void start() {
			attackTime = 20;
		}

		public void stop() {
			attackAnimationState.stop();
			this.attackTime = -1;
		}

		public boolean requiresUpdateEveryTick() {
			return true;
		}

		public void tick() {
			LivingEntity livingentity = this.creature.getTarget();
			if (livingentity != null) {
				if (livingentity.distanceToSqr(this.creature) < 4096.0D && this.creature.hasLineOfSight(livingentity)) {
					if (attackTime == 60) {
						attackTime = 0;
						attackAnimationState.start(tickCount);
						this.creature.performRangedAttack(livingentity, f1);
					} else if (attackTime < 60)
						attackTime++;
					this.creature.getNavigation().stop();
				} else {
					this.creature.getNavigation().moveTo(livingentity, 0.5);
					stop();
				}
			}
		}
	}


	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}


	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		SnowyIcyCreatureEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source.is(DamageTypes.CACTUS))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		SnowyIcyCreatureOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 180);
		builder = builder.add(Attributes.ARMOR, 8);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 24);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
		return builder;
	}

	@Override
	public void performRangedAttack(LivingEntity p_33317_, float p_33318_) {
		FreezingSkewerRangedItemEntity.shoot(this, p_33317_);
	}
}
