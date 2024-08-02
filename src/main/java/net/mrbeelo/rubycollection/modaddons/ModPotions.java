package net.mrbeelo.rubycollection.modaddons;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.mrbeelo.rubycollection.Rubycollection;

public class ModPotions {
    public static final Potion KOKAINA_POTION = register("kokaina_potion", new Potion(new StatusEffectInstance(ModEffects.HIGH, 460, 0)));

    public static <T extends Potion> T register(String name, T potion) {
        return Registry.register(Registries.POTION, Rubycollection.id(name), potion);
    }

    public static void load() {}
}
