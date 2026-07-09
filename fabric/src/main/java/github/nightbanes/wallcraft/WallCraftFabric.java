package github.nightbanes.wallcraft;

import github.nightbanes.wallcraft.init.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class WallCraftFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.registerCopyState(
                ModBlocks.OAK_LOG_WALL.block().get(),
                ModBlocks.STRIPPED_OAK_LOG_WALL.block().get()
        );
        StrippableBlockRegistry.registerCopyState(
                ModBlocks.OAK_WOOD_WALL.block().get(),
                ModBlocks.STRIPPED_OAK_WOOD_WALL.block().get()
        );
    }
}
