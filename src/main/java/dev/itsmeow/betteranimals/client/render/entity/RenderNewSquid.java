package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewSquid;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewSquid extends MobRenderer<SquidEntity, ModelNewSquid<SquidEntity>> {
    private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/squid.png");

    public RenderNewSquid(EntityRendererManager m) {
        super(m, new ModelNewSquid<SquidEntity>(), 0.7F);
    }

    public RenderNewSquid(EntityRendererManager m, ResourceLocation texture) {
        super(m, new ModelNewSquid<SquidEntity>(), 0.7F);
        if(texture != null) {
            this.texture = texture;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless
     * you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(SquidEntity entity) {
        return texture;
    }

    @Override
    protected void applyRotations(SquidEntity entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        float f = entityLiving.prevSquidPitch + (entityLiving.squidPitch - entityLiving.prevSquidPitch) * partialTicks;
        float f1 = entityLiving.prevSquidYaw + (entityLiving.squidYaw - entityLiving.prevSquidYaw) * partialTicks;
        GlStateManager.translatef(0.0F, 0.5F, 0.0F);
        GlStateManager.rotatef(180.0F - rotationYaw, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotatef(f, 1.0F, 0.0F, 0.0F);
        GlStateManager.rotatef(f1, 0.0F, 1.0F, 0.0F);
        GlStateManager.translatef(0.0F, -1.2F, 0.0F);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    @Override
    protected float handleRotationFloat(SquidEntity livingBase, float partialTicks) {
        return -(livingBase.lastTentacleAngle + (livingBase.tentacleAngle - livingBase.lastTentacleAngle) * partialTicks);
    }
}