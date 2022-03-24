/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.AM;
import manthe.I;
import manthe.J;
import manthe.bf;
import manthe.ds;
import manthe.eJ;
import manthe.eP;
import manthe.fG;
import manthe.fk;
import manthe.g4;
import manthe.gb;
import manthe.on;
import manthe.pf;
import manthe.u5;
import manthe.yq;

class nl
implements Runnable {
    private final AM a;

    private nl(AM aM2) {
        this.a = aM2;
    }

    private bf a() {
        eJ eJ2 = ds.k();
        double d10 = eJ2.k() * 2.0;
        double d11 = eJ2.D() * 2.0;
        double d12 = eJ2.u() * 2.0;
        return pf.a(eJ2.Y().b(d10, d11, d12));
    }

    @Override
    public void run() {
        try {
            eJ eJ2 = ds.k();
            eP eP2 = ds.k().aU();
            int n6 = eP2.i();
            boolean bl = false;
            for (int k = 0; k < 9; ++k) {
                fk fk2;
                fG fG2 = new fG(eP2.h()[k]);
                if (fG2.e() || !(fk2 = fG2.k()).a(A5.av) || !this.a.u.a(fG2)) continue;
                eP2.a(k);
                bl = true;
                break;
            }
            if (!bl) {
                AM.e(false);
                return;
            }
            J j10 = new J(0.0f, 0.0f);
            j10.b(15.0f);
            yq.u.a(j10);
            int n10 = 0;
            while (!j10.e()) {
                Thread.sleep(10L);
                if (++n10 <= 100) continue;
                AM.e(false);
                return;
            }
            boolean bl2 = false;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int k = 0; k < 1000; ++k) {
                bf bf2 = this.a();
                if (bf2 != null) {
                    bl2 = true;
                    n11 = bf2.a();
                    n12 = bf2.b();
                    n13 = bf2.c();
                    break;
                }
                if (eJ2.v()) break;
                Thread.sleep(5L);
            }
            if (bl2) {
                gb gb2;
                for (int k = 0; k < 50; ++k) {
                    gb gb3;
                    bf bf3 = this.a();
                    if (bf3 != null) {
                        n11 = bf3.a();
                        n12 = bf3.b();
                        n13 = bf3.c();
                    }
                    if ((gb3 = ds.I()).g().equals(g4.f()) && n11 == gb3.l() && n12 == gb3.m() && n13 == gb3.j()) {
                        yq.u.a((I)null);
                        break;
                    }
                    Thread.sleep(1L);
                }
                if ((gb2 = ds.I()).g().equals(g4.f())) {
                    u5.c();
                    Thread.sleep(51L);
                    u5.b();
                    Thread.sleep(210L);
                }
                eP2.a(n6);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        AM.e(false);
    }
}

