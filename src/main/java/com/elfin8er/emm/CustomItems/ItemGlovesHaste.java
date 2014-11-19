package com.elfin8er.emm.CustomItems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemGlovesHaste extends Item {

	int heldTime = 0;
	int TicksNeeded = 40;
	int CurrentTick = 0;
	
	public ItemGlovesHaste(){
		setUnlocalizedName("hastegloves");
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add(EnumChatFormatting.AQUA + "1XP/" + TicksNeeded + "Ticks");
	}
	
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean selected){
		if(entity instanceof EntityPlayer){
			System.out.println(CurrentTick);
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			if(equipped == item){
				if(player.experienceTotal >= 10){
					if(CurrentTick >= TicksNeeded){
						CurrentTick = 0;
						player.addExperience(-10);
						player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, TicksNeeded + 21, 1));
					}else{
						CurrentTick++;
					}
				}
			}
		}
	}
	
}
