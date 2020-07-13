package com.patrickssonxyz.basicallyeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class RubyOre extends Block {

    Random rand = new Random();

    public RubyOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(4.0f, 3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 250 : 0;
    }


}