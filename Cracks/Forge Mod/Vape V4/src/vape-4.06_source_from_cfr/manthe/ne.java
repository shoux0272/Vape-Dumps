/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.Y;
import manthe.bH;
import manthe.dL;
import manthe.ds;
import manthe.eC;
import manthe.eq;
import manthe.g1;
import manthe.gS;

public class ne {
    public static void a(eC eC2) {
        if (Math.abs(eC2.k()) < 0.005) {
            eC2.k(0.0);
        }
        if (Math.abs(eC2.D()) < 0.005) {
            eC2.l(0.0);
        }
        if (Math.abs(eC2.u()) < 0.005) {
            eC2.d(0.0);
        }
        eC2.k(eC2.ay() * 0.98f);
        eC2.n(eC2.aF() * 0.98f);
        ne.a(eC2, eC2.z() - (double)eC2.A() * 0.35, eC2.Y().l() + 0.5, eC2.g() + (double)eC2.A() * 0.35);
        ne.a(eC2, eC2.z() - (double)eC2.A() * 0.35, eC2.Y().l() + 0.5, eC2.g() - (double)eC2.A() * 0.35);
        ne.a(eC2, eC2.z() + (double)eC2.A() * 0.35, eC2.Y().l() + 0.5, eC2.g() - (double)eC2.A() * 0.35);
        ne.a(eC2, eC2.z() + (double)eC2.A() * 0.35, eC2.Y().l() + 0.5, eC2.g() + (double)eC2.A() * 0.35);
        ne.a(eC2, eC2.ay(), eC2.aF());
    }

    public static void a(eC eC2, float f10, float f11) {
        gS gS2 = ds.k().i();
        eC2.i(false);
        if (!eC2.H() || eC2.a8().h()) {
            if (!eC2.w() || eC2.a8().h()) {
                boolean bl;
                float f12 = 0.91f;
                if (eC2.v()) {
                    if (V.c() > 13) {
                        f12 = gS2.a(g1.a(Y.c(eC2.z()), Y.c(eC2.Y().l()) - 1, Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bH bH2 = new bH(Y.c(eC2.z()), Y.c(eC2.s().l()) - 1, Y.c(eC2.g()));
                        f12 = gS2.b(bH2.d(), bH2.c(), bH2.a()).f() * 0.91f;
                    }
                }
                float f13 = 0.16277136f / (f12 * f12 * f12);
                float f14 = eC2.v() ? eC2.a6() * f13 : eC2.az();
                if (V.c() < 23) {
                    eC2.a(f10, f11, f14);
                }
                f12 = 0.91f;
                if (eC2.v()) {
                    if (V.c() > 13) {
                        f12 = gS2.a(g1.a(Y.c(eC2.z()), Y.c(eC2.Y().l()) - 1, Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bH bH3 = new bH(Y.c(eC2.z()), Y.c(eC2.s().l()) - 1, Y.c(eC2.g()));
                        f12 = gS2.b(bH3.d(), bH3.c(), bH3.a()).f() * 0.91f;
                    }
                }
                if (eC2.aQ()) {
                    boolean bl2;
                    float f15 = 0.15f;
                    eC2.k(Y.a(eC2.k(), (double)(-f15), (double)f15));
                    eC2.d(Y.a(eC2.u(), (double)(-f15), (double)f15));
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
                if (V.c() > 13) {
                    bl = !gS2.c(g1.a((int)eC2.z(), 0, (int)eC2.g())) || !gS2.b(g1.a((int)eC2.z(), 0, (int)eC2.g())).f();
                } else {
                    boolean bl3 = bl = !gS2.a((int)eC2.z(), 0, (int)eC2.g()) || !gS2.b((int)eC2.z(), (int)eC2.g()).f();
                }
                if (gS2.i() && bl) {
                    if (eC2.l() > 0.0) {
                        eC2.l(-0.1);
                    } else {
                        eC2.l(0.0);
                    }
                } else {
                    eC2.l(eC2.D() - 0.08);
                }
                eC2.l(eC2.D() * (double)0.98f);
                eC2.k(eC2.k() * (double)f12);
                eC2.d(eC2.u() * (double)f12);
            } else {
                double d10 = eC2.l();
                if (V.c() < 23) {
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
            float f17 = 0.8f;
            float f18 = 0.02f;
            float f19 = f16 = (float)V.c() > 13.0f ? (float)eq.a(eC2) : 0.0f;
            if (f16 > 3.0f) {
                f16 = 3.0f;
            }
            if (!eC2.v()) {
                f16 *= 0.5f;
            }
            if (f16 > 0.0f) {
                f17 += (0.54600006f - f17) * f16 / 3.0f;
                f18 += (eC2.a6() * 1.0f - f18) * f16 / 3.0f;
            }
            if (V.c() < 23) {
                eC2.a(f10, f11, f18);
            }
            eC2.d(eC2.k(), eC2.D(), eC2.u());
            eC2.k(eC2.k() * (double)f17);
            eC2.l(eC2.D() * (double)0.8f);
            eC2.d(eC2.u() * (double)f17);
            eC2.l(eC2.D() - 0.02);
            if (eC2.E() && eC2.b(eC2.k(), eC2.D() + (double)0.6f - eC2.l() + d11, eC2.u())) {
                eC2.l((double)0.3f);
            }
        }
    }

    public static void a(eC eC2, double d10, double d11, double d12) {
        g1 g12 = g1.a(d10, d11, d12);
        double d13 = d10 - (double)g12.h();
        double d14 = d12 - (double)g12.g();
        if (!ne.a(g12)) {
            int n6 = -1;
            double d15 = 9999.0;
            if (ne.a(g12.m()) && d13 < d15) {
                d15 = d13;
                n6 = 0;
            }
            if (ne.a(g12.j()) && 1.0 - d13 < d15) {
                d15 = 1.0 - d13;
                n6 = 1;
            }
            if (ne.a(g12.n()) && d14 < d15) {
                d15 = d14;
                n6 = 4;
            }
            if (ne.a(g12.i()) && 1.0 - d14 < d15) {
                d15 = 1.0 - d14;
                n6 = 5;
            }
            float f10 = 0.1f;
            if (n6 == 0) {
                eC2.k((double)(-f10));
            }
            if (n6 == 1) {
                eC2.k((double)f10);
            }
            if (n6 == 4) {
                eC2.d((double)(-f10));
            }
            if (n6 == 5) {
                eC2.d((double)f10);
            }
        }
    }

    private static boolean a(g1 g12) {
        gS gS2 = ds.k().i();
        dL dL2 = null;
        if (V.c() >= 23) {
            dL2 = gS2.a(g12);
        }
        dL dL3 = null;
        if (V.c() >= 23) {
            dL3 = gS2.a(g12.k());
        }
        return !gS2.a(g12).f().b(dL2) && !gS2.a(g12.k()).f().b(dL3);
    }
}

