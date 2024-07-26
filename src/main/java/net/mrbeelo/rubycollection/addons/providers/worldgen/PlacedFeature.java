package net.mrbeelo.rubycollection.addons.providers.worldgen;

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

    //REGISTERING

    public static final RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");
    public static final RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");

    public static void bootstrap(Registerable<net.minecraft.world.gen.feature.PlacedFeature> context) {
        RegistryEntryLookup<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_RUBY_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeature.OVERWORLD_RUBY_ORE_KEY),
                Modifiers.modifiersCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(-24), YOffset.fixed(64))));

        register(context, NETHER_RUBY_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeature.NETHER_RUBY_ORE_KEY),
                Modifiers.modifiersCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, END_RUBY_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeature.END_RUBY_ORE_KEY),
                Modifiers.modifiersCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
    }

    //METHODS

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

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }


}
