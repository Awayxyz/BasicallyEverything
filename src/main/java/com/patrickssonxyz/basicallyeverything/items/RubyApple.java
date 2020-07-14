package com.patrickssonxyz.basicallyeverything.items;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RubyApple extends Item {

    public RubyApple() {
        super(new Item.Properties()
                .group(BasicallyEverything.RUBY_TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(9.6f)
                        .fastToEat()
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.ABSORPTION, 3600, 3), 1.0f)
                        .effect(new EffectInstance(Effects.REGENERATION, 400, 2), 1.0f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1.0f)
                        .effect(new EffectInstance(Effects.RESISTANCE, 200, 0), 0.1f)
                        .build()
                )
                .maxStackSize(16)
                .rarity(Rarity.RARE));
    }
}
