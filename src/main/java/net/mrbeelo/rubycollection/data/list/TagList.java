package net.mrbeelo.rubycollection.data.list;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.mrbeelo.rubycollection.Rubycollection;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.of(RegistryKeys.BLOCK, Rubycollection.id("incorrect_for_ruby_tool"));
    }
}
