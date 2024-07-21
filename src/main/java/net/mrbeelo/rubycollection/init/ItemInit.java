package net.mrbeelo.rubycollection.init;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.data.list.enums.RubycollectionToolMaterials;

public class ItemInit {

    public static final Item RUBY = register("ruby", new Item(new Item.Settings().maxCount(86)));
    public static final Item RUBY_INGOT = register("ruby_ingot", new Item(new Item.Settings()));
    public static final Item RUBY_CLUSTER = register("ruby_cluster", new Item(new Item.Settings()));
    public static final Item RUBY_SHARD = register("ruby_shard", new Item(new Item.Settings()));
    public static final SwordItem RUBY_SWORD = register("ruby_sword", new SwordItem(RubycollectionToolMaterials.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(RubycollectionToolMaterials.RUBY, 3, -2.4f))));
    public static final PickaxeItem RUBY_PICKAXE = register("ruby_pickaxe", new PickaxeItem(RubycollectionToolMaterials.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(RubycollectionToolMaterials.RUBY, 3, -2.4f))));
    public static final AxeItem RUBY_AXE = register("ruby_axe", new AxeItem(RubycollectionToolMaterials.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(RubycollectionToolMaterials.RUBY, 3, -2.4f))));
    public static final ShovelItem RUBY_SHOVEL = register("ruby_shovel", new ShovelItem(RubycollectionToolMaterials.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(RubycollectionToolMaterials.RUBY, 3, -2.4f))));
    public static final HoeItem RUBY_HOE = register("ruby_hoe", new HoeItem(RubycollectionToolMaterials.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(RubycollectionToolMaterials.RUBY, 3, -2.4f))));





    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Rubycollection.id(name), item);
    }

    public static void load() {}
}
