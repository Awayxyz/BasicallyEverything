package com.patrickssonxyz.basicallyeverything.events;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import com.patrickssonxyz.basicallyeverything.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BasicallyEverything.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onJumpWithArrow(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if(player.getHeldItemMainhand().getItem() == Items.ARROW) {
            player.replaceItemInInventory(0, new ItemStack(Items.ARROW));
        }
    }

}