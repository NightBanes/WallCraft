package github.nightbanes.wallcraft;

import github.nightbanes.wallcraft.datagen.*;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class ModDatagen {
    private ModDatagen() {}

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModEnglishLanguageProvider::new);
        event.createProvider(ModBlockTagProvider::new);
        event.createProvider(ModLootTableProvider::new);
        event.createProvider(ModRecipeProvider.Runner::new);
    }

}
