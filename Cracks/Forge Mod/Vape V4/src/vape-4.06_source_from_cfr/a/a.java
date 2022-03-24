/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.d;
import fake.Discord;
import fake.Profiles;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URL;
import manthe.ds;
import manthe.gt;
import manthe.on;
import manthe.y5;
import net.minecraft.client.Minecraft;
import org.apache.commons.io.IOUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.objectweb.asm.Type;
import ripygore.Util;

public class a {
    public static void start() {
        new Thread(() -> {
            try {
                Thread.sleep(1000L);
                on var0 = new on();
                var0.i();
                var0.Q();
                var0.d(true);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }).start();
    }

    public static void exit(boolean var0) {
        Discord.freeDiscord();
    }

    public static void dc() {
        Discord.discordLoad();
    }

    public static void fs() {
        System.out.println("fs");
    }

    public static Class<?> gc(String var0) {
        try {
            return Class.forName(var0.replace("/", "."));
        }
        catch (ClassNotFoundException e10) {
            System.err.println("gc: " + var0);
            return null;
        }
    }

    public static byte[] gt(String var0) throws IOException {
        URL resource = Util.getResource("images/" + var0 + ".png");
        if (resource == null) {
            resource = Util.getResource("images/coder.png");
        }
        byte[] b3 = IOUtils.toByteArray((URL)resource);
        return b3;
    }

    public static int gk() {
        return 0;
    }

    public static String gs() {
        return "{}";
    }

    public static void ss(String var0) {
        System.out.println(var0);
    }

    public static boolean ib() {
        return on.C;
    }

    public static void sb() {
        if (!on.C) {
            on.p.S();
        }
    }

    public static native void mb(int var0);

    public static Class<?> gcj(String var0) throws ClassNotFoundException {
        return var0.startsWith("[") ? Class.forName(var0.substring(1).replace('/', '.')) : Class.forName(Type.getType(var0).getClassName());
    }

    public static String gcs(Class<?> cls) {
        return Type.getType(cls).getInternalName();
    }

    public static void test() {
        System.out.println("test");
    }

    public static String cs(int var0) {
        if (var0 == 876) {
            return "cpw/mods/";
        }
        if (var0 == 1125) {
            return "net/minecraft/client/entity/EntityClientPlayerMP";
        }
        if (var0 == 1216) {
            return "net/minecraft/client/particle/EntityCrit2FX";
        }
        if (var0 == 1086) {
            return "net/minecraft/util/EnumWorldBlockLayer";
        }
        System.out.println(var0);
        return null;
    }

    public static native void rl();

    public static String sp(String var0, String var1) {
        System.out.println("sp: " + var0 + ", " + var1);
        return null;
    }

    public static native Object grh();

    public static void cpy(String contents) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(contents), null);
    }

    public static void reload() {
        System.out.println("reload");
        if (!ds.k().e()) {
            ds.a(null);
            ds.z();
            Object var10000 = d.getGuiObject();
            d.onGuiClosed(var10000);
        }
        for (y5 y52 : on.p.H().e()) {
            if (y52.N()) {
                y52.d(false);
            }
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
        }
        on.p.s = true;
        try {
            on.p.j.g();
            on.p.j.d();
            on.p.j.b();
            on.p.j.f();
            on.p.j.a(gt.class.getClassLoader());
            on.p.j.c();
            on.p.j.e();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void p(String var0) {
        System.out.println("p: " + var0);
    }

    public static short gks(int var0) {
        boolean pressed = var0 == 1 ? Mouse.isButtonDown((int)0) : Mouse.isButtonDown((int)1);
        return (short)(pressed ? 256 : 0);
    }

    public static double[] trn(double var0, double var2, double var4) {
        return new double[]{-1.0, 0.0, 1.0};
    }

    public static byte[] gcb(Class<?> var0) throws Exception {
        return new byte[0];
    }

    public static int scb(Class<?> var0, byte[] var1) throws Exception {
        return 0;
    }

    public static int ds(int var0, String var1, double var2, double var4, int var6) {
        GL11.glPushMatrix();
        int width = Minecraft.func_71410_x().field_71466_p.func_78276_b(var1, (int)var2, (int)var4, -1);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        return width;
    }

    public static double gsw(int var0, String var1) {
        return Minecraft.func_71410_x().field_71466_p.func_78256_a(var1);
    }

    public static double gsh(int var0, String var1) {
        return Minecraft.func_71410_x().field_71466_p.field_78288_b;
    }

    public static void smd(int var0, int var1) {
        System.out.println("smd: " + var0 + ", " + var1);
    }

    public static String gp(String var0) throws Exception {
        return Profiles.readSettings();
    }

    public static void su(String username) {
        System.out.println("su: " + username);
    }

    public static boolean iv() {
        return false;
    }

    public static Class<?> gvc(String var0) {
        try {
            return Class.forName(var0.replace("/", "."));
        }
        catch (ClassNotFoundException e10) {
            System.out.println("gvc: " + var0);
            return null;
        }
    }

    public static int gmv() {
        return 15;
    }

    public static void rsc() {
        System.out.println("rsc");
    }

    public static int mf(int id2, int size, String name) {
        System.out.println("mf: " + id2 + ", " + size + ", " + name);
        return -1;
    }

    public static void updc(String var0, String var1) {
        if (var0 != null) {
            Discord.discordUpdate(var0, var1);
        }
    }

    public static int dsv2(int id2, String string, double x, double y3, int var6, float var7) {
        System.out.println("dsv2");
        return 0;
    }

    public static native double gswv2(int var0, String var1);

    public static native double gshv2(int var0, String var1);

    public static native int mfv2(int var0, int var1, String var2);
}

