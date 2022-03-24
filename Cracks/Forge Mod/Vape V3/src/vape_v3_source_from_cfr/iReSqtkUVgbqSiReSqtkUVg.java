/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgbqSiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgBGPiReSqtkUVg,
iReSqtkUVgXTEiReSqtkUVg,
iReSqtkUVgmopiReSqtkUVg {
    protected static final double h = 0.5;
    protected final double p;
    protected final double q;
    protected final double r;
    protected final String s;
    protected final String t;
    protected final String u;
    protected iReSqtkUVgbqSiReSqtkUVg v;
    protected boolean w;
    protected iReSqtkUVgilmiReSqtkUVg x;
    protected double y = 0.5;
    protected double z = 0.0;
    protected boolean A = false;
    protected boolean B = true;
    private boolean C = false;
    private iReSqtkUVgLcXiReSqtkUVg D;

    public iReSqtkUVgbqSiReSqtkUVg(double d2, double d3, double d4, String string, String string2, String string3) {
        this.p = d2;
        this.q = d3;
        this.r = d4;
        this.s = string2;
        this.u = string3;
        this.t = string;
        if (string != null) {
            this.D = new iReSqtkUVgLcXiReSqtkUVg(string);
        }
        if (string3 == null) {
            this.v = this;
            this.w = false;
        } else {
            this.w = true;
            this.x = new iReSqtkUVgilmiReSqtkUVg(string3, iReSqtkUVgIqLiReSqtkUVg.a, 0.5, false);
            this.x.d(this.j().a(string3) * 0.5);
            this.v = new iReSqtkUVgbqSiReSqtkUVg(d2, d3, d4, string, string2, null);
            this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 2, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.x);
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.v);
        }
        this.a(null, new iReSqtkUVgCrjiReSqtkUVg(this));
        this.a(this.m());
        this.b(new Color(110, 110, 110, 70));
    }

    public iReSqtkUVgbqSiReSqtkUVg(double d2, double d3, String string, String string2, String string3) {
        this(d2, d3, 0.1, string, string2, string3);
    }

    @Override
    public void a(Color color) {
        super.a(color);
        if (this.w) {
            this.v.a(color);
        }
    }

    @Override
    public void a(boolean bl) {
        if (this.f_() && !Mouse.isButtonDown((int)0)) {
            this.b_(false);
        }
        if (this.w) {
            this.x.d(this.j().a(this.u) + 2.0);
        }
        if (this.h() && !this.w && this.B) {
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            iReSqtkUVguKSiReSqtkUVg.a(k, this.c(), this.e_() + this.l(), this.c() + this.k(), this.e_() + this.l(), this.c() + this.k(), this.e_(), this.c(), this.e_());
            iReSqtkUVguKSiReSqtkUVg.a(this.g_() ? this.m().darker().darker().darker() : this.n(), this.d(), this, 4);
            iReSqtkUVguKSiReSqtkUVg.a(this.m(), this.c() + this.d(), this.e_() + this.d() + this.K(), this.c() + this.L() - this.d(), this.e_() + this.d() + this.K(), this.c() + this.L() - this.d(), this.e_() + this.d(), this.c() + this.d(), this.e_() + this.d());
            double d2 = -2.5;
            double d3 = -1.0;
            if (this.L() <= 1.0) {
                d3 = -d2 - 1.0;
                d2 = 0.0;
            } else if (this.L() >= 1.0 && this.L() <= 3.0) {
                d3 = -d2 - 1.5;
                d2 = -0.5;
            } else if (this.L() >= 3.0 && this.L() <= 5.0) {
                d3 = -d2 - 2.0;
                d2 = -1.0;
            } else if (this.L() >= 5.0 && this.L() <= 7.0) {
                d3 = -d2 - 2.5;
                d2 = -1.5;
            }
            iReSqtkUVguKSiReSqtkUVg.a(this.m().darker().darker().darker(), this.c() + this.L() + this.d() + d2, this.e_() + this.d() + this.K(), this.c() + this.L() + this.d() + d3, this.e_() + this.d() + this.K(), this.c() + this.L() + this.d() + d3, this.e_() + this.d(), this.c() + this.L() + this.d() + d2, this.e_() + this.d());
            GL11.glEnable((int)3553);
            String string = "";
            if (this.D != null) {
                string = this.t.isEmpty() ? (int)this.z + "" : this.D.b(this.z);
                string = string + this.s;
            }
            this.j().a(string, this.c() + (this.k() - this.j().b(string)) - this.d(), this.e_() - this.K() + this.d() + 1.0, -1);
            GL11.glDisable((int)3042);
        }
        super.a(bl);
    }

    @Override
    public iReSqtkUVgCRDiReSqtkUVg j() {
        return iReSqtkUVgFuiiReSqtkUVg.e.D();
    }

    @Override
    public void c_() {
        super.c_();
        if (this.f_() && !this.w) {
            double d2;
            iReSqtkUVgFXsiReSqtkUVg iReSqtkUVgFXsiReSqtkUVg2 = iReSqtkUVguKSiReSqtkUVg.a();
            double d3 = this.c() - this.d();
            if ((double)iReSqtkUVgFXsiReSqtkUVg2.a > d3 + (d2 = this.k() - this.d() * 2.0)) {
                this.e(this.p);
            } else if ((double)iReSqtkUVgFXsiReSqtkUVg2.a < d3) {
                this.e(this.q);
            } else {
                double d4 = (double)iReSqtkUVgFXsiReSqtkUVg2.a - d3;
                double d5 = d4 / d2;
                double d6 = this.p - this.q;
                double d7 = d5 * d6;
                this.e(iReSqtkUVgKexiReSqtkUVg.d(d7 + this.q, this.r));
            }
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        if (this.w) {
            this.x.c(d2);
            this.v.c(d2);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        if (this.w) {
            this.v.d(d2);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (!this.t()) {
            this.b(false);
        }
        return super.a(n, n2, n3);
    }

    public Double G() {
        if (this.w) {
            return this.v.G();
        }
        return this.z;
    }

    public void e(double d2) {
        d2 = iReSqtkUVgKexiReSqtkUVg.d(d2, this.r);
        if (this.w) {
            this.v.e(d2);
        } else {
            if (d2 > this.p) {
                d2 = this.p;
            } else if (d2 < this.q) {
                d2 = this.q;
            }
            this.z = d2;
        }
    }

    @Override
    public boolean f_() {
        return this.A && !this.A();
    }

    @Override
    public void b_(boolean bl) {
        this.A = bl;
    }

    @Override
    public double d() {
        return this.y;
    }

    @Override
    public void a(double d2) {
        this.y = d2;
    }

    protected double K() {
        return this.l() - this.d() * 2.0;
    }

    protected double L() {
        return (this.z - this.q) / (this.p - this.q) * this.k();
    }

    public double M() {
        return this.p;
    }

    public double N() {
        return this.q;
    }

    @Override
    public boolean g_() {
        if (this.A()) {
            return false;
        }
        if (this.w) {
            return this.v.g_();
        }
        return this.C;
    }

    @Override
    public void b(boolean bl) {
        if (this.w) {
            this.v.b(bl);
        } else {
            this.C = bl;
        }
    }

    @Override
    public boolean a(char c2, int n) {
        double d2 = 1.0;
        if (this.D != null && this.D.a() == 2) {
            d2 = 0.1;
        }
        double d3 = 10.0 * d2;
        double d4 = 1.0 * d2;
        double d5 = 0.1 * d2;
        if (this.g_()) {
            if (n == 203) {
                this.e(this.G() - (Keyboard.isKeyDown((int)29) ? d3 : (Keyboard.isKeyDown((int)42) ? d5 : d4)));
                return true;
            }
            if (n == 205) {
                this.e(this.G() + (Keyboard.isKeyDown((int)29) ? d3 : (Keyboard.isKeyDown((int)42) ? d5 : d4)));
                return true;
            }
        }
        return super.a(c2, n);
    }

    public String O() {
        return this.s;
    }

    public String P() {
        return this.t;
    }

    @Override
    public void b(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        super.b(iReSqtkUVgWaoiReSqtkUVg2);
        if (this.w) {
            this.v.b(iReSqtkUVgWaoiReSqtkUVg2);
        }
    }

    @Override
    public void d(boolean bl) {
        super.d(bl);
        if (this.w) {
            this.v.d(bl);
        }
    }
}

