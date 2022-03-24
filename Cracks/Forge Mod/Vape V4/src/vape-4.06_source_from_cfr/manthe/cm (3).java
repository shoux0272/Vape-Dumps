/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.pw;
import org.lwjgl.opengl.GL11;

public class cm {
    public static int a;
    public static int d;
    public static int e;
    public static int b;
    public static int f;
    public static int c;

    public cm(pw pw2, int n6, int n10, int n11, int n12, int n13, int n14) {
        a = n6;
        d = n10;
        e = n11;
        b = n12;
        f = n13;
        c = n14;
    }

    public void a() {
        GL11.glStencilFunc((int)a, (int)d, (int)e);
        GL11.glStencilOp((int)b, (int)f, (int)c);
    }
}

