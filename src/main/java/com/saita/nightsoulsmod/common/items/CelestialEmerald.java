package com.saita.nightsoulsmod.common.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class CelestialEmerald extends Item {

	public CelestialEmerald(Properties properties) {
		super(properties);

	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {

		return true;
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.RARE;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("�2"+tooltip.get(0).getString()+"�r"));
    tooltip.add(new StringTextComponent("�7Can be converted to emeralds. Can also duplicate NightSouls ores ingots and Life crystals."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
