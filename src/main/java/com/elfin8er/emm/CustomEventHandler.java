package com.elfin8er.emm;

import com.elfin8er.emm.CustomItems.CustomItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomEventHandler {	
	@SubscribeEvent
	public void checkUpdate(LivingHurtEvent event){
		if(event.source.isExplosion() && event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.entity;
			if(player.inventory.hasItem(CustomItems.BlastGem)){
				player.inventory.consumeInventoryItem(CustomItems.BlastGem);
				player.worldObj.spawnParticle("smoke", player.posX, player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
				event.setCanceled(true);
			}
		}
	}
}
