package carnivourne.demonology.init;

import java.util.ArrayList;
import java.util.List;

import carnivourne.demonology.items.ItemBase;
import carnivourne.demonology.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

// Holds all items in mod
public class ModItems {

	//Materials
	public static final ToolMaterial MATERIAL_REAPERS_METAL = EnumHelper.addToolMaterial("material_reapers_metal", 2, 500, 6.0f, 2.0F, 10);
	
	// Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item FLOGGING_ROD = new ItemBase("flogging_rod");
	
	public static final ItemSword REAPERS_SCYTHE = new ToolSword("reapers_scythe", MATERIAL_REAPERS_METAL);
}
