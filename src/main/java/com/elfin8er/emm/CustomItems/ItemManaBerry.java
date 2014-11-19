package com.elfin8er.emm.CustomItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.elfin8er.emm.CustomBlocks.*;

public class ItemManaBerry extends SeedFood 
{
	
    public ItemManaBerry() 
    {
        super(1, 0.3F, CustomBlocks.ManaBush, Blocks.grass);
        setUnlocalizedName("manaberry");
        setTextureName("recipeplus:blueberry");
        setCreativeTab(CreativeTabs.tabFood);
    }
    
    @Override
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        --p_77654_1_.stackSize;
        p_77654_3_.getFoodStats().func_151686_a(this, p_77654_1_);
        p_77654_2_.playSoundAtEntity(p_77654_3_, "random.burp", 0.5F, p_77654_2_.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(p_77654_1_, p_77654_2_, p_77654_3_);
        p_77654_3_.addExperience(5);
        return p_77654_1_;
    }
}
