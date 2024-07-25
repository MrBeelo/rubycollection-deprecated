package net.mrbeelo.rubycollection.addons.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.mrbeelo.rubycollection.addons.modaddons.ModBlocks;
import net.mrbeelo.rubycollection.addons.modaddons.ModTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Blocks.RUBY_ORES)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_RUBY_ORE);


        getOrCreateTagBuilder(ModTags.Blocks.RUBY_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK)
                .addTag(ModTags.Blocks.RUBY_ORES);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.RUBY_BLOCKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(ModTags.Blocks.RUBY_BLOCKS);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK);



    }
}
