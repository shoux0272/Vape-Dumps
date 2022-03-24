/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.a;
import java.util.Set;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.V;
import manthe.Y;
import manthe.bH;
import manthe.cB;
import manthe.d8;
import manthe.dX;
import manthe.ds;
import manthe.dx;
import manthe.e2;
import manthe.eC;
import manthe.eJ;
import manthe.ei;
import manthe.eq;
import manthe.f2;
import manthe.fC;
import manthe.fU;
import manthe.f_;
import manthe.fa;
import manthe.fj;
import manthe.fn;
import manthe.fs;
import manthe.ft;
import manthe.g1;
import manthe.kF;
import manthe.kO;
import manthe.kU;
import manthe.ke;
import manthe.ks;
import manthe.kt;
import manthe.ky;
import manthe.on;
import manthe.y5;
import org.lwjgl.input.Keyboard;

public class A7
extends y5 {
    private final AO D = new AO();
    private final DF B = DF.a((Object)this, "Speed", "#.#", "", 1.0, 3.0, 5.0, 0.1);
    private final DB Y = DB.a((Object)this, "Spawn Fake", true, "Spawns an entity on where your player is server-sided.\nUsing this will allow for simulated physics.");
    private final DB x = DB.a((Object)this, "Move Fake", false, "Move your fake entity with your arrow keys.");
    private boolean F;
    private int P;
    private int I;
    private e2 U;
    private double R;
    private double y;
    private double O;
    private double L;
    private double M;
    private double z;
    private float Q;
    private float H;
    private double C;
    private double V;
    private double S;
    private double J;
    private double N;
    private boolean W;
    private d8 w;
    private double u;
    private int K;
    private boolean E;
    private double T;
    private double X;
    private double v;
    private float A;
    private float G;

    public A7() {
        super("Freecam", 3248986, CQ.e, "Lets you fly and clip through walls freely\nwithout moving your player server-sided.");
        this.Y.a(new Ds[]{this.x});
        this.a(this.B, this.Y, this.x);
    }

    private boolean T() {
        return a.ib();
    }

    @Override
    public void a(kO kO2) {
        dX dX2 = kO2.getGuiScreen();
        if (dX2.a(A5.O) || dX2.a(A5.cn) || dX2.a(A5.B)) {
            this.d(false);
        }
    }

    @Override
    public void b(ke ke2) {
        if (ds.t().a() == null || this.T()) {
            return;
        }
        if (this.Y.u().booleanValue() && ds.t().a(-420).e()) {
            ds.t().a(-420, this.U);
            this.U.r(this.Q);
        }
        this.V();
        if (this.D.a(10L)) {
            this.Y();
            this.D.d();
        }
        this.W();
        if (manthe.V.c() == 13) {
            ds.a(null);
        }
        if (this.w == null) {
            this.w = new d8(a.grh());
        }
        if (!on.p.h()) {
            ds.t().g().a(this.w);
        }
    }

    @Override
    public void a(ke ke2) {
        if (ds.t().a() == null || this.T()) {
            return;
        }
        this.S();
        ds.k().t(ds.k().K());
        ds.k().u(ds.k().U());
        if (this.U != null) {
            eJ eJ2 = ds.k();
            this.U.a(eJ2.z(), cB.h ? eJ2.l() : eJ2.l() - 1.5, eJ2.g(), this.Q, this.H);
        }
        if (!on.p.h()) {
            ds.t().g().a(new d8(null));
        }
    }

    @Override
    public void a(ks ks2) {
        if (!this.T()) {
            return;
        }
        eJ eJ2 = ds.k();
        eJ2.i(true);
        if (eJ2.bg().f()) {
            ks2.setY(0.42f);
        } else if (eJ2.bg().g()) {
            ks2.setY(-0.42);
        } else {
            ks2.setY(0.0);
        }
        eJ2.l(ks2.getY());
        double d10 = this.B.a() / 5.0;
        double d11 = eJ2.bg().j();
        double d12 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d11 == 0.0 && d12 == 0.0) {
            ks2.setX(0.0);
            ks2.setZ(0.0);
        } else {
            if (d11 != 0.0) {
                if (d12 > 0.0) {
                    f10 += (float)(d11 > 0.0 ? -45 : 45);
                } else if (d12 < 0.0) {
                    f10 += (float)(d11 > 0.0 ? 45 : -45);
                }
                d12 = 0.0;
                d11 = d11 > 0.0 ? 1.0 : -1.0;
            }
            ks2.setX(d11 * d10 * Math.cos(Math.toRadians(f10 + 90.0f)) + d12 * d10 * Math.sin(Math.toRadians(f10 + 90.0f)));
            ks2.setZ(d11 * d10 * Math.sin(Math.toRadians(f10 + 90.0f)) - d12 * d10 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    @Override
    public void a(ky ky2) {
        if (!this.T() || ds.t().e()) {
            return;
        }
        if (this.U == null || this.U.e() || ds.t().a(-420).e()) {
            if (ky2.getPacket().a(A5.bN)) {
                if (this.K < 20) {
                    ky2.setPacket(f_.a(this.W));
                    ++this.K;
                } else {
                    if (cB.h) {
                        ky2.setPacket(ft.a(this.R, this.O, this.M, this.W));
                    } else {
                        double d10 = ds.k().s().l() - ds.k().l();
                        ky2.setPacket(ft.a(this.R, this.O + d10, this.O, this.M, this.W));
                    }
                    this.K = 0;
                }
            }
            return;
        }
        fn fn2 = ky2.getPacket();
        if (!this.E && (fn2.a(A5.bN) || fn2.a(A5.G) || fn2.a(A5.dE) || fn2.a(A5.bH))) {
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.x.u().booleanValue()) {
                if (Keyboard.isKeyDown((int)200)) {
                    f10 += 1.0f;
                }
                if (Keyboard.isKeyDown((int)208)) {
                    f10 -= 1.0f;
                }
                if (Keyboard.isKeyDown((int)203)) {
                    f11 += 1.0f;
                }
                if (Keyboard.isKeyDown((int)205)) {
                    f11 -= 1.0f;
                }
            }
            f11 = (float)((double)f11 * 0.98);
            f10 = (float)((double)f10 * 0.98);
            this.a(this.U, f11, f10);
            this.a(this.U, ky2);
        }
    }

    @Override
    public void a(kF kF2) {
        fn fn2;
        if (this.U == null || !this.T() || ds.t().e()) {
            return;
        }
        fn fn3 = kF2.getPacket();
        if (fn3.a(A5.U)) {
            fn2 = new fj(fn3.a());
            e2 e22 = this.U;
            double d10 = ((fj)fn2).k();
            double d11 = ((fj)fn2).i();
            double d12 = ((fj)fn2).l();
            float f10 = ((fj)fn2).g();
            float f11 = ((fj)fn2).j();
            if (manthe.V.c() > 13) {
                Set set = ((fj)fn2).h();
                for (Object e10 : set) {
                    fC fC2 = new fC(e10);
                    if (fC2.r() == fC.p()) {
                        d10 += e22.z();
                    } else {
                        e22.k(0.0);
                    }
                    if (fC2.r() == fC.n()) {
                        d11 += e22.l();
                    } else {
                        e22.l(0.0);
                    }
                    if (fC2.r() == fC.m()) {
                        d12 += e22.g();
                    } else {
                        e22.d(0.0);
                    }
                    if (fC2.r() == fC.q()) {
                        f11 += e22.K();
                    }
                    if (fC2.r() != fC.o()) continue;
                    f10 += e22.U();
                }
            }
            this.U.a(d10, d11, d12, f10, f11);
            this.E = true;
            ds.k().bp().a(cB.h ? fU.a(e22.z(), e22.Y().l(), e22.g(), e22.U(), e22.K(), false) : fU.a(e22.z(), e22.s().l(), e22.l(), e22.g(), e22.U(), e22.K(), false));
            this.E = false;
            kF2.a(true);
        }
        if (fn3.a(A5.cQ)) {
            fn2 = new f2(fn3.a());
            if (((f2)fn2).h() == ds.k().q()) {
                this.U.e((double)((f2)fn2).j() / 8000.0, (double)((f2)fn2).g() / 8000.0, (double)((f2)fn2).i() / 8000.0);
            }
        } else if (fn3.a(A5.cJ)) {
            fn2 = new fs(fn3.a());
            this.U.k(this.U.k() + (double)((fs)fn2).i());
            this.U.l(this.U.D() + (double)((fs)fn2).h());
            this.U.d(this.U.u() + (double)((fs)fn2).g());
        }
    }

    @Override
    public void s() {
        this.U();
        this.F = true;
        this.I = ds.s().v();
        ds.s().a(0);
        eJ eJ2 = ds.k();
        if (this.Y.u().booleanValue()) {
            this.U = e2.b(ds.t(), eJ2.aV());
            this.U.a(eJ2, true);
            this.X();
            ds.t().a(-420, this.U);
            this.K = eJ2.bh();
            this.A = eJ2.bi();
            this.G = eJ2.bl();
            this.T = eJ2.bo();
            this.X = eJ2.bj();
            this.v = eJ2.bk();
        }
        ds.G().f();
        if (this.T()) {
            this.V();
            this.K = 0;
        }
    }

    private void X() {
        eJ eJ2 = ds.k();
        this.U.r(eJ2.aP());
        this.U.e(eJ2.v());
        this.U.k(eJ2.k());
        this.U.l(eJ2.v() ? 0.0 : eJ2.D());
        this.U.d(eJ2.u());
        this.U.a(eJ2.z(), cB.h ? eJ2.l() : eJ2.s().l(), eJ2.g(), eJ2.U(), eJ2.K());
    }

    @Override
    public void J() {
        eJ eJ2 = ds.k();
        if (eJ2.e() || eJ2.i().e()) {
            this.U = null;
            return;
        }
        eJ2.i(this.Q);
        eJ2.d(this.H);
        if (this.T()) {
            this.S();
            if (this.U == null) {
                eJ2.k(0.0);
                eJ2.l(0.0);
                eJ2.d(0.0);
            } else {
                eJ2.k(this.U.k());
                eJ2.l(this.U.D());
                eJ2.d(this.U.u());
            }
        }
        ds.s().a(this.I);
        if (this.U != null) {
            ds.t().a(this.U);
        }
        this.U = null;
        eJ2.i(false);
        ds.G().f();
    }

    public void a(eC eC2, ky ky2) {
        double d10 = eC2.z() - this.T;
        double d11 = (cB.h ? eC2.Y().l() : eC2.s().l()) - this.X;
        double d12 = eC2.g() - this.v;
        double d13 = eC2.U() - this.A;
        double d14 = eC2.K() - this.G;
        boolean bl = d10 * d10 + d11 * d11 + d12 * d12 > 9.0E-4 || this.K >= 20;
        boolean bl2 = d13 != 0.0 || d14 != 0.0;
        this.E = true;
        if (eC2.m().e()) {
            if (bl && bl2) {
                ky2.setPacket(cB.h ? fU.a(eC2.z(), eC2.Y().l(), eC2.g(), eC2.U(), eC2.K(), eC2.v()) : fU.a(eC2.z(), eC2.s().l(), eC2.l(), eC2.g(), eC2.U(), eC2.K(), eC2.v()));
            } else if (bl) {
                ky2.setPacket(cB.h ? ft.a(eC2.z(), eC2.Y().l(), eC2.g(), eC2.v()) : ft.a(eC2.z(), eC2.s().l(), eC2.l(), eC2.g(), eC2.v()));
            } else if (bl2) {
                ky2.setPacket(fa.a(eC2.U(), eC2.K(), eC2.v()));
            } else {
                ky2.setPacket(f_.a(eC2.v()));
            }
        } else {
            ky2.setPacket(cB.h ? fU.a(eC2.k(), -999.0, eC2.u(), eC2.U(), eC2.K(), eC2.v()) : fU.a(eC2.z(), -999.0, -999.0, eC2.g(), eC2.U(), eC2.K(), eC2.v()));
            bl = false;
        }
        this.E = false;
        ++this.K;
        if (bl) {
            this.T = eC2.z();
            this.X = cB.h ? eC2.l() : eC2.s().l();
            this.v = eC2.g();
            this.K = 0;
        }
        if (bl2) {
            this.A = eC2.U();
            this.G = eC2.K();
        }
    }

    private dx a(bH bH2) {
        return ds.k().i().b(bH2.d(), bH2.c(), bH2.a());
    }

    public void a(eC eC2, float f10, float f11) {
        float f12;
        eC2.i(false);
        if (!eC2.H() || eC2.a8().h()) {
            if (!eC2.w() || eC2.a8().h()) {
                boolean bl;
                float f13 = 0.91f;
                if (eC2.v()) {
                    if (manthe.V.c() > 13) {
                        f13 = ds.t().a(g1.a(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.Y().l()) - 1, manthe.Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bH bH2 = new bH(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.s().l()) - 1, manthe.Y.c(eC2.g()));
                        f13 = this.a(bH2).f() * 0.91f;
                    }
                }
                float f14 = 0.16277136f / (f13 * f13 * f13);
                f12 = eC2.v() ? eC2.a6() * f14 : eC2.az();
                if (manthe.V.c() < 23) {
                    eC2.a(f10, f11, f12);
                }
                f13 = 0.91f;
                if (eC2.v()) {
                    if (manthe.V.c() > 13) {
                        f13 = ds.t().a(g1.a(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.Y().l()) - 1, manthe.Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bH bH3 = new bH(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.s().l()) - 1, manthe.Y.c(eC2.g()));
                        f13 = this.a(bH3).f() * 0.91f;
                    }
                }
                if (eC2.aQ()) {
                    boolean bl2;
                    float f15 = 0.15f;
                    eC2.k(manthe.Y.a(eC2.k(), (double)(-f15), (double)f15));
                    eC2.d(manthe.Y.a(eC2.u(), (double)(-f15), (double)f15));
                    eC2.j(0.0f);
                    if (eC2.D() < -0.15) {
                        eC2.l(-0.15);
                    }
                    if ((bl2 = eC2.af()) && eC2.D() < 0.0) {
                        eC2.l(0.0);
                    }
                }
                eC2.d(eC2.k(), eC2.D(), eC2.u());
                if (eC2.E() && eC2.aQ()) {
                    eC2.l(0.2);
                }
                if (manthe.V.c() > 13) {
                    bl = !ds.t().c(g1.a((int)eC2.z(), 0, (int)eC2.g())) || !ds.t().b(g1.a((int)eC2.z(), 0, (int)eC2.g())).f();
                } else {
                    boolean bl3 = bl = !ds.t().a((int)eC2.z(), 0, (int)eC2.g()) || !ds.t().b((int)eC2.z(), (int)eC2.g()).f();
                }
                if (ds.t().i() && bl) {
                    if (eC2.l() > 0.0) {
                        eC2.l(-0.1);
                    } else {
                        eC2.l(0.0);
                    }
                } else {
                    eC2.l(eC2.D() - 0.08);
                }
                eC2.l(eC2.D() * (double)0.98f);
                eC2.k(eC2.k() * (double)f13);
                eC2.d(eC2.u() * (double)f13);
            } else {
                double d10 = eC2.l();
                if (manthe.V.c() < 23) {
                    eC2.a(f10, f11, 0.02f);
                }
                eC2.d(eC2.k(), eC2.D(), eC2.u());
                eC2.k(eC2.k() * 0.5);
                eC2.l(eC2.D() * 0.5);
                eC2.d(eC2.u() * 0.5);
                eC2.l(eC2.D() - 0.02);
                if (eC2.E() && eC2.b(eC2.k(), eC2.D() + (double)0.6f - eC2.l() + d10, eC2.u())) {
                    eC2.l((double)0.3f);
                }
            }
        } else {
            float f16;
            double d11 = eC2.l();
            f12 = 0.8f;
            float f17 = 0.02f;
            float f18 = f16 = (float)manthe.V.c() > 13.0f ? (float)eq.a(eC2) : 0.0f;
            if (f16 > 3.0f) {
                f16 = 3.0f;
            }
            if (!eC2.v()) {
                f16 *= 0.5f;
            }
            if (f16 > 0.0f) {
                f12 += (0.54600006f - f12) * f16 / 3.0f;
                f17 += (eC2.a6() * 1.0f - f17) * f16 / 3.0f;
            }
            if (manthe.V.c() < 23) {
                eC2.a(f10, f11, f17);
            }
            eC2.d(eC2.k(), eC2.D(), eC2.u());
            eC2.k(eC2.k() * (double)f12);
            eC2.l(eC2.D() * (double)0.8f);
            eC2.d(eC2.u() * (double)f12);
            eC2.l(eC2.D() - 0.02);
            if (eC2.E() && eC2.b(eC2.k(), eC2.D() + (double)0.6f - eC2.l() + d11, eC2.u())) {
                eC2.l((double)0.3f);
            }
        }
        eC2.q(eC2.aL());
        double d12 = eC2.z() - eC2.aq();
        double d13 = eC2.g() - eC2.ap();
        float f19 = manthe.Y.e(d12 * d12 + d13 * d13) * 4.0f;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        eC2.p(eC2.aL() + (f19 - eC2.aL()) * 0.4f);
        eC2.l(eC2.aA() + eC2.aL());
    }

    private void U() {
        eJ eJ2 = ds.k();
        this.C = eJ2.z();
        this.V = eJ2.l();
        this.S = eJ2.g();
        this.J = eJ2.T();
        this.N = eJ2.R();
        this.u = eJ2.X();
        this.Q = eJ2.U();
        this.H = eJ2.K();
        this.W = eJ2.v();
        this.F = false;
    }

    @Override
    public void b(kt kt2) {
        if (this.T()) {
            return;
        }
        if (this.F) {
            this.U();
        }
        if (ds.x().d()) {
            return;
        }
        int n6 = ds.s().j().i();
        int n10 = ds.s().A().i();
        int n11 = ds.s().g().i();
        int n12 = ds.s().n().i();
        int n13 = ds.s().l().i();
        int n14 = ds.s().u().i();
        ei.a(n6, false);
        ei.a(n10, false);
        ei.a(n11, false);
        ei.a(n12, false);
        ei.a(n13, false);
        ei.a(n14, false);
    }

    @Override
    public void a(kt kt2) {
        if (this.T()) {
            return;
        }
        if (this.F) {
            this.U();
        }
    }

    private void W() {
        ds.k().h(this.C);
        ds.k().b(this.J);
        ds.k().i(this.V);
        ds.k().c(this.N);
        ds.k().e(this.S);
        ds.k().f(this.u);
    }

    private void V() {
        this.R = ds.k().z();
        this.y = ds.k().T();
        this.O = ds.k().l();
        this.L = ds.k().R();
        this.M = ds.k().g();
        this.z = ds.k().X();
    }

    private void S() {
        eJ eJ2 = ds.k();
        if (this.T() && this.U != null) {
            eJ2.i(this.U.U());
            eJ2.d(this.U.K());
            eJ2.g(this.K);
            eJ2.u(this.A);
            eJ2.t(this.G);
            eJ2.s(this.T);
            eJ2.u(this.X);
            eJ2.t(this.v);
            eJ2.h(this.U.z());
            eJ2.b(this.U.T());
            eJ2.i(this.U.l());
            eJ2.c(this.U.R());
            eJ2.e(this.U.g());
            eJ2.f(this.U.X());
            if (manthe.V.c() > 13) {
                eJ2.a(this.U.z(), this.U.l(), this.U.g(), this.U.U(), this.U.K());
            } else {
                eJ2.a(this.U.s());
            }
            eJ2.e(this.U.k(), this.U.D(), this.U.u());
        } else {
            eJ2.h(this.R);
            eJ2.b(this.y);
            eJ2.i(this.O);
            eJ2.c(this.L);
            eJ2.e(this.M);
            eJ2.f(this.z);
            eJ2.c(this.R, this.O, this.M);
        }
    }

    private void Y() {
        boolean bl;
        if (ds.x().d()) {
            return;
        }
        int n6 = ds.s().j().i();
        int n10 = ds.s().A().i();
        int n11 = ds.s().g().i();
        int n12 = ds.s().n().i();
        double d10 = this.B.a() / 5.0;
        if (cB.a(ds.s().l()) && ds.N()) {
            this.V += d10;
            this.N += d10;
        } else if (cB.a(ds.s().u()) && ds.N()) {
            this.V -= d10;
            this.N -= d10;
        }
        double d11 = ds.k().U() + 90.0f;
        boolean bl2 = Keyboard.isKeyDown((int)n6) && ds.N();
        boolean bl3 = Keyboard.isKeyDown((int)n10) && ds.N();
        boolean bl4 = Keyboard.isKeyDown((int)n11) && ds.N();
        boolean bl5 = bl = Keyboard.isKeyDown((int)n12) && ds.N();
        if (bl2) {
            if (bl4) {
                d11 -= 45.0;
            } else if (bl) {
                d11 += 45.0;
            }
        } else if (bl3) {
            d11 += 180.0;
            if (bl4) {
                d11 += 45.0;
            } else if (bl) {
                d11 -= 45.0;
            }
        } else if (bl4) {
            d11 -= 90.0;
        } else if (bl) {
            d11 += 90.0;
        }
        if (bl2 || bl4 || bl3 || bl) {
            this.C += Math.cos(Math.toRadians(d11)) * d10;
            this.S += Math.sin(Math.toRadians(d11)) * d10;
            this.J += Math.cos(Math.toRadians(d11)) * d10;
            this.u += Math.sin(Math.toRadians(d11)) * d10;
        }
    }

    @Override
    public void a(kU kU2) {
        if (kU2.getOverlayType().toString().toUpperCase().equals("BLOCK")) {
            kU2.getEvent().a(true);
        }
    }
}

