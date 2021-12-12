package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;
import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class PrimalRage extends Item {

	public PrimalRage(Properties properties) {
		super(properties);

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
	    	
	   tooltip.add(new StringTextComponent("�7Gain immense health instantly, and jump super high. Cooldown : 120 seconds"));
	   super.addInformation(stack, worldIn, tooltip, flagIn);
	 }
	 
	 @Override
	    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
	    	
	    playerIn.getCooldownTracker().setCooldown(this, 2400);
	    playerIn.getCooldownTracker().setCooldown(ItemInit.NANO_BOOST.get(), 2400);
	    playerIn.getCooldownTracker().setCooldown(ItemInit.SOUND_BARRIER.get(), 2400);
	    
	    playerIn.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 400, 9));
	    playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 400, 3));
	    playerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 400, 9));
	    playerIn.heal(60);
	    worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.PRIMAL_RAGE.get(), SoundCategory.MASTER, 1.0F, 1.0F);
	    
	    	return super.onItemRightClick(worldIn, playerIn, handIn);
	   }

}
