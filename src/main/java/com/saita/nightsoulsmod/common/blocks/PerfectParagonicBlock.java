package com.saita.nightsoulsmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class PerfectParagonicBlock extends Block {

	public PerfectParagonicBlock(Properties properties) {
		super(properties);
		
	}
	
	@Override
	public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
		
		return true;
	}
	
	@Override
	public int getLightValue(BlockState state) {
		
		return 15;
	}
		
}
