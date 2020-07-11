package com.patrickssonxyz.basicallyeverything.blocks;

import com.patrickssonxyz.basicallyeverything.BasicallyEverything;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {

        super(block, new Item.Properties().group(BasicallyEverything.RUBY_TAB));
    }
}
