package github.nightbanes.wallcraft.init;

import github.nightbanes.wallcraft.Constants;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Optional;

public class ModModelTemplates {
    private ModModelTemplates() {}

    public static final ModelTemplate LOG_WALL_POST =
            new ModelTemplate(
                    Optional.of(Identifier.fromNamespaceAndPath(Constants.MOD_ID, "block/template_log_wall_post")),
                    Optional.of("_post"),
                    TextureSlot.WALL,
                    TextureSlot.END
            );

    public static final ModelTemplate LOG_WALL_INVENTORY =
            new ModelTemplate(
                    Optional.of(Identifier.fromNamespaceAndPath(Constants.MOD_ID, "block/template_log_wall_inventory")),
                    Optional.of("_inventory"),
                    TextureSlot.WALL,
                    TextureSlot.END
            );
}
