package net.spencer.test.blocks;

import java.util.Random;

import akka.actor.FSM.Timer;
import akka.actor.LightArrayRevolverScheduler.TimerTask;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.spencer.test.Reference;
import net.spencer.test.init.ModBlocks;

public class BlockEat extends Block {

	public BlockEat() {
		super(Material.GLASS);

		setUnlocalizedName(Reference.ModBlocks.EAT.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.EAT.getRegistryName());
		setHardness(1.0f);
		this.setTickRandomly(true);
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		BlockPos p = pos.down();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		p = pos.up();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		p = pos.east();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		p = pos.west();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		p = pos.south();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		p = pos.north();
		if(!worldIn.getBlockState(p).getBlock().isAir(worldIn.getBlockState(p), worldIn, p)) {
			worldIn.setBlockState(p, ModBlocks.eat.getDefaultState());
			worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
		}
		
		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
	}

}
