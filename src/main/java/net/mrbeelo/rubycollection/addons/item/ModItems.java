package net.mrbeelo.rubycollection.addons.item;

import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.addons.block.ModBlocks;

public class ModItems {

    //REGISTERING

    public static final Item RUBY = register("ruby", new Item(new Item.Settings().maxCount(86)));
    public static final Item RUBY_INGOT = register("ruby_ingot", new Item(new Item.Settings()));
    public static final Item RUBY_CLUSTER = register("ruby_cluster", new Item(new Item.Settings()));
    public static final Item RUBY_SHARD = register("ruby_shard", new Item(new Item.Settings()));
    public static final Item KOKAINA_LEAF = register("kokaina_leaf", new Item(new Item.Settings()));
    public static final Item KOKAINA_SEED = register("kokaina_seed", new AliasedBlockItem(ModBlocks.KOKAINA_CROP, new Item.Settings()));
    public static final Item KOKAINA = register("kokaina", new Item(new Item.Settings().maxCount(16).food(ModFoods.KOKAINA_COMPONENT)));
    public static final SwordItem RUBY_SWORD = register("ruby_sword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 3, -2.4f)))); //2 BONUS DMG INSTEAD OF 1
    public static final PickaxeItem RUBY_PICKAXE = register("ruby_pickaxe", new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 0, -2.8f))));
    public static final AxeItem RUBY_AXE = register("ruby_axe", new AxeItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 5, -2.9f)))); //2 BONUS DMG INSTEAD OF 1
    public static final ShovelItem RUBY_SHOVEL = register("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 0.5f, -3f))));
    public static final HoeItem RUBY_HOE = register("ruby_hoe", new HoeItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -6f, 0f))));
    public static final ArmorItem RUBY_HELMET = register("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final ArmorItem RUBY_CHESTPLATE = register("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final ArmorItem RUBY_LEGGINGS = register("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final ArmorItem RUBY_BOOTS = register("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));
    public static final SwordItem RUBY_KNOCKER = register("ruby_knocker", new SwordItem(ModToolMaterials.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 1, -2)).attributeModifiers(AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(Rubycollection.id("knockback_modifier"), 10.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())));




    //METHODS

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Rubycollection.id(name), item);
    }

    public static void load() {}
}
