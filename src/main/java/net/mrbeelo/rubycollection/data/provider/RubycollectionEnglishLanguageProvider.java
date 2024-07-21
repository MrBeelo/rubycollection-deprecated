package net.mrbeelo.rubycollection.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.init.BlockInit;
import net.mrbeelo.rubycollection.init.ItemGroupInit;
import net.mrbeelo.rubycollection.init.ItemInit;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RubycollectionEnglishLanguageProvider extends FabricLanguageProvider {
    public RubycollectionEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }


    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            Rubycollection.LOGGER.warn("Cannot translate text: {}", text.getString());
        }

    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.RUBY, "Ruby");
        translationBuilder.add(ItemInit.RUBY_INGOT, "Ruby Ingot");
        translationBuilder.add(ItemInit.RUBY_CLUSTER, "Ruby Cluster");
        translationBuilder.add(ItemInit.RUBY_SHARD, "Ruby Shard");
        translationBuilder.add(ItemInit.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ItemInit.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ItemInit.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ItemInit.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ItemInit.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(BlockInit.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(BlockInit.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(BlockInit.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        addText(translationBuilder, ItemGroupInit.RUBY_TITLE, "The Ruby Collection");

    }
}
