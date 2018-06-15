package carnivourne.demonology.init;

import java.util.ArrayList;
import java.util.List;

import carnivourne.demonology.blocks.BlockBase;
import carnivourne.demonology.blocks.SacrificialAltar;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SACRIFICIAL_ALTAR = new SacrificialAltar("sacrificial_altar" , Material.ROCK);
	
	
}
