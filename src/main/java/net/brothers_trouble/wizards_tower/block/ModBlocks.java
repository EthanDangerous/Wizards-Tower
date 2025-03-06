package net.brothers_trouble.wizards_tower.block;

import net.brothers_trouble.wizards_tower.WizardsTower;
import net.brothers_trouble.wizards_tower.block.custom.*;
import net.brothers_trouble.wizards_tower.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.*;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(WizardsTower.MOD_ID);

    public static final DeferredBlock<Block> TOWERWOOD = registerBlock("towerwood",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWERWOOD_PLANK = registerBlock("towerwood_plank",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));


    public static final DeferredBlock<StairBlock> TOWERWOOD_PLANK_STAIRS = registerBlock("towerwood_plank_stairs",
            () -> new StairBlock(ModBlocks.TOWERWOOD_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<SlabBlock> TOWERWOOD_PLANK_SLAB = registerBlock("towerwood_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<FenceBlock> TOWERWOOD_PLANK_FENCE = registerBlock("towerwood_plank_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(-1f, 3600000f).sound(SoundType.WOOD)));


    public static final DeferredBlock<Block> MAGESTONE = registerBlock("magestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MAGESTONE_BRICKS = registerBlock("magestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MAGESTONE_PILLAR = registerBlock("magestone_pillar",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SOURCERERSHROOM = registerBlock("sourcerershroom",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> HEART_OF_THE_TOWER = registerBlock("heart_of_the_tower",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.TRIAL_SPAWNER)));

    public static final DeferredBlock<Block> TOWER_CROP = registerBlock("tower_crop",
            () -> new TowerCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final DeferredBlock<Block> TOWER_DOOR_BOTTOM = registerBlock("tower_door_bottom",
            () -> new TowerDoorBottomBlock(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWER_DOOR_MIDDLE = registerBlock("tower_door_middle",
            () -> new TowerDoorMiddleBlock(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWER_DOOR_TOP = registerBlock("tower_door_top",
            () -> new TowerDoorTopBlock(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWER_DOOR_BOTTOM_FLIPPED = registerBlock("tower_door_bottom_flipped",
            () -> new TowerDoorBottomBlockFlipped(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWER_DOOR_MIDDLE_FLIPPED = registerBlock("tower_door_middle_flipped",
            () -> new TowerDoorMiddleBlockFlipped(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> TOWER_DOOR_TOP_FLIPPED = registerBlock("tower_door_top_flipped",
            () -> new TowerDoorTopBlockFlipped(BlockBehaviour.Properties.of()
                    .strength(-1f, 3600000f).sound(SoundType.WOOD)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }}
