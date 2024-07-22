package net.mrbeelo.rubycollection.addons.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.addons.modaddons.ModBlocks;

import java.util.List;

public class ConfiguredFeature {
    public static final RegistryKey<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");

    public static void bootstrap(Registerable<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldRubyTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyTargets, 5, 0.5F));


    }

    private static RegistryKey<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Rubycollection.id(name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC featureConfig) {
        context.register(key, new net.minecraft.world.gen.feature.ConfiguredFeature<>(feature, featureConfig));
    }
}
