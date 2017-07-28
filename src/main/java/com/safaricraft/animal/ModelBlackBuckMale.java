package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * AfricaCraft gemsbok final - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelBlackBuckMale extends ModelBase {
    public ModelRenderer bodymiddle;
    public ModelRenderer bodyback;
    public ModelRenderer frontkneeleft;
    public ModelRenderer frontkneeright;
    public ModelRenderer neckbottom;
    public ModelRenderer tail;
    public ModelRenderer frontkneeright_1;
    public ModelRenderer frontkneeright_2;
    public ModelRenderer frontlegright;
    public ModelRenderer frontlegright_1;
    public ModelRenderer frontlegleft;
    public ModelRenderer frontlegright_2;
    public ModelRenderer headback;
    public ModelRenderer earight;
    public ModelRenderer headmiddle;
    public ModelRenderer hormbottomright;
    public ModelRenderer earight_1;
    public ModelRenderer hormbottomright_1;
    public ModelRenderer hormbottomright_2;
    public ModelRenderer hormbottomright_3;

    public ModelBlackBuckMale() {
        this.textureWidth = 120;
        this.textureHeight = 90;
        this.tail = new ModelRenderer(this, 0, 41);
        this.tail.setRotationPoint(4.0F, 1.7F, 11.1F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.5009094953223726F, 0.0F, 0.0F);
        this.bodymiddle = new ModelRenderer(this, 8, 64);
        this.bodymiddle.setRotationPoint(-3.5F, 5.7F, -8.9F);
        this.bodymiddle.addBox(0.0F, 0.0F, 0.0F, 10, 9, 13, 0.0F);
        this.frontlegright_1 = new ModelRenderer(this, 87, 20);
        this.frontlegright_1.setRotationPoint(0.5F, 7.5F, 2.9F);
        this.frontlegright_1.addBox(-1.1F, 0.0F, -1.6F, 3, 14, 3, 0.0F);
        this.headback = new ModelRenderer(this, 18, 20);
        this.headback.setRotationPoint(-0.5F, 4.6F, -4.8F);
        this.headback.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(headback, 1.2747884856566583F, 0.0F, 0.0F);
        this.earight_1 = new ModelRenderer(this, 0, 22);
        this.earight_1.setRotationPoint(4.6F, 1.8F, 3.8F);
        this.earight_1.addBox(0.0F, 0.0F, -0.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earight_1, 0.0F, 0.0F, -2.0488420089161434F);
        this.earight = new ModelRenderer(this, 0, 22);
        this.earight.setRotationPoint(0.9F, 0.1F, 3.8F);
        this.earight.addBox(0.0F, 0.0F, -0.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earight, 0.0F, 0.0F, 2.0488420089161434F);
        this.frontkneeleft = new ModelRenderer(this, 60, 52);
        this.frontkneeleft.setRotationPoint(9.3F, 5.9F, 3.0F);
        this.frontkneeleft.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.hormbottomright_3 = new ModelRenderer(this, 99, 0);
        this.hormbottomright_3.setRotationPoint(-0.1F, 3.5F, 0.5F);
        this.hormbottomright_3.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(hormbottomright_3, -0.40980330836826856F, 0.0F, -0.36425021489121656F);
        this.bodyback = new ModelRenderer(this, 60, 67);
        this.bodyback.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.bodyback.addBox(0.0F, 0.0F, 0.0F, 10, 9, 13, 0.0F);
        this.headmiddle = new ModelRenderer(this, 73, 0);
        this.headmiddle.setRotationPoint(0.5F, 4.6F, 0.9F);
        this.headmiddle.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(headmiddle, -3.0049333731586367F, 0.0F, 0.0F);
        this.hormbottomright_2 = new ModelRenderer(this, 99, 0);
        this.hormbottomright_2.setRotationPoint(0.1F, 3.3F, 0.5F);
        this.hormbottomright_2.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(hormbottomright_2, -0.40980330836826856F, 0.0F, 0.36425021489121656F);
        this.neckbottom = new ModelRenderer(this, 0, 0);
        this.neckbottom.setRotationPoint(3.0F, -5.2F, 0.5F);
        this.neckbottom.addBox(0.0F, 0.0F, 0.0F, 4, 6, 12, 0.0F);
        this.setRotateAngle(neckbottom, -1.1383037381507017F, 0.0F, 0.0F);
        this.frontkneeright = new ModelRenderer(this, 44, 52);
        this.frontkneeright.setRotationPoint(0.7F, 5.9F, 3.0F);
        this.frontkneeright.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.hormbottomright_1 = new ModelRenderer(this, 99, 0);
        this.hormbottomright_1.setRotationPoint(2.5F, 0.0F, 0.1F);
        this.hormbottomright_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.frontlegright = new ModelRenderer(this, 101, 20);
        this.frontlegright.setRotationPoint(0.5F, 7.5F, 2.9F);
        this.frontlegright.addBox(-1.1F, 0.0F, -1.6F, 3, 14, 3, 0.0F);
        this.frontlegright_2 = new ModelRenderer(this, 88, 39);
        this.frontlegright_2.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegright_2.addBox(-1.1F, 0.0F, -1.6F, 2, 15, 3, 0.0F);
        this.frontlegleft = new ModelRenderer(this, 76, 39);
        this.frontlegleft.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegleft.addBox(-1.9F, 0.0F, -1.6F, 2, 15, 3, 0.0F);
        this.frontkneeright_2 = new ModelRenderer(this, 48, 32);
        this.frontkneeright_2.setRotationPoint(0.6F, 1.9F, 9.1F);
        this.frontkneeright_2.addBox(-1.1F, -1.0F, -2.1F, 4, 10, 7, 0.0F);
        this.frontkneeright_1 = new ModelRenderer(this, 25, 32);
        this.frontkneeright_1.setRotationPoint(7.6F, 1.9F, 9.1F);
        this.frontkneeright_1.addBox(-1.1F, -1.0F, -2.1F, 4, 10, 7, 0.0F);
        this.hormbottomright = new ModelRenderer(this, 99, 0);
        this.hormbottomright.setRotationPoint(0.5F, 2.9F, 2.5F);
        this.hormbottomright.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(hormbottomright, 2.41309222380736F, 0.0F, 0.0F);
        this.bodyback.addChild(this.tail);
        this.frontkneeright_2.addChild(this.frontlegright_1);
        this.neckbottom.addChild(this.headback);
        this.headback.addChild(this.earight_1);
        this.headback.addChild(this.earight);
        this.bodymiddle.addChild(this.frontkneeleft);
        this.hormbottomright_1.addChild(this.hormbottomright_3);
        this.bodymiddle.addChild(this.bodyback);
        this.headback.addChild(this.headmiddle);
        this.hormbottomright.addChild(this.hormbottomright_2);
        this.bodymiddle.addChild(this.neckbottom);
        this.bodymiddle.addChild(this.frontkneeright);
        this.hormbottomright.addChild(this.hormbottomright_1);
        this.frontkneeright_1.addChild(this.frontlegright);
        this.frontkneeright.addChild(this.frontlegright_2);
        this.frontkneeleft.addChild(this.frontlegleft);
        this.bodyback.addChild(this.frontkneeright_2);
        this.bodyback.addChild(this.frontkneeright_1);
        this.headback.addChild(this.hormbottomright);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bodymiddle.offsetX, this.bodymiddle.offsetY, this.bodymiddle.offsetZ);
        GlStateManager.translate(this.bodymiddle.rotationPointX * f5, this.bodymiddle.rotationPointY * f5, this.bodymiddle.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.8D, 0.7D);
        GlStateManager.translate(-this.bodymiddle.offsetX, -this.bodymiddle.offsetY, -this.bodymiddle.offsetZ);
        GlStateManager.translate(-this.bodymiddle.rotationPointX * f5, -this.bodymiddle.rotationPointY * f5, -this.bodymiddle.rotationPointZ * f5);
        this.bodymiddle.render(f5);
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

        this.frontkneeright.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.frontkneeleft.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.frontkneeright_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.frontkneeright_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
