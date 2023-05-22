package at.mindofemi.betterfoodmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties GREEN_LEAVES = (new FoodProperties.Builder()).alwaysEat().nutrition(20).saturationMod(20f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.HEAL, 200, 1000), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 200, 2), 1.0F).build();
    public static final FoodProperties POMMES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties PATTY = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).meat().build();
    public static final FoodProperties HAM = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).meat().build();
    public static final FoodProperties HAMBURGER = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).meat().build();
    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties PIZZA = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties TORTILLIA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties WRAP = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.5F).build();
    public static final FoodProperties RICEBOWL = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).build();

}
