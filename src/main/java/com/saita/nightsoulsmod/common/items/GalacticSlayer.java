package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class GalacticSlayer extends SwordItem {

	public GalacticSlayer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

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

	tooltip.set(0, new StringTextComponent("�1"+tooltip.get(0).getString()+"�r"));
    tooltip.add(new StringTextComponent("�7The strongest blade in the cosmos, created by the Star Gatherer itself !"));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }
	
	
	 @Override
	 public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		 
		target.playSound(SoundInit.GALACTIC_SLAYER.get(), 1.0F, 1.0F);
	    		    	
	    return super.hitEntity(stack, target, attacker);
	 }

}
