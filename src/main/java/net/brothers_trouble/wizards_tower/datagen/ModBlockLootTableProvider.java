package net.brothers_trouble.wizards_tower.datagen;

import net.brothers_trouble.wizards_tower.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.TOWERWOOD.get()); // Ensure this exists
        dropSelf(ModBlocks.TOWERWOOD_PLANK.get()); // Ensure this exists
        dropSelf(ModBlocks.MAGESTONE.get()); // Ensure this exists
        dropSelf(ModBlocks.MAGESTONE_PILLAR.get()); // Ensure this exists
        dropSelf(ModBlocks.MAGESTONE_BRICKS.get()); // Ensure this exists
        dropSelf(ModBlocks.SOURCERERSHROOM.get()); // Ensure this exists
        dropSelf(ModBlocks.HEART_OF_THE_TOWER.get()); // Ensure this exists

        dropSelf(ModBlocks.TOWERWOOD_PLANK_STAIRS.get());
        this.add(ModBlocks.TOWERWOOD_PLANK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TOWERWOOD_PLANK_SLAB.get()));

        dropSelf(ModBlocks.TOWERWOOD_PLANK_FENCE.get());
        dropSelf(ModBlocks.TOWER_CROP.get());

        dropSelf(ModBlocks.TOWER_DOOR_BOTTOM.get());
        dropSelf(ModBlocks.TOWER_DOOR_MIDDLE.get());
        dropSelf(ModBlocks.TOWER_DOOR_TOP.get());
        dropSelf(ModBlocks.TOWER_DOOR_BOTTOM_FLIPPED.get());
        dropSelf(ModBlocks.TOWER_DOOR_MIDDLE_FLIPPED.get());
        dropSelf(ModBlocks.TOWER_DOOR_TOP_FLIPPED.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}