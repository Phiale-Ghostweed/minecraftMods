package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemTomatoRed extends Item {

    public ItemTomatoRed() {
        super(new Properties()
                .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build())
                .rarity(Rarity.COMMON)
                .stacksTo(64)
        );
    }
}
