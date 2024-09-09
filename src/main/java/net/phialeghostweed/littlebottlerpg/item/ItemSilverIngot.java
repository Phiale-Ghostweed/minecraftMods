package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemSilverIngot extends Item {
    public ItemSilverIngot() {
        super(new Properties()
                .rarity(Rarity.COMMON)
                .stacksTo(64)
        );
    }
}
