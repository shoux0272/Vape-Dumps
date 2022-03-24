/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.f;

public class g
extends f<Color> {
    private Color o;
    private Color e;
    private int k;
    private int j;
    private int m;
    private int f;
    private int i;
    private int l;
    private int h;
    private int n;
    private static String[] g;

    public g(double d10, Color color, Color color2) {
        super(d10);
        this.o = color;
        this.e = color2;
        this.k = color.getRed();
        this.j = color.getGreen();
        this.m = color.getBlue();
        this.f = color.getAlpha();
        this.i = color2.getRed() - this.k;
        this.l = color2.getGreen() - this.j;
        this.h = color2.getBlue() - this.m;
        this.n = color2.getAlpha() - this.f;
    }

    public Color q() {
        double d10 = this.l();
        if (d10 == 0.0) {
            return this.o;
        }
        if (d10 == 100.0) {
            return this.e;
        }
        int n6 = this.k + (int)(this.l() * (double)this.i / 100.0);
        int n10 = this.j + (int)(this.l() * (double)this.l / 100.0);
        int n11 = this.m + (int)(this.l() * (double)this.h / 100.0);
        int n12 = this.f + (int)(this.l() * (double)this.n / 100.0);
        return new Color(n6, n10, n11, n12);
    }

    public void b(Color color) {
        this.o = color;
        this.k = color.getRed();
        this.j = color.getGreen();
        this.m = color.getBlue();
        this.f = color.getAlpha();
        this.i = this.e.getRed() - this.k;
        this.l = this.e.getGreen() - this.j;
        this.h = this.e.getBlue() - this.m;
        this.n = this.e.getAlpha() - this.f;
    }

    public void a(Color color) {
        this.e = color;
        this.i = color.getRed() - this.k;
        this.l = color.getGreen() - this.j;
        this.h = color.getBlue() - this.m;
        this.n = color.getAlpha() - this.f;
    }

    public Color n() {
        return this.o;
    }

    public Color p() {
        return this.e;
    }

    public static void a(String[] arrstring) {
        g = arrstring;
    }

    public static String[] o() {
        return g;
    }

    static {
        if (manthe.g.o() == null) {
            manthe.g.a(new String[5]);
        }
    }
}

