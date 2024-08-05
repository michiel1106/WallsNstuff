package net.biker.wallsnstuff.block;

import net.biker.wallsnstuff.Wallsnstuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE_GATE).sounds(BlockSoundGroup.GRAVEL), WoodType.BIRCH));
    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block DIRT_FENCE_GATE = registerBlock("dirt_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.5f).sounds(BlockSoundGroup.GRAVEL), WoodType.BIRCH));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.5f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DIRT_WALL = registerBlock("dirt_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.5f).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block ICE_FENCE_GATE = registerBlock("ice_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5f).sounds(BlockSoundGroup.GLASS), WoodType.BIRCH));
    public static final Block ICE_FENCE = registerBlock("ice_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5f).sounds(BlockSoundGroup.GLASS)));
    public static final Block ICE_WALL = registerBlock("ice_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5f).sounds(BlockSoundGroup.GLASS)));

    public static final Block OAK_LOG_WALL = registerBlock("oak_log_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LOG_FENCE = registerBlock("oak_log_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f).sounds(BlockSoundGroup.WOOD), WoodType.OAK));

    public static final Block COPPER_BLOCK_WALL = registerBlock("copper_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block COPPER_BLOCK_FENCE = registerBlock("copper_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block COPPER_BLOCK_FENCE_GATE = registerBlock("copper_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block EXPOSED_COPPER_WALL = registerBlock("exposed_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EXPOSED_COPPER_FENCE = registerBlock("exposed_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EXPOSED_COPPER_FENCE_GATE = registerBlock("exposed_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WEATHERED_COPPER_WALL = registerBlock("weathered_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WEATHERED_COPPER_FENCE = registerBlock("weathered_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WEATHERED_COPPER_FENCE_GATE = registerBlock("weathered_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block OXIDIZED_COPPER_WALL = registerBlock("oxidized_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OXIDIZED_COPPER_FENCE = registerBlock("oxidized_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OXIDIZED_COPPER_FENCE_GATE = registerBlock("oxidized_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CUT_COPPER_WALL = registerBlock("cut_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CUT_COPPER_FENCE = registerBlock("cut_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CUT_COPPER_FENCE_GATE = registerBlock("cut_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block EXPOSED_CUT_COPPER_WALL = registerBlock("exposed_cut_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EXPOSED_CUT_COPPER_FENCE = registerBlock("exposed_cut_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EXPOSED_CUT_COPPER_FENCE_GATE = registerBlock("exposed_cut_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WEATHERED_CUT_COPPER_WALL = registerBlock("weathered_cut_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WEATHERED_CUT_COPPER_FENCE = registerBlock("weathered_cut_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WEATHERED_CUT_COPPER_FENCE_GATE = registerBlock("weathered_cut_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block OXIDIZED_CUT_COPPER_WALL = registerBlock("oxidized_cut_copper_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OXIDIZED_CUT_COPPER_FENCE = registerBlock("oxidized_cut_copper_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OXIDIZED_CUT_COPPER_FENCE_GATE = registerBlock("oxidized_cut_copper_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_WOOL_FENCE_GATE = registerBlock("white_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_WOOL_FENCE_GATE = registerBlock("orange_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_WOOL_FENCE_GATE = registerBlock("magenta_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_WOOL_FENCE_GATE = registerBlock("light_blue_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_WOOL_FENCE_GATE = registerBlock("yellow_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_WOOL_FENCE = registerBlock("lime_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_WOOL_FENCE_GATE = registerBlock("lime_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_WOOL_FENCE_GATE = registerBlock("pink_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_WOOL_FENCE = registerBlock("gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_WOOL_FENCE_GATE = registerBlock("gray_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_WOOL_FENCE_GATE = registerBlock("light_gray_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_WOOL_FENCE_GATE = registerBlock("cyan_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_WOOL_FENCE_GATE = registerBlock("purple_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_WOOL_FENCE = registerBlock("blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_WOOL_FENCE_GATE = registerBlock("blue_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_WOOL_FENCE_GATE = registerBlock("brown_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_WOOL_FENCE_GATE = registerBlock("green_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_WOOL_FENCE_GATE = registerBlock("red_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_WOOL_FENCE_GATE = registerBlock("black_wool_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TERRACOTTA_FENCE = registerBlock("terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TERRACOTTA_FENCE_GATE = registerBlock("terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_TERRACOTTA_FENCE_GATE = registerBlock("white_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_TERRACOTTA_FENCE_GATE = registerBlock("orange_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_TERRACOTTA_FENCE_GATE = registerBlock("magenta_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_TERRACOTTA_FENCE_GATE = registerBlock("yellow_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_TERRACOTTA_FENCE_GATE = registerBlock("lime_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_TERRACOTTA_FENCE_GATE = registerBlock("pink_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_TERRACOTTA_FENCE_GATE = registerBlock("gray_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_TERRACOTTA_FENCE_GATE = registerBlock("cyan_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_TERRACOTTA_FENCE_GATE = registerBlock("purple_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_TERRACOTTA_FENCE_GATE = registerBlock("blue_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_TERRACOTTA_FENCE_GATE = registerBlock("brown_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_TERRACOTTA_FENCE_GATE = registerBlock("green_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_TERRACOTTA_FENCE_GATE = registerBlock("red_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_TERRACOTTA_FENCE_GATE = registerBlock("black_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE = registerBlock("white_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("white_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE = registerBlock("orange_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("orange_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE = registerBlock("magenta_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("magenta_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("light_blue_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE = registerBlock("yellow_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("yellow_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE = registerBlock("lime_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIME_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("lime_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIME_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE = registerBlock("pink_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PINK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("pink_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PINK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("gray_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("gray_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("light_gray_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE = registerBlock("cyan_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CYAN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("cyan_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CYAN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE = registerBlock("purple_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("purple_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("blue_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("blue_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLUE_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE = registerBlock("brown_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BROWN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("brown_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BROWN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE = registerBlock("green_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GREEN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("green_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GREEN_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE = registerBlock("red_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("red_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE = registerBlock("black_glazed_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLACK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("black_glazed_terracotta_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLACK_GLAZED_TERRACOTTA).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GRAVEL_WALL = registerBlock("gravel_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAVEL_FENCE = registerBlock("gravel_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAVEL_FENCE_GATE = registerBlock("gravel_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CLAY_WALL = registerBlock("clay_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CLAY).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CLAY_FENCE = registerBlock("clay_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CLAY).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CLAY_FENCE_GATE = registerBlock("clay_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CLAY).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block SAND_WALL = registerBlock("sand_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SAND_FENCE = registerBlock("sand_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SAND_FENCE_GATE = registerBlock("sand_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SAND).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_SAND_WALL = registerBlock("red_sand_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_SAND_FENCE = registerBlock("red_sand_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_SAND_FENCE_GATE = registerBlock("red_sand_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PACKED_ICE_FENCE = registerBlock("packed_ice_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PACKED_ICE_FENCE_GATE = registerBlock("packed_ice_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_ICE_FENCE = registerBlock("blue_ice_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_ICE_FENCE_GATE = registerBlock("blue_ice_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));


    public static final Block MOSS_BLOCK_WALL = registerBlock("moss_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MOSS_BLOCK_FENCE = registerBlock("moss_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MOSS_BLOCK_FENCE_GATE = registerBlock("moss_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CALCITE_FENCE = registerBlock("calcite_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CALCITE_FENCE_GATE = registerBlock("calcite_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block TUFF_WALL = registerBlock("tuff_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TUFF_FENCE = registerBlock("tuff_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TUFF_FENCE_GATE = registerBlock("tuff_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DRIPSTONE_BLOCK_WALL = registerBlock("dripstone_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DRIPSTONE_BLOCK_FENCE = registerBlock("dripstone_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DRIPSTONE_BLOCK_FENCE_GATE = registerBlock("dripstone_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block PRISMARINE_WALL = registerBlock("prismarine_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PRISMARINE_FENCE = registerBlock("prismarine_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block PRISMARINE_FENCE_GATE = registerBlock("prismarine_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OBSIDIAN_FENCE = registerBlock("obsidian_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block OBSIDIAN_FENCE_GATE = registerBlock("obsidian_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRYING_OBSIDIAN_FENCE = registerBlock("crying_obsidian_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRYING_OBSIDIAN_FENCE_GATE = registerBlock("crying_obsidian_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHERRACK_FENCE = registerBlock("netherrack_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHERRACK_FENCE_GATE = registerBlock("netherrack_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block SOUL_SAND_WALL = registerBlock("soul_sand_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SOUL_SAND_FENCE = registerBlock("soul_sand_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SOUL_SAND_FENCE_GATE = registerBlock("soul_sand_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block SOUL_SOIL_WALL = registerBlock("soul_soil_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SOUL_SOIL_FENCE = registerBlock("soul_soil_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SOUL_SOIL_FENCE_GATE = registerBlock("soul_soil_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block END_STONE_FENCE = registerBlock("end_stone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block MUSHROOM_STEM_WALL = registerBlock("mushroom_stem_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MUSHROOM_STEM_FENCE = registerBlock("mushroom_stem_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MUSHROOM_STEM_FENCE_GATE = registerBlock("mushroom_stem_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block CRIMSON_STEM_WALL = registerBlock("crimson_stem_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_STEM_FENCE_GATE = registerBlock("crimson_stem_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WARPED_STEM_WALL = registerBlock("warped_stem_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_STEM_FENCE = registerBlock("warped_stem_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_STEM_FENCE_GATE = registerBlock("warped_stem_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BROWN_MUSHROOM_BLOCK_WALL = registerBlock("brown_mushroom_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_MUSHROOM_BLOCK_FENCE = registerBlock("brown_mushroom_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_MUSHROOM_BLOCK_FENCE_GATE = registerBlock("brown_mushroom_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block RED_MUSHROOM_BLOCK_WALL = registerBlock("red_mushroom_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_MUSHROOM_BLOCK_FENCE = registerBlock("red_mushroom_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_MUSHROOM_BLOCK_FENCE_GATE = registerBlock("red_mushroom_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block NETHER_WART_BLOCK_WALL = registerBlock("nether_wart_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHER_WART_BLOCK_FENCE = registerBlock("nether_wart_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHER_WART_BLOCK_FENCE_GATE = registerBlock("nether_wart_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WARPED_WART_BLOCK_WALL = registerBlock("warped_wart_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_WART_BLOCK_FENCE = registerBlock("warped_wart_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_WART_BLOCK_FENCE_GATE = registerBlock("warped_wart_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));




    public static final Block TUBE_CORAL_BLOCK_WALL = registerBlock("tube_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TUBE_CORAL_BLOCK_FENCE = registerBlock("tube_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block TUBE_CORAL_BLOCK_FENCE_GATE = registerBlock("tube_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BRAIN_CORAL_BLOCK_WALL = registerBlock("brain_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BRAIN_CORAL_BLOCK_FENCE = registerBlock("brain_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BRAIN_CORAL_BLOCK_FENCE_GATE = registerBlock("brain_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BUBBLE_CORAL_BLOCK_WALL = registerBlock("bubble_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BUBBLE_CORAL_BLOCK_FENCE = registerBlock("bubble_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BUBBLE_CORAL_BLOCK_FENCE_GATE = registerBlock("bubble_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block FIRE_CORAL_BLOCK_WALL = registerBlock("fire_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block FIRE_CORAL_BLOCK_FENCE = registerBlock("fire_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block FIRE_CORAL_BLOCK_FENCE_GATE = registerBlock("fire_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block HORN_CORAL_BLOCK_WALL = registerBlock("horn_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block HORN_CORAL_BLOCK_FENCE = registerBlock("horn_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block HORN_CORAL_BLOCK_FENCE_GATE = registerBlock("horn_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block SPONGE_WALL = registerBlock("sponge_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPONGE_FENCE = registerBlock("sponge_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPONGE_FENCE_GATE = registerBlock("sponge_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block WET_SPONGE_WALL = registerBlock("wet_sponge_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.WET_SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WET_SPONGE_FENCE = registerBlock("wet_sponge_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WET_SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WET_SPONGE_FENCE_GATE = registerBlock("wet_sponge_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WET_SPONGE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));


    public static final Block SLIME_BLOCK_WALL = registerBlock("slime_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SLIME_BLOCK_FENCE = registerBlock("slime_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SLIME_BLOCK_FENCE_GATE = registerBlock("slime_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));



    public static final Block SCULK_WALL = registerBlock("sculk_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SCULK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SCULK_FENCE = registerBlock("sculk_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.SCULK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block SCULK_FENCE_GATE = registerBlock("sculk_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SCULK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BEDROCK_FENCE = registerBlock("bedrock_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BEDROCK_FENCE_GATE = registerBlock("bedrock_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GLOWSTONE_WALL = registerBlock("glowstone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GLOWSTONE_FENCE = registerBlock("glowstone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GLOWSTONE_FENCE_GATE = registerBlock("glowstone_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BAMBOO_PLANKS_WALL = registerBlock("bamboo_planks_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BAMBOO_PLANKS_FENCE = registerBlock("bamboo_planks_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BAMBOO_PLANKS_FENCE_GATE = registerBlock("bamboo_planks_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block BAMBOO_MOSAIC_WALL = registerBlock("bamboo_mosaic_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_MOSAIC).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BAMBOO_MOSAIC_FENCE = registerBlock("bamboo_mosaic_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_MOSAIC).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BAMBOO_MOSAIC_FENCE_GATE = registerBlock("bamboo_mosaic_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_MOSAIC).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block REDSTONE_BLOCK_WALL = registerBlock("redstone_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block REDSTONE_BLOCK_FENCE = registerBlock("redstone_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block REDSTONE_BLOCK_FENCE_GATE = registerBlock("redstone_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block EMERALD_BLOCK_WALL = registerBlock("emerald_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EMERALD_BLOCK_FENCE = registerBlock("emerald_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block EMERALD_BLOCK_FENCE_GATE = registerBlock("emerald_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DIAMOND_BLOCK_WALL = registerBlock("diamond_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DIAMOND_BLOCK_FENCE = registerBlock("diamond_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DIAMOND_BLOCK_FENCE_GATE = registerBlock("diamond_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block NETHERITE_BLOCK_WALL = registerBlock("netherite_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHERITE_BLOCK_FENCE = registerBlock("netherite_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block NETHERITE_BLOCK_FENCE_GATE = registerBlock("netherite_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block LAPIS_BLOCK_WALL = registerBlock("lapis_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LAPIS_BLOCK_FENCE = registerBlock("lapis_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block LAPIS_BLOCK_FENCE_GATE = registerBlock("lapis_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block GOLD_BLOCK_WALL = registerBlock("gold_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLD_BLOCK_FENCE = registerBlock("gold_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLD_BLOCK_FENCE_GATE = registerBlock("gold_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block AMETHYST_BLOCK_WALL = registerBlock("amethyst_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block AMETHYST_BLOCK_FENCE = registerBlock("amethyst_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block AMETHYST_BLOCK_FENCE_GATE = registerBlock("amethyst_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DEAD_TUBE_CORAL_BLOCK_WALL = registerBlock("dead_tube_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEAD_TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_TUBE_CORAL_BLOCK_FENCE = registerBlock("dead_tube_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DEAD_TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_TUBE_CORAL_BLOCK_FENCE_GATE = registerBlock("dead_tube_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DEAD_TUBE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DEAD_BRAIN_CORAL_BLOCK_WALL = registerBlock("dead_brain_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_BRAIN_CORAL_BLOCK_FENCE = registerBlock("dead_brain_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_BRAIN_CORAL_BLOCK_FENCE_GATE = registerBlock("dead_brain_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DEAD_BUBBLE_CORAL_BLOCK_WALL = registerBlock("dead_bubble_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_BUBBLE_CORAL_BLOCK_FENCE = registerBlock("dead_bubble_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_BUBBLE_CORAL_BLOCK_FENCE_GATE = registerBlock("dead_bubble_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUBBLE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DEAD_FIRE_CORAL_BLOCK_WALL = registerBlock("dead_fire_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEAD_FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_FIRE_CORAL_BLOCK_FENCE = registerBlock("dead_fire_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DEAD_FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_FIRE_CORAL_BLOCK_FENCE_GATE = registerBlock("dead_fire_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DEAD_FIRE_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));

    public static final Block DEAD_HORN_CORAL_BLOCK_WALL = registerBlock("dead_horn_coral_block_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEAD_HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_HORN_CORAL_BLOCK_FENCE = registerBlock("dead_horn_coral_block_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.DEAD_HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD)));
    public static final Block DEAD_HORN_CORAL_BLOCK_FENCE_GATE = registerBlock("dead_horn_coral_block_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DEAD_HORN_CORAL_BLOCK).strength(1f).sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Wallsnstuff.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Wallsnstuff.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Wallsnstuff.LOGGER.info("logging the registering for modblocks for wallnstuff");

    }
}
