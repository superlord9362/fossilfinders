package superlord.fossilfinders.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Rhizodus - Anomalocaris101
 * Created using Tabula 7.0.0
 */
public class Rhizodus extends ModelBase {
    public double[] modelScale = new double[] { 0.5D, 0.5D, 0.5D };
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Head;
    public ModelRenderer LeftFin1;
    public ModelRenderer RightFin1;
    public ModelRenderer LeftFin2;
    public ModelRenderer RightFin2;
    public ModelRenderer TailFin;
    public ModelRenderer TopFin;
    public ModelRenderer TopFin_1;

    public Rhizodus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.TopFin = new ModelRenderer(this, 44, 32);
        this.TopFin.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.TopFin.addBox(0.0F, -6.0F, -6.0F, 1, 6, 12, 0.0F);
        this.Body2 = new ModelRenderer(this, 78, 0);
        this.Body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addBox(-3.0F, -5.0F, 0.0F, 6, 10, 16, 0.0F);
        this.TailFin = new ModelRenderer(this, 44, 0);
        this.TailFin.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.TailFin.addBox(0.0F, -8.0F, 0.0F, 1, 16, 16, 0.0F);
        this.TopFin_1 = new ModelRenderer(this, 44, 50);
        this.TopFin_1.setRotationPoint(0.0F, 5.0F, 14.0F);
        this.TopFin_1.addBox(0.0F, -0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.RightFin2 = new ModelRenderer(this, 0, 50);
        this.RightFin2.setRotationPoint(-2.5F, 3.0F, 4.0F);
        this.RightFin2.addBox(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(RightFin2, 0.0F, 0.0F, 0.7853981633974483F);
        this.RightFin1 = new ModelRenderer(this, 0, 40);
        this.RightFin1.mirror = true;
        this.RightFin1.setRotationPoint(-2.5F, 3.0F, -5.0F);
        this.RightFin1.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 4, 0.0F);
        this.setRotateAngle(RightFin1, 0.0F, 0.0F, 0.7853981633974483F);
        this.LeftFin2 = new ModelRenderer(this, 0, 50);
        this.LeftFin2.setRotationPoint(2.5F, 3.0F, 4.0F);
        this.LeftFin2.addBox(-0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(LeftFin2, 0.0F, 0.0F, -0.7853981633974483F);
        this.Body1 = new ModelRenderer(this, 0, 0);
        this.Body1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body1.addBox(-3.0F, -5.0F, -8.0F, 6, 10, 16, 0.0F);
        this.Head = new ModelRenderer(this, 0, 26);
        this.Head.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Head.addBox(-2.5F, -4.0F, -6.0F, 5, 8, 6, 0.0F);
        this.LeftFin1 = new ModelRenderer(this, 0, 40);
        this.LeftFin1.setRotationPoint(2.5F, 3.0F, -5.0F);
        this.LeftFin1.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 4, 0.0F);
        this.setRotateAngle(LeftFin1, 0.0F, 0.0F, -0.7853981633974483F);
        this.Body2.addChild(this.TopFin);
        this.Body1.addChild(this.Body2);
        this.Body2.addChild(this.TailFin);
        this.Body2.addChild(this.TopFin_1);
        this.Body2.addChild(this.RightFin2);
        this.Body1.addChild(this.RightFin1);
        this.Body2.addChild(this.LeftFin2);
        this.Body1.addChild(this.Head);
        this.Body1.addChild(this.LeftFin1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.Body1.render(f5);
        GlStateManager.popMatrix();
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
        this.Body2.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
