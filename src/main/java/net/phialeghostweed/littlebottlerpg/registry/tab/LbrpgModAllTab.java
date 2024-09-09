package net.phialeghostweed.littlebottlerpg.registry.tab;

import net.minecraft.world.item.Item;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModBlocks;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModItems;

public class LbrpgModAllTab {
    public static final Item[] items = {
            //Crop
            LbrpgModItems.TOMATO_RED.get(),
            LbrpgModItems.TOMATO_YELLOW.get(),
            LbrpgModItems.TOMATO_ORANGE.get(),
            LbrpgModItems.TOMATO_BLACK.get(),
            LbrpgModItems.LOVE_FRUIT.get(),
            //Silver
            LbrpgModItems.SILVER_NUGGET.get(),
            LbrpgModItems.SILVER_INGOT.get(),
            LbrpgModBlocks.BlockItems.SILVER_BLOCK.get(),
            //Mithril
            LbrpgModItems.MITHRIL_NUGGET.get(),
            LbrpgModItems.MITHRIL_INGOT.get(),
            LbrpgModBlocks.BlockItems.MITHRIL_BLOCK.get(),
            //Orichalcon
            LbrpgModItems.ORICHALCON_NUGGET.get(),
            LbrpgModItems.ORICHALCON_INGOT.get(),
            LbrpgModBlocks.BlockItems.ORICHALCON_BLOCK.get()
    };
}
