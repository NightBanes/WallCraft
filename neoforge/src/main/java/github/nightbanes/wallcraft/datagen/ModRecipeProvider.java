package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "WallCraft Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        // Log walls
        shapedWall(ModBlocks.OAK_LOG_WALL.block().get(), Blocks.OAK_LOG);
        shapedWall(ModBlocks.SPRUCE_LOG_WALL.block().get(), Blocks.SPRUCE_LOG);
        shapedWall(ModBlocks.BIRCH_LOG_WALL.block().get(), Blocks.BIRCH_LOG);
        shapedWall(ModBlocks.JUNGLE_LOG_WALL.block().get(), Blocks.JUNGLE_LOG);
        shapedWall(ModBlocks.ACACIA_LOG_WALL.block().get(), Blocks.ACACIA_LOG);
        shapedWall(ModBlocks.DARK_OAK_LOG_WALL.block().get(), Blocks.DARK_OAK_LOG);
        shapedWall(ModBlocks.MANGROVE_LOG_WALL.block().get(), Blocks.MANGROVE_LOG);
        shapedWall(ModBlocks.CHERRY_LOG_WALL.block().get(), Blocks.CHERRY_LOG);
        shapedWall(ModBlocks.PALE_OAK_LOG_WALL.block().get(), Blocks.PALE_OAK_LOG);
        shapedWall(ModBlocks.BAMBOO_WALL.block().get(), Blocks.BAMBOO_BLOCK);
        shapedWall(ModBlocks.CRIMSON_STEM_WALL.block().get(), Blocks.CRIMSON_STEM);
        shapedWall(ModBlocks.WARPED_STEM_WALL.block().get(), Blocks.WARPED_STEM);

        // Wood walls
        shapedWall(ModBlocks.OAK_WOOD_WALL.block().get(), Blocks.OAK_WOOD);
        shapedWall(ModBlocks.SPRUCE_WOOD_WALL.block().get(), Blocks.SPRUCE_WOOD);
        shapedWall(ModBlocks.BIRCH_WOOD_WALL.block().get(), Blocks.BIRCH_WOOD);
        shapedWall(ModBlocks.JUNGLE_WOOD_WALL.block().get(), Blocks.JUNGLE_WOOD);
        shapedWall(ModBlocks.ACACIA_WOOD_WALL.block().get(), Blocks.ACACIA_WOOD);
        shapedWall(ModBlocks.DARK_OAK_WOOD_WALL.block().get(), Blocks.DARK_OAK_WOOD);
        shapedWall(ModBlocks.MANGROVE_WOOD_WALL.block().get(), Blocks.MANGROVE_WOOD);
        shapedWall(ModBlocks.CHERRY_WOOD_WALL.block().get(), Blocks.CHERRY_WOOD);
        shapedWall(ModBlocks.PALE_OAK_WOOD_WALL.block().get(), Blocks.PALE_OAK_WOOD);
        shapedWall(ModBlocks.CRIMSON_HYPHAE_WALL.block().get(), Blocks.CRIMSON_HYPHAE);
        shapedWall(ModBlocks.WARPED_HYPHAE_WALL.block().get(), Blocks.WARPED_HYPHAE);

        // Stripped Log walls
        shapedWall(ModBlocks.STRIPPED_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_OAK_LOG);
        shapedWall(ModBlocks.STRIPPED_SPRUCE_LOG_WALL.block().get(), Blocks.STRIPPED_SPRUCE_LOG);
        shapedWall(ModBlocks.STRIPPED_BIRCH_LOG_WALL.block().get(), Blocks.STRIPPED_BIRCH_LOG);
        shapedWall(ModBlocks.STRIPPED_JUNGLE_LOG_WALL.block().get(), Blocks.STRIPPED_JUNGLE_LOG);
        shapedWall(ModBlocks.STRIPPED_ACACIA_LOG_WALL.block().get(), Blocks.STRIPPED_ACACIA_LOG);
        shapedWall(ModBlocks.STRIPPED_DARK_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_DARK_OAK_LOG);
        shapedWall(ModBlocks.STRIPPED_MANGROVE_LOG_WALL.block().get(), Blocks.STRIPPED_MANGROVE_LOG);
        shapedWall(ModBlocks.STRIPPED_CHERRY_LOG_WALL.block().get(), Blocks.STRIPPED_CHERRY_LOG);
        shapedWall(ModBlocks.STRIPPED_PALE_OAK_LOG_WALL.block().get(), Blocks.STRIPPED_PALE_OAK_LOG);
        shapedWall(ModBlocks.STRIPPED_BAMBOO_WALL.block().get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        shapedWall(ModBlocks.STRIPPED_CRIMSON_STEM_WALL.block().get(), Blocks.STRIPPED_CRIMSON_STEM);
        shapedWall(ModBlocks.STRIPPED_WARPED_STEM_WALL.block().get(), Blocks.STRIPPED_WARPED_STEM);

        // Stripped Wood walls
        shapedWall(ModBlocks.STRIPPED_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_OAK_WOOD);
        shapedWall(ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.block().get(), Blocks.STRIPPED_SPRUCE_WOOD);
        shapedWall(ModBlocks.STRIPPED_BIRCH_WOOD_WALL.block().get(), Blocks.STRIPPED_BIRCH_WOOD);
        shapedWall(ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.block().get(), Blocks.STRIPPED_JUNGLE_WOOD);
        shapedWall(ModBlocks.STRIPPED_ACACIA_WOOD_WALL.block().get(), Blocks.STRIPPED_ACACIA_WOOD);
        shapedWall(ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_DARK_OAK_WOOD);
        shapedWall(ModBlocks.STRIPPED_MANGROVE_WOOD_WALL.block().get(), Blocks.STRIPPED_MANGROVE_WOOD);
        shapedWall(ModBlocks.STRIPPED_CHERRY_WOOD_WALL.block().get(), Blocks.STRIPPED_CHERRY_WOOD);
        shapedWall(ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL.block().get(), Blocks.STRIPPED_PALE_OAK_WOOD);
        shapedWall(ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.block().get(), Blocks.STRIPPED_CRIMSON_HYPHAE);
        shapedWall(ModBlocks.STRIPPED_WARPED_HYPHAE_WALL.block().get(), Blocks.STRIPPED_WARPED_HYPHAE);

        // Plank walls
        shapedWall(ModBlocks.OAK_PLANK_WALL.block().get(), Blocks.OAK_PLANKS);
        shapedWall(ModBlocks.SPRUCE_PLANK_WALL.block().get(), Blocks.SPRUCE_PLANKS);
        shapedWall(ModBlocks.BIRCH_PLANK_WALL.block().get(), Blocks.BIRCH_PLANKS);
        shapedWall(ModBlocks.JUNGLE_PLANK_WALL.block().get(), Blocks.JUNGLE_PLANKS);
        shapedWall(ModBlocks.ACACIA_PLANK_WALL.block().get(), Blocks.ACACIA_PLANKS);
        shapedWall(ModBlocks.DARK_OAK_PLANK_WALL.block().get(), Blocks.DARK_OAK_PLANKS);
        shapedWall(ModBlocks.MANGROVE_PLANK_WALL.block().get(), Blocks.MANGROVE_PLANKS);
        shapedWall(ModBlocks.CHERRY_PLANK_WALL.block().get(), Blocks.CHERRY_PLANKS);
        shapedWall(ModBlocks.PALE_OAK_PLANK_WALL.block().get(), Blocks.PALE_OAK_PLANKS);
        shapedWall(ModBlocks.BAMBOO_PLANK_WALL.block().get(), Blocks.BAMBOO_PLANKS);
        shapedWall(ModBlocks.CRIMSON_PLANK_WALL.block().get(), Blocks.CRIMSON_PLANKS);
        shapedWall(ModBlocks.WARPED_PLANK_WALL.block().get(), Blocks.WARPED_PLANKS);

        // Decorative walls
        shapedWall(ModBlocks.BAMBOO_MOSAIC_WALL.block().get(), Blocks.BAMBOO_MOSAIC);

        // Decorative wall from
            // Plank wall
        decorativeWall(ModBlocks.BAMBOO_MOSAIC_WALL.item().get(), ModBlocks.BAMBOO_PLANK_WALL.item().get());

        // Wood wall from Log wall
        shapedWallConverter(ModBlocks.OAK_WOOD_WALL.item().get(), ModBlocks.OAK_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.SPRUCE_WOOD_WALL.item().get(), ModBlocks.SPRUCE_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.BIRCH_WOOD_WALL.item().get(), ModBlocks.BIRCH_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.JUNGLE_WOOD_WALL.item().get(), ModBlocks.JUNGLE_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.ACACIA_WOOD_WALL.item().get(), ModBlocks.ACACIA_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.DARK_OAK_WOOD_WALL.item().get(), ModBlocks.DARK_OAK_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.MANGROVE_WOOD_WALL.item().get(), ModBlocks.MANGROVE_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.CHERRY_WOOD_WALL.item().get(), ModBlocks.CHERRY_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.PALE_OAK_WOOD_WALL.item().get(), ModBlocks.PALE_OAK_LOG_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.CRIMSON_HYPHAE_WALL.item().get(), ModBlocks.CRIMSON_STEM_WALL.item().get(), 3);
        shapedWallConverter(ModBlocks.WARPED_HYPHAE_WALL.item().get(), ModBlocks.WARPED_STEM_WALL.item().get(), 3);

        // Plank wall from
            // Log wall
        shapelessWallConverter(ModBlocks.OAK_PLANK_WALL.item().get(), ModBlocks.OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.SPRUCE_PLANK_WALL.item().get(), ModBlocks.SPRUCE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BIRCH_PLANK_WALL.item().get(), ModBlocks.BIRCH_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.JUNGLE_PLANK_WALL.item().get(), ModBlocks.JUNGLE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.ACACIA_PLANK_WALL.item().get(), ModBlocks.ACACIA_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.DARK_OAK_PLANK_WALL.item().get(), ModBlocks.DARK_OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.MANGROVE_PLANK_WALL.item().get(), ModBlocks.MANGROVE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CHERRY_PLANK_WALL.item().get(), ModBlocks.CHERRY_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.PALE_OAK_PLANK_WALL.item().get(), ModBlocks.PALE_OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BAMBOO_PLANK_WALL.item().get(), ModBlocks.BAMBOO_WALL.item().get(), 2);
        shapelessWallConverter(ModBlocks.CRIMSON_PLANK_WALL.item().get(), ModBlocks.CRIMSON_STEM_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.WARPED_PLANK_WALL.item().get(), ModBlocks.WARPED_STEM_WALL.block().get(), 4);

            // Wood wall
        shapelessWallConverter(ModBlocks.OAK_PLANK_WALL.item().get(), ModBlocks.OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.SPRUCE_PLANK_WALL.item().get(), ModBlocks.SPRUCE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BIRCH_PLANK_WALL.item().get(), ModBlocks.BIRCH_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.JUNGLE_PLANK_WALL.item().get(), ModBlocks.JUNGLE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.ACACIA_PLANK_WALL.item().get(), ModBlocks.ACACIA_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.DARK_OAK_PLANK_WALL.item().get(), ModBlocks.DARK_OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.MANGROVE_PLANK_WALL.item().get(), ModBlocks.MANGROVE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CHERRY_PLANK_WALL.item().get(), ModBlocks.CHERRY_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.PALE_OAK_PLANK_WALL.item().get(), ModBlocks.PALE_OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CRIMSON_PLANK_WALL.item().get(), ModBlocks.CRIMSON_HYPHAE_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.WARPED_PLANK_WALL.item().get(), ModBlocks.WARPED_HYPHAE_WALL.block().get(), 4);

            // Stripped Log wall
        shapelessWallConverter(ModBlocks.OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.SPRUCE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_SPRUCE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BIRCH_PLANK_WALL.item().get(), ModBlocks.STRIPPED_BIRCH_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.JUNGLE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_JUNGLE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.ACACIA_PLANK_WALL.item().get(), ModBlocks.STRIPPED_ACACIA_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.DARK_OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_DARK_OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.MANGROVE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_MANGROVE_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CHERRY_PLANK_WALL.item().get(), ModBlocks.STRIPPED_CHERRY_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.PALE_OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_PALE_OAK_LOG_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BAMBOO_PLANK_WALL.item().get(), ModBlocks.STRIPPED_BAMBOO_WALL.block().get(), 2);
        shapelessWallConverter(ModBlocks.CRIMSON_PLANK_WALL.item().get(), ModBlocks.STRIPPED_CRIMSON_STEM_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.WARPED_PLANK_WALL.item().get(), ModBlocks.STRIPPED_WARPED_STEM_WALL.block().get(), 4);

            // Stripped Wood wall
        shapelessWallConverter(ModBlocks.OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.SPRUCE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.BIRCH_PLANK_WALL.item().get(), ModBlocks.STRIPPED_BIRCH_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.JUNGLE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.ACACIA_PLANK_WALL.item().get(), ModBlocks.STRIPPED_ACACIA_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.DARK_OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.MANGROVE_PLANK_WALL.item().get(), ModBlocks.STRIPPED_MANGROVE_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CHERRY_PLANK_WALL.item().get(), ModBlocks.STRIPPED_CHERRY_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.PALE_OAK_PLANK_WALL.item().get(), ModBlocks.STRIPPED_PALE_OAK_WOOD_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.CRIMSON_PLANK_WALL.item().get(), ModBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.block().get(), 4);
        shapelessWallConverter(ModBlocks.WARPED_PLANK_WALL.item().get(), ModBlocks.STRIPPED_WARPED_HYPHAE_WALL.block().get(), 4);

        // Stone-type walls
        shapedWall(ModBlocks.STONE_WALL.block().get(), Blocks.STONE);
        shapedWall(ModBlocks.POLISHED_GRANITE_WALL.block().get(), Blocks.POLISHED_GRANITE);
        shapedWall(ModBlocks.POLISHED_DIORITE_WALL.block().get(), Blocks.POLISHED_DIORITE);
        shapedWall(ModBlocks.POLISHED_ANDESITE_WALL.block().get(), Blocks.POLISHED_ANDESITE);
        shapedWall(ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_SANDSTONE);
        shapedWall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_RED_SANDSTONE);

        // Stonecutter
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.item().get(), Blocks.STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.block().get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.block().get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.block().get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_RED_SANDSTONE);

        // Furnace
        oreSmelting(List.of(Blocks.COBBLESTONE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.STONE_WALL.item().get(), 0.25f, 200, "stone_wall");
        oreSmelting(List.of(Blocks.GRANITE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.item().get(), 0.25f, 200, "granite_wall");
        oreSmelting(List.of(Blocks.DIORITE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.item().get(), 0.25f, 200, "diorite_wall");
        oreSmelting(List.of(Blocks.ANDESITE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.item().get(), 0.25f, 200, "andesite_wall");
        oreSmelting(List.of(Blocks.SANDSTONE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.item().get(), 0.25f, 200, "sandstone_wall");
        oreSmelting(List.of(Blocks.RED_SANDSTONE_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.item().get(), 0.25f, 200, "red_sandstone_wall");

        // Trapdoors from slabs
        shapedTrapdoor(Blocks.OAK_TRAPDOOR, Items.OAK_SLAB);
        shapedTrapdoor(Blocks.SPRUCE_TRAPDOOR, Items.SPRUCE_SLAB);
        shapedTrapdoor(Blocks.BIRCH_TRAPDOOR, Items.BIRCH_SLAB);
        shapedTrapdoor(Blocks.JUNGLE_TRAPDOOR, Items.JUNGLE_SLAB);
        shapedTrapdoor(Blocks.ACACIA_TRAPDOOR, Items.ACACIA_SLAB);
        shapedTrapdoor(Blocks.DARK_OAK_TRAPDOOR, Items.DARK_OAK_SLAB);
        shapedTrapdoor(Blocks.MANGROVE_TRAPDOOR, Items.MANGROVE_SLAB);
        shapedTrapdoor(Blocks.CHERRY_TRAPDOOR, Items.CHERRY_SLAB);
        shapedTrapdoor(Blocks.PALE_OAK_TRAPDOOR, Items.PALE_OAK_SLAB);
        shapedTrapdoor(Blocks.BAMBOO_TRAPDOOR, Items.BAMBOO_SLAB);
        shapedTrapdoor(Blocks.CRIMSON_TRAPDOOR, Items.CRIMSON_SLAB);
        shapedTrapdoor(Blocks.WARPED_TRAPDOOR, Items.WARPED_SLAB);
    }

    private void shapedWall( ItemLike outputBlock, ItemLike inputBlock) {
        String group = BuiltInRegistries.ITEM.getKey(outputBlock.asItem()).getPath();

        shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock, 6)
                .pattern("###")
                .pattern("###")
                .define('#', inputBlock)
                .unlockedBy(getHasName(inputBlock), has(inputBlock))
                .group(group)
                .save(output);
    }

    private void decorativeWall( ItemLike outputBlock, ItemLike inputBlock) {
        String group = BuiltInRegistries.ITEM.getKey(outputBlock.asItem()).getPath();
        String name = "wallcraft:" + group + "_from_" + BuiltInRegistries.ITEM.getKey(inputBlock.asItem()).getPath();

        shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock, 2)
                .pattern("#")
                .pattern("#")
                .define('#', inputBlock)
                .unlockedBy(getHasName(inputBlock), has(inputBlock))
                .group(group)
                .save(output, name);
    }

    private void shapedWallConverter(ItemLike outputBlock, ItemLike inputBlock, int count) {
        String group = BuiltInRegistries.ITEM.getKey(outputBlock.asItem()).getPath();
        String name = "wallcraft:" + group + "_from_" + BuiltInRegistries.ITEM.getKey(inputBlock.asItem()).getPath();

        shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock, count)
                .pattern("##")
                .pattern("##")
                .define('#', inputBlock)
                .unlockedBy(getHasName(inputBlock), has(inputBlock))
                .group(group)
                .save(output, name);
    }

    private void shapelessWallConverter(ItemLike outputBlock, ItemLike inputBlock, int count) {
        String group = BuiltInRegistries.ITEM.getKey(outputBlock.asItem()).getPath();
        String name = "wallcraft:" + group + "_from_" + BuiltInRegistries.ITEM.getKey(inputBlock.asItem()).getPath();

        shapeless(RecipeCategory.BUILDING_BLOCKS, outputBlock, count)
                .requires(inputBlock)
                .unlockedBy("has_input", has(inputBlock))
                .group(group)
                .save(output, name);
    }

    private void shapedTrapdoor(ItemLike outputBlock, ItemLike inputBlock) {
        shaped(RecipeCategory.REDSTONE, outputBlock, 1)
                .pattern("###")
                .pattern("###")
                .define('#', inputBlock)
                .unlockedBy("has_slab", has(inputBlock))
                .group("wooden_trapdoor")
                .save(output);
    }
}
