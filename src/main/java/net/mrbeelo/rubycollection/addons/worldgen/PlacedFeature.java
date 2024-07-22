package net.mrbeelo.rubycollection.addons.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.*;
import net.mrbeelo.rubycollection.Rubycollection;

import java.util.List;

public class PlacedFeature {
    public static final RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");

    public static void bootstrap(Registerable<net.minecraft.world.gen.feature.PlacedFeature> context) {
        RegistryEntryLookup<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_RUBY_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeature.OVERWORLD_RUBY_ORE_KEY),
                Modifiers.modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(-25), YOffset.fixed(64))));
    }

    private static RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Rubycollection.id(name));
    }

    private static void register(Registerable<net.minecraft.world.gen.feature.PlacedFeature> context,
                                 RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> key,
                                 RegistryEntry<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new net.minecraft.world.gen.feature.PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }


}
