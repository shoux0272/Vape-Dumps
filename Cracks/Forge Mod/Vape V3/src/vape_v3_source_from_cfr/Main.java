/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.NetworkManager
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
import io.netty.channel.ChannelHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import shitkid.PacketHandler;

public class Main {
    public static void start() {
        iReSqtkUVgFuiiReSqtkUVg localiReSqtkUVgFuiiReSqtkUVg = new iReSqtkUVgFuiiReSqtkUVg();
        localiReSqtkUVgFuiiReSqtkUVg.a();
        localiReSqtkUVgFuiiReSqtkUVg.b();
        localiReSqtkUVgFuiiReSqtkUVg.b(true);
    }

    public static void call(Object object) {
        NetworkManager networkManager;
        NetHandlerPlayClient netHandlerPlayClient;
        if (iReSqtkUVgFuiiReSqtkUVg.e == null) {
            return;
        }
        if (object instanceof TickEvent.ClientTickEvent && (netHandlerPlayClient = Minecraft.func_71410_x().func_147114_u()) != null && (networkManager = netHandlerPlayClient.func_147298_b()) != null && networkManager.channel().pipeline().get("nig") == null) {
            networkManager.channel().pipeline().addBefore("packet_handler", "nig", (ChannelHandler)new PacketHandler(networkManager));
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.f() != null && !iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            iReSqtkUVgFuiiReSqtkUVg.e.f().a(object);
        }
    }
}

