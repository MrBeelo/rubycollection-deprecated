package net.mrbeelo.rubycollection.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.mrbeelo.rubycollection.init.BlockInit;
import net.mrbeelo.rubycollection.init.ItemInit;

public class RubycollectionModelProvider extends FabricModelProvider {
    public RubycollectionModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.RUBY, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CLUSTER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_SHARD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_HOE, Models.HANDHELD);
    }
}
