package net.toxevo.mythicores.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.toxevo.mythicores.MythicOres;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MythicOres.MOD_ID);

    // Example Item
    public static final DeferredItem<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
