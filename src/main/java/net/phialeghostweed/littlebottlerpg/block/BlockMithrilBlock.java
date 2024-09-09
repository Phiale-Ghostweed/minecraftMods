package net.phialeghostweed.littlebottlerpg.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockMithrilBlock extends Block {
    public BlockMithrilBlock() {
        super(Properties.of()
                .strength(5.0F, 200)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
