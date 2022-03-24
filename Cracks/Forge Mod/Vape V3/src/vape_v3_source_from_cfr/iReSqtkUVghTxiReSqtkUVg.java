/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVghTxiReSqtkUVg {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;

    public iReSqtkUVghTxiReSqtkUVg(iReSqtkUVgCviiReSqtkUVg iReSqtkUVgCviiReSqtkUVg2, int n, int n2, int n3, int n4, int n5, int n6) {
        a = n;
        b = n2;
        c = n3;
        d = n4;
        e = n5;
        f = n6;
    }

    public void a() {
        GL11.glStencilFunc((int)a, (int)b, (int)c);
        GL11.glStencilOp((int)d, (int)e, (int)f);
    }
}

