package net.brothers_trouble.wizards_tower.datagen;

import net.brothers_trouble.wizards_tower.WizardsTower;
import net.brothers_trouble.wizards_tower.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WizardsTower.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceItem(ModBlocks.TOWERWOOD_PLANK_FENCE, ModBlocks.TOWERWOOD_PLANK);
        stairsItem(ModBlocks.TOWERWOOD_PLANK_STAIRS, ModBlocks.TOWERWOOD_PLANK);
        slabItem(ModBlocks.TOWERWOOD_PLANK_SLAB, ModBlocks.TOWERWOOD_PLANK);
        simpleBlockItem(ModBlocks.TOWER_DOOR_BOTTOM);
        simpleBlockItem(ModBlocks.TOWER_DOOR_MIDDLE);
        simpleBlockItem(ModBlocks.TOWER_DOOR_TOP);
        simpleBlockItem(ModBlocks.TOWER_DOOR_BOTTOM_FLIPPED);
        simpleBlockItem(ModBlocks.TOWER_DOOR_MIDDLE_FLIPPED);
        simpleBlockItem(ModBlocks.TOWER_DOOR_TOP_FLIPPED);
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void slabItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), modLoc("block/" + baseBlock.getId().getPath() + "_slab"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }

    public void stairsItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), modLoc("block/" + baseBlock.getId().getPath() + "_stairs"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }

    public void simpleBlockItem(DeferredBlock<?> block) {
        this.withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }

//    public void stairsItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
//                        mcLoc("block/stairs"))
//                .texture("top", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()))
//                .texture("bottom", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()))
//                .texture("side", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
//    }
//
//    public void slabItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
//                        mcLoc("block/slab"))
//                .texture("top", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()))
//                .texture("bottom", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()))
//                .texture("side", ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,
//                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
//    }
//
//    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
//        return withExistingParent(item.getId().getPath(),
//                ResourceLocation.parse("item/generated")).texture("layer0",
//                ResourceLocation.fromNamespaceAndPath(WizardsTower.MOD_ID,"item/" + item.getId().getPath()));
//    }
}
