package com.patrickssonxyz.basicallyeverything.init;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import com.patrickssonxyz.basicallyeverything.util.enums.ModArmorMaterial;
import com.patrickssonxyz.basicallyeverything.items.EnchantedRubyApple;
import com.patrickssonxyz.basicallyeverything.items.ItemBase;
import com.patrickssonxyz.basicallyeverything.items.RubyApple;
import com.patrickssonxyz.basicallyeverything.util.enums.ModItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasicallyEverything.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<RubyApple> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);
    public static final RegistryObject<EnchantedRubyApple> ENCHANTED_RUBY_APPLE = ITEMS.register("enchanted_ruby_apple", EnchantedRubyApple::new);



    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTiers.RUBY, 7, 3.8f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTiers.RUBY, 4, 2.4f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTiers.RUBY, 6, 4.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTiers.RUBY, 4, 2.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTiers.RUBY, 1, 2.0f, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));



    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(BasicallyEverything.RUBY_TAB)));
}
