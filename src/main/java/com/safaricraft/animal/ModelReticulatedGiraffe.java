package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Giraffe Version 6 - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelReticulatedGiraffe extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer bodyback;
    public ModelRenderer neckbase;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer thigh_2;
    public ModelRenderer thigh_3;
    public ModelRenderer shin;
    public ModelRenderer shin_1;
    public ModelRenderer neckmid;
    public ModelRenderer necktop;
    public ModelRenderer head;
    public ModelRenderer mouth;
    public ModelRenderer horn;
    public ModelRenderer horn_1;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer shin_2;
    public ModelRenderer shin_3;

    public ModelReticulatedGiraffe() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.mouth = new ModelRenderer(this, 70, 15);
        this.mouth.setRotationPoint(0.5F, 0.6F, 5.3F);
        this.mouth.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(mouth, 0.136659280431156F, 0.0F, 0.0F);
        this.thigh_3 = new ModelRenderer(this, 0, 74);
        this.thigh_3.setRotationPoint(7.0F, 1.8F, 10.1F);
        this.thigh_3.addBox(0.0F, 0.0F, 0.0F, 6, 17, 9, 0.0F);
        this.setRotateAngle(thigh_3, 0.13648474750595657F, 0.0F, 0.0F);
        this.shin_2 = new ModelRenderer(this, 100, 51);
        this.shin_2.setRotationPoint(0.5F, 13.0F, 2.5F);
        this.shin_2.addBox(0.0F, 0.0F, 0.0F, 5, 23, 5, 0.0F);
        this.shin_3 = new ModelRenderer(this, 70, 51);
        this.shin_3.setRotationPoint(0.5F, 13.0F, 2.5F);
        this.shin_3.addBox(0.0F, 0.0F, 0.0F, 5, 23, 5, 0.0F);
        this.shin = new ModelRenderer(this, 100, 50);
        this.shin.setRotationPoint(0.5F, 13.0F, 2.5F);
        this.shin.addBox(0.0F, 0.0F, 0.0F, 5, 24, 5, 0.0F);
        this.head = new ModelRenderer(this, 62, 0);
        this.head.setRotationPoint(-0.5F, 3.0F, 2.7F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(head, -0.5009094953223726F, 0.0F, 0.0F);
        this.neckbase = new ModelRenderer(this, 141, 0);
        this.neckbase.setRotationPoint(3.0F, 0.5F, 10.7F);
        this.neckbase.addBox(0.0F, 0.0F, 0.0F, 7, 15, 10, 0.0F);
        this.setRotateAngle(neckbase, -2.4586453172844123F, 0.0F, 0.0F);
        this.necktop = new ModelRenderer(this, 88, 0);
        this.necktop.setRotationPoint(0.5F, 15.0F, 1.0F);
        this.necktop.addBox(0.0F, 0.0F, 0.0F, 4, 8, 6, 0.0F);
        this.horn_1 = new ModelRenderer(this, 0, 0);
        this.horn_1.setRotationPoint(3.4F, 5.4F, 2.4F);
        this.horn_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn_1, -0.22759093446006054F, 0.0F, 0.0F);
        this.bodyback = new ModelRenderer(this, 0, 30);
        this.bodyback.setRotationPoint(0.5F, 0.8F, 12.0F);
        this.bodyback.addBox(0.0F, 0.0F, 0.0F, 12, 15, 17, 0.0F);
        this.setRotateAngle(bodyback, -0.136659280431156F, 0.0F, 0.0F);
        this.ear = new ModelRenderer(this, 0, 36);
        this.ear.setRotationPoint(0.9F, 3.0F, 2.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ear, 0.0F, -2.6406831582674206F, 0.0F);
        this.shin_1 = new ModelRenderer(this, 70, 50);
        this.shin_1.setRotationPoint(0.5F, 13.0F, 2.5F);
        this.shin_1.addBox(0.0F, 0.0F, 0.0F, 5, 24, 5, 0.0F);
        this.thigh = new ModelRenderer(this, 111, 70);
        this.thigh.setRotationPoint(-1.0F, 4.8F, -1.0F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 6, 15, 9, 0.0F);
        this.thigh_2 = new ModelRenderer(this, 33, 74);
        this.thigh_2.setRotationPoint(-1.0F, 1.8F, 10.1F);
        this.thigh_2.addBox(0.0F, 0.0F, 0.0F, 6, 17, 9, 0.0F);
        this.setRotateAngle(thigh_2, 0.13648474750595657F, 0.0F, 0.0F);
        this.ear_1 = new ModelRenderer(this, 0, 66);
        this.ear_1.setRotationPoint(5.0F, 3.0F, 2.4F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(ear_1, 0.0F, 2.6406831582674206F, 0.0F);
        this.neckmid = new ModelRenderer(this, 112, 0);
        this.neckmid.setRotationPoint(1.0F, 13.6F, 1.0F);
        this.neckmid.addBox(0.0F, 0.0F, 0.0F, 5, 15, 8, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 0, 74);
        this.thigh_1.setRotationPoint(8.0F, 4.8F, -1.0F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 6, 15, 9, 0.0F);
        this.horn = new ModelRenderer(this, 0, 0);
        this.horn.setRotationPoint(0.6F, 5.4F, 2.4F);
        this.horn.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn, -0.22759093446006054F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -24.9F, 0.5F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 13, 17, 12, 0.0F);
        this.head.addChild(this.mouth);
        this.bodyback.addChild(this.thigh_3);
        this.thigh.addChild(this.shin_2);
        this.thigh_1.addChild(this.shin_3);
        this.thigh_2.addChild(this.shin);
        this.necktop.addChild(this.head);
        this.body.addChild(this.neckbase);
        this.neckmid.addChild(this.necktop);
        this.head.addChild(this.horn_1);
        this.body.addChild(this.bodyback);
        this.head.addChild(this.ear);
        this.thigh_3.addChild(this.shin_1);
        this.body.addChild(this.thigh);
        this.bodyback.addChild(this.thigh_2);
        this.head.addChild(this.ear_1);
        this.neckbase.addChild(this.neckmid);
        this.body.addChild(this.thigh_1);
        this.head.addChild(this.horn);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 1.4F;
    	GL11.glPushMatrix();
    	GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.2D, 1.2D);
        GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
        GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
        this.body.render(f5);
        GlStateManager.popMatrix();
        GL11.glPopMatrix();
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
        this.thigh_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.thigh_3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
