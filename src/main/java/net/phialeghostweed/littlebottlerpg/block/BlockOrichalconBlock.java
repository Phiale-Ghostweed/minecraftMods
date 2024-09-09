package net.phialeghostweed.littlebottlerpg.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockOrichalconBlock extends Block {
    public BlockOrichalconBlock() {
        super(Properties.of()
                .strength(5.0F, 200)
                .sound(SoundType.COPPER)
                .requiresCorrectToolForDrops()
        );
    }
}
