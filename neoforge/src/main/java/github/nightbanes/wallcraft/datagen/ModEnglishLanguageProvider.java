package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import github.nightbanes.wallcraft.init.ModCreativeTabs;
import github.nightbanes.wallcraft.init.ModItems;
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

        // Wood walls
        addBlockAndItem(ModBlocks.OAK_WOOD_WALL, "Oak Wood Wall");

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

        // Stone-like walls
        addBlockAndItem(ModBlocks.STONE_WALL, "Stone Wall");
        addBlockAndItem(ModBlocks.POLISHED_GRANITE_WALL, "Polished Granite Wall");
        addBlockAndItem(ModBlocks.POLISHED_DIORITE_WALL, "Polished Diorite Wall");
        addBlockAndItem(ModBlocks.POLISHED_ANDESITE_WALL, "Polished Andesite Wall");
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
