package net.mrbeelo.rubycollection.addons.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mrbeelo.rubycollection.addons.modaddons.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class SimpleBlockLootTableProvider extends FabricBlockLootTableProvider {
    public SimpleBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        //REGISTERING (ONLY BLOCKS THAT DROP THEMSELVES

        addDrop(ModBlocks.RUBY_BLOCK);
    }
}





