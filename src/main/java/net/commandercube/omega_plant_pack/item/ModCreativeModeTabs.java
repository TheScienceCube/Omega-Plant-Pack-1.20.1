package net.commandercube.omega_plant_pack.item;

import net.commandercube.omega_plant_pack.OmegaPlantPack;
import net.commandercube.omega_plant_pack.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OmegaPlantPack.MOD_ID);
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
    public static final RegistryObject<CreativeModeTab> OMEGA_PLANT_PACK_TAB = CREATIVE_MODE_TABS.register("omega_plant_pack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.JOSEYS_FLOWER.get()))
                    .title(Component.translatable("creativetab.omega_plant_pack_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.JOSEYS_FLOWER.get());
                        pOutput.accept(ModItems.FERTILIZER.get());
                    })
                    .build());
}
