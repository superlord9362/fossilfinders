package superlord.fossilfinders.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import superlord.fossilfinders.entity.EntityRhizodus;
import superlord.fossilfinders.entity.models.Rhizodus;
import superlord.fossilfinders.util.Reference;

public class RenderRhizodus extends RenderLiving<EntityRhizodus> {
	public static final Factory FACTORY = new Factory();

	public RenderRhizodus(RenderManager manager) {
		super(manager, new Rhizodus(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityRhizodus entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/rhizodus.png");
	}

	public static class Factory implements IRenderFactory<EntityRhizodus> {

        @Override
        public Render<? super EntityRhizodus> createRenderFor(RenderManager manager) {
            return new RenderRhizodus(manager);
        }
    }
	
	@Override
    protected void preRenderCallback(EntityRhizodus entity, float f) {
        this.shadowSize = entity.width * 0.45F;
    }
}