package net.mrbeelo.rubycollection.addons.modaddons;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.mrbeelo.rubycollection.Rubycollection;

public class ModTags {

    //REGISTERING (GENERAL)

    public static class Blocks {

        //REGISTERING (CORRECT WITH BLOCKS)

        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.of(RegistryKeys.BLOCK, Rubycollection.id("incorrect_for_ruby_tool"));
    }
}
