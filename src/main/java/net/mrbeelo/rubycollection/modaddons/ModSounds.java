package net.mrbeelo.rubycollection.modaddons;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.mrbeelo.rubycollection.Rubycollection;


public class ModSounds {

    //REGISTERING

    public static final SoundEvent RUBY_BLOCK_BREAK = register("ruby_block_break");
    public static final SoundEvent RUBY_BLOCK_STEP = register("ruby_block_step");
    public static final SoundEvent RUBY_BLOCK_PLACE = register("ruby_block_place");
    public static final SoundEvent RUBY_BLOCK_HIT = register("ruby_block_hit");
    public static final SoundEvent RUBY_BLOCK_FALL = register("ruby_block_fall");

    public static final BlockSoundGroup RUBY_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.RUBY_BLOCK_BREAK, ModSounds.RUBY_BLOCK_STEP, ModSounds.RUBY_BLOCK_PLACE,
            ModSounds.RUBY_BLOCK_HIT, ModSounds.RUBY_BLOCK_FALL);

    //METHODS

    private static SoundEvent register(String name) {
        return Registry.register(Registries.SOUND_EVENT, Rubycollection.id(name), SoundEvent.of(Rubycollection.id(name)));
    }

    public static void load() {}
}
