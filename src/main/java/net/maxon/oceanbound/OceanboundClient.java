package net.maxon.oceanbound;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.maxon.oceanbound.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class OceanboundClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DREAM_SAPLING, RenderLayer.getCutout());
    }
}
