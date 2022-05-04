
package net.mcreator.slavicorebynalaxyzz.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.slavicorebynalaxyzz.block.BlockNaladium;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class TabSlavicoretab extends ElementsSlavicoreMod.ModElement {
	public TabSlavicoretab(ElementsSlavicoreMod instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabslavicoretab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockNaladium.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
