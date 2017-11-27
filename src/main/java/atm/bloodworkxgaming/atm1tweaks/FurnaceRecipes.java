package atm.bloodworkxgaming.atm1tweaks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

/**
 * Created by jonas on 03.06.2017.
 */
public class FurnaceRecipes {

    @SuppressWarnings("ConstantConditions")
    static void initRecipes() {
        PamsCookables.logger.info("Registering new furnace recipes");
        if (Loader.isModLoaded("harvestcraft")) {

            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:doughitem")), new ItemStack(Items.BREAD), 1F);
            GameRegistry.addSmelting(new ItemStack(Items.BREAD), new ItemStack(Item.getByNameOrId("harvestcraft:toastitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Item.getByNameOrId("harvestcraft:roastedpumpkinseedsitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Blocks.BROWN_MUSHROOM), new ItemStack(Item.getByNameOrId("harvestcraft:grilledmushroomitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Blocks.RED_MUSHROOM), new ItemStack(Item.getByNameOrId("harvestcraft:grilledmushroomitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:whitemushroomitem")), new ItemStack(Item.getByNameOrId("harvestcraft:grilledmushroomitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:asparagusitem")), new ItemStack(Item.getByNameOrId("harvestcraft:grilledasparagusitem")), 1F);
            if (Loader.isModLoaded("actuallyadditions") && Item.getByNameOrId("actuallyadditions:itemFood") != null){
                GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("actuallyadditions:itemFood"), 1, 16), new ItemStack(Item.getByNameOrId("harvestcraft:ricecakeitem")), 1F);
            }
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:riceitem")), new ItemStack(Item.getByNameOrId("harvestcraft:ricecakeitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:cornitem")), new ItemStack(Item.getByNameOrId("harvestcraft:popcornitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:sweetpotatoitem")), new ItemStack(Item.getByNameOrId("harvestcraft:bakedsweetpotatoitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:eggplantitem")), new ItemStack(Item.getByNameOrId("harvestcraft:grilledeggplantitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:grapeitem")), new ItemStack(Item.getByNameOrId("harvestcraft:raisinsitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:coconutitem")), new ItemStack(Item.getByNameOrId("harvestcraft:toastedcoconutitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:vanillabeanitem")), new ItemStack(Item.getByNameOrId("harvestcraft:vanillaitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:vanillabeanitem")), new ItemStack(Item.getByNameOrId("harvestcraft:vanillaitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:chestnutitem")), new ItemStack(Item.getByNameOrId("harvestcraft:roastedchestnutitem")), 1F);
            GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("harvestcraft:sesameseedsitem")), new ItemStack(Item.getByNameOrId("harvestcraft:toastedsesameseedsitem")), 1F);
        }
    }
}


