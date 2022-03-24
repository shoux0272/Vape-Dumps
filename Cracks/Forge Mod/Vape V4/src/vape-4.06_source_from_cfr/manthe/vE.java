/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A3;
import manthe.I;
import manthe.J;
import manthe.bK;
import manthe.ds;
import manthe.eJ;
import manthe.eP;
import manthe.fG;
import manthe.fk;
import manthe.g4;
import manthe.gb;
import manthe.nO;
import manthe.on;
import manthe.pf;
import manthe.u5;
import manthe.yq;

class vE
implements Runnable {
    private final A3 a;

    private vE(A3 a3) {
        this.a = a3;
    }

    private bK a() {
        eJ eJ2 = ds.k();
        double d10 = eJ2.k() * 2.0;
        double d11 = eJ2.u() * 2.0;
        return pf.b(eJ2.Y().b(0.0, -5.0, 0.0));
    }

    @Override
    public void run() {
        try {
            eJ eJ2 = ds.k();
            eP eP2 = ds.k().aU();
            int n6 = eP2.i();
            boolean bl = false;
            boolean bl2 = false;
            on.a("run");
            for (int k = 0; k < 9; ++k) {
                fG fG2 = new fG(eP2.h()[k]);
                if (fG2.e()) continue;
                fk fk2 = fG2.k();
                if (A3.a(this.a).u().booleanValue() && fk.a(fk2) == 326) {
                    eP2.a(k);
                    bl = true;
                    break;
                }
                if (!A3.b(this.a).u().booleanValue() || fk.a(fk2) != 30) continue;
                eP2.a(k);
                bl = true;
                bl2 = true;
                break;
            }
            if (!bl) {
                A3.e(false);
                return;
            }
            on.a("a " + eJ2.D());
            if (eJ2.D() >= 0.0) {
                A3.e(false);
                return;
            }
            J j10 = new J(-999.0f, 90.0f);
            j10.b(10.0f);
            yq.u.a(j10);
            on.a("b");
            int n10 = 0;
            while (!j10.e()) {
                Thread.sleep(10L);
                if (++n10 <= 100) continue;
                A3.e(false);
                return;
            }
            on.a("c");
            boolean bl3 = false;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int k = 0; k < 1000; ++k) {
                bK bK2 = this.a();
                if (bK2 != null) {
                    bl3 = true;
                    n11 = bK2.a();
                    n12 = bK2.b();
                    n13 = bK2.c();
                    break;
                }
                if (eJ2.v()) break;
                Thread.sleep(5L);
            }
            float f10 = eJ2.U();
            if (bl3) {
                gb gb2;
                for (int k = 0; k < 50; ++k) {
                    gb gb3;
                    bK bK3 = this.a();
                    if (bK3 != null) {
                        n11 = bK3.a();
                        n12 = bK3.b();
                        n13 = bK3.c();
                    }
                    if ((gb3 = ds.I()).g().equals(g4.f())) {
                        yq.u.a((I)null);
                        break;
                    }
                    Thread.sleep(1L);
                }
                if ((gb2 = ds.I()).g().equals(g4.f())) {
                    u5.c();
                    Thread.sleep(51L);
                    u5.b();
                    Thread.sleep(10L);
                    Thread.sleep(200L);
                    if (!bl2) {
                        for (int k = 0; k < 100; ++k) {
                            if (eJ2.H()) {
                                Thread.sleep(50L);
                                break;
                            }
                            Thread.sleep(1L);
                        }
                        Thread.sleep(50L);
                        u5.c();
                        Thread.sleep(10L);
                        u5.b();
                        Thread.sleep(100L);
                    } else {
                        Thread.sleep(100L);
                    }
                }
                yq.u.a(new J(-999.0f, 0.0f).b(10.0f));
                eP2.a(n6);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        A3.e(false);
    }

    vE(A3 a3, nO nO2) {
        this(a3);
    }
}

