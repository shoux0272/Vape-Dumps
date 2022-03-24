/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.C03PacketPlayer
 *  net.minecraft.network.play.client.C17PacketCustomPayload
 */
package shitkid;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C17PacketCustomPayload;

public class PacketHandler
extends ChannelDuplexHandler {
    private final NetworkManager networkManager;
    private final CRC32 crc = new CRC32();
    private Field playerPitchField;
    private float lastPitch;
    private float lastYaw;

    public PacketHandler(NetworkManager networkManager) {
        this.networkManager = networkManager;
        try {
            this.playerPitchField = C03PacketPlayer.class.getDeclaredField("field_149473_f");
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static float getDistanceBetweenAngles(float angle1, float angle2) {
        float d2 = Math.abs(angle1 - angle2) % 360.0f;
        if (d2 > 180.0f) {
            d2 = 360.0f - d2;
        }
        return d2;
    }

    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        if (msg instanceof C03PacketPlayer) {
            float newPitch;
            C03PacketPlayer packet = (C03PacketPlayer)msg;
            float yaw = packet.func_149462_g();
            float pitch = packet.func_149470_h();
            float diffPitch = pitch - this.lastPitch;
            if (diffPitch > 0.0f && diffPitch < 0.0094f) {
                diffPitch = 0.010213457f;
            } else if (diffPitch < 0.0f && diffPitch > -0.0094f) {
                diffPitch = -0.010213457f;
            }
            float diffYaw = Minecraft.func_71410_x().field_71439_g.field_70177_z - this.lastYaw;
            float distPitch = PacketHandler.getDistanceBetweenAngles(pitch, this.lastPitch);
            float distYaw = PacketHandler.getDistanceBetweenAngles(yaw, this.lastYaw);
            float diffDistYawPitch = Math.abs(distYaw - distPitch);
            if (diffDistYawPitch < 0.0094f) {
                if (diffYaw < 0.0f) {
                    diffPitch = diffYaw - 0.010213457f;
                } else if (diffYaw > 0.0f) {
                    diffPitch = diffYaw + 0.010213457f;
                }
            }
            if ((newPitch = this.lastPitch + diffPitch) > 90.0f) {
                newPitch = 90.0f;
            } else if (newPitch < -90.0f) {
                newPitch = -90.0f;
            }
            try {
                this.playerPitchField.setAccessible(true);
                this.playerPitchField.set((Object)packet, Float.valueOf(newPitch));
                this.playerPitchField.setAccessible(false);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.lastYaw = yaw;
            this.lastPitch = pitch;
        }
        super.write(ctx, msg, promise);
    }

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        this.crc.update(msg.getClass().getName().getBytes(StandardCharsets.UTF_8));
        if (this.crc.getValue() == 1037699583L) {
            for (Method method : msg.getClass().getDeclaredMethods()) {
                if (method.getReturnType() != String.class) continue;
                this.crc.update(((String)method.invoke(msg, new Object[0])).getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (this.crc.getValue() == 1946203560L) {
                try {
                    this.networkManager.func_179290_a((Packet)new C17PacketCustomPayload(String.valueOf(this.crc.getValue()), new PacketBuffer(Unpooled.EMPTY_BUFFER)));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.crc.reset();
        super.channelRead(ctx, msg);
    }
}

