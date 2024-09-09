package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemOrichalconIngot extends Item {

    public ItemOrichalconIngot() {
        super(new Properties()
                .rarity(Rarity.EPIC)
                .stacksTo(64)
        );
    }
}
