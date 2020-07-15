package com.patrickssonxyz.basicallyeverything.items;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EnchantedRubyApple extends Item {


    public EnchantedRubyApple() {
        super(new Item.Properties()
                .group(BasicallyEverything.RUBY_TAB)
                .food(new Food.Builder()
                        .hunger(14)
                        .saturation(1.6f)
                        .fastToEat()
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.ABSORPTION, 3600, 7), 1.0f)
                        .effect(new EffectInstance(Effects.REGENERATION, 600, 4), 1.0f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1.0f)
                        .effect(new EffectInstance(Effects.RESISTANCE, 6000, 0), 1.0f)
                        .effect(new EffectInstance(Effects.STRENGTH, 1200, 1), 1.0f)
                        .effect(new EffectInstance(Effects.SPEED, 300, 0), 1.0f)
                        .build()

                )
                .rarity(Rarity.EPIC));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }


}
