package github.nightbanes.wallcraft;

import github.nightbanes.wallcraft.datagen.ModBlockTagProvider;
import github.nightbanes.wallcraft.datagen.ModEnglishLanguageProvider;
import github.nightbanes.wallcraft.datagen.ModLootTableProvider;
import github.nightbanes.wallcraft.datagen.ModModelProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class ModDatagen {
    private ModDatagen() {}

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModEnglishLanguageProvider::new);
        event.createProvider(ModBlockTagProvider::new);
        event.createProvider(ModLootTableProvider::new);
    }

}
