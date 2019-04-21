package superlord.fossilfinders.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Hibbertopterus - Anomalocaris101
 * Created using Tabula 7.0.0
 */
public class Hibbertopterus extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer LLeg1;
    public ModelRenderer LLeg2;
    public ModelRenderer LLeg3;
    public ModelRenderer RLeg1;
    public ModelRenderer RLeg2;
    public ModelRenderer RLeg3;
    public ModelRenderer LArm1;
    public ModelRenderer RArm1;
    public ModelRenderer Telson;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public Hibbertopterus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Tail = new ModelRenderer(this, 5, 21);
        this.Tail.setRotationPoint(0.0F, 0.49F, 5.0F);
        this.Tail.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 9, 0.0F);
        this.LLeg3 = new ModelRenderer(this, 0, 48);
        this.LLeg3.setRotationPoint(2.0F, 3.0F, 3.0F);
        this.LLeg3.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg3, 0.0F, -0.2617993877991494F, 0.2617993877991494F);
        this.RArm1 = new ModelRenderer(this, 0, 52);
        this.RArm1.mirror = true;
        this.RArm1.setRotationPoint(-2.0F, 4.0F, -3.0F);
        this.RArm1.addBox(-6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(RArm1, 0.0F, -1.0471975511965976F, -0.2617993877991494F);
        this.LArm1 = new ModelRenderer(this, 0, 52);
        this.LArm1.setRotationPoint(2.0F, 4.0F, -3.0F);
        this.LArm1.addBox(0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(LArm1, 0.0F, 1.0471975511965976F, 0.2617993877991494F);
        this.RLeg3 = new ModelRenderer(this, 0, 48);
        this.RLeg3.mirror = true;
        this.RLeg3.setRotationPoint(-2.0F, 3.0F, 3.0F);
        this.RLeg3.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(RLeg3, 0.0F, 0.2617993877991494F, -0.2617993877991494F);
        this.LLeg2 = new ModelRenderer(this, 0, 48);
        this.LLeg2.setRotationPoint(2.0F, 3.0F, 1.0F);
        this.LLeg2.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, 0.2617993877991494F);
        this.RLeg1 = new ModelRenderer(this, 0, 48);
        this.RLeg1.mirror = true;
        this.RLeg1.setRotationPoint(-2.0F, 3.0F, -1.0F);
        this.RLeg1.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(RLeg1, 0.0F, -0.2617993877991494F, -0.2617993877991494F);
        this.Telson = new ModelRenderer(this, 0, 36);
        this.Telson.setRotationPoint(0.0F, 1.49F, 8.5F);
        this.Telson.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 0, 48);
        this.LLeg1.setRotationPoint(2.0F, 3.0F, -1.0F);
        this.LLeg1.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg1, 0.0F, 0.2617993877991494F, 0.2617993877991494F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Body.addBox(-6.5F, -4.5F, -6.5F, 13, 8, 13, 0.0F);
        this.setRotateAngle(Body, -0.08726646259971647F, 0.0F, 0.0F);
        this.RLeg2 = new ModelRenderer(this, 0, 48);
        this.RLeg2.mirror = true;
        this.RLeg2.setRotationPoint(-2.0F, 3.0F, 1.0F);
        this.RLeg2.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(RLeg2, 0.0F, 0.0F, -0.2617993877991494F);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.LLeg3);
        this.Body.addChild(this.RArm1);
        this.Body.addChild(this.LArm1);
        this.Body.addChild(this.RLeg3);
        this.Body.addChild(this.LLeg2);
        this.Body.addChild(this.RLeg1);
        this.Tail.addChild(this.Telson);
        this.Body.addChild(this.LLeg1);
        this.Body.addChild(this.RLeg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if (this.isChild) {
            float f6 = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, this.childYOffset * f5, this.childZOffset * f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 23.0F * f5, 0.0F);
            this.Body.render(f5);
            GlStateManager.popMatrix();
        } else {
        	this.Body.render(f5);
        }
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
        this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.RLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.RLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
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
