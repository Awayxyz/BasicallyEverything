package com.patrickssonxyz.basicallyeverything.util;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import com.patrickssonxyz.basicallyeverything.blocks.BlockItemBase;
import com.patrickssonxyz.basicallyeverything.blocks.Level2Furnace;
import com.patrickssonxyz.basicallyeverything.blocks.RubyBlock;
import com.patrickssonxyz.basicallyeverything.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BasicallyEverything.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BasicallyEverything.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }




    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    public static final RegistryObject<Block> LEVEL_2_FURNACE = BLOCKS.register("level2furnace", Level2Furnace::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));

    public static final RegistryObject<Item> LEVEL_2_FURNACE_ITEM = ITEMS.register("level2furnace", () -> new BlockItemBase(LEVEL_2_FURNACE.get()));


}
