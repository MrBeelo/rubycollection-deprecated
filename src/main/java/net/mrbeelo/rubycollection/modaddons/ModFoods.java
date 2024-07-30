package net.mrbeelo.rubycollection.modaddons;

import net.minecraft.component.type.FoodComponent;

import net.minecraft.entity.effect.StatusEffectInstance;

public class ModFoods {
    public static final FoodComponent KOKAINA_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(6)
            .saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(ModEffects.HIGH_INITIALIZER, 3, 0, false, false), 1.0f)
            .build();
}


