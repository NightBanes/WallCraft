package github.nightbanes.wallcraft.init;

import github.nightbanes.wallcraft.Constants;
import github.nightbanes.wallcraft.services.Services;
import github.nightbanes.wallcraft.services.util.RegistryHandle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public final class ModCreativeTabs {
    private ModCreativeTabs() {}

    public static final RegistryHandle<CreativeModeTab> WALLCRAFT_TAB =
            Services.REGISTRY.registerCreativeTab("wallcraft_tab", () -> new ItemStack(ModBlocks.OAK_PLANK_WALL.item().get()),
                    output -> BuiltInRegistries.ITEM.stream()
                            .filter(item -> Objects.equals(BuiltInRegistries.ITEM.getKey(item).getNamespace(), Constants.MOD_ID))
                            .forEachOrdered(output::accept));

    public static void load() {}
}
