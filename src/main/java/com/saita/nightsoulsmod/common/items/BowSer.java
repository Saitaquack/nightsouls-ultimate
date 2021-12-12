package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BowSer extends BowSerBaseBow {

	public BowSer(Properties builder) {
		super(builder);
	}

	    @Override
	    protected double getArrowDamage(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, bowStack);

	        return (double)powerLevel * 1.5D + 12.5D;
	    }
	    
	    @Override
	    protected int getArrowKnockback(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, bowStack);
	    	
	    	return knockbackLevel + 2;
	    }
	    

		@Override
		public int getItemEnchantability() {
		    		
		    return 30;
		}

		@Override
		public boolean isRepairable(ItemStack stack) {
		    		
		    return true;
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		    			
		   return repair.getItem() == ItemInit.TRUE_NIGHT_SOUL.get();
		   
		} 
		
		@Override
		public boolean hasEffect(ItemStack stack) {
		
			return true;
		}
		
		@Override
		public Rarity getRarity(ItemStack stack) {
			
			return Rarity.EPIC;
		}
		
		@Override
	    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	    {

		tooltip.set(0, new StringTextComponent("§c"+tooltip.get(0).getString()+"§r"));
	    tooltip.add(new StringTextComponent("§7BWA HA HA HA HA HA !"));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	    }  		
		
}
