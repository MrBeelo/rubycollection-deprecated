package net.mrbeelo.rubycollection;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.addons.modaddons.ModBlocks;
import net.mrbeelo.rubycollection.addons.modaddons.ModItemGroups;
import net.mrbeelo.rubycollection.addons.modaddons.ModItems;
import net.mrbeelo.rubycollection.addons.worldgen.BiomeModification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rubycollection implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("rubycollection");
	public static final String MOD_ID = "rubycollection";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ModItems.load();
		ModBlocks.load();
		ModItemGroups.load();
		BiomeModification.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}