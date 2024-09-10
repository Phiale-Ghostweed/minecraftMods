package net.phialeghostweed.littlebottlerpg.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModBlocks;
import net.phialeghostweed.littlebottlerpg.registry.LbrpgModItems;

import java.util.concurrent.CompletableFuture;

public class LbrpgModRecipeProvider extends RecipeProvider {
    public LbrpgModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        nineBlockStorageRecipes(pRecipeOutput,
                RecipeCategory.MISC,
                LbrpgModItems.SILVER_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS,
                LbrpgModBlocks.Blocks.SILVER_BLOCK.get());
    }

     protected static void nineBlockStorageRecipes(
             RecipeOutput pRecipeOutput,
             RecipeCategory pUnpackedCategory,
             ItemLike pUnpacked,
             RecipeCategory pPackedCategory,
             ItemLike pPacked
    ) {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
                .requires(pPacked)
                .unlockedBy(getHasName(pPacked), has(pPacked))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked)
                .define('#', pUnpacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked))
                .save(pRecipeOutput);
    }
}
