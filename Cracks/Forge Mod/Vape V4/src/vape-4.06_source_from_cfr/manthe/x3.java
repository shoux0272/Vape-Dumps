/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.A2;
import manthe.bz;
import manthe.k9;
import manthe.mq;
import manthe.uW;
import manthe.wV;
import manthe.we;
import manthe.xg;

public class x3
extends xg {
    private String E;
    private String D;
    private boolean C;
    private double F;
    private wV G;
    private static String[] B;

    public x3(we we2, String string, String string2, double d10) {
        super(we2);
        this.E = string;
        this.D = string2;
        this.F = d10;
        this.G = new wV("", 0.3);
        this.G.c(new A2(this, we2));
        this.C = ((bz)((Object)we2)).m();
        this.a(this.G);
    }

    public x3(we we2, String string, String string2) {
        this(we2, string, string2, 1.0);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        this.getClass();
        float f10 = 8.0f * (float)this.F;
        Color color = x3.b.c;
        double d10 = mq2.a(this.D);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - (double)(f10 / 2.0f);
        mq2.a(this.D, this.d() + 10.0 + (double)f10, d11, color);
        k9.a(color, (float)this.d() + 5.0f, (float)d12, this.E, f10, f10, false);
        this.G.d(this.l().ai() ? x3.b.a : null);
        double d13 = this.d() + this.e() - 7.5;
        this.getClass();
        this.G.c(d13 - 8.0);
        this.G.a(this.c());
        this.G.d(this.f());
        this.G.b(this.C ? "upcollapse" : "downexpand");
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    static boolean a(x3 x32, boolean bl) {
        x32.C = bl;
        return x32.C;
    }

    public static void b(String[] arrstring) {
        B = arrstring;
    }

    public static String[] n() {
        return B;
    }

    static {
        if (x3.n() == null) {
            x3.b(new String[1]);
        }
    }
}

