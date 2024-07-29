package net.mrbeelo.rubycollection.modaddons;

import net.minecraft.component.type.FoodComponent;

import net.minecraft.entity.effect.StatusEffectInstance;

public class ModFoods {
    public static final FoodComponent KOKAINA_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(6)
            .saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(ModEffects.HIGH, 460, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.HIGH_SOUND, 3, 0), 1.0f)
            .build();
}


