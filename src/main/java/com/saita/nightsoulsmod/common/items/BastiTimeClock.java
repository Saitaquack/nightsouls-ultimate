package com.saita.nightsoulsmod.common.items;

import java.util.List;

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
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class BastiTimeClock extends Item {

	public BastiTimeClock(Properties properties) {
		super(properties);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
	    	
	   tooltip.add(new StringTextComponent("�7Right click to skip time ! Also grants you short speed and invisibility. �7Cooldown : 3 minutes"));
	   super.addInformation(stack, worldIn, tooltip, flagIn);
	}  
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
	  if(playerIn.dimension == DimensionType.OVERWORLD)
	    {
		  if(!playerIn.isCreative())
			{
			    playerIn.getCooldownTracker().setCooldown(this, 3600);
			}
		  
			long getCurrentDayTime = worldIn.getDayTime();
			worldIn.setDayTime(getCurrentDayTime + 8000);		
			worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.TIME_SKIP.get(), SoundCategory.MASTER, 1.0F, 1.0F);
			playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 60, 0, false, false));
			playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 60, 4, false, false));	
					
	    }
		else
		{
			if(worldIn.isRemote)
		  	{
		 	      playerIn.sendMessage(new TranslationTextComponent("�f"+playerIn.getName().getString()+", you need to be in the Overworld to use the time skip."));
		  	}
		}
			
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	

}
