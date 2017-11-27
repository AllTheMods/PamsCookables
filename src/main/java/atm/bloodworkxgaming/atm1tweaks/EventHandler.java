package atm.bloodworkxgaming.atm1tweaks;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.RegistryManager;

import java.util.*;

@Mod.EventBusSubscriber
public class EventHandler {

    private static List<String> removingRecipes = new ArrayList<>();
    static {
        Collections.addAll(removingRecipes,
                "harvestcraft:minecraft_bread",
                "harvestcraft:toastitem",
                "harvestcraft:roastedpumpkinseedsitem",
                "harvestcraft:grilledmushroomitem",
                "harvestcraft:grilledmushroomitem_alt_alt",
                "harvestcraft:minecraft_bakedpotato",
                "harvestcraft:grilledasparagusitem",
                "harvestcraft:ricecakeitem",
                "harvestcraft:popcornitem",
                "harvestcraft:bakedsweetpotatoitem",
                "harvestcraft:grilledeggplantitem",
                "harvestcraft:raisinsitem",
                "harvestcraft:toastedcoconutitem",
                "harvestcraft:vanillaitem",
                "harvestcraft:roastedchestnutitem",
                "harvestcraft:toastedsesameseedsitem"
        );
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event){
        removingRecipes.forEach(recipe -> RegistryManager.ACTIVE.getRegistry(GameData.RECIPES).remove(new ResourceLocation(recipe)));
    }
}
