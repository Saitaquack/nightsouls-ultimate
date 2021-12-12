package com.saita.nightsoulsmod.common.blockitems;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class PerfectParagonicBlock extends BlockItem {

	public PerfectParagonicBlock(Block blockIn, Properties builder) {
		super(blockIn, builder);

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
    
	tooltip.add(new StringTextComponent("�1It seems to hold an infinite power,�a and to warp spacetime itself. �6Are you really worthy of such power, �4or will it consume you first ?"));
	tooltip.set(0, new StringTextComponent("�5"+tooltip.get(0).getString()+"�r"));			
	super.addInformation(stack, worldIn, tooltip, flagIn);
	
    }

}
