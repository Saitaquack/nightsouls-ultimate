package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.common.world.structures.*;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class StructureInit {
	
    public static Structure<NoFeatureConfig> NIGHTSOULS_HOUSE = new NightSoulsHouseStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_HOUSE_PIECE = NightSoulsHousePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> SAITA_FLOATING_ISLAND = new SaitaFloatingIslandStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType SAITA_FLOATING_ISLAND_PIECE = SaitaFloatingIslandPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CRANE_BATTLE_TOWER = new CraneBattleTowerStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CRANE_BATTLE_TOWER_PIECE = CraneBattleTowerPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DRAGON_FOSSIL = new DragonFossilStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DRAGON_FOSSIL_PIECE = DragonFossilPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_CAMP = new NightSoulsCampStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_CAMP_PIECE = NightSoulsCampPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> BASTI_LAB = new BastiLabStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType BASTI_LAB_PIECE = BastiLabPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> LUCKY_BLOCK = new LuckyBlockStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType LUCKY_BLOCK_PIECE = LuckyBlockPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CELESTIAL_EMERALD = new CelestialEmeraldStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CELESTIAL_EMERALD_PIECE = CelestialEmeraldPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_FINAL_CASTLE = new NightSoulsFinalCastleStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_FINAL_CASTLE_PIECE = NightSoulsFinalCastlePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_FINAL_CASTLE_ISLAND = new NightSoulsFinalCastleIslandStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_FINAL_CASTLE_ISLAND_PIECE = NightSoulsFinalCastleIslandPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_ISLANDS = new NightSoulsIslandsStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_ISLANDS_PIECE = NightSoulsIslandsPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_TEMPLE = new NightSoulsTempleStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_TEMPLE_PIECE = NightSoulsTemplePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> MIIZEAL_ALTAR = new MiizealAltarStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType MIIZEAL_ALTAR_PIECE = MiizealAltarPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> SKY_BASE = new SkyBaseStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType SKY_BASE_PIECE = SkyBasePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CRANE_FORGE = new CraneForgeStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CRANE_FORGE_PIECE = CraneForgePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> ROCKET = new RocketStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType ROCKET_PIECE = RocketPieces.Piece::new;
        
    public static Structure<NoFeatureConfig> DRAGON_FORGE = new DragonForgeStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DRAGON_FORGE_PIECE = DragonForgePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> A_NORMAL_VILLAGE = new ANormalVillageStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType A_NORMAL_VILLAGE_PIECE = ANormalVillagePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> WEREWOLF_CAVE = new WerewolfCaveStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType WEREWOLF_CAVE_PIECE = WerewolfCavePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_BARN = new NightSoulsBarnStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_BARN_PIECE = NightSoulsBarnPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> POWER_MOON = new PowerMoonStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType POWER_MOON_PIECE = PowerMoonPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_MANSION = new NightSoulsMansionStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_MANSION_PIECE = NightSoulsMansionPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DRAGON_STATUE_TOP = new DragonStatueTopStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DRAGON_STATUE_TOP_PIECE = DragonStatueTopPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DRAGON_STATUE_BOTTOM = new DragonStatueBottomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DRAGON_STATUE_BOTTOM_PIECE = DragonStatueBottomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> MELDYA_LAKE = new MeldyaLakeStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType MELDYA_LAKE_PIECE = MeldyaLakePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DECUBE_HOUSE = new DecubeHouseStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DECUBE_HOUSE_PIECE = DecubeHousePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DECUBE_HOUSE2 = new DecubeHouse2Structure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DECUBE_HOUSE2_PIECE = DecubeHouse2Pieces.Piece::new;
    
    public static Structure<NoFeatureConfig> FREDDY_FAZBEAR_PIZZA = new FreddyFazbearPizzaStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType FREDDY_FAZBEAR_PIZZA_PIECE = FreddyFazbearPizzaPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> BASTI_FARM = new BastiFarmStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType BASTI_FARM_PIECE = BastiFarmPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> GRAVEYARD = new GraveyardStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType GRAVEYARD_PIECE = GraveyardPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> A_NORMAL_CHURCH = new ANormalChurchStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType A_NORMAL_CHURCH_PIECE = ANormalChurchPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> ODYSSEY_TOP = new OdysseyTopStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType ODYSSEY_TOP_PIECE = OdysseyTopPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> ODYSSEY_BOTTOM = new OdysseyBottomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType ODYSSEY_BOTTOM_PIECE = OdysseyBottomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> SAITA_LOOT_ROOM = new SaitaLootRoomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType SAITA_LOOT_ROOM_PIECE = SaitaLootRoomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> MIIZEAL_LOOT_ROOM = new MiizealLootRoomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType MIIZEAL_LOOT_ROOM_PIECE = MiizealLootRoomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CRANE_LOOT_ROOM = new CraneLootRoomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CRANE_LOOT_ROOM_PIECE = CraneLootRoomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> BASTI_LOOT_ROOM = new BastiLootRoomStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType BASTI_LOOT_ROOM_PIECE = BastiLootRoomPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> PARAGONIC_CORE = new ParagonicCoreStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType PARAGONIC_CORE_PIECE = ParagonicCorePieces.Piece::new;
    
    
    @SubscribeEvent
    public static void onRegisterFeatures(final RegistryEvent.Register<Feature<?>> event)
    {
        
        IForgeRegistry<Feature<?>> registry = event.getRegistry();

        NIGHTSOULS_HOUSE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_house"));
        registry.register(NIGHTSOULS_HOUSE);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_house", NIGHTSOULS_HOUSE_PIECE);
        
        SAITA_FLOATING_ISLAND.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "saita_floating_island"));
        registry.register(SAITA_FLOATING_ISLAND);
        Registry.register(Registry.STRUCTURE_PIECE, "saita_floating_island", SAITA_FLOATING_ISLAND_PIECE);
        
        CRANE_BATTLE_TOWER.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "crane_battle_tower"));
        registry.register(CRANE_BATTLE_TOWER);
        Registry.register(Registry.STRUCTURE_PIECE, "crane_battle_tower", CRANE_BATTLE_TOWER_PIECE);
        
        DRAGON_FOSSIL.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "dragon_fossil"));
        registry.register(DRAGON_FOSSIL);
        Registry.register(Registry.STRUCTURE_PIECE, "dragon_fossil", DRAGON_FOSSIL_PIECE);
        
        NIGHTSOULS_CAMP.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_camp"));
        registry.register(NIGHTSOULS_CAMP);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_camp", NIGHTSOULS_CAMP_PIECE);
        
        BASTI_LAB.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "basti_lab"));
        registry.register(BASTI_LAB);
        Registry.register(Registry.STRUCTURE_PIECE, "basti_lab", BASTI_LAB_PIECE);
        
        LUCKY_BLOCK.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "lucky_block"));
        registry.register(LUCKY_BLOCK);
        Registry.register(Registry.STRUCTURE_PIECE, "lucky_block", LUCKY_BLOCK_PIECE);
        
        CELESTIAL_EMERALD.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "celestial_emerald"));
        registry.register(CELESTIAL_EMERALD);
        Registry.register(Registry.STRUCTURE_PIECE, "celestial_emerald", CELESTIAL_EMERALD_PIECE);
        
        NIGHTSOULS_FINAL_CASTLE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_final_castle"));
        registry.register(NIGHTSOULS_FINAL_CASTLE);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_final_castle", NIGHTSOULS_FINAL_CASTLE_PIECE);
        
        NIGHTSOULS_FINAL_CASTLE_ISLAND.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_final_castle_island"));
        registry.register(NIGHTSOULS_FINAL_CASTLE_ISLAND);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_final_castle_island", NIGHTSOULS_FINAL_CASTLE_ISLAND_PIECE);
        
        NIGHTSOULS_ISLANDS.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_islands"));
        registry.register(NIGHTSOULS_ISLANDS);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_islands", NIGHTSOULS_ISLANDS_PIECE);
        
        NIGHTSOULS_TEMPLE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_temple"));
        registry.register(NIGHTSOULS_TEMPLE);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_temple", NIGHTSOULS_TEMPLE_PIECE);
        
        MIIZEAL_ALTAR.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "miizeal_altar"));
        registry.register(MIIZEAL_ALTAR);
        Registry.register(Registry.STRUCTURE_PIECE, "miizeal_altar", MIIZEAL_ALTAR_PIECE);
        
        SKY_BASE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "sky_base"));
        registry.register(SKY_BASE);
        Registry.register(Registry.STRUCTURE_PIECE, "sky_base", SKY_BASE_PIECE);
        
        CRANE_FORGE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "crane_forge"));
        registry.register(CRANE_FORGE);
        Registry.register(Registry.STRUCTURE_PIECE, "crane_forge", CRANE_FORGE_PIECE);
        
        ROCKET.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "rocket"));
        registry.register(ROCKET);
        Registry.register(Registry.STRUCTURE_PIECE, "rocket", ROCKET_PIECE);
        
        DRAGON_FORGE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "dragon_forge"));
        registry.register(DRAGON_FORGE);
        Registry.register(Registry.STRUCTURE_PIECE, "dragon_forge", DRAGON_FORGE_PIECE);
        
        A_NORMAL_VILLAGE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "a_normal_village"));
        registry.register(A_NORMAL_VILLAGE);
        Registry.register(Registry.STRUCTURE_PIECE, "a_normal_village", A_NORMAL_VILLAGE_PIECE);
        
        WEREWOLF_CAVE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "werewolf_cave"));
        registry.register(WEREWOLF_CAVE);
        Registry.register(Registry.STRUCTURE_PIECE, "werewolf_cave", WEREWOLF_CAVE_PIECE);
        
        NIGHTSOULS_BARN.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_barn"));
        registry.register(NIGHTSOULS_BARN);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_barn", NIGHTSOULS_BARN_PIECE);
        
        POWER_MOON.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "power_moon"));
        registry.register(POWER_MOON);
        Registry.register(Registry.STRUCTURE_PIECE, "power_moon", POWER_MOON_PIECE);
        
        NIGHTSOULS_MANSION.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_mansion"));
        registry.register(NIGHTSOULS_MANSION);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_mansion", NIGHTSOULS_MANSION_PIECE);
        
        DRAGON_STATUE_TOP.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "dragon_statue_top"));
        registry.register(DRAGON_STATUE_TOP);
        Registry.register(Registry.STRUCTURE_PIECE, "dragon_statue_top", DRAGON_STATUE_TOP_PIECE);
        
        DRAGON_STATUE_BOTTOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "dragon_statue_bottom"));
        registry.register(DRAGON_STATUE_BOTTOM);
        Registry.register(Registry.STRUCTURE_PIECE, "dragon_statue_bottom", DRAGON_STATUE_BOTTOM_PIECE);
        
        MELDYA_LAKE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "meldya_lake"));
        registry.register(MELDYA_LAKE);
        Registry.register(Registry.STRUCTURE_PIECE, "meldya_lake", MELDYA_LAKE_PIECE);
        
        DECUBE_HOUSE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "decube_house"));
        registry.register(DECUBE_HOUSE);
        Registry.register(Registry.STRUCTURE_PIECE, "decube_house", DECUBE_HOUSE_PIECE);
        
        DECUBE_HOUSE2.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "decube_house2"));
        registry.register(DECUBE_HOUSE2);
        Registry.register(Registry.STRUCTURE_PIECE, "decube_house2", DECUBE_HOUSE2_PIECE);
        
        FREDDY_FAZBEAR_PIZZA.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "freddy_fazbear_pizza"));
        registry.register(FREDDY_FAZBEAR_PIZZA);
        Registry.register(Registry.STRUCTURE_PIECE, "freddy_fazbear_pizza", FREDDY_FAZBEAR_PIZZA_PIECE);
       
        
        BASTI_FARM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "basti_farm"));
        registry.register(BASTI_FARM);
        Registry.register(Registry.STRUCTURE_PIECE, "basti_farm", BASTI_FARM_PIECE);
        
        GRAVEYARD.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "graveyard"));
        registry.register(GRAVEYARD);
        Registry.register(Registry.STRUCTURE_PIECE, "graveyard", GRAVEYARD_PIECE);
        
        A_NORMAL_CHURCH.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "a_normal_church"));
        registry.register(A_NORMAL_CHURCH);
        Registry.register(Registry.STRUCTURE_PIECE, "a_normal_church", A_NORMAL_CHURCH_PIECE);
        
        ODYSSEY_TOP.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "odyssey_top"));
        registry.register(ODYSSEY_TOP);
        Registry.register(Registry.STRUCTURE_PIECE, "odyssey_top", ODYSSEY_TOP_PIECE);
        
        ODYSSEY_BOTTOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "odyssey_bottom"));
        registry.register(ODYSSEY_BOTTOM);
        Registry.register(Registry.STRUCTURE_PIECE, "odyssey_bottom", ODYSSEY_BOTTOM_PIECE);
        
        SAITA_LOOT_ROOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "saita_loot_room"));
        registry.register(SAITA_LOOT_ROOM);
        Registry.register(Registry.STRUCTURE_PIECE, "saita_loot_room", SAITA_LOOT_ROOM_PIECE);
        
        MIIZEAL_LOOT_ROOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "miizeal_loot_room"));
        registry.register(MIIZEAL_LOOT_ROOM);
        Registry.register(Registry.STRUCTURE_PIECE, "miizeal_loot_room", MIIZEAL_LOOT_ROOM_PIECE);
        
        CRANE_LOOT_ROOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "crane_loot_room"));
        registry.register(CRANE_LOOT_ROOM);
        Registry.register(Registry.STRUCTURE_PIECE, "crane_loot_room", CRANE_LOOT_ROOM_PIECE);
        
        BASTI_LOOT_ROOM.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "basti_loot_room"));
        registry.register(BASTI_LOOT_ROOM);
        Registry.register(Registry.STRUCTURE_PIECE, "basti_loot_room", BASTI_LOOT_ROOM_PIECE);
        
        PARAGONIC_CORE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "paragonic_core"));
        registry.register(PARAGONIC_CORE);
        Registry.register(Registry.STRUCTURE_PIECE, "paragonic_core", PARAGONIC_CORE_PIECE);

    }
 
    public static void addToBiomes(){
        
        for(Biome biome : ForgeRegistries.BIOMES)
        {   
        	       	
        	if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.OCEAN)    
            { 
        		 biome.addStructure(A_NORMAL_VILLAGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, A_NORMAL_VILLAGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                              
                 biome.addStructure(A_NORMAL_CHURCH.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, A_NORMAL_CHURCH.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                 .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(BASTI_FARM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, BASTI_FARM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(CRANE_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CRANE_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(DECUBE_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DECUBE_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(DECUBE_HOUSE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DECUBE_HOUSE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                 
                 biome.addStructure(DRAGON_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(DRAGON_STATUE_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_STATUE_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(DRAGON_STATUE_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_STATUE_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(FREDDY_FAZBEAR_PIZZA.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FREDDY_FAZBEAR_PIZZA.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(GRAVEYARD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, GRAVEYARD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                 .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(MELDYA_LAKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, MELDYA_LAKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(MIIZEAL_ALTAR.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, MIIZEAL_ALTAR.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(NIGHTSOULS_BARN.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_BARN.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                 
                 biome.addStructure(NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(NIGHTSOULS_MANSION.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_MANSION.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                 
                 biome.addStructure(NIGHTSOULS_TEMPLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_TEMPLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(ROCKET.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ROCKET.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                  .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(WEREWOLF_CAVE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, WEREWOLF_CAVE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                 
                 biome.addStructure(PARAGONIC_CORE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, PARAGONIC_CORE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(SAITA_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, SAITA_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(MIIZEAL_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, MIIZEAL_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(CRANE_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, CRANE_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(BASTI_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, BASTI_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
                 biome.addStructure(POWER_MOON.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                 biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, POWER_MOON.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                   .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                 
            }
        	if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND)    
            { 
        		biome.addStructure(SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
       	   		
       	   		biome.addStructure(ODYSSEY_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ODYSSEY_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
       	   		.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));    
            
                biome.addStructure(ODYSSEY_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ODYSSEY_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
               .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                
                biome.addStructure(NIGHTSOULS_FINAL_CASTLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_FINAL_CASTLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
       	   		
       	   		biome.addStructure(NIGHTSOULS_FINAL_CASTLE_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_FINAL_CASTLE_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
       	   				.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
       	   		
       	   		biome.addStructure(NIGHTSOULS_ISLANDS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_ISLANDS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
       	   				.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            
       	   		biome.addStructure(SKY_BASE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
       	   		biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, SKY_BASE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
       	   				.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            }
        	
                  
                  /* Ancient format de spawn des structures. En 1.1.1, cela a changé pour que les structures spawnent dans tous les biomes.
            	  
            	  
                  if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST || 
             	  biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.RIVER)   
             	   
                  { 
         	       biome.addStructure(NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));   
                    
                    biome.addStructure(NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                    
                    biome.addStructure(NIGHTSOULS_TEMPLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_TEMPLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(CRANE_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CRANE_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(DRAGON_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_FORGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(NIGHTSOULS_MANSION.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_MANSION.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));   
                    
                    biome.addStructure(MELDYA_LAKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, MELDYA_LAKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(DECUBE_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DECUBE_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(DECUBE_HOUSE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DECUBE_HOUSE2.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));                   
                    
                    biome.addStructure(FREDDY_FAZBEAR_PIZZA.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FREDDY_FAZBEAR_PIZZA.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
 			     }    
                
                if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST || 
                	  biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.DESERT || 
                	  biome.getCategory() == Biome.Category.ICY)
                	  {
             	     biome.addStructure(GRAVEYARD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                      biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, GRAVEYARD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                      
                      biome.addStructure(A_NORMAL_CHURCH.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                      biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, A_NORMAL_CHURCH.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                	  }
                
                if(biome.getCategory() == Biome.Category.PLAINS)
                  	   
                    { 
             	      biome.addStructure(ROCKET.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                       biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ROCKET.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                        .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                       
                       biome.addStructure(A_NORMAL_VILLAGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                       biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, A_NORMAL_VILLAGE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                        .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                       
                       biome.addStructure(NIGHTSOULS_BARN.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                       biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_BARN.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                        .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                       
                       biome.addStructure(BASTI_FARM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                       biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, BASTI_FARM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                        .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    }
                
                if(biome.getCategory() == Biome.Category.FOREST || biome.getCategory() == Biome.Category.TAIGA)          	   
                { 
             	   biome.addStructure(WEREWOLF_CAVE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, WEREWOLF_CAVE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));   
                }
                
                if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST ||
                   biome.getCategory() == Biome.Category.EXTREME_HILLS || biome.getCategory() == Biome.Category.SAVANNA||
                   biome.getCategory() == Biome.Category.JUNGLE || biome.getCategory() == Biome.Category.RIVER || 
                   biome.getCategory() == Biome.Category.TAIGA || biome.getCategory() == Biome.Category.DESERT || 
                   biome.getCategory() == Biome.Category.BEACH)
                {
             	   biome.addStructure(SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));     
                    
                    biome.addStructure(ODYSSEY_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ODYSSEY_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));    
                    
                    biome.addStructure(ODYSSEY_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, ODYSSEY_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));    
                    
                    biome.addStructure(PARAGONIC_CORE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, PARAGONIC_CORE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
                }
                
                if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST ||
                   biome.getCategory() == Biome.Category.EXTREME_HILLS || biome.getCategory() == Biome.Category.SAVANNA||
                   biome.getCategory() == Biome.Category.JUNGLE || biome.getCategory() == Biome.Category.RIVER || 
                   biome.getCategory() == Biome.Category.TAIGA || biome.getCategory() == Biome.Category.DESERT || 
                   biome.getCategory() == Biome.Category.BEACH || biome.getCategory() == Biome.Category.OCEAN)
                {
             	   biome.addStructure(NIGHTSOULS_FINAL_CASTLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_FINAL_CASTLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(NIGHTSOULS_FINAL_CASTLE_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_FINAL_CASTLE_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(NIGHTSOULS_ISLANDS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_ISLANDS.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(SKY_BASE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, SKY_BASE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                
                if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST || 
             	  biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.SWAMP || 
             	  biome.getCategory() == Biome.Category.EXTREME_HILLS)            	   
                { 
             	   biome.addStructure(CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(DRAGON_STATUE_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_STATUE_TOP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(DRAGON_STATUE_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_STATUE_BOTTOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                
                if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.OCEAN)    
                {
             	   biome.addStructure(DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(MIIZEAL_ALTAR.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, MIIZEAL_ALTAR.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(POWER_MOON.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, POWER_MOON.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(SAITA_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, SAITA_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(MIIZEAL_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, MIIZEAL_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(CRANE_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, CRANE_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    
                    biome.addStructure(BASTI_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, BASTI_LOOT_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                    

                }
                
                if(biome.getCategory() == Biome.Category.ICY)    
                {
             	   biome.addStructure(BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                    biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                      .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                } */
          }
    }
}
