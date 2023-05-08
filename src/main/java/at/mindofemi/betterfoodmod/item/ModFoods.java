package at.mindofemi.betterfoodmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties GREEN_LEAVES = (new FoodProperties.Builder()).alwaysEat().nutrition(20).saturationMod(20f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.HEAL, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 4), 1.0F).build();

}
