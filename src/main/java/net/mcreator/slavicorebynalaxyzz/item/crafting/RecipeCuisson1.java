
package net.mcreator.slavicorebynalaxyzz.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.slavicorebynalaxyzz.item.ItemSlavicniumingot;
import net.mcreator.slavicorebynalaxyzz.block.BlockSlavicnium;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class RecipeCuisson1 extends ElementsSlavicoreMod.ModElement {
	public RecipeCuisson1(ElementsSlavicoreMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSlavicnium.block, (int) (1)), new ItemStack(ItemSlavicniumingot.block, (int) (1)), 1F);
	}
}
