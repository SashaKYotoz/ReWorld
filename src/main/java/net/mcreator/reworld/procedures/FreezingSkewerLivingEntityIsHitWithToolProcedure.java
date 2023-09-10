package net.mcreator.reworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class FreezingSkewerLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		if (itemstack.getOrCreateTag().getDouble("CustomModelData") >= 3) {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 0);
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
		} else {
			if (itemstack.getOrCreateTag().getDouble("CustomModelData") >= 2) {
				speed = 1;
				Yaw = entity.getYRot();
				entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), (Mth.nextDouble(RandomSource.create(), 0.5, 1)), (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
			}
			itemstack.getOrCreateTag().putDouble("CustomModelData", (itemstack.getOrCreateTag().getDouble("CustomModelData") + 1));
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
		}
	}
}
