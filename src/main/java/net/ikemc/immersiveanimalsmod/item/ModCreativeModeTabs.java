package net.ikemc.immersiveanimalsmod.item;

import net.ikemc.immersiveanimalsmod.ImmersiveAnimalsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImmersiveAnimalsMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> IMMERSIVE_ANIMALS_TAB = CREATIVE_MODE_TABS.register("immersive_animals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAMSPAWNEGG.get()))
                    .title(Component.translatable("creativetab.immersive_animals"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAMSPAWNEGG.get());
                        output.accept(ModItems.BOARSPAWNEGG.get());
                        output.accept(ModItems.ROOSTERSPAWNEGG.get());
                        output.accept(ModItems.BULLSPAWNEGG.get());


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
