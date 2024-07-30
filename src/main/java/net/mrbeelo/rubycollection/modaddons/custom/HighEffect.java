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
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            simulateNauseaEffect(entity);
        }
        return true;

    }

    private void simulateNauseaEffect(LivingEntity entity) {
        if (entity instanceof PlayerEntity) {
            float yaw = entity.getYaw();
            float pitch = entity.getPitch();
            yaw += (float) ((Math.random() - 0.5) * 7);
            pitch += (float) ((Math.random() - 0.5) * 3);
            entity.setYaw(yaw);
            entity.setPitch(pitch);

            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 80, 0, false, false));
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
