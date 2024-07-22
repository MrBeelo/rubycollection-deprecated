package net.mrbeelo.rubycollection;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.mrbeelo.rubycollection.addons.datagen.*;
import net.mrbeelo.rubycollection.addons.worldgen.WorldGenerator;
import net.mrbeelo.rubycollection.addons.worldgen.ConfiguredFeature;
import net.mrbeelo.rubycollection.addons.worldgen.PlacedFeature;


public class RubycollectionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RubycollectionModelDatagen::new);
		pack.addProvider(RubycollectionEnglishLanguageDatagen::new);
		pack.addProvider(RubycollectionBlockLootTableDatagen::new);
		pack.addProvider(RubycollectionBlockTagDatagen::new);
		pack.addProvider(RubycollectionRecipeDatagen::new);
		pack.addProvider(WorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeature::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeature::bootstrap);
	}
}
