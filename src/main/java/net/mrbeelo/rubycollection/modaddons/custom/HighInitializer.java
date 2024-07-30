package net.mrbeelo.rubycollection.modaddons.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.mrbeelo.rubycollection.modaddons.ModEffects;
import net.mrbeelo.rubycollection.modaddons.ModSounds;

public class HighInitializer extends StatusEffect {
    public HighInitializer(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // Apply the effect every tick
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            entity.playSound(ModSounds.HIGH, 100, 1);
            entity.addStatusEffect(new StatusEffectInstance(ModEffects.HIGH, 460, 0));
        }
        return false;
    }
}
