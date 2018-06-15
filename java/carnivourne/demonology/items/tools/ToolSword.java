package carnivourne.demonology.items.tools;

import carnivourne.demonology.Main;
import carnivourne.demonology.init.ModItems;
import carnivourne.demonology.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	public ToolSword(String name, ToolMaterial material) {
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.demonologytab);
			
			ModItems.ITEMS.add(this);
		}
		
		@Override
		public void registerModels() {
			
			Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
