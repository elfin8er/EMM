package com.elfin8er.emm.CustomItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomItems extends Item{

	public static final Item BlastGem = new ItemBlastGem();
	public static final Item ManaBerry = new ItemManaBerry();
	public static final Item Gloves = new Item();
	public static final Item HasteGloves = new ItemGlovesHaste();

	public static void RegisterItems() {
		//Blast Gem
		GameRegistry.registerItem(BlastGem, "Blast Gem");
		GameRegistry.addRecipe(new ItemStack(BlastGem), "DOD", "ORO", "DOD", 
		        'D', new ItemStack(Items.diamond), 'O', new ItemStack(Blocks.obsidian), 'R', new ItemStack(Items.redstone));
		
		//Mana Berry
		GameRegistry.registerItem(ManaBerry, "Mana Berry");
		
		//Gloves
		Gloves.setUnlocalizedName("gloves");
		GameRegistry.registerItem(Gloves, "gloves");
		GameRegistry.addRecipe(new ItemStack(Gloves), "W W", "WWW", "WWW", 
		        'W', new ItemStack(Blocks.wool));
		
		//Haste Gloves
		GameRegistry.registerItem(HasteGloves, "hastegloves");
		GameRegistry.addRecipe(new ItemStack(HasteGloves), "SSS", "SGS", "SSS",
				'S', new ItemStack(Items.sugar), 'G', new ItemStack(Gloves));
	}

}
