package net.spencer.test.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.spencer.test.Reference;

public class MPB extends Block {

	private Item drop;
	private int meta;
	private int least_q;
	private int most_q;
	
	public MPB (Item drop, int least_q, int most_q) {
		super(Material.CAKE);
		this.drop = drop;
		this.least_q = least_q;
		this.most_q = most_q;
		setUnlocalizedName(Reference.ModBlocks.MPB.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.MPB.getRegistryName());
		setHardness(1.0f);
	}
	
	@Override
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.drop;
    }
	
	@Override
	public int quantityDropped(Random random)
    {
        return this.least_q + random.nextInt(this.most_q - this.least_q + 1);
    }
	
	
}
