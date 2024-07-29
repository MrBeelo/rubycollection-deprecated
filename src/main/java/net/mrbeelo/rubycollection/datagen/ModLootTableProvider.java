package net.mrbeelo.rubycollection.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.mrbeelo.rubycollection.modaddons.ModBlocks;
import net.mrbeelo.rubycollection.modaddons.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        //REGISTERING (ONLY BLOCKS THAT DROP THEMSELVES

        addDrop(ModBlocks.RUBY_BLOCK);
    }
}





