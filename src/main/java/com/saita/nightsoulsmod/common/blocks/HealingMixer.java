package com.saita.nightsoulsmod.common.blocks;

import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class HealingMixer extends Block {

	public HealingMixer(Properties properties) {
		super(properties);

	}
	
	@Override
	public int getLightValue(BlockState state) {
		
		return 15;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
	    	
	   player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 200, 2));
	   worldIn.playSound(player, player.getPosition(), SoundInit.HEALING.get(), SoundCategory.MASTER, 1.0F, 1.0F);
		
	   return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}

}
