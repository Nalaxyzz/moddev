
package net.mcreator.slavicorebynalaxyzz.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.slavicorebynalaxyzz.procedure.ProcedureHammernaladiumToolInHandTick;
import net.mcreator.slavicorebynalaxyzz.creativetab.TabSlavicoretab;
import net.mcreator.slavicorebynalaxyzz.ElementsSlavicoreMod;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsSlavicoreMod.ModElement.Tag
public class ItemHammernaladium extends ElementsSlavicoreMod.ModElement {
	@GameRegistry.ObjectHolder("slavicore:hammernaladium")
	public static final Item block = null;
	public ItemHammernaladium(ElementsSlavicoreMod instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("HAMMERNALADIUM", 1, 5000, 12f, 0f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureHammernaladiumToolInHandTick.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setUnlocalizedName("hammernaladium").setRegistryName("hammernaladium").setCreativeTab(TabSlavicoretab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("slavicore:hammernaladium", "inventory"));
	}
}
