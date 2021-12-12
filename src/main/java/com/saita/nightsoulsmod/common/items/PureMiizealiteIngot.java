package com.saita.nightsoulsmod.common.items;

import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class PureMiizealiteIngot extends NightSoulsOrePureIngot {

	public PureMiizealiteIngot(Properties properties) {
		super(properties);
		
	}
	
	 @Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		 
		int ring = random.nextInt(4);
		
		if(ring == 0)
		{	
			playerIn.getCooldownTracker().setCooldown(this, 40);
			worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.DOPPIO.get(), SoundCategory.MASTER, 1.0F, 1.0F);
		}
	    	
	    return super.onItemRightClick(worldIn, playerIn, handIn);
	    
	  }	

}
