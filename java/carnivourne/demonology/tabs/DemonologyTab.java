package carnivourne.demonology.tabs;

import carnivourne.demonology.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DemonologyTab extends CreativeTabs{
	// Constructor
	public DemonologyTab(String label) {
		super("demonologytab");
		this.setBackgroundImageName("demonology.png");
	}
	
	//Icon for creative tab
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.SACRIFICIAL_ALTAR));
	}
}
