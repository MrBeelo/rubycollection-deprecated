package net.mrbeelo.rubycollection.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.init.BlockInit;
import net.mrbeelo.rubycollection.init.ItemInit;

import java.util.concurrent.CompletableFuture;

public class RubycollectionRecipeProvider extends FabricRecipeProvider {
    public RubycollectionRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlockInit.RUBY_BLOCK, 1)
                .input('E', ItemInit.RUBY)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter, Rubycollection.id("ruby_block_from_rubies"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY, 9)
                .input(BlockInit.RUBY_BLOCK)
                .criterion(hasItem(BlockInit.RUBY_BLOCK), conditionsFromItem(BlockInit.RUBY_BLOCK))
                .offerTo(exporter, Rubycollection.id("rubies_from_ruby_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY_INGOT, 1)
                .input('E', ItemInit.RUBY)
                .pattern(" E ")
                .pattern("EEE")
                .pattern(" E ")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter, Rubycollection.id("ruby_ingot_from_rubies"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY, 5)
                .input(ItemInit.RUBY_INGOT)
                .criterion(hasItem(ItemInit.RUBY_INGOT), conditionsFromItem(ItemInit.RUBY_INGOT))
                .offerTo(exporter, Rubycollection.id("rubies_from_ruby_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY_CLUSTER, 1)
                .input('E', ItemInit.RUBY_INGOT)
                .pattern(" E ")
                .pattern("EEE")
                .pattern(" E ")
                .criterion(hasItem(ItemInit.RUBY_INGOT), conditionsFromItem(ItemInit.RUBY_INGOT))
                .offerTo(exporter, Rubycollection.id("ruby_cluster_from_ruby_ingots"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY_INGOT, 5)
                .input(ItemInit.RUBY_CLUSTER)
                .criterion(hasItem(ItemInit.RUBY_CLUSTER), conditionsFromItem(ItemInit.RUBY_CLUSTER))
                .offerTo(exporter, Rubycollection.id("ruby_ingots_from_ruby_cluster"));
    }


}
