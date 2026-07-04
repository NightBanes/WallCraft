package github.nightbanes.examplemod.datagen;

import github.nightbanes.examplemod.Constants;
import github.nightbanes.examplemod.init.ModBlocks;
import github.nightbanes.examplemod.init.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Add items to generate json for
        itemModels.generateFlatItem(ModItems.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);

        // Add blocks to generate json for
        blockModels.createTrivialCube(ModBlocks.EXAMPLE_BLOCK.block().get());
    }
}
