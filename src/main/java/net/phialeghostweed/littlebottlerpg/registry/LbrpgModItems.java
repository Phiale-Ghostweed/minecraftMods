package net.phialeghostweed.littlebottlerpg.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phialeghostweed.littlebottlerpg.LittleBottleRPG;
import net.phialeghostweed.littlebottlerpg.item.*;

public class LbrpgModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LittleBottleRPG.MODID);

    public static final RegistryObject<Item> TOMATO_RED = ITEMS.register("tomato_red", ItemTomatoRed::new);
    public static final RegistryObject<Item> TOMATO_YELLOW = ITEMS.register("tomato_yellow", ItemTomatoYellow::new);
    public static final RegistryObject<Item> TOMATO_ORANGE = ITEMS.register("tomato_orange", ItemTomatoOrange::new);
    public static final RegistryObject<Item> TOMATO_BLACK = ITEMS.register("tomato_black", ItemTomatoBlack::new);
    public static final RegistryObject<Item> LOVE_FRUIT = ITEMS.register("love_fruit", ItemLoveFruit::new);

    //Nugget
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemSilverNugget::new);
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", ItemMithrilNugget::new);
    public static final RegistryObject<Item> ORICHALCON_NUGGET = ITEMS.register("orichalcon_nugget", ItemOrichalconNugget::new);
    //Ingot
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemSilverIngot::new);
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", ItemMithrilIngot::new);
    public static final RegistryObject<Item> ORICHALCON_INGOT = ITEMS.register("orichalcon_ingot", ItemOrichalconIngot::new);



}
