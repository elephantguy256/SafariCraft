package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * AfricaCraft Elephant - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelAfricanBushElephant extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer booty;
    public ModelRenderer neck;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer thigh_2;
    public ModelRenderer thigh_3;
    public ModelRenderer shin;
    public ModelRenderer shin_1;
    public ModelRenderer head;
    public ModelRenderer trunkbase;
    public ModelRenderer tuskbase;
    public ModelRenderer tuskbase_1;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer trunk;
    public ModelRenderer trunk_1;
    public ModelRenderer trunk_2;
    public ModelRenderer trunk_3;
    public ModelRenderer tusk;
    public ModelRenderer tusk_1;
    public ModelRenderer shin_2;
    public ModelRenderer shin_3;

    public ModelAfricanBushElephant() {
        this.textureWidth = 350;
        this.textureHeight = 175;
        this.ear = new ModelRenderer(this, 233, 33);
        this.ear.setRotationPoint(9.0F, 10.5F, 3.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 1, 15, 10, 0.0F);
        this.setRotateAngle(ear, 3.141592653589793F, -0.40980330836826856F, 0.0F);
        this.tusk = new ModelRenderer(this, 300, 32);
        this.tusk.setRotationPoint(0.5F, 2.4F, 0.7F);
        this.tusk.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tusk, -0.31869712141416456F, 0.0F, 0.0F);
        this.shin_3 = new ModelRenderer(this, 200, 0);
        this.shin_3.setRotationPoint(0.5F, 13.0F, 0.5F);
        this.shin_3.addBox(0.0F, 0.0F, 0.0F, 5, 11, 7, 0.0F);
        this.setRotateAngle(shin_3, 0.091106186954104F, 0.0F, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 141, 0);
        this.thigh_1.setRotationPoint(9.0F, 8.0F, 2.0F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 6, 13, 8, 0.0F);
        this.setRotateAngle(thigh_1, -0.091106186954104F, 0.0F, 0.0F);
        this.trunk_2 = new ModelRenderer(this, 97, 49);
        this.trunk_2.setRotationPoint(0.5F, 6.0F, 0.5F);
        this.trunk_2.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.booty = new ModelRenderer(this, 0, 48);
        this.booty.setRotationPoint(-0.5F, -0.5F, 16.0F);
        this.booty.addBox(0.0F, 0.0F, 0.0F, 15, 17, 16, 0.0F);
        this.setRotateAngle(booty, -0.091106186954104F, 0.0F, 0.0F);
        this.tusk_1 = new ModelRenderer(this, 300, 32);
        this.tusk_1.setRotationPoint(0.5F, 2.4F, 0.7F);
        this.tusk_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tusk_1, -0.31869712141416456F, 0.0F, 0.0F);
        this.tuskbase_1 = new ModelRenderer(this, 300, 0);
        this.tuskbase_1.setRotationPoint(7.1F, 2.0F, 10.3F);
        this.tuskbase_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tuskbase_1, 2.452362131977232F, 0.31869712141416456F, 0.0F);
        this.tuskbase = new ModelRenderer(this, 300, 0);
        this.tuskbase.setRotationPoint(0.0F, 2.0F, 9.0F);
        this.tuskbase.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tuskbase, 2.4586453172844123F, -0.31869712141416456F, 0.0F);
        this.shin_2 = new ModelRenderer(this, 200, 0);
        this.shin_2.setRotationPoint(0.5F, 13.0F, 0.5F);
        this.shin_2.addBox(0.0F, 0.0F, 0.0F, 5, 11, 7, 0.0F);
        this.setRotateAngle(shin_2, 0.091106186954104F, 0.0F, 0.0F);
        this.thigh_3 = new ModelRenderer(this, 141, 0);
        this.thigh_3.setRotationPoint(10.0F, 8.0F, 6.0F);
        this.thigh_3.addBox(0.0F, 0.0F, 0.0F, 6, 13, 8, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(-1.5F, 1.3F, 5.5F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 10, 11, 10, 0.0F);
        this.setRotateAngle(head, 0.43458698374658805F, 0.0F, 0.0F);
        this.shin = new ModelRenderer(this, 200, 0);
        this.shin.setRotationPoint(0.5F, 13.0F, 0.5F);
        this.shin.addBox(0.0F, 0.0F, 0.0F, 5, 11, 7, 0.0F);
        this.setRotateAngle(shin, 0.091106186954104F, 0.0F, 0.0F);
        this.trunk_3 = new ModelRenderer(this, 131, 49);
        this.trunk_3.setRotationPoint(0.0F, 4.0F, 0.7F);
        this.trunk_3.addBox(0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(trunk_3, -0.22759093446006054F, 0.0F, 0.0F);
        this.thigh_2 = new ModelRenderer(this, 141, 0);
        this.thigh_2.setRotationPoint(-1.0F, 8.0F, 6.0F);
        this.thigh_2.addBox(0.0F, 0.0F, 0.0F, 6, 13, 8, 0.0F);
        this.trunk = new ModelRenderer(this, 100, 0);
        this.trunk.setRotationPoint(0.5F, 9.0F, 0.5F);
        this.trunk.addBox(0.0F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.setRotateAngle(trunk, 0.5009094953223726F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 130);
        this.neck.setRotationPoint(3.5F, 11.5F, 2.2F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 7, 11, 10, 0.0F);
        this.setRotateAngle(neck, 2.7317893452215247F, 0.0F, 0.0F);
        this.thigh = new ModelRenderer(this, 141, 0);
        this.thigh.setRotationPoint(-1.0F, 8.0F, 2.0F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 6, 13, 8, 0.0F);
        this.setRotateAngle(thigh, -0.091106186954104F, 0.0F, 0.0F);
        this.trunkbase = new ModelRenderer(this, 254, 0);
        this.trunkbase.setRotationPoint(2.0F, 8.5F, 9.9F);
        this.trunkbase.addBox(0.0F, 0.0F, 0.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(trunkbase, 2.599144322069955F, 0.0F, 0.0F);
        this.ear_1 = new ModelRenderer(this, 240, 100);
        this.ear_1.setRotationPoint(0.0F, 10.5F, 3.0F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 1, 15, 10, 0.0F);
        this.setRotateAngle(ear_1, 3.141592653589793F, 0.40980330836826856F, 0.0F);
        this.body = new ModelRenderer(this, 129, 48);
        this.body.setRotationPoint(-12.4F, -33.5F, -16.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 14, 16, 16, 0.0F);
        this.trunk_1 = new ModelRenderer(this, 100, 26);
        this.trunk_1.setRotationPoint(1.0F, 7.0F, 0.5F);
        this.trunk_1.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(trunk_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shin_1 = new ModelRenderer(this, 200, 0);
        this.shin_1.setRotationPoint(0.5F, 13.0F, 0.5F);
        this.shin_1.addBox(0.0F, 0.0F, 0.0F, 5, 11, 7, 0.0F);
        this.setRotateAngle(shin_1, 0.091106186954104F, 0.0F, 0.0F);
        this.head.addChild(this.ear);
        this.tuskbase.addChild(this.tusk);
        this.thigh_1.addChild(this.shin_3);
        this.body.addChild(this.thigh_1);
        this.trunk_1.addChild(this.trunk_2);
        this.body.addChild(this.booty);
        this.tuskbase_1.addChild(this.tusk_1);
        this.head.addChild(this.tuskbase_1);
        this.head.addChild(this.tuskbase);
        this.thigh.addChild(this.shin_2);
        this.booty.addChild(this.thigh_3);
        this.neck.addChild(this.head);
        this.thigh_2.addChild(this.shin);
        this.trunk_2.addChild(this.trunk_3);
        this.booty.addChild(this.thigh_2);
        this.trunkbase.addChild(this.trunk);
        this.body.addChild(this.neck);
        this.body.addChild(this.thigh);
        this.head.addChild(this.trunkbase);
        this.head.addChild(this.ear_1);
        this.trunk.addChild(this.trunk_1);
        this.thigh_3.addChild(this.shin_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 1.6F;
    	GL11.glPushMatrix();
    	GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.8D, 1.8D, 1.8D);
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
