package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Add items to generate json for
        //itemModels.generateFlatItem(ModItems.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);

        // Add blocks to generate json for
        //blockModels.family(Blocks.OAK_LOG).wall(ModBlocks.OAK_WOOD_WALL.block().get()); // uses vanilla method but is all one texture and also generates a new blockstate for the minecraft block

        // Log walls
        ModWallGenerator.createLogWall(blockModels, ModBlocks.OAK_LOG_WALL.block().get(), Blocks.OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.SPRUCE_LOG_WALL.block().get(), Blocks.SPRUCE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.BIRCH_LOG_WALL.block().get(), Blocks.BIRCH_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.JUNGLE_LOG_WALL.block().get(), Blocks.JUNGLE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.ACACIA_LOG_WALL.block().get(), Blocks.ACACIA_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.DARK_OAK_LOG_WALL.block().get(), Blocks.DARK_OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.MANGROVE_LOG_WALL.block().get(), Blocks.MANGROVE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.CHERRY_LOG_WALL.block().get(), Blocks.CHERRY_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.PALE_OAK_LOG_WALL.block().get(), Blocks.PALE_OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.BAMBOO_WALL.block().get(), Blocks.BAMBOO_BLOCK);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.CRIMSON_STEM_WALL.block().get(), Blocks.CRIMSON_STEM);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.WARPED_STEM_WALL.block().get(), Blocks.WARPED_STEM);

        // Wood walls
        ModWallGenerator.createWall(blockModels, ModBlocks.OAK_WOOD_WALL.block().get(), Blocks.OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.SPRUCE_WOOD_WALL.block().get(), Blocks.SPRUCE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.BIRCH_WOOD_WALL.block().get(), Blocks.BIRCH_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.JUNGLE_WOOD_WALL.block().get(), Blocks.JUNGLE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.ACACIA_WOOD_WALL.block().get(), Blocks.ACACIA_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.DARK_OAK_WOOD_WALL.block().get(), Blocks.DARK_OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.MANGROVE_WOOD_WALL.block().get(), Blocks.MANGROVE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.CHERRY_WOOD_WALL.block().get(), Blocks.CHERRY_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.PALE_OAK_WOOD_WALL.block().get(), Blocks.PALE_OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.CRIMSON_HYPHAE_WALL.block().get(), Blocks.CRIMSON_STEM);
        ModWallGenerator.createWall(blockModels, ModBlocks.WARPED_HYPHAE_WALL.block().get(), Blocks.WARPED_STEM);

        // Stripped Log walls
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_SPRUCE_LOG_WALL.block().get(), Blocks.STRIPPED_SPRUCE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_BIRCH_LOG_WALL.block().get(), Blocks.STRIPPED_BIRCH_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_JUNGLE_LOG_WALL.block().get(), Blocks.STRIPPED_JUNGLE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_ACACIA_LOG_WALL.block().get(), Blocks.STRIPPED_ACACIA_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_DARK_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_DARK_OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_MANGROVE_LOG_WALL.block().get(), Blocks.STRIPPED_MANGROVE_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_CHERRY_LOG_WALL.block().get(), Blocks.STRIPPED_CHERRY_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_PALE_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_PALE_OAK_LOG);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_BAMBOO_WALL.block().get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_CRIMSON_STEM_WALL.block().get(), Blocks.STRIPPED_CRIMSON_STEM);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.STRIPPED_WARPED_STEM_WALL.block().get(), Blocks.STRIPPED_WARPED_STEM);

        // Stripped Wood walls
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.block().get(), Blocks.STRIPPED_SPRUCE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_BIRCH_WOOD_WALL.block().get(), Blocks.STRIPPED_BIRCH_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.block().get(), Blocks.STRIPPED_JUNGLE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_ACACIA_WOOD_WALL.block().get(), Blocks.STRIPPED_ACACIA_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_DARK_OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_MANGROVE_WOOD_WALL.block().get(), Blocks.STRIPPED_MANGROVE_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_CHERRY_WOOD_WALL.block().get(), Blocks.STRIPPED_CHERRY_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_PALE_OAK_LOG);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.block().get(), Blocks.STRIPPED_CRIMSON_STEM);
        ModWallGenerator.createWall(blockModels, ModBlocks.STRIPPED_WARPED_HYPHAE_WALL.block().get(), Blocks.STRIPPED_WARPED_STEM);

        // Plank walls
        ModWallGenerator.createWall(blockModels, ModBlocks.OAK_PLANK_WALL.block().get(), Blocks.OAK_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.SPRUCE_PLANK_WALL.block().get(), Blocks.SPRUCE_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.BIRCH_PLANK_WALL.block().get(), Blocks.BIRCH_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.JUNGLE_PLANK_WALL.block().get(), Blocks.JUNGLE_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.ACACIA_PLANK_WALL.block().get(), Blocks.ACACIA_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.DARK_OAK_PLANK_WALL.block().get(), Blocks.DARK_OAK_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.MANGROVE_PLANK_WALL.block().get(), Blocks.MANGROVE_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.CHERRY_PLANK_WALL.block().get(), Blocks.CHERRY_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.PALE_OAK_PLANK_WALL.block().get(), Blocks.PALE_OAK_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.BAMBOO_PLANK_WALL.block().get(), Blocks.BAMBOO_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.CRIMSON_PLANK_WALL.block().get(), Blocks.CRIMSON_PLANKS);
        ModWallGenerator.createWall(blockModels, ModBlocks.WARPED_PLANK_WALL.block().get(), Blocks.WARPED_PLANKS);

        // Decorative walls
        ModWallGenerator.createWall(blockModels, ModBlocks.BAMBOO_MOSAIC_WALL.block().get(), Blocks.BAMBOO_MOSAIC);

        // Stone-type walls
        ModWallGenerator.createWall(blockModels, ModBlocks.STONE_WALL.block().get(), Blocks.STONE);
        ModWallGenerator.createWall(blockModels, ModBlocks.POLISHED_GRANITE_WALL.block().get(), Blocks.POLISHED_GRANITE);
        ModWallGenerator.createWall(blockModels, ModBlocks.POLISHED_DIORITE_WALL.block().get(), Blocks.POLISHED_DIORITE);
        ModWallGenerator.createWall(blockModels, ModBlocks.POLISHED_ANDESITE_WALL.block().get(), Blocks.POLISHED_ANDESITE);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.CUT_SANDSTONE_WALL.block().get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE);
        ModWallGenerator.createLogWall(blockModels, ModBlocks.CUT_RED_SANDSTONE_WALL.block().get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        ModWallGenerator.createWall(blockModels, ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), Identifier.withDefaultNamespace("block/sandstone_top"));
        ModWallGenerator.createWall(blockModels, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), Identifier.withDefaultNamespace("block/red_sandstone_top"));

    }

}
