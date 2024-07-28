package net.mrbeelo.rubycollection.addons.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.mrbeelo.rubycollection.Rubycollection;
import net.mrbeelo.rubycollection.addons.effect.custom.HighEffect;

public class ModEffects {

    // Define your StatusEffect as a RegistryEntry
    public static final RegistryEntry<StatusEffect> HIGH = register("high", new HighEffect(StatusEffectCategory.HARMFUL, 3124687));

    /**
     * Registers a StatusEffect and returns it as a RegistryEntry.
     *
     * @param name The name of the effect.
     * @param effect The StatusEffect instance.
     * @return The RegistryEntry for the StatusEffect.
     */
    private static RegistryEntry<StatusEffect> register(String name, StatusEffect effect) {
        // Register the StatusEffect
        Identifier id = Rubycollection.id(name);
        RegistryEntry<StatusEffect> entry = RegistryEntry.of(effect);
        Registry.register(Registries.STATUS_EFFECT, id, effect);
        return entry;
    }

    /**
     * Loads all the mod's status effects.
     */
    public static void load() {
        // Any additional setup or registration tasks if needed
    }
}
