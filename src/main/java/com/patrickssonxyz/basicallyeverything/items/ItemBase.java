package com.patrickssonxyz.basicallyeverything.items;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {


    public ItemBase() {
        super(new Item.Properties().group(BasicallyEverything.RUBY_TAB));
    }
}
