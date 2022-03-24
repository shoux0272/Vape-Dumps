/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgrseiReSqtkUVg {
    private static boolean a = iReSqtkUVgauSiReSqtkUVg.d() > 13;
    private static iReSqtkUVgxHBiReSqtkUVg b = null;
    private static iReSqtkUVggHniReSqtkUVg c = null;

    public static int a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg3) {
        double d2 = 0.0;
        double d3 = iReSqtkUVgjSjiReSqtkUVg3.z() - iReSqtkUVgjSjiReSqtkUVg2.z();
        double d4 = iReSqtkUVgjSjiReSqtkUVg3.B() - iReSqtkUVgjSjiReSqtkUVg2.B();
        if (d4 > 0.0 && d3 > 0.0) {
            d2 = Math.toDegrees(-Math.atan(d3 / d4));
        } else if (d4 > 0.0 && d3 < 0.0) {
            d2 = Math.toDegrees(-Math.atan(d3 / d4));
        } else if (d4 < 0.0 && d3 > 0.0) {
            d2 = -90.0 + Math.toDegrees(Math.atan(d4 / d3));
        } else if (d4 < 0.0 && d3 < 0.0) {
            d2 = 90.0 + Math.toDegrees(Math.atan(d4 / d3));
        }
        int n = (int)(Math.abs(d2 - (double)iReSqtkUVgjSjiReSqtkUVg2.F()) % 360.0);
        return n > 180 ? 360 - n : n;
    }

    public static double a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, double d3) {
        double d4 = 0.0;
        double d5 = d2 - iReSqtkUVgjSjiReSqtkUVg2.z();
        double d6 = d3 - iReSqtkUVgjSjiReSqtkUVg2.B();
        if (d6 > 0.0 && d5 > 0.0) {
            d4 = Math.toDegrees(-Math.atan(d5 / d6));
        } else if (d6 > 0.0 && d5 < 0.0) {
            d4 = Math.toDegrees(-Math.atan(d5 / d6));
        } else if (d6 < 0.0 && d5 > 0.0) {
            d4 = -90.0 + Math.toDegrees(Math.atan(d6 / d5));
        } else if (d6 < 0.0 && d5 < 0.0) {
            d4 = 90.0 + Math.toDegrees(Math.atan(d6 / d5));
        }
        double d7 = Math.abs(d4 - (double)iReSqtkUVgjSjiReSqtkUVg2.F()) % 360.0;
        double d8 = d7 > 180.0 ? 360.0 - d7 : d7;
        return d8;
    }

    public static int b(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg3) {
        double d2 = iReSqtkUVgjSjiReSqtkUVg3.z() - iReSqtkUVgjSjiReSqtkUVg2.z();
        double d3 = iReSqtkUVgjSjiReSqtkUVg3.A() - iReSqtkUVgjSjiReSqtkUVg2.A() + (double)(iReSqtkUVgjSjiReSqtkUVg3.T() / 2.0f) + 0.2;
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            d3 = iReSqtkUVgjSjiReSqtkUVg3.A() - 0.3 - iReSqtkUVgjSjiReSqtkUVg2.A();
        }
        double d4 = iReSqtkUVgjSjiReSqtkUVg3.B() - iReSqtkUVgjSjiReSqtkUVg2.B();
        double d5 = iReSqtkUVgKexiReSqtkUVg.a(d2 * d2 + d4 * d4);
        float f = (float)(-(Math.atan2(d3, d5) * 180.0 / Math.PI));
        float f2 = (float)iReSqtkUVgKexiReSqtkUVg.g((double)(iReSqtkUVgjSjiReSqtkUVg2.G() - f));
        return (int)f2;
    }

    public static boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        if (iReSqtkUVgjSjiReSqtkUVg2 instanceof iReSqtkUVgVnKiReSqtkUVg) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = (iReSqtkUVgVnKiReSqtkUVg)iReSqtkUVgjSjiReSqtkUVg2;
            return iReSqtkUVgjSjiReSqtkUVg2.K() || iReSqtkUVgVnKiReSqtkUVg2.aF() <= 0.0f;
        }
        return iReSqtkUVgjSjiReSqtkUVg2.K();
    }

    public static boolean b(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, double d3) {
        double d4 = 0.0;
        double d5 = d2 - iReSqtkUVgjSjiReSqtkUVg2.z();
        double d6 = d3 - iReSqtkUVgjSjiReSqtkUVg2.B();
        if (d6 > 0.0 && d5 > 0.0) {
            d4 = Math.toDegrees(-Math.atan(d5 / d6));
        } else if (d6 > 0.0 && d5 < 0.0) {
            d4 = Math.toDegrees(-Math.atan(d5 / d6));
        } else if (d6 < 0.0 && d5 > 0.0) {
            d4 = -90.0 + Math.toDegrees(Math.atan(d6 / d5));
        } else if (d6 < 0.0 && d5 < 0.0) {
            d4 = 90.0 + Math.toDegrees(Math.atan(d6 / d5));
        }
        int n = (int)iReSqtkUVgKexiReSqtkUVg.g((d4 - (double)iReSqtkUVgjSjiReSqtkUVg2.F()) % 360.0);
        return n < 0;
    }

    public static boolean c(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg3) {
        double d2 = iReSqtkUVgjSjiReSqtkUVg3.z() - iReSqtkUVgjSjiReSqtkUVg2.z();
        double d3 = iReSqtkUVgjSjiReSqtkUVg3.A() - iReSqtkUVgjSjiReSqtkUVg2.A() + (double)(iReSqtkUVgjSjiReSqtkUVg3.T() / 2.0f) + 0.2;
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            d3 = iReSqtkUVgjSjiReSqtkUVg3.A() - 0.3 - iReSqtkUVgjSjiReSqtkUVg2.A();
        }
        double d4 = iReSqtkUVgjSjiReSqtkUVg3.B() - iReSqtkUVgjSjiReSqtkUVg2.B();
        double d5 = iReSqtkUVgKexiReSqtkUVg.a(d2 * d2 + d4 * d4);
        float f = (float)(-(Math.atan2(d3, d5) * 180.0 / Math.PI));
        float f2 = (float)iReSqtkUVgKexiReSqtkUVg.g((double)(iReSqtkUVgjSjiReSqtkUVg2.G() - f));
        return f2 < 0.0f;
    }

    public static iReSqtkUVgVnKiReSqtkUVg a(double d2, float f, float f2, float f3) {
        if (iReSqtkUVgeLLiReSqtkUVg.j().a() != null && iReSqtkUVgeLLiReSqtkUVg.g().a() != null) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.j();
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = iReSqtkUVgtBCiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2.ag(), iReSqtkUVgeLLiReSqtkUVg.e().be());
            iReSqtkUVgtBCiReSqtkUVg2.h(f2);
            iReSqtkUVgtBCiReSqtkUVg2.i(f3);
            iReSqtkUVgtBCiReSqtkUVg2.f(f2);
            iReSqtkUVgtBCiReSqtkUVg2.g(f3);
            return iReSqtkUVgrseiReSqtkUVg.a(d2, f, iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgtBCiReSqtkUVg2);
        }
        return null;
    }

    public static iReSqtkUVgVnKiReSqtkUVg a(double d2, float f) {
        if (iReSqtkUVgeLLiReSqtkUVg.j().a() != null && iReSqtkUVgeLLiReSqtkUVg.g().a() != null) {
            return iReSqtkUVgrseiReSqtkUVg.a(d2, f, iReSqtkUVgeLLiReSqtkUVg.j(), iReSqtkUVgeLLiReSqtkUVg.j());
        }
        return null;
    }

    public static iReSqtkUVgVnKiReSqtkUVg a(double d2, float f, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3) {
        iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2 = null;
        if (iReSqtkUVgeLLiReSqtkUVg.j().a() != null && iReSqtkUVgeLLiReSqtkUVg.g().a() != null) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg4;
            double d3 = d2;
            double d4 = d2;
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgVnKiReSqtkUVg2.p(0.0f);
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgVnKiReSqtkUVg3.q(0.0f);
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg4 = iReSqtkUVgUjriReSqtkUVg2.b(iReSqtkUVgUjriReSqtkUVg3.d() * d3, iReSqtkUVgUjriReSqtkUVg3.e() * d3, iReSqtkUVgUjriReSqtkUVg3.f() * d3);
            float f2 = 1.0f;
            List list = iReSqtkUVgeLLiReSqtkUVg.g().a(iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2.V().a(iReSqtkUVgUjriReSqtkUVg3.d() * d3, iReSqtkUVgUjriReSqtkUVg3.e() * d3, iReSqtkUVgUjriReSqtkUVg3.f() * d3).b(f2, f2, f2));
            double d5 = d4;
            for (int i = 0; i < list.size(); ++i) {
                double d6;
                iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(list.get(i));
                if (!iReSqtkUVgjSjiReSqtkUVg2.W()) continue;
                float f3 = iReSqtkUVgjSjiReSqtkUVg2.X() + f;
                iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.V().b(f3, f3, f3);
                iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgmXTiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg2, iReSqtkUVgUjriReSqtkUVg4);
                if (iReSqtkUVgmXTiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg2)) {
                    if (!(0.0 < d5) && d5 != 0.0) continue;
                    iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2;
                    d5 = 0.0;
                    continue;
                }
                if (iReSqtkUVgVjsiReSqtkUVg2.a() == null || !((d6 = iReSqtkUVgUjriReSqtkUVg2.b(iReSqtkUVgVjsiReSqtkUVg2.e())) < d5) && d5 != 0.0) continue;
                if (iReSqtkUVgjSjiReSqtkUVg2.a() == iReSqtkUVgVnKiReSqtkUVg2.Y().a() && !iReSqtkUVgjSjiReSqtkUVg2.Z()) {
                    if (d5 != 0.0) continue;
                    iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2;
                    continue;
                }
                iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2;
                d5 = d6;
            }
            if (iReSqtkUVgbBTiReSqtkUVg2 != null && (d5 < d4 || iReSqtkUVgeLLiReSqtkUVg.l().a() == null) && iReSqtkUVgeLLiReSqtkUVg.e().b((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg2) && iReSqtkUVgSzRiReSqtkUVg.n.isInstance(iReSqtkUVgbBTiReSqtkUVg2.a()) && !(iReSqtkUVgVnKiReSqtkUVg4 = new iReSqtkUVgVnKiReSqtkUVg(iReSqtkUVgbBTiReSqtkUVg2.a())).K()) {
                return iReSqtkUVgVnKiReSqtkUVg4;
            }
        }
        return null;
    }

    public static double a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, double d3, double d4) {
        double d5 = iReSqtkUVgjSjiReSqtkUVg2.z() - d2;
        double d6 = iReSqtkUVgjSjiReSqtkUVg2.A() - d3;
        double d7 = iReSqtkUVgjSjiReSqtkUVg2.B() - d4;
        return iReSqtkUVgKexiReSqtkUVg.a(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public static double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        return iReSqtkUVgKexiReSqtkUVg.a(d8 * d8 + d9 * d9 + d10 * d10);
    }

    public static boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        if (iReSqtkUVgVnKiReSqtkUVg2 == null) {
            return false;
        }
        if (iReSqtkUVgSzRiReSqtkUVg.d.isInstance(iReSqtkUVgVnKiReSqtkUVg2)) {
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = (iReSqtkUVgDfKiReSqtkUVg)iReSqtkUVgVnKiReSqtkUVg2;
            boolean bl = false;
            for (Object object : iReSqtkUVgDfKiReSqtkUVg2.aZ().f()) {
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(object);
                if (iReSqtkUVgyetiReSqtkUVg2.b()) continue;
                bl = true;
            }
            return iReSqtkUVgVnKiReSqtkUVg2.O() && iReSqtkUVgVnKiReSqtkUVg2.aJ().b() && !bl;
        }
        return iReSqtkUVgVnKiReSqtkUVg2.O() && iReSqtkUVgVnKiReSqtkUVg2.aJ().b();
    }

    public static boolean b(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        if (iReSqtkUVgVnKiReSqtkUVg2.b()) {
            return false;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d)) {
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgVnKiReSqtkUVg2);
            boolean bl = false;
            for (Object object : iReSqtkUVgDfKiReSqtkUVg2.aZ().f()) {
                if (object == null) continue;
                bl = true;
            }
            return iReSqtkUVgVnKiReSqtkUVg2.aJ().b() && !bl;
        }
        return iReSqtkUVgVnKiReSqtkUVg2.aJ().b();
    }

    public static void a() {
        if (b == null) {
            b = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgxHBiReSqtkUVg.class);
            c = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVggHniReSqtkUVg.class);
        }
        if (iReSqtkUVgVUTiReSqtkUVg.b()) {
            return;
        }
        if (b.b() && !b.y().j().booleanValue() || c.b()) {
            double d2 = b.x();
            float f = c.x();
            float f2 = 1.0f;
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.j();
            iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
            iReSqtkUVgCYliReSqtkUVg iReSqtkUVgCYliReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.k();
            if (!iReSqtkUVgVnKiReSqtkUVg2.b() && !iReSqtkUVguqNiReSqtkUVg2.b()) {
                double d3;
                iReSqtkUVgeLLiReSqtkUVg.a(new iReSqtkUVgjSjiReSqtkUVg(null));
                double d4 = iReSqtkUVgCYliReSqtkUVg2.d();
                iReSqtkUVgeLLiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2.a(d4, f2));
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgVnKiReSqtkUVg2.p(f2);
                boolean bl = false;
                if (iReSqtkUVgCYliReSqtkUVg2.e()) {
                    d4 = 6.0;
                    d3 = 6.0;
                } else {
                    d3 = d2;
                    d4 = d2;
                    if (d4 > 3.0) {
                        bl = true;
                    }
                }
                if (!iReSqtkUVgeLLiReSqtkUVg.l().b()) {
                    d3 = !iReSqtkUVgCYliReSqtkUVg2.e() ? iReSqtkUVgVnKiReSqtkUVg2.a(4.5 + (d4 - 3.0), f2).e().b(iReSqtkUVgUjriReSqtkUVg2) : iReSqtkUVgVnKiReSqtkUVg2.a(d4, f2).e().b(iReSqtkUVgUjriReSqtkUVg2);
                }
                if (d3 > 6.0) {
                    d3 = 6.0;
                }
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgVnKiReSqtkUVg2.q(f2);
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg4 = iReSqtkUVgUjriReSqtkUVg2.b(iReSqtkUVgUjriReSqtkUVg3.d() * d4, iReSqtkUVgUjriReSqtkUVg3.e() * d4, iReSqtkUVgUjriReSqtkUVg3.f() * d4);
                iReSqtkUVgeLLiReSqtkUVg.n().a(new iReSqtkUVgjSjiReSqtkUVg(null));
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg5 = null;
                float f3 = 1.0f;
                List list = iReSqtkUVguqNiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2.V().a(iReSqtkUVgUjriReSqtkUVg3.d() * d4, iReSqtkUVgUjriReSqtkUVg3.e() * d4, iReSqtkUVgUjriReSqtkUVg3.f() * d4).b(f3, f3, f3));
                double d5 = d3;
                for (int i = 0; i < list.size(); ++i) {
                    double d6;
                    iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(list.get(i));
                    if (!iReSqtkUVgjSjiReSqtkUVg2.W()) continue;
                    float f4 = iReSqtkUVgjSjiReSqtkUVg2.X() + f;
                    iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.V().b(f4, f4, f4);
                    iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgmXTiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg2, iReSqtkUVgUjriReSqtkUVg4);
                    if (iReSqtkUVgmXTiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg2)) {
                        if (!(0.0 < d5) && d5 != 0.0) continue;
                        iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgjSjiReSqtkUVg2);
                        iReSqtkUVgUjriReSqtkUVg5 = iReSqtkUVgVjsiReSqtkUVg2.b() ? iReSqtkUVgUjriReSqtkUVg2 : iReSqtkUVgVjsiReSqtkUVg2.e();
                        d5 = 0.0;
                        continue;
                    }
                    if (iReSqtkUVgVjsiReSqtkUVg2.b() || !((d6 = iReSqtkUVgUjriReSqtkUVg2.b(iReSqtkUVgVjsiReSqtkUVg2.e())) < d5) && d5 != 0.0) continue;
                    if (iReSqtkUVgjSjiReSqtkUVg2 == iReSqtkUVgVnKiReSqtkUVg2.Y() && !iReSqtkUVgjSjiReSqtkUVg2.Z()) {
                        if (d5 != 0.0 || !b.a(iReSqtkUVgjSjiReSqtkUVg2)) continue;
                        iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgjSjiReSqtkUVg2);
                        iReSqtkUVgUjriReSqtkUVg5 = iReSqtkUVgVjsiReSqtkUVg2.e();
                        continue;
                    }
                    if (d6 > 3.0 && !b.a(iReSqtkUVgjSjiReSqtkUVg2)) continue;
                    iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgjSjiReSqtkUVg2);
                    iReSqtkUVgUjriReSqtkUVg5 = iReSqtkUVgVjsiReSqtkUVg2.e();
                    d5 = d6;
                }
                iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg3 = iReSqtkUVgeLLiReSqtkUVg.n().d();
                if (a) {
                    if (!iReSqtkUVgjSjiReSqtkUVg3.b() && bl && iReSqtkUVgUjriReSqtkUVg2.b(iReSqtkUVgUjriReSqtkUVg5) > d2) {
                        iReSqtkUVgeLLiReSqtkUVg.n().a(new iReSqtkUVgjSjiReSqtkUVg(null));
                        iReSqtkUVgeLLiReSqtkUVg.a(iReSqtkUVgVjsiReSqtkUVg.a(iReSqtkUVgYCPiReSqtkUVg.d(), iReSqtkUVgUjriReSqtkUVg5, new iReSqtkUVgVwNiReSqtkUVg(null), iReSqtkUVgSafiReSqtkUVg.a(iReSqtkUVgUjriReSqtkUVg5)));
                    }
                    iReSqtkUVgjSjiReSqtkUVg3 = iReSqtkUVgeLLiReSqtkUVg.n().d();
                }
                if ((d5 < d3 || iReSqtkUVgeLLiReSqtkUVg.l().b()) && !iReSqtkUVgjSjiReSqtkUVg3.b()) {
                    iReSqtkUVgeLLiReSqtkUVg.a(iReSqtkUVgVjsiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg3, iReSqtkUVgUjriReSqtkUVg5));
                    if (iReSqtkUVgSzRiReSqtkUVg.n.isInstance(iReSqtkUVgjSjiReSqtkUVg3.a()) || iReSqtkUVgSzRiReSqtkUVg.s.isInstance(iReSqtkUVgjSjiReSqtkUVg3.a())) {
                        iReSqtkUVgeLLiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg3);
                    }
                }
            }
        }
    }

    public static boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3, double d2) {
        return iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg3, 6.0, d2, 360.0);
    }

    public static boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3, double d2, double d3, double d4) {
        boolean bl;
        boolean bl2 = bl = iReSqtkUVgVnKiReSqtkUVg3.K() || iReSqtkUVgVnKiReSqtkUVg3.x().equals("") || (double)iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg3) > d2 || !iReSqtkUVgVnKiReSqtkUVg2.b(iReSqtkUVgVnKiReSqtkUVg3);
        if (bl) {
            return false;
        }
        int n = iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgVnKiReSqtkUVg3, iReSqtkUVgVnKiReSqtkUVg2);
        int n2 = iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgVnKiReSqtkUVg3, iReSqtkUVgVnKiReSqtkUVg2);
        return (double)n < d3 && (double)n2 < d4;
    }

    public static boolean b(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        return iReSqtkUVgjSjiReSqtkUVg2.a().getClass().getName().contains("net.minecraft.entity.passive");
    }

    public static boolean c(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        return iReSqtkUVgjSjiReSqtkUVg2.a().getClass().getName().contains("net.minecraft.entity.monster");
    }

    public static boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, double d3, boolean bl) {
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().f()) {
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2;
            if (!iReSqtkUVgSzRiReSqtkUVg.B.isInstance(e) || (iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(e)).equals(iReSqtkUVgjSjiReSqtkUVg2) || bl && iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgtBCiReSqtkUVg2) || (double)iReSqtkUVgtBCiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2) >= d2 || !((double)iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtBCiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg2) < d3)) continue;
            return true;
        }
        return false;
    }

    public static boolean d(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        return iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg2, 6.0, 60.0, true);
    }

    public static boolean b(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, double d3, boolean bl) {
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().f()) {
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2;
            if (!iReSqtkUVgSzRiReSqtkUVg.B.isInstance(e) || (iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(e)).equals(iReSqtkUVgjSjiReSqtkUVg2) || bl && iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgtBCiReSqtkUVg2) || (double)iReSqtkUVgtBCiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2) >= d2 || !((double)iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgtBCiReSqtkUVg2) < d3)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        return iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgjSjiReSqtkUVg2, 6.0, 60.0, true);
    }

    public static boolean f(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        return iReSqtkUVgjSjiReSqtkUVg2.C() == 0.0 && iReSqtkUVgjSjiReSqtkUVg2.E() == 0.0;
    }

    public static int a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, int n, boolean bl) {
        int n2 = 0;
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().f()) {
            if (!iReSqtkUVgSzRiReSqtkUVg.B.isInstance(e)) continue;
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(e);
            if (bl && iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgtBCiReSqtkUVg2) || !(iReSqtkUVgtBCiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2) <= (float)n)) continue;
            ++n2;
        }
        return n2;
    }

    public static int a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, int n) {
        return iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg2, n, true);
    }

    public static double d(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg3) {
        double d2 = iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg3);
        double d3 = Math.cos(Math.toRadians(iReSqtkUVgjSjiReSqtkUVg2.F() + 90.0f)) * d2;
        double d4 = Math.sin(Math.toRadians(iReSqtkUVgjSjiReSqtkUVg2.F() + 90.0f)) * d2;
        double d5 = iReSqtkUVgjSjiReSqtkUVg2.z() + d3;
        double d6 = iReSqtkUVgjSjiReSqtkUVg2.B() + d4;
        return iReSqtkUVgrseiReSqtkUVg.a(d5, 0.0, d6, iReSqtkUVgjSjiReSqtkUVg3.z(), 0.0, iReSqtkUVgjSjiReSqtkUVg3.B());
    }
}

