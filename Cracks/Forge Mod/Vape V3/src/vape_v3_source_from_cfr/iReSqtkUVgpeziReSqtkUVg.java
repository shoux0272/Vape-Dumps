/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgpeziReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgpeziReSqtkUVg(Object object) {
        super(object);
    }

    public int a(String string, double d2, double d3, int n) {
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            return iReSqtkUVgpeziReSqtkUVg.a.c().n.a(this.b, string, (float)d2, (float)d3, n);
        }
        return iReSqtkUVgpeziReSqtkUVg.a.c().n.a(this.b, string, (int)d2, (int)d3, n);
    }

    public int a(String string, double d2, double d3, Color color) {
        return this.a(string, d2, d3, color.getRGB());
    }

    public int b(String string, double d2, double d3, int n) {
        return iReSqtkUVgpeziReSqtkUVg.a.c().n.b(this.b, string, (int)d2, (int)d3, n);
    }

    public int b(String string, double d2, double d3, Color color) {
        return this.b(string, d2, d3, color.getRGB());
    }

    public int a(String string, double d2, double d3, int n, double d4) {
        double d5 = 1.0 / d4;
        GL11.glScaled((double)d4, (double)d4, (double)d4);
        int n2 = this.b(string, d2 * d5, d3 * d5, n);
        GL11.glScaled((double)d5, (double)d5, (double)d5);
        return n2;
    }

    public int a(String string) {
        return iReSqtkUVgpeziReSqtkUVg.a.c().n.a(this.b, string);
    }

    public int c(String string, double d2, double d3, int n) {
        return this.b(string, (double)((int)d2 - this.a(string) / 2), (double)((int)d3), n);
    }

    public int d(String string, double d2, double d3, int n) {
        return this.a(string, d2 - (double)(this.a(string) / 2), d3, n);
    }

    public int c(String string, double d2, double d3, Color color) {
        return this.c(string, d2, d3, color.getRGB());
    }

    public int d(String string, double d2, double d3, Color color) {
        return this.d(string, d2, d3, color.getRGB());
    }

    public int d() {
        return iReSqtkUVgpeziReSqtkUVg.a.c().n.a(this.b);
    }

    public int e() {
        return this.d() / 2;
    }

    public iReSqtkUVgsXgiReSqtkUVg f() {
        return new iReSqtkUVgsXgiReSqtkUVg(iReSqtkUVgpeziReSqtkUVg.a.c().n.b(this.b));
    }

    public int b(String string) {
        return this.d();
    }

    public double c(String string) {
        return this.e();
    }
}

