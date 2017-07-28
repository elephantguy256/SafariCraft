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
public class ModelImpala extends ModelBase {
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
    public ModelRenderer neckmiddle;
    public ModelRenderer necktop;
    public ModelRenderer headback;
    public ModelRenderer earleft;
    public ModelRenderer earight;
    public ModelRenderer headmiddle;
    public ModelRenderer hormbottomright;
    public ModelRenderer hormmid;
    public ModelRenderer hormbottomright_1;
    public ModelRenderer hormtop;
    public ModelRenderer hormmid_1;
    public ModelRenderer hormtop_1;

    public ModelImpala() {
        this.textureWidth = 120;
        this.textureHeight = 90;
        this.necktop = new ModelRenderer(this, 45, 38);
        this.necktop.setRotationPoint(-0.2F, -0.3F, -0.1F);
        this.necktop.addBox(0.0F, 0.0F, 0.0F, 4, 6, 7, 0.0F);
        this.bodyback = new ModelRenderer(this, 60, 67);
        this.bodyback.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.bodyback.addBox(0.0F, 0.0F, 0.0F, 10, 9, 13, 0.0F);
        this.setRotateAngle(bodyback, -0.045553093477052F, 0.0F, 0.0F);
        this.frontlegleft = new ModelRenderer(this, 74, 43);
        this.frontlegleft.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegleft.addBox(-1.9F, 0.0F, -1.6F, 2, 14, 3, 0.0F);
        this.hormbottomright = new ModelRenderer(this, 99, 0);
        this.hormbottomright.setRotationPoint(1.0F, 1.9F, 3.8F);
        this.hormbottomright.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(hormbottomright, 2.41309222380736F, 0.0F, 0.0F);
        this.hormtop_1 = new ModelRenderer(this, 31, 0);
        this.hormtop_1.setRotationPoint(0.0F, 5.9F, 0.0F);
        this.hormtop_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(hormtop_1, 0.6373942428283291F, 0.0F, 0.091106186954104F);
        this.neckmiddle = new ModelRenderer(this, 37, 0);
        this.neckmiddle.setRotationPoint(1.2F, -0.4F, -4.2F);
        this.neckmiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.setRotateAngle(neckmiddle, -0.22759093446006054F, 0.0F, 0.0F);
        this.headback = new ModelRenderer(this, 18, 20);
        this.headback.setRotationPoint(-1.0F, 4.7F, -4.1F);
        this.headback.addBox(0.0F, 0.0F, 0.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(headback, 1.1838568316277536F, 0.0F, 0.0F);
        this.earight = new ModelRenderer(this, 0, 22);
        this.earight.setRotationPoint(-0.6F, -0.9F, 6.9F);
        this.earight.addBox(0.0F, 0.0F, -0.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earight, 0.7853981633974483F, 2.356194490192345F, -0.2617993877991494F);
        this.hormbottomright_1 = new ModelRenderer(this, 99, 0);
        this.hormbottomright_1.setRotationPoint(3.0F, 0.1F, 0.0F);
        this.hormbottomright_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.hormmid = new ModelRenderer(this, 41, 1);
        this.hormmid.setRotationPoint(0.0F, 4.3F, 1.1F);
        this.hormmid.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(hormmid, -0.6373942428283291F, 0.0F, 0.22759093446006054F);
        this.frontkneeleft = new ModelRenderer(this, 56, 52);
        this.frontkneeleft.setRotationPoint(9.3F, 5.9F, 3.0F);
        this.frontkneeleft.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeleft, -0.045553093477052F, 0.0F, 0.0F);
        this.frontkneeright_2 = new ModelRenderer(this, 56, 52);
        this.frontkneeright_2.setRotationPoint(0.7F, 6.3F, 8.5F);
        this.frontkneeright_2.addBox(-1.1F, -1.0F, -2.1F, 3, 10, 4, 0.0F);
        this.setRotateAngle(frontkneeright_2, 0.4553564018453205F, 0.0F, 0.0F);
        this.headmiddle = new ModelRenderer(this, 73, 0);
        this.headmiddle.setRotationPoint(1.0F, 1.4F, -4.9F);
        this.headmiddle.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(headmiddle, 0.136659280431156F, -0.01937315469713706F, 0.0F);
        this.hormtop = new ModelRenderer(this, 31, 0);
        this.hormtop.setRotationPoint(0.0F, 5.9F, 0.0F);
        this.hormtop.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(hormtop, 0.6373942428283291F, 0.0F, -0.091106186954104F);
        this.hormmid_1 = new ModelRenderer(this, 41, 1);
        this.hormmid_1.setRotationPoint(0.0F, 4.3F, 1.1F);
        this.hormmid_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(hormmid_1, -0.6373942428283291F, 0.0F, -0.22759093446006054F);
        this.bodymiddle = new ModelRenderer(this, 8, 64);
        this.bodymiddle.setRotationPoint(-6.0F, 4.8F, -10.1F);
        this.bodymiddle.addBox(0.0F, 0.0F, 0.0F, 10, 9, 13, 0.0F);
        this.setRotateAngle(bodymiddle, 0.045553093477052F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 41);
        this.tail.setRotationPoint(4.0F, 1.7F, 11.1F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(tail, 0.31869712141416456F, 0.0F, 0.0F);
        this.frontlegright_2 = new ModelRenderer(this, 74, 43);
        this.frontlegright_2.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegright_2.addBox(-1.1F, 0.0F, -1.6F, 2, 14, 3, 0.0F);
        this.earleft = new ModelRenderer(this, 0, 22);
        this.earleft.setRotationPoint(8.0F, -0.5F, 5.5F);
        this.earleft.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earleft, 0.7853981633974483F, -2.356194490192345F, 0.2617993877991494F);
        this.frontlegright = new ModelRenderer(this, 74, 47);
        this.frontlegright.setRotationPoint(0.5F, 7.5F, 0.7F);
        this.frontlegright.addBox(-1.1F, 0.0F, -1.6F, 2, 10, 3, 0.0F);
        this.setRotateAngle(frontlegright, -0.7285004297824331F, 0.0F, 0.0F);
        this.frontkneeright_1 = new ModelRenderer(this, 56, 52);
        this.frontkneeright_1.setRotationPoint(8.5F, 6.3F, 8.5F);
        this.frontkneeright_1.addBox(-1.1F, -1.0F, -2.1F, 3, 10, 4, 0.0F);
        this.setRotateAngle(frontkneeright_1, 0.4553564018453205F, 0.0F, 0.0F);
        this.frontkneeright = new ModelRenderer(this, 56, 52);
        this.frontkneeright.setRotationPoint(0.7F, 5.9F, 3.0F);
        this.frontkneeright.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeright, -0.045553093477052F, 0.0F, 0.0F);
        this.frontlegright_1 = new ModelRenderer(this, 74, 47);
        this.frontlegright_1.setRotationPoint(0.5F, 7.5F, 0.7F);
        this.frontlegright_1.addBox(-1.1F, 0.0F, -1.6F, 2, 10, 3, 0.0F);
        this.setRotateAngle(frontlegright_1, -0.7285004297824331F, 0.0F, 0.0F);
        this.neckbottom = new ModelRenderer(this, 0, 0);
        this.neckbottom.setRotationPoint(2.0F, -2.4F, 1.9F);
        this.neckbottom.addBox(0.0F, 0.0F, 0.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(neckbottom, -0.9105382707654417F, 0.0F, 0.0F);
        this.neckmiddle.addChild(this.necktop);
        this.bodymiddle.addChild(this.bodyback);
        this.frontkneeleft.addChild(this.frontlegleft);
        this.headback.addChild(this.hormbottomright);
        this.hormmid_1.addChild(this.hormtop_1);
        this.neckbottom.addChild(this.neckmiddle);
        this.necktop.addChild(this.headback);
        this.headback.addChild(this.earight);
        this.hormbottomright.addChild(this.hormbottomright_1);
        this.hormbottomright.addChild(this.hormmid);
        this.bodymiddle.addChild(this.frontkneeleft);
        this.bodyback.addChild(this.frontkneeright_2);
        this.headback.addChild(this.headmiddle);
        this.hormmid.addChild(this.hormtop);
        this.hormbottomright_1.addChild(this.hormmid_1);
        this.bodyback.addChild(this.tail);
        this.frontkneeright.addChild(this.frontlegright_2);
        this.headback.addChild(this.earleft);
        this.frontkneeright_1.addChild(this.frontlegright);
        this.bodyback.addChild(this.frontkneeright_1);
        this.bodymiddle.addChild(this.frontkneeright);
        this.frontkneeright_2.addChild(this.frontlegright_1);
        this.bodymiddle.addChild(this.neckbottom);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bodymiddle.offsetX, this.bodymiddle.offsetY, this.bodymiddle.offsetZ);
        GlStateManager.translate(this.bodymiddle.rotationPointX * f5, this.bodymiddle.rotationPointY * f5, this.bodymiddle.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.9D, 0.8D);
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
        this.frontkneeright_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.frontkneeright_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.frontkneeleft.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }
