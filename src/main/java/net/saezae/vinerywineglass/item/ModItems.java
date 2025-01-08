package net.saezae.vinerywineglass.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saezae.vinerywineglass.VineryWineglass;
import net.saezae.vinerywineglass.block.ModBlocks;

public class ModItems {
    public static final Item WINEGLASS_ITEM;

    private static final Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VineryWineglass.MODID, id), item);
    }

    static {
        WINEGLASS_ITEM = register("wineglass", new BlockItem(ModBlocks.WINEGLASS, new FabricItemSettings()));
    }

    public static void initialize() {}
}
