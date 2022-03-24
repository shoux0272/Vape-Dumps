/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.ej;
import manthe.km;
import manthe.on;
import manthe.y5;
import manthe.yP;
import manthe.yc;
import manthe.yq;
import manthe.z3;

public class ye
extends yc {
    private final z3 v = (z3)this.S();

    public ye(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km km2) {
        if (km2.c()) {
            if (this.v.aa.u().booleanValue() && ds.x().d()) {
                return;
            }
            if (ds.t().e()) {
                return;
            }
            if (this.v.E.u().booleanValue() && !cB.f()) {
                this.v.R.clear();
                return;
            }
            boolean bl = V.c() < 23;
            eJ eJ2 = ds.k();
            boolean bl2 = V.c() > 15 && this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : this.v.Q.a(this.v.U());
            this.v.T();
            boolean bl3 = false;
            boolean bl4 = false;
            yP yP2 = on.p.H().b(yP.class);
            for (ej ej2 : this.v.R) {
                boolean bl5;
                double d10;
                if (!this.v.a(ej2) || !((d10 = (double)eJ2.a(ej2)) <= this.v.am.a())) continue;
                boolean bl6 = bl5 = this.v.T.v() == this.v.L;
                if (!yq.u.V() && this.v.T.v() != this.v.v) {
                    float[] arrf = this.v.c(ej2);
                    float f10 = this.v.a(ej2.z(), ej2.g(), km.getRotationYaw());
                    float f11 = arrf[1];
                    if (this.v.T.v() == this.v.I) {
                        float f12 = ds.s().r();
                        float f13 = f12 * 0.6f + 0.2f;
                        float f14 = f13 * f13 * f13 * 8.0f;
                        int n6 = Math.round(f10 / f14);
                        int n10 = Math.round((f11 - km.getRotationPitch()) / f14);
                        float f15 = (float)n6 * f14;
                        float f16 = (float)n10 * f14;
                        km.setRotationYaw(km.getRotationYaw() + f15);
                        km.setRotationPitch(km.getRotationPitch() + f16);
                    } else {
                        km.setRotationYaw(km.getRotationYaw() + f10);
                        km.setRotationPitch(f11);
                    }
                    if (bl5) {
                        eJ2.i(km.getRotationYaw());
                        eJ2.d(km.getRotationPitch());
                    }
                }
                if (!bl2) continue;
                bl3 = true;
                if (bl) {
                    eJ2.aO();
                }
                if (d10 <= this.v.W.a()) {
                    ds.K().a(eJ2, ej2);
                    if (!bl) {
                        eJ2.aO();
                        eJ2.a4();
                    }
                    if (bl4 || !yP2.N()) continue;
                    bl4 = true;
                    yP2.e(true);
                    continue;
                }
                if (bl) continue;
                eJ2.aO();
                eJ2.a4();
            }
            if (bl4) {
                yP2.e(false);
            }
            if (bl3) {
                this.v.Q.d();
            }
        }
    }
}

