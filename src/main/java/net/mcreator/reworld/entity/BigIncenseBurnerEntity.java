
package net.mcreator.reworld.entity;

import net.mcreator.reworld.init.ReworldModEntities;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public class BigIncenseBurnerEntity extends Monster {
	public AnimationState attackAnimationState = new AnimationState();
	public AnimationState attackRedHeadState = new AnimationState();
	public AnimationState attackPurpleHeadState = new AnimationState();
	public AnimationState attackOrangeHeadState = new AnimationState();
	public final AnimationState idleAnimationState = new AnimationState();
	public final AnimationState deathAnimationState = new AnimationState();
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.GREEN, ServerBossEvent.BossBarOverlay.PROGRESS);

	public BigIncenseBurnerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ReworldModEntities.BIG_INCENSE_BURNER.get(), world);
	}

	public void handleEntityEvent(byte p_219360_) {
		if (p_219360_ >= 4 && p_219360_ <= 24) {
			if (Math.random() > 0 && Math.random() < 0.25) {
				this.attackPurpleHeadState.start(this.tickCount);
				LivingEntity target = this.getTarget();
				Vec3 vec3 = (new Vec3(this.getX() - target.getX(), this.getY() - target.getY(), this.getZ() - target.getZ())).scale(0.1D);
				target.setDeltaMovement(target.getDeltaMovement().add(vec3));
			} else if(Math.random() > 0.25 && Math.random() < 0.5)
				this.attackAnimationState.start(this.tickCount);
			else if (Math.random() > 0.5 && Math.random() < 0.75)
				this.attackRedHeadState.start(this.tickCount);
			else
				this.attackOrangeHeadState.start(this.tickCount);
		}
			else {
			super.handleEntityEvent(p_219360_);
		}
	}
	protected void tickDeath() {
		if(!this.deathAnimationState.isStarted())
			this.deathAnimationState.start(this.tickCount);
		super.tickDeath();
	}

	@Override
	public void die(DamageSource source) {
		this.deathTime = -40;
		super.die(source);
	}
	@Override
	public boolean doHurtTarget(Entity p_34491_) {
		if (!(p_34491_ instanceof LivingEntity)) {
			return false;
		} else {
			this.level.broadcastEntityEvent(this, (byte) 4);
			this.playSound(SoundEvents.FLOWERING_AZALEA_BREAK, 1.0F, this.getVoicePitch());
			return BigIncenseBurnerEntity.hurtTarget(this, (LivingEntity) p_34491_);
		}
	}
	static boolean hurtTarget(LivingEntity p_34643_, LivingEntity p_34644_) {
		float f = (float) p_34643_.getAttributeValue(Attributes.ATTACK_DAMAGE);
		return p_34644_.hurt(p_34643_.damageSources().mobAttack(p_34643_), f);
	}

	@Override
	public void tick() {
		if(!this.attackAnimationState.isStarted())
			this.idleAnimationState.startIfStopped(this.tickCount);
		else
			this.idleAnimationState.stop();
		super.tick();
	}
	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(@NotNull Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public BigIncenseBurnerEntity(EntityType<BigIncenseBurnerEntity> type, Level world) {
		super(type, world);
		xpReward = 15;
		setNoAi(false);
		setCustomName(Component.literal("Big Incense Burner"));
		setCustomNameVisible(true);
		setPersistenceRequired();
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
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth() + 3D;
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
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
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source.is(DamageTypes.CACTUS))
			return false;
		if (source.is(DamageTypes.DROWN))
			return false;
		if (source.is(DamageTypes.DRAGON_BREATH))
			return false;
		return super.hurt(source, amount);
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 120);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		return builder;
	}
}
