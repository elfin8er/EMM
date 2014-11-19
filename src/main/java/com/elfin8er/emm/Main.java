package com.elfin8er.emm;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.elfin8er.emm.CustomBlocks.CustomBlocks;
import com.elfin8er.emm.CustomItems.ItemBlastGem;
import com.elfin8er.emm.CustomItems.CustomItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid = "elfsmagicmod", name = "Elf's Magic Mod", version = "Dev")
public class Main {

	// The instance of your mod that Forge uses.
    @Instance(value = "elfsmagicmod")
    public static Main instance;
    
    CustomEventHandler events = new CustomEventHandler(); // Our Event handler

    
    @EventHandler
    private void onInit(FMLInitializationEvent event){
    	CustomBlocks.registerCustomBlocks(); // Adding Custom Blocks
    	CustomItems.RegisterItems(); // Adding Custom Items
    	MinecraftForge.EVENT_BUS.register(events); // Registering Events
    }
    
    
}
