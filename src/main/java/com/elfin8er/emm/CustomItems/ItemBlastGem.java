package com.elfin8er.emm.CustomItems;


import com.elfin8er.emm.CustomCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlastGem extends Item{
	ItemBlastGem(){
		this.setUnlocalizedName("blastGem");
		this.setMaxStackSize(1);
		this.setCreativeTab(CustomCreativeTabs.Magic);
	}
}
