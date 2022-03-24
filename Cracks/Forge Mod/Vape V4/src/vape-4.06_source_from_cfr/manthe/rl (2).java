/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.Bj;
import manthe.mq;
import manthe.my;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.qp;
import manthe.vl;
import org.lwjgl.opengl.GL11;

public class rl
extends qp
implements vl {
    private final String M;
    private final boolean K;
    private int G;
    private int L = Bj.a;
    private String F;
    private double H;
    private boolean J = false;
    private p1 I = this;

    public rl(String string, int n6, double d10) {
        this.M = string;
        this.F = string;
        this.G = n6;
        this.H = d10;
        this.b(Color.WHITE);
        this.K = true;
    }

    public rl(String string, int n6, double d10, boolean bl) {
        this.M = string;
        this.F = string;
        this.G = n6;
        this.H = d10;
        this.b(Color.WHITE);
        this.K = bl;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.e()) {
            Color color;
            GL11.glPushMatrix();
            Color color2 = color = this.K ? this.f() : Color.white;
            if (this.F()) {
                String[] arrstring = this.E().split("\n");
                double d10 = 0.0;
                double d11 = 0.0;
                for (String string : arrstring) {
                    this.a(string, this.t() + d11, this.k() + d10, color);
                    d10 += this.r().a(string) + 1.0;
                }
            } else {
                this.a(this.F, this.t(), this.k(), color);
            }
            GL11.glPopMatrix();
        }
    }

    @Override
    public mq r() {
        return on.p.a(this.H);
    }

    public void a(String string, double d10, double d11, Color color) {
        o7.a(color);
        mq mq2 = this.r();
        if (!this.F()) {
            d11 += this.b() / 2.0;
            d11 -= mq2.a(string) / 2.0;
        }
        if (this.G == my.i) {
            if (this.L == Bj.a) {
                mq2.b(string, this.I.t() + this.I.q() / 2.0, d11, color);
            } else if (this.L == Bj.b) {
                mq2.d(string, this.I.t() + this.I.q() / 2.0, d11, color);
            }
        } else if (this.G == my.c) {
            if (this.L == Bj.a) {
                mq2.a(string, d10 + 2.0, d11, color);
            } else if (this.L == Bj.b) {
                mq2.c(string, d10 + 2.0, d11, color);
            }
        } else if (this.L == Bj.a) {
            mq2.a(string, d10 + this.q() - mq2.b(string), d11, color);
        } else if (this.L == Bj.b) {
            mq2.c(string, d10 + this.q() - mq2.b(string), d11, color);
        }
    }

    @Override
    public double q() {
        if (this.F()) {
            double d10 = 0.0;
            for (String string : this.E().split("\n")) {
                double d11 = this.r().b(string);
                if (!(d11 > d10)) continue;
                d10 = d11;
            }
            return d10;
        }
        return super.q();
    }

    public double H() {
        return this.r().b(this.F);
    }

    @Override
    public double b() {
        if (this.F()) {
            String[] arrstring = this.E().split("\n");
            if (arrstring.length == 0) {
                return super.b();
            }
            double d10 = -1.0;
            for (String string : arrstring) {
                d10 += this.r().a(string);
            }
            return d10 + (double)arrstring.length;
        }
        return super.b();
    }

    @Override
    public String D() {
        return this.M;
    }

    @Override
    public String E() {
        return this.F;
    }

    @Override
    public void a(String string) {
        this.F = string;
    }

    public double V() {
        return this.H;
    }

    public void e(double d10) {
        this.H = d10;
    }

    public int G() {
        return this.L;
    }

    public void a(int n6) {
        this.L = n6;
    }

    public boolean F() {
        return this.J;
    }

    public void d(boolean bl) {
        this.J = bl;
    }

    public void b(int n6) {
        this.G = n6;
    }

    public void d(p1 p12) {
        this.I = p12;
    }
}

