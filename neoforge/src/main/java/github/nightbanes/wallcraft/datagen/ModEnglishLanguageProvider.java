package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.init.ModBlocks;
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
        // Add translation
        add(ModItems.EXAMPLE_ITEM.get(), "Example Item");

        add(ModBlocks.EXAMPLE_BLOCK.block().get(), "Example Block");
        add(ModBlocks.EXAMPLE_BLOCK.item().get(), "Example Block");

        add(ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), "Smooth Sandstone Wall");
        add(ModBlocks.SMOOTH_SANDSTONE_WALL.item().get(), "Smooth Sandstone Wall");
    }

    private void add(Component component, String value) {
        if(component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }

}
