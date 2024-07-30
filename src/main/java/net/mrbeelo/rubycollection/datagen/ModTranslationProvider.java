package net.mrbeelo.rubycollection.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.village.VillagerProfession;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.modaddons.ModBlocks;
import net.mrbeelo.rubycollection.modaddons.ModEffects;
import net.mrbeelo.rubycollection.modaddons.ModItemGroups;
import net.mrbeelo.rubycollection.modaddons.ModItems;
import net.mrbeelo.rubycollection.modaddons.ModSounds;
import net.mrbeelo.rubycollection.modaddons.ModVillagers;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import net.minecraft.sound.SoundEvent;

public class ModTranslationProvider extends FabricLanguageProvider {
    public ModTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            Rubycollection.LOGGER.warn("Cannot translate text: {}", text.getString());
        }
    }

    private static void addSoundEvent(@NotNull TranslationBuilder builder, @NotNull SoundEvent soundEvent, @NotNull String value) {
        String key = "sound." + soundEvent.getId().toString().replace(":", ".");
        builder.add(key, value);
    }

    private static void addVillager(@NotNull TranslationBuilder builder, @NotNull VillagerProfession villagerProfession, @NotNull String value) {
        String key = "entity.minecraft.villager." + villagerProfession.id();
        builder.add(key, value);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.RUBY_INGOT, "Ruby Ingot");
        translationBuilder.add(ModItems.RUBY_CLUSTER, "Ruby Cluster");
        translationBuilder.add(ModItems.RUBY_SHARD, "Ruby Shard");
        translationBuilder.add(ModItems.KOKAINA, "Kokaina");
        translationBuilder.add(ModItems.KOKAINA_SEED, "Kokaina Seed");
        translationBuilder.add(ModItems.KOKAINA_LEAF, "Kokaina Leaf");
        translationBuilder.add(ModItems.RUBY_KNOCKER, "Overly named device featuring retractable hand able of pushing living entities away from entity using device");
        translationBuilder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ModItems.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(ModItems.RUBY_HELMET, "Ruby Helmet");
        translationBuilder.add(ModItems.RUBY_CHESTPLATE, "Ruby Chestplate");
        translationBuilder.add(ModItems.RUBY_LEGGINGS, "Ruby Leggings");
        translationBuilder.add(ModItems.RUBY_BOOTS, "Ruby Boots");
        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        translationBuilder.add(ModBlocks.NETHER_RUBY_ORE, "Nether Ruby Ore");
        translationBuilder.add(ModBlocks.END_RUBY_ORE, "End Ruby Ore");
        translationBuilder.add(ModEffects.HIGH.value(), "High");
        translationBuilder.add(ModEffects.HIGH_INITIALIZER.value(), "High Sound");
        addSoundEvent(translationBuilder, ModSounds.RUBY_BLOCK_BREAK, "Ruby Block Broken");
        addSoundEvent(translationBuilder, ModSounds.RUBY_BLOCK_FALL, "Ruby Block Fallen");
        addSoundEvent(translationBuilder, ModSounds.RUBY_BLOCK_HIT, "Ruby Block Hit");
        addSoundEvent(translationBuilder, ModSounds.RUBY_BLOCK_STEP, "Ruby Block Stepped On");
        addSoundEvent(translationBuilder, ModSounds.RUBY_BLOCK_PLACE, "Ruby Block Placed");
        addSoundEvent(translationBuilder, ModSounds.HIGH, "High Person Running");
        addText(translationBuilder, ModItemGroups.RUBY_TITLE, "The Ruby Collection");
        addVillager(translationBuilder, ModVillagers.RUBERT, "Rubert");
    }
}


