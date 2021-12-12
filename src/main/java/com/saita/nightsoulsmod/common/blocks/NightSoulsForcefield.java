package com.saita.nightsoulsmod.common.blocks;

import java.util.Random;

import com.saita.nightsoulsmod.common.items.NightSoulsKey;
import com.saita.nightsoulsmod.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;


public class NightSoulsForcefield extends Block {

	public NightSoulsForcefield(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getLightValue(BlockState state) {
		
		return 8;
	}
	
	@Override
	public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
		
		return 1.0F;
	}
	
	@Override
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		
		return adjacentBlockState == BlockInit.NIGHTSOULS_FORCEFIELD.get().getDefaultState();
	}

	public boolean ticksRandomly(BlockState state) {
		
	      return true;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		
		if(worldIn.getGameTime() >= NightSoulsKey.requiemConstant)
      	  {			
			 worldIn.removeBlock(pos, false);
          }
				
		super.randomTick(state, worldIn, pos, random);
	}
	
    @SuppressWarnings("deprecation")
	@Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    	
    	if(worldIn.getGameTime() >= NightSoulsKey.requiemConstant)
      	{
    		worldIn.removeBlock(pos, false);
      	}
	
	  return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
  }
    
    @SuppressWarnings("deprecation")
	@Override
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
    	  	
    	if(worldIn.getGameTime() >= NightSoulsKey.requiemConstant)
      	{
    		worldIn.removeBlock(pos, false);
      	}
    	super.onBlockClicked(state, worldIn, pos, player);
    }

	
}
