package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemTomatoYellow extends Item {

    public ItemTomatoYellow() {
        super(new Properties()
                .food(new FoodProperties.Builder().nutrition(4).saturationMod( 0.3F).build())
                .rarity(Rarity.COMMON)
                .stacksTo(64)
        );
    }
}
