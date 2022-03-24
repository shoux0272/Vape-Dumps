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

public class iReSqtkUVgBLuiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgBGPiReSqtkUVg,
iReSqtkUVgXTEiReSqtkUVg,
iReSqtkUVgmopiReSqtkUVg {
    private static final double h = 0.5;
    private final iReSqtkUVgBLuiReSqtkUVg p;
    private final iReSqtkUVgLcXiReSqtkUVg q;
    private final double r;
    private final double s;
    private final String t;
    private final String u;
    private final boolean v;
    private final String w;
    private iReSqtkUVgilmiReSqtkUVg x;
    private double y = 1.0;
    private double z = 0.0;
    private double A = 0.0;
    private boolean B = false;
    private int C = 0;
    private boolean D = false;
    private double E = 0.0;

    public iReSqtkUVgBLuiReSqtkUVg(double d2, double d3, String string, String string2, String string3) {
        this.r = d2;
        this.s = d3;
        this.t = string2;
        this.u = string;
        this.w = string3;
        this.q = new iReSqtkUVgLcXiReSqtkUVg(string);
        if (string3 == null) {
            this.p = this;
            this.v = false;
        } else {
            this.v = true;
            this.x = new iReSqtkUVgilmiReSqtkUVg(string3, iReSqtkUVgIqLiReSqtkUVg.b, 0.5, false);
            this.x.d(this.j().a(string3) * 0.5);
            this.p = new iReSqtkUVgBLuiReSqtkUVg(d2, d3, string, string2, null);
            this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 2, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.x);
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        }
        this.a(new iReSqtkUVgpeFiReSqtkUVg(this, 0.0, 0.0, 0.0, 100.0), new iReSqtkUVgamNiReSqtkUVg(this));
        this.a(new iReSqtkUVgpkmiReSqtkUVg(this, 0.0, 0.0, 0.0, 100.0), new iReSqtkUVgjlLiReSqtkUVg(this));
        this.a(0.5);
        this.a(Color.green);
        this.b(new Color(110, 110, 110, 70));
    }

    @Override
    public void a(Color color) {
        super.a(color);
        if (this.v) {
            this.p.a(color);
        }
    }

    @Override
    public void a(boolean bl) {
        if (this.f_() && !Mouse.isButtonDown((int)0)) {
            this.b_(false);
        }
        if (this.v) {
            this.x.d(this.j().a(this.w) + this.d());
        }
        if (this.h() && !this.v) {
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            iReSqtkUVguKSiReSqtkUVg.a(k, this.c(), this.e_() + this.l(), this.c() + this.k(), this.e_() + this.l(), this.c() + this.k(), this.e_(), this.c(), this.e_());
            iReSqtkUVguKSiReSqtkUVg.a(this.g_() ? this.m().darker().darker().darker() : this.n(), this.d(), this, 4);
            iReSqtkUVguKSiReSqtkUVg.a(this.m(), this.c() + this.K() + this.d(), this.e_() + this.d() + this.J(), this.c() + this.L() - this.d(), this.e_() + this.d() + this.J(), this.c() + this.L() - this.d(), this.e_() + this.d(), this.c() + this.K() + this.d(), this.e_() + this.d());
            iReSqtkUVguKSiReSqtkUVg.a(this.m().darker(), this.c() + this.E + this.d() - 1.0, this.e_() + this.d() + this.J(), this.c() + this.E - this.d() + 1.0, this.e_() + this.d() + this.J(), this.c() + this.E - this.d() + 1.0, this.e_() + this.d(), this.c() + this.E + this.d() - 1.0, this.e_() + this.d());
            double d2 = -2.5;
            double d3 = -1.0;
            iReSqtkUVguKSiReSqtkUVg.a(this.m().darker().darker().darker(), this.c() + this.L() + this.d() + d2, this.e_() + this.d() + this.J(), this.c() + this.L() + this.d() + d3, this.e_() + this.d() + this.J(), this.c() + this.L() + this.d() + d3, this.e_() + this.d(), this.c() + this.L() + this.d() + d2, this.e_() + this.d());
            double d4 = 0.0;
            double d5 = 1.5;
            iReSqtkUVguKSiReSqtkUVg.a(this.m().darker().darker().darker(), this.c() + this.K() + this.d() + d4, this.e_() + this.d() + this.J(), this.c() + this.K() + this.d() + d5, this.e_() + this.d() + this.J(), this.c() + this.K() + this.d() + d5, this.e_() + this.d(), this.c() + this.K() + this.d() + d4, this.e_() + this.d());
            GL11.glEnable((int)3553);
            this.j().a(this.q.b(this.z), this.c() + 2.0, this.e_() - this.J() + this.d() + 1.0, -1);
            this.j().a(this.q.b(this.A), this.c() + (this.k() - this.j().b(this.q.b(this.A))) - this.d(), this.e_() - this.J() + this.d() + 1.0, -1);
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
        if (!this.v) {
            Object object;
            if (this.f_()) {
                object = iReSqtkUVguKSiReSqtkUVg.a();
                double d2 = this.c() - this.d();
                double d3 = this.k() - this.d() * 2.0;
                if (this.C == 1) {
                    --((iReSqtkUVgFXsiReSqtkUVg)object).a;
                    if ((double)((iReSqtkUVgFXsiReSqtkUVg)object).a >= d2 + this.L()) {
                        this.e(this.A - 0.1);
                    } else if ((double)((iReSqtkUVgFXsiReSqtkUVg)object).a < d2) {
                        this.e(this.s);
                    } else {
                        double d4 = (double)((iReSqtkUVgFXsiReSqtkUVg)object).a - d2;
                        double d5 = d4 / d3;
                        double d6 = this.r - this.s;
                        double d7 = d5 * d6;
                        this.e(d7 + this.s);
                    }
                } else if (this.C == 2) {
                    --((iReSqtkUVgFXsiReSqtkUVg)object).a;
                    if ((double)((iReSqtkUVgFXsiReSqtkUVg)object).a > d2 + d3) {
                        this.f(this.r);
                    } else if ((double)((iReSqtkUVgFXsiReSqtkUVg)object).a <= d2 + this.K()) {
                        this.f(this.z + 0.1);
                    } else {
                        double d8 = (double)((iReSqtkUVgFXsiReSqtkUVg)object).a - d2;
                        double d9 = d8 / d3;
                        double d10 = this.r - this.s;
                        double d11 = d9 * d10;
                        this.f(d11 + this.s);
                    }
                }
            }
            if (((iReSqtkUVgfXGiReSqtkUVg)(object = (iReSqtkUVgfXGiReSqtkUVg)this.x())).j().equals(((iReSqtkUVgfXGiReSqtkUVg)object).k())) {
                if (this.C == 2) {
                    this.f(this.E() + 0.1);
                } else {
                    this.e(this.D() - 0.1);
                }
            }
            this.E = (this.K() + this.L()) / 2.0;
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        if (this.v) {
            this.x.c(d2);
            this.p.c(d2);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        if (this.v) {
            this.p.d(d2);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (!this.t()) {
            this.b(false);
        }
        return super.a(n, n2, n3);
    }

    @Override
    public boolean a(char c2, int n) {
        if (this.g_()) {
            if (n == 203) {
                if (this.C == 1) {
                    this.e(this.D() - (Keyboard.isKeyDown((int)29) ? 10.0 : (Keyboard.isKeyDown((int)42) ? 0.1 : 1.0)));
                } else {
                    this.f(this.E() - (Keyboard.isKeyDown((int)29) ? 10.0 : (Keyboard.isKeyDown((int)42) ? 0.1 : 1.0)));
                }
                return true;
            }
            if (n == 205) {
                if (this.C == 1) {
                    this.e(this.D() + (Keyboard.isKeyDown((int)29) ? 10.0 : (Keyboard.isKeyDown((int)42) ? 0.1 : 1.0)));
                } else {
                    this.f(this.E() + (Keyboard.isKeyDown((int)29) ? 10.0 : (Keyboard.isKeyDown((int)42) ? 0.1 : 1.0)));
                }
                return true;
            }
        }
        return super.a(c2, n);
    }

    public Double D() {
        if (this.v) {
            return this.p.D();
        }
        return this.z;
    }

    public void e(double d2) {
        if (this.v) {
            this.p.e(d2);
        } else {
            if (d2 > this.r) {
                d2 = this.r;
            } else if (d2 < this.s) {
                d2 = this.s;
            } else if (d2 > this.N()) {
                d2 = this.N() - 0.1;
            }
            this.z = d2;
        }
    }

    public Double E() {
        if (this.v) {
            return this.p.E();
        }
        return this.A;
    }

    public double F() {
        return this.s;
    }

    public double G() {
        return this.r;
    }

    public void f(double d2) {
        if (this.v) {
            this.p.f(d2);
        } else {
            if (d2 > this.r) {
                d2 = this.r;
            } else if (d2 < this.s) {
                d2 = this.s;
            } else if (d2 < this.M()) {
                d2 = this.M() + 0.1;
            }
            this.A = d2;
        }
    }

    @Override
    public boolean f_() {
        return this.B && !this.A();
    }

    @Override
    public void b_(boolean bl) {
        this.B = bl;
    }

    @Override
    public double d() {
        return this.y;
    }

    @Override
    public void a(double d2) {
        this.y = d2;
    }

    @Override
    public boolean g_() {
        return this.D;
    }

    @Override
    public void b(boolean bl) {
        if (this.A()) {
            return;
        }
        this.D = bl;
    }

    private double J() {
        return this.l() - this.d() * 2.0;
    }

    private double K() {
        return (this.z - this.s) / (this.r - this.s) * this.k();
    }

    private double L() {
        return (this.A - this.s) / (this.r - this.s) * this.k();
    }

    private double M() {
        return this.z;
    }

    private double N() {
        return this.A;
    }

    public iReSqtkUVgLcXiReSqtkUVg H() {
        return this.q;
    }

    public iReSqtkUVgpFLiReSqtkUVg[] I() {
        return new iReSqtkUVgpFLiReSqtkUVg[]{new iReSqtkUVgpFLiReSqtkUVg(this.D()), new iReSqtkUVgpFLiReSqtkUVg(this.E())};
    }

    @Override
    public void b(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        if (this.v) {
            this.p.b(iReSqtkUVgWaoiReSqtkUVg2);
        }
        super.b(iReSqtkUVgWaoiReSqtkUVg2);
    }

    @Override
    public void d(boolean bl) {
        super.d(bl);
        if (this.v) {
            this.p.d(bl);
        }
    }

    static /* synthetic */ double a(iReSqtkUVgBLuiReSqtkUVg iReSqtkUVgBLuiReSqtkUVg2) {
        return iReSqtkUVgBLuiReSqtkUVg2.E;
    }

    static /* synthetic */ int a(iReSqtkUVgBLuiReSqtkUVg iReSqtkUVgBLuiReSqtkUVg2, int n) {
        iReSqtkUVgBLuiReSqtkUVg2.C = n;
        return iReSqtkUVgBLuiReSqtkUVg2.C;
    }
}

