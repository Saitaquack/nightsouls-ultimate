package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
	
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, NightSoulsMod.MOD_ID);
	
	public static final RegistryObject<SoundEvent> SUPER_STAR = SOUNDS.register("super_star", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "super_star")));
	
	public static final RegistryObject<SoundEvent> MOLTEN_CORE = SOUNDS.register("molten_core", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "molten_core")));
	
	public static final RegistryObject<SoundEvent> WRAITH_FORM = SOUNDS.register("wraith_form", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "wraith_form")));
	
	public static final RegistryObject<SoundEvent> TAKE_A_BREATHER = SOUNDS.register("take_a_breather", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "take_a_breather")));
	
	public static final RegistryObject<SoundEvent> AMP_IT_UP = SOUNDS.register("amp_it_up", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "amp_it_up")));
	
	public static final RegistryObject<SoundEvent> LIFE_CRYSTAL = SOUNDS.register("life_crystal", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "life_crystal")));
	
	public static final RegistryObject<SoundEvent> SALUT = SOUNDS.register("salut", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "salut")));
	
	public static final RegistryObject<SoundEvent> MAGIC_MIRROR = SOUNDS.register("magic_mirror", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "magic_mirror")));
	
	public static final RegistryObject<SoundEvent> STAR_BIT = SOUNDS.register("star_bit", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "star_bit")));

	public static final RegistryObject<SoundEvent> TIME_SKIP = SOUNDS.register("time_skip", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "time_skip")));
	
	public static final RegistryObject<SoundEvent> INSTANT_POTION = SOUNDS.register("instant_potion", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "instant_potion")));
	
	public static final RegistryObject<SoundEvent> FADE = SOUNDS.register("fade", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "fade")));
	
	public static final RegistryObject<SoundEvent> ADAPTIVE_SHIELD = SOUNDS.register("adaptive_shield", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "adaptive_shield")));
	
	public static final RegistryObject<SoundEvent> TAGUEULE = SOUNDS.register("tagueule", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "tagueule")));
	
	public static final RegistryObject<SoundEvent> SOUND_BARRIER = SOUNDS.register("sound_barrier", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "sound_barrier")));
	
	public static final RegistryObject<SoundEvent> NANO_BOOST = SOUNDS.register("nano_boost", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "nano_boost")));
	
	public static final RegistryObject<SoundEvent> PRIMAL_RAGE = SOUNDS.register("primal_rage", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "primal_rage")));
	
	public static final RegistryObject<SoundEvent> NIGHTSOULS_CHARM = SOUNDS.register("nightsouls_charm", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_charm")));
	
	public static final RegistryObject<SoundEvent> SPEEDING = SOUNDS.register("speeding", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "speeding")));
	
	public static final RegistryObject<SoundEvent> HEALING = SOUNDS.register("healing", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "healing")));
	
	public static final RegistryObject<SoundEvent> FORTIFY = SOUNDS.register("fortify", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "fortify")));
	
	public static final RegistryObject<SoundEvent> BLINK = SOUNDS.register("blink", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "blink")));
	
	public static final RegistryObject<SoundEvent> REQUIEM = SOUNDS.register("requiem", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "requiem")));
	
	public static final RegistryObject<SoundEvent> DOPPIO = SOUNDS.register("doppio", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "doppio")));
	
	
	//Armes 
	
	public static final RegistryObject<SoundEvent> HAMMER = SOUNDS.register("hammer", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "hammer")));
	
	public static final RegistryObject<SoundEvent> WARAXE = SOUNDS.register("waraxe", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "waraxe")));
	
	public static final RegistryObject<SoundEvent> HELLFIRE_EMPEROR_TRIDENT = SOUNDS.register("hellfire_emperor_trident", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "hellfire_emperor_trident")));
	
	public static final RegistryObject<SoundEvent> SOUL_STEALER = SOUNDS.register("soul_stealer", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "soul_stealer")));
	
	public static final RegistryObject<SoundEvent> FROSTBURN = SOUNDS.register("frostburn", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "frostburn")));
	
	public static final RegistryObject<SoundEvent> GALACTIC_SLAYER = SOUNDS.register("galactic_slayer", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "galactic_slayer")));
	
	public static final RegistryObject<SoundEvent> JAVA_FURY = SOUNDS.register("java_fury", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "java_fury")));
	
	public static final RegistryObject<SoundEvent> BOW_SER = SOUNDS.register("bow_ser", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "bow_ser")));
	
	public static final RegistryObject<SoundEvent> BOWSER_LAUGH = SOUNDS.register("bowser_laugh", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "bowser_laugh")));
	
	public static final RegistryObject<SoundEvent> BLOODZEAL = SOUNDS.register("bloodzeal", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "bloodzeal")));
	
	public static final RegistryObject<SoundEvent> SUPERNOVA = SOUNDS.register("supernova", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "supernova")));
	
	public static final RegistryObject<SoundEvent> HEXADECIMATOR = SOUNDS.register("hexadecimator", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "hexadecimator")));
	
	public static final RegistryObject<SoundEvent> DIVINE_SANCTION = SOUNDS.register("divine_sanction", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "divine_sanction")));
	
	
	//Musiques
	
	public static final Lazy<SoundEvent> MARIO_GALAXY_SKY_STATION = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mario_galaxy_sky_station")));
	
	public static final Lazy<SoundEvent> MARIO_GALAXY_CREDITS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mario_galaxy_credits")));
	
	public static final Lazy<SoundEvent> HOPES_AND_DREAMS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "hopes_and_dreams")));
	
	public static final Lazy<SoundEvent> TOTO_AFRICA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "toto_africa")));
	
	public static final Lazy<SoundEvent> KIRA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "kira")));
	
	public static final Lazy<SoundEvent> NOUNOURS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "nounours")));
	
	public static final Lazy<SoundEvent> AWAKEN = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "awaken")));
	
	public static final Lazy<SoundEvent> INFOGRAMES = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "infogrames")));
	
	public static final Lazy<SoundEvent> PYRO_BARBARE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "pyro_barbare")));
	
	public static final Lazy<SoundEvent> MINECRAFT = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "minecraft")));
	
	public static final Lazy<SoundEvent> MY_WAR = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "my_war")));
	
	public static final Lazy<SoundEvent> BOWSER = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "bowser")));
	
	public static final Lazy<SoundEvent> OBSERVATORY = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "observatory")));
	
	public static final Lazy<SoundEvent> STARSHIP = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "starship")));
	
	public static final Lazy<SoundEvent> GUSTY_GARDEN = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "gusty_garden")));
	
	public static final Lazy<SoundEvent> GOOD_EGG_GALAXY = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "good_egg_galaxy")));
	
	public static final Lazy<SoundEvent> SAITA_FINAL_THEME = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "saita_final_theme")));
	
	public static final Lazy<SoundEvent> MIIZEAL_FINAL_THEME = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "miizeal_final_theme")));
	
	public static final Lazy<SoundEvent> CRANE_FINAL_THEME = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "crane_final_theme")));
	
	public static final Lazy<SoundEvent> BASTI_FINAL_THEME = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "basti_final_theme")));
	
	public static final Lazy<SoundEvent> FNAF_ONE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "fnaf_one")));
	
	public static final Lazy<SoundEvent> FNAF_TWO = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "fnaf_two")));
	
	public static final Lazy<SoundEvent> UNDYNE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "undyne")));
	
	public static final Lazy<SoundEvent> ASGORE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "asgore")));
	
	public static final Lazy<SoundEvent> MAMA_LAUDA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mama_lauda")));
	
	public static final Lazy<SoundEvent> ASHES_ON_THE_FIRE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "ashes_on_the_fire")));
	
	public static final Lazy<SoundEvent> MEGALOVANIA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "megalovania")));
	
	public static final Lazy<SoundEvent> FANTA_BOB_SHOW = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "fanta_bob_show")));
	
	public static final Lazy<SoundEvent> MICKIE_KRAUSE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mickie_krause")));
	
	public static final Lazy<SoundEvent> REVENGE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "revenge")));
	
	public static final Lazy<SoundEvent> JEVIL = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "jevil")));
	
	public static final Lazy<SoundEvent> BURNING_COLOSSEUM = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "burning_colosseum")));
	
	public static final Lazy<SoundEvent> AVALON = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "avalon")));
	
	public static final Lazy<SoundEvent> DIAVOLO = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "diavolo")));
	
	public static final Lazy<SoundEvent> REDACTED = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "redacted")));
	
	public static final Lazy<SoundEvent> GIORNO = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "giorno")));
	
	public static final Lazy<SoundEvent> JOTARO = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "jotaro")));
	
	public static final Lazy<SoundEvent> JOSUKE = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "josuke")));
	
	public static final Lazy<SoundEvent> UNALTRA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "unaltra")));
	
	public static final Lazy<SoundEvent> NIGHT_TOWN = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "night_town")));
	
	public static final Lazy<SoundEvent> PRIME = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "prime")));
	
	public static final Lazy<SoundEvent> EQUILA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "equila")));
		
	public static final Lazy<SoundEvent> THEROX = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "therox")));
	
	public static final Lazy<SoundEvent> MAGASIN = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "magasin")));
	
	public static final Lazy<SoundEvent> KORO = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "koro")));
	
	public static final Lazy<SoundEvent> PARAGON = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "paragon")));
	
}
