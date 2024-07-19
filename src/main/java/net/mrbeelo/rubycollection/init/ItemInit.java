package net.mrbeelo.rubycollection.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.Rubycollection;

public class ItemInit {

    public static final Item RUBY = register("ruby", new Item(new Item.Settings().maxCount(86)));
    public static final Item RUBY_INGOT = register("ruby_ingot", new Item(new Item.Settings()));
    public static final Item RUBY_CLUSTER = register("ruby_cluster", new Item(new Item.Settings()));
    public static final BlockItem RUBY_BLOCK = register("ruby_block", new BlockItem(BlockInit.RUBY_BLOCK, new Item.Settings()));



    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Rubycollection.id(name), item);
    }

    public static void load() {}
}
