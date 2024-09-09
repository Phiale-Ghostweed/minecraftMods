package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemSilverNugget extends Item {
    public ItemSilverNugget() {
        super(new Properties()
                .rarity(Rarity.COMMON)
                .stacksTo(64)
        );
    }
}
