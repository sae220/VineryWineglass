package net.saezae.vinerywineglass.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saezae.vinerywineglass.VineryWineglass;
import net.saezae.vinerywineglass.block.ModBlocks;

public class ModItems {
    public static final Item RED_WINEGLASS_ITEM;
    public static final Item WHITE_WINEGLASS_ITEM;

    private static final Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VineryWineglass.MODID, id), item);
    }

    static {
        RED_WINEGLASS_ITEM = register("red_wineglass", new BlockItem(ModBlocks.RED_WINEGLASS, new FabricItemSettings()));
        WHITE_WINEGLASS_ITEM = register("white_wineglass", new BlockItem(ModBlocks.WHITE_WINEGLASS, new FabricItemSettings()));
    }

    public static void initialize() {}
}
