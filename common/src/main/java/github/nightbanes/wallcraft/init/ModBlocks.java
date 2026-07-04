package github.nightbanes.wallcraft.init;

import github.nightbanes.wallcraft.services.Services;
import github.nightbanes.wallcraft.services.util.BlockItemRegistryHandle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;

final public class ModBlocks {
    private ModBlocks() {}

    public static void load() {}

    public static final BlockItemRegistryHandle<Block> EXAMPLE_BLOCK = Services.REGISTRY.registerBlockItem("example_block",
            properties -> new Block(properties.strength(3.0F, 15.0F).requiresCorrectToolForDrops()));

    public static final BlockItemRegistryHandle<Block> SMOOTH_SANDSTONE_WALL = Services.REGISTRY.registerBlockItem("smooth_sandstone_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
}