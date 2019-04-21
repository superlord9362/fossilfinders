package superlord.fossilfinders.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import superlord.fossilfinders.entity.EntityHibbertopterus;
import superlord.fossilfinders.entity.models.Hibbertopterus;
import superlord.fossilfinders.util.Reference;

public class RenderHibbertopterus extends RenderLiving<EntityHibbertopterus> {
	public static final Factory FACTORY = new Factory();

	public RenderHibbertopterus(RenderManager manager) {
		super(manager, new Hibbertopterus(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHibbertopterus entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/hibbertopterus.png");
	}

	public static class Factory implements IRenderFactory<EntityHibbertopterus> {

        @Override
        public Render<? super EntityHibbertopterus> createRenderFor(RenderManager manager) {
            return new RenderHibbertopterus(manager);
        }
    }
	
	@Override
    protected void preRenderCallback(EntityHibbertopterus entity, float f) {
        this.shadowSize = entity.width * 0.45F;
    }
}