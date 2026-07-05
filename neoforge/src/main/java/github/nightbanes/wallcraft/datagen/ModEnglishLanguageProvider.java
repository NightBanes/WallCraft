package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
import github.nightbanes.wallcraft.init.ModCreativeTabs;
import github.nightbanes.wallcraft.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnglishLanguageProvider extends LanguageProvider {
    public ModEnglishLanguageProvider(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Add translations
        add(ModCreativeTabs.WALLCRAFT_TAB.get().getDisplayName(), "WallCraft");

        //add(ModItems.EXAMPLE_ITEM.get(), "Example Item");

        add(ModBlocks.OAK_LOG_WALL.block().get(), "Oak Log Wall");
        add(ModBlocks.OAK_LOG_WALL.item().get(), "Oak Log Wall");

        //add(ModBlocks.OAK_WOOD_WALL.block().get(), "Oak Wood Wall");
        //add(ModBlocks.OAK_WOOD_WALL.item().get(), "Oak Wood Wall");

        add(ModBlocks.OAK_PLANK_WALL.block().get(), "Oak Plank Wall");
        add(ModBlocks.OAK_PLANK_WALL.item().get(), "Oak Plank Wall");

        add(ModBlocks.SPRUCE_PLANK_WALL.block().get(), "Spruce Plank Wall");
        add(ModBlocks.SPRUCE_PLANK_WALL.item().get(), "Spruce Plank Wall");

        add(ModBlocks.BIRCH_PLANK_WALL.block().get(), "Birch Plank Wall");
        add(ModBlocks.BIRCH_PLANK_WALL.item().get(), "Birch Plank Wall");

        add(ModBlocks.JUNGLE_PLANK_WALL.block().get(), "Jungle Plank Wall");
        add(ModBlocks.JUNGLE_PLANK_WALL.item().get(), "Jungle Plank Wall");

        add(ModBlocks.ACACIA_PLANK_WALL.block().get(), "Acacia Plank Wall");
        add(ModBlocks.ACACIA_PLANK_WALL.item().get(), "Acacia Plank Wall");

        add(ModBlocks.DARK_OAK_PLANK_WALL.block().get(), "Dark Oak Plank Wall");
        add(ModBlocks.DARK_OAK_PLANK_WALL.item().get(), "Dark Oak Plank Wall");

        add(ModBlocks.MANGROVE_PLANK_WALL.block().get(), "Mangrove Plank Wall");
        add(ModBlocks.MANGROVE_PLANK_WALL.item().get(), "Mangrove Plank Wall");

        add(ModBlocks.CHERRY_PLANK_WALL.block().get(), "Cherry Plank Wall");
        add(ModBlocks.CHERRY_PLANK_WALL.item().get(), "Cherry Plank Wall");

        add(ModBlocks.PALE_OAK_PLANK_WALL.block().get(), "Pale Oak Plank Wall");
        add(ModBlocks.PALE_OAK_PLANK_WALL.item().get(), "Pale Oak Plank Wall");

        add(ModBlocks.BAMBOO_PLANK_WALL.block().get(), "Bamboo Plank Wall");
        add(ModBlocks.BAMBOO_PLANK_WALL.item().get(), "Bamboo Plank Wall");

        add(ModBlocks.CRIMSON_PLANK_WALL.block().get(), "Crimson Plank Wall");
        add(ModBlocks.CRIMSON_PLANK_WALL.item().get(), "Crimson Plank Wall");

        add(ModBlocks.WARPED_PLANK_WALL.block().get(), "Warped Plank Wall");
        add(ModBlocks.WARPED_PLANK_WALL.item().get(), "Warped Plank Wall");

        add(ModBlocks.STONE_WALL.block().get(), "Stone Wall");
        add(ModBlocks.STONE_WALL.item().get(), "Stone Wall");

        add(ModBlocks.POLISHED_GRANITE_WALL.block().get(), "Polished Granite Wall");
        add(ModBlocks.POLISHED_GRANITE_WALL.item().get(), "Polished Granite Wall");

        add(ModBlocks.POLISHED_DIORITE_WALL.block().get(), "Polished Diorite Wall");
        add(ModBlocks.POLISHED_DIORITE_WALL.item().get(), "Polished Diorite Wall");

        add(ModBlocks.POLISHED_ANDESITE_WALL.block().get(), "Polished Andesite Wall");
        add(ModBlocks.POLISHED_ANDESITE_WALL.item().get(), "Polished Andesite Wall");

        add(ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), "Smooth Sandstone Wall");
        add(ModBlocks.SMOOTH_SANDSTONE_WALL.item().get(), "Smooth Sandstone Wall");

        add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), "Smooth Red Sandstone Wall");
        add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.item().get(), "Smooth Red Sandstone Wall");
    }

    private void add(Component component, String value) {
        if(component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }

}
