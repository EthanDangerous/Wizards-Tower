package net.brothers_trouble.wizards_tower.creative;

import net.brothers_trouble.wizards_tower.WizardsTower;
import net.brothers_trouble.wizards_tower.block.ModBlocks;
import net.brothers_trouble.wizards_tower.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WizardsTower.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WIZARDS_TOWER_GENERAL_TAB = CREATIVE_MODE_TABS.register("wizards_tower_general_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FILLEDANIMUSGEM.get()))
                    .title(Component.translatable("creativetab.wizards_tower.wizards_tower_general"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANIMUSGEM.get());
                        output.accept(ModItems.FILLEDANIMUSGEM.get());
                        output.accept(ModItems.TOWERSEEDS.get());
                    })
                    .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WIZARDS_TOWER_CREATIVE_TAB = CREATIVE_MODE_TABS.register("wizards_tower_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HEART_OF_THE_TOWER.get()))
                    .withTabsBefore(WIZARDS_TOWER_GENERAL_TAB.getId())
                    .title(Component.translatable("creativetab.wizards_tower.wizards_tower_creative"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TOWERWOOD.get());
                        output.accept(ModBlocks.TOWERWOOD_PLANK.get());
                        output.accept(ModBlocks.TOWERWOOD_PLANK_STAIRS.get());
                        output.accept(ModBlocks.TOWERWOOD_PLANK_SLAB.get());
                        output.accept(ModBlocks.TOWERWOOD_PLANK_FENCE.get());
                        output.accept(ModBlocks.MAGESTONE.get());
                        output.accept(ModBlocks.MAGESTONE_BRICKS.get());
                        output.accept(ModBlocks.MAGESTONE_PILLAR.get());
                        output.accept(ModBlocks.SOURCERERSHROOM.get());
                        output.accept(ModBlocks.HEART_OF_THE_TOWER.get());
                        output.accept(ModBlocks.TOWER_DOOR_BOTTOM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
