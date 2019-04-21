package superlord.fossilfinders;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import superlord.fossilfinders.proxy.CommonProxy;
import superlord.fossilfinders.proxy.IProxy;
import superlord.fossilfinders.util.Reference;

@Mod(modid=Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class Main {
	
    public static CommonProxy PROXY;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static IProxy proxy;

    
	@Instance
	public static Main instance;

	@EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
    }
	
	@EventHandler
    public static void init(FMLInitializationEvent event) {
    }
	
	@EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }
	
}
