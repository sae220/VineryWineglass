package net.saezae.vinerywineglass.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import satisfyu.vinery.registry.ObjectRegistry;

public abstract class AbstractWineglassBlock extends Block {
    public static final BooleanProperty FILLED;

    public AbstractWineglassBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FILLED, false));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(FILLED)) {
            return ActionResult.PASS;
        }
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(ObjectRegistry.NOIR_WINE.asItem())) {
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_BREWING_STAND_BREW, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.setBlockState(pos, state.with(FILLED, true));
            return ActionResult.SUCCESS;
        };
        return ActionResult.PASS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FILLED);
    }

    static {
        FILLED = BooleanProperty.of("filled");
    }
}
