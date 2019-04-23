package superlord.fossilfinders.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import superlord.fossilfinders.block.BlockBase;
import superlord.fossilfinders.block.BlockFossil;
import superlord.fossilfinders.block.Decoder;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FOSSIL = new BlockFossil("fossil", Material.ROCK);
	public static final Block DNA_DECODER = new Decoder("decoder", Material.IRON);
}
