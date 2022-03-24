/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import manthe.Bo;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.DP;
import manthe.DU;
import manthe.DX;
import manthe.DY;
import manthe.Dc;
import manthe.Ds;
import manthe.Dv;
import manthe.Dy;
import manthe.c2;
import manthe.cE;
import manthe.i;
import manthe.k9;
import manthe.mq;
import manthe.nq;
import manthe.o7;
import manthe.on;
import manthe.pe;
import manthe.qG;
import manthe.qi;
import manthe.uR;
import manthe.uS;
import manthe.w0;
import manthe.w1;
import manthe.w3;
import manthe.w4;
import manthe.w5;
import manthe.wI;
import manthe.wK;
import manthe.wM;
import manthe.wQ;
import manthe.wV;
import manthe.wh;
import manthe.wo;
import manthe.wy;
import manthe.xA;
import manthe.xc;
import manthe.xx;
import manthe.xy;
import manthe.y5;
import manthe.zE;
import manthe.zu;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class wz
extends wI {
    private wy X;
    private double P;
    private y5 E;
    private boolean I;
    private boolean W;
    private boolean S;
    private boolean O;
    private double M;
    private double U;
    private int F = -1;
    private String Z = null;
    private int V = 0;
    private final long L = 2000L;
    private long T = 0L;
    private List<wM> Y = new ArrayList<wM>();
    private wh Q = new wh("newclose", 1.5);
    private wh N = new wh("newrearrange", 1.5);
    private i G = new i(0.15, 0.0, 1.0);
    private wV J = new wV("settingdots");
    private wV R = new wV("newstar");
    private DU H;
    private wK D;
    private w4 K;

    public wz(wy wy2, y5 y52, double d10) {
        this.X = wy2;
        this.E = y52;
        this.P = d10;
        this.K = new w4(y52);
        this.D = new w1(this, "REQUIRES BLATANT MODE", 0.75);
        this.D.a(wz.b.d);
        this.D.a(false);
        this.D.c(new qG(this));
        this.a(wz.b.k);
        if (y52.M() != null) {
            this.a(y52.M());
        }
        wz wz2 = this;
        if (wy2 instanceof w0) {
            this.S = true;
        }
        this.Q.c(new qi(this, y52, wy2));
        this.Q.a("Remove module from favorites");
        this.N.c(new Dc(this, wz2));
        this.J.c(new uS(this, wy2));
        this.R.c(new cE(this, y52));
        this.R.a("Add module to favorites");
        this.c(new nq(this, y52));
        this.a(this.D, this.K, this.Q, this.N, this.J, this.R);
    }

    public wz(wy wy2, y5 y52) {
        this(wy2, y52, 0.9);
    }

    private void a(double d10, double d11, Color color) {
        o7.a(this.d(), this.c(), this.e(), this.f());
        mq mq2 = this.e(0.75);
        pe.c(this.d(), this.c(), mq2.b(this.Z) + 10.0, this.f(), wz.b.u);
        int n6 = 7;
        double d12 = this.d() + mq2.b(this.Z) + 10.0 - 1.0;
        double d13 = this.c() + this.f();
        double d14 = d12;
        double d15 = this.c() - 4.0;
        double d16 = d12 + (double)n6;
        double d17 = d13;
        pe.a(d12 + 1.0, d13, d14 + 1.0, d15 - 20.0, d16 + 1.0, d17, new Color(16, 16, 16, 255));
        pe.a(d12, d13, d14, d15, d16, d17, wz.b.u);
        mq2.a(this.Z, d10, d11, color);
        GL11.glDisable((int)3089);
    }

    @Override
    public void a() {
        boolean bl;
        if (this.O) {
            this.O();
            this.P();
        }
        if (this.D.b()) {
            this.D.c(this.d());
            this.D.a(this.c());
            this.D.b(this.e() - this.J.e() + 2.5);
            this.D.d(this.f());
            this.K.a(false);
            this.J.a(false);
            this.a(0.0, 0.0, wz.b.d);
            return;
        }
        mq mq2 = this.e(this.P);
        double d10 = mq2.a(this.E.H());
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - 4.0;
        double d13 = this.d() + 5.0;
        Color color = this.I();
        Color color2 = wz.b.r;
        if (this.E.N()) {
            color = b.e();
            color2 = b.c();
        } else if (this.I || this.W || this.Z != null) {
            color = wz.b.m;
            color2 = wz.b.c;
        }
        double d14 = this.d() + this.e() - 10.0 - 8.0;
        if ((this.Z != null && this.Z.startsWith("MUST") || this.E.f() || this.I || this.K.O().c() || this.W) && !zu.E) {
            this.K.c(d14 -= this.K.e());
            this.K.a(this.c() + 5.0);
            this.K.a(true);
            d14 -= 5.0;
        } else {
            this.K.a(false);
        }
        if (this.W && !this.S) {
            this.R.a(true);
            this.R.d(this.E.L() ? wz.b.w : (this.E.N() ? color2 : null));
            this.R.c(d14 -= this.R.e());
            this.R.a(this.c());
            this.R.d(this.f());
            d14 -= 5.0;
        } else {
            this.R.a(false);
        }
        pe.c(this.d(), this.c(), this.e(), this.f(), color);
        if (zu.E) {
            if (this.W) {
                this.W = false;
                this.X.a((y5)null);
                this.N();
                return;
            }
            double d15 = this.S ? 38.0 : 20.0;
            d13 += d15;
            pe.c(this.d(), this.c(), d15, this.f(), wz.b.u);
            this.R.a(false);
            this.J.a(false);
            if (this.S) {
                this.Q.a(true);
                this.Q.c(this.d() + 5.0);
                this.Q.a(this.c());
                this.Q.d(this.f());
                this.N.a(true);
                this.N.c(this.d() + 10.0 + 8.0 * this.Q.H);
                this.N.a(this.c());
                this.N.d(this.f());
            } else {
                this.H = new DU(this.d(), this.c(), d15, this.f());
                double d16 = 7.0;
                double d17 = 0.5;
                double d18 = d17 + 0.5;
                if (this.E.x()) {
                    pe.c(this.d() + d16, this.c() + d16, d15 - d16 * 2.0, this.f() - d16 * 2.0, b.e());
                    pe.c(this.d() + d16 + d17, this.c() + d16 + d17, d15 - (d16 + d17) * 2.0, this.f() - (d16 + d17) * 2.0, wz.b.u);
                    pe.c(this.d() + d16 + d18, this.c() + d16 + d18, d15 - (d16 + d18) * 2.0, this.f() - (d16 + d18) * 2.0, b.e());
                } else {
                    pe.c(this.d() + d16, this.c() + d16, d15 - d16 * 2.0, this.f() - d16 * 2.0, wz.b.y);
                    pe.c(this.d() + d16 + d17, this.c() + d16 + d17, d15 - (d16 + d17) * 2.0, this.f() - (d16 + d17) * 2.0, wz.b.u);
                }
            }
        } else {
            this.Q.a(false);
            this.N.a(false);
            this.J.a(true);
            this.J.d(this.E.N() ? color2 : null);
            this.J.c(this.d() + this.e() - 5.0 - 8.0);
            this.J.a(this.c());
            this.J.d(this.f());
        }
        boolean bl2 = bl = !on.C && this.E.n() && !this.E.N() && !this.W && !zu.E && !this.K.N();
        if (bl) {
            float f10 = 0.87f;
            k9.a(wz.b.s.darker(), (float)(d14 -= (double)(8.0f * f10)), (float)d12, "newblatant", 8.0f * f10, 8.0f * f10, false);
        }
        if (this.Z != null) {
            this.J.a(false);
            this.a(d13, d11, color2);
        } else {
            mq2.a(this.E.H(), d13, d11, this.E.x() ? color2 : wz.b.s);
        }
        if (this.E.N()) {
            double d19 = zu.E ? 20 : 0;
            pe.c(this.d() + d19, this.c() + this.f() - 0.5, this.e() - d19, 0.5, wz.b.y);
        }
    }

    private void O() {
        Bo bo2 = o7.b();
        double d10 = (double)bo2.b - this.M;
        this.a(this.c() + d10);
        if (this.c() < this.X.c() + this.X.Y().f()) {
            if (this.X.U()) {
                this.X.f(this.X.P() + 1.0);
            }
            this.a(this.X.c() + this.X.Y().f());
        } else if (this.X.U() && this.c() > this.X.c() + this.X.L() - this.f()) {
            this.X.f(this.X.P() - 1.0);
            this.a(this.X.c() + this.X.L() - this.f());
        } else if (this.c() > this.X.c() + this.X.f() - this.f()) {
            this.a(this.X.c() + this.X.f() - this.f());
        } else {
            this.M = bo2.b;
        }
    }

    public void R() {
        for (Ds ds2 : this.E.r()) {
            wM wM2 = null;
            if (ds2 instanceof DB) {
                wM2 = new wK((DB)ds2);
            } else if (ds2 instanceof DX) {
                wM2 = new w5((DX)ds2);
            } else if (ds2 instanceof DF) {
                wM2 = new xx((DF)ds2);
            } else if (ds2 instanceof Dy) {
                wM2 = new xc((Dy)ds2);
            } else if (ds2 instanceof DE) {
                wM2 = new xA((DE)ds2);
            } else if (ds2 instanceof DP) {
                wM2 = new w3((DP)ds2);
            } else if (ds2 instanceof Dv) {
                wM2 = new xy((Dv)ds2);
            } else if (ds2 instanceof DY) {
                wM2 = new wo((DY)ds2);
            } else {
                on.a(" - Unknown value type: " + ds2.getClass().getSimpleName());
            }
            if (wM2 == null) continue;
            if (ds2.o() != null) {
                wM2.a(wz.b.u);
            } else {
                wM2.a(wz.b.k);
            }
            wM2.a(false);
            this.X.a(wM2, new Object[0]);
            this.Y.add(wM2);
        }
        if (this.E instanceof zE) {
            wQ wQ2 = new wQ();
            wQ2.a(wz.b.k);
            wQ2.a(false);
            this.X.a((wM)wQ2, new Object[0]);
            this.Y.add(wQ2);
        }
    }

    public void Q() {
        this.W = true;
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz) || wM2.equals(this)) continue;
            wM2.a(false);
        }
        for (wM wM2 : this.Y) {
            this.X.w().get(this.X.w().indexOf(wM2)).a(true);
        }
    }

    public void N() {
        this.W = false;
        zu.a(this.X.an());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.K.N() && (this.Z == null || !this.Z.toLowerCase(Locale.ROOT).startsWith("press"))) {
            this.b("press a key to bind");
        }
        if (this.V != 0 && System.currentTimeMillis() > this.T + 2000L) {
            this.Z = null;
            this.D.a(false);
            this.K.f(false);
            this.V = 0;
        } else if (this.Z != null && this.Z.toLowerCase(Locale.ROOT).startsWith("press") && !this.K.N()) {
            this.b(1);
            if (this.E.a().length() > 0) {
                this.b("bound to " + this.E.a());
            } else {
                this.b("bind removed");
            }
        }
        if (this.I && !this.x()) {
            this.I = false;
            if (this.D.b()) {
                this.b(2);
            } else if (this.V == 0 && this.Z != null && !this.Z.toLowerCase(Locale.ROOT).startsWith("press") && System.currentTimeMillis() > this.T + 2000L) {
                this.b((String)null);
            }
        }
    }

    private void P() {
        if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
            this.O = false;
            zu.W = null;
            if (this.F != -1) {
                on.p.A().b().remove(this.E);
                on.p.A().b().add(this.F, this.E);
            }
            w0.ar();
            this.F = -1;
            return;
        }
        int n6 = -1;
        int n10 = -1;
        double d10 = this.f() * this.e();
        ArrayList<wz> arrayList = new ArrayList<wz>();
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz)) continue;
            arrayList.add((wz)wM2);
        }
        arrayList.sort(new uR(this));
        for (wz wz2 : arrayList) {
            double d11;
            ++n10;
            if (wz2.equals(this) || !((d11 = wz2.q().b(this.q())) >= d10 / 2.0)) continue;
            n6 = n10;
            break;
        }
        if (n6 == -1) {
            return;
        }
        if (this.F != n6) {
            this.a(n6);
        }
        this.F = n6;
    }

    private void a(int n6) {
        double d10 = this.X.Y().c() + this.X.Y().f();
        ArrayList<wz> arrayList = new ArrayList<wz>();
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz)) continue;
            arrayList.add((wz)wM2);
        }
        arrayList.remove(this);
        arrayList.add(n6, this);
        double d11 = 0.0;
        for (wz wz2 : arrayList) {
            if (wz2.c() < d10) continue;
            if (wz2.S().equals(this.S())) {
                d11 += wz2.f();
                continue;
            }
            wz2.a(d10 + d11);
            d11 += wz2.f();
        }
    }

    public void b(String string) {
        if (string == null) {
            this.b(1);
            return;
        }
        this.Z = string.toUpperCase();
    }

    public void b(int n6) {
        this.V = n6;
        this.T = System.currentTimeMillis();
    }

    public y5 S() {
        return this.E;
    }

    @Override
    public void i() {
        if (!zu.E) {
            this.I = true;
        }
    }

    public void f(boolean bl) {
        this.W = bl;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    static double a(wz wz2, double d10) {
        wz2.M = d10;
        return wz2.M;
    }

    static double b(wz wz2, double d10) {
        wz2.U = d10;
        return wz2.U;
    }

    static boolean b(wz wz2, boolean bl) {
        wz2.O = bl;
        return wz2.O;
    }

    static boolean a(wz wz2, boolean bl) {
        wz2.W = bl;
        return wz2.W;
    }

    static boolean d(wz wz2) {
        return wz2.W;
    }

    static boolean f(wz wz2) {
        return wz2.S;
    }

    static DU a(wz wz2) {
        return wz2.H;
    }

    static w4 b(wz wz2) {
        return wz2.K;
    }

    static wK c(wz wz2) {
        return wz2.D;
    }

    static wV e(wz wz2) {
        return wz2.J;
    }
}

