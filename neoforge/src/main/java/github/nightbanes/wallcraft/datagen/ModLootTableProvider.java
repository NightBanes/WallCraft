package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.init.ModBlocks;
import github.nightbanes.wallcraft.services.NeoForgeRegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        new SubProviderEntry(WallCraftBlockLootSubProvider::new, LootContextParamSets.BLOCK)
                        //, new SubProviderEntry(...)
                ),
                registries);
    }

    private static final class WallCraftBlockLootSubProvider extends BlockLootSubProvider {
        WallCraftBlockLootSubProvider(HolderLookup.Provider registries) {
            super(Set.of(/*.add(explosion resistant items)*/), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {
            // Log walls
            dropSelf(ModBlocks.OAK_LOG_WALL.block().get());

            // Wood walls
            dropSelf(ModBlocks.OAK_WOOD_WALL.block().get());

            // Plank walls
            dropSelf(ModBlocks.OAK_PLANK_WALL.block().get());
            dropSelf(ModBlocks.SPRUCE_PLANK_WALL.block().get());
            dropSelf(ModBlocks.BIRCH_PLANK_WALL.block().get());
            dropSelf(ModBlocks.JUNGLE_PLANK_WALL.block().get());
            dropSelf(ModBlocks.ACACIA_PLANK_WALL.block().get());
            dropSelf(ModBlocks.DARK_OAK_PLANK_WALL.block().get());
            dropSelf(ModBlocks.MANGROVE_PLANK_WALL.block().get());
            dropSelf(ModBlocks.CHERRY_PLANK_WALL.block().get());
            dropSelf(ModBlocks.PALE_OAK_PLANK_WALL.block().get());
            dropSelf(ModBlocks.BAMBOO_PLANK_WALL.block().get());
            dropSelf(ModBlocks.CRIMSON_PLANK_WALL.block().get());
            dropSelf(ModBlocks.WARPED_PLANK_WALL.block().get());

            // Stone-like walls
            dropSelf(ModBlocks.STONE_WALL.block().get());
            dropSelf(ModBlocks.POLISHED_GRANITE_WALL.block().get());
            dropSelf(ModBlocks.POLISHED_DIORITE_WALL.block().get());
            dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.block().get());
            dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL.block().get());
            dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return NeoForgeRegistryHelper.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }

}
