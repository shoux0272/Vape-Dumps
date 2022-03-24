/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.objectweb.asm.Type
 */
package a;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import org.apache.commons.io.IOUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.objectweb.asm.Type;
import shitkid.Util;

public class a {
    public static void start() {
        new Thread(() -> {
            try {
                Class.forName("Main").getDeclaredMethod("start", new Class[0]).invoke(null, new Object[0]);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public static void mo(float paramFloat) {
        throw new UnsupportedOperationException();
    }

    public static void opr(Object paramObject1, Object paramObject2) {
        throw new UnsupportedOperationException();
    }

    public static void ops(Object paramObject1, Object paramObject2, Object[] paramArrayOfObject) {
        throw new UnsupportedOperationException();
    }

    public static void ss(Object paramObject, boolean paramBoolean) {
        throw new UnsupportedOperationException();
    }

    public static void aa(Object paramObject1, Object paramObject2, Object paramObject3) {
        throw new UnsupportedOperationException();
    }

    public static void em(Object paramObject, double paramDouble1, double paramDouble2, double paramDouble3) {
        throw new UnsupportedOperationException();
    }

    public static void om(Object paramObject) {
        throw new UnsupportedOperationException();
    }

    public static void exit(boolean paramBoolean) {
        throw new UnsupportedOperationException();
    }

    public static void dc() {
    }

    public static void fs() {
    }

    public static Class gc(String name) throws ClassNotFoundException {
        return Class.forName(name.replace('/', '.'));
    }

    public static Object gf(Class paramClass, String paramString) {
        throw new UnsupportedOperationException();
    }

    public static Object gm(Class paramClass, String paramString, Class[] paramArrayOfClass) {
        throw new UnsupportedOperationException();
    }

    public static void rg(Class paramClass, Object paramObject, int paramInt, Map paramMap) {
        throw new UnsupportedOperationException();
    }

    public static byte[] gfb() {
        throw new UnsupportedOperationException();
    }

    public static byte[] gt(String string) throws IOException {
        URL resource = Util.getResource("hydro src/" + string);
        if (resource == null) {
            resource = Util.getResource("hydro src/coder");
        }
        byte[] b2 = IOUtils.toByteArray((URL)resource);
        for (int i = 0; i < b2.length; ++i) {
            int n = i;
            b2[n] = (byte)(b2[n] ^ "zuiy".charAt(i % 4));
        }
        return b2;
    }

    public static int gk() {
        return 0;
    }

    public static String gs() {
        return "{}";
    }

    public static void ss(String string) {
    }

    public static void del(String[] paramArrayOfString) {
        throw new UnsupportedOperationException();
    }

    public static void rgi() {
        throw new UnsupportedOperationException();
    }

    public static boolean ib() {
        return false;
    }

    public static void sb() {
        EntityPlayerSP player = Minecraft.func_71410_x().field_71439_g;
        if (player != null) {
            player.func_145747_a((IChatComponent)new ChatComponentText("stop cheating loser"));
        }
    }

    public static void mb(int paramInt) {
        throw new UnsupportedOperationException();
    }

    public static Class gcj(String name) throws ClassNotFoundException {
        if (name.startsWith("[")) {
            return Class.forName(name.substring(1).replace('/', '.'));
        }
        return Class.forName(Type.getType((String)name).getClassName());
    }

    public static String gcs(Class cls) {
        return Type.getType((Class)cls).getInternalName();
    }

    public static void test() {
        System.out.println("test");
    }

    public static String cs(int id) {
        throw new UnsupportedOperationException();
    }

    public static void rl() {
        throw new UnsupportedOperationException();
    }

    public static String sp(String paramString1, String paramString2) {
        return "{}";
    }

    public static Object grh() {
        return new Object();
    }

    public static void cpy(String string) {
    }

    public static void reload() {
        throw new UnsupportedOperationException();
    }

    public static void p(String msg) {
        System.out.println(msg);
    }

    public static void res() {
        throw new UnsupportedOperationException();
    }

    public static short gks(int key) {
        boolean pressed = key == 1 ? Mouse.isButtonDown((int)0) : Mouse.isButtonDown((int)1);
        return (short)(pressed ? 256 : 0);
    }

    public static Object[] gco(Class paramClass) {
        throw new UnsupportedOperationException();
    }

    public static double[] trn(double d1, double d2, double d3) {
        throw new UnsupportedOperationException();
    }

    public static byte[] gcb(Class cls) {
        throw new UnsupportedOperationException();
    }

    public static int scb(Class cls, byte[] bytes) {
        throw new UnsupportedOperationException();
    }

    public static String[] gcf(Class paramClass) {
        throw new UnsupportedOperationException();
    }

    public static String[] gcm(Class paramClass) {
        throw new UnsupportedOperationException();
    }

    public static int ds(int i1, String string, double d1, double d2, int i2) {
        return 0;
    }

    public static double gsw(int paramInt, String paramString) {
        return Display.getDesktopDisplayMode().getWidth();
    }

    public static double gsh(int paramInt, String paramString) {
        return Display.getDesktopDisplayMode().getHeight();
    }
}

