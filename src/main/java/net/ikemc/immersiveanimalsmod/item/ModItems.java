package net.ikemc.immersiveanimalsmod.item;

import net.ikemc.immersiveanimalsmod.ImmersiveAnimalsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveAnimalsMod.MOD_ID);

    public static final RegistryObject<Item> BULLSPAWNEGG = ITEMS.register("bullspawnegg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAMSPAWNEGG = ITEMS.register("ramspawnegg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROOSTERSPAWNEGG = ITEMS.register("roosterspawnegg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOARSPAWNEGG = ITEMS.register("boarspawnegg",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
