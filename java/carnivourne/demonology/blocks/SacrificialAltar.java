package carnivourne.demonology.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SacrificialAltar extends BlockBase {

	public SacrificialAltar(String name, Material material) {
		super(name, material);
		
		// Sound block makes when walking on it
		setSoundType(SoundType.STONE);
		
		// How long it takes to break block
		setHardness(4.0F);
		
		// Blast Resistance of block
		setResistance(30.0f);
		
		// What kind of tool and what level it has to be
		setHarvestLevel("pickaxe", 2);
		
	}

}
