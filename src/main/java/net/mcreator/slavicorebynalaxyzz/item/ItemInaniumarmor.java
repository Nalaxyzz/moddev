
package net.mcreator.slavicorebynalaxyzz.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.slavicorebynalaxyzz.creativetab.TabSlavicoretab;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

@ElementsSlavicoreMod.ModElement.Tag
public class ItemInaniumarmor extends ElementsSlavicoreMod.ModElement {
	@GameRegistry.ObjectHolder("slavicore:inaniumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("slavicore:inaniumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("slavicore:inaniumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("slavicore:inaniumarmorboots")
	public static final Item boots = null;
	public ItemInaniumarmor(ElementsSlavicoreMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("INANIUMARMOR", "slavicore:inanium_armor", 500, new int[]{2, 10, 10, 10}, 17,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("inaniumarmorhelmet")
				.setRegistryName("inaniumarmorhelmet").setCreativeTab(TabSlavicoretab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("inaniumarmorbody")
				.setRegistryName("inaniumarmorbody").setCreativeTab(TabSlavicoretab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("inaniumarmorlegs")
				.setRegistryName("inaniumarmorlegs").setCreativeTab(TabSlavicoretab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("inaniumarmorboots")
				.setRegistryName("inaniumarmorboots").setCreativeTab(TabSlavicoretab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("slavicore:inaniumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("slavicore:inaniumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("slavicore:inaniumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("slavicore:inaniumarmorboots", "inventory"));
	}
}
