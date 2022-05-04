
package net.mcreator.slavicorebynalaxyzz.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.slavicorebynalaxyzz.item.ItemInanium_ingotIngot;
import net.mcreator.slavicorebynalaxyzz.block.BlockInanium;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class RecipeCuisson2 extends ElementsSlavicoreMod.ModElement {
	public RecipeCuisson2(ElementsSlavicoreMod instance) {
		super(instance, 35);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockInanium.block, (int) (1)), new ItemStack(ItemInanium_ingotIngot.block, (int) (1)), 1F);
	}
}
