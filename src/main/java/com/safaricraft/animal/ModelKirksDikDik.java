package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Kirk's Dik Dik - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelKirksDikDik extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer neck;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer leg;
    public ModelRenderer leg_1;
    public ModelRenderer Head;
    public ModelRenderer shape2;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer horn;
    public ModelRenderer horn_1;
    public ModelRenderer leg_2;
    public ModelRenderer leg_3;

    public ModelKirksDikDik() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg_1 = new ModelRenderer(this, 34, 0);
        this.leg_1.setRotationPoint(2.7F, 4.6F, 0.7F);
        this.leg_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.ear = new ModelRenderer(this, 0, 0);
        this.ear.setRotationPoint(-0.6F, 1.7F, 2.7F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 5);
        this.shape2.setRotationPoint(0.5F, 0.3F, 2.5F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape2, -2.777342438698576F, 0.0F, 0.0F);
        this.ear_1 = new ModelRenderer(this, 0, 0);
        this.ear_1.setRotationPoint(2.6F, 1.7F, 2.7F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 21, 0);
        this.thigh_1.setRotationPoint(2.5F, 0.6F, 7.5F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 2, 6, 4, 0.0F);
        this.leg = new ModelRenderer(this, 39, 0);
        this.leg.setRotationPoint(0.3F, 4.6F, 0.7F);
        this.leg.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.leg_3 = new ModelRenderer(this, 34, 1);
        this.leg_3.setRotationPoint(0.5F, 5.0F, 2.6F);
        this.leg_3.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.horn = new ModelRenderer(this, 26, 20);
        this.horn.setRotationPoint(0.4F, 1.3F, 3.0F);
        this.horn.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horn, -0.31869712141416456F, 0.0F, 0.0F);
        this.thigh = new ModelRenderer(this, 21, 0);
        this.thigh.setRotationPoint(-0.5F, 0.6F, 7.5F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 2, 6, 4, 0.0F);
        this.leg_2 = new ModelRenderer(this, 39, 1);
        this.leg_2.setRotationPoint(0.5F, 5.0F, 2.6F);
        this.leg_2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 11.5F, 0.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 6, 12, 0.0F);
        this.horn_1 = new ModelRenderer(this, 26, 20);
        this.horn_1.setRotationPoint(1.6F, 1.3F, 3.0F);
        this.horn_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horn_1, -0.31869712141416456F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 19);
        this.neck.setRotationPoint(1.0F, 3.5F, 0.0F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(neck, 1.9123572614101867F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 13, 19);
        this.Head.setRotationPoint(-0.5F, -0.5F, 7.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.31869712141416456F, 0.0F, 0.0F);
        this.Body.addChild(this.leg_1);
        this.Head.addChild(this.ear);
        this.Head.addChild(this.shape2);
        this.Head.addChild(this.ear_1);
        this.Body.addChild(this.thigh_1);
        this.Body.addChild(this.leg);
        this.thigh_1.addChild(this.leg_3);
        this.Head.addChild(this.horn);
        this.Body.addChild(this.thigh);
        this.thigh.addChild(this.leg_2);
        this.Head.addChild(this.horn_1);
        this.Body.addChild(this.neck);
        this.neck.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body.render(f5);
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

        this.leg_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.leg_3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
