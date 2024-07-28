package net.mrbeelo.rubycollection;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.addons.block.ModBlocks;
import net.mrbeelo.rubycollection.addons.effect.ModEffects;
import net.mrbeelo.rubycollection.addons.item.ModArmorMaterials;
import net.mrbeelo.rubycollection.addons.item.ModItemGroups;
import net.mrbeelo.rubycollection.addons.item.ModItems;
import net.mrbeelo.rubycollection.addons.sound.ModSounds;
import net.mrbeelo.rubycollection.addons.villager.ModCustomTrades;
import net.mrbeelo.rubycollection.addons.villager.ModVillagers;
import net.mrbeelo.rubycollection.addons.worldgen.ModBiomeModification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rubycollection implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("rubycollection");
	public static final String MOD_ID = "rubycollection";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");

		//LOAD ALL MODADDONS CLASSES (INITS)
		ModItems.load();
		ModBlocks.load();
		ModItemGroups.load();
		ModBiomeModification.load();
		ModArmorMaterials.load();
		ModSounds.load();
		ModVillagers.load();
		ModCustomTrades.load();
		ModEffects.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}