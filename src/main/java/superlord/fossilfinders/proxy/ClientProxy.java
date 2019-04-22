package superlord.fossilfinders.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import superlord.fossilfinders.entity.EntityHibbertopterus;
import superlord.fossilfinders.entity.EntityRhizodus;
import superlord.fossilfinders.entity.render.RenderHibbertopterus;
import superlord.fossilfinders.entity.render.RenderRhizodus;
import superlord.fossilfinders.world.gen.ModWorldGen;

public class ClientProxy extends CommonProxy implements IProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityHibbertopterus.class, RenderHibbertopterus.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityRhizodus.class, RenderRhizodus.FACTORY);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

}
