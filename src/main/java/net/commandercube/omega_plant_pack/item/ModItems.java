package net.commandercube.omega_plant_pack.item;

import net.commandercube.omega_plant_pack.OmegaPlantPack;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OmegaPlantPack.MOD_ID);
    public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer",() -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
