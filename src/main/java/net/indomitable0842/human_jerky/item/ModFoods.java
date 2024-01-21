package net.indomitable0842.human_jerky.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties HUMAN_JERKY = new FoodProperties.Builder().meat().nutrition(9)
            .saturationMod(.9f).build();
    public static final FoodProperties RAW_HUMAN_JERKY = new FoodProperties.Builder().meat().nutrition(4)
            .saturationMod(.4f).build();

}
