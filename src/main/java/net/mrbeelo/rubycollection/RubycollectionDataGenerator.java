package net.mrbeelo.rubycollection;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.mrbeelo.rubycollection.data.generator.RubycollectionWorldGenerator;
import net.mrbeelo.rubycollection.data.provider.*;
import net.mrbeelo.rubycollection.init.worldgen.ConfiguredFeatureInit;
import net.mrbeelo.rubycollection.init.worldgen.PlacedFeatureInit;

public class RubycollectionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RubycollectionModelProvider::new);
		pack.addProvider(RubycollectionEnglishLanguageProvider::new);
		pack.addProvider(RubycollectionBlockLootTableProvider::new);
		pack.addProvider(RubycollectionBlockTagProvider::new);
		pack.addProvider(RubycollectionRecipeProvider::new);
		pack.addProvider(RubycollectionWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
