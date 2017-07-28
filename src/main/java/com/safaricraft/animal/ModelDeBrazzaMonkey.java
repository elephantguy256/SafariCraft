package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * De Brazza's Monkey - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelDeBrazzaMonkey extends ModelBase {
    public ModelRenderer Bodyfront;
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer leg;
    public ModelRenderer leg_1;
    public ModelRenderer hip;
    public ModelRenderer hip_1;
    public ModelRenderer tailbase;
    public ModelRenderer leg_2;
    public ModelRenderer foot;
    public ModelRenderer leg_3;
    public ModelRenderer foot_1;
    public ModelRenderer tail;
    public ModelRenderer tail_1;
    public ModelRenderer chin;
    public ModelRenderer foot_2;
    public ModelRenderer foot_3;

    public ModelDeBrazzaMonkey() {
        this.textureWidth = 80;
        this.textureHeight = 40;
        this.tail_1 = new ModelRenderer(this, 15, 29);
        this.tail_1.setRotationPoint(0.0F, 0.1F, 6.3F);
        this.tail_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail_1, 0.36425021489121656F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-0.5F, -0.2F, 6.9F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F);
        this.hip_1 = new ModelRenderer(this, 29, 0);
        this.hip_1.setRotationPoint(4.5F, 2.1F, 0.5F);
        this.hip_1.addBox(0.0F, 0.0F, 0.0F, 3, 6, 6, 0.0F);
        this.foot = new ModelRenderer(this, 20, 15);
        this.foot.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.foot.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.chin = new ModelRenderer(this, 0, 28);
        this.chin.setRotationPoint(1.5F, 6.0F, 0.1F);
        this.chin.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.foot_3 = new ModelRenderer(this, 20, 15);
        this.foot_3.setRotationPoint(0.0F, 11.0F, -0.5F);
        this.foot_3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.leg_2 = new ModelRenderer(this, 38, 25);
        this.leg_2.setRotationPoint(0.2F, 6.0F, 0.2F);
        this.leg_2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.foot_2 = new ModelRenderer(this, 20, 15);
        this.foot_2.setRotationPoint(0.0F, 11.0F, -0.5F);
        this.foot_2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Head = new ModelRenderer(this, 59, 0);
        this.Head.setRotationPoint(0.5F, -0.9F, -3.1F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 5, 6, 4, 0.0F);
        this.leg_3 = new ModelRenderer(this, 27, 25);
        this.leg_3.setRotationPoint(0.8F, 6.0F, 0.2F);
        this.leg_3.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.foot_1 = new ModelRenderer(this, 20, 15);
        this.foot_1.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.foot_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.tailbase = new ModelRenderer(this, 27, 14);
        this.tailbase.setRotationPoint(2.5F, 0.1F, 5.9F);
        this.tailbase.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tailbase, -0.36425021489121656F, 0.0F, 0.0F);
        this.leg = new ModelRenderer(this, 48, 0);
        this.leg.setRotationPoint(-0.5F, 0.9F, 0.7F);
        this.leg.addBox(0.0F, 0.0F, 0.0F, 2, 11, 3, 0.0F);
        this.leg_1 = new ModelRenderer(this, 48, 0);
        this.leg_1.setRotationPoint(4.5F, 0.9F, 0.7F);
        this.leg_1.addBox(0.0F, 0.0F, 0.0F, 2, 11, 3, 0.0F);
        this.hip = new ModelRenderer(this, 29, 0);
        this.hip.setRotationPoint(-0.5F, 2.1F, 0.5F);
        this.hip.addBox(0.0F, 0.0F, 0.0F, 3, 6, 6, 0.0F);
        this.Bodyfront = new ModelRenderer(this, 0, 15);
        this.Bodyfront.setRotationPoint(-3.0F, 13.7F, -5.2F);
        this.Bodyfront.addBox(0.0F, 0.0F, 0.0F, 6, 6, 7, 0.0F);
        this.tail = new ModelRenderer(this, 44, 15);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail, -0.5918411493512771F, 0.0F, 0.0F);
        this.tail.addChild(this.tail_1);
        this.Bodyfront.addChild(this.Body);
        this.Body.addChild(this.hip_1);
        this.leg_2.addChild(this.foot);
        this.Head.addChild(this.chin);
        this.leg_1.addChild(this.foot_3);
        this.hip.addChild(this.leg_2);
        this.leg.addChild(this.foot_2);
        this.Bodyfront.addChild(this.Head);
        this.hip_1.addChild(this.leg_3);
        this.leg_3.addChild(this.foot_1);
        this.Body.addChild(this.tailbase);
        this.Bodyfront.addChild(this.leg);
        this.Bodyfront.addChild(this.leg_1);
        this.Body.addChild(this.hip);
        this.tailbase.addChild(this.tail);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Bodyfront.offsetX, this.Bodyfront.offsetY, this.Bodyfront.offsetZ);
        GlStateManager.translate(this.Bodyfront.rotationPointX * f5, this.Bodyfront.rotationPointY * f5, this.Bodyfront.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.Bodyfront.offsetX, -this.Bodyfront.offsetY, -this.Bodyfront.offsetZ);
        GlStateManager.translate(-this.Bodyfront.rotationPointX * f5, -this.Bodyfront.rotationPointY * f5, -this.Bodyfront.rotationPointZ * f5);
        this.Bodyfront.render(f5);
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

        this.leg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.leg_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg_3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
