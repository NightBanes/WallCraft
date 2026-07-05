package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.LogWallGenerator;
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

        LogWallGenerator.createLogWall(
                blockModels,
                ModBlocks.OAK_LOG_WALL.block().get(),
                Identifier.withDefaultNamespace("block/oak_log"),
                Identifier.withDefaultNamespace("block/oak_log_top")
        );
        //blockModels.family(Blocks.OAK_LOG).wall(ModBlocks.OAK_WOOD_WALL.block().get());

        blockModels.family(Blocks.OAK_PLANKS).wall(ModBlocks.OAK_PLANK_WALL.block().get());
        blockModels.family(Blocks.SPRUCE_PLANKS).wall(ModBlocks.SPRUCE_PLANK_WALL.block().get());
        blockModels.family(Blocks.BIRCH_PLANKS).wall(ModBlocks.BIRCH_PLANK_WALL.block().get());
        blockModels.family(Blocks.JUNGLE_PLANKS).wall(ModBlocks.JUNGLE_PLANK_WALL.block().get());
        blockModels.family(Blocks.ACACIA_PLANKS).wall(ModBlocks.ACACIA_PLANK_WALL.block().get());
        blockModels.family(Blocks.DARK_OAK_PLANKS).wall(ModBlocks.DARK_OAK_PLANK_WALL.block().get());
        blockModels.family(Blocks.MANGROVE_PLANKS).wall(ModBlocks.MANGROVE_PLANK_WALL.block().get());
        blockModels.family(Blocks.CHERRY_PLANKS).wall(ModBlocks.CHERRY_PLANK_WALL.block().get());
        blockModels.family(Blocks.PALE_OAK_PLANKS).wall(ModBlocks.PALE_OAK_PLANK_WALL.block().get());
        blockModels.family(Blocks.BAMBOO_PLANKS).wall(ModBlocks.BAMBOO_PLANK_WALL.block().get());
        blockModels.family(Blocks.CRIMSON_PLANKS).wall(ModBlocks.CRIMSON_PLANK_WALL.block().get());
        blockModels.family(Blocks.WARPED_PLANKS).wall(ModBlocks.WARPED_PLANK_WALL.block().get());

        blockModels.family(Blocks.STONE).wall(ModBlocks.STONE_WALL.block().get());
        blockModels.family(Blocks.POLISHED_GRANITE).wall(ModBlocks.POLISHED_GRANITE_WALL.block().get());
        blockModels.family(Blocks.POLISHED_DIORITE).wall(ModBlocks.POLISHED_DIORITE_WALL.block().get());
        blockModels.family(Blocks.POLISHED_ANDESITE).wall(ModBlocks.POLISHED_ANDESITE_WALL.block().get());
        blockModels.family(Blocks.SMOOTH_SANDSTONE).wall(ModBlocks.SMOOTH_SANDSTONE_WALL.block().get());
        blockModels.family(Blocks.SMOOTH_RED_SANDSTONE).wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get());

    }

}
