/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  iReSqtkUVgPYjiReSqtkUVg
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class iReSqtkUVgzCViReSqtkUVg
extends iReSqtkUVgPYjiReSqtkUVg {
    public void a(Object object, double d2, double d3, double d4) {
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(object);
        Random random = iReSqtkUVgjSjiReSqtkUVg2.ab();
        if (iReSqtkUVgjSjiReSqtkUVg2.ac()) {
            iReSqtkUVgjSjiReSqtkUVg2.V().c(d2, d3, d4);
            iReSqtkUVgjSjiReSqtkUVg2.n((iReSqtkUVgjSjiReSqtkUVg2.V().d() + iReSqtkUVgjSjiReSqtkUVg2.V().g()) / 2.0);
            double d5 = (double)iReSqtkUVgjSjiReSqtkUVg2.ad() - (double)iReSqtkUVgjSjiReSqtkUVg2.ae();
            iReSqtkUVgjSjiReSqtkUVg2.o(iReSqtkUVgjSjiReSqtkUVg2.V().e() + d5);
            iReSqtkUVgjSjiReSqtkUVg2.p((iReSqtkUVgjSjiReSqtkUVg2.V().f() + iReSqtkUVgjSjiReSqtkUVg2.V().i()) / 2.0);
        } else {
            int n;
            double d6;
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2;
            int n2;
            int n3;
            double d7;
            iReSqtkUVgjSjiReSqtkUVg2.j(iReSqtkUVgjSjiReSqtkUVg2.ae() * 0.4f);
            double d8 = iReSqtkUVgjSjiReSqtkUVg2.z();
            double d9 = iReSqtkUVgjSjiReSqtkUVg2.A();
            double d10 = iReSqtkUVgjSjiReSqtkUVg2.B();
            if (iReSqtkUVgjSjiReSqtkUVg2.af()) {
                iReSqtkUVgjSjiReSqtkUVg2.h(false);
                d2 *= 0.25;
                d3 *= (double)0.05f;
                d4 *= 0.25;
                iReSqtkUVgjSjiReSqtkUVg2.h(0.0);
                iReSqtkUVgjSjiReSqtkUVg2.i(0.0);
                iReSqtkUVgjSjiReSqtkUVg2.j(0.0);
            }
            double d11 = d2;
            double d12 = d3;
            double d13 = d4;
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg3 = iReSqtkUVgjSjiReSqtkUVg2.V().j();
            boolean bl = iReSqtkUVgjSjiReSqtkUVg2.J() && (iReSqtkUVgjSjiReSqtkUVg2.M() || this.a(iReSqtkUVgjSjiReSqtkUVg2)) && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d);
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg4 = iReSqtkUVgjSjiReSqtkUVg2.V();
            if (bl) {
                double d14 = d2;
                double d15 = d3;
                double d16 = d4;
                d7 = d11;
                double d17 = d13;
                double d18 = 0.05;
                while (d2 != 0.0 && iReSqtkUVgjSjiReSqtkUVg2.ag().b(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg4.d(d2, -1.0, 0.0)).isEmpty()) {
                    d2 = d2 < d18 && d2 >= -d18 ? 0.0 : (d2 > 0.0 ? (d2 -= d18) : (d2 += d18));
                    d11 = d2;
                }
                while (d4 != 0.0 && iReSqtkUVgjSjiReSqtkUVg2.ag().b(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg4.d(0.0, -1.0, d4)).isEmpty()) {
                    d4 = d4 < d18 && d4 >= -d18 ? 0.0 : (d4 > 0.0 ? (d4 -= d18) : (d4 += d18));
                    d13 = d4;
                }
                while (d2 != 0.0 && d4 != 0.0 && iReSqtkUVgjSjiReSqtkUVg2.ag().b(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg4.d(d2, -1.0, d4)).isEmpty()) {
                    d2 = d2 < d18 && d2 >= -d18 ? 0.0 : (d2 > 0.0 ? (d2 -= d18) : (d2 += d18));
                    d4 = d4 < d18 && d4 >= -d18 ? 0.0 : (d4 > 0.0 ? (d4 -= d18) : (d4 += d18));
                    d11 = d2;
                    d13 = d4;
                }
                boolean bl2 = false;
                iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                if (this.a() && iReSqtkUVgtlXiReSqtkUVg2.ag().b(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.V().j().b(-0.2, 0.0, -0.2).d(d2, -1.0, d4)).isEmpty()) {
                    bl2 = true;
                }
                if (this.a()) {
                    iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
                    int n4 = iReSqtkUVgmCeiReSqtkUVg2.l().d();
                    if (bl2) {
                        iReSqtkUVgqzriReSqtkUVg.a(n4, true);
                        iReSqtkUVgqzriReSqtkUVg.a(n4);
                        d2 /= 2.0;
                        d4 /= 2.0;
                    } else {
                        boolean bl3;
                        boolean bl4 = bl3 = n4 > 0 ? Keyboard.isKeyDown((int)n4) : Mouse.isButtonDown((int)(100 + n4));
                        if (iReSqtkUVgtlXiReSqtkUVg2.M() && !bl3) {
                            iReSqtkUVgqzriReSqtkUVg.a(n4, false);
                            iReSqtkUVgqzriReSqtkUVg.a(n4);
                        }
                    }
                }
            }
            List list = iReSqtkUVgjSjiReSqtkUVg2.ag().b(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg4.a(d2, d3, d4));
            for (n3 = 0; n3 < list.size(); ++n3) {
                iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg5 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n3));
                d3 = iReSqtkUVgmXTiReSqtkUVg5.b(iReSqtkUVgmXTiReSqtkUVg4, d3);
            }
            iReSqtkUVgmXTiReSqtkUVg4.c(0.0, d3, 0.0);
            if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d12 != d3) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            n3 = iReSqtkUVgjSjiReSqtkUVg2.J() || d12 != d3 && d12 < 0.0 ? 1 : 0;
            for (n2 = 0; n2 < list.size(); ++n2) {
                iReSqtkUVgmXTiReSqtkUVg2 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n2));
                d2 = iReSqtkUVgmXTiReSqtkUVg2.a(iReSqtkUVgmXTiReSqtkUVg4, d2);
            }
            iReSqtkUVgmXTiReSqtkUVg4.c(d2, 0.0, 0.0);
            if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d11 != d2) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            for (n2 = 0; n2 < list.size(); ++n2) {
                iReSqtkUVgmXTiReSqtkUVg2 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n2));
                d4 = iReSqtkUVgmXTiReSqtkUVg2.c(iReSqtkUVgmXTiReSqtkUVg4, d4);
            }
            iReSqtkUVgmXTiReSqtkUVg4.c(0.0, 0.0, d4);
            if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d13 != d4) {
                d4 = 0.0;
                d3 = 0.0;
                d2 = 0.0;
            }
            if (iReSqtkUVgjSjiReSqtkUVg2.ak() > 0.0f && n3 != 0 && (bl || iReSqtkUVgjSjiReSqtkUVg2.ae() < 0.05f) && (d11 != d2 || d13 != d4)) {
                iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg6;
                d7 = d2;
                double d19 = d3;
                d6 = d4;
                d2 = d11;
                d3 = iReSqtkUVgjSjiReSqtkUVg2.ak();
                d4 = d13;
                iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg7 = iReSqtkUVgjSjiReSqtkUVg2.V().j();
                iReSqtkUVgjSjiReSqtkUVg2.V().a(iReSqtkUVgmXTiReSqtkUVg3);
                list = iReSqtkUVgjSjiReSqtkUVg2.ag().b(iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg2.V().a(d11, d3, d13));
                for (n = 0; n < list.size(); ++n) {
                    iReSqtkUVgmXTiReSqtkUVg6 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n));
                    d3 = iReSqtkUVgmXTiReSqtkUVg6.b(iReSqtkUVgjSjiReSqtkUVg2.V(), d3);
                }
                iReSqtkUVgjSjiReSqtkUVg2.V().c(0.0, d3, 0.0);
                if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d12 != d3) {
                    d4 = 0.0;
                    d3 = 0.0;
                    d2 = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    iReSqtkUVgmXTiReSqtkUVg6 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n));
                    d2 = iReSqtkUVgmXTiReSqtkUVg6.a(iReSqtkUVgjSjiReSqtkUVg2.V(), d2);
                }
                iReSqtkUVgjSjiReSqtkUVg2.V().c(d2, 0.0, 0.0);
                if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d11 != d2) {
                    d4 = 0.0;
                    d3 = 0.0;
                    d2 = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    iReSqtkUVgmXTiReSqtkUVg6 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n));
                    d4 = iReSqtkUVgmXTiReSqtkUVg6.c(iReSqtkUVgjSjiReSqtkUVg2.V(), d4);
                }
                iReSqtkUVgjSjiReSqtkUVg2.V().c(0.0, 0.0, d4);
                if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d13 != d4) {
                    d4 = 0.0;
                    d3 = 0.0;
                    d2 = 0.0;
                }
                if (!iReSqtkUVgjSjiReSqtkUVg2.aj() && d12 != d3) {
                    d4 = 0.0;
                    d3 = 0.0;
                    d2 = 0.0;
                } else {
                    d3 = -iReSqtkUVgjSjiReSqtkUVg2.ak();
                    for (n = 0; n < list.size(); ++n) {
                        iReSqtkUVgmXTiReSqtkUVg6 = new iReSqtkUVgmXTiReSqtkUVg(list.get(n));
                        d3 = iReSqtkUVgmXTiReSqtkUVg6.b(iReSqtkUVgjSjiReSqtkUVg2.V(), d3);
                    }
                    iReSqtkUVgjSjiReSqtkUVg2.V().c(0.0, d3, 0.0);
                }
                if (d7 * d7 + d6 * d6 >= d2 * d2 + d4 * d4) {
                    d2 = d7;
                    d3 = d19;
                    d4 = d6;
                    iReSqtkUVgjSjiReSqtkUVg2.V().a(iReSqtkUVgmXTiReSqtkUVg7);
                }
            }
            iReSqtkUVgjSjiReSqtkUVg2.n((iReSqtkUVgjSjiReSqtkUVg2.V().d() + iReSqtkUVgjSjiReSqtkUVg2.V().g()) / 2.0);
            iReSqtkUVgjSjiReSqtkUVg2.o(iReSqtkUVgjSjiReSqtkUVg2.V().e() + (double)iReSqtkUVgjSjiReSqtkUVg2.ad() - (double)iReSqtkUVgjSjiReSqtkUVg2.ae());
            iReSqtkUVgjSjiReSqtkUVg2.p((iReSqtkUVgjSjiReSqtkUVg2.V().f() + iReSqtkUVgjSjiReSqtkUVg2.V().i()) / 2.0);
            iReSqtkUVgjSjiReSqtkUVg2.i(d11 != d2 || d13 != d4);
            iReSqtkUVgjSjiReSqtkUVg2.j(d12 != d3);
            iReSqtkUVgjSjiReSqtkUVg2.g(d12 != d3 && d12 < 0.0 || this.c.b());
            iReSqtkUVgjSjiReSqtkUVg2.k(iReSqtkUVgjSjiReSqtkUVg2.al() || iReSqtkUVgjSjiReSqtkUVg2.am());
            iReSqtkUVgjSjiReSqtkUVg2.a(d3, iReSqtkUVgjSjiReSqtkUVg2.J());
            if (d11 != d2) {
                iReSqtkUVgjSjiReSqtkUVg2.h(0.0);
            }
            if (d12 != d3) {
                iReSqtkUVgjSjiReSqtkUVg2.i(0.0);
            }
            if (d13 != d4) {
                iReSqtkUVgjSjiReSqtkUVg2.j(0.0);
            }
            d7 = iReSqtkUVgjSjiReSqtkUVg2.z() - d8;
            double d20 = iReSqtkUVgjSjiReSqtkUVg2.A() - d9;
            d6 = iReSqtkUVgjSjiReSqtkUVg2.B() - d10;
            if (iReSqtkUVgjSjiReSqtkUVg2.an() && (!bl || this.a(iReSqtkUVgjSjiReSqtkUVg2)) && iReSqtkUVgjSjiReSqtkUVg2.Y().b()) {
                int n5 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgjSjiReSqtkUVg2.z());
                n = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgjSjiReSqtkUVg2.A() - (double)0.2f - (double)iReSqtkUVgjSjiReSqtkUVg2.ad());
                int n6 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgjSjiReSqtkUVg2.B());
                iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.ag().a(n5, n, n6);
                int n7 = iReSqtkUVgjSjiReSqtkUVg2.ag().a(n5, n - 1, n6).d();
                if (n7 == 11 || n7 == 32 || n7 == 21) {
                    iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.ag().a(n5, n - 1, n6);
                }
                if (iReSqtkUVgGrkiReSqtkUVg2.a() != iReSqtkUVgREtiReSqtkUVg.f().a()) {
                    d20 = 0.0;
                }
                iReSqtkUVgjSjiReSqtkUVg2.m((float)((double)iReSqtkUVgjSjiReSqtkUVg2.ao() + (double)iReSqtkUVgKexiReSqtkUVg.a(d7 * d7 + d6 * d6) * 0.6));
                iReSqtkUVgjSjiReSqtkUVg2.o((float)((double)iReSqtkUVgjSjiReSqtkUVg2.aq() + (double)iReSqtkUVgKexiReSqtkUVg.a(d7 * d7 + d20 * d20 + d6 * d6) * 0.6));
                if (iReSqtkUVgjSjiReSqtkUVg2.ao() > (float)iReSqtkUVgjSjiReSqtkUVg2.ar() && iReSqtkUVgGrkiReSqtkUVg2.e().a() != iReSqtkUVgSxxiReSqtkUVg.d().a()) {
                    iReSqtkUVgjSjiReSqtkUVg2.c((int)iReSqtkUVgjSjiReSqtkUVg2.aq() + 1);
                    if (iReSqtkUVgjSjiReSqtkUVg2.as()) {
                        float f = iReSqtkUVgKexiReSqtkUVg.a(iReSqtkUVgjSjiReSqtkUVg2.C() * iReSqtkUVgjSjiReSqtkUVg2.C() * (double)0.2f + iReSqtkUVgjSjiReSqtkUVg2.D() * iReSqtkUVgjSjiReSqtkUVg2.D() + iReSqtkUVgjSjiReSqtkUVg2.E() * iReSqtkUVgjSjiReSqtkUVg2.E() * (double)0.2f) * 0.35f;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2.at(), f, 1.0f + (random.nextFloat() - random.nextFloat()) * 0.4f);
                    }
                    iReSqtkUVgjSjiReSqtkUVg2.a(n5, n, n6, iReSqtkUVgGrkiReSqtkUVg2);
                    iReSqtkUVgGrkiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2.ag(), n5, n, n6, iReSqtkUVgjSjiReSqtkUVg2);
                }
            }
            try {
                iReSqtkUVgjSjiReSqtkUVg2.au();
            }
            catch (Throwable throwable) {
                throw new RuntimeException();
            }
            boolean bl5 = iReSqtkUVgjSjiReSqtkUVg2.av();
            if (iReSqtkUVgjSjiReSqtkUVg2.ag().a(iReSqtkUVgjSjiReSqtkUVg2.V().e(0.001, 0.001, 0.001))) {
                iReSqtkUVgjSjiReSqtkUVg2.d(1);
                if (!bl5) {
                    int n8 = iReSqtkUVgjSjiReSqtkUVg2.aw();
                    iReSqtkUVgjSjiReSqtkUVg2.f(++n8);
                    if (iReSqtkUVgjSjiReSqtkUVg2.aw() == 0) {
                        iReSqtkUVgjSjiReSqtkUVg2.e(8);
                    }
                }
            } else if (iReSqtkUVgjSjiReSqtkUVg2.aw() <= 0) {
                iReSqtkUVgjSjiReSqtkUVg2.e(-iReSqtkUVgjSjiReSqtkUVg2.ax());
            }
            if (bl5 && iReSqtkUVgjSjiReSqtkUVg2.aw() > 0) {
                iReSqtkUVgjSjiReSqtkUVg2.a("random.fizz", 0.7f, 1.6f + (iReSqtkUVgjSjiReSqtkUVg2.ab().nextFloat() - iReSqtkUVgjSjiReSqtkUVg2.ab().nextFloat()) * 0.4f);
                iReSqtkUVgjSjiReSqtkUVg2.e(-iReSqtkUVgjSjiReSqtkUVg2.ax());
            }
        }
    }

    public void a(Object object) {
    }

    public void a(Object object, Object object2) {
    }

    public void a(Object object, Object object2, Object[] arrobject) {
    }

    public void a(Object object, Object object2, Object object3) {
    }

    public void a(Object object, boolean bl) {
    }
}

