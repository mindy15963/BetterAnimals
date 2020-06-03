package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewCow;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewMooshroomMushroom;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewMooshroom extends MobRenderer<MooshroomEntity, ModelNewCow<MooshroomEntity>> {
    private static final ResourceLocation RED = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom.png");
    private static final ResourceLocation BROWN = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom_brown.png");

    public RenderNewMooshroom(EntityRendererManager m) {
        super(m, new ModelNewCow<MooshroomEntity>(), 0.7F);
        this.addLayer(new LayerNewMooshroomMushroom<MooshroomEntity, ModelNewCow<MooshroomEntity>>(this));
    }

    @Override
    protected void preRenderCallback(MooshroomEntity entitylivingbaseIn, float partialTickTime) {
        if(!getEntityModel().isChild) {
            GlStateManager.scaled(0.80D, 0.80, 0.80);
        } else {
            GlStateManager.translated(0, 0.15D, 0);
        }
    }

    protected ResourceLocation getEntityTexture(MooshroomEntity entity) {
        return entity.getMooshroomType() == MooshroomEntity.Type.BROWN ? BROWN : RED;
    }
}