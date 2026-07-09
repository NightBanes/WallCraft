package github.nightbanes.wallcraft.init;

import github.nightbanes.wallcraft.block.StrippableWallBlock;
import github.nightbanes.wallcraft.services.Services;
import github.nightbanes.wallcraft.services.util.BlockItemRegistryHandle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;

final public class ModBlocks {
    private ModBlocks() {}

    public static void load() {}

    // Oak walls
    public static final BlockItemRegistryHandle<Block> OAK_LOG_WALL = Services.REGISTRY.registerBlockItem("oak_log_wall",
            properties -> new StrippableWallBlock(properties.strength(2.0F, 2.0F).requiresCorrectToolForDrops(), ModBlocks::getStrippedOakLogWall));
    public static final BlockItemRegistryHandle<Block> OAK_WOOD_WALL = Services.REGISTRY.registerBlockItem("oak_wood_wall",
            properties -> new StrippableWallBlock(properties.strength(2.0F, 2.0F).requiresCorrectToolForDrops(), ModBlocks::getStrippedOakWoodWall));
    public static final BlockItemRegistryHandle<Block> STRIPPED_OAK_LOG_WALL = Services.REGISTRY.registerBlockItem("stripped_oak_log_wall",
            properties -> new WallBlock(properties.strength(2.0F, 2.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> STRIPPED_OAK_WOOD_WALL = Services.REGISTRY.registerBlockItem("stripped_oak_wood_wall",
            properties -> new WallBlock(properties.strength(2.0F, 2.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> OAK_PLANK_WALL = Services.REGISTRY.registerBlockItem("oak_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Spruce walls
    public static final BlockItemRegistryHandle<Block> SPRUCE_PLANK_WALL = Services.REGISTRY.registerBlockItem("spruce_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Birch walls
    public static final BlockItemRegistryHandle<Block> BIRCH_PLANK_WALL = Services.REGISTRY.registerBlockItem("birch_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Jungle walls
    public static final BlockItemRegistryHandle<Block> JUNGLE_PLANK_WALL = Services.REGISTRY.registerBlockItem("jungle_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Acacia walls
    public static final BlockItemRegistryHandle<Block> ACACIA_PLANK_WALL = Services.REGISTRY.registerBlockItem("acacia_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Dark Oak walls
    public static final BlockItemRegistryHandle<Block> DARK_OAK_PLANK_WALL = Services.REGISTRY.registerBlockItem("dark_oak_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Mangrove walls
    public static final BlockItemRegistryHandle<Block> MANGROVE_PLANK_WALL = Services.REGISTRY.registerBlockItem("mangrove_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Cherry walls
    public static final BlockItemRegistryHandle<Block> CHERRY_PLANK_WALL = Services.REGISTRY.registerBlockItem("cherry_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Pale Oak walls
    public static final BlockItemRegistryHandle<Block> PALE_OAK_PLANK_WALL = Services.REGISTRY.registerBlockItem("pale_oak_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Bamboo walls
    //stripped bamboo
    //bamboo mosaic
    public static final BlockItemRegistryHandle<Block> BAMBOO_PLANK_WALL = Services.REGISTRY.registerBlockItem("bamboo_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Crimson walls
    public static final BlockItemRegistryHandle<Block> CRIMSON_PLANK_WALL = Services.REGISTRY.registerBlockItem("crimson_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));

    // Warped walls
    public static final BlockItemRegistryHandle<Block> WARPED_PLANK_WALL = Services.REGISTRY.registerBlockItem("warped_plank_wall",
            properties -> new WallBlock(properties.strength(2.0F, 3.0F).requiresCorrectToolForDrops()));


    // Stone-like walls
    public static final BlockItemRegistryHandle<Block> STONE_WALL = Services.REGISTRY.registerBlockItem("stone_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> POLISHED_GRANITE_WALL = Services.REGISTRY.registerBlockItem("polished_granite_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> POLISHED_DIORITE_WALL = Services.REGISTRY.registerBlockItem("polished_diorite_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> POLISHED_ANDESITE_WALL = Services.REGISTRY.registerBlockItem("polished_andesite_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> SMOOTH_SANDSTONE_WALL = Services.REGISTRY.registerBlockItem("smooth_sandstone_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> SMOOTH_RED_SANDSTONE_WALL = Services.REGISTRY.registerBlockItem("smooth_red_sandstone_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));

    /*
    public static final BlockItemRegistryHandle<Block> PRISMARINE_BRICK_WALL = Services.REGISTRY.registerBlockItem("prismarine_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> DARK_PRISMARINE_BRICK_WALL = Services.REGISTRY.registerBlockItem("dark_prismarine_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final BlockItemRegistryHandle<Block> PURPUR_WALL = Services.REGISTRY.registerBlockItem("purpur_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));

    public static final BlockItemRegistryHandle<Block> QUARTZ_WALL = Services.REGISTRY.registerBlockItem("quartz_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    //quartz bricks
    public static final BlockItemRegistryHandle<Block> SMOOTH_QUARTZ_WALL = Services.REGISTRY.registerBlockItem("smooth_quartz_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));

    // Cut Copper
    */

    private static Block getStrippedOakLogWall() {
        return STRIPPED_OAK_LOG_WALL.block().get();
    }

    private static Block getStrippedOakWoodWall() {
        return STRIPPED_OAK_WOOD_WALL.block().get();
    }

}
