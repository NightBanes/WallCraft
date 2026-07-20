package github.nightbanes.wallcraft.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ModWallGenerator {

    private ModWallGenerator() {}

    /// Creates a wall using the side texture of the provided block
    public static void createWall(BlockModelGenerators blockModels, Block wallBlock, Block textureBlock) {
        createWall(blockModels, wallBlock, TextureMapping.getBlockTexture(textureBlock));
    }

    /// Creates a wall using the provided texture
    public static void createWall(BlockModelGenerators blockModels, Block wallBlock, Identifier texture) {
        createWall(blockModels, wallBlock, new Material(texture));
    }

    /// Main function to create a wall using a single texture
    private static void createWall(BlockModelGenerators blockModels, Block wallBlock, Material wallMaterial) {
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.WALL, wallMaterial);

        BiConsumer<Identifier, ModelInstance> modelOutput = modelOutput(blockModels);
        Consumer<BlockModelDefinitionGenerator> blockStateOutput = blockStateOutput(blockModels);

        Identifier postModel = ModelTemplates.WALL_POST.create(wallBlock, textureMapping, modelOutput);
        Identifier sideModel = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, textureMapping, modelOutput);
        Identifier tallSideModel = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, textureMapping, modelOutput);
        Identifier inventoryModel = ModelTemplates.WALL_INVENTORY.create(wallBlock, textureMapping, modelOutput);

        blockStateOutput.accept(createWall(wallBlock, plainVariant(postModel), plainVariant(sideModel), plainVariant(tallSideModel)));
        registerSimpleItemModel(blockModels, wallBlock, inventoryModel);
    }

    /// Creates a wall using the side and top texture of the provided block
    public static void createLogWall(BlockModelGenerators blockModels, Block wallBlock, Block textureBlock) {
        createLogWall(blockModels, wallBlock, getSideTexture(textureBlock), TextureMapping.getBlockTexture(textureBlock, "_top"));
    }

    /// Creates a wall using the side and top texture of the provided blocks
    public static void createLogWall(BlockModelGenerators blockModels, Block wallBlock, Block sideTextureBlock, Block topTextureBlock) {
        createLogWall(blockModels, wallBlock, getSideTexture(sideTextureBlock), TextureMapping.getBlockTexture(topTextureBlock, "_top"));
    }

    /// Main function to create a wall using two textures
    public static void createLogWall(BlockModelGenerators blockModels, Block wallBlock, Material sideMaterial, Material endMaterial) {
        TextureMapping sideTextureMapping = new TextureMapping().put(TextureSlot.WALL, sideMaterial);
        TextureMapping logTextureMapping = new TextureMapping().put(TextureSlot.WALL, sideMaterial).put(TextureSlot.END, endMaterial);

        BiConsumer<Identifier, ModelInstance> modelOutput = modelOutput(blockModels);
        Consumer<BlockModelDefinitionGenerator> blockStateOutput = blockStateOutput(blockModels);

        Identifier postModel = ModModelTemplates.LOG_WALL_POST.create(wallBlock, logTextureMapping, modelOutput);
        Identifier sideModel = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, sideTextureMapping, modelOutput);
        Identifier tallSideModel = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, sideTextureMapping, modelOutput);
        Identifier inventoryModel = ModModelTemplates.LOG_WALL_INVENTORY.create(wallBlock, logTextureMapping, modelOutput);

        blockStateOutput.accept(createWall(wallBlock, plainVariant(postModel), plainVariant(sideModel), plainVariant(tallSideModel)));
        registerSimpleItemModel(blockModels, wallBlock, inventoryModel);
    }

    @SuppressWarnings("unchecked")
    private static BiConsumer<Identifier, ModelInstance> modelOutput(BlockModelGenerators blockModels) {
        return (BiConsumer<Identifier, ModelInstance>) field(blockModels, "modelOutput");
    }

    @SuppressWarnings("unchecked")
    private static Consumer<BlockModelDefinitionGenerator> blockStateOutput(BlockModelGenerators blockModels) {
        return (Consumer<BlockModelDefinitionGenerator>) field(blockModels, "blockStateOutput");
    }

    private static Object field(BlockModelGenerators blockModels, String name) {
        try {
            Field field = BlockModelGenerators.class.getDeclaredField(name);
            field.setAccessible(true);
            return field.get(blockModels);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to access BlockModelGenerators." + name, exception);
        }
    }

    private static MultiVariant plainVariant(Identifier model) {
        try {
            Method method = BlockModelGenerators.class.getDeclaredMethod("plainVariant", Identifier.class);
            method.setAccessible(true);
            return (MultiVariant) method.invoke(null, model);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to create wall model variant for " + model, exception);
        }
    }

    private static BlockModelDefinitionGenerator createWall(Block block, MultiVariant post, MultiVariant side, MultiVariant tallSide) {
        try {
            Method method = BlockModelGenerators.class.getDeclaredMethod(
                    "createWall",
                    Block.class,
                    MultiVariant.class,
                    MultiVariant.class,
                    MultiVariant.class
            );
            method.setAccessible(true);
            return (BlockModelDefinitionGenerator) method.invoke(null, block, post, side, tallSide);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to create wall blockstate for " + block, exception);
        }
    }

    private static void registerSimpleItemModel(BlockModelGenerators blockModels, Block block, Identifier model) {
        try {
            Method method = BlockModelGenerators.class.getDeclaredMethod("registerSimpleItemModel", Block.class, Identifier.class);
            method.setAccessible(true);
            method.invoke(blockModels, block, model);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to register wall item model for " + block, exception);
        }
    }

    private static Material getSideTexture(Block textureBlock) {
        Material texture = TextureMapping.getBlockTexture(textureBlock);
        if(textureExists(texture.sprite())) {
            return texture;
        }

        return TextureMapping.getBlockTexture(textureBlock, "_side");
    }

    private static boolean textureExists(Identifier texture) {
        String resourcePath = "assets/" + texture.getNamespace() + "/textures/" + texture.getPath() + ".png";
        return ModWallGenerator.class.getClassLoader().getResource(resourcePath) != null;
    }
}
