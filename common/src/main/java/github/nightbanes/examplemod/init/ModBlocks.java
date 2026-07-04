package github.nightbanes.examplemod.init;

import github.nightbanes.examplemod.services.Services;
import github.nightbanes.examplemod.services.util.BlockItemRegistryHandle;
import net.minecraft.world.level.block.Block;

final public class ModBlocks {
    private ModBlocks() {}

    public static void load() {}

    public static final BlockItemRegistryHandle<Block> EXAMPLE_BLOCK = Services.REGISTRY.registerBlockItem("example_block",
            properties -> new Block(properties.strength(3.0F, 15.0F).requiresCorrectToolForDrops()));
}