package com.elfin8er.emm.CustomBlocks;

import com.elfin8er.emm.CustomItems.ItemBlastGem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CustomBlocks extends Block{

	public static final Block ManaBush = new BlockManaBush();
	
	protected CustomBlocks(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	public static void registerCustomBlocks(){
		GameRegistry.registerBlock(ManaBush, "manabush");
	}

}
