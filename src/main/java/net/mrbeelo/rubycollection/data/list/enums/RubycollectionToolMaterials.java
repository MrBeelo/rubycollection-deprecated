package net.mrbeelo.rubycollection.data.list.enums;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.mrbeelo.rubycollection.data.list.TagList;
import net.mrbeelo.rubycollection.init.ItemInit;

public enum RubycollectionToolMaterials implements ToolMaterial {
    RUBY(3100, 14.0F, 6.0F, TagList.Blocks.INCORRECT_FOR_RUBY_TOOL, 15, Ingredient.ofItems(ItemInit.RUBY));


    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantablity;
    private final Ingredient repairIngredient;

    RubycollectionToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantablity, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantablity = enchantablity;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantablity;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
