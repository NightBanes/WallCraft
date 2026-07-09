package github.nightbanes.wallcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class StrippableWallBlock extends WallBlock {
    private final Supplier<? extends Block> strippedBlock;

    public StrippableWallBlock(BlockBehaviour.Properties properties, Supplier<? extends Block> strippedBlock) {
        super(properties);
        this.strippedBlock = strippedBlock;
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!stack.is(ItemTags.AXES) || !player.mayBuild()) {
            return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
        }

        BlockState strippedState = strippedBlock.get().withPropertiesOf(state);
        level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);

        if (!level.isClientSide()) {
            level.setBlock(pos, strippedState, Block.UPDATE_ALL_IMMEDIATE);
            stack.hurtAndBreak(1, player, hand);
        }

        return InteractionResult.SUCCESS;
    }
}
