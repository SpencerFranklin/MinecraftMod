package net.spencer.test.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.spencer.test.Reference;

public class BlockCheese extends Block {

	public BlockCheese () {
		super(Material.CAKE);
		setUnlocalizedName(Reference.ModBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.CHEESE.getRegistryName());
		setHardness(1.0f);
	}
}
