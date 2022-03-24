/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 */
package shitkid;

import a.a;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid="g0a9wehq2fu82q3f", acceptedMinecraftVersions="[1.8.9]")
public class Loader {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        a.start();
    }
}

