package github.nightbanes.wallcraft.datagen;

import github.nightbanes.wallcraft.init.ModBlocks;
import net.minecraft.core.HolderLookup;
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
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_WALL.block().get(), Blocks.OAK_LOG);

        // Wood walls
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_WALL.block().get(), Blocks.OAK_LOG);

        // Plank walls
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WALL.block().get(), Blocks.OAK_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANK_WALL.block().get(), Blocks.SPRUCE_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANK_WALL.block().get(), Blocks.BIRCH_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANK_WALL.block().get(), Blocks.JUNGLE_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANK_WALL.block().get(), Blocks.ACACIA_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANK_WALL.block().get(), Blocks.DARK_OAK_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANK_WALL.block().get(), Blocks.MANGROVE_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANK_WALL.block().get(), Blocks.CHERRY_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_OAK_PLANK_WALL.block().get(), Blocks.PALE_OAK_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_PLANK_WALL.block().get(), Blocks.BAMBOO_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANK_WALL.block().get(), Blocks.CRIMSON_PLANKS);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_PLANK_WALL.block().get(), Blocks.WARPED_PLANKS);

        // Wood wall from Log wall
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_WALL.item().get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.OAK_LOG_WALL.item().get())
                .unlockedBy("has_input", has(ModBlocks.OAK_LOG_WALL.item().get()))
                .save(output, "wallcraft:oak_wood_wall_from_log_wall");

        // Plank wall from Log wall
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WALL.item().get(), 4)
                .requires(ModBlocks.OAK_LOG_WALL.block().get())
                .unlockedBy("has_input", has(ModBlocks.OAK_LOG_WALL.item().get()))
                .save(output, "wallcraft:oak_plank_wall_from_log_wall");

        // Plank wall from Wood wall
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WALL.item().get(), 4)
                .requires(ModBlocks.OAK_WOOD_WALL.block().get())
                .unlockedBy("has_input", has(ModBlocks.OAK_WOOD_WALL.item().get()))
                .save(output, "wallcraft:oak_plank_wall_from_wood_wall");

        // Stone-type walls
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.block().get(), Blocks.STONE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.block().get(), Blocks.POLISHED_GRANITE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.block().get(), Blocks.POLISHED_DIORITE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.block().get(), Blocks.POLISHED_ANDESITE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_SANDSTONE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_RED_SANDSTONE);

        // Stonecutter
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.item().get(), Blocks.STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.block().get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.block().get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.block().get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.block().get(), Blocks.SMOOTH_RED_SANDSTONE);

        // Furnace
        List<ItemLike> STONE_WALL_SMELTABLES = List.of(Blocks.COBBLESTONE_WALL);
        oreSmelting(STONE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.STONE_WALL.item().get(), 0.25f, 200, "stone_wall");

        List<ItemLike> GRANITE_WALL_SMELTABLES = List.of(Blocks.GRANITE_WALL);
        oreSmelting(GRANITE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.item().get(), 0.25f, 200, "granite_wall");

        List<ItemLike> DIORITE_WALL_SMELTABLES = List.of(Blocks.DIORITE_WALL);
        oreSmelting(DIORITE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.item().get(), 0.25f, 200, "diorite_wall");

        List<ItemLike> ANDESITE_WALL_SMELTABLES = List.of(Blocks.ANDESITE_WALL);
        oreSmelting(ANDESITE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.item().get(), 0.25f, 200, "andesite_wall");

        List<ItemLike> SANDSTONE_WALL_SMELTABLES = List.of(Blocks.SANDSTONE_WALL);
        oreSmelting(SANDSTONE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.item().get(), 0.25f, 200, "sandstone_wall");

        List<ItemLike> RED_SANDSTONE_WALL_SMELTABLES = List.of(Blocks.RED_SANDSTONE_WALL);
        oreSmelting(RED_SANDSTONE_WALL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.item().get(), 0.25f, 200, "red_sandstone_wall");

        // Trapdoors from slabs
        shaped(RecipeCategory.REDSTONE, Blocks.OAK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.OAK_SLAB)
                .unlockedBy("has_slab", has(Items.OAK_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.SPRUCE_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.SPRUCE_SLAB)
                .unlockedBy("has_slab", has(Items.SPRUCE_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.BIRCH_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.BIRCH_SLAB)
                .unlockedBy("has_slab", has(Items.BIRCH_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.JUNGLE_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.JUNGLE_SLAB)
                .unlockedBy("has_slab", has(Items.JUNGLE_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.ACACIA_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.ACACIA_SLAB)
                .unlockedBy("has_slab", has(Items.ACACIA_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.DARK_OAK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.DARK_OAK_SLAB)
                .unlockedBy("has_slab", has(Items.DARK_OAK_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.MANGROVE_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.MANGROVE_SLAB)
                .unlockedBy("has_slab", has(Items.MANGROVE_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.CHERRY_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.CHERRY_SLAB)
                .unlockedBy("has_slab", has(Items.CHERRY_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.PALE_OAK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.PALE_OAK_SLAB)
                .unlockedBy("has_slab", has(Items.PALE_OAK_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.BAMBOO_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.BAMBOO_SLAB)
                .unlockedBy("has_slab", has(Items.BAMBOO_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.CRIMSON_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.CRIMSON_SLAB)
                .unlockedBy("has_slab", has(Items.CRIMSON_SLAB))
                .group("wooden_trapdoor")
                .save(output);

        shaped(RecipeCategory.REDSTONE, Blocks.WARPED_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.WARPED_SLAB)
                .unlockedBy("has_slab", has(Items.WARPED_SLAB))
                .group("wooden_trapdoor")
                .save(output);

    }
}
