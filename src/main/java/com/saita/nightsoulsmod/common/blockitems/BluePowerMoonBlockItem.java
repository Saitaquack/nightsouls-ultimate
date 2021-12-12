package com.saita.nightsoulsmod.common.blockitems;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BluePowerMoonBlockItem extends BlockItem {

	public BluePowerMoonBlockItem(Block blockIn, Properties builder) {
		super(blockIn, builder);

	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
    
	tooltip.set(0, new StringTextComponent("�9"+tooltip.get(0).getString()+"�r"));		
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  

}
