package com.elfin8er.emm;

import com.elfin8er.emm.CustomItems.CustomItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomCreativeTabs{

	public static CreativeTabs Magic = new CreativeTabs("Magic") {
		@Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return CustomItems.BlastGem;
	    }
	};
	
}
