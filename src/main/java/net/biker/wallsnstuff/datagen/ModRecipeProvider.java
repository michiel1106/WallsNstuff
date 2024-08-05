package net.biker.wallsnstuff.datagen;

import net.biker.wallsnstuff.Wallsnstuff;
import net.biker.wallsnstuff.block.ModBlocks;
import net.biker.wallsnstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

            createFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, Ingredient.ofItems(Blocks.COBBLESTONE)).criterion("has_cobblestone", FabricRecipeProvider.conditionsFromItem(Blocks.COBBLESTONE)).offerTo(exporter);
            createFenceRecipe(ModBlocks.COBBLESTONE_FENCE, Ingredient.ofItems(Blocks.COBBLESTONE)).criterion("has_cobblestone", FabricRecipeProvider.conditionsFromItem(Blocks.COBBLESTONE)).offerTo(exporter);

            createFenceRecipe(ModBlocks.DIRT_FENCE, Ingredient.ofItems(Blocks.DIRT)).criterion("has_dirt", FabricRecipeProvider.conditionsFromItem(Blocks.DIRT)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DIRT_FENCE_GATE, Ingredient.ofItems(Blocks.DIRT)).criterion("has_dirt", FabricRecipeProvider.conditionsFromItem(Blocks.DIRT)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIRT_WALL, Blocks.DIRT);

            createFenceRecipe(ModBlocks.ICE_FENCE, Ingredient.ofItems(Blocks.ICE)).criterion("has_ice", FabricRecipeProvider.conditionsFromItem(Blocks.ICE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.ICE_FENCE_GATE, Ingredient.ofItems(Blocks.ICE)).criterion("has_ice", FabricRecipeProvider.conditionsFromItem(Blocks.ICE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ICE_WALL, Blocks.ICE);

            createFenceRecipe(ModBlocks.OAK_LOG_FENCE, Ingredient.ofItems(Blocks.OAK_LOG)).criterion("has_oak_log", FabricRecipeProvider.conditionsFromItem(Blocks.OAK_LOG)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.OAK_LOG_FENCE_GATE, Ingredient.ofItems(Blocks.OAK_LOG)).criterion("has_oak_log", FabricRecipeProvider.conditionsFromItem(Blocks.OAK_LOG)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.OAK_LOG_WALL, Blocks.OAK_LOG);

            createFenceRecipe(ModBlocks.COPPER_BLOCK_FENCE, Ingredient.ofItems(Blocks.COPPER_BLOCK)).criterion("has_copper_block", FabricRecipeProvider.conditionsFromItem(Blocks.COPPER_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.COPPER_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.COPPER_BLOCK)).criterion("has_copper_block", FabricRecipeProvider.conditionsFromItem(Blocks.COPPER_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.COPPER_BLOCK_WALL, Blocks.COPPER_BLOCK);

            createFenceRecipe(ModBlocks.EXPOSED_COPPER_FENCE, Ingredient.ofItems(Blocks.EXPOSED_COPPER)).criterion("has_exposed_copper", FabricRecipeProvider.conditionsFromItem(Blocks.EXPOSED_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.EXPOSED_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.EXPOSED_COPPER)).criterion("has_exposed_copper", FabricRecipeProvider.conditionsFromItem(Blocks.EXPOSED_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_WALL, Blocks.EXPOSED_COPPER);

            createFenceRecipe(ModBlocks.WEATHERED_COPPER_FENCE, Ingredient.ofItems(Blocks.WEATHERED_COPPER)).criterion("has_weathered_copper", FabricRecipeProvider.conditionsFromItem(Blocks.WEATHERED_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WEATHERED_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.WEATHERED_COPPER)).criterion("has_weathered_copper", FabricRecipeProvider.conditionsFromItem(Blocks.WEATHERED_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_WALL, Blocks.WEATHERED_COPPER);

            createFenceRecipe(ModBlocks.OXIDIZED_COPPER_FENCE, Ingredient.ofItems(Blocks.OXIDIZED_COPPER)).criterion("has_oxidized_copper", FabricRecipeProvider.conditionsFromItem(Blocks.OXIDIZED_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.OXIDIZED_COPPER)).criterion("has_oxidized_copper", FabricRecipeProvider.conditionsFromItem(Blocks.OXIDIZED_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_WALL, Blocks.OXIDIZED_COPPER);

            createFenceRecipe(ModBlocks.CUT_COPPER_FENCE, Ingredient.ofItems(Blocks.CUT_COPPER)).criterion("has_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.CUT_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CUT_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.CUT_COPPER)).criterion("has_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.CUT_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_WALL, Blocks.CUT_COPPER);

            createFenceRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE, Ingredient.ofItems(Blocks.EXPOSED_CUT_COPPER)).criterion("has_exposed_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.EXPOSED_CUT_COPPER)).criterion("has_exposed_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_WALL, Blocks.EXPOSED_CUT_COPPER);

            createFenceRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE, Ingredient.ofItems(Blocks.WEATHERED_CUT_COPPER)).criterion("has_weathered_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.WEATHERED_CUT_COPPER)).criterion("has_weathered_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_WALL, Blocks.WEATHERED_CUT_COPPER);

            createFenceRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, Ingredient.ofItems(Blocks.OXIDIZED_CUT_COPPER)).criterion("has_oxidized_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, Ingredient.ofItems(Blocks.OXIDIZED_CUT_COPPER)).criterion("has_oxidized_cut_copper", FabricRecipeProvider.conditionsFromItem(Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_WALL, Blocks.OXIDIZED_CUT_COPPER);

            createFenceRecipe(ModBlocks.WHITE_WOOL_FENCE, Ingredient.ofItems(Blocks.WHITE_WOOL)).criterion("has_white_wool", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WHITE_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.WHITE_WOOL)).criterion("has_white_wool", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);

            createFenceRecipe(ModBlocks.ORANGE_WOOL_FENCE, Ingredient.ofItems(Blocks.ORANGE_WOOL)).criterion("has_orange_wool", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.ORANGE_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.ORANGE_WOOL)).criterion("has_orange_wool", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);

            createFenceRecipe(ModBlocks.MAGENTA_WOOL_FENCE, Ingredient.ofItems(Blocks.MAGENTA_WOOL)).criterion("has_magenta_wool", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MAGENTA_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.MAGENTA_WOOL)).criterion("has_magenta_wool", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);

            createFenceRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE, Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL)).criterion("has_light_blue_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL)).criterion("has_light_blue_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);

            createFenceRecipe(ModBlocks.YELLOW_WOOL_FENCE, Ingredient.ofItems(Blocks.YELLOW_WOOL)).criterion("has_yellow_wool", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.YELLOW_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.YELLOW_WOOL)).criterion("has_yellow_wool", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);

            createFenceRecipe(ModBlocks.LIME_WOOL_FENCE, Ingredient.ofItems(Blocks.LIME_WOOL)).criterion("has_lime_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIME_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.LIME_WOOL)).criterion("has_lime_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_WALL, Blocks.LIME_WOOL);

            createFenceRecipe(ModBlocks.PINK_WOOL_FENCE, Ingredient.ofItems(Blocks.PINK_WOOL)).criterion("has_pink_wool", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PINK_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.PINK_WOOL)).criterion("has_pink_wool", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_WALL, Blocks.PINK_WOOL);

            createFenceRecipe(ModBlocks.GRAY_WOOL_FENCE, Ingredient.ofItems(Blocks.GRAY_WOOL)).criterion("has_gray_wool", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GRAY_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.GRAY_WOOL)).criterion("has_gray_wool", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);

            createFenceRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE, Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL)).criterion("has_light_gray_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL)).criterion("has_light_gray_wool", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);

            createFenceRecipe(ModBlocks.CYAN_WOOL_FENCE, Ingredient.ofItems(Blocks.CYAN_WOOL)).criterion("has_cyan_wool", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CYAN_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.CYAN_WOOL)).criterion("has_cyan_wool", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);

            createFenceRecipe(ModBlocks.PURPLE_WOOL_FENCE, Ingredient.ofItems(Blocks.PURPLE_WOOL)).criterion("has_purple_wool", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PURPLE_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.PURPLE_WOOL)).criterion("has_purple_wool", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);

            createFenceRecipe(ModBlocks.BLUE_WOOL_FENCE, Ingredient.ofItems(Blocks.BLUE_WOOL)).criterion("has_blue_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.BLUE_WOOL)).criterion("has_blue_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);

            createFenceRecipe(ModBlocks.BROWN_WOOL_FENCE, Ingredient.ofItems(Blocks.BROWN_WOOL)).criterion("has_brown_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BROWN_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.BROWN_WOOL)).criterion("has_brown_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);

            createFenceRecipe(ModBlocks.GREEN_WOOL_FENCE, Ingredient.ofItems(Blocks.GREEN_WOOL)).criterion("has_green_wool", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GREEN_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.GREEN_WOOL)).criterion("has_green_wool", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);

            createFenceRecipe(ModBlocks.RED_WOOL_FENCE, Ingredient.ofItems(Blocks.RED_WOOL)).criterion("has_red_wool", FabricRecipeProvider.conditionsFromItem(Blocks.RED_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.RED_WOOL)).criterion("has_red_wool", FabricRecipeProvider.conditionsFromItem(Blocks.RED_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_WALL, Blocks.RED_WOOL);

            createFenceRecipe(ModBlocks.BLACK_WOOL_FENCE, Ingredient.ofItems(Blocks.BLACK_WOOL)).criterion("has_black_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_WOOL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLACK_WOOL_FENCE_GATE, Ingredient.ofItems(Blocks.BLACK_WOOL)).criterion("has_black_wool", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_WOOL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);

            createFenceRecipe(ModBlocks.TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.TERRACOTTA)).criterion("has_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.TERRACOTTA)).criterion("has_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

            createFenceRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.WHITE_TERRACOTTA)).criterion("has_white_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.WHITE_TERRACOTTA)).criterion("has_white_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

            createFenceRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.ORANGE_TERRACOTTA)).criterion("has_orange_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.ORANGE_TERRACOTTA)).criterion("has_orange_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

            createFenceRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.MAGENTA_TERRACOTTA)).criterion("has_magenta_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.MAGENTA_TERRACOTTA)).criterion("has_magenta_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIGHT_BLUE_TERRACOTTA)).criterion("has_light_blue_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_BLUE_TERRACOTTA)).criterion("has_light_blue_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

            createFenceRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.YELLOW_TERRACOTTA)).criterion("has_yellow_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.YELLOW_TERRACOTTA)).criterion("has_yellow_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIME_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIME_TERRACOTTA)).criterion("has_lime_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIME_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIME_TERRACOTTA)).criterion("has_lime_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

            createFenceRecipe(ModBlocks.PINK_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.PINK_TERRACOTTA)).criterion("has_pink_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PINK_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.PINK_TERRACOTTA)).criterion("has_pink_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

            createFenceRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.GRAY_TERRACOTTA)).criterion("has_gray_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.GRAY_TERRACOTTA)).criterion("has_gray_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIGHT_GRAY_TERRACOTTA)).criterion("has_light_gray_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_GRAY_TERRACOTTA)).criterion("has_light_gray_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

            createFenceRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.CYAN_TERRACOTTA)).criterion("has_cyan_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.CYAN_TERRACOTTA)).criterion("has_cyan_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

            createFenceRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.PURPLE_TERRACOTTA)).criterion("has_purple_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.PURPLE_TERRACOTTA)).criterion("has_purple_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

            createFenceRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BLUE_TERRACOTTA)).criterion("has_blue_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BLUE_TERRACOTTA)).criterion("has_blue_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

            createFenceRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BROWN_TERRACOTTA)).criterion("has_brown_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BROWN_TERRACOTTA)).criterion("has_brown_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

            createFenceRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.GREEN_TERRACOTTA)).criterion("has_green_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.GREEN_TERRACOTTA)).criterion("has_green_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

            createFenceRecipe(ModBlocks.RED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.RED_TERRACOTTA)).criterion("has_red_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.RED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.RED_TERRACOTTA)).criterion("has_red_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.RED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

            createFenceRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BLACK_TERRACOTTA)).criterion("has_black_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BLACK_TERRACOTTA)).criterion("has_black_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

            createFenceRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.WHITE_GLAZED_TERRACOTTA)).criterion("has_white_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.WHITE_GLAZED_TERRACOTTA)).criterion("has_white_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.WHITE_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.ORANGE_GLAZED_TERRACOTTA)).criterion("has_orange_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.ORANGE_GLAZED_TERRACOTTA)).criterion("has_orange_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.ORANGE_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.MAGENTA_GLAZED_TERRACOTTA)).criterion("has_magenta_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.MAGENTA_GLAZED_TERRACOTTA)).criterion("has_magenta_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.MAGENTA_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).criterion("has_light_blue_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).criterion("has_light_blue_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.YELLOW_GLAZED_TERRACOTTA)).criterion("has_yellow_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.YELLOW_GLAZED_TERRACOTTA)).criterion("has_yellow_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.YELLOW_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIME_GLAZED_TERRACOTTA)).criterion("has_lime_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIME_GLAZED_TERRACOTTA)).criterion("has_lime_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.LIME_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.PINK_GLAZED_TERRACOTTA)).criterion("has_pink_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.PINK_GLAZED_TERRACOTTA)).criterion("has_pink_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.PINK_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.GRAY_GLAZED_TERRACOTTA)).criterion("has_gray_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.GRAY_GLAZED_TERRACOTTA)).criterion("has_gray_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GRAY_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).criterion("has_light_gray_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).criterion("has_light_gray_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.CYAN_GLAZED_TERRACOTTA)).criterion("has_cyan_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.CYAN_GLAZED_TERRACOTTA)).criterion("has_cyan_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.CYAN_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.PURPLE_GLAZED_TERRACOTTA)).criterion("has_purple_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.PURPLE_GLAZED_TERRACOTTA)).criterion("has_purple_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.PURPLE_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BLUE_GLAZED_TERRACOTTA)).criterion("has_blue_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BLUE_GLAZED_TERRACOTTA)).criterion("has_blue_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.BLUE_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BROWN_GLAZED_TERRACOTTA)).criterion("has_brown_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BROWN_GLAZED_TERRACOTTA)).criterion("has_brown_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.BROWN_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.GREEN_GLAZED_TERRACOTTA)).criterion("has_green_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.GREEN_GLAZED_TERRACOTTA)).criterion("has_green_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GREEN_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.RED_GLAZED_TERRACOTTA)).criterion("has_red_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.RED_GLAZED_TERRACOTTA)).criterion("has_red_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.RED_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE, Ingredient.ofItems(Blocks.BLACK_GLAZED_TERRACOTTA)).criterion("has_black_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE, Ingredient.ofItems(Blocks.BLACK_GLAZED_TERRACOTTA)).criterion("has_black_glazed_terracotta", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.BLACK_GLAZED_TERRACOTTA);

            createFenceRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS)).criterion("has_white_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS)).criterion("has_white_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_WALL, Blocks.WHITE_STAINED_GLASS);

            createFenceRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS)).criterion("has_orange_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS)).criterion("has_orange_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_WALL, Blocks.ORANGE_STAINED_GLASS);

            createFenceRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS)).criterion("has_magenta_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS)).criterion("has_magenta_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_WALL, Blocks.MAGENTA_STAINED_GLASS);

            createFenceRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS)).criterion("has_light_blue_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS)).criterion("has_light_blue_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, Blocks.LIGHT_BLUE_STAINED_GLASS);

            createFenceRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS)).criterion("has_yellow_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS)).criterion("has_yellow_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_WALL, Blocks.YELLOW_STAINED_GLASS);

            createFenceRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.LIME_STAINED_GLASS)).criterion("has_lime_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.LIME_STAINED_GLASS)).criterion("has_lime_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_WALL, Blocks.LIME_STAINED_GLASS);

            createFenceRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.PINK_STAINED_GLASS)).criterion("has_pink_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.PINK_STAINED_GLASS)).criterion("has_pink_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_WALL, Blocks.PINK_STAINED_GLASS);

            createFenceRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS)).criterion("has_gray_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS)).criterion("has_gray_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_WALL, Blocks.GRAY_STAINED_GLASS);

            createFenceRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS)).criterion("has_light_gray_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS)).criterion("has_light_gray_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, Blocks.LIGHT_GRAY_STAINED_GLASS);

            createFenceRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS)).criterion("has_cyan_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS)).criterion("has_cyan_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_WALL, Blocks.CYAN_STAINED_GLASS);

            createFenceRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS)).criterion("has_purple_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS)).criterion("has_purple_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_WALL, Blocks.PURPLE_STAINED_GLASS);

            createFenceRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS)).criterion("has_blue_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS)).criterion("has_blue_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_WALL, Blocks.BLUE_STAINED_GLASS);

            createFenceRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS)).criterion("has_brown_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS)).criterion("has_brown_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_WALL, Blocks.BROWN_STAINED_GLASS);

            createFenceRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS)).criterion("has_green_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS)).criterion("has_green_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_WALL, Blocks.GREEN_STAINED_GLASS);

            createFenceRecipe(ModBlocks.RED_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.RED_STAINED_GLASS)).criterion("has_red_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.RED_STAINED_GLASS)).criterion("has_red_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_WALL, Blocks.RED_STAINED_GLASS);

            createFenceRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE, Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS)).criterion("has_black_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE, Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS)).criterion("has_black_stained_glass", FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_WALL, Blocks.BLACK_STAINED_GLASS);

            createFenceRecipe(ModBlocks.GRAVEL_FENCE, Ingredient.ofItems(Blocks.GRAVEL)).criterion("has_gravel", FabricRecipeProvider.conditionsFromItem(Blocks.GRAVEL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GRAVEL_FENCE_GATE, Ingredient.ofItems(Blocks.GRAVEL)).criterion("has_gravel", FabricRecipeProvider.conditionsFromItem(Blocks.GRAVEL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_WALL, Blocks.GRAVEL);

            createFenceRecipe(ModBlocks.CLAY_FENCE, Ingredient.ofItems(Blocks.CLAY)).criterion("has_clay", FabricRecipeProvider.conditionsFromItem(Blocks.CLAY)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CLAY_FENCE_GATE, Ingredient.ofItems(Blocks.CLAY)).criterion("has_clay", FabricRecipeProvider.conditionsFromItem(Blocks.CLAY)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CLAY_WALL, Blocks.CLAY);

            createFenceRecipe(ModBlocks.SAND_FENCE, Ingredient.ofItems(Blocks.SAND)).criterion("has_sand", FabricRecipeProvider.conditionsFromItem(Blocks.SAND)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SAND_FENCE_GATE, Ingredient.ofItems(Blocks.SAND)).criterion("has_sand", FabricRecipeProvider.conditionsFromItem(Blocks.SAND)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SAND_WALL, Blocks.SAND);

            createFenceRecipe(ModBlocks.RED_SAND_FENCE, Ingredient.ofItems(Blocks.RED_SAND)).criterion("has_red_sand", FabricRecipeProvider.conditionsFromItem(Blocks.RED_SAND)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_SAND_FENCE_GATE, Ingredient.ofItems(Blocks.RED_SAND)).criterion("has_red_sand", FabricRecipeProvider.conditionsFromItem(Blocks.RED_SAND)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_WALL, Blocks.RED_SAND);

            createFenceRecipe(ModBlocks.PACKED_ICE_FENCE, Ingredient.ofItems(Blocks.PACKED_ICE)).criterion("has_packed_ice", FabricRecipeProvider.conditionsFromItem(Blocks.PACKED_ICE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PACKED_ICE_FENCE_GATE, Ingredient.ofItems(Blocks.PACKED_ICE)).criterion("has_packed_ice", FabricRecipeProvider.conditionsFromItem(Blocks.PACKED_ICE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_WALL, Blocks.PACKED_ICE);

            createFenceRecipe(ModBlocks.BLUE_ICE_FENCE, Ingredient.ofItems(Blocks.BLUE_ICE)).criterion("has_blue_ice", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_ICE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_ICE_FENCE_GATE, Ingredient.ofItems(Blocks.BLUE_ICE)).criterion("has_blue_ice", FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_ICE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_WALL, Blocks.BLUE_ICE);



            createFenceRecipe(ModBlocks.MOSS_BLOCK_FENCE, Ingredient.ofItems(Blocks.MOSS_BLOCK)).criterion("has_moss_block", FabricRecipeProvider.conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MOSS_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.MOSS_BLOCK)).criterion("has_moss_block", FabricRecipeProvider.conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSS_BLOCK_WALL, Blocks.MOSS_BLOCK);

            createFenceRecipe(ModBlocks.CALCITE_FENCE, Ingredient.ofItems(Blocks.CALCITE)).criterion("has_calcite", FabricRecipeProvider.conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CALCITE_FENCE_GATE, Ingredient.ofItems(Blocks.CALCITE)).criterion("has_calcite", FabricRecipeProvider.conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

            createFenceRecipe(ModBlocks.TUFF_FENCE, Ingredient.ofItems(Blocks.TUFF)).criterion("has_tuff", FabricRecipeProvider.conditionsFromItem(Blocks.TUFF)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.TUFF_FENCE_GATE, Ingredient.ofItems(Blocks.TUFF)).criterion("has_tuff", FabricRecipeProvider.conditionsFromItem(Blocks.TUFF)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.TUFF_WALL, Blocks.TUFF);

            createFenceRecipe(ModBlocks.DRIPSTONE_BLOCK_FENCE, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK)).criterion("has_dripstone_block", FabricRecipeProvider.conditionsFromItem(Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DRIPSTONE_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK)).criterion("has_dripstone_block", FabricRecipeProvider.conditionsFromItem(Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BLOCK_WALL, Blocks.DRIPSTONE_BLOCK);

            createFenceRecipe(ModBlocks.PRISMARINE_FENCE, Ingredient.ofItems(Blocks.PRISMARINE)).criterion("has_prismarine", FabricRecipeProvider.conditionsFromItem(Blocks.PRISMARINE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.PRISMARINE_FENCE_GATE, Ingredient.ofItems(Blocks.PRISMARINE)).criterion("has_prismarine", FabricRecipeProvider.conditionsFromItem(Blocks.PRISMARINE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_WALL, Blocks.PRISMARINE);



            createFenceRecipe(ModBlocks.OBSIDIAN_FENCE, Ingredient.ofItems(Blocks.OBSIDIAN)).criterion("has_obsidian", FabricRecipeProvider.conditionsFromItem(Blocks.OBSIDIAN)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.OBSIDIAN_FENCE_GATE, Ingredient.ofItems(Blocks.OBSIDIAN)).criterion("has_obsidian", FabricRecipeProvider.conditionsFromItem(Blocks.OBSIDIAN)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_WALL, Blocks.OBSIDIAN);

            createFenceRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE, Ingredient.ofItems(Blocks.CRYING_OBSIDIAN)).criterion("has_crying_obsidian", FabricRecipeProvider.conditionsFromItem(Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE, Ingredient.ofItems(Blocks.CRYING_OBSIDIAN)).criterion("has_crying_obsidian", FabricRecipeProvider.conditionsFromItem(Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_WALL, Blocks.CRYING_OBSIDIAN);

            createFenceRecipe(ModBlocks.NETHERRACK_FENCE, Ingredient.ofItems(Blocks.NETHERRACK)).criterion("has_netherrack", FabricRecipeProvider.conditionsFromItem(Blocks.NETHERRACK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.NETHERRACK_FENCE_GATE, Ingredient.ofItems(Blocks.NETHERRACK)).criterion("has_netherrack", FabricRecipeProvider.conditionsFromItem(Blocks.NETHERRACK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

            createFenceRecipe(ModBlocks.SOUL_SAND_FENCE, Ingredient.ofItems(Blocks.SOUL_SAND)).criterion("has_soul_sand", FabricRecipeProvider.conditionsFromItem(Blocks.SOUL_SAND)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SOUL_SAND_FENCE_GATE, Ingredient.ofItems(Blocks.SOUL_SAND)).criterion("has_soul_sand", FabricRecipeProvider.conditionsFromItem(Blocks.SOUL_SAND)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_WALL, Blocks.SOUL_SAND);

            createFenceRecipe(ModBlocks.SOUL_SOIL_FENCE, Ingredient.ofItems(Blocks.SOUL_SOIL)).criterion("has_soul_soil", FabricRecipeProvider.conditionsFromItem(Blocks.SOUL_SOIL)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SOUL_SOIL_FENCE_GATE, Ingredient.ofItems(Blocks.SOUL_SOIL)).criterion("has_soul_soil", FabricRecipeProvider.conditionsFromItem(Blocks.SOUL_SOIL)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_WALL, Blocks.SOUL_SOIL);



            createFenceRecipe(ModBlocks.SMOOTH_BASALT_FENCE, Ingredient.ofItems(Blocks.SMOOTH_BASALT)).criterion("has_smooth_basalt", FabricRecipeProvider.conditionsFromItem(Blocks.SMOOTH_BASALT)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SMOOTH_BASALT_FENCE_GATE, Ingredient.ofItems(Blocks.SMOOTH_BASALT)).criterion("has_smooth_basalt", FabricRecipeProvider.conditionsFromItem(Blocks.SMOOTH_BASALT)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

            createFenceRecipe(ModBlocks.END_STONE_FENCE, Ingredient.ofItems(Blocks.END_STONE)).criterion("has_end_stone", FabricRecipeProvider.conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.END_STONE_FENCE_GATE, Ingredient.ofItems(Blocks.END_STONE)).criterion("has_end_stone", FabricRecipeProvider.conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);




            createFenceRecipe(ModBlocks.MUSHROOM_STEM_FENCE, Ingredient.ofItems(Blocks.MUSHROOM_STEM)).criterion("has_mushroom_stem", FabricRecipeProvider.conditionsFromItem(Blocks.MUSHROOM_STEM)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.MUSHROOM_STEM_FENCE_GATE, Ingredient.ofItems(Blocks.MUSHROOM_STEM)).criterion("has_mushroom_stem", FabricRecipeProvider.conditionsFromItem(Blocks.MUSHROOM_STEM)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MUSHROOM_STEM_WALL, Blocks.MUSHROOM_STEM);

            createFenceRecipe(ModBlocks.CRIMSON_STEM_FENCE, Ingredient.ofItems(Blocks.CRIMSON_STEM)).criterion("has_crimson_stem", FabricRecipeProvider.conditionsFromItem(Blocks.CRIMSON_STEM)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.CRIMSON_STEM_FENCE_GATE, Ingredient.ofItems(Blocks.CRIMSON_STEM)).criterion("has_crimson_stem", FabricRecipeProvider.conditionsFromItem(Blocks.CRIMSON_STEM)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_STEM_WALL, Blocks.CRIMSON_STEM);

            createFenceRecipe(ModBlocks.WARPED_STEM_FENCE, Ingredient.ofItems(Blocks.WARPED_STEM)).criterion("has_warped_stem", FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_STEM)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WARPED_STEM_FENCE_GATE, Ingredient.ofItems(Blocks.WARPED_STEM)).criterion("has_warped_stem", FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_STEM)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WARPED_STEM_WALL, Blocks.WARPED_STEM);


            createFenceRecipe(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE, Ingredient.ofItems(Blocks.BROWN_MUSHROOM_BLOCK)).criterion("has_brown_mushroom_block", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.BROWN_MUSHROOM_BLOCK)).criterion("has_brown_mushroom_block", FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_MUSHROOM_BLOCK_WALL, Blocks.BROWN_MUSHROOM_BLOCK);

            createFenceRecipe(ModBlocks.RED_MUSHROOM_BLOCK_FENCE, Ingredient.ofItems(Blocks.RED_MUSHROOM_BLOCK)).criterion("has_red_mushroom_block", FabricRecipeProvider.conditionsFromItem(Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_MUSHROOM_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.RED_MUSHROOM_BLOCK)).criterion("has_red_mushroom_block", FabricRecipeProvider.conditionsFromItem(Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_MUSHROOM_BLOCK_WALL, Blocks.RED_MUSHROOM_BLOCK);

            createFenceRecipe(ModBlocks.NETHER_WART_BLOCK_FENCE, Ingredient.ofItems(Blocks.NETHER_WART_BLOCK)).criterion("has_nether_wart_block", FabricRecipeProvider.conditionsFromItem(Blocks.NETHER_WART_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.NETHER_WART_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.NETHER_WART_BLOCK)).criterion("has_nether_wart_block", FabricRecipeProvider.conditionsFromItem(Blocks.NETHER_WART_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHER_WART_BLOCK_WALL, Blocks.NETHER_WART_BLOCK);

            createFenceRecipe(ModBlocks.WARPED_WART_BLOCK_FENCE, Ingredient.ofItems(Blocks.WARPED_WART_BLOCK)).criterion("has_warped_wart_block", FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_WART_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WARPED_WART_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.WARPED_WART_BLOCK)).criterion("has_warped_wart_block", FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_WART_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WARPED_WART_BLOCK_WALL, Blocks.WARPED_WART_BLOCK);




            createFenceRecipe(ModBlocks.TUBE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.TUBE_CORAL_BLOCK)).criterion("has_tube_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.TUBE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.TUBE_CORAL_BLOCK)).criterion("has_tube_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.TUBE_CORAL_BLOCK_WALL, Blocks.TUBE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.BRAIN_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.BRAIN_CORAL_BLOCK)).criterion("has_brain_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BRAIN_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.BRAIN_CORAL_BLOCK)).criterion("has_brain_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BRAIN_CORAL_BLOCK_WALL, Blocks.BRAIN_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.BUBBLE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.BUBBLE_CORAL_BLOCK)).criterion("has_bubble_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BUBBLE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.BUBBLE_CORAL_BLOCK)).criterion("has_bubble_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BUBBLE_CORAL_BLOCK_WALL, Blocks.BUBBLE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.FIRE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.FIRE_CORAL_BLOCK)).criterion("has_fire_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.FIRE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.FIRE_CORAL_BLOCK)).criterion("has_fire_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.FIRE_CORAL_BLOCK_WALL, Blocks.FIRE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.HORN_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.HORN_CORAL_BLOCK)).criterion("has_horn_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.HORN_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.HORN_CORAL_BLOCK)).criterion("has_horn_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.HORN_CORAL_BLOCK_WALL, Blocks.HORN_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.SPONGE_FENCE, Ingredient.ofItems(Blocks.SPONGE)).criterion("has_sponge", FabricRecipeProvider.conditionsFromItem(Blocks.SPONGE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SPONGE_FENCE_GATE, Ingredient.ofItems(Blocks.SPONGE)).criterion("has_sponge", FabricRecipeProvider.conditionsFromItem(Blocks.SPONGE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SPONGE_WALL, Blocks.SPONGE);

            createFenceRecipe(ModBlocks.WET_SPONGE_FENCE, Ingredient.ofItems(Blocks.WET_SPONGE)).criterion("has_wet_sponge", FabricRecipeProvider.conditionsFromItem(Blocks.WET_SPONGE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.WET_SPONGE_FENCE_GATE, Ingredient.ofItems(Blocks.WET_SPONGE)).criterion("has_wet_sponge", FabricRecipeProvider.conditionsFromItem(Blocks.WET_SPONGE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WET_SPONGE_WALL, Blocks.WET_SPONGE);




            createFenceRecipe(ModBlocks.SLIME_BLOCK_FENCE, Ingredient.ofItems(Blocks.SLIME_BLOCK)).criterion("has_slime_block", FabricRecipeProvider.conditionsFromItem(Blocks.SLIME_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SLIME_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.SLIME_BLOCK)).criterion("has_slime_block", FabricRecipeProvider.conditionsFromItem(Blocks.SLIME_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SLIME_BLOCK_WALL, Blocks.SLIME_BLOCK);





            createFenceRecipe(ModBlocks.SCULK_FENCE, Ingredient.ofItems(Blocks.SCULK)).criterion("has_sculk", FabricRecipeProvider.conditionsFromItem(Blocks.SCULK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.SCULK_FENCE_GATE, Ingredient.ofItems(Blocks.SCULK)).criterion("has_sculk", FabricRecipeProvider.conditionsFromItem(Blocks.SCULK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SCULK_WALL, Blocks.SCULK);

            createFenceRecipe(ModBlocks.BEDROCK_FENCE, Ingredient.ofItems(Blocks.BEDROCK)).criterion("has_bedrock", FabricRecipeProvider.conditionsFromItem(Blocks.BEDROCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BEDROCK_FENCE_GATE, Ingredient.ofItems(Blocks.BEDROCK)).criterion("has_bedrock", FabricRecipeProvider.conditionsFromItem(Blocks.BEDROCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BEDROCK_WALL, Blocks.BEDROCK);

            createFenceRecipe(ModBlocks.GLOWSTONE_FENCE, Ingredient.ofItems(Blocks.GLOWSTONE)).criterion("has_glowstone", FabricRecipeProvider.conditionsFromItem(Blocks.GLOWSTONE)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GLOWSTONE_FENCE_GATE, Ingredient.ofItems(Blocks.GLOWSTONE)).criterion("has_glowstone", FabricRecipeProvider.conditionsFromItem(Blocks.GLOWSTONE)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GLOWSTONE_WALL, Blocks.GLOWSTONE);


            createFenceRecipe(ModBlocks.BAMBOO_PLANKS_FENCE, Ingredient.ofItems(Blocks.BAMBOO_PLANKS)).criterion("has_bamboo_planks", FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_PLANKS)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BAMBOO_PLANKS_FENCE_GATE, Ingredient.ofItems(Blocks.BAMBOO_PLANKS)).criterion("has_bamboo_planks", FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_PLANKS)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_PLANKS_WALL, Blocks.BAMBOO_PLANKS);

            createFenceRecipe(ModBlocks.BAMBOO_MOSAIC_FENCE, Ingredient.ofItems(Blocks.BAMBOO_MOSAIC)).criterion("has_bamboo_mosaic", FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_MOSAIC)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BAMBOO_MOSAIC_FENCE_GATE, Ingredient.ofItems(Blocks.BAMBOO_MOSAIC)).criterion("has_bamboo_mosaic", FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_MOSAIC)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_MOSAIC_WALL, Blocks.BAMBOO_MOSAIC);

            createFenceRecipe(ModBlocks.REDSTONE_BLOCK_FENCE, Ingredient.ofItems(Blocks.REDSTONE_BLOCK)).criterion("has_redstone_block", FabricRecipeProvider.conditionsFromItem(Blocks.REDSTONE_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.REDSTONE_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.REDSTONE_BLOCK)).criterion("has_redstone_block", FabricRecipeProvider.conditionsFromItem(Blocks.REDSTONE_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_BLOCK_WALL, Blocks.REDSTONE_BLOCK);

            createFenceRecipe(ModBlocks.EMERALD_BLOCK_FENCE, Ingredient.ofItems(Blocks.EMERALD_BLOCK)).criterion("has_emerald_block", FabricRecipeProvider.conditionsFromItem(Blocks.EMERALD_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.EMERALD_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.EMERALD_BLOCK)).criterion("has_emerald_block", FabricRecipeProvider.conditionsFromItem(Blocks.EMERALD_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.EMERALD_BLOCK_WALL, Blocks.EMERALD_BLOCK);

            createFenceRecipe(ModBlocks.DIAMOND_BLOCK_FENCE, Ingredient.ofItems(Blocks.DIAMOND_BLOCK)).criterion("has_diamond_block", FabricRecipeProvider.conditionsFromItem(Blocks.DIAMOND_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DIAMOND_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DIAMOND_BLOCK)).criterion("has_diamond_block", FabricRecipeProvider.conditionsFromItem(Blocks.DIAMOND_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_BLOCK_WALL, Blocks.DIAMOND_BLOCK);

            createFenceRecipe(ModBlocks.NETHERITE_BLOCK_FENCE, Ingredient.ofItems(Blocks.NETHERITE_BLOCK)).criterion("has_netherite_block", FabricRecipeProvider.conditionsFromItem(Blocks.NETHERITE_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.NETHERITE_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.NETHERITE_BLOCK)).criterion("has_netherite_block", FabricRecipeProvider.conditionsFromItem(Blocks.NETHERITE_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_BLOCK_WALL, Blocks.NETHERITE_BLOCK);

            createFenceRecipe(ModBlocks.LAPIS_BLOCK_FENCE, Ingredient.ofItems(Blocks.LAPIS_BLOCK)).criterion("has_lapis_block", FabricRecipeProvider.conditionsFromItem(Blocks.LAPIS_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.LAPIS_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.LAPIS_BLOCK)).criterion("has_lapis_block", FabricRecipeProvider.conditionsFromItem(Blocks.LAPIS_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LAPIS_BLOCK_WALL, Blocks.LAPIS_BLOCK);

            createFenceRecipe(ModBlocks.GOLD_BLOCK_FENCE, Ingredient.ofItems(Blocks.GOLD_BLOCK)).criterion("has_gold_block", FabricRecipeProvider.conditionsFromItem(Blocks.GOLD_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.GOLD_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.GOLD_BLOCK)).criterion("has_gold_block", FabricRecipeProvider.conditionsFromItem(Blocks.GOLD_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GOLD_BLOCK_WALL, Blocks.GOLD_BLOCK);



            createFenceRecipe(ModBlocks.AMETHYST_BLOCK_FENCE, Ingredient.ofItems(Blocks.AMETHYST_BLOCK)).criterion("has_amethyst_block", FabricRecipeProvider.conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.AMETHYST_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.AMETHYST_BLOCK)).criterion("has_amethyst_block", FabricRecipeProvider.conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_BLOCK_WALL, Blocks.AMETHYST_BLOCK);

            createFenceRecipe(ModBlocks.DEAD_TUBE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.DEAD_TUBE_CORAL_BLOCK)).criterion("has_dead_tube_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DEAD_TUBE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DEAD_TUBE_CORAL_BLOCK)).criterion("has_dead_tube_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEAD_TUBE_CORAL_BLOCK_WALL, Blocks.DEAD_TUBE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.DEAD_BRAIN_CORAL_BLOCK)).criterion("has_dead_brain_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DEAD_BRAIN_CORAL_BLOCK)).criterion("has_dead_brain_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEAD_BRAIN_CORAL_BLOCK_WALL, Blocks.DEAD_BRAIN_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.DEAD_BUBBLE_CORAL_BLOCK)).criterion("has_dead_bubble_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DEAD_BUBBLE_CORAL_BLOCK)).criterion("has_dead_bubble_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_WALL, Blocks.DEAD_BUBBLE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.DEAD_FIRE_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.DEAD_FIRE_CORAL_BLOCK)).criterion("has_dead_fire_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DEAD_FIRE_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DEAD_FIRE_CORAL_BLOCK)).criterion("has_dead_fire_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEAD_FIRE_CORAL_BLOCK_WALL, Blocks.DEAD_FIRE_CORAL_BLOCK);

            createFenceRecipe(ModBlocks.DEAD_HORN_CORAL_BLOCK_FENCE, Ingredient.ofItems(Blocks.DEAD_HORN_CORAL_BLOCK)).criterion("has_dead_horn_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);
            createFenceGateRecipe(ModBlocks.DEAD_HORN_CORAL_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.DEAD_HORN_CORAL_BLOCK)).criterion("has_dead_horn_coral_block", FabricRecipeProvider.conditionsFromItem(Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEAD_HORN_CORAL_BLOCK_WALL, Blocks.DEAD_HORN_CORAL_BLOCK);
















    }
}
