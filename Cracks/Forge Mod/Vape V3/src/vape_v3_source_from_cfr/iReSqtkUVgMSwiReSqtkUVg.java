/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import a.a;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgMSwiReSqtkUVg {
    public static int a;
    public static HashMap<String, iReSqtkUVgfqXiReSqtkUVg> b;

    public static void a(Color color, float f, float f2, String string, float f3) {
        iReSqtkUVgMSwiReSqtkUVg.a(color, f, f2, string, f3, true);
    }

    public static void a(Color color, float f, float f2, String string, float f3, boolean bl) {
        GL11.glPushMatrix();
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        if (!bl3) {
            GL11.glEnable((int)3553);
        }
        double d2 = 1.0 / (double)f3;
        f = (float)((double)f * d2);
        f2 = (float)((double)f2 * d2);
        GL11.glScaled((double)f3, (double)f3, (double)f3);
        iReSqtkUVgfqXiReSqtkUVg iReSqtkUVgfqXiReSqtkUVg2 = iReSqtkUVgMSwiReSqtkUVg.a(string);
        if (bl) {
            iReSqtkUVguKSiReSqtkUVg.a(new Color(0, 0, 0, 150));
            iReSqtkUVgfqXiReSqtkUVg.a(iReSqtkUVgfqXiReSqtkUVg2, f + 1.0f, f2 + 1.0f, 32.0f, 32.0f);
        }
        iReSqtkUVguKSiReSqtkUVg.a(color);
        iReSqtkUVgfqXiReSqtkUVg.a(iReSqtkUVgfqXiReSqtkUVg2, f, f2, 32.0f, 32.0f);
        iReSqtkUVguKSiReSqtkUVg.a(Color.white);
        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        if (!bl3) {
            GL11.glDisable((int)3553);
        }
        GL11.glPopMatrix();
    }

    private static iReSqtkUVgfqXiReSqtkUVg a(String string) {
        a = a.a.gk();
        string = string.toLowerCase();
        string = iReSqtkUVgMSwiReSqtkUVg.a(string, a);
        iReSqtkUVgfqXiReSqtkUVg iReSqtkUVgfqXiReSqtkUVg2 = null;
        if (b.containsKey(string)) {
            iReSqtkUVgfqXiReSqtkUVg2 = b.get(string);
        } else {
            try {
                byte[] arrby = a.a.gt(string);
                if (arrby == null) {
                    return iReSqtkUVgMSwiReSqtkUVg.a("world");
                }
                b.put(string, new iReSqtkUVgfqXiReSqtkUVg(new ByteArrayInputStream(arrby)));
                iReSqtkUVgfqXiReSqtkUVg2 = b.get(string);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return iReSqtkUVgfqXiReSqtkUVg2;
    }

    public static String a(String string, int n) {
        String string2 = "";
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            string2 = string2 + String.valueOf((char)(c2 ^ n));
        }
        return string2;
    }

    static {
        b = new HashMap();
    }
}

