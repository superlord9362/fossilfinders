package superlord.fossilfinders.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import superlord.fossilfinders.Main;
import superlord.fossilfinders.entity.EntityHibbertopterus;
import superlord.fossilfinders.entity.EntityRhizodus;
import superlord.fossilfinders.init.ModBlocks;
import superlord.fossilfinders.init.ModItems;
import superlord.fossilfinders.util.IHasModel;
import superlord.fossilfinders.util.Reference;

@EventBusSubscriber
public class RegistryHandler {
    private static int entityId = 0;
	
    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "hibbertopterus"), EntityHibbertopterus.class, "hibbertopterus", entityId++, Main.instance, 64, 3, true, 0x995515, 0x000000);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "rhizodus"), EntityRhizodus.class, "rhizodus", entityId++, Main.instance, 64, 3, true, 0x433A37, 0x000000);
    }
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
    
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }
}
