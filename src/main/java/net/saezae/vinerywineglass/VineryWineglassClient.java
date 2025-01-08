package net.saezae.vinerywineglass;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.saezae.vinerywineglass.block.ModBlocks;

@Environment(EnvType.CLIENT)
public class VineryWineglassClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINEGLASS, RenderLayer.getCutout());
    }    
}
