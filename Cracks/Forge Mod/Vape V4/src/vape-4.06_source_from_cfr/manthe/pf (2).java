/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.V;
import manthe.Y;
import manthe.bK;
import manthe.bf;
import manthe.cB;
import manthe.cy;
import manthe.dJ;
import manthe.ds;
import manthe.dx;
import manthe.dy;
import manthe.e2;
import manthe.eC;
import manthe.eg;
import manthe.ej;
import manthe.ex;
import manthe.fG;
import manthe.fP;
import manthe.fS;
import manthe.gK;
import manthe.gb;
import manthe.on;
import manthe.v2;

public class pf {
    private static final boolean a = V.c() > 13;

    public static int b(ex ex2, ex ex3) {
        double d10 = 0.0;
        double d11 = ex3.z() - ex2.z();
        double d12 = ex3.g() - ex2.g();
        if (d12 > 0.0 && d11 > 0.0) {
            d10 = Math.toDegrees(-Math.atan(d11 / d12));
        } else if (d12 > 0.0 && d11 < 0.0) {
            d10 = Math.toDegrees(-Math.atan(d11 / d12));
        } else if (d12 < 0.0 && d11 > 0.0) {
            d10 = -90.0 + Math.toDegrees(Math.atan(d12 / d11));
        } else if (d12 < 0.0 && d11 < 0.0) {
            d10 = 90.0 + Math.toDegrees(Math.atan(d12 / d11));
        }
        int n6 = (int)(Math.abs(d10 - (double)ex2.U()) % 360.0);
        return n6 > 180 ? 360 - n6 : n6;
    }

    public static double b(double d10, double d11, double d12, double d13, double d14) {
        double d15 = 0.0;
        double d16 = d13 - d10;
        double d17 = d14 - d11;
        if (d17 > 0.0 && d16 > 0.0) {
            d15 = Math.toDegrees(-Math.atan(d16 / d17));
        } else if (d17 > 0.0 && d16 < 0.0) {
            d15 = Math.toDegrees(-Math.atan(d16 / d17));
        } else if (d17 < 0.0 && d16 > 0.0) {
            d15 = -90.0 + Math.toDegrees(Math.atan(d17 / d16));
        } else if (d17 < 0.0 && d16 < 0.0) {
            d15 = 90.0 + Math.toDegrees(Math.atan(d17 / d16));
        }
        double d18 = Math.abs(d15 - d12) % 360.0;
        double d19 = d18 > 180.0 ? 360.0 - d18 : d18;
        return d19;
    }

    public static double a(ex ex2, double d10, double d11) {
        return pf.b(ex2.z(), ex2.g(), ex2.U(), d10, d11);
    }

    public static int a(ex ex2, ex ex3) {
        double d10 = ex3.z() - ex2.z();
        double d11 = ex3.l() - ex2.l() + (double)(ex3.n() / 2.0f) + 0.2;
        if (V.c() > 13) {
            d11 = ex3.l() - 0.3 - ex2.l();
        }
        double d12 = ex3.g() - ex2.g();
        double d13 = Y.e(d10 * d10 + d12 * d12);
        float f10 = (float)(-(Math.atan2(d11, d13) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex2.K() - f10));
        return (int)f11;
    }

    public static int a(ex ex2, double d10, double d11, double d12) {
        double d13 = d10 - ex2.z();
        double d14 = d11 - ex2.l();
        if (V.c() > 13) {
            d14 = d11 - 0.3 - ex2.l();
        }
        double d15 = d12 - ex2.g();
        double d16 = Y.e(d13 * d13 + d15 * d15);
        float f10 = (float)(-(Math.atan2(d14, d16) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex2.K() - f10));
        return (int)f11;
    }

    public static boolean c(ex ex2) {
        if (ex2 instanceof ej) {
            ej ej2 = (ej)ex2;
            return ex2.j() || ej2.aD() <= 0.0f;
        }
        return ex2.j();
    }

    public static boolean a(double d10, double d11, double d12, double d13, double d14) {
        double d15 = 0.0;
        double d16 = d13 - d10;
        double d17 = d14 - d11;
        if (d17 > 0.0 && d16 > 0.0) {
            d15 = Math.toDegrees(-Math.atan(d16 / d17));
        } else if (d17 > 0.0 && d16 < 0.0) {
            d15 = Math.toDegrees(-Math.atan(d16 / d17));
        } else if (d17 < 0.0 && d16 > 0.0) {
            d15 = -90.0 + Math.toDegrees(Math.atan(d17 / d16));
        } else if (d17 < 0.0 && d16 < 0.0) {
            d15 = 90.0 + Math.toDegrees(Math.atan(d17 / d16));
        }
        int n6 = (int)Y.a((d15 - d12) % 360.0);
        return n6 < 0;
    }

    public static boolean b(ex ex2, double d10, double d11) {
        return pf.a(ex2.z(), ex2.g(), (double)ex2.U(), d10, d11);
    }

    public static boolean c(ex ex2, ex ex3) {
        double d10 = ex3.z() - ex2.z();
        double d11 = ex3.l() - ex2.l() + (double)(ex3.n() / 2.0f) + 0.2;
        if (V.c() > 13) {
            d11 = ex3.l() - 0.3 - ex2.l();
        }
        double d12 = ex3.g() - ex2.g();
        double d13 = Y.e(d10 * d10 + d12 * d12);
        float f10 = (float)(-(Math.atan2(d11, d13) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex2.K() - f10));
        return f11 < 0.0f;
    }

    public static boolean c(ex ex2, double d10, double d11, double d12) {
        double d13 = d10 - ex2.z();
        double d14 = d11 - ex2.l();
        if (V.c() > 13) {
            d14 = d11 - 0.3 - ex2.l();
        }
        double d15 = d12 - ex2.g();
        double d16 = Y.e(d13 * d13 + d15 * d15);
        float f10 = (float)(-(Math.atan2(d14, d16) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex2.K() - f10));
        return (int)f11 < 0;
    }

    public static ej a(double d10, float f10, float f11, float f12) {
        if (ds.B().a() != null && ds.t().a() != null) {
            ej ej2 = ds.B();
            e2 e22 = e2.b(ej2.i(), ds.k().aV());
            e22.f(f11);
            e22.e(f12);
            e22.i(f11);
            e22.d(f12);
            return pf.a(d10, f10, ej2, e22);
        }
        return null;
    }

    public static ej a(double d10, float f10) {
        if (ds.B().a() != null && ds.t().a() != null) {
            return pf.a(d10, f10, ds.B(), ds.B());
        }
        return null;
    }

    public static ej a(double d10, float f10, ej ej2, ej ej3) {
        cy cy2 = null;
        if (ds.B().a() != null && ds.t().a() != null) {
            ej ej4;
            double d11 = d10;
            double d12 = d10;
            gK gK2 = ej2.m(0.0f);
            gK gK3 = ej3.o(0.0f);
            gK gK4 = gK2.a(gK3.g() * d11, gK3.h() * d11, gK3.f() * d11);
            float f11 = 1.0f;
            List list = ds.t().a(ej2, ej2.s().e(gK3.g() * d11, gK3.h() * d11, gK3.f() * d11).d(f11, f11, f11));
            double d13 = d12;
            for (int k = 0; k < list.size(); ++k) {
                double d14;
                ex ex2 = new ex(list.get(k));
                if (!ex2.V()) continue;
                float f12 = ex2.r() + f10;
                fP fP2 = ex2.s().d(f12, f12, f12);
                gb gb2 = fP2.a(gK2, gK4);
                if (fP2.a(gK2)) {
                    if (!(0.0 < d13) && d13 != 0.0) continue;
                    cy2 = ex2;
                    d13 = 0.0;
                    continue;
                }
                if (gb2.a() == null || !((d14 = gK2.a(gb2.k())) < d13) && d13 != 0.0) continue;
                if (ex2.a() == ej2.m().a() && !ex2.Q()) {
                    if (d13 != 0.0) continue;
                    cy2 = ex2;
                    continue;
                }
                cy2 = ex2;
                d13 = d14;
            }
            if (cy2 != null && (d13 < d12 || ds.I().a() == null) && ds.k().c((ex)cy2) && A5.cF.isInstance(cy2.a()) && !(ej4 = new ej(cy2.a())).j()) {
                return ej4;
            }
        }
        return null;
    }

    public static double b(ex ex2, double d10, double d11, double d12) {
        double d13 = ex2.z() - d10;
        double d14 = ex2.l() - d11;
        double d15 = ex2.g() - d12;
        return Y.e(d13 * d13 + d14 * d14 + d15 * d15);
    }

    public static double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d10 - d13;
        double d17 = d11 - d14;
        double d18 = d12 - d15;
        return Y.e(d16 * d16 + d17 * d17 + d18 * d18);
    }

    public static boolean b(ej ej2) {
        if (ej2 == null) {
            return false;
        }
        if (A5.cc.isInstance(ej2)) {
            eC eC2 = (eC)ej2;
            boolean bl = false;
            for (Object object : eC2.aU().g()) {
                fG fG2 = new fG(object);
                if (fG2.e()) continue;
                bl = true;
            }
            return ej2.ae() && ej2.aG().e() && !bl;
        }
        return ej2.ae() && ej2.aG().e();
    }

    public static boolean a(ej ej2) {
        if (ej2.e()) {
            return false;
        }
        if (ej2.a(A5.cc)) {
            eC eC2 = new eC(ej2);
            boolean bl = false;
            for (Object object : eC2.aU().g()) {
                if (object == null) continue;
                if (V.c() >= 23) {
                    fG fG2 = new fG(object);
                    if (fG2.k().h() == 0) continue;
                    bl = true;
                    continue;
                }
                bl = true;
            }
            return ej2.aG().e() && !bl;
        }
        return false;
    }

    public static void a() {
        v2.c();
    }

    public static boolean a(ej ej2, ej ej3, double d10) {
        return pf.a(ej2, ej3, 6.0, d10, 360.0);
    }

    public static boolean a(ej ej2, ej ej3, double d10, double d11, double d12) {
        boolean bl;
        boolean bl2 = bl = ej3.j() || ej3.S().equals("") || (double)ej2.a(ej3) > d10 || !ej2.c(ej3);
        if (bl) {
            return false;
        }
        int n6 = pf.b(ej3, ej2);
        int n10 = pf.a((ex)ej3, ej2);
        return (double)n6 < d11 && (double)n10 < d12;
    }

    public static boolean f(ex ex2) {
        if (ex2.a(A5.cF)) {
            return !pf.d(ex2) && !ex2.a(A5.cc);
        }
        return false;
    }

    public static boolean d(ex ex2) {
        if (ex2.a(A5.cF)) {
            return ex2.a(A5.bc);
        }
        return false;
    }

    public static boolean b(ex ex2, double d10, double d11, boolean bl) {
        for (Object e10 : ds.t().j()) {
            e2 e22;
            if (!A5.L.isInstance(e10) || (e22 = new e2(e10)).equals(ex2) || bl && on.p.N().a(e22) || (double)e22.a(ex2) >= d10 || !((double)pf.b(e22, ex2) < d11)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(ex ex2) {
        return pf.b(ex2, 6.0, 60.0, true);
    }

    public static boolean a(ex ex2, double d10, double d11, boolean bl) {
        for (Object e10 : ds.t().j()) {
            e2 e22;
            if (!A5.L.isInstance(e10) || (e22 = new e2(e10)).equals(ex2) || bl && on.p.N().a(e22) || (double)e22.a(ex2) >= d10 || !((double)pf.b(ex2, e22) < d11)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(ex ex2) {
        return pf.a(ex2, 6.0, 60.0, true);
    }

    public static boolean a(ex ex2) {
        return ex2.k() == 0.0 && ex2.u() == 0.0;
    }

    public static int a(ex ex2, int n6, boolean bl) {
        int n10 = 0;
        for (Object e10 : ds.t().j()) {
            if (!A5.L.isInstance(e10)) continue;
            e2 e22 = new e2(e10);
            if (bl && on.p.N().a(e22) || !(e22.a(ex2) <= (float)n6)) continue;
            ++n10;
        }
        return n10;
    }

    public static int a(ex ex2, int n6) {
        return pf.a(ex2, n6, true);
    }

    public static double d(ex ex2, ex ex3) {
        double d10 = ex2.a(ex3);
        double d11 = Math.cos(Math.toRadians(ex2.U() + 90.0f)) * d10;
        double d12 = Math.sin(Math.toRadians(ex2.U() + 90.0f)) * d10;
        double d13 = ex2.z() + d11;
        double d14 = ex2.g() + d12;
        return pf.a(d13, 0.0, d14, ex3.z(), 0.0, ex3.g());
    }

    public static bK b(fP fP2) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        for (int k = n12; k > n11; --k) {
            for (int i10 = n6; i10 < n10; ++i10) {
                for (int i11 = n13; i11 < n14; ++i11) {
                    dx dx2 = ds.t().b(i10, k, i11);
                    dJ dJ2 = dx2.h();
                    if (!dJ2.g()) continue;
                    return new bK(i10, k, i11);
                }
            }
        }
        return null;
    }

    public static bf a(fP fP2) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        for (int k = n12; k > n11; --k) {
            for (int i10 = n6; i10 < n10; ++i10) {
                for (int i11 = n13; i11 < n14; ++i11) {
                    dx dx2 = ds.t().b(i10, k, i11);
                    dJ dJ2 = dx2.h();
                    if (!dJ2.g()) continue;
                    return new bf(i10, k, i11, 0);
                }
            }
        }
        return null;
    }

    public static float a(double d10, double d11, double d12, double d13) {
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        float f10 = (float)Math.toDegrees(-Math.atan(d14 / d15));
        if (d15 < 0.0 && d14 < 0.0) {
            f10 = (float)(90.0 + Math.toDegrees(Math.atan(d15 / d14)));
        } else if (d15 < 0.0 && d14 > 0.0) {
            f10 = (float)(-90.0 + Math.toDegrees(Math.atan(d15 / d14)));
        }
        return f10;
    }

    public static int a(eC eC2) {
        int n6 = 0;
        if (cB.h) {
            fS fS2 = ds.k().bp();
            List list = dy.f().a(fS2.g());
            for (Object e10 : list) {
                eg eg2 = new eg(e10);
                if (!eg2.f().d() || !eC2.aV().equals(eg2.f()) && !eC2.S().equals(eg2.f().f())) continue;
                n6 = Math.max(eg2.g(), 0);
                break;
            }
        }
        return n6;
    }

    public static double a(int n6, int n10, int n11, int n12) {
        double d10 = n6 - n11;
        double d11 = n10 - n12;
        return Math.sqrt(d10 * d10 + d11 * d11);
    }
}

