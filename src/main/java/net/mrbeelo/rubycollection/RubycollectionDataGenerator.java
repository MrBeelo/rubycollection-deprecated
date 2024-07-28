package net.mrbeelo.rubycollection;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.mrbeelo.rubycollection.addons.block.BlockTagProvider;
import net.mrbeelo.rubycollection.addons.util.LootTableProvider;
import net.mrbeelo.rubycollection.addons.item.ItemTagProvider;
import net.mrbeelo.rubycollection.addons.worldgen.WorldGeneratorProvider;
import net.mrbeelo.rubycollection.addons.util.EnglishTranslationProvider;
import net.mrbeelo.rubycollection.addons.util.ModelProvider;
import net.mrbeelo.rubycollection.addons.util.RecipeProvider;
import net.mrbeelo.rubycollection.addons.villager.PoiTagProvider;
import net.mrbeelo.rubycollection.addons.worldgen.ConfiguredFeature;
import net.mrbeelo.rubycollection.addons.worldgen.PlacedFeature;


public class RubycollectionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelProvider::new);
		pack.addProvider(EnglishTranslationProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(WorldGeneratorProvider::new);
		pack.addProvider(PoiTagProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeature::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeature::bootstrap);
	}
}
