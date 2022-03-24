/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.C2;
import manthe.D7;
import manthe.bj;
import manthe.my;
import manthe.o7;
import manthe.oU;
import manthe.pd;
import manthe.qp;
import manthe.rl;
import manthe.s6;
import manthe.vK;
import org.lwjgl.opengl.GL11;

public class rg
extends qp
implements bj,
s6 {
    private final rl G = new rl("", my.i, 1.0);
    private boolean I;
    private double F = 0.0;
    private vK H;

    public rg(String string, boolean bl) {
        this.I = bl;
        this.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.a(null, new oU(this));
        this.G.a(string);
        this.b(this.G);
        this.G.j(false);
    }

    public rg(boolean bl) {
        this.I = bl;
        this.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.a(null, new C2(this));
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        this.G.c(this.q());
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.G.b(this.b());
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.I) {
                o7.a(this.n(), this);
            }
            if (this.F > 0.0) {
                o7.a(this.P() != null ? this.P() : this.n(), this.F, this, 4);
            }
            if (this.g()) {
                o7.a(new Color(0, 0, 0, 100), this.t() + this.F, this.k() + this.b() - this.F, this.t() + this.q() - this.F, this.k() + this.b() - this.F, this.t() + this.q() - this.F, this.k() + this.F, this.t() + this.F, this.k() + this.F);
            }
            if (this.d()) {
                o7.a(new Color(0, 0, 0, 200), this.t() + this.F, this.k() + this.b() - this.F, this.t() + this.q() - this.F, this.k() + this.b() - this.F, this.t() + this.q() - this.F, this.k() + this.F, this.t() + this.F, this.k() + this.F);
            }
            GL11.glEnable((int)3553);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
        }
        super.c(bl);
    }

    @Override
    public vK a() {
        return this.H;
    }

    @Override
    public void a(vK vK2) {
        this.H = vK2;
    }

    @Override
    public double A() {
        return this.F;
    }

    @Override
    public void e(double d10) {
        this.F = d10;
    }

    public rl z() {
        return this.G;
    }

    public boolean y() {
        return this.I;
    }

    public void e(boolean bl) {
        this.I = bl;
    }

    static vK a(rg rg2) {
        return rg2.H;
    }
}

