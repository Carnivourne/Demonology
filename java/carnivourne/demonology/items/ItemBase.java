package carnivourne.demonology.items;

import carnivourne.demonology.Main;
import carnivourne.demonology.init.ModItems;
import carnivourne.demonology.tabs.DemonologyTab;
import carnivourne.demonology.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
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
