/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgilmiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgAFhiReSqtkUVg {
    private int h;
    private int p = iReSqtkUVgYKuiReSqtkUVg.a;
    private String q;
    private String r;
    private double s;
    private boolean t = false;
    private boolean u;

    public iReSqtkUVgilmiReSqtkUVg(String string, int n, double d2) {
        this.q = string;
        this.r = string;
        this.h = n;
        this.s = d2;
        this.a(Color.WHITE);
        this.u = true;
    }

    public iReSqtkUVgilmiReSqtkUVg(String string, int n, double d2, boolean bl) {
        this.q = string;
        this.r = string;
        this.h = n;
        this.s = d2;
        this.a(Color.WHITE);
        this.u = bl;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.h()) {
            Color color;
            GL11.glPushMatrix();
            Color color2 = color = this.u ? this.m() : Color.white;
            if (this.G()) {
                String[] arrstring = this.D().split("\n");
                double d2 = 0.0;
                for (String string : arrstring) {
                    this.a(string, this.c() + 1.0, this.e_() + d2, color);
                    d2 += this.j().a(string) + 1.0;
                }
            } else {
                this.a(this.r, this.c() + 1.0, this.e_(), color);
            }
            GL11.glPopMatrix();
        }
    }

    @Override
    public iReSqtkUVgCRDiReSqtkUVg j() {
        return iReSqtkUVgFuiiReSqtkUVg.e.a(this.s);
    }

    public void a(String string, double d2, double d3, Color color) {
        iReSqtkUVguKSiReSqtkUVg.a(color);
        iReSqtkUVgCRDiReSqtkUVg iReSqtkUVgCRDiReSqtkUVg2 = this.j();
        if (!this.G()) {
            d3 += this.l() / 2.0;
            d3 -= iReSqtkUVgCRDiReSqtkUVg2.a(string) / 2.0;
        }
        if (this.h == iReSqtkUVgIqLiReSqtkUVg.b) {
            if (this.p == iReSqtkUVgYKuiReSqtkUVg.a) {
                iReSqtkUVgCRDiReSqtkUVg2.c(string, d2 + this.k() / 2.0, d3, color);
            } else if (this.p == iReSqtkUVgYKuiReSqtkUVg.b) {
                iReSqtkUVgCRDiReSqtkUVg2.d(string, d2 + this.k() / 2.0, d3, color);
            }
        } else if (this.h == iReSqtkUVgIqLiReSqtkUVg.a) {
            if (this.p == iReSqtkUVgYKuiReSqtkUVg.a) {
                iReSqtkUVgCRDiReSqtkUVg2.a(string, d2, d3, color);
            } else if (this.p == iReSqtkUVgYKuiReSqtkUVg.b) {
                iReSqtkUVgCRDiReSqtkUVg2.b(string, d2, d3, color);
            }
        } else if (this.p == iReSqtkUVgYKuiReSqtkUVg.a) {
            iReSqtkUVgCRDiReSqtkUVg2.a(string, d2 + this.k() - iReSqtkUVgCRDiReSqtkUVg2.b(string), d3, color);
        } else if (this.p == iReSqtkUVgYKuiReSqtkUVg.b) {
            iReSqtkUVgCRDiReSqtkUVg2.b(string, d2 + this.k() - iReSqtkUVgCRDiReSqtkUVg2.b(string), d3, color);
        }
    }

    @Override
    public double k() {
        if (this.G()) {
            double d2 = 0.0;
            for (String string : this.D().split("\n")) {
                double d3 = this.j().b(string);
                if (!(d3 > d2)) continue;
                d2 = d3;
            }
            return d2;
        }
        return super.k();
    }

    public double E() {
        return this.j().b(this.r);
    }

    @Override
    public double l() {
        if (this.G()) {
            String[] arrstring = this.D().split("\n");
            if (arrstring.length == 0) {
                return super.l();
            }
            double d2 = -1.0;
            for (String string : arrstring) {
                d2 += this.j().a(string);
            }
            return d2 + (double)arrstring.length;
        }
        return super.l();
    }

    @Override
    public String a_() {
        return this.q;
    }

    @Override
    public String D() {
        return this.r;
    }

    @Override
    public void a(String string) {
        this.r = string;
    }

    public void e(double d2) {
        this.s = d2;
    }

    public int F() {
        return this.p;
    }

    public void a(int n) {
        this.p = n;
    }

    public boolean G() {
        return this.t;
    }

    public void f(boolean bl) {
        this.t = bl;
    }

    public void b(int n) {
        this.h = n;
    }

    @Override
    public /* synthetic */ iReSqtkUVgnCWiReSqtkUVg C() {
        return super.a();
    }

    @Override
    public /* synthetic */ Object clone() {
        return super.a();
    }
}

