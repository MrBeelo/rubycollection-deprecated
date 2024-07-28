package net.mrbeelo.rubycollection.addons.util;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.mrbeelo.rubycollection.addons.block.ModBlocks;
import net.mrbeelo.rubycollection.addons.block.custom.KokainaCropBlock;
import net.mrbeelo.rubycollection.addons.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        //REGISTERING (ONLY BLOCKS THAT DROP THEMSELVES

        addDrop(ModBlocks.RUBY_BLOCK);

        LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.KOKAINA_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 3));
        addDrop(ModBlocks.KOKAINA_CROP, cropDrops(ModBlocks.KOKAINA_CROP, ModItems.KOKAINA, ModItems.KOKAINA_SEED, builder));
    }
}





