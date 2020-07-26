package com.patrickssonxyz.basicallyeverything;

import com.patrickssonxyz.basicallyeverything.init.BlockInit;
import com.patrickssonxyz.basicallyeverything.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("basicallyeverything")
public class BasicallyEverything
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "basicallyeverything";

    public BasicallyEverything() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ItemInit.init();
        BlockInit.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

    }

    public static final ItemGroup RUBY_TAB = new ItemGroup("rubyTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.RUBY.get());
        }
    };


}
