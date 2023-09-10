package net.mcreator.reworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModItems;
import net.mcreator.reworld.init.ReworldModBlocks;

public class BlueMycenaeBlockAddProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ReworldModBlocks.BLUE_MOSSY_STONE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ReworldModBlocks.BLUE_POMEGRANATE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MYCELIUM)
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y + 1, z), ReworldModBlocks.BLUE_MYCENAE.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ReworldModItems.BLUE_MYCENAE_FOOD.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
