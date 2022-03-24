/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.Y;
import manthe.cB;
import manthe.cy;
import manthe.dp;
import manthe.ds;
import manthe.ej;
import manthe.ex;
import manthe.fP;
import manthe.g1;
import manthe.g4;
import manthe.gK;
import manthe.gO;
import manthe.gb;
import manthe.gg;
import manthe.on;
import manthe.zO;
import manthe.zZ;

public class v2 {
    private static zZ d = null;
    private static zO c = null;
    private static int b;

    public static void c() {
        if (d == null) {
            d = on.p.H().b(zZ.class);
            c = on.p.H().b(zO.class);
        }
        if (!d.N() && !c.N()) {
            return;
        }
        if (c.N() && v2.c.B.u().booleanValue()) {
            v2.b();
        } else {
            v2.d();
        }
    }

    private static void b() {
        ex ex2 = null;
        ex ex3 = null;
        gb gb2 = null;
        boolean bl = c.N() && v2.c.B.u() != false;
        boolean bl2 = false;
        if (ds.I().a() != null && ds.I().g().d() && !ds.I().g().equals(g4.g()) && !ds.I().g().equals(g4.f())) {
            if (!bl) {
                return;
            }
            ex2 = ds.M().h();
            ex3 = ds.A();
            gb2 = ds.I();
            bl2 = true;
        }
        if (ds.I().g().equals(g4.f()) && ds.I().i().d() && ds.I().i().a(A5.c4)) {
            return;
        }
        if (d.N() && !d.T().x().booleanValue() || c.N()) {
            float f10 = (float)d.V();
            double d10 = c.S();
            float f11 = 1.0f;
            ej ej2 = ds.B();
            gO gO2 = ds.t();
            dp dp2 = ds.K();
            if (ej2.d() && gO2.d()) {
                double d11;
                cy cy2;
                double d12;
                ex ex4 = new ex(null);
                ds.a(ex4);
                float f12 = dp2.j();
                gb gb3 = ej2.a((double)f12, f11);
                ds.a(gb3);
                gK gK2 = ej2.m(f11);
                boolean bl3 = false;
                if (dp2.i()) {
                    f12 = 6.0f;
                    d12 = 6.0;
                } else {
                    d12 = f10;
                    f12 = f10;
                    if ((double)f12 > 3.0) {
                        bl3 = true;
                    }
                }
                if (ds.I().d()) {
                    d12 = !dp2.i() ? ej2.a(4.5 + (double)(f12 - 3.0f), f11).k().a(gK2) : ej2.a((double)f12, f11).k().a(gK2);
                }
                if (d12 > 6.0) {
                    d12 = 6.0;
                }
                gK gK3 = ej2.o(f11);
                gK gK4 = gK2.a(gK3.g() * (double)f12, gK3.h() * (double)f12, gK3.f() * (double)f12);
                ex ex5 = new ex(null);
                ds.M().a(ex5);
                gK gK5 = null;
                float f13 = 1.0f;
                List list = gO2.a(ej2, ej2.s().e(gK3.g() * (double)f12, gK3.h() * (double)f12, gK3.f() * (double)f12).d(f13, f13, f13));
                double d13 = d12;
                if (bl && list.size() > 2) {
                    list = c.a(list, gK2, gK4);
                    if (bl2 && list.size() > 1) {
                        ds.M().a(ex2);
                        ds.a(ex3);
                        ds.a(gb2);
                        return;
                    }
                }
                for (int k = 0; k < list.size(); ++k) {
                    ex ex6 = new ex(list.get(k));
                    if (!ex6.V() || on.p.t().b(ex6)) continue;
                    if (ex6.a(A5.cF)) {
                        cy2 = new ej(ex6.a());
                        if (on.p.N().a((ej)cy2)) continue;
                    }
                    float f14 = (float)((double)ex6.r() + d10);
                    fP fP2 = ex6.s().d(f14, f14, f14);
                    gb gb4 = fP2.a(gK2, gK4);
                    if (fP2.a(gK2)) {
                        if (!(0.0 < d13) && d13 != 0.0) continue;
                        ds.M().a(ex6);
                        gK5 = gb4.e() ? new gK(gK2) : gb4.k();
                        d13 = 0.0;
                        continue;
                    }
                    if (!gb4.d()) continue;
                    d11 = gK2.a(gb4.k());
                    double d14 = d13;
                    if (!d.a(ex6)) {
                        d14 = Math.min(d13, 3.0);
                    }
                    if (!(d11 < d14) && d13 != 0.0) continue;
                    if (ex6.equals(ej2.m()) && !ex6.Q()) {
                        if (d13 != 0.0) continue;
                        ds.M().a(ex6);
                        gK5 = gb4.k();
                        continue;
                    }
                    ds.M().a(ex6);
                    gK5 = gb4.k();
                    d13 = d11;
                }
                ex ex7 = ds.M().h();
                if (V.c() > 13 && ex7.d()) {
                    boolean bl4 = d.a(ex7);
                    if (bl3) {
                        double d15 = gK2.a(gK5);
                        double d16 = bl4 ? (double)f10 : 3.0;
                        if (d15 > d16) {
                            ds.M().a(ex5);
                            cy2 = gb.a(g4.g(), gK5, new gg(null), g1.a(gK5));
                            ds.a((gb)cy2);
                            ex7 = ds.M().h();
                        }
                    }
                }
                if ((d13 < d12 || ds.I().e()) && !ex7.e()) {
                    if (gK5 != null && d10 > 0.0) {
                        double d17 = ex7.z();
                        double d18 = ex7.l();
                        d11 = ex7.g();
                        fP fP3 = ex7.Y().d(ex7.r(), ex7.r(), ex7.r());
                        double d19 = fP3.h() - d17;
                        double d20 = fP3.g() - d18;
                        double d21 = fP3.l() - d18;
                        double d22 = fP3.i() - d11;
                        double d23 = gK5.g() - d17;
                        double d24 = gK5.h() - d18;
                        double d25 = gK5.f() - d11;
                        double d26 = d19 * Y.a(d23 / (d19 + (double)((float)d10)), -1.0, 1.0);
                        double d27 = Y.a(d24 > 0.0 ? d24 / (double)((float)(d20 + d10)) : d24 / (d21 + (double)((float)d10)), -1.0, 1.0);
                        double d28 = d24 > 0.0 ? d20 * d27 : d21 * d27;
                        double d29 = d22 * Y.a(d25 / (d22 + (double)((float)d10)), -1.0, 1.0);
                        gK5 = gK.b(d17 + d26, d18 + d28, d11 + d29);
                    }
                    gb gb5 = gb.a(ex7, gK5);
                    ds.a(gb5);
                    if (A5.cF.isInstance(ex7) || A5.J.isInstance(ex7)) {
                        ds.a(ex7);
                    }
                }
                if (gb2 != null && ex3 != null && ex2 != null && bl && gb2.d() && ex3.d() && ex2.d() && ex7.e()) {
                    ds.M().a(ex2);
                    ds.a(ex3);
                    ds.a(gb2);
                }
            }
        }
    }

    private static void d() {
        if (cB.d()) {
            return;
        }
        if (d.N() && !d.T().x().booleanValue() || c.N()) {
            float f10 = (float)d.V();
            float f11 = c.S();
            float f12 = 1.0f;
            ej ej2 = ds.B();
            gO gO2 = ds.t();
            dp dp2 = ds.K();
            if (ej2.d() && gO2.d()) {
                cy cy2;
                ex ex2 = new ex(null);
                ds.a(ex2);
                float f13 = 4.5f;
                gb gb2 = ej2.a((double)f13, f12);
                ds.a(gb2);
                gK gK2 = ej2.m(f12);
                boolean bl = false;
                double d10 = f10;
                f13 = f10;
                if ((double)f13 > 3.0) {
                    bl = true;
                }
                if (ds.I().d()) {
                    d10 = ej2.a(4.5 + (double)(f13 - 3.0f), f12).k().a(gK2);
                }
                if (d10 > 6.0) {
                    d10 = 6.0;
                }
                gK gK3 = ej2.o(f12);
                gK gK4 = gK2.a(gK3.g() * (double)f13, gK3.h() * (double)f13, gK3.f() * (double)f13);
                ex ex3 = new ex(null);
                ds.M().a(ex3);
                gK gK5 = null;
                float f14 = 1.0f;
                List list = gO2.a(ej2, ej2.s().e(gK3.g() * (double)f13, gK3.h() * (double)f13, gK3.f() * (double)f13).d(f14, f14, f14));
                double d11 = d10;
                for (int k = 0; k < list.size(); ++k) {
                    double d12;
                    cy2 = new ex(list.get(k));
                    if (!((ex)cy2).V()) continue;
                    float f15 = ((ex)cy2).r() + f11;
                    fP fP2 = ((ex)cy2).s().d(f15, f15, f15);
                    gb gb3 = fP2.a(gK2, gK4);
                    if (fP2.a(gK2)) {
                        if (!(0.0 < d11) && d11 != 0.0) continue;
                        ds.M().a((ex)cy2);
                        gK5 = gb3.e() ? new gK(gK2) : gb3.k();
                        d11 = 0.0;
                        continue;
                    }
                    if (!gb3.d() || !((d12 = gK2.a(gb3.k())) < d11) && d11 != 0.0) continue;
                    if (cy2.equals(ej2.m()) && !((ex)cy2).Q()) {
                        if (d11 != 0.0) continue;
                        ds.M().a((ex)cy2);
                        gK5 = gb3.k();
                        continue;
                    }
                    ds.M().a((ex)cy2);
                    gK5 = gb3.k();
                    d11 = d12;
                }
                ex ex4 = ds.M().h();
                if (V.c() > 13 && ex4.d() && bl && gK2.a(gK5) > (double)f10) {
                    ds.M().a(ex3);
                    cy2 = gb.a(g4.g(), gK5, new gg(null), g1.a(gK5));
                    ds.a((gb)cy2);
                    ex4 = ds.M().h();
                }
                if ((d11 < d10 || ds.I().e()) && !ex4.e()) {
                    cy2 = gb.a(ex4, gK5);
                    ds.a((gb)cy2);
                    if (A5.cF.isInstance(ex4) || A5.J.isInstance(ex4)) {
                        ds.a(ex4);
                    }
                }
            }
        }
    }

    static {
        v2.b(0);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int e() {
        return b;
    }

    public static int a() {
        int n6 = v2.e();
        if (n6 == 0) {
            return 61;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

