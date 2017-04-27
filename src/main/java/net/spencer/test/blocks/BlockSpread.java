package net.spencer.test.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.spencer.test.Reference;

public class BlockSpread extends Block {
	
	public BlockSpread () {
		super(Material.CACTUS);
		
		setUnlocalizedName(Reference.ModBlocks.SPREAD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.SPREAD.getRegistryName());
		setHardness(1.0f);
	}
	
}
