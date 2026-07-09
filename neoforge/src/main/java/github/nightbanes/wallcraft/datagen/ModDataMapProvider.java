package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.init.ModBlocks;
import github.nightbanes.wallcraft.services.util.BlockItemRegistryHandle;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    /**
     * Create a new provider.
     *
     * @param packOutput     the output location
     * @param lookupProvider a {@linkplain CompletableFuture} supplying the registries
     */
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        var builder = builder(NeoForgeDataMaps.STRIPPABLES);

        // Logs
        addStrippable(builder, ModBlocks.OAK_LOG_WALL, ModBlocks.STRIPPED_OAK_LOG_WALL);

        // Wood
        addStrippable(builder, ModBlocks.OAK_WOOD_WALL, ModBlocks.STRIPPED_OAK_WOOD_WALL);

    }

    private void addStrippable(DataMapProvider.Builder<Strippable, Block> builder,
                               BlockItemRegistryHandle<Block> original,
                               BlockItemRegistryHandle<Block> stripped) {

        builder.add(
                original.block().key(),
                new Strippable(stripped.block().get()),
                false
        );
    }

}
