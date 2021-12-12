package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;


public class NightSoulsBow extends NightSoulsBaseBow{

	public NightSoulsBow(Properties builder) {
		super(builder);
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
    
	tooltip.set(0, new StringTextComponent("§5"+tooltip.get(0).getString()+"§r"));				
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }

	    @Override
	    protected double getArrowDamage(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, bowStack);

	        return (double)powerLevel * 0.90D + 6.0D;
	    }
	    
	    @Override
	    protected int getArrowKnockback(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, bowStack);
	    	
	    	return knockbackLevel + 1;
	    }
	    

		@Override
		public int getItemEnchantability() {
		    		
		    return 33;
		}

		@Override
		public boolean isRepairable(ItemStack stack) {
		    		
		    return true;
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		    			
		   return repair.getItem() == ItemInit.NIGHTSOULS_ESSENCE.get();
		   
		 } 
		    
}
		   
