
package net.mcreator.slavicorebynalaxyzz.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.slavicorebynalaxyzz.item.ItemSlavicurium;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class FuelSlavicuriumfuel extends ElementsSlavicoreMod.ModElement {
	public FuelSlavicuriumfuel(ElementsSlavicoreMod instance) {
		super(instance, 6);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemSlavicurium.block, (int) (1)).getItem())
			return 3000;
		return 0;
	}
}
