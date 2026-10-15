package net.benjimirooo.kepleymod.item;

import net.benjimirooo.kepleymod.KepleyMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KepleyMod.MOD_ID);

        public static final DeferredItem<Item> SERPENTTONGUE = ITEMS.register("serpent_tongue",
                () -> new Item(new Item.Properties()));
        public static final DeferredItem<Item> EXCALIBUR = ITEMS.register("excalibur",
                () -> new Item(new Item.Properties()));



        public static void register (IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
