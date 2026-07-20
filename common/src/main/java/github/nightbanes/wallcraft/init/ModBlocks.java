package github.nightbanes.wallcraft.init;

import github.nightbanes.wallcraft.block.StrippableWallBlock;
import github.nightbanes.wallcraft.services.Services;
import github.nightbanes.wallcraft.services.util.BlockItemRegistryHandle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WallBlock;

import java.util.function.Supplier;

final public class ModBlocks {
    private ModBlocks() {}

    public static void load() {}

    // Oak walls
    public static final BlockItemRegistryHandle<Block> OAK_LOG_WALL = strippableWoodWall("oak_log_wall", ModBlocks::getStrippedOakLogWall);
    public static final BlockItemRegistryHandle<Block> OAK_WOOD_WALL = strippableWoodWall("oak_wood_wall", ModBlocks::getStrippedOakWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_OAK_LOG_WALL = woodWall("stripped_oak_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_OAK_WOOD_WALL = woodWall("stripped_oak_wood_wall");
    public static final BlockItemRegistryHandle<Block> OAK_PLANK_WALL = plankWall("oak_plank_wall");

    // Spruce walls
    public static final BlockItemRegistryHandle<Block> SPRUCE_LOG_WALL = strippableWoodWall("spruce_log_wall", ModBlocks::getStrippedSpruceLogWall);
    public static final BlockItemRegistryHandle<Block> SPRUCE_WOOD_WALL = strippableWoodWall("spruce_wood_wall", ModBlocks::getStrippedSpruceWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_SPRUCE_LOG_WALL = woodWall("stripped_spruce_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_SPRUCE_WOOD_WALL = woodWall("stripped_spruce_wood_wall");
    public static final BlockItemRegistryHandle<Block> SPRUCE_PLANK_WALL = plankWall("spruce_plank_wall");

    // Birch walls
    public static final BlockItemRegistryHandle<Block> BIRCH_LOG_WALL = strippableWoodWall("birch_log_wall", ModBlocks::getStrippedBirchLogWall);
    public static final BlockItemRegistryHandle<Block> BIRCH_WOOD_WALL = strippableWoodWall("birch_wood_wall", ModBlocks::getStrippedBirchWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_BIRCH_LOG_WALL = woodWall("stripped_birch_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_BIRCH_WOOD_WALL = woodWall("stripped_birch_wood_wall");
    public static final BlockItemRegistryHandle<Block> BIRCH_PLANK_WALL = plankWall("birch_plank_wall");

    // Jungle walls
    public static final BlockItemRegistryHandle<Block> JUNGLE_LOG_WALL = strippableWoodWall("jungle_log_wall", ModBlocks::getStrippedJungleLogWall);
    public static final BlockItemRegistryHandle<Block> JUNGLE_WOOD_WALL = strippableWoodWall("jungle_wood_wall", ModBlocks::getStrippedJungleWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_JUNGLE_LOG_WALL = woodWall("stripped_jungle_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_JUNGLE_WOOD_WALL = woodWall("stripped_jungle_wood_wall");
    public static final BlockItemRegistryHandle<Block> JUNGLE_PLANK_WALL = plankWall("jungle_plank_wall");

    // Acacia walls
    public static final BlockItemRegistryHandle<Block> ACACIA_LOG_WALL = strippableWoodWall("acacia_log_wall", ModBlocks::getStrippedAcaciaLogWall);
    public static final BlockItemRegistryHandle<Block> ACACIA_WOOD_WALL = strippableWoodWall("acacia_wood_wall", ModBlocks::getStrippedAcaciaWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_ACACIA_LOG_WALL = woodWall("stripped_acacia_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_ACACIA_WOOD_WALL = woodWall("stripped_acacia_wood_wall");
    public static final BlockItemRegistryHandle<Block> ACACIA_PLANK_WALL = plankWall("acacia_plank_wall");

    // Dark Oak walls
    public static final BlockItemRegistryHandle<Block> DARK_OAK_LOG_WALL = strippableWoodWall("dark_oak_log_wall", ModBlocks::getStrippedDarkOakLogWall);
    public static final BlockItemRegistryHandle<Block> DARK_OAK_WOOD_WALL = strippableWoodWall("dark_oak_wood_wall", ModBlocks::getStrippedDarkOakWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_DARK_OAK_LOG_WALL = woodWall("stripped_dark_oak_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_DARK_OAK_WOOD_WALL = woodWall("stripped_dark_oak_wood_wall");
    public static final BlockItemRegistryHandle<Block> DARK_OAK_PLANK_WALL = plankWall("dark_oak_plank_wall");

    // Mangrove walls
    public static final BlockItemRegistryHandle<Block> MANGROVE_LOG_WALL = strippableWoodWall("mangrove_log_wall", ModBlocks::getStrippedMangroveLogWall);
    public static final BlockItemRegistryHandle<Block> MANGROVE_WOOD_WALL = strippableWoodWall("mangrove_wood_wall", ModBlocks::getStrippedMangroveWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_MANGROVE_LOG_WALL = woodWall("stripped_mangrove_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_MANGROVE_WOOD_WALL = woodWall("stripped_mangrove_wood_wall");
    public static final BlockItemRegistryHandle<Block> MANGROVE_PLANK_WALL = plankWall("mangrove_plank_wall");

    // Cherry walls
    public static final BlockItemRegistryHandle<Block> CHERRY_LOG_WALL = strippableWoodWall("cherry_log_wall", ModBlocks::getStrippedCherryLogWall);
    public static final BlockItemRegistryHandle<Block> CHERRY_WOOD_WALL = strippableWoodWall("cherry_wood_wall", ModBlocks::getStrippedCherryWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_CHERRY_LOG_WALL = woodWall("stripped_cherry_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_CHERRY_WOOD_WALL = woodWall("stripped_cherry_wood_wall");
    public static final BlockItemRegistryHandle<Block> CHERRY_PLANK_WALL = plankWall("cherry_plank_wall");

    // Pale Oak walls
    public static final BlockItemRegistryHandle<Block> PALE_OAK_LOG_WALL = strippableWoodWall("pale_oak_log_wall", ModBlocks::getStrippedPaleOakLogWall);
    public static final BlockItemRegistryHandle<Block> PALE_OAK_WOOD_WALL = strippableWoodWall("pale_oak_wood_wall", ModBlocks::getStrippedPaleOakWoodWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_PALE_OAK_LOG_WALL = woodWall("stripped_pale_oak_log_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_PALE_OAK_WOOD_WALL = woodWall("stripped_pale_oak_wood_wall");
    public static final BlockItemRegistryHandle<Block> PALE_OAK_PLANK_WALL = plankWall("pale_oak_plank_wall");

    // Bamboo walls
    public static final BlockItemRegistryHandle<Block> BAMBOO_WALL = strippableWoodWall("bamboo_wall", ModBlocks::getStrippedBambooWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_BAMBOO_WALL = woodWall("stripped_bamboo_wall");
    public static final BlockItemRegistryHandle<Block> BAMBOO_MOSAIC_WALL = woodWall("bamboo_mosaic_wall");
    public static final BlockItemRegistryHandle<Block> BAMBOO_PLANK_WALL = plankWall("bamboo_plank_wall");

    // Crimson walls
    public static final BlockItemRegistryHandle<Block> CRIMSON_STEM_WALL = strippableWoodWall("crimson_stem_wall", ModBlocks::getStrippedCrimsonStemWall);
    public static final BlockItemRegistryHandle<Block> CRIMSON_HYPHAE_WALL = strippableWoodWall("crimson_hyphae_wall", ModBlocks::getStrippedCrimsonHyphaeWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_CRIMSON_STEM_WALL = woodWall("stripped_crimson_stem_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_CRIMSON_HYPHAE_WALL = woodWall("stripped_crimson_hyphae_wall");
    public static final BlockItemRegistryHandle<Block> CRIMSON_PLANK_WALL = plankWall("crimson_plank_wall");

    // Warped walls
    public static final BlockItemRegistryHandle<Block> WARPED_STEM_WALL = strippableWoodWall("warped_stem_wall", ModBlocks::getStrippedWarpedStemWall);
    public static final BlockItemRegistryHandle<Block> WARPED_HYPHAE_WALL = strippableWoodWall("warped_hyphae_wall", ModBlocks::getStrippedWarpedHyphaeWall);
    public static final BlockItemRegistryHandle<Block> STRIPPED_WARPED_STEM_WALL = woodWall("stripped_warped_stem_wall");
    public static final BlockItemRegistryHandle<Block> STRIPPED_WARPED_HYPHAE_WALL = woodWall("stripped_warped_hyphae_wall");
    public static final BlockItemRegistryHandle<Block> WARPED_PLANK_WALL = plankWall("warped_plank_wall");

    // Stone-like walls
    public static final BlockItemRegistryHandle<Block> STONE_WALL = stoneWall("stone_wall", Blocks.STONE);
    public static final BlockItemRegistryHandle<Block> POLISHED_GRANITE_WALL = stoneWall("polished_granite_wall", Blocks.POLISHED_GRANITE);
    public static final BlockItemRegistryHandle<Block> POLISHED_DIORITE_WALL = stoneWall("polished_diorite_wall", Blocks.POLISHED_DIORITE);
    public static final BlockItemRegistryHandle<Block> POLISHED_ANDESITE_WALL = stoneWall("polished_andesite_wall", Blocks.POLISHED_ANDESITE);
    public static final BlockItemRegistryHandle<Block> CUT_SANDSTONE_WALL = stoneWall("cut_sandstone_wall", Blocks.CUT_SANDSTONE);
    public static final BlockItemRegistryHandle<Block> SMOOTH_SANDSTONE_WALL = stoneWall("smooth_sandstone_wall", Blocks.SMOOTH_SANDSTONE);
    public static final BlockItemRegistryHandle<Block> CUT_RED_SANDSTONE_WALL = stoneWall("cut_red_sandstone_wall", Blocks.CUT_RED_SANDSTONE);
    public static final BlockItemRegistryHandle<Block> SMOOTH_RED_SANDSTONE_WALL = stoneWall("smooth_red_sandstone_wall", Blocks.SMOOTH_RED_SANDSTONE);

    public static final BlockItemRegistryHandle<Block> BASALT_WALL = stoneWall("basalt_wall", Blocks.BASALT);
    public static final BlockItemRegistryHandle<Block> SMOOTH_BASALT_WALL = stoneWall("smooth_basalt_wall", Blocks.SMOOTH_BASALT);
    public static final BlockItemRegistryHandle<Block> POLISHED_BASALT_WALL = stoneWall("polished_basalt_wall", Blocks.POLISHED_BASALT);
    //public static final BlockItemRegistryHandle<Block> PRISMARINE_BRICK_WALL = stoneWall("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS);
    //public static final BlockItemRegistryHandle<Block> DARK_PRISMARINE_WALL = stoneWall("dark_prismarine_wall", Blocks.DARK_PRISMARINE);
    //public static final BlockItemRegistryHandle<Block> END_STONE_WALL = stoneWall("end_stone_wall", Blocks.END_STONE);
    //public static final BlockItemRegistryHandle<Block> PURPUR_WALL = stoneWall("purpur_wall", Blocks.PURPUR_BLOCK);
    //public static final BlockItemRegistryHandle<Block> QUARTZ_WALL = stoneWall("quartz_wall", Blocks.QUARTZ_BLOCK);
    //public static final BlockItemRegistryHandle<Block> CHISELED_QUARTZ_WALL = stoneWall("chiseled_quartz_wall", Blocks.CHISELED_QUARTZ_BLOCK);
    //public static final BlockItemRegistryHandle<Block> QUARTZ_BRICK_WALL = stoneWall("quartz_brick_wall", Blocks.QUARTZ_BRICKS);
    //public static final BlockItemRegistryHandle<Block> SMOOTH_QUARTZ_WALL = stoneWall("smooth_quartz_wall", Blocks.SMOOTH_QUARTZ);
//
        // Prismarine Brick
        // Dark Prismarine Brick
    // Cut Copper

    private static BlockItemRegistryHandle<Block> plankWall(String name) {
        return Services.REGISTRY.registerBlockItem(name,
                properties -> new WallBlock(properties.strength(2.0F, 3.0F)));
    }

    private static BlockItemRegistryHandle<Block> woodWall(String name) {
        return Services.REGISTRY.registerBlockItem(name,
                properties -> new WallBlock(properties.strength(2.0F, 2.0F)));
    }

    private static BlockItemRegistryHandle<Block> stoneWall(String name, Block baseBlock) {
        return Services.REGISTRY.registerBlockItem(name,
                properties -> new WallBlock(properties
                        .strength(baseBlock.defaultDestroyTime(), baseBlock.getExplosionResistance())
                        .requiresCorrectToolForDrops()));
    }

    private static BlockItemRegistryHandle<Block> strippableWoodWall(String name, Supplier<? extends Block> strippedBlock) {
        return Services.REGISTRY.registerBlockItem(name, properties -> new StrippableWallBlock(
                properties.strength(2.0F, 2.0F).requiresCorrectToolForDrops(), strippedBlock));
    }

    private static Block getStrippedOakLogWall() { return STRIPPED_OAK_LOG_WALL.block().get(); }
    private static Block getStrippedOakWoodWall() { return STRIPPED_OAK_WOOD_WALL.block().get(); }
    private static Block getStrippedSpruceLogWall() { return STRIPPED_SPRUCE_LOG_WALL.block().get(); }
    private static Block getStrippedSpruceWoodWall() { return STRIPPED_SPRUCE_WOOD_WALL.block().get(); }
    private static Block getStrippedBirchLogWall() { return STRIPPED_BIRCH_LOG_WALL.block().get(); }
    private static Block getStrippedBirchWoodWall() { return STRIPPED_BIRCH_WOOD_WALL.block().get(); }
    private static Block getStrippedJungleLogWall() { return STRIPPED_JUNGLE_LOG_WALL.block().get(); }
    private static Block getStrippedJungleWoodWall() { return STRIPPED_JUNGLE_WOOD_WALL.block().get(); }
    private static Block getStrippedAcaciaLogWall() { return STRIPPED_ACACIA_LOG_WALL.block().get(); }
    private static Block getStrippedAcaciaWoodWall() { return STRIPPED_ACACIA_WOOD_WALL.block().get(); }
    private static Block getStrippedDarkOakLogWall() { return STRIPPED_DARK_OAK_LOG_WALL.block().get(); }
    private static Block getStrippedDarkOakWoodWall() { return STRIPPED_DARK_OAK_WOOD_WALL.block().get(); }
    private static Block getStrippedMangroveLogWall() { return STRIPPED_MANGROVE_LOG_WALL.block().get(); }
    private static Block getStrippedMangroveWoodWall() { return STRIPPED_MANGROVE_WOOD_WALL.block().get(); }
    private static Block getStrippedCherryLogWall() { return STRIPPED_CHERRY_LOG_WALL.block().get(); }
    private static Block getStrippedCherryWoodWall() { return STRIPPED_CHERRY_WOOD_WALL.block().get(); }
    private static Block getStrippedPaleOakLogWall() { return STRIPPED_PALE_OAK_LOG_WALL.block().get(); }
    private static Block getStrippedPaleOakWoodWall() { return STRIPPED_PALE_OAK_WOOD_WALL.block().get(); }

    private static Block getStrippedBambooWall() { return STRIPPED_BAMBOO_WALL.block().get(); }

    private static Block getStrippedCrimsonStemWall() { return STRIPPED_CRIMSON_STEM_WALL.block().get(); }
    private static Block getStrippedCrimsonHyphaeWall() { return STRIPPED_CRIMSON_HYPHAE_WALL.block().get(); }
    private static Block getStrippedWarpedStemWall() { return STRIPPED_WARPED_STEM_WALL.block().get(); }
    private static Block getStrippedWarpedHyphaeWall() { return STRIPPED_WARPED_HYPHAE_WALL.block().get(); }

}
