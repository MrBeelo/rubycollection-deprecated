package net.mrbeelo.rubycollection;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.init.BlockInit;
import net.mrbeelo.rubycollection.init.ItemGroupInit;
import net.mrbeelo.rubycollection.init.ItemInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rubycollection implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("rubycollection");
	public static final String MOD_ID = "rubycollection";

	@Override
	public void onInitialize() {
		LOGGER.info("ok me loading");
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}