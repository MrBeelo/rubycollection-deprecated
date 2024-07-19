package net.mrbeelo.rubycollection;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mrbeelo.rubycollection.data.provider.*;

public class RubycollectionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RubycollectionModelProvider::new);
		pack.addProvider(RubycollectionEnglishLanguageProvider::new);
		pack.addProvider(RubycollectionBlockLootTableProvider::new);
		pack.addProvider(RubycollectionBlockTagProvider::new);
		pack.addProvider(RubycollectionRecipeProvider::new);
	}
}
