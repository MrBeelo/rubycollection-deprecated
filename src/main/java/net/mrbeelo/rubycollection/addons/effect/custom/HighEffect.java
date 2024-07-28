package net.mrbeelo.rubycollection.addons.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class HighEffect extends StatusEffect {

    public HighEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();

            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 5, false, false));
            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1, false, false));
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
