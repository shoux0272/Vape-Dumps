/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.BI;
import manthe.D7;
import manthe.DW;
import manthe.Dz;
import manthe.mX;
import manthe.my;
import manthe.o7;
import manthe.p1;
import manthe.pb;
import manthe.pd;
import manthe.qU;
import manthe.qp;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.s6;
import org.lwjgl.opengl.GL11;

public class rz<T extends pb>
extends qp
implements qU,
s6 {
    private static final int M = 2;
    private final rf G = new rf(false);
    private final rf I = new rf(false);
    private final rg J;
    private final int L;
    private rl K;
    private double F = 0.5;
    private T H;

    public rz(String string, int n6, T ... arrT) {
        this.L = n6;
        this.a((T)new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        if (string != null) {
            this.K = new rl(string, my.i, 0.7);
            this.K.b(Color.WHITE);
            this.K.j(false);
        }
        this.J = new rg("", true);
        this.J.j(false);
        this.J.z().b(Color.WHITE);
        this.J.z().j(false);
        this.J.a(new DW(this));
        this.G.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.G.b(this.J);
        this.G.b(new Color(120, 120, 120));
        this.G.j(false);
        this.G.g(true);
        this.I.a(false);
        this.I.a(new D7(0.0, 0.0, arrT.length, n6, new pd(0, 2, 0, 2)));
        for (T t2 : arrT) {
            rg rg2 = ((pb)t2).a();
            rg2.a(new mX(this, (pb)t2));
            if (n6 == 1) {
                rg2.a(new Dz(this, (pb)t2));
            }
            this.I.b(rg2);
        }
        this.b(this.K);
        this.b(this.G);
        this.b(this.I);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        this.J.c(d10);
        for (p1 p12 : this.I.v()) {
            p12.c((d10 - 4.0) / (double)this.L);
        }
        if (this.K != null) {
            this.K.c(d10);
        }
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.J.b(d10);
        this.G.b(d10);
        for (p1 p12 : this.I.v()) {
            p12.b(d10);
        }
        if (this.K != null) {
            this.K.b(d10 * 0.6);
        }
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.e()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.z()) {
                o7.a(new Color(45, 45, 45), this.A(), this.G, 4);
            } else {
                o7.a(new Color(45, 45, 45), this.A(), this.G, 0, 2, 1);
                o7.a(new Color(45, 45, 45), this.A(), this.I, 0, 2, 3);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }

    @Override
    public boolean z() {
        return !this.I.e();
    }

    @Override
    public void f(boolean bl) {
        this.I.a(!bl);
    }

    public T a() {
        return this.H;
    }

    public void a(T t2) {
        this.H = t2;
        this.J.z().a(this.b(t2));
        ((pb)this.H).e().d();
    }

    private String b(T t2) {
        if (t2 instanceof BI) {
            return t2.H();
        }
        return ((pb)t2).toString();
    }

    @Override
    public double A() {
        return this.F;
    }

    @Override
    public void e(double d10) {
        this.F = d10;
    }

    static pb a(rz rz2) {
        return rz2.H;
    }
}

