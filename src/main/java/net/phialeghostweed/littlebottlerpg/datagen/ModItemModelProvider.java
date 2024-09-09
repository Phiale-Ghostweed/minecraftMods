package net.phialeghostweed.littlebottlerpg.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LittleBottleRPG.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Crop
        basicItem(LbrpgModItems.LOVE_FRUIT.get());
        basicItem(LbrpgModItems.TOMATO_RED.get());
        basicItem(LbrpgModItems.TOMATO_YELLOW.get());
        basicItem(LbrpgModItems.TOMATO_ORANGE.get());
        basicItem(LbrpgModItems.TOMATO_BLACK.get());
        //Nugget
        basicItem(LbrpgModItems.SILVER_NUGGET.get());
        basicItem(LbrpgModItems.MITHRIL_NUGGET.get());
        basicItem(LbrpgModItems.ORICHALCON_NUGGET.get());
        //Ingot
        basicItem(LbrpgModItems.SILVER_INGOT.get());
        basicItem(LbrpgModItems.MITHRIL_INGOT.get());
        basicItem(LbrpgModItems.ORICHALCON_INGOT.get());
    }
}
