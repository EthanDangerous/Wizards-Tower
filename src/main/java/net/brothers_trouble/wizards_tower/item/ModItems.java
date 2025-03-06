package net.brothers_trouble.wizards_tower.item;

import net.brothers_trouble.wizards_tower.WizardsTower;
import net.brothers_trouble.wizards_tower.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WizardsTower.MOD_ID);

    public static final DeferredHolder<Item, Item> ANIMUSGEM = ITEMS.register("animus_gem",
            () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> FILLEDANIMUSGEM = ITEMS.register("filled_animus_gem",
            () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> TOWERSEEDS = ITEMS.register("tower_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOWER_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
