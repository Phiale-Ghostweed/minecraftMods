package net.phialeghostweed.littlebottlerpg.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.block.BlockMithrilBlock;
import net.phialeghostweed.littlebottlerpg.block.BlockOrichalconBlock;
import net.phialeghostweed.littlebottlerpg.block.BlockSilverBlock;

public class LbrpgModBlocks {

    public static class Blocks {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LittleBottleRPG.MODID);

        public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", BlockSilverBlock::new);
        public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", BlockMithrilBlock::new);
        public static final RegistryObject<Block> ORICHALCON_BLOCK = BLOCKS.register("orichalcon_block", BlockOrichalconBlock::new);
    }
    public static class BlockItems {
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LittleBottleRPG.MODID);

        public static final RegistryObject<Item> SILVER_BLOCK = BLOCK_ITEMS.register("silver_block",
                () -> new BlockItem(Blocks.SILVER_BLOCK.get(), new Item.Properties()
                        .rarity(Rarity.COMMON)
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> MITHRIL_BLOCK = BLOCK_ITEMS.register("mithril_block",
                () -> new BlockItem(Blocks.MITHRIL_BLOCK.get(), new Item.Properties()
                        .rarity(Rarity.EPIC)
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> ORICHALCON_BLOCK = BLOCK_ITEMS.register("orichalcon_block",
                () -> new BlockItem(Blocks.ORICHALCON_BLOCK.get(), new Item.Properties()
                        .rarity(Rarity.EPIC)
                        .stacksTo(64)
                ));
    }
}
