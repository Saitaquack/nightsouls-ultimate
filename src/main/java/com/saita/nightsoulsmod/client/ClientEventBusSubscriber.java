package com.saita.nightsoulsmod.client;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NightSoulsMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
	
		RenderTypeLookup.setRenderLayer(BlockInit.SAITASTONE_CROPS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MIIZEALITE_CROPS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRANITE_CROPS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BASTIRITE_CROPS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_CROPS.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.CELESTIAL_EMERALD_BLOCK.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_POWER_MOON_BLOCK.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_POWER_MOON_BLOCK.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WHITE_POWER_MOON_BLOCK.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUE_POWER_MOON_BLOCK.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.NIGHTSOULS_FORCEFIELD.get(), RenderType.getTranslucent());
		
	}
		
}
