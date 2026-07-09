package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
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
        ModWallGenerator.createLogWall(blockModels, Blocks.OAK_LOG, ModBlocks.OAK_LOG_WALL.block().get());

        // Wood walls
        ModWallGenerator.createWall(blockModels, Blocks.OAK_LOG, ModBlocks.OAK_WOOD_WALL.block().get());

        // Stripped Log walls
        ModWallGenerator.createLogWall(blockModels, Blocks.STRIPPED_OAK_LOG, ModBlocks.STRIPPED_OAK_LOG_WALL.block().get());

        // Stripped Wood walls
        ModWallGenerator.createWall(blockModels, Blocks.STRIPPED_OAK_LOG, ModBlocks.STRIPPED_OAK_WOOD_WALL.block().get());

        // Plank walls
        ModWallGenerator.createWall(blockModels, Blocks.OAK_PLANKS, ModBlocks.OAK_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.PALE_OAK_PLANKS, ModBlocks.PALE_OAK_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_PLANK_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.WARPED_PLANKS, ModBlocks.WARPED_PLANK_WALL.block().get());

        // Stone-type walls
        ModWallGenerator.createWall(blockModels, Blocks.STONE, ModBlocks.STONE_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Identifier.withDefaultNamespace("block/sandstone_top"), ModBlocks.SMOOTH_SANDSTONE_WALL.block().get());
        ModWallGenerator.createWall(blockModels, Identifier.withDefaultNamespace("block/red_sandstone_top"), ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get());

    }

}
