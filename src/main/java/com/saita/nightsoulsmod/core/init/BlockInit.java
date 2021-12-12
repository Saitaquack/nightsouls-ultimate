package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.common.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {	

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, NightSoulsMod.MOD_ID);

	public static final RegistryObject<Block> SAITASTONE_BLOCK = BLOCKS.register("saitastone_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.RED).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> MIIZEALITE_BLOCK = BLOCKS.register("miizealite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> CRANITE_BLOCK = BLOCKS.register("cranite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BASTIRITE_BLOCK = BLOCKS.register("bastirite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SAITASTONE_ORE = BLOCKS.register("saitastone_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MIIZEALITE_ORE = BLOCKS.register("miizealite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> NETHER_MIIZEALITE_ORE = BLOCKS.register("nether_miizealite_ore", () -> new NetherMiizealiteOre(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> CRANITE_ORE = BLOCKS.register("cranite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BASTIRITE_ORE = BLOCKS.register("bastirite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> UNDERGROUND_HEART_CRYSTAL = BLOCKS.register("underground_heart_crystal", () -> new UndergroundHeartCrystal(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.GLASS)));	
	public static final RegistryObject<Block> TRAPPED_TRUE_NIGHT_SOUL = BLOCKS.register("trapped_true_night_soul", () -> new TrappedTrueNightSoul(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(10.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(6).sound(SoundType.STONE)));
	public static final RegistryObject<Block> NIGHTSOULS_LUCKY_BLOCK = BLOCKS.register("nightsouls_lucky_block", () -> new NightSoulsLuckyBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(1.5F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SAITASTONE_CROPS = BLOCKS.register("saitastone_crops", () -> new SaitastoneCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> MIIZEALITE_CROPS = BLOCKS.register("miizealite_crops", () -> new MiizealiteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> CRANITE_CROPS = BLOCKS.register("cranite_crops", () -> new CraniteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> BASTIRITE_CROPS = BLOCKS.register("bastirite_crops", () -> new BastiriteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> CELESTIAL_EMERALD_BLOCK = BLOCKS.register("celestial_emerald_block", () -> new CelestialEmeraldBlock(Block.Properties.create(Material.IRON, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> CRYSTAL_CROPS = BLOCKS.register("crystal_crops", () -> new CrystalCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 4.0F).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> CRYSTAL_STAIRS = BLOCKS.register("crystal_stairs", () -> new StairsBlock(() -> BlockInit.CRYSTAL_BLOCK.get().getDefaultState(), Block.Properties.from(BlockInit.CRYSTAL_BLOCK.get())));
	public static final RegistryObject<Block> CRYSTAL_SLAB = BLOCKS.register("crystal_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CRYSTAL_BLOCK.get())));
	public static final RegistryObject<Block> SPEEDING_MIXER = BLOCKS.register("speeding_mixer", () -> new SpeedingMixer(Block.Properties.create(Material.IRON, MaterialColor.LIME).hardnessAndResistance(6.0F, 5.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> HEALING_MIXER = BLOCKS.register("healing_mixer", () -> new HealingMixer(Block.Properties.create(Material.IRON, MaterialColor.YELLOW).hardnessAndResistance(6.0F, 5.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ENDER_HEART_CRYSTAL = BLOCKS.register("ender_heart_crystal", () -> new UndergroundHeartCrystal(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.GLASS)));	
	public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = BLOCKS.register("compressed_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 9.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SUPER_COMPRESSED_COBBLESTONE = BLOCKS.register("super_compressed_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(5.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_POWER_MOON_BLOCK = BLOCKS.register("red_power_moon_block", () -> new PowerMoonBlock(Block.Properties.create(Material.IRON, MaterialColor.RED).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> PURPLE_POWER_MOON_BLOCK = BLOCKS.register("purple_power_moon_block", () -> new PowerMoonBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> WHITE_POWER_MOON_BLOCK = BLOCKS.register("white_power_moon_block", () -> new PowerMoonBlock(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BLUE_POWER_MOON_BLOCK = BLOCKS.register("blue_power_moon_block", () -> new PowerMoonBlock(Block.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> NIGHTSOULS_EMERALD_BLOCK = BLOCKS.register("nightsouls_emerald_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
	public static final RegistryObject<Block> NIGHTSOULS_EMERALD_ORE = BLOCKS.register("nightsouls_emerald_ore", () -> new NightSoulsEmeraldOre(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SUPER_NIGHTSOULS_EMERALD_BLOCK = BLOCKS.register("super_nightsouls_emerald_block", () -> new SuperNightSoulsEmeraldBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(10.0F, 12.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
	public static final RegistryObject<Block> HELLSTONE = BLOCKS.register("hellstone", () -> new MeteoriteBlock(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(18.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SPACESTONE = BLOCKS.register("spacestone", () -> new MeteoriteBlock(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(18.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> HEAVENSTONE = BLOCKS.register("heavenstone", () -> new MeteoriteBlock(Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(18.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANTISTONE = BLOCKS.register("antistone", () -> new MeteoriteBlock(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(18.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MIIZEALITE_BOMB = BLOCKS.register("miizealite_bomb", () -> new MiizealiteBomb(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(5.0F, 1.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SAITASTONE_TILES = BLOCKS.register("saitastone_tiles", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.RED).hardnessAndResistance(5.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> MIIZEALITE_TILES = BLOCKS.register("miizealite_tiles", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(5.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> CRANITE_TILES = BLOCKS.register("cranite_tiles", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(5.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BASTIRITE_TILES = BLOCKS.register("bastirite_tiles", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(5.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SAITASTONE_TILES_STAIRS = BLOCKS.register("saitastone_tiles_stairs", () -> new StairsBlock(() -> BlockInit.SAITASTONE_TILES.get().getDefaultState(), Block.Properties.from(BlockInit.SAITASTONE_TILES.get())));
	public static final RegistryObject<Block> SAITASTONE_TILES_SLAB = BLOCKS.register("saitastone_tiles_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.SAITASTONE_TILES.get())));
	public static final RegistryObject<Block> MIIZEALITE_TILES_STAIRS = BLOCKS.register("miizealite_tiles_stairs", () -> new StairsBlock(() -> BlockInit.MIIZEALITE_TILES.get().getDefaultState(), Block.Properties.from(BlockInit.MIIZEALITE_TILES.get())));
	public static final RegistryObject<Block> MIIZEALITE_TILES_SLAB = BLOCKS.register("miizealite_tiles_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MIIZEALITE_TILES.get())));
	public static final RegistryObject<Block> CRANITE_TILES_STAIRS = BLOCKS.register("cranite_tiles_stairs", () -> new StairsBlock(() -> BlockInit.CRANITE_TILES.get().getDefaultState(), Block.Properties.from(BlockInit.CRANITE_TILES.get())));
	public static final RegistryObject<Block> CRANITE_TILES_SLAB = BLOCKS.register("cranite_tiles_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CRANITE_TILES.get())));
	public static final RegistryObject<Block> BASTIRITE_TILES_STAIRS = BLOCKS.register("bastirite_tiles_stairs", () -> new StairsBlock(() -> BlockInit.BASTIRITE_TILES.get().getDefaultState(), Block.Properties.from(BlockInit.BASTIRITE_TILES.get())));
	public static final RegistryObject<Block> BASTIRITE_TILES_SLAB = BLOCKS.register("bastirite_tiles_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BASTIRITE_TILES.get())));
	public static final RegistryObject<Block> CRAZY_DIAMOND_ORE = BLOCKS.register("crazy_diamond_ore", () -> new CrazyDiamondOre(Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> CRAZY_DIAMOND_BLOCK = BLOCKS.register("crazy_diamond_block", () -> new CrazyDiamondBlock(Block.Properties.create(Material.IRON, MaterialColor.PINK).hardnessAndResistance(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
	public static final RegistryObject<Block> NIGHTSOULS_FORCEFIELD = BLOCKS.register("nightsouls_forcefield", () -> new NightSoulsForcefield(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(-1.0F, 3600000.0F).sound(SoundType.STONE).noDrops().notSolid()));
	public static final RegistryObject<Block> PARAGONIC_BLOCK = BLOCKS.register("paragonic_block", () -> new ParagonicBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(42.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
	public static final RegistryObject<Block> PRIMIUM_BLOCK = BLOCKS.register("primium_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.LIME).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> ROWEQUITE_BLOCK = BLOCKS.register("rowequite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> THERENITE_BLOCK = BLOCKS.register("therenite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> PRIMIUM_ORE = BLOCKS.register("primium_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ROWEQUITE_ORE = BLOCKS.register("rowequite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> THERENITE_ORE = BLOCKS.register("therenite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> PERFECT_PARAGONIC_BLOCK = BLOCKS.register("perfect_paragonic_block", () -> new PerfectParagonicBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(42.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));


	public static final RegistryObject<Block> PETRIFIED_HELLSTONE = BLOCKS.register("petrified_hellstone", () -> new PetrifiedHellstone(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> PETRIFIED_SPACESTONE = BLOCKS.register("petrified_spacestone", () -> new PetrifiedSpacestone(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> PETRIFIED_HEAVENSTONE = BLOCKS.register("petrified_heavenstone", () -> new PetrifiedHeavenstone(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
	public static final RegistryObject<Block> PETRIFIED_ANTISTONE = BLOCKS.register("petrified_antistone", () -> new PetrifiedAntistone(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));






}
