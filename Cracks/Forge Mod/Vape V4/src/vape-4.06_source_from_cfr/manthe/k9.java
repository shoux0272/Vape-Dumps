/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.m0;
import manthe.o7;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class k9 {
    public static int c = 0;
    public static HashMap<String, m0> d;
    private static int b;

    public static void a(Color color, float f10, float f11, String string, float f12) {
        k9.a(color, f10, f11, string, f12, true);
    }

    public static void a(Color color, float f10, float f11, String string, float f12, boolean bl) {
        m0 m02 = k9.a(string);
        double d10 = 1.0 / (double)f12;
        f10 = (float)((double)f10 * d10);
        f11 = (float)((double)f11 * d10);
        k9.a(color, null, f10, f11, m02, 32.0f, 32.0f, bl, f12);
    }

    public static void a(Color color, Color color2, float f10, float f11, String string, float f12, float f13, boolean bl) {
        m0 m02 = k9.a(string);
        k9.a(color, color2, f10, f11, m02, f12, f13, bl, -1.0f);
    }

    public static void a(Color color, float f10, float f11, String string, float f12, float f13, boolean bl) {
        m0 m02 = k9.a(string);
        k9.a(color, null, f10, f11, m02, f12, f13, bl, -1.0f);
    }

    public static void a(Color color, float f10, float f11, m0 m02, float f12, float f13, boolean bl) {
        k9.a(color, null, f10, f11, m02, f12, f13, bl, -1.0f);
    }

    public static void a(Color color, Color color2, float f10, float f11, m0 m02, float f12, float f13, boolean bl, float f14) {
        GL11.glPushMatrix();
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        if (!bl3) {
            GL11.glEnable((int)3553);
        }
        if (Math.signum(f14) >= 0.0f) {
            GL11.glScaled((double)f14, (double)f14, (double)f14);
        }
        if (bl) {
            o7.a(new Color(0, 0, 0, 150));
            m0.a(m02, f10 + 0.5f, f11 + 0.5f, f12, f13);
        }
        o7.a(color);
        if (color2 == null) {
            m0.a(m02, f10, f11, f12, f13);
        } else {
            m0.a(m02, f10, f11, f12, f13, color, color2);
        }
        o7.a(Color.white);
        if (Math.signum(f14) >= 0.0f) {
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        }
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        if (!bl3) {
            GL11.glDisable((int)3553);
        }
        GL11.glPopMatrix();
    }

    public static void b() {
        k9.a("vapelogo", true);
        k9.a("v4", true);
    }

    private static m0 a(String string, boolean bl) {
        c = a.gk();
        String string2 = string = string.toLowerCase();
        string = k9.a(string, c);
        m0 m02 = null;
        if (Keyboard.isKeyDown((int)15)) {
            d.clear();
        }
        if (d.containsKey(string)) {
            m02 = d.get(string);
        } else {
            try {
                byte[] arrby = a.gt(string);
                if (arrby == null) {
                    return k9.a("world");
                }
                d.put(string, new m0(new ByteArrayInputStream(arrby), bl ? 9987 : 9729));
                m02 = d.get(string);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return m02;
    }

    private static m0 a(String string) {
        return k9.a(string, false);
    }

    public static boolean b(String string) {
        if (c == 0) {
            c = a.gk();
        }
        string = string.toLowerCase();
        byte[] arrby = a.gt(string = k9.a(string, c));
        return arrby != null || d.containsKey(string);
    }

    public static String a(String string, int n6) {
        String string2 = "";
        for (int k = 0; k < string.length(); ++k) {
            char c3 = string.charAt(k);
            string2 = string2 + String.valueOf((char)(c3 ^ n6));
        }
        return string2;
    }

    static {
        k9.b(0);
        d = new HashMap();
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int c() {
        return b;
    }

    public static int a() {
        int n6 = k9.c();
        if (n6 == 0) {
            return 85;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

