package github.nightbanes.examplemod;

import github.nightbanes.examplemod.datagen.ModBlockTagProvider;
import github.nightbanes.examplemod.datagen.ModEnglishLanguageProvider;
import github.nightbanes.examplemod.datagen.ModLootTableProvider;
import github.nightbanes.examplemod.datagen.ModModelProvider;
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
