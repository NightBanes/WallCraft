package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                // Log walls
                .add(ModBlocks.OAK_LOG_WALL.block().key())
                .add(ModBlocks.SPRUCE_LOG_WALL.block().key())
                .add(ModBlocks.BIRCH_LOG_WALL.block().key())
                .add(ModBlocks.JUNGLE_LOG_WALL.block().key())
                .add(ModBlocks.ACACIA_LOG_WALL.block().key())
                .add(ModBlocks.DARK_OAK_LOG_WALL.block().key())
                .add(ModBlocks.MANGROVE_LOG_WALL.block().key())
                .add(ModBlocks.CHERRY_LOG_WALL.block().key())
                .add(ModBlocks.PALE_OAK_LOG_WALL.block().key())
                .add(ModBlocks.BAMBOO_WALL.block().key())
                .add(ModBlocks.CRIMSON_STEM_WALL.block().key())
                .add(ModBlocks.WARPED_STEM_WALL.block().key())

                // Wood walls
                .add(ModBlocks.OAK_WOOD_WALL.block().key())
                .add(ModBlocks.SPRUCE_WOOD_WALL.block().key())
                .add(ModBlocks.BIRCH_WOOD_WALL.block().key())
                .add(ModBlocks.JUNGLE_WOOD_WALL.block().key())
                .add(ModBlocks.ACACIA_WOOD_WALL.block().key())
                .add(ModBlocks.DARK_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.MANGROVE_WOOD_WALL.block().key())
                .add(ModBlocks.CHERRY_WOOD_WALL.block().key())
                .add(ModBlocks.PALE_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.CRIMSON_HYPHAE_WALL.block().key())
                .add(ModBlocks.WARPED_HYPHAE_WALL.block().key())

                // Stripped Log walls
                .add(ModBlocks.STRIPPED_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_BIRCH_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_ACACIA_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_DARK_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_CHERRY_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_PALE_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_BAMBOO_WALL.block().key())
                .add(ModBlocks.STRIPPED_CRIMSON_STEM_WALL.block().key())
                .add(ModBlocks.STRIPPED_WARPED_STEM_WALL.block().key())

                // Stripped Wood walls
                .add(ModBlocks.STRIPPED_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_BIRCH_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_ACACIA_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_MANGROVE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_CHERRY_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.block().key())
                .add(ModBlocks.STRIPPED_WARPED_HYPHAE_WALL.block().key())

                // Plank walls
                .add(ModBlocks.OAK_PLANK_WALL.block().key())
                .add(ModBlocks.SPRUCE_PLANK_WALL.block().key())
                .add(ModBlocks.BIRCH_PLANK_WALL.block().key())
                .add(ModBlocks.JUNGLE_PLANK_WALL.block().key())
                .add(ModBlocks.ACACIA_PLANK_WALL.block().key())
                .add(ModBlocks.DARK_OAK_PLANK_WALL.block().key())
                .add(ModBlocks.MANGROVE_PLANK_WALL.block().key())
                .add(ModBlocks.CHERRY_PLANK_WALL.block().key())
                .add(ModBlocks.PALE_OAK_PLANK_WALL.block().key())
                .add(ModBlocks.BAMBOO_PLANK_WALL.block().key())
                .add(ModBlocks.CRIMSON_PLANK_WALL.block().key())
                .add(ModBlocks.WARPED_PLANK_WALL.block().key())

                // Decorative walls
                .add(ModBlocks.BAMBOO_MOSAIC_WALL.block().key());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Stone-like walls
                .add(ModBlocks.STONE_WALL.block().key())
                .add(ModBlocks.POLISHED_GRANITE_WALL.block().key())
                .add(ModBlocks.POLISHED_DIORITE_WALL.block().key())
                .add(ModBlocks.POLISHED_ANDESITE_WALL.block().key())
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL.block().key())
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().key());

        tag(BlockTags.WALLS)
                // Log walls
                .add(ModBlocks.OAK_LOG_WALL.block().key())
                .add(ModBlocks.SPRUCE_LOG_WALL.block().key())
                .add(ModBlocks.BIRCH_LOG_WALL.block().key())
                .add(ModBlocks.JUNGLE_LOG_WALL.block().key())
                .add(ModBlocks.ACACIA_LOG_WALL.block().key())
                .add(ModBlocks.DARK_OAK_LOG_WALL.block().key())
                .add(ModBlocks.MANGROVE_LOG_WALL.block().key())
                .add(ModBlocks.CHERRY_LOG_WALL.block().key())
                .add(ModBlocks.PALE_OAK_LOG_WALL.block().key())
                .add(ModBlocks.BAMBOO_WALL.block().key())
                .add(ModBlocks.CRIMSON_STEM_WALL.block().key())
                .add(ModBlocks.WARPED_STEM_WALL.block().key())

                // Wood walls
                .add(ModBlocks.OAK_WOOD_WALL.block().key())
                .add(ModBlocks.SPRUCE_WOOD_WALL.block().key())
                .add(ModBlocks.BIRCH_WOOD_WALL.block().key())
                .add(ModBlocks.JUNGLE_WOOD_WALL.block().key())
                .add(ModBlocks.ACACIA_WOOD_WALL.block().key())
                .add(ModBlocks.DARK_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.MANGROVE_WOOD_WALL.block().key())
                .add(ModBlocks.CHERRY_WOOD_WALL.block().key())
                .add(ModBlocks.PALE_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.CRIMSON_HYPHAE_WALL.block().key())
                .add(ModBlocks.WARPED_HYPHAE_WALL.block().key())

                // Stripped Log walls
                .add(ModBlocks.STRIPPED_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_BIRCH_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_ACACIA_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_DARK_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_CHERRY_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_PALE_OAK_LOG_WALL.block().key())
                .add(ModBlocks.STRIPPED_BAMBOO_WALL.block().key())
                .add(ModBlocks.STRIPPED_CRIMSON_STEM_WALL.block().key())
                .add(ModBlocks.STRIPPED_WARPED_STEM_WALL.block().key())

                // Stripped Wood walls
                .add(ModBlocks.STRIPPED_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_BIRCH_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_ACACIA_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_MANGROVE_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_CHERRY_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL.block().key())
                .add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.block().key())
                .add(ModBlocks.STRIPPED_WARPED_HYPHAE_WALL.block().key())

                // Plank walls
                .add(ModBlocks.OAK_PLANK_WALL.block().key())
                .add(ModBlocks.SPRUCE_PLANK_WALL.block().key())
                .add(ModBlocks.BIRCH_PLANK_WALL.block().key())
                .add(ModBlocks.JUNGLE_PLANK_WALL.block().key())
                .add(ModBlocks.ACACIA_PLANK_WALL.block().key())
                .add(ModBlocks.DARK_OAK_PLANK_WALL.block().key())
                .add(ModBlocks.MANGROVE_PLANK_WALL.block().key())
                .add(ModBlocks.CHERRY_PLANK_WALL.block().key())
                .add(ModBlocks.PALE_OAK_PLANK_WALL.block().key())
                .add(ModBlocks.BAMBOO_PLANK_WALL.block().key())
                .add(ModBlocks.CRIMSON_PLANK_WALL.block().key())
                .add(ModBlocks.WARPED_PLANK_WALL.block().key())

                // Decorative walls
                .add(ModBlocks.BAMBOO_MOSAIC_WALL.block().key())

                // Stone-like walls
                .add(ModBlocks.STONE_WALL.block().key())
                .add(ModBlocks.POLISHED_GRANITE_WALL.block().key())
                .add(ModBlocks.POLISHED_DIORITE_WALL.block().key())
                .add(ModBlocks.POLISHED_ANDESITE_WALL.block().key())
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL.block().key())
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().key());
    }
}
