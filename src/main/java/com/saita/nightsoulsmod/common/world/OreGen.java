package com.saita.nightsoulsmod.common.world;

import com.saita.nightsoulsmod.core.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	
	public static void generateOres()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{                                                                                         // (Rarity, OffsetBottom, OffsetTop, MaxHeight)
			ConfiguredPlacement<CountRangeConfig> basicOreSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 25));
			
			ConfiguredPlacement<CountRangeConfig> undergroundHeartCrystalSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 1, 1, 25));
			ConfiguredPlacement<CountRangeConfig> nightSoulsEmeraldSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 32));
			ConfiguredPlacement<CountRangeConfig> crazyDiamondSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 17));			
			ConfiguredPlacement<CountRangeConfig> netherMiizealiteSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 1, 1, 128));	
			
			ConfiguredPlacement<CountRangeConfig> oreBlockSpawn1 = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 16));
			ConfiguredPlacement<CountRangeConfig> oreBlockSpawn2 = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 1, 1, 30));
			ConfiguredPlacement<CountRangeConfig> meteoriteSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 48));
			
			
			ConfiguredPlacement<CountRangeConfig> trappedTrueNightSoulSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 78));
			ConfiguredPlacement<CountRangeConfig> enderHeartCrystalSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 1, 1, 78));
			                                                                                          
			if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND)
				
			 {	
				
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                                   // Max Ore per vein
			           (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAITASTONE_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			    
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                 
				        (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MIIZEALITE_ORE.get().getDefaultState(), 5)).withPlacement(basicOreSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                 
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.CRANITE_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			  
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BASTIRITE_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PRIMIUM_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ROWEQUITE_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.THERENITE_ORE.get().getDefaultState(), 8)).withPlacement(basicOreSpawn));
			   
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.UNDERGROUND_HEART_CRYSTAL.get().getDefaultState(), 3)).withPlacement(undergroundHeartCrystalSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.NIGHTSOULS_EMERALD_ORE.get().getDefaultState(), 8)).withPlacement(nightSoulsEmeraldSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.CRAZY_DIAMOND_ORE.get().getDefaultState(), 4)).withPlacement(crazyDiamondSpawn));
			   
			   
			   
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.DIAMOND_BLOCK.getDefaultState(), 3)).withPlacement(oreBlockSpawn1));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.EMERALD_BLOCK.getDefaultState(), 3)).withPlacement(oreBlockSpawn1));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.IRON_BLOCK.getDefaultState(), 4)).withPlacement(oreBlockSpawn2));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GOLD_BLOCK.getDefaultState(), 3)).withPlacement(oreBlockSpawn2));
			   
			   
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PETRIFIED_HELLSTONE.get().getDefaultState(), 5)).withPlacement(meteoriteSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PETRIFIED_SPACESTONE.get().getDefaultState(), 5)).withPlacement(meteoriteSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PETRIFIED_HEAVENSTONE.get().getDefaultState(), 5)).withPlacement(meteoriteSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PETRIFIED_ANTISTONE.get().getDefaultState(), 5)).withPlacement(meteoriteSpawn));
			  			  
			  }
			
				
			if(biome.getCategory() == Biome.Category.NETHER)
				
			{
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
					       (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHER_MIIZEALITE_ORE.get().getDefaultState(), 8)).withPlacement(netherMiizealiteSpawn));		
			}
			
			if(biome.getCategory() == Biome.Category.THEEND)
				
		     {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
				(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE)), BlockInit.TRAPPED_TRUE_NIGHT_SOUL.get().getDefaultState(), 5)).withPlacement(trappedTrueNightSoulSpawn));	
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
				(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE)), BlockInit.ENDER_HEART_CRYSTAL.get().getDefaultState(), 4)).withPlacement(enderHeartCrystalSpawn));			
		     }
						
		}
		
	}
	
}