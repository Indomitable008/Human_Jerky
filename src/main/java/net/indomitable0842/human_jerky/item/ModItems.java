package net.indomitable0842.human_jerky.item;

import net.indomitable0842.human_jerky.HumanJerky;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HumanJerky.MODID);

    public static final RegistryObject<Item> HUMAN_JERKY = ITEMS.register("human_jerky",
            () -> new Item(new Item.Properties().food(ModFoods.HUMAN_JERKY)));
    public static final RegistryObject<Item> RAW_HUMAN_JERKY = ITEMS.register("raw_human_jerky",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_HUMAN_JERKY)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
