/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.fG;
import manthe.fk;
import manthe.pe;
import manthe.wI;

public class wt
extends wI {
    private double I = 27.5;
    private Color E;
    private Color D;
    private int H;
    private fG G;
    private boolean F;

    public wt(Color color, Color color2, int n6) {
        this.E = color;
        this.D = color2;
        this.a(n6);
    }

    public wt(Color color, Color color2, fG fG2) {
        this.E = color;
        this.D = color2;
        if (fG2 != null && fG2.d()) {
            this.G = fG2;
            this.H = fG2.k().h();
            this.a(fG2.j());
        }
    }

    @Override
    public void a() {
        double d10 = this.f() / 2.0;
        if (this.F) {
            pe.a(this.d() + 1.0, this.c() + 1.0, this.I - 1.0, this.I - 1.0, wt.b.f, 2.0f, 1.0f, 2.0f);
        }
        pe.a(this.d() + 1.0, this.c() + 1.0, this.I - 2.0, this.I - 2.0, this.x() ? this.D : this.E);
        if (this.G != null && this.G.d()) {
            double d11 = 1.0;
            double d12 = 8.0 * d11;
            pe.a(this.G, d11, this.d() + d10 - d12, this.c() + d10 - d12);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return this.I;
    }

    @Override
    public double h() {
        return this.I;
    }

    public void a(int n6) {
        this.H = n6;
        fk fk2 = fk.a(n6);
        if (fk2.d()) {
            this.G = fG.a(fk2);
            this.a(this.G.j());
        }
    }

    public void a(fG fG2) {
        this.G = fG2;
        if (fG2 != null && fG2.d()) {
            this.a(fG2.j());
        }
    }

    public void f(boolean bl) {
        this.F = bl;
    }
}

