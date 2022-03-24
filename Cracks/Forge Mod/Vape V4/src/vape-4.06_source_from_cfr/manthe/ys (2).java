/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import manthe.A5;
import manthe.AO;
import manthe.An;
import manthe.DF;
import manthe.DX;
import manthe.Y;
import manthe.ab;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.em;
import manthe.ex;
import manthe.fG;
import manthe.ke;
import manthe.kt;
import manthe.oC;
import manthe.on;
import manthe.pb;
import manthe.pf;
import manthe.tm;
import manthe.vF;
import manthe.y8;

public class ys
extends y8 {
    private final pb B = new pb("Distance");
    private final pb w = new pb("FOV");
    private final DX A = DX.a((Object)this, "Sort Target", this.B, this.B, this.w);
    private final DF v = DF.a((Object)this, "Max angle", "#", "", 35.0, 90.0, 360.0, 5.0);
    private final DF x = DF.a((Object)this, "Distance", "#.#", "m", 1.0, 5.0, 7.0, 0.1);
    private final DF C = DF.a(this, "Horizontal Speed", "#.#", "", 1.0, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private final DF D = DF.a(this, "Vertical Speed", "#.#", "", 1.0, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private final AO z = new AO();
    private int u = -1;
    private boolean E;
    private boolean y;

    public ys() {
        super("RodAimbot", "Aims at a target with prediction + correction.");
        this.a(this.C, this.D, this.v, this.x, this.A);
    }

    @Override
    public void s() {
        this.E = false;
        this.y = false;
        this.u = -1;
    }

    @Override
    public void J() {
        if (this.u != -1) {
            int n6 = ds.s().s().i();
            ei.a(n6, false);
            ei.a(n6);
            ds.k().aU().a(this.u);
        }
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if (eJ2.aW().e() && this.y && !this.E && this.z.a(50L)) {
            for (int k = 36; k < 45; ++k) {
                fG fG2;
                if (!eJ2.aY().a(k).h() || !(fG2 = eJ2.aY().a(k).f()).k().d() || !fG2.k().a(A5.cX)) continue;
                this.u = ds.k().aU().i();
                eJ2.aU().a(k - 36);
                int n6 = ds.s().s().i();
                ei.a(n6, true);
                ei.a(n6);
                ei.a(n6, false);
                this.E = true;
                this.z.d();
                return;
            }
        }
        if (eJ2.aW().d()) {
            boolean bl;
            em em2 = eJ2.aW();
            double d10 = Math.abs(em2.k());
            double d11 = Math.abs(em2.D());
            double d12 = Math.abs(em2.u());
            boolean bl2 = bl = d10 < 0.001 && d11 < 0.001 && d12 < 0.001;
            if (eJ2.aU().i() == this.u) {
                this.d(false);
            }
            if (em2.au().d() || bl || this.z.a(500L)) {
                this.E = false;
                this.d(false);
            }
        }
    }

    @Override
    public void a(kt kt2) {
    }

    @Override
    public void b(ke ke2) {
        if (ds.t().e()) {
            return;
        }
        if (this.E) {
            return;
        }
        ej ej2 = this.S();
        eJ eJ2 = ds.k();
        if (ej2 != null && ej2.d() && eJ2.aW().e()) {
            float[] arrf = this.a(ej2, 1.4f);
            if (!Float.isNaN(arrf[1])) {
                float f10 = arrf[0];
                float f11 = arrf[1];
                float f12 = this.C.a().floatValue() / 3.0f;
                float f13 = this.D.a().floatValue() / 3.0f;
                if (f10 > f12) {
                    f10 = f12;
                } else if (f10 < -f12) {
                    f10 = -f12;
                }
                if (f11 > f13) {
                    f11 = f13;
                } else if (f11 < -f13) {
                    f11 = -f13;
                }
                float f14 = ds.s().r();
                float f15 = f14 * 0.6f + 0.2f;
                float f16 = f15 * f15 * f15 * 8.0f;
                int n6 = Math.round(f10 / f16);
                int n10 = Math.round(f11 / f16);
                float f17 = (float)n6 * f16;
                float f18 = (float)n10 * f16;
                float f19 = eJ2.U() + f17;
                float f20 = eJ2.K() + f18;
                boolean bl = this.y;
                boolean bl2 = this.y = Math.abs(arrf[0]) <= 3.0f && Math.abs(arrf[1]) <= 3.0f && eJ2.aW().e();
                if (!bl && this.y) {
                    this.z.d();
                }
                eJ2.i(f19);
                eJ2.d(f20);
            }
        } else {
            if (!this.E) {
                this.d(false);
            }
            this.y = false;
        }
    }

    private float[] a(ex ex2, float f10) {
        double d10 = ex2.z() - ex2.T();
        double d11 = ex2.g() - ex2.X();
        double d12 = ex2.l() - ex2.R();
        eJ eJ2 = ds.k();
        double d13 = eJ2.a(ex2);
        d13 -= d13 % 0.8;
        double d14 = d13 / 0.32 * d10 * 0.87;
        double d15 = d13 / 0.32 * d11 * 0.87;
        double d16 = 0.0;
        double d17 = ex2.z() + d14 - eJ2.z();
        double d18 = ex2.g() + d15 - eJ2.g();
        float f11 = this.a(d17, d18, eJ2.U());
        float f12 = An.a(new oC(ex2.z() + d14, ex2.l() + 1.0 + d16, ex2.g() + d15), f10) - eJ2.K();
        return new float[]{f11, f12};
    }

    private float a(double d10, double d11, float f10) {
        double d12 = d11 < 0.0 && d10 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d11 / d10)) : (d11 < 0.0 && d10 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d11 / d10)) : Math.toDegrees(-Math.atan(d10 / d11)));
        return Y.a(-(f10 - (float)d12));
    }

    private ej S() {
        ArrayList<ej> arrayList = new ArrayList<ej>();
        ArrayList arrayList2 = new ArrayList(ds.t().k());
        for (Object e10 : arrayList2) {
            ej ej2;
            ex ex2 = new ex(e10);
            if (cB.h && ex2.a(A5.a8) || !ex2.a(A5.cF) || !this.a(ej2 = new ej(e10))) continue;
            arrayList.add(ej2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.A.v() == this.w) {
            arrayList.sort(new tm(this, null));
        }
        if (this.A.v() == this.B) {
            arrayList.sort(new vF(this, null));
        }
        return (ej)arrayList.get(0);
    }

    private boolean a(ej ej2) {
        if (ej2.e()) {
            return false;
        }
        if (ej2.equals(ds.k())) {
            return false;
        }
        if (!this.b(ej2)) {
            return false;
        }
        if (ej2.aD() <= 0.0f || ej2.j()) {
            return false;
        }
        if (pf.b(ds.k(), ej2) > this.v.a().intValue() / 2) {
            return false;
        }
        ab ab2 = on.p.N().b(ej2.S());
        if (ab2 != null && !ab2.c()) {
            return false;
        }
        float f10 = ds.k().a(ej2);
        return f10 >= 1.0f && (double)f10 < this.x.a();
    }

    private boolean b(ej ej2) {
        return on.p.t().a(ej2, true);
    }
}

