package net.mrbeelo.rubycollection.modaddons.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.mrbeelo.rubycollection.modaddons.ModEffects;
import net.mrbeelo.rubycollection.modaddons.ModSounds;

public class HighInitializer extends StatusEffect {
    public HighInitializer(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).playSound(ModSounds.HIGH, 1000, 1);
            entity.addStatusEffect(new StatusEffectInstance(ModEffects.HIGH, 460, 0));

        }
        return false;
    }
}
