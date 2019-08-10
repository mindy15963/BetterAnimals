package com.ocelot.betteranimals.client.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

/**
 * newspider - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSpider<T extends LivingEntity> extends Model<T> {

	public RendererModel bodyBase;
	public RendererModel abdomen;
	public RendererModel thorax;
	public RendererModel head;
	public RendererModel lLeg01a;
	public RendererModel lLeg02a;
	public RendererModel lLeg03a;
	public RendererModel lLeg04a;
	public RendererModel rLeg01a;
	public RendererModel rLeg02a;
	public RendererModel rLeg03a;
	public RendererModel rLeg04a;
	public RendererModel lPedipalp01;
	public RendererModel rPedipalp01;
	public RendererModel lMandible;
	public RendererModel rMandible;
	public RendererModel lFang01;
	public RendererModel lFang02;
	public RendererModel rFang01;
	public RendererModel rFang02;
	public RendererModel lLeg01b;
	public RendererModel lLeg01c;
	public RendererModel lLeg02b;
	public RendererModel lLeg02c;
	public RendererModel lLeg03b;
	public RendererModel lLeg03c;
	public RendererModel lLeg04b;
	public RendererModel lLeg04c;
	public RendererModel rLeg01b;
	public RendererModel rLeg01c;
	public RendererModel rLeg02b;
	public RendererModel rLeg02c;
	public RendererModel rLeg03b;
	public RendererModel rLeg03c;
	public RendererModel rLeg04b;
	public RendererModel rLeg04c;
	public RendererModel lPedipalp02;
	public RendererModel rPedipalp02;

	public ModelNewSpider() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.rLeg01a = new RendererModel(this, 39, 17);
		this.rLeg01a.mirror = true;
		this.rLeg01a.setRotationPoint(-2.5F, 1.0F, -6.3F);
		this.rLeg01a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(rLeg01a, 0.40980330836826856F, 0.0F, -0.7285004297824331F);
		this.lLeg01c = new RendererModel(this, 44, 26);
		this.lLeg01c.setRotationPoint(7.3F, -0.1F, 0.0F);
		this.lLeg01c.addBox(0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg01c, 0.0F, 0.0F, 0.5918411493512771F);
		this.lPedipalp01 = new RendererModel(this, 30, 12);
		this.lPedipalp01.setRotationPoint(3.8F, 1.3F, -7.6F);
		this.lPedipalp01.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(lPedipalp01, -0.136659280431156F, -0.31869712141416456F, 0.0F);
		this.lFang01 = new RendererModel(this, 48, 19);
		this.lFang01.setRotationPoint(0.0F, 2.1F, -1.2F);
		this.lFang01.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lFang01, -0.27314402793711257F, 0.0F, 0.0F);
		this.rPedipalp01 = new RendererModel(this, 30, 12);
		this.rPedipalp01.mirror = true;
		this.rPedipalp01.setRotationPoint(-3.8F, 1.3F, -7.6F);
		this.rPedipalp01.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rPedipalp01, -0.136659280431156F, 0.31869712141416456F, 0.0F);
		this.abdomen = new RendererModel(this, 0, 15);
		this.abdomen.setRotationPoint(0.0F, -0.3F, 0.6F);
		this.abdomen.addBox(-4.5F, -3.0F, 0.0F, 9, 6, 10, 0.0F);
		this.setRotateAngle(abdomen, -0.18203784098300857F, 0.0F, 0.0F);
		this.rLeg02a = new RendererModel(this, 39, 17);
		this.rLeg02a.mirror = true;
		this.rLeg02a.setRotationPoint(-3.0F, 1.0F, -4.6F);
		this.rLeg02a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(rLeg02a, 0.22759093446006054F, 0.0F, -0.7285004297824331F);
		this.lPedipalp02 = new RendererModel(this, 30, 12);
		this.lPedipalp02.setRotationPoint(0.0F, -0.2F, -3.6F);
		this.lPedipalp02.addBox(-0.49F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(lPedipalp02, 1.0016444577195458F, 0.0F, 0.0F);
		this.lLeg02a = new RendererModel(this, 39, 17);
		this.lLeg02a.setRotationPoint(3.0F, 1.0F, -4.6F);
		this.lLeg02a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(lLeg02a, 0.22759093446006054F, 0.0F, 0.7285004297824331F);
		this.rFang01 = new RendererModel(this, 48, 19);
		this.rFang01.mirror = true;
		this.rFang01.setRotationPoint(0.0F, 2.1F, -1.2F);
		this.rFang01.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rFang01, -0.27314402793711257F, 0.0F, 0.0F);
		this.rLeg01c = new RendererModel(this, 44, 26);
		this.rLeg01c.mirror = true;
		this.rLeg01c.setRotationPoint(-7.3F, -0.1F, 0.0F);
		this.rLeg01c.addBox(-8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg01c, 0.0F, 0.0F, -0.5918411493512771F);
		this.rLeg03a = new RendererModel(this, 39, 17);
		this.rLeg03a.mirror = true;
		this.rLeg03a.setRotationPoint(-3.0F, 1.0F, -3.3F);
		this.rLeg03a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(rLeg03a, -0.22759093446006054F, 0.0F, -0.7285004297824331F);
		this.rLeg01b = new RendererModel(this, 44, 26);
		this.rLeg01b.mirror = true;
		this.rLeg01b.setRotationPoint(-0.3F, -5.6F, 0.0F);
		this.rLeg01b.addBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg01b, -0.091106186954104F, -0.40980330836826856F, 0.091106186954104F);
		this.rLeg03c = new RendererModel(this, 44, 26);
		this.rLeg03c.mirror = true;
		this.rLeg03c.setRotationPoint(-7.3F, -0.1F, 0.0F);
		this.rLeg03c.addBox(-8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg03c, 0.0F, 0.0F, -0.5918411493512771F);
		this.lLeg03a = new RendererModel(this, 39, 17);
		this.lLeg03a.setRotationPoint(3.0F, 1.0F, -3.3F);
		this.lLeg03a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(lLeg03a, -0.22759093446006054F, 0.0F, 0.7285004297824331F);
		this.rLeg04c = new RendererModel(this, 44, 26);
		this.rLeg04c.mirror = true;
		this.rLeg04c.setRotationPoint(-7.3F, -0.1F, 0.0F);
		this.rLeg04c.addBox(-8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg04c, 0.0F, 0.091106186954104F, -0.5918411493512771F);
		this.rPedipalp02 = new RendererModel(this, 30, 12);
		this.rPedipalp02.mirror = true;
		this.rPedipalp02.setRotationPoint(0.0F, -0.2F, -3.6F);
		this.rPedipalp02.addBox(-0.51F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rPedipalp02, 1.0016444577195458F, 0.0F, 0.0F);
		this.lLeg04b = new RendererModel(this, 44, 26);
		this.lLeg04b.setRotationPoint(0.3F, -5.6F, 0.0F);
		this.lLeg04b.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg04b, 0.091106186954104F, -0.27314402793711257F, -0.091106186954104F);
		this.bodyBase = new RendererModel(this, 25, 0);
		this.bodyBase.setRotationPoint(0.0F, 14.7F, 4.0F);
		this.bodyBase.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 1, 0.0F);
		this.rMandible = new RendererModel(this, 50, 12);
		this.rMandible.mirror = true;
		this.rMandible.setRotationPoint(-1.8F, 1.8F, -2.6F);
		this.rMandible.addBox(-1.5F, -1.5F, -1.9F, 3, 4, 2, 0.0F);
		this.setRotateAngle(rMandible, 0.27314402793711257F, 0.0F, 0.0F);
		this.rLeg04b = new RendererModel(this, 44, 26);
		this.rLeg04b.mirror = true;
		this.rLeg04b.setRotationPoint(-0.3F, -5.6F, 0.0F);
		this.rLeg04b.addBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg04b, 0.136659280431156F, 0.27314402793711257F, 0.091106186954104F);
		this.lLeg04a = new RendererModel(this, 39, 17);
		this.lLeg04a.setRotationPoint(2.5F, 1.0F, -1.5F);
		this.lLeg04a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(lLeg04a, -0.40980330836826856F, 0.0F, 0.7285004297824331F);
		this.lLeg03b = new RendererModel(this, 44, 26);
		this.lLeg03b.setRotationPoint(0.3F, -5.6F, 0.0F);
		this.lLeg03b.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg03b, -0.136659280431156F, -0.22759093446006054F, -0.091106186954104F);
		this.rLeg02c = new RendererModel(this, 44, 26);
		this.rLeg02c.mirror = true;
		this.rLeg02c.setRotationPoint(-7.3F, -0.1F, 0.0F);
		this.rLeg02c.addBox(-8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg02c, 0.0F, 0.0F, -0.5918411493512771F);
		this.rFang02 = new RendererModel(this, 57, 20);
		this.rFang02.mirror = true;
		this.rFang02.setRotationPoint(0.0F, -0.1F, 2.4F);
		this.rFang02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rFang02, 0.31869712141416456F, 0.31869712141416456F, -0.7740535232594852F);
		this.lLeg01a = new RendererModel(this, 39, 17);
		this.lLeg01a.setRotationPoint(2.5F, 1.0F, -6.3F);
		this.lLeg01a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(lLeg01a, 0.40980330836826856F, 0.0F, 0.7285004297824331F);
		this.rLeg02b = new RendererModel(this, 44, 26);
		this.rLeg02b.mirror = true;
		this.rLeg02b.setRotationPoint(-0.3F, -5.6F, 0.0F);
		this.rLeg02b.addBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg02b, 0.136659280431156F, -0.22759093446006054F, 0.091106186954104F);
		this.head = new RendererModel(this, 36, 0);
		this.head.setRotationPoint(0.0F, -0.4F, -7.2F);
		this.head.addBox(-3.5F, -3.0F, -3.0F, 7, 5, 6, 0.0F);
		this.lLeg02c = new RendererModel(this, 44, 26);
		this.lLeg02c.setRotationPoint(7.3F, -0.1F, 0.0F);
		this.lLeg02c.addBox(0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg02c, -0.091106186954104F, 0.091106186954104F, 0.5918411493512771F);
		this.lLeg02b = new RendererModel(this, 44, 26);
		this.lLeg02b.setRotationPoint(0.3F, -5.6F, 0.0F);
		this.lLeg02b.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg02b, 0.136659280431156F, 0.22759093446006054F, -0.091106186954104F);
		this.thorax = new RendererModel(this, 0, 0);
		this.thorax.setRotationPoint(0.0F, 0.4F, 0.0F);
		this.thorax.addBox(-4.0F, -2.0F, -8.0F, 8, 4, 8, 0.0F);
		this.rLeg04a = new RendererModel(this, 39, 17);
		this.rLeg04a.mirror = true;
		this.rLeg04a.setRotationPoint(-2.5F, 1.0F, -1.5F);
		this.rLeg04a.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(rLeg04a, -0.40980330836826856F, 0.0F, -0.7285004297824331F);
		this.lLeg03c = new RendererModel(this, 44, 26);
		this.lLeg03c.setRotationPoint(7.3F, -0.1F, 0.0F);
		this.lLeg03c.addBox(0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg03c, 0.091106186954104F, -0.091106186954104F, 0.5918411493512771F);
		this.lLeg01b = new RendererModel(this, 44, 26);
		this.lLeg01b.setRotationPoint(0.3F, -5.6F, 0.0F);
		this.lLeg01b.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg01b, -0.091106186954104F, 0.40980330836826856F, -0.091106186954104F);
		this.lLeg04c = new RendererModel(this, 44, 26);
		this.lLeg04c.setRotationPoint(7.3F, -0.1F, 0.0F);
		this.lLeg04c.addBox(0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(lLeg04c, 0.0F, -0.091106186954104F, 0.5918411493512771F);
		this.lFang02 = new RendererModel(this, 57, 20);
		this.lFang02.setRotationPoint(0.0F, -0.1F, 2.4F);
		this.lFang02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lFang02, 0.31869712141416456F, -0.31869712141416456F, 0.7740535232594852F);
		this.rLeg03b = new RendererModel(this, 44, 26);
		this.rLeg03b.mirror = true;
		this.rLeg03b.setRotationPoint(-0.3F, -5.6F, 0.0F);
		this.rLeg03b.addBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
		this.setRotateAngle(rLeg03b, 0.136659280431156F, 0.22759093446006054F, 0.091106186954104F);
		this.lMandible = new RendererModel(this, 50, 12);
		this.lMandible.setRotationPoint(1.8F, 1.8F, -2.6F);
		this.lMandible.addBox(-1.5F, -1.5F, -1.9F, 3, 4, 2, 0.0F);
		this.setRotateAngle(lMandible, 0.27314402793711257F, 0.0F, 0.0F);
		this.thorax.addChild(this.rLeg01a);
		this.lLeg01b.addChild(this.lLeg01c);
		this.thorax.addChild(this.lPedipalp01);
		this.lMandible.addChild(this.lFang01);
		this.thorax.addChild(this.rPedipalp01);
		this.bodyBase.addChild(this.abdomen);
		this.thorax.addChild(this.rLeg02a);
		this.lPedipalp01.addChild(this.lPedipalp02);
		this.thorax.addChild(this.lLeg02a);
		this.rMandible.addChild(this.rFang01);
		this.rLeg01b.addChild(this.rLeg01c);
		this.thorax.addChild(this.rLeg03a);
		this.rLeg01a.addChild(this.rLeg01b);
		this.rLeg03b.addChild(this.rLeg03c);
		this.thorax.addChild(this.lLeg03a);
		this.rLeg04b.addChild(this.rLeg04c);
		this.rPedipalp01.addChild(this.rPedipalp02);
		this.lLeg04a.addChild(this.lLeg04b);
		this.head.addChild(this.rMandible);
		this.rLeg04a.addChild(this.rLeg04b);
		this.thorax.addChild(this.lLeg04a);
		this.lLeg03a.addChild(this.lLeg03b);
		this.rLeg02b.addChild(this.rLeg02c);
		this.rFang01.addChild(this.rFang02);
		this.thorax.addChild(this.lLeg01a);
		this.rLeg02a.addChild(this.rLeg02b);
		this.thorax.addChild(this.head);
		this.lLeg02b.addChild(this.lLeg02c);
		this.lLeg02a.addChild(this.lLeg02b);
		this.bodyBase.addChild(this.thorax);
		this.thorax.addChild(this.rLeg04a);
		this.lLeg03b.addChild(this.lLeg03c);
		this.lLeg01a.addChild(this.lLeg01b);
		this.lLeg04b.addChild(this.lLeg04c);
		this.lFang01.addChild(this.lFang02);
		this.rLeg03a.addChild(this.rLeg03b);
		this.head.addChild(this.lMandible);
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(entity, f, f1, f2, f3, f4, f5);
		this.bodyBase.render(f5);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		if (entity instanceof LivingEntity) {
			LivingEntity living = (LivingEntity) entity;
			limbSwing = limbSwing + Model.getSwingProgressPrev(living);
			
			this.head.rotateAngleY = Model.getHeadYaw(living) * 0.017453292F;
			this.head.rotateAngleX = (float) Math.toRadians(Model.getHeadPitch(living)) * 0.017453292F;
			
			this.rLeg01a.rotateAngleZ = -((float) Math.PI / 4F);
			this.lLeg01a.rotateAngleZ = ((float) Math.PI / 4F);

			this.rLeg02a.rotateAngleZ = -0.78119464F;
			this.lLeg02a.rotateAngleZ = 0.78119464F;

			this.rLeg03a.rotateAngleZ = -0.78119464F;
			this.lLeg03a.rotateAngleZ = 0.78119464F;

			this.rLeg04a.rotateAngleZ = -((float) Math.PI / 4F) - 0.3F;
			this.rLeg04a.rotateAngleX = -((float) Math.PI / 4F) + 0.3F;

			this.lLeg04a.rotateAngleZ = ((float) Math.PI / 4F) + 0.3F;
			this.lLeg04a.rotateAngleX = ((float) Math.PI / 4F) - 1.3F;

			this.rLeg01a.rotateAngleY = ((float) Math.PI / 16F);
			this.lLeg01a.rotateAngleY = -((float) Math.PI / 16F);

			this.rLeg02a.rotateAngleY = 0.1926991F;
			this.lLeg02a.rotateAngleY = -0.1926991F;

			this.rLeg03a.rotateAngleY = 0.1926991F;
			this.lLeg03a.rotateAngleY = -0.1926991F;

			this.rLeg04a.rotateAngleY = -((float) Math.PI / 12F) + 0.4F;
			this.lLeg04a.rotateAngleY = ((float) Math.PI / 12F) - 0.4F;

			float f3 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
			float f4 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * limbSwingAmount;
			float f5 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
			float f6 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
			float f7 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
			float f8 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float) Math.PI) * 0.4F) * limbSwingAmount;
			float f9 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
			float f10 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;

			this.rLeg01a.rotateAngleY += f3;
			this.lLeg01a.rotateAngleY += -f3;
			this.rLeg02a.rotateAngleY += f4;
			this.lLeg02a.rotateAngleY += -f4;
			this.rLeg03a.rotateAngleY += f5;
			this.lLeg03a.rotateAngleY += -f5;
			this.rLeg04a.rotateAngleY += f6;
			this.lLeg04a.rotateAngleY += -f6;
			this.rLeg01a.rotateAngleZ += f7;
			this.lLeg01a.rotateAngleZ += -f7;
			this.rLeg02a.rotateAngleZ += f8;
			this.lLeg02a.rotateAngleZ += -f8;
			this.rLeg03a.rotateAngleZ += f9;
			this.lLeg03a.rotateAngleZ += -f9;
			this.rLeg04a.rotateAngleZ += f10;
			this.lLeg04a.rotateAngleZ += -f10;
			this.rLeg04a.rotateAngleZ += f10;
			this.lLeg04a.rotateAngleZ += -f10;
		}
	}
}
