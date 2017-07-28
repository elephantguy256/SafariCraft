package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * AC hippo - EVo
 * Created using Tabula 5.1.0
 */
public class ModelWhiteRhino extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer booty;
    public ModelRenderer neck;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer thigh_2;
    public ModelRenderer thigh_3;
    public ModelRenderer tail;
    public ModelRenderer shin;
    public ModelRenderer shin_1;
    public ModelRenderer Head;
    public ModelRenderer Head_1;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer hornbackbottom;
    public ModelRenderer hornbackbottom_1;
    public ModelRenderer hornbackbottom_2;
    public ModelRenderer hornbackbottom_3;
    public ModelRenderer shin_2;
    public ModelRenderer shin_3;

    public ModelWhiteRhino() {
        this.textureWidth = 350;
        this.textureHeight = 175;
        this.thigh = new ModelRenderer(this, 141, 25);
        this.thigh.setRotationPoint(9.0F, 7.4F, 1.4F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 6, 10, 6, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 141, 25);
        this.thigh_1.setRotationPoint(-0.5F, 7.4F, 1.4F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 6, 10, 6, 0.0F);
        this.hornbackbottom_2 = new ModelRenderer(this, 79, 34);
        this.hornbackbottom_2.setRotationPoint(0.5F, 4.4F, 0.7F);
        this.hornbackbottom_2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(hornbackbottom_2, -0.27314402793711257F, 0.0F, 0.0F);
        this.thigh_3 = new ModelRenderer(this, 141, 0);
        this.thigh_3.setRotationPoint(-0.5F, 6.1F, 8.5F);
        this.thigh_3.addBox(0.0F, 0.0F, 0.0F, 6, 11, 8, 0.0F);
        this.booty = new ModelRenderer(this, 0, 48);
        this.booty.setRotationPoint(0.0F, 0.0F, 15.2F);
        this.booty.addBox(0.0F, 0.0F, 0.0F, 14, 14, 16, 0.0F);
        this.ear = new ModelRenderer(this, 0, 0);
        this.ear.setRotationPoint(0.0F, 7.2F, 0.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(ear, 0.0F, 0.0F, 0.40980330836826856F);
        this.Head = new ModelRenderer(this, 40, 130);
        this.Head.setRotationPoint(0.5F, 6.3F, 1.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
        this.setRotateAngle(Head, 0.9560913642424937F, 0.0F, 0.0F);
        this.shin_1 = new ModelRenderer(this, 200, 0);
        this.shin_1.setRotationPoint(0.0F, 11.0F, 0.5F);
        this.shin_1.addBox(0.0F, 0.0F, 0.0F, 6, 10, 7, 0.0F);
        this.shin_3 = new ModelRenderer(this, 200, 23);
        this.shin_3.setRotationPoint(0.5F, 8.5F, 0.5F);
        this.shin_3.addBox(0.0F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.shin = new ModelRenderer(this, 200, 0);
        this.shin.setRotationPoint(0.0F, 11.0F, 0.5F);
        this.shin.addBox(0.0F, 0.0F, 0.0F, 6, 10, 7, 0.0F);
        this.thigh_2 = new ModelRenderer(this, 141, 0);
        this.thigh_2.setRotationPoint(8.5F, 5.8F, 8.5F);
        this.thigh_2.addBox(0.0F, 0.0F, 0.0F, 6, 11, 8, 0.0F);
        this.hornbackbottom_1 = new ModelRenderer(this, 79, 34);
        this.hornbackbottom_1.setRotationPoint(2.0F, 7.6F, 2.1F);
        this.hornbackbottom_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(hornbackbottom_1, 0.091106186954104F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 129, 48);
        this.body.setRotationPoint(-12.4F, -8.1F, -16.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 14, 14, 16, 0.0F);
        this.neck = new ModelRenderer(this, 0, 130);
        this.neck.setRotationPoint(3.0F, 11.5F, 0.1F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F);
        this.setRotateAngle(neck, 2.8703684878298747F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 23, 51);
        this.tail.setRotationPoint(6.0F, 4.2F, 14.0F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tail, 0.3389429407372988F, 0.0F, 0.0F);
        this.shin_2 = new ModelRenderer(this, 200, 23);
        this.shin_2.setRotationPoint(0.5F, 8.5F, 0.5F);
        this.shin_2.addBox(0.0F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.hornbackbottom_3 = new ModelRenderer(this, 79, 34);
        this.hornbackbottom_3.setRotationPoint(0.5F, 2.5F, 0.7F);
        this.hornbackbottom_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(hornbackbottom_3, -0.27314402793711257F, 0.0F, 0.0F);
        this.Head_1 = new ModelRenderer(this, 80, 130);
        this.Head_1.setRotationPoint(0.5F, -0.6F, 7.1F);
        this.Head_1.addBox(0.0F, 0.0F, 0.0F, 6, 8, 10, 0.0F);
        this.setRotateAngle(Head_1, -0.31869712141416456F, 0.0F, 0.0F);
        this.hornbackbottom = new ModelRenderer(this, 79, 34);
        this.hornbackbottom.setRotationPoint(1.5F, 6.5F, 7.2F);
        this.hornbackbottom.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(hornbackbottom, 0.31869712141416456F, 0.0F, 0.0F);
        this.ear_1 = new ModelRenderer(this, 0, 0);
        this.ear_1.setRotationPoint(5.0F, 8.1F, 0.0F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(ear_1, 0.0F, 0.0F, -0.40980330836826856F);
        this.body.addChild(this.thigh);
        this.body.addChild(this.thigh_1);
        this.hornbackbottom.addChild(this.hornbackbottom_2);
        this.booty.addChild(this.thigh_3);
        this.body.addChild(this.booty);
        this.Head.addChild(this.ear);
        this.neck.addChild(this.Head);
        this.thigh_3.addChild(this.shin_1);
        this.thigh_1.addChild(this.shin_3);
        this.thigh_2.addChild(this.shin);
        this.booty.addChild(this.thigh_2);
        this.Head_1.addChild(this.hornbackbottom_1);
        this.body.addChild(this.neck);
        this.booty.addChild(this.tail);
        this.thigh.addChild(this.shin_2);
        this.hornbackbottom_1.addChild(this.hornbackbottom_3);
        this.Head.addChild(this.Head_1);
        this.Head_1.addChild(this.hornbackbottom);
        this.Head.addChild(this.ear_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.2D, 1.2D);
        GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
        GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
        this.body.render(f5);
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

public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
{
    this.thigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.thigh_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.thigh_2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.thigh_3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
}
}