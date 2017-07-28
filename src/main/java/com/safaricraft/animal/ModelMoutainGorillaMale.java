package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * AC gorilla male - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelMoutainGorillaMale extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Booty;
    public ModelRenderer Arm;
    public ModelRenderer Arm_1;
    public ModelRenderer neck;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer leg;
    public ModelRenderer leg_1;
    public ModelRenderer hand;
    public ModelRenderer hand_1;
    public ModelRenderer head;
    public ModelRenderer headtop;
    public ModelRenderer face;

    public ModelMoutainGorillaMale() {
        this.textureWidth = 150;
        this.textureHeight = 75;
        this.head = new ModelRenderer(this, 100, 20);
        this.head.setRotationPoint(-1.0F, 7.9F, -0.5F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(head, 0.6373942428283291F, 0.0F, 0.0F);
        this.Booty = new ModelRenderer(this, 35, 0);
        this.Booty.setRotationPoint(2.0F, 0.1F, 16.1F);
        this.Booty.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(Booty, 0.27314402793711257F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 100, 0);
        this.neck.setRotationPoint(3.0F, 1.5F, 4.9F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(neck, -2.0032889154390916F, 0.0F, 0.0F);
        this.hand_1 = new ModelRenderer(this, 70, 0);
        this.hand_1.setRotationPoint(-0.5F, 14.0F, -0.5F);
        this.hand_1.addBox(0.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
        this.setRotateAngle(hand_1, 0.136659280431156F, 0.0F, 0.0F);
        this.hand = new ModelRenderer(this, 70, 0);
        this.hand.setRotationPoint(-0.5F, 14.0F, -0.5F);
        this.hand.addBox(0.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
        this.setRotateAngle(hand, 0.136659280431156F, 0.0F, 0.0F);
        this.Arm = new ModelRenderer(this, 0, 0);
        this.Arm.setRotationPoint(-2.0F, 3.7F, 0.8F);
        this.Arm.addBox(0.0F, 0.0F, 0.0F, 5, 14, 6, 0.0F);
        this.setRotateAngle(Arm, 0.091106186954104F, 0.0F, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 0, 21);
        this.thigh_1.setRotationPoint(-3.7F, 2.9F, 0.0F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 6, 10, 7, 0.0F);
        this.leg_1 = new ModelRenderer(this, 29, 21);
        this.leg_1.setRotationPoint(0.5F, 9.2F, 0.5F);
        this.leg_1.addBox(0.0F, 0.0F, 0.0F, 5, 11, 6, 0.0F);
        this.setRotateAngle(leg_1, -0.045553093477052F, 0.0F, 0.0F);
        this.thigh = new ModelRenderer(this, 0, 21);
        this.thigh.setRotationPoint(5.6F, 2.9F, 0.0F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 6, 10, 7, 0.0F);
        this.Arm_1 = new ModelRenderer(this, 0, 0);
        this.Arm_1.setRotationPoint(9.0F, 3.7F, 0.8F);
        this.Arm_1.addBox(0.0F, 0.0F, 0.0F, 5, 14, 6, 0.0F);
        this.setRotateAngle(Arm_1, 0.091106186954104F, 0.0F, 0.0F);
        this.leg = new ModelRenderer(this, 29, 21);
        this.leg.setRotationPoint(0.5F, 9.2F, 0.5F);
        this.leg.addBox(0.0F, 0.0F, 0.0F, 5, 11, 6, 0.0F);
        this.setRotateAngle(leg, -0.045553093477052F, 0.0F, 0.0F);
        this.headtop = new ModelRenderer(this, 55, 50);
        this.headtop.setRotationPoint(0.5F, -0.9F, -1.3F);
        this.headtop.addBox(0.0F, 0.0F, 0.0F, 7, 7, 5, 0.0F);
        this.setRotateAngle(headtop, -0.4553564018453205F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 44);
        this.Body.setRotationPoint(0.0F, -7.8F, 0.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 12, 11, 20, 0.0F);
        this.setRotateAngle(Body, -0.22759093446006054F, 0.0F, 0.0F);
        this.face = new ModelRenderer(this, 60, 20);
        this.face.setRotationPoint(2.0F, 7.9F, 2.7F);
        this.face.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.neck.addChild(this.head);
        this.Body.addChild(this.Booty);
        this.Body.addChild(this.neck);
        this.Arm_1.addChild(this.hand_1);
        this.Arm.addChild(this.hand);
        this.Body.addChild(this.Arm);
        this.Booty.addChild(this.thigh_1);
        this.thigh_1.addChild(this.leg_1);
        this.Booty.addChild(this.thigh);
        this.Body.addChild(this.Arm_1);
        this.thigh.addChild(this.leg);
        this.head.addChild(this.headtop);
        this.head.addChild(this.face);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.2D, 1.2D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)

    {
        float f6 = (180F / (float)Math.PI);

        this.thigh.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.thigh_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.leg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
