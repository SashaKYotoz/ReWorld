
package net.mcreator.reworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.reworld.procedures.FreezingSkewerRightclickedProcedure;
import net.mcreator.reworld.procedures.FreezingSkewerLivingEntityIsHitWithToolProcedure;
import net.mcreator.reworld.init.ReworldModBlocks;

public class FreezingSkewerItem extends SwordItem {
	public FreezingSkewerItem() {
		super(new Tier() {
			public int getUses() {
				return 652;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReworldModBlocks.SNOWY_BLUE_ICE.get()));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FreezingSkewerLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FreezingSkewerRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
