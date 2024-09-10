package net.phialeghostweed.littlebottlerpg.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModBlocks;

public class LbrpgModBlockStateProvider extends BlockStateProvider {
    public LbrpgModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LittleBottleRPG.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(LbrpgModBlocks.Blocks.SILVER_BLOCK);
        simpleBlockWithItem(LbrpgModBlocks.Blocks.MITHRIL_BLOCK);
        simpleBlockWithItem(LbrpgModBlocks.Blocks.ORICHALCON_BLOCK);
    }
    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(),cubeAll(block.get()));
    }
}
