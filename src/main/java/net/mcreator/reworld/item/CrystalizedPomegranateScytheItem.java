
package net.mcreator.reworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.reworld.procedures.CrystalizedPomegranateScytheRightclickedProcedure;
import net.mcreator.reworld.procedures.CrystalizedPomegranateScytheLivingEntityIsHitWithToolProcedure;
import net.mcreator.reworld.init.ReworldModItems;

public class CrystalizedPomegranateScytheItem extends SwordItem {
	public CrystalizedPomegranateScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 761;
			}

			public float getSpeed() {
				return 7.5f;
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
				return Ingredient.of(new ItemStack(ReworldModItems.HEART_OF_MUSHROOMS.get()), new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.6f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CrystalizedPomegranateScytheLivingEntityIsHitWithToolProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CrystalizedPomegranateScytheRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
