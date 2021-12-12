package com.saita.nightsoulsmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class CrazyDiamondBlock extends Block {

	public CrazyDiamondBlock(Properties properties) {
		super(properties);
		
	}
	
	@Override
	public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
		
		return true;
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		
		if(entityIn instanceof LivingEntity)
		{
	    	((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.SPEED, 160, 3));
	    	((LivingEntity) entityIn).heal(1);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
	
}
