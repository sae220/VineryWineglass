package net.saezae.vinerywineglass.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saezae.vinerywineglass.VineryWineglass;

public class ModBlocks {
    public static final Block WINEGLASS;

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(VineryWineglass.MODID, id), block);
    }

    static {
        WINEGLASS = register("wineglass", new WineglassBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    }

    public static void initialize() {}
}
