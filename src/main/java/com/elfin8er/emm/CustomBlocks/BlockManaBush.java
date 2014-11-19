package com.elfin8er.emm.CustomBlocks;

import java.util.Random;

import com.elfin8er.emm.CustomItems.CustomItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockManaBush extends Crops{
	
	public BlockManaBush()
    {
        // Basic block setup
        setBlockName("manabush");
        setBlockTextureName("emm:mannaberry_stage_0");
        setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
        return (CustomItems.ManaBerry);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon("emm:manaberry_stage_0");
          iIcon[1] = parIIconRegister.registerIcon("emm:manaberry_stage_0");
          iIcon[2] = parIIconRegister.registerIcon("emm:manaberry_stage_1");
          iIcon[3] = parIIconRegister.registerIcon("emm:manaberry_stage_1");
          iIcon[4] = parIIconRegister.registerIcon("emm:manaberry_stage_2");
          iIcon[5] = parIIconRegister.registerIcon("emm:manaberry_stage_2");
          iIcon[6] = parIIconRegister.registerIcon("emm:manaberry_stage_3");
          iIcon[7] = parIIconRegister.registerIcon("emm:manaberry_stage_3");
    }
}
