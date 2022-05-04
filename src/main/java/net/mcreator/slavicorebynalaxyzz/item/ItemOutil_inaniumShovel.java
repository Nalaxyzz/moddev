
package net.mcreator.slavicorebynalaxyzz.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.slavicorebynalaxyzz.creativetab.TabSlavicoretab;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

import java.util.Set;
import java.util.HashMap;

@ElementsSlavicoreMod.ModElement.Tag
public class ItemOutil_inaniumShovel extends ElementsSlavicoreMod.ModElement {
	@GameRegistry.ObjectHolder("slavicore:outil_inanium_shovel")
	public static final Item block = null;
	public ItemOutil_inaniumShovel(ElementsSlavicoreMod instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("OUTIL_INANIUM_SHOVEL", 4, 300, 8f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("outil_inanium_shovel").setRegistryName("outil_inanium_shovel").setCreativeTab(TabSlavicoretab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("slavicore:outil_inanium_shovel", "inventory"));
	}
}
