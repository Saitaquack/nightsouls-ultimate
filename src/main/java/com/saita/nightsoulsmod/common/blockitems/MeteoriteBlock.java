package com.saita.nightsoulsmod.common.blockitems;

import com.saita.nightsoulsmod.common.items.NightSoulsKey;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.world.World;

public class MeteoriteBlock extends BlockItem {

	public MeteoriteBlock(Block blockIn, Properties builder) {
		super(blockIn, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.RARE;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		if(worldIn.getGameTime() < NightSoulsKey.requiemConstant)
	       {	
			  stack.shrink(1);
	       }
	
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	}

}
