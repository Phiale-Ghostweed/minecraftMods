package net.phialeghostweed.littlebottlerpg.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModBlocks;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModItems;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, LittleBottleRPG.MODID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        //Tabs
        add("itemGroup.lbrpg_all", " - Little Bottle RPG - ");
        add("itemGroup.lbrpg_item", " - Little Bottle RPG - アイテム");
        add("itemGroup.lbrpg_block", " - Little Bottle RPG - ブロック");

        //Items
        //Corp
        addItem(LbrpgModItems.LOVE_FRUIT, "ラブフルーツ");
        addItem(LbrpgModItems.TOMATO_RED, "トマト(赤)");
        addItem(LbrpgModItems.TOMATO_YELLOW, "トマト(黄)");
        addItem(LbrpgModItems.TOMATO_ORANGE, "トマト(橙)");
        addItem(LbrpgModItems.TOMATO_BLACK, "トマト(黒)");
        //Nugget
        addItem(LbrpgModItems.SILVER_NUGGET, "銀塊");
        addItem(LbrpgModItems.MITHRIL_NUGGET, "ミスリルの塊");
        addItem(LbrpgModItems.ORICHALCON_NUGGET, "オリハルコンの塊");
        //Ingot
        addItem(LbrpgModItems.SILVER_INGOT, "銀インゴット");
        addItem(LbrpgModItems.MITHRIL_INGOT, "ミスリルインゴット");
        addItem(LbrpgModItems.ORICHALCON_INGOT, "オリハルコンインゴット");

        //Block
        addBlock(LbrpgModBlocks.Blocks.SILVER_BLOCK, "銀ブロック");
        addBlock(LbrpgModBlocks.Blocks.MITHRIL_BLOCK, "ミスリルブロック");
        addBlock(LbrpgModBlocks.Blocks.ORICHALCON_BLOCK, "オリハルコンブロック");

    }
}
