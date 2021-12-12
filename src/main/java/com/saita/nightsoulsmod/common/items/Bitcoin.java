package com.saita.nightsoulsmod.common.items;

import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Bitcoin extends Item {

	public Bitcoin(Properties properties) {
		super(properties);

	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
		playerIn.getCooldownTracker().setCooldown(this, 60);	    	
	    worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.TAGUEULE.get(), SoundCategory.MASTER, 1.0F, 1.0F);
	    return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
