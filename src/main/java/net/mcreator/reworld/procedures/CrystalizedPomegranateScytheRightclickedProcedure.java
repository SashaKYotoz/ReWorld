package net.mcreator.reworld.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CrystalizedPomegranateScytheRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("CustomModelData") == 0) {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 1);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("item.reworld.crystalized_pomegranate_scythe.push_attack_mode").getString())), true);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
		} else if (itemstack.getOrCreateTag().getDouble("CustomModelData") == 1) {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 0);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("item.reworld.crystalized_pomegranate_scythe.all_direction_attack_mode").getString())), true);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
		}
	}
}
