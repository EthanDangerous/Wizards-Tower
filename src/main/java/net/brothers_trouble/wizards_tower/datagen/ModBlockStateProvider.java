package net.brothers_trouble.wizards_tower.datagen;

import net.brothers_trouble.wizards_tower.WizardsTower;
import net.brothers_trouble.wizards_tower.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WizardsTower.MOD_ID, exFileHelper);
    }

    protected void registerStatesAndModels() {
        stairsBlock(ModBlocks.TOWERWOOD_PLANK_STAIRS.get(), blockTexture(ModBlocks.TOWERWOOD_PLANK.get()));
        slabBlock(ModBlocks.TOWERWOOD_PLANK_SLAB.get(), blockTexture(ModBlocks.TOWERWOOD_PLANK.get()), blockTexture(ModBlocks.TOWERWOOD_PLANK.get()));
        fenceBlock(ModBlocks.TOWERWOOD_PLANK_FENCE.get(), blockTexture(ModBlocks.TOWERWOOD_PLANK.get()));

        blockItem(ModBlocks.TOWERWOOD_PLANK_STAIRS);
        blockItem(ModBlocks.TOWERWOOD_PLANK_SLAB);

        blockWithItem(ModBlocks.TOWER_DOOR_MIDDLE);
        blockWithItem(ModBlocks.TOWER_DOOR_BOTTOM);
        blockWithItem(ModBlocks.TOWER_DOOR_TOP);
        blockWithItem(ModBlocks.TOWER_DOOR_MIDDLE_FLIPPED);
        blockWithItem(ModBlocks.TOWER_DOOR_BOTTOM_FLIPPED);
        blockWithItem(ModBlocks.TOWER_DOOR_TOP_FLIPPED);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(WizardsTower.MOD_ID + ":block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(WizardsTower.MOD_ID + ":block/" + deferredBlock.getId().getPath() + appendix));
    }
}
