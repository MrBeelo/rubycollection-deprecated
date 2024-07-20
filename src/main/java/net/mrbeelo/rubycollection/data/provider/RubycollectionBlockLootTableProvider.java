package net.mrbeelo.rubycollection.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ExplosionDecayLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mrbeelo.rubycollection.init.BlockInit;
import net.mrbeelo.rubycollection.init.ItemInit;

import java.util.concurrent.CompletableFuture;

public class RubycollectionBlockLootTableProvider extends FabricBlockLootTableProvider {
    public RubycollectionBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.RUBY_BLOCK);
        addDrop(BlockInit.RUBY_ORE, (block) -> createSimpleDrop(block, ItemInit.RUBY));
        addDrop(BlockInit.DEEPSLATE_RUBY_ORE, (block) -> createSimpleDrop(block, ItemInit.RUBY));
    }

    protected LootTable.Builder createSimpleDrop(Block block, Item item) {
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(item)
                                .apply(ExplosionDecayLootFunction.builder())));
    }
}





