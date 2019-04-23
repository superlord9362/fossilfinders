package superlord.fossilfinders.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import net.soggymustache.bookworm.util.BookwormUtils;

/**
 * Hibbertopterus - Anomalocaris101
 * Created using Tabula 7.0.0
 */
public class Hibbertopterus extends BookwormModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Tail;
    public BookwormModelRenderer LLeg1;
    public BookwormModelRenderer LLeg2;
    public BookwormModelRenderer LLeg3;
    public BookwormModelRenderer RLeg1;
    public BookwormModelRenderer RLeg2;
    public BookwormModelRenderer RLeg3;
    public BookwormModelRenderer LArm1;
    public BookwormModelRenderer RArm1;
    public BookwormModelRenderer Telson;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public Hibbertopterus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Tail = new BookwormModelRenderer(this, 5, 21, null);
        this.Tail.setRotationPoint(0.0F, 0.49F, 5.0F);
        this.Tail.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 9, 0.0F);
        this.LLeg3 = new BookwormModelRenderer(this, 0, 48, null);
        this.LLeg3.setRotationPoint(2.0F, 3.0F, 3.0F);
        this.LLeg3.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg3, 0.0F, -0.2617993877991494F, 0.2617993877991494F);
        this.RArm1 = new BookwormModelRenderer(this, 0, 52, null);
        this.RArm1.mirror = true;
        this.RArm1.setRotationPoint(-2.0F, 4.0F, -3.0F);
        this.RArm1.addBox(-6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(RArm1, 0.0F, -1.0471975511965976F, -0.2617993877991494F);
        this.LArm1 = new BookwormModelRenderer(this, 0, 52, null);
        this.LArm1.setRotationPoint(2.0F, 4.0F, -3.0F);
        this.LArm1.addBox(0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(LArm1, 0.0F, 1.0471975511965976F, 0.2617993877991494F);
        this.RLeg3 = new BookwormModelRenderer(this, 0, 48, null);
        this.RLeg3.mirror = true;
        this.RLeg3.setRotationPoint(-2.0F, 3.0F, 3.0F);
        this.RLeg3.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(RLeg3, 0.0F, 0.2617993877991494F, -0.2617993877991494F);
        this.LLeg2 = new BookwormModelRenderer(this, 0, 48, null);
        this.LLeg2.setRotationPoint(2.0F, 3.0F, 1.0F);
        this.LLeg2.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, 0.2617993877991494F);
        this.RLeg1 = new BookwormModelRenderer(this, 0, 48, null);
        this.RLeg1.mirror = true;
        this.RLeg1.setRotationPoint(-2.0F, 3.0F, -1.0F);
        this.RLeg1.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(RLeg1, 0.0F, -0.2617993877991494F, -0.2617993877991494F);
        this.Telson = new BookwormModelRenderer(this, 0, 36, null);
        this.Telson.setRotationPoint(0.0F, 1.49F, 8.5F);
        this.Telson.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F);
        this.LLeg1 = new BookwormModelRenderer(this, 0, 48, null);
        this.LLeg1.setRotationPoint(2.0F, 3.0F, -1.0F);
        this.LLeg1.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(LLeg1, 0.0F, 0.2617993877991494F, 0.2617993877991494F);
        this.Body = new BookwormModelRenderer(this, 0, 0, null);
        this.Body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Body.addBox(-6.5F, -4.5F, -6.5F, 13, 8, 13, 0.0F);
        this.setRotateAngle(Body, -0.08726646259971647F, 0.0F, 0.0F);
        this.RLeg2 = new BookwormModelRenderer(this, 0, 48, null);
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


    public void setRotateAngle(BookwormModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    
    @Override
   	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
   		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);		
		float speed = 2.1F, degree = 1.3F;
		
		
		speed = 1.9F;

        this.Body.offsetY = -0.05F;
        this.Telson.offsetY = -0.1F;

        this.Telson.rotateAngleY = MathHelper.cos(limbSwing * (0.3F * speed)) * limbSwingAmount * 0.3F -0.05F;
        this.Tail.rotateAngleY = MathHelper.cos(limbSwing * (0.3F * speed)) * limbSwingAmount * 0.3F -0.05F;
        this.Body.rotateAngleZ = MathHelper.cos(limbSwing * (0.5F * 0.7F)) * limbSwingAmount * 0.3F;

        this.LLeg1.rotateAngleY = MathHelper.cos(1 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg2.rotateAngleY = MathHelper.cos(2 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg3.rotateAngleY = MathHelper.cos(3 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg1.rotateAngleZ = MathHelper.cos(1 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg2.rotateAngleZ = MathHelper.cos(2 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg3.rotateAngleZ = MathHelper.cos(3 + limbSwing * (0.3F * speed)) * limbSwingAmount * 0.5F - 0.05F;
        this.LLeg1.offsetZ = -0.05F;
        this.LLeg3.offsetZ = 0.05F;

        this.RLeg1.rotateAngleY = MathHelper.cos(1 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg2.rotateAngleY = MathHelper.cos(2 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg3.rotateAngleY = MathHelper.cos(3 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg1.rotateAngleZ = MathHelper.cos(1 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg2.rotateAngleZ = MathHelper.cos(2 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg3.rotateAngleZ = MathHelper.cos(3 + limbSwing * (0.3F * speed)) * limbSwingAmount * -0.5F - 0.05F;
        this.RLeg1.offsetZ = -0.05F;
        this.RLeg3.offsetZ = 0.05F;
		   		
    }
}
   
