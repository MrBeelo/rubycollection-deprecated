package net.mrbeelo.rubycollection.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mrbeelo.rubycollection.Rubycollection;

public class BlockInit {
    public static final Block RUBY_BLOCK = registerWithItem("ruby_block", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));


    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, Rubycollection.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {
    }
}
