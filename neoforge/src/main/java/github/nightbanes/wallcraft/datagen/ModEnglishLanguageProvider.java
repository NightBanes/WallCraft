package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import github.nightbanes.wallcraft.init.ModCreativeTabs;
import github.nightbanes.wallcraft.services.util.BlockItemRegistryHandle;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnglishLanguageProvider extends LanguageProvider {
    public ModEnglishLanguageProvider(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Add translations
        add(ModCreativeTabs.WALLCRAFT_TAB.get().getDisplayName(), "WallCraft");

        // Log walls
        addBlockAndItem(ModBlocks.OAK_LOG_WALL, "Oak Log Wall");
        addBlockAndItem(ModBlocks.SPRUCE_LOG_WALL, "Spruce Log Wall");
        addBlockAndItem(ModBlocks.BIRCH_LOG_WALL, "Birch Log Wall");
        addBlockAndItem(ModBlocks.JUNGLE_LOG_WALL, "Jungle Log Wall");
        addBlockAndItem(ModBlocks.ACACIA_LOG_WALL, "Acacia Log Wall");
        addBlockAndItem(ModBlocks.DARK_OAK_LOG_WALL, "Dark Oak Log Wall");
        addBlockAndItem(ModBlocks.MANGROVE_LOG_WALL, "Mangrove Log Wall");
        addBlockAndItem(ModBlocks.CHERRY_LOG_WALL, "Cherry Log Wall");
        addBlockAndItem(ModBlocks.PALE_OAK_LOG_WALL, "Pale Oak Log Wall");
        addBlockAndItem(ModBlocks.BAMBOO_WALL, "Bamboo Wall");
        addBlockAndItem(ModBlocks.CRIMSON_STEM_WALL, "Crimson Stem Wall");
        addBlockAndItem(ModBlocks.WARPED_STEM_WALL, "Warped Stem Wall");

        // Wood walls
        addBlockAndItem(ModBlocks.OAK_WOOD_WALL, "Oak Wood Wall");
        addBlockAndItem(ModBlocks.SPRUCE_WOOD_WALL, "Spruce Wood Wall");
        addBlockAndItem(ModBlocks.BIRCH_WOOD_WALL, "Birch Wood Wall");
        addBlockAndItem(ModBlocks.JUNGLE_WOOD_WALL, "Jungle Wood Wall");
        addBlockAndItem(ModBlocks.ACACIA_WOOD_WALL, "Acacia Wood Wall");
        addBlockAndItem(ModBlocks.DARK_OAK_WOOD_WALL, "Dark Oak Wood Wall");
        addBlockAndItem(ModBlocks.MANGROVE_WOOD_WALL, "Mangrove Wood Wall");
        addBlockAndItem(ModBlocks.CHERRY_WOOD_WALL, "Cherry Wood Wall");
        addBlockAndItem(ModBlocks.PALE_OAK_WOOD_WALL, "Pale Oak Wood Wall");
        addBlockAndItem(ModBlocks.CRIMSON_HYPHAE_WALL, "Crimson Hyphae Wall");
        addBlockAndItem(ModBlocks.WARPED_HYPHAE_WALL, "Warped Hyphae Wall");

        // Stripped Log walls
        addBlockAndItem(ModBlocks.STRIPPED_OAK_LOG_WALL, "Stripped Oak Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_SPRUCE_LOG_WALL, "Stripped Spruce Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_BIRCH_LOG_WALL, "Stripped Birch Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_JUNGLE_LOG_WALL, "Stripped Jungle Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_ACACIA_LOG_WALL, "Stripped Acacia Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_DARK_OAK_LOG_WALL, "Stripped Dark Oak Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_MANGROVE_LOG_WALL, "Stripped Mangrove Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_CHERRY_LOG_WALL, "Stripped Cherry Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_PALE_OAK_LOG_WALL, "Stripped Pale Oak Log Wall");
        addBlockAndItem(ModBlocks.STRIPPED_BAMBOO_WALL, "Stripped Bamboo Wall");
        addBlockAndItem(ModBlocks.STRIPPED_CRIMSON_STEM_WALL, "Stripped Crimson Stem Wall");
        addBlockAndItem(ModBlocks.STRIPPED_WARPED_STEM_WALL, "Stripped Warped Stem Wall");

        // Stripped Wood walls
        addBlockAndItem(ModBlocks.STRIPPED_OAK_WOOD_WALL, "Stripped Oak Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_SPRUCE_WOOD_WALL, "Stripped Spruce Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_BIRCH_WOOD_WALL, "Stripped Birch Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_JUNGLE_WOOD_WALL, "Stripped Jungle Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_ACACIA_WOOD_WALL, "Stripped Acacia Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL, "Stripped Dark Oak Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_MANGROVE_WOOD_WALL, "Stripped Mangrove Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_CHERRY_WOOD_WALL, "Stripped Cherry Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL, "Stripped Pale Oak Wood Wall");
        addBlockAndItem(ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, "Stripped Crimson Hyphae Wall");
        addBlockAndItem(ModBlocks.STRIPPED_WARPED_HYPHAE_WALL, "Stripped Warped Hyphae Wall");

        // Plank walls
        addBlockAndItem(ModBlocks.OAK_PLANK_WALL, "Oak Plank Wall");
        addBlockAndItem(ModBlocks.SPRUCE_PLANK_WALL, "Spruce Plank Wall");
        addBlockAndItem(ModBlocks.BIRCH_PLANK_WALL, "Birch Plank Wall");
        addBlockAndItem(ModBlocks.JUNGLE_PLANK_WALL, "Jungle Plank Wall");
        addBlockAndItem(ModBlocks.ACACIA_PLANK_WALL, "Acacia Plank Wall");
        addBlockAndItem(ModBlocks.DARK_OAK_PLANK_WALL, "Dark Oak Plank Wall");
        addBlockAndItem(ModBlocks.MANGROVE_PLANK_WALL, "Mangrove Plank Wall");
        addBlockAndItem(ModBlocks.CHERRY_PLANK_WALL, "Cherry Plank Wall");
        addBlockAndItem(ModBlocks.PALE_OAK_PLANK_WALL, "Pale Oak Plank Wall");
        addBlockAndItem(ModBlocks.BAMBOO_PLANK_WALL, "Bamboo Plank Wall");
        addBlockAndItem(ModBlocks.CRIMSON_PLANK_WALL, "Crimson Plank Wall");
        addBlockAndItem(ModBlocks.WARPED_PLANK_WALL, "Warped Plank Wall");

        // Decorative walls
        addBlockAndItem(ModBlocks.BAMBOO_MOSAIC_WALL, "Bamboo Mosaic Wall");

        // Stone-like walls
        addBlockAndItem(ModBlocks.STONE_WALL, "Stone Wall");
        addBlockAndItem(ModBlocks.POLISHED_GRANITE_WALL, "Polished Granite Wall");
        addBlockAndItem(ModBlocks.POLISHED_DIORITE_WALL, "Polished Diorite Wall");
        addBlockAndItem(ModBlocks.POLISHED_ANDESITE_WALL, "Polished Andesite Wall");
        addBlockAndItem(ModBlocks.CUT_SANDSTONE_WALL, "Cut Sandstone Wall");
        addBlockAndItem(ModBlocks.CUT_RED_SANDSTONE_WALL, "Cut Red Sandstone Wall");
        addBlockAndItem(ModBlocks.SMOOTH_SANDSTONE_WALL, "Smooth Sandstone Wall");
        addBlockAndItem(ModBlocks.SMOOTH_RED_SANDSTONE_WALL, "Smooth Red Sandstone Wall");
    }

    private void add(Component component, String value) {
        if(component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }

    private void addBlockAndItem(BlockItemRegistryHandle<Block> blockItem, String name) {
        add(blockItem.block().get(), name);
        add(blockItem.item().get(), name);
    }

}
