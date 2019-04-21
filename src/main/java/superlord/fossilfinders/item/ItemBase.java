package superlord.fossilfinders.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import superlord.fossilfinders.Main;
import superlord.fossilfinders.init.ModItems;
import superlord.fossilfinders.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
