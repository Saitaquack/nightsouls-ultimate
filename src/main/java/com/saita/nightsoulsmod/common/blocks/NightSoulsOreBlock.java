package com.saita.nightsoulsmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class NightSoulsOreBlock extends Block {

	public NightSoulsOreBlock(Properties properties) {
		super(properties);
		
	}
	
	@Override
	public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
		
		return true;
	}
	
}
