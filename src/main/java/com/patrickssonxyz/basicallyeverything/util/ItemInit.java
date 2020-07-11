package com.patrickssonxyz.basicallyeverything.util;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import com.patrickssonxyz.basicallyeverything.blocks.BlockItemBase;
import com.patrickssonxyz.basicallyeverything.items.ItemBase;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BasicallyEverything.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTiers.RUBY, 7, 3.6f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTiers.RUBY, 4, 2.4f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTiers.RUBY, 6, 4.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTiers.RUBY, 4, 2.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTiers.RUBY, 2.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));


}
