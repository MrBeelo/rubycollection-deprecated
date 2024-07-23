package net.mrbeelo.rubycollection.addons.modaddons;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.mrbeelo.rubycollection.addons.providers.worldgen.PlacedFeature;

public class ModBiomeModification {
    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeature.OVERWORLD_RUBY_ORE_KEY
        );
    }
}
