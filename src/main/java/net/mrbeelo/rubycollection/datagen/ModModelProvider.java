package net.mrbeelo.rubycollection.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.mrbeelo.rubycollection.modaddons.ModBlocks;
import net.mrbeelo.rubycollection.modaddons.custom.KokainaCropBlock;
import net.mrbeelo.rubycollection.modaddons.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RUBY_ORE);
        blockStateModelGenerator.registerCrop(ModBlocks.KOKAINA_CROP, KokainaCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PACKED_IRON_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_CLUSTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.KOKAINA, Models.GENERATED);
        itemModelGenerator.register(ModItems.KOKAINA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_KNOCKER, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));
        itemModelGenerator.register(ModItems.PURIFY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PISTOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BULLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEATH_AXE, Models.HANDHELD);
    }
}
