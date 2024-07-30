package net.mrbeelo.rubycollection.modaddons.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;


public class HighEffect extends StatusEffect {
    public HighEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity pEntity, int pAmplifier) {
        super.applyUpdateEffect(pEntity, pAmplifier);
        simulateNauseaEffect(pEntity);
        return true;

        //pEntity.playSound(ModSounds.HIGH, 1000, 1);
    }

    private void simulateNauseaEffect(LivingEntity pEntity) {
        if (pEntity instanceof PlayerEntity) {

            //TRIPPY EFFECT
            float yaw = pEntity.getYaw();
            float pitch = pEntity.getPitch();
            yaw += (float) ((Math.random() - 0.5) * 7);
            pitch += (float) ((Math.random() - 0.5) * 3);
            pEntity.setYaw(yaw);
            pEntity.setPitch(pitch);

            //NAUSEA
            pEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 80, 0, false, false));
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}