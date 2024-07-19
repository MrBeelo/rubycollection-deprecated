package net.mrbeelo.rubycollection.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mrbeelo.rubycollection.init.BlockInit;

import java.util.concurrent.CompletableFuture;

public class RubycollectionBlockLootTableProvider extends FabricBlockLootTableProvider {
    public RubycollectionBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.RUBY_BLOCK);

    }
}
