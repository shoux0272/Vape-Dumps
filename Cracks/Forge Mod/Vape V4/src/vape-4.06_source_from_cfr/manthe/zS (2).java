/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import manthe.A5;
import manthe.An;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Y;
import manthe.ab;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.ex;
import manthe.g4;
import manthe.ke;
import manthe.km;
import manthe.nd;
import manthe.o9;
import manthe.oC;
import manthe.on;
import manthe.pb;
import manthe.pf;
import manthe.vH;
import manthe.y5;

public class zS
extends y5 {
    private pb F = new pb("Distance");
    private pb D = new pb("FOV");
    private DX v = DX.a((Object)this, "Sort Target", this.F, this.F, this.D);
    private DF B = DF.a((Object)this, "Max angle", "#", "", 35.0, 90.0, 360.0, 5.0);
    private DF E = DF.a(this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private DF z = DF.a(this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private DF w = DF.a((Object)this, "Distance", "#.#", "m", 1.0, 0.1, 128.0, 0.1);
    private DB C = DB.a((Object)this, "Invisibles", "Aim at invisible entities", false);
    private DB u = DB.a((Object)this, "Through Blocks", false, "Aim through blocks at entities");
    private DB G = DB.a((Object)this, "Silent Aim", false, "Aims silently server side\nMay not bypass anti-cheats well");
    private DB x = DB.a((Object)this, "Check Block Break", false, "Prevents from aiming while breaking blocks");
    private float A;
    private float H;
    private HashMap<Integer, o9> y = new HashMap();

    public zS() {
        super("BowAimbot", new Color(198, 53, 53).getRGB(), CQ.c, "Aims at a target with prediction + correction.");
        this.G.d(true);
        this.a(this.v, this.G, this.x, this.C, this.E, this.z, this.w, this.B);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km km2) {
        if (km2.c()) {
            this.b(km2);
        }
    }

    private void b(km km2) {
        boolean bl;
        ej ej2 = this.S();
        eJ eJ2 = ds.k();
        boolean bl2 = bl = eJ2.bd() && eJ2.aG().d() && eJ2.aG().k().a(A5.cZ);
        if (bl && ej2 != null && ej2.d()) {
            float[] arrf = this.a(ej2, 1.0f, this.A, this.H);
            float f10 = arrf[0];
            float f11 = arrf[1];
            float f12 = this.E.a().floatValue() / 2.0f;
            float f13 = this.z.a().floatValue() / 2.0f;
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
            float f19 = this.A + f17;
            float f20 = this.H + f18;
            if (this.G.x().booleanValue()) {
                this.A = f19;
                km.setRotationYaw(this.A);
                if (!Float.isNaN(f20)) {
                    this.H = f20;
                    km.setRotationPitch(this.H);
                }
            } else {
                this.A = f19;
                eJ2.i(this.A);
                if (!Float.isNaN(f20)) {
                    this.H = f20;
                    eJ2.d(this.H);
                }
            }
        } else {
            this.A = eJ2.U();
            this.H = eJ2.K();
            this.y.clear();
        }
    }

    @Override
    public void b(ke ke2) {
        boolean bl;
        if (a.ib() || ds.t().e()) {
            return;
        }
        ej ej2 = this.S();
        eJ eJ2 = ds.k();
        boolean bl2 = bl = eJ2.bd() && eJ2.aG().d() && eJ2.aG().k().a(A5.cZ);
        if (ej2 != null && ej2.d() && bl) {
            float[] arrf = this.a(ej2, 1.0f, eJ2.U(), eJ2.K());
            float f10 = arrf[0];
            float f11 = arrf[1];
            float f12 = this.E.a().floatValue() / 5.0f;
            float f13 = this.z.a().floatValue() / 5.0f;
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
            eJ2.i(f19);
            if (!Float.isNaN(f20)) {
                eJ2.d(f20);
            }
        } else {
            this.y.clear();
        }
    }

    private boolean T() {
        if (this.x.u().booleanValue() && ds.I().d() && ds.I().g().equals(g4.f())) {
            if (cB.f()) {
                ei ei2 = ds.s().m();
                ei.a(ei2.i(), true);
            }
            return true;
        }
        return false;
    }

    private float[] a(ex ex2, float f10, float f11, float f12) {
        double[] arrd;
        double d10 = ex2.z() - ex2.T();
        double d11 = ex2.g() - ex2.X();
        double d12 = ex2.l() - ex2.R();
        eJ eJ2 = ds.k();
        if (d10 != 0.0 || d11 != 0.0) {
            if (this.y.containsKey(ex2.q())) {
                this.y.put(ex2.q(), o9.a(this.y.get(ex2.q()), d10, d11, eJ2.ad()));
            } else {
                this.y.put(ex2.q(), new o9(this, d10, d11, null));
            }
        }
        if (d10 == 0.0 && d11 == 0.0) {
            double[] arrd2 = new double[2];
            arrd2[0] = 0.0;
            arrd = arrd2;
            arrd2[1] = 0.0;
        } else {
            arrd = o9.a(this.y.get(ex2.q()));
        }
        double[] arrd3 = arrd;
        double d13 = eJ2.a(ex2);
        d13 -= d13 % 0.8;
        double d14 = d13 / 0.8 * arrd3[0] * 0.66;
        double d15 = d13 / 0.8 * arrd3[1] * 0.66;
        double d16 = 0.0;
        if (!ex2.v() && !ex2.J() && d12 < 0.0 && ex2.t() > 1.0f) {
            d14 *= 0.15;
            d15 *= 0.15;
            d16 = d13 / 0.8 * d12 * 0.5;
            d16 += d16 * 0.98 - 0.08;
        }
        double d17 = ex2.z() + d14 - eJ2.z();
        double d18 = ex2.g() + d15 - eJ2.g();
        float f13 = this.a(d17, d18, f11);
        float f14 = An.a(new oC(ex2.z() + d14, ex2.l() + (double)ex2.am() + d16, ex2.g() + d15), (double)f10 * 2.93) - f12;
        return new float[]{f13, f14};
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
        if (this.v.v() == this.D) {
            arrayList.sort(new vH(this, null));
        }
        if (this.v.v() == this.F) {
            arrayList.sort(new nd(this, null));
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
        if (pf.b(ds.k(), ej2) > this.B.a().intValue() / 2) {
            return false;
        }
        ab ab2 = on.p.N().b(ej2.S());
        if (ab2 != null && !ab2.c()) {
            return false;
        }
        return (this.u.u() != false || ds.k().c(ej2)) && (double)ds.k().a(ej2) < this.w.a();
    }

    private boolean b(ej ej2) {
        return on.p.t().a(ej2, this.C.u() == false);
    }
}

