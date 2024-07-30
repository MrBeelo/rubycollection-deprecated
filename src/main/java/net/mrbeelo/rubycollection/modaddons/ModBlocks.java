package net.mrbeelo.rubycollection.modaddons;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.modaddons.custom.KokainaCropBlock;

public class ModBlocks {

    //REGISTERING

    public static final Block RUBY_BLOCK = registerWithItem("ruby_block", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK).sounds(ModSounds.RUBY_BLOCK_SOUNDS)));
    public static final Block RUBY_ORE = registerWithItem("ruby_ore", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerWithItem("deepslate_ruby_ore", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block NETHER_RUBY_ORE = registerWithItem("nether_ruby_ore", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block END_RUBY_ORE = registerWithItem("end_ruby_ore", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block KOKAINA_CROP = Registry.register(Registries.BLOCK, Rubycollection.id("kokaina_crop"), new KokainaCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    //METHODS

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, Rubycollection.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        Item.Settings updatedSettings = settings.maxCount(99);
        ModItems.register(name, new BlockItem(registered, updatedSettings));
        return registered;
    }


    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {
    }
}
