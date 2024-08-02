package net.mrbeelo.rubycollection.modaddons.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.mrbeelo.rubycollection.modaddons.ModSounds;

public class DeathAxe extends AxeItem {
    public DeathAxe(Settings settings) {
        super(ToolMaterials.IRON, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.getWorld().playSound(null, attacker.getX(), attacker.getY(), attacker.getZ(), SoundEvents.BLOCK_ANVIL_LAND, attacker.getSoundCategory(), 4.0F, 1.0F);
        stack.decrement(1);
        return true;
    }
}
