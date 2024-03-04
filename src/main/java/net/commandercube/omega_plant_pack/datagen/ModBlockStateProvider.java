package net.commandercube.omega_plant_pack.datagen;

import net.commandercube.omega_plant_pack.OmegaPlantPack;
import net.commandercube.omega_plant_pack.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, OmegaPlantPack.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.JOSEYS_FLOWER.get(), models().cross(blockTexture(ModBlocks.JOSEYS_FLOWER.get()).getPath(),
                blockTexture(ModBlocks.JOSEYS_FLOWER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_JOSEYS_FLOWER.get(), models().singleTexture("potted_joseys_flower", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.JOSEYS_FLOWER.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
