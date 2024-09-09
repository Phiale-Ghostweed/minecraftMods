package net.phialeghostweed.littlebottlerpg.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemMithrilNugget extends Item {
    public ItemMithrilNugget() {
        super(new Properties()
                .rarity(Rarity.EPIC)
                .stacksTo(64)
        );
    }
}
