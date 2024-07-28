package net.mrbeelo.rubycollection.addons.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.mrbeelo.rubycollection.addons.effect.ModEffects;

public class ModFoods {
    public static final FoodComponent KOKAINA_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(6)
            .saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(ModEffects.HIGH, 500, 0), 1.0f)
            .build();
}
