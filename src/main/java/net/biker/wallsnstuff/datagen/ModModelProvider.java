package net.biker.wallsnstuff.datagen;

import net.biker.wallsnstuff.block.ModBlocks;
import net.biker.wallsnstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cobblepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLESTONE);
        cobblepool.fenceGate(ModBlocks.COBBLESTONE_FENCE_GATE);
        cobblepool.fence(ModBlocks.COBBLESTONE_FENCE);

        BlockStateModelGenerator.BlockTexturePool dirtpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);
        dirtpool.fence(ModBlocks.DIRT_FENCE);
        dirtpool.fenceGate(ModBlocks.DIRT_FENCE_GATE);
        dirtpool.wall(ModBlocks.DIRT_WALL);

        BlockStateModelGenerator.BlockTexturePool icepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ICE);
        icepool.fence(ModBlocks.ICE_FENCE);
        icepool.fenceGate(ModBlocks.ICE_FENCE_GATE);
        icepool.wall(ModBlocks.ICE_WALL);

        BlockStateModelGenerator.BlockTexturePool oaklogpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_LOG);
        oaklogpool.fence(ModBlocks.OAK_LOG_FENCE);
        oaklogpool.fenceGate(ModBlocks.OAK_LOG_FENCE_GATE);
        oaklogpool.wall(ModBlocks.OAK_LOG_WALL);

        BlockStateModelGenerator.BlockTexturePool copper_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        copper_blockpool.fence(ModBlocks.COPPER_BLOCK_FENCE);
        copper_blockpool.fenceGate(ModBlocks.COPPER_BLOCK_FENCE_GATE);
        copper_blockpool.wall(ModBlocks.COPPER_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool exposed_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        exposed_copperpool.fence(ModBlocks.EXPOSED_COPPER_FENCE);
        exposed_copperpool.fenceGate(ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        exposed_copperpool.wall(ModBlocks.EXPOSED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool weathered_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        weathered_copperpool.fence(ModBlocks.WEATHERED_COPPER_FENCE);
        weathered_copperpool.fenceGate(ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        weathered_copperpool.wall(ModBlocks.WEATHERED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool oxidized_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        oxidized_copperpool.fence(ModBlocks.OXIDIZED_COPPER_FENCE);
        oxidized_copperpool.fenceGate(ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
        oxidized_copperpool.wall(ModBlocks.OXIDIZED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool cut_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_COPPER);
        cut_copperpool.fence(ModBlocks.CUT_COPPER_FENCE);
        cut_copperpool.fenceGate(ModBlocks.CUT_COPPER_FENCE_GATE);
        cut_copperpool.wall(ModBlocks.CUT_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool exposed_cut_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_CUT_COPPER);
        exposed_cut_copperpool.fence(ModBlocks.EXPOSED_CUT_COPPER_FENCE);
        exposed_cut_copperpool.fenceGate(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
        exposed_cut_copperpool.wall(ModBlocks.EXPOSED_CUT_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool weathered_cut_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_CUT_COPPER);
        weathered_cut_copperpool.fence(ModBlocks.WEATHERED_CUT_COPPER_FENCE);
        weathered_cut_copperpool.fenceGate(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
        weathered_cut_copperpool.wall(ModBlocks.WEATHERED_CUT_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool oxidized_cut_copperpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_CUT_COPPER);
        oxidized_cut_copperpool.fence(ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
        oxidized_cut_copperpool.fenceGate(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
        oxidized_cut_copperpool.wall(ModBlocks.OXIDIZED_CUT_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool white_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        white_woolpool.fence(ModBlocks.WHITE_WOOL_FENCE);
        white_woolpool.fenceGate(ModBlocks.WHITE_WOOL_FENCE_GATE);
        white_woolpool.wall(ModBlocks.WHITE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool orange_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        orange_woolpool.fence(ModBlocks.ORANGE_WOOL_FENCE);
        orange_woolpool.fenceGate(ModBlocks.ORANGE_WOOL_FENCE_GATE);
        orange_woolpool.wall(ModBlocks.ORANGE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool magenta_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        magenta_woolpool.fence(ModBlocks.MAGENTA_WOOL_FENCE);
        magenta_woolpool.fenceGate(ModBlocks.MAGENTA_WOOL_FENCE_GATE);
        magenta_woolpool.wall(ModBlocks.MAGENTA_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool light_blue_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        light_blue_woolpool.fence(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
        light_blue_woolpool.fenceGate(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE);
        light_blue_woolpool.wall(ModBlocks.LIGHT_BLUE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool yellow_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        yellow_woolpool.fence(ModBlocks.YELLOW_WOOL_FENCE);
        yellow_woolpool.fenceGate(ModBlocks.YELLOW_WOOL_FENCE_GATE);
        yellow_woolpool.wall(ModBlocks.YELLOW_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool lime_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        lime_woolpool.fence(ModBlocks.LIME_WOOL_FENCE);
        lime_woolpool.fenceGate(ModBlocks.LIME_WOOL_FENCE_GATE);
        lime_woolpool.wall(ModBlocks.LIME_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool pink_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
        pink_woolpool.fence(ModBlocks.PINK_WOOL_FENCE);
        pink_woolpool.fenceGate(ModBlocks.PINK_WOOL_FENCE_GATE);
        pink_woolpool.wall(ModBlocks.PINK_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool gray_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        gray_woolpool.fence(ModBlocks.GRAY_WOOL_FENCE);
        gray_woolpool.fenceGate(ModBlocks.GRAY_WOOL_FENCE_GATE);
        gray_woolpool.wall(ModBlocks.GRAY_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool light_gray_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        light_gray_woolpool.fence(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
        light_gray_woolpool.fenceGate(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE);
        light_gray_woolpool.wall(ModBlocks.LIGHT_GRAY_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool cyan_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        cyan_woolpool.fence(ModBlocks.CYAN_WOOL_FENCE);
        cyan_woolpool.fenceGate(ModBlocks.CYAN_WOOL_FENCE_GATE);
        cyan_woolpool.wall(ModBlocks.CYAN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool purple_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        purple_woolpool.fence(ModBlocks.PURPLE_WOOL_FENCE);
        purple_woolpool.fenceGate(ModBlocks.PURPLE_WOOL_FENCE_GATE);
        purple_woolpool.wall(ModBlocks.PURPLE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool blue_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        blue_woolpool.fence(ModBlocks.BLUE_WOOL_FENCE);
        blue_woolpool.fenceGate(ModBlocks.BLUE_WOOL_FENCE_GATE);
        blue_woolpool.wall(ModBlocks.BLUE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool brown_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        brown_woolpool.fence(ModBlocks.BROWN_WOOL_FENCE);
        brown_woolpool.fenceGate(ModBlocks.BROWN_WOOL_FENCE_GATE);
        brown_woolpool.wall(ModBlocks.BROWN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool green_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        green_woolpool.fence(ModBlocks.GREEN_WOOL_FENCE);
        green_woolpool.fenceGate(ModBlocks.GREEN_WOOL_FENCE_GATE);
        green_woolpool.wall(ModBlocks.GREEN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool red_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        red_woolpool.fence(ModBlocks.RED_WOOL_FENCE);
        red_woolpool.fenceGate(ModBlocks.RED_WOOL_FENCE_GATE);
        red_woolpool.wall(ModBlocks.RED_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool black_woolpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        black_woolpool.fence(ModBlocks.BLACK_WOOL_FENCE);
        black_woolpool.fenceGate(ModBlocks.BLACK_WOOL_FENCE_GATE);
        black_woolpool.wall(ModBlocks.BLACK_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        terracottapool.fence(ModBlocks.TERRACOTTA_FENCE);
        terracottapool.fenceGate(ModBlocks.TERRACOTTA_FENCE_GATE);
        terracottapool.wall(ModBlocks.TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool white_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        white_terracottapool.fence(ModBlocks.WHITE_TERRACOTTA_FENCE);
        white_terracottapool.fenceGate(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE);
        white_terracottapool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool orange_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        orange_terracottapool.fence(ModBlocks.ORANGE_TERRACOTTA_FENCE);
        orange_terracottapool.fenceGate(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE);
        orange_terracottapool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool magenta_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        magenta_terracottapool.fence(ModBlocks.MAGENTA_TERRACOTTA_FENCE);
        magenta_terracottapool.fenceGate(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE);
        magenta_terracottapool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool light_blue_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        light_blue_terracottapool.fence(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE);
        light_blue_terracottapool.fenceGate(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE);
        light_blue_terracottapool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool yellow_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        yellow_terracottapool.fence(ModBlocks.YELLOW_TERRACOTTA_FENCE);
        yellow_terracottapool.fenceGate(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE);
        yellow_terracottapool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool lime_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        lime_terracottapool.fence(ModBlocks.LIME_TERRACOTTA_FENCE);
        lime_terracottapool.fenceGate(ModBlocks.LIME_TERRACOTTA_FENCE_GATE);
        lime_terracottapool.wall(ModBlocks.LIME_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool pink_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        pink_terracottapool.fence(ModBlocks.PINK_TERRACOTTA_FENCE);
        pink_terracottapool.fenceGate(ModBlocks.PINK_TERRACOTTA_FENCE_GATE);
        pink_terracottapool.wall(ModBlocks.PINK_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool gray_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        gray_terracottapool.fence(ModBlocks.GRAY_TERRACOTTA_FENCE);
        gray_terracottapool.fenceGate(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE);
        gray_terracottapool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool light_gray_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        light_gray_terracottapool.fence(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE);
        light_gray_terracottapool.fenceGate(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE);
        light_gray_terracottapool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool cyan_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        cyan_terracottapool.fence(ModBlocks.CYAN_TERRACOTTA_FENCE);
        cyan_terracottapool.fenceGate(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE);
        cyan_terracottapool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool purple_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        purple_terracottapool.fence(ModBlocks.PURPLE_TERRACOTTA_FENCE);
        purple_terracottapool.fenceGate(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE);
        purple_terracottapool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool blue_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        blue_terracottapool.fence(ModBlocks.BLUE_TERRACOTTA_FENCE);
        blue_terracottapool.fenceGate(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE);
        blue_terracottapool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool brown_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        brown_terracottapool.fence(ModBlocks.BROWN_TERRACOTTA_FENCE);
        brown_terracottapool.fenceGate(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE);
        brown_terracottapool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool green_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        green_terracottapool.fence(ModBlocks.GREEN_TERRACOTTA_FENCE);
        green_terracottapool.fenceGate(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE);
        green_terracottapool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool red_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        red_terracottapool.fence(ModBlocks.RED_TERRACOTTA_FENCE);
        red_terracottapool.fenceGate(ModBlocks.RED_TERRACOTTA_FENCE_GATE);
        red_terracottapool.wall(ModBlocks.RED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool black_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        black_terracottapool.fence(ModBlocks.BLACK_TERRACOTTA_FENCE);
        black_terracottapool.fenceGate(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE);
        black_terracottapool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool white_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_GLAZED_TERRACOTTA);
        white_glazed_terracottapool.fence(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE);
        white_glazed_terracottapool.fenceGate(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE);
        white_glazed_terracottapool.wall(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool orange_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_GLAZED_TERRACOTTA);
        orange_glazed_terracottapool.fence(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE);
        orange_glazed_terracottapool.fenceGate(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE);
        orange_glazed_terracottapool.wall(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool magenta_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        magenta_glazed_terracottapool.fence(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE);
        magenta_glazed_terracottapool.fenceGate(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE);
        magenta_glazed_terracottapool.wall(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool light_blue_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        light_blue_glazed_terracottapool.fence(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE);
        light_blue_glazed_terracottapool.fenceGate(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        light_blue_glazed_terracottapool.wall(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool yellow_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_GLAZED_TERRACOTTA);
        yellow_glazed_terracottapool.fence(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE);
        yellow_glazed_terracottapool.fenceGate(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE);
        yellow_glazed_terracottapool.wall(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool lime_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_GLAZED_TERRACOTTA);
        lime_glazed_terracottapool.fence(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE);
        lime_glazed_terracottapool.fenceGate(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE);
        lime_glazed_terracottapool.wall(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool pink_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_GLAZED_TERRACOTTA);
        pink_glazed_terracottapool.fence(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE);
        pink_glazed_terracottapool.fenceGate(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE);
        pink_glazed_terracottapool.wall(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool gray_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_GLAZED_TERRACOTTA);
        gray_glazed_terracottapool.fence(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE);
        gray_glazed_terracottapool.fenceGate(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        gray_glazed_terracottapool.wall(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool light_gray_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        light_gray_glazed_terracottapool.fence(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE);
        light_gray_glazed_terracottapool.fenceGate(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        light_gray_glazed_terracottapool.wall(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool cyan_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_GLAZED_TERRACOTTA);
        cyan_glazed_terracottapool.fence(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE);
        cyan_glazed_terracottapool.fenceGate(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE);
        cyan_glazed_terracottapool.wall(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool purple_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_GLAZED_TERRACOTTA);
        purple_glazed_terracottapool.fence(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE);
        purple_glazed_terracottapool.fenceGate(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE);
        purple_glazed_terracottapool.wall(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool blue_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_GLAZED_TERRACOTTA);
        blue_glazed_terracottapool.fence(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE);
        blue_glazed_terracottapool.fenceGate(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        blue_glazed_terracottapool.wall(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool brown_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_GLAZED_TERRACOTTA);
        brown_glazed_terracottapool.fence(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE);
        brown_glazed_terracottapool.fenceGate(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE);
        brown_glazed_terracottapool.wall(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool green_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_GLAZED_TERRACOTTA);
        green_glazed_terracottapool.fence(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE);
        green_glazed_terracottapool.fenceGate(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE);
        green_glazed_terracottapool.wall(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool red_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_GLAZED_TERRACOTTA);
        red_glazed_terracottapool.fence(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE);
        red_glazed_terracottapool.fenceGate(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE);
        red_glazed_terracottapool.wall(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool black_glazed_terracottapool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_GLAZED_TERRACOTTA);
        black_glazed_terracottapool.fence(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE);
        black_glazed_terracottapool.fenceGate(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE);
        black_glazed_terracottapool.wall(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool white_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS);
        white_stained_glasspool.fence(ModBlocks.WHITE_STAINED_GLASS_FENCE);
        white_stained_glasspool.fenceGate(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
        white_stained_glasspool.wall(ModBlocks.WHITE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool orange_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        orange_stained_glasspool.fence(ModBlocks.ORANGE_STAINED_GLASS_FENCE);
        orange_stained_glasspool.fenceGate(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
        orange_stained_glasspool.wall(ModBlocks.ORANGE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool magenta_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        magenta_stained_glasspool.fence(ModBlocks.MAGENTA_STAINED_GLASS_FENCE);
        magenta_stained_glasspool.fenceGate(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
        magenta_stained_glasspool.wall(ModBlocks.MAGENTA_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool light_blue_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        light_blue_stained_glasspool.fence(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
        light_blue_stained_glasspool.fenceGate(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
        light_blue_stained_glasspool.wall(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool yellow_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        yellow_stained_glasspool.fence(ModBlocks.YELLOW_STAINED_GLASS_FENCE);
        yellow_stained_glasspool.fenceGate(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
        yellow_stained_glasspool.wall(ModBlocks.YELLOW_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool lime_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        lime_stained_glasspool.fence(ModBlocks.LIME_STAINED_GLASS_FENCE);
        lime_stained_glasspool.fenceGate(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE);
        lime_stained_glasspool.wall(ModBlocks.LIME_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool pink_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        pink_stained_glasspool.fence(ModBlocks.PINK_STAINED_GLASS_FENCE);
        pink_stained_glasspool.fenceGate(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE);
        pink_stained_glasspool.wall(ModBlocks.PINK_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool gray_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        gray_stained_glasspool.fence(ModBlocks.GRAY_STAINED_GLASS_FENCE);
        gray_stained_glasspool.fenceGate(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
        gray_stained_glasspool.wall(ModBlocks.GRAY_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool light_gray_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        light_gray_stained_glasspool.fence(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
        light_gray_stained_glasspool.fenceGate(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
        light_gray_stained_glasspool.wall(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool cyan_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        cyan_stained_glasspool.fence(ModBlocks.CYAN_STAINED_GLASS_FENCE);
        cyan_stained_glasspool.fenceGate(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
        cyan_stained_glasspool.wall(ModBlocks.CYAN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool purple_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        purple_stained_glasspool.fence(ModBlocks.PURPLE_STAINED_GLASS_FENCE);
        purple_stained_glasspool.fenceGate(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
        purple_stained_glasspool.wall(ModBlocks.PURPLE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool blue_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        blue_stained_glasspool.fence(ModBlocks.BLUE_STAINED_GLASS_FENCE);
        blue_stained_glasspool.fenceGate(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
        blue_stained_glasspool.wall(ModBlocks.BLUE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool brown_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        brown_stained_glasspool.fence(ModBlocks.BROWN_STAINED_GLASS_FENCE);
        brown_stained_glasspool.fenceGate(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE);
        brown_stained_glasspool.wall(ModBlocks.BROWN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool green_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        green_stained_glasspool.fence(ModBlocks.GREEN_STAINED_GLASS_FENCE);
        green_stained_glasspool.fenceGate(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
        green_stained_glasspool.wall(ModBlocks.GREEN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool red_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        red_stained_glasspool.fence(ModBlocks.RED_STAINED_GLASS_FENCE);
        red_stained_glasspool.fenceGate(ModBlocks.RED_STAINED_GLASS_FENCE_GATE);
        red_stained_glasspool.wall(ModBlocks.RED_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool black_stained_glasspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        black_stained_glasspool.fence(ModBlocks.BLACK_STAINED_GLASS_FENCE);
        black_stained_glasspool.fenceGate(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
        black_stained_glasspool.wall(ModBlocks.BLACK_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool gravelpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAVEL);
        gravelpool.fence(ModBlocks.GRAVEL_FENCE);
        gravelpool.fenceGate(ModBlocks.GRAVEL_FENCE_GATE);
        gravelpool.wall(ModBlocks.GRAVEL_WALL);

        BlockStateModelGenerator.BlockTexturePool claypool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CLAY);
        claypool.fence(ModBlocks.CLAY_FENCE);
        claypool.fenceGate(ModBlocks.CLAY_FENCE_GATE);
        claypool.wall(ModBlocks.CLAY_WALL);

        BlockStateModelGenerator.BlockTexturePool sandpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SAND);
        sandpool.fence(ModBlocks.SAND_FENCE);
        sandpool.fenceGate(ModBlocks.SAND_FENCE_GATE);
        sandpool.wall(ModBlocks.SAND_WALL);

        BlockStateModelGenerator.BlockTexturePool red_sandpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_SAND);
        red_sandpool.fence(ModBlocks.RED_SAND_FENCE);
        red_sandpool.fenceGate(ModBlocks.RED_SAND_FENCE_GATE);
        red_sandpool.wall(ModBlocks.RED_SAND_WALL);

        BlockStateModelGenerator.BlockTexturePool packed_icepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_ICE);
        packed_icepool.fence(ModBlocks.PACKED_ICE_FENCE);
        packed_icepool.fenceGate(ModBlocks.PACKED_ICE_FENCE_GATE);
        packed_icepool.wall(ModBlocks.PACKED_ICE_WALL);

        BlockStateModelGenerator.BlockTexturePool blue_icepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_ICE);
        blue_icepool.fence(ModBlocks.BLUE_ICE_FENCE);
        blue_icepool.fenceGate(ModBlocks.BLUE_ICE_FENCE_GATE);
        blue_icepool.wall(ModBlocks.BLUE_ICE_WALL);


        BlockStateModelGenerator.BlockTexturePool moss_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSS_BLOCK);
        moss_blockpool.fence(ModBlocks.MOSS_BLOCK_FENCE);
        moss_blockpool.fenceGate(ModBlocks.MOSS_BLOCK_FENCE_GATE);
        moss_blockpool.wall(ModBlocks.MOSS_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool calcitepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        calcitepool.fence(ModBlocks.CALCITE_FENCE);
        calcitepool.fenceGate(ModBlocks.CALCITE_FENCE_GATE);
        calcitepool.wall(ModBlocks.CALCITE_WALL);

        BlockStateModelGenerator.BlockTexturePool tuffpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUFF);
        tuffpool.fence(ModBlocks.TUFF_FENCE);
        tuffpool.fenceGate(ModBlocks.TUFF_FENCE_GATE);
        tuffpool.wall(ModBlocks.TUFF_WALL);

        BlockStateModelGenerator.BlockTexturePool dripstone_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DRIPSTONE_BLOCK);
        dripstone_blockpool.fence(ModBlocks.DRIPSTONE_BLOCK_FENCE);
        dripstone_blockpool.fenceGate(ModBlocks.DRIPSTONE_BLOCK_FENCE_GATE);
        dripstone_blockpool.wall(ModBlocks.DRIPSTONE_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool prismarinepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE);
        prismarinepool.fence(ModBlocks.PRISMARINE_FENCE);
        prismarinepool.fenceGate(ModBlocks.PRISMARINE_FENCE_GATE);
        prismarinepool.wall(ModBlocks.PRISMARINE_WALL);


        BlockStateModelGenerator.BlockTexturePool obsidianpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OBSIDIAN);
        obsidianpool.fence(ModBlocks.OBSIDIAN_FENCE);
        obsidianpool.fenceGate(ModBlocks.OBSIDIAN_FENCE_GATE);
        obsidianpool.wall(ModBlocks.OBSIDIAN_WALL);

        BlockStateModelGenerator.BlockTexturePool crying_obsidianpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRYING_OBSIDIAN);
        crying_obsidianpool.fence(ModBlocks.CRYING_OBSIDIAN_FENCE);
        crying_obsidianpool.fenceGate(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE);
        crying_obsidianpool.wall(ModBlocks.CRYING_OBSIDIAN_WALL);

        BlockStateModelGenerator.BlockTexturePool netherrackpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        netherrackpool.fence(ModBlocks.NETHERRACK_FENCE);
        netherrackpool.fenceGate(ModBlocks.NETHERRACK_FENCE_GATE);
        netherrackpool.wall(ModBlocks.NETHERRACK_WALL);

        BlockStateModelGenerator.BlockTexturePool soul_sandpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SOUL_SAND);
        soul_sandpool.fence(ModBlocks.SOUL_SAND_FENCE);
        soul_sandpool.fenceGate(ModBlocks.SOUL_SAND_FENCE_GATE);
        soul_sandpool.wall(ModBlocks.SOUL_SAND_WALL);

        BlockStateModelGenerator.BlockTexturePool soul_soilpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SOUL_SOIL);
        soul_soilpool.fence(ModBlocks.SOUL_SOIL_FENCE);
        soul_soilpool.fenceGate(ModBlocks.SOUL_SOIL_FENCE_GATE);
        soul_soilpool.wall(ModBlocks.SOUL_SOIL_WALL);


        BlockStateModelGenerator.BlockTexturePool smooth_basaltpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        smooth_basaltpool.fence(ModBlocks.SMOOTH_BASALT_FENCE);
        smooth_basaltpool.fenceGate(ModBlocks.SMOOTH_BASALT_FENCE_GATE);
        smooth_basaltpool.wall(ModBlocks.SMOOTH_BASALT_WALL);

        BlockStateModelGenerator.BlockTexturePool end_stonepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        end_stonepool.fence(ModBlocks.END_STONE_FENCE);
        end_stonepool.fenceGate(ModBlocks.END_STONE_FENCE_GATE);
        end_stonepool.wall(ModBlocks.END_STONE_WALL);






        BlockStateModelGenerator.BlockTexturePool mushroom_stempool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MUSHROOM_STEM);
        mushroom_stempool.fence(ModBlocks.MUSHROOM_STEM_FENCE);
        mushroom_stempool.fenceGate(ModBlocks.MUSHROOM_STEM_FENCE_GATE);
        mushroom_stempool.wall(ModBlocks.MUSHROOM_STEM_WALL);

        BlockStateModelGenerator.BlockTexturePool crimson_stempool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_STEM);
        crimson_stempool.fence(ModBlocks.CRIMSON_STEM_FENCE);
        crimson_stempool.fenceGate(ModBlocks.CRIMSON_STEM_FENCE_GATE);
        crimson_stempool.wall(ModBlocks.CRIMSON_STEM_WALL);

        BlockStateModelGenerator.BlockTexturePool warped_stempool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_STEM);
        warped_stempool.fence(ModBlocks.WARPED_STEM_FENCE);
        warped_stempool.fenceGate(ModBlocks.WARPED_STEM_FENCE_GATE);
        warped_stempool.wall(ModBlocks.WARPED_STEM_WALL);


        BlockStateModelGenerator.BlockTexturePool brown_mushroom_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_MUSHROOM_BLOCK);
        brown_mushroom_blockpool.fence(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE);
        brown_mushroom_blockpool.fenceGate(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE_GATE);
        brown_mushroom_blockpool.wall(ModBlocks.BROWN_MUSHROOM_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool red_mushroom_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_MUSHROOM_BLOCK);
        red_mushroom_blockpool.fence(ModBlocks.RED_MUSHROOM_BLOCK_FENCE);
        red_mushroom_blockpool.fenceGate(ModBlocks.RED_MUSHROOM_BLOCK_FENCE_GATE);
        red_mushroom_blockpool.wall(ModBlocks.RED_MUSHROOM_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool nether_wart_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHER_WART_BLOCK);
        nether_wart_blockpool.fence(ModBlocks.NETHER_WART_BLOCK_FENCE);
        nether_wart_blockpool.fenceGate(ModBlocks.NETHER_WART_BLOCK_FENCE_GATE);
        nether_wart_blockpool.wall(ModBlocks.NETHER_WART_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool warped_wart_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_WART_BLOCK);
        warped_wart_blockpool.fence(ModBlocks.WARPED_WART_BLOCK_FENCE);
        warped_wart_blockpool.fenceGate(ModBlocks.WARPED_WART_BLOCK_FENCE_GATE);
        warped_wart_blockpool.wall(ModBlocks.WARPED_WART_BLOCK_WALL);




        BlockStateModelGenerator.BlockTexturePool tube_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUBE_CORAL_BLOCK);
        tube_coral_blockpool.fence(ModBlocks.TUBE_CORAL_BLOCK_FENCE);
        tube_coral_blockpool.fenceGate(ModBlocks.TUBE_CORAL_BLOCK_FENCE_GATE);
        tube_coral_blockpool.wall(ModBlocks.TUBE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool brain_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BRAIN_CORAL_BLOCK);
        brain_coral_blockpool.fence(ModBlocks.BRAIN_CORAL_BLOCK_FENCE);
        brain_coral_blockpool.fenceGate(ModBlocks.BRAIN_CORAL_BLOCK_FENCE_GATE);
        brain_coral_blockpool.wall(ModBlocks.BRAIN_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool bubble_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BUBBLE_CORAL_BLOCK);
        bubble_coral_blockpool.fence(ModBlocks.BUBBLE_CORAL_BLOCK_FENCE);
        bubble_coral_blockpool.fenceGate(ModBlocks.BUBBLE_CORAL_BLOCK_FENCE_GATE);
        bubble_coral_blockpool.wall(ModBlocks.BUBBLE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool fire_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.FIRE_CORAL_BLOCK);
        fire_coral_blockpool.fence(ModBlocks.FIRE_CORAL_BLOCK_FENCE);
        fire_coral_blockpool.fenceGate(ModBlocks.FIRE_CORAL_BLOCK_FENCE_GATE);
        fire_coral_blockpool.wall(ModBlocks.FIRE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool horn_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.HORN_CORAL_BLOCK);
        horn_coral_blockpool.fence(ModBlocks.HORN_CORAL_BLOCK_FENCE);
        horn_coral_blockpool.fenceGate(ModBlocks.HORN_CORAL_BLOCK_FENCE_GATE);
        horn_coral_blockpool.wall(ModBlocks.HORN_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool spongepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPONGE);
        spongepool.fence(ModBlocks.SPONGE_FENCE);
        spongepool.fenceGate(ModBlocks.SPONGE_FENCE_GATE);
        spongepool.wall(ModBlocks.SPONGE_WALL);

        BlockStateModelGenerator.BlockTexturePool wet_spongepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WET_SPONGE);
        wet_spongepool.fence(ModBlocks.WET_SPONGE_FENCE);
        wet_spongepool.fenceGate(ModBlocks.WET_SPONGE_FENCE_GATE);
        wet_spongepool.wall(ModBlocks.WET_SPONGE_WALL);





        BlockStateModelGenerator.BlockTexturePool slime_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SLIME_BLOCK);
        slime_blockpool.fence(ModBlocks.SLIME_BLOCK_FENCE);
        slime_blockpool.fenceGate(ModBlocks.SLIME_BLOCK_FENCE_GATE);
        slime_blockpool.wall(ModBlocks.SLIME_BLOCK_WALL);





        BlockStateModelGenerator.BlockTexturePool sculkpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SCULK);
        sculkpool.fence(ModBlocks.SCULK_FENCE);
        sculkpool.fenceGate(ModBlocks.SCULK_FENCE_GATE);
        sculkpool.wall(ModBlocks.SCULK_WALL);

        BlockStateModelGenerator.BlockTexturePool bedrockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BEDROCK);
        bedrockpool.fence(ModBlocks.BEDROCK_FENCE);
        bedrockpool.fenceGate(ModBlocks.BEDROCK_FENCE_GATE);
        bedrockpool.wall(ModBlocks.BEDROCK_WALL);

        BlockStateModelGenerator.BlockTexturePool glowstonepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GLOWSTONE);
        glowstonepool.fence(ModBlocks.GLOWSTONE_FENCE);
        glowstonepool.fenceGate(ModBlocks.GLOWSTONE_FENCE_GATE);
        glowstonepool.wall(ModBlocks.GLOWSTONE_WALL);


        BlockStateModelGenerator.BlockTexturePool bamboo_plankspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS);
        bamboo_plankspool.fence(ModBlocks.BAMBOO_PLANKS_FENCE);
        bamboo_plankspool.fenceGate(ModBlocks.BAMBOO_PLANKS_FENCE_GATE);
        bamboo_plankspool.wall(ModBlocks.BAMBOO_PLANKS_WALL);


        BlockStateModelGenerator.BlockTexturePool bamboo_mosaicpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_MOSAIC);
        bamboo_mosaicpool.fence(ModBlocks.BAMBOO_MOSAIC_FENCE);
        bamboo_mosaicpool.fenceGate(ModBlocks.BAMBOO_MOSAIC_FENCE_GATE);
        bamboo_mosaicpool.wall(ModBlocks.BAMBOO_MOSAIC_WALL);

        BlockStateModelGenerator.BlockTexturePool redstone_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.REDSTONE_BLOCK);
        redstone_blockpool.fence(ModBlocks.REDSTONE_BLOCK_FENCE);
        redstone_blockpool.fenceGate(ModBlocks.REDSTONE_BLOCK_FENCE_GATE);
        redstone_blockpool.wall(ModBlocks.REDSTONE_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool emerald_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        emerald_blockpool.fence(ModBlocks.EMERALD_BLOCK_FENCE);
        emerald_blockpool.fenceGate(ModBlocks.EMERALD_BLOCK_FENCE_GATE);
        emerald_blockpool.wall(ModBlocks.EMERALD_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool diamond_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        diamond_blockpool.fence(ModBlocks.DIAMOND_BLOCK_FENCE);
        diamond_blockpool.fenceGate(ModBlocks.DIAMOND_BLOCK_FENCE_GATE);
        diamond_blockpool.wall(ModBlocks.DIAMOND_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool netherite_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        netherite_blockpool.fence(ModBlocks.NETHERITE_BLOCK_FENCE);
        netherite_blockpool.fenceGate(ModBlocks.NETHERITE_BLOCK_FENCE_GATE);
        netherite_blockpool.wall(ModBlocks.NETHERITE_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool lapis_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LAPIS_BLOCK);
        lapis_blockpool.fence(ModBlocks.LAPIS_BLOCK_FENCE);
        lapis_blockpool.fenceGate(ModBlocks.LAPIS_BLOCK_FENCE_GATE);
        lapis_blockpool.wall(ModBlocks.LAPIS_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool gold_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        gold_blockpool.fence(ModBlocks.GOLD_BLOCK_FENCE);
        gold_blockpool.fenceGate(ModBlocks.GOLD_BLOCK_FENCE_GATE);
        gold_blockpool.wall(ModBlocks.GOLD_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool amethyst_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        amethyst_blockpool.fence(ModBlocks.AMETHYST_BLOCK_FENCE);
        amethyst_blockpool.fenceGate(ModBlocks.AMETHYST_BLOCK_FENCE_GATE);
        amethyst_blockpool.wall(ModBlocks.AMETHYST_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool dead_tube_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_TUBE_CORAL_BLOCK);
        dead_tube_coral_blockpool.fence(ModBlocks.DEAD_TUBE_CORAL_BLOCK_FENCE);
        dead_tube_coral_blockpool.fenceGate(ModBlocks.DEAD_TUBE_CORAL_BLOCK_FENCE_GATE);
        dead_tube_coral_blockpool.wall(ModBlocks.DEAD_TUBE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool dead_brain_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_BRAIN_CORAL_BLOCK);
        dead_brain_coral_blockpool.fence(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_FENCE);
        dead_brain_coral_blockpool.fenceGate(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_FENCE_GATE);
        dead_brain_coral_blockpool.wall(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool dead_bubble_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_BUBBLE_CORAL_BLOCK);
        dead_bubble_coral_blockpool.fence(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_FENCE);
        dead_bubble_coral_blockpool.fenceGate(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_FENCE_GATE);
        dead_bubble_coral_blockpool.wall(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool dead_fire_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_FIRE_CORAL_BLOCK);
        dead_fire_coral_blockpool.fence(ModBlocks.DEAD_FIRE_CORAL_BLOCK_FENCE);
        dead_fire_coral_blockpool.fenceGate(ModBlocks.DEAD_FIRE_CORAL_BLOCK_FENCE_GATE);
        dead_fire_coral_blockpool.wall(ModBlocks.DEAD_FIRE_CORAL_BLOCK_WALL);

        BlockStateModelGenerator.BlockTexturePool dead_horn_coral_blockpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_HORN_CORAL_BLOCK);
        dead_horn_coral_blockpool.fence(ModBlocks.DEAD_HORN_CORAL_BLOCK_FENCE);
        dead_horn_coral_blockpool.fenceGate(ModBlocks.DEAD_HORN_CORAL_BLOCK_FENCE_GATE);
        dead_horn_coral_blockpool.wall(ModBlocks.DEAD_HORN_CORAL_BLOCK_WALL);











    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
