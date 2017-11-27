package atm.bloodworkxgaming.atm1tweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = PamsCookables.MODID, version = PamsCookables.VERSION)
public class PamsCookables
{
    public static final String MODID = "pamscookables";
    public static final String VERSION = "1.1";

    public static final Logger logger = LogManager.getLogger(MODID);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FurnaceRecipes.initRecipes();
    }
}
