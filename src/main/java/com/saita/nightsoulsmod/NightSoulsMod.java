package com.saita.nightsoulsmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.saita.nightsoulsmod.common.world.*;
import com.saita.nightsoulsmod.core.init.*;


@Mod(NightSoulsMod.MOD_ID)
public class NightSoulsMod
{
	public static final String MOD_ID = "nightsouls";
    public static final Logger LOGGER = LogManager.getLogger();

    public NightSoulsMod() {
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		SoundInit.SOUNDS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	LOGGER.info("Hello from NightSouls Mod Ultimate 1.2!");
    	LOGGER.info("Loading Star Gatherer's powers...");
    	LOGGER.info("Loading Hellfire Emperor's reign...");
    	LOGGER.info("Loading Hallowed Paladin's might...");
    	LOGGER.info("Loading Reality Warper's script...");
    	OreGen.generateOres();
    	StructureInit.addToBiomes();   	    	
    }
       
    public static class NightSoulsItemGroup extends ItemGroup
    {
    	public static final NightSoulsItemGroup instance = new NightSoulsItemGroup(ItemGroup.GROUPS.length, "NightSoulsTab");
    	private NightSoulsItemGroup(int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.NIGHT_SOUL.get());
    	}
    }
    
    public static class NightSoulsFinalsItemGroup extends ItemGroup
    {
    	public static final NightSoulsFinalsItemGroup instance = new NightSoulsFinalsItemGroup(ItemGroup.GROUPS.length, "NightSoulsFinalsTab");
    	private NightSoulsFinalsItemGroup(int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.GALACTIC_SLAYER.get());
    	}
    }
    
    public static class NightSoulsDiscsItemGroup extends ItemGroup
    {
    	public static final NightSoulsDiscsItemGroup instance = new NightSoulsDiscsItemGroup(ItemGroup.GROUPS.length, "NightSoulsDiscsTab");
    	private NightSoulsDiscsItemGroup(int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.MARIO_GALAXY_SKY_STATION_MUSIC_DISC.get());
    	}
    }
    
    public static class ParagonItemGroup extends ItemGroup
    {
    	public static final ParagonItemGroup instance = new ParagonItemGroup(ItemGroup.GROUPS.length, "ParagonTab");
    	private ParagonItemGroup(int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.PARAGONIC_BLOCK.get());
    	}
    }

}
