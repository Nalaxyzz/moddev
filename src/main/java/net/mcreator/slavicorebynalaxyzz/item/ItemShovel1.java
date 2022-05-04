
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
public class ItemShovel1 extends ElementsSlavicoreMod.ModElement {
	@GameRegistry.ObjectHolder("slavicore:shovel_1")
	public static final Item block = null;
	public ItemShovel1(ElementsSlavicoreMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("SHOVEL_1", 1, 500, 8f, 0f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("shovel_1").setRegistryName("shovel_1").setCreativeTab(TabSlavicoretab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("slavicore:shovel_1", "inventory"));
	}
}
