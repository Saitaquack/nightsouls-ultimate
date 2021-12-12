package com.saita.nightsoulsmod.common.items;

import com.saita.nightsoulsmod.core.init.ItemInit;
import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
public class ParagonicNightSoulsArmor extends ArmorItem {

	public ParagonicNightSoulsArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);

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
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		
		if(!stack.isEnchanted())		
		 {
			 stack.addEnchantment(Enchantments.PROTECTION, 5);
		 }
		
		super.onCreated(stack, worldIn, playerIn);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		 if(entityIn instanceof PlayerEntity)
	    	{
	    		 PlayerEntity playerIn = (PlayerEntity)entityIn;	
	    		 if(!stack.isEnchanted() && playerIn.isCreative())
			
	    		 {
	    			 stack.addEnchantment(Enchantments.PROTECTION, 5);
	    		 }
		
	    		 super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	    	}
     }
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		
		// Donne des NightSouls Emeralds
		if(world.getDayTime() % 3000 == 0)
	    {
		 	ItemStack nsEmerald = new ItemStack(ItemInit.NIGHTSOULS_EMERALD.get(), 4);
		 	player.dropItem(nsEmerald, false).setNoPickupDelay();
		 	world.playSound(player, player.getPosition(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 0.5F, 1.0F);
        }
		
		// Donne des star bits
		if(world.getDayTime() % 2400 == 0)
	   	{
          ItemStack starFragment = new ItemStack(ItemInit.STAR_BIT.get(), 1);
		    player.dropItem(starFragment, false).setNoPickupDelay();
		    world.playSound(player, player.getPosition(), SoundInit.STAR_BIT.get(), SoundCategory.MASTER, 1.0F, 1.0F);
         }
		
		//Agit comme le NightSouls Charm
		if(player.getPosition().getY() < -44)
	     {
	    	 player.clearActivePotions();
	    	 player.teleportKeepLoaded(0, 116, 0);
	    	 player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 240, 4));
			 player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 240, 4));
			 player.addPotionEffect(new EffectInstance(Effects.SPEED, 240, 4));	
			 player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 240, 0));	
		     world.playSound(player, player.getPosition(), SoundInit.NIGHTSOULS_CHARM.get(), SoundCategory.MASTER, 1.0F, 1.0F);
	     }
		
		// repairs itself
		 if(world.getDayTime() % 200 == 0)
		  {
			stack.damageItem(-1, player, null);
		  }
		
		super.onArmorTick(stack, world, player);
	}

}
