package net.phialeghostweed.littlebottlerpg.registry.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModItems;

public class LbrpgModTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LittleBottleRPG.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_ALL_TAB = MOD_TABS.register("lbrpg_all_tab",
            () -> {return CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.CHERRY_PLANKS))
                    .title(Component.translatable("itemGroup.lbrpg_all"))
                    .displayItems((param, output) -> {
                        for (Item item: LbrpgModAllTab.items) {
                            output.accept(item);
                        }
                    })
                    .build();
    });

    public static final RegistryObject<CreativeModeTab> MOD_ITEM_TAB = MOD_TABS.register("lbrpg_item_tab",
            () -> {return CreativeModeTab.builder()
                    .icon(() -> new ItemStack(LbrpgModItems.TOMATO_RED.get()))
                    .title(Component.translatable("itemGroup.lbrpg_item"))
                    .withTabsBefore(LbrpgModTabs.MOD_ALL_TAB.getId())
                    .displayItems((param, output) -> {
                        for (Item item: LbrpgModItemTab.items) {
                            output.accept(item);
                        }
                    })
                    .build();
    });

    public static final RegistryObject<CreativeModeTab> MOD_BLOCK_TAB = MOD_TABS.register("lbrpg_block_tab",
            () -> {return CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.STONE))
                    .title(Component.translatable("itemGroup.lbrpg_block"))
                    .withTabsBefore(LbrpgModTabs.MOD_ITEM_TAB.getId())
                    .displayItems((param, output) -> {
                        for (Item item: LbrpgModBlockTab.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
}
