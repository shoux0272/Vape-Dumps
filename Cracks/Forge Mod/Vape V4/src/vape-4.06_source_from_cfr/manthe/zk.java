/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.Y;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.fC;
import manthe.fS;
import manthe.fU;
import manthe.fj;
import manthe.kF;
import manthe.kt;
import manthe.on;
import manthe.y5;
import manthe.zz;

public class zk
extends y5 {
    private final AO x = new AO();
    private final AO w = new AO();
    private final DB u = DB.a((Object)this, "Disable Speed", false, "Disable Speed when flagging.");
    private int v;

    public zk() {
        super("NoRotate", -2420426, CQ.f, "Prevents the server from\nsetting your view angles.");
        this.a(this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
        fS fS2 = new fS(ds.o());
        eJ eJ2 = ds.k();
        if (kF2.getPacket().a(A5.U) && fS2.d() && fS2.f() && eJ2.d() && eJ2.ad() > 20) {
            zz zz2 = on.p.H().b(zz.class);
            zz2.e(-20);
            if (this.w.a(2000L)) {
                ++this.v;
                fj fj2 = new fj(kF2.getPacket());
                double d10 = fj2.k();
                double d11 = fj2.i();
                double d12 = fj2.l();
                float f10 = fj2.g();
                float f11 = fj2.j();
                if (fj2.h().contains(fC.p())) {
                    d10 += eJ2.z();
                } else {
                    eJ2.k(0.0);
                }
                if (fj2.h().contains(fC.n())) {
                    d11 += eJ2.l();
                } else {
                    eJ2.l(0.0);
                }
                if (fj2.h().contains(fC.m())) {
                    d12 += eJ2.g();
                } else {
                    eJ2.d(0.0);
                }
                if (fj2.h().contains(fC.q())) {
                    f11 += eJ2.K();
                }
                if (fj2.h().contains(fC.o())) {
                    f10 += eJ2.U();
                }
                eJ2.f(f10);
                eJ2.e(f11);
                double d13 = eJ2.ag() - f10;
                if (d13 < -180.0) {
                    eJ2.e(eJ2.ag() + 360.0f);
                }
                if (d13 >= 180.0) {
                    eJ2.e(eJ2.ag() - 360.0f);
                }
                float f12 = f10 % 360.0f;
                float f13 = f11 % 360.0f;
                if ((double)eJ2.t() > 1.25) {
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                }
                float f14 = f12 + Y.a(eJ2.U() - f12);
                eJ2.a(d10, d11, d12, f14, eJ2.K());
                eJ2.bp().a(cB.h ? fU.a(eJ2.z(), eJ2.Y().l(), eJ2.g(), f12, f13, false) : fU.a(eJ2.z(), eJ2.Y().l(), eJ2.l(), eJ2.g(), f12, f13, false));
                kF2.a(true);
            }
        }
    }

    @Override
    public void b(kt kt2) {
        if (this.x.a(750L) && this.v > 3 && this.w.a(2000L)) {
            this.w.d();
            this.x.d();
            this.v = 0;
            zz zz2 = on.p.H().b(zz.class);
            if (this.u.x().booleanValue() && zz2.N()) {
                zz2.z();
            }
        }
    }
}

