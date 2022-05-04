
package net.mcreator.slavicorebynalaxyzz.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.slavicorebynalaxyzz.creativetab.TabSlavicoretab;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class ItemSlavThunder extends ElementsSlavicoreMod.ModElement {
	@GameRegistry.ObjectHolder("slavicore:slav_thunder")
	public static final Item block = null;
	public ItemSlavThunder(ElementsSlavicoreMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("slavicore:slav_thunder", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("slav_thunder", ElementsSlavicoreMod.sounds.get(new ResourceLocation("slavicore:slav_thunder")));
			setUnlocalizedName("slav_thunder");
			setRegistryName("slav_thunder");
			setCreativeTab(TabSlavicoretab.tab);
		}
	}
}
