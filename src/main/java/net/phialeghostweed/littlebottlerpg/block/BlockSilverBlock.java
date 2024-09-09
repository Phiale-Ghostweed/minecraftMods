package net.phialeghostweed.littlebottlerpg.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockSilverBlock extends Block {
    public BlockSilverBlock() {
        super(Properties.of()
                .strength(5.0F, 100)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
