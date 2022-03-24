/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import manthe.A5;
import manthe.AO;
import manthe.An;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Y;
import manthe.ca;
import manthe.cy;
import manthe.ds;
import manthe.e2;
import manthe.eE;
import manthe.eJ;
import manthe.eP;
import manthe.eX;
import manthe.ex;
import manthe.f5;
import manthe.fk;
import manthe.gK;
import manthe.gO;
import manthe.gb;
import manthe.kS;
import manthe.ke;
import manthe.kn;
import manthe.kt;
import manthe.oC;
import manthe.pb;
import manthe.qs;
import manthe.y5;

public class zv
extends y5 {
    private final pb C = new pb("On bind");
    private final pb z = new pb("Aggro");
    private final DX w = DX.a((Object)this, "Mode", "On bind - searches for thrown pearls and throws upon pressing bind\nAggro - Throws pearl as soon as enemy throws theirs", this.C, this.C, this.z);
    private final DF K = DF.a((Object)this, "Angle Limit", "#", "", 30.0, 180.0, 360.0, 5.0);
    private final DF u = DF.a(this, "Distance Limit", "#.#", "m", 0.0, 6.0, 10.0, 0.1, "The minimum distance a pearl needs to land away from you\nin order to pearl towards it.");
    private final DF E = DF.a((Object)this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private final DF v = DF.a((Object)this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private final DB F = DB.a((Object)this, "Silent Throw", false, "Throws the enderpearl without swapping your hand.");
    private final DB J = DB.a((Object)this, "Vertical Check", false, "Checks if the pearl landing positions Y is higher a certain amount above you.");
    private final AO B = new AO();
    private final qs G = new qs(Collections.singleton(A5.af), Color.WHITE);
    private boolean M;
    private boolean x;
    private boolean y;
    private eX L;
    private int H;
    private boolean A;
    private float D;
    private float I;

    public zv() {
        super("AutoPearl", -16711936, CQ.a, "Aims and throws a pearl at an enemies pearl trajectory.");
        this.a(this.w, this.E, this.v, this.K, this.u, this.J, this.F);
    }

    @Override
    public void s() {
        eJ eJ2 = ds.k();
        if (eJ2.d()) {
            this.D = eJ2.U();
            this.I = eJ2.K();
        }
        if (this.M && this.w.v().equals(this.C)) {
            this.d(false);
            return;
        }
        if (this.T() || this.w.v().equals(this.z)) {
            this.M = true;
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.M = false;
    }

    private void a(eP eP2, eJ eJ2, int n6) {
        eP2.a(n6);
        if (this.F.u().booleanValue()) {
            eJ2.bp().a(f5.a(n6));
            ds.K().h();
        }
    }

    private ca a(eX eX2) {
        if (eX2.v()) {
            return null;
        }
        for (ca ca2 : this.U()) {
            if (!ca2.a(eX2)) continue;
            return ca2;
        }
        return null;
    }

    private List<ca> U() {
        ArrayList<ca> arrayList = new ArrayList<ca>();
        arrayList.add(this.G);
        return arrayList;
    }

    private gK b(eX eX2) {
        if (!eX2.a(A5.bn)) {
            return null;
        }
        gO gO2 = ds.t();
        double d10 = eX2.z();
        double d11 = eX2.l();
        double d12 = eX2.g();
        double d13 = eX2.k();
        double d14 = eX2.D();
        double d15 = eX2.u();
        while (true) {
            gK gK2 = gK.b(d10, d11, d12);
            gK gK3 = gK.b(d10 + d13, d11 + d14, d12 + d15);
            gb gb2 = gO2.a(gK2, gK3, false, eX2.a(A5.c9), false);
            d10 += d13;
            d11 += d14;
            d12 += d15;
            if (gb2.d()) {
                d10 = gb2.k().g();
                d11 = gb2.k().h();
                d12 = gb2.k().f();
                eJ eJ2 = ds.k();
                return (double)Math.abs(this.a(d10, d12)) <= this.K.a() / 2.0 && eJ2.a(d10, d11, d12) > this.u.a() && (this.J.u() == false || d11 - eJ2.l() < 7.0) ? gK.b(d10, d11, d12) : null;
            }
            if (d11 < -128.0) break;
            d13 *= eX2.H() ? 0.8 : 0.99;
            d14 *= eX2.H() ? 0.8 : 0.99;
            d15 *= eX2.H() ? 0.8 : 0.99;
            d14 -= 0.05;
        }
        return null;
    }

    private float a(double d10, double d11) {
        eJ eJ2 = ds.k();
        double d12 = d10 - eJ2.z();
        double d13 = d11 - eJ2.g();
        double d14 = d13 < 0.0 && d12 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d13 / d12)) : (d13 < 0.0 && d12 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d13 / d12)) : Math.toDegrees(-Math.atan(d12 / d13)));
        return Y.a(-(eJ2.U() - (float)d14));
    }

    @Override
    public void a(kS kS2) {
        if (!this.w.v().equals(this.z)) {
            return;
        }
        ex ex2 = kS2.getEntity();
        eJ eJ2 = ds.k();
        if (ex2.a(A5.bn)) {
            eE eE2 = new eE(ex2.a());
            eX eX2 = new eX(ex2.a());
            ca ca2 = this.a(eE2);
            if (ca2 != null) {
                oC oC2;
                float f10;
                e2 e22 = this.S();
                if (e22.e()) {
                    return;
                }
                float f11 = eJ2.a(eX2);
                float f12 = e22.a(eX2);
                if (f12 < f11 && !Float.isNaN(f10 = An.a(oC2 = new oC(eX2.z(), eX2.l(), ex2.g()), 1.5))) {
                    this.L = eX2;
                    this.B.d();
                }
            }
        }
    }

    private e2 S() {
        float f10 = 999.0f;
        int n6 = 0;
        gO gO2 = ds.t();
        eJ eJ2 = ds.k();
        for (Object e10 : gO2.l()) {
            float f11;
            ex ex2 = new ex(e10);
            if (ex2.equals(eJ2) || !ex2.a(A5.L) || !((f11 = eJ2.a(ex2)) < f10)) continue;
            n6 = ex2.q();
            f10 = f11;
        }
        if (n6 == 0) {
            return new e2(null);
        }
        return new e2(gO2.a(n6));
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if (!this.y) {
            return;
        }
        for (int k = 36; k < 45; ++k) {
            fk fk2;
            if (!eJ2.aY().a(k).h() || !(fk2 = eJ2.aY().a(k).f().k()).a(A5.an)) continue;
            eP eP2 = eJ2.aU();
            this.H = eP2.i();
            if (eP2.i() != k - 36) {
                this.a(eP2, eJ2, k - 36);
            }
            if (!ds.K().a(eJ2, eJ2.i(), eJ2.aY().a(k).f())) continue;
            if (this.w.v().equals(this.C)) {
                if (this.F.u().booleanValue()) {
                    this.a(eP2, eJ2, this.H);
                }
                this.d(false);
            } else {
                this.A = true;
            }
            this.L = null;
            this.x = false;
            this.y = false;
            return;
        }
    }

    @Override
    public void b(ke ke2) {
        cy cy2;
        eJ eJ2 = ds.k();
        if (eJ2.e()) {
            return;
        }
        if (this.B.a(1000L) && this.L != null) {
            this.L = null;
        }
        if (this.A) {
            cy2 = eJ2.aU();
            this.a((eP)cy2, eJ2, this.H);
            this.A = false;
            this.L = null;
        }
        cy2 = ds.t();
        cy cy3 = null;
        if (this.w.v().equals(this.z)) {
            if (this.L != null) {
                if (!this.T()) {
                    this.L = null;
                    return;
                }
                cy3 = this.b(this.L);
            }
        } else {
            for (Object e10 : ((gO)cy2).l()) {
                ex ex2 = new ex(e10);
                if (!ex2.a(A5.bn)) continue;
                eE eE2 = new eE(ex2.a());
                eX eX2 = new eX(ex2.a());
                ca ca2 = this.a(eE2);
                if (ca2 == null) continue;
                cy3 = this.b(eX2);
            }
        }
        if (cy3 != null && cy3.d()) {
            float f10 = this.a(((gK)cy3).g(), ((gK)cy3).f());
            if (f10 > this.E.a().floatValue()) {
                f10 = this.E.a().floatValue();
            } else if (f10 < -this.E.a().floatValue()) {
                f10 = -this.E.a().floatValue();
            }
            float f11 = this.D + f10;
            float f12 = -(this.I - An.a(((gK)cy3).i(), 1.5));
            if (f12 > this.v.a().floatValue()) {
                f12 = this.v.a().floatValue();
            } else if (f12 < -this.v.a().floatValue()) {
                f12 = -this.v.a().floatValue();
            }
            float f13 = this.I + f12;
            this.D = f11;
            eJ2.i(this.D);
            if (!Float.isNaN(f13)) {
                this.I = f13;
                eJ2.d(this.I);
            }
            if (!this.x) {
                this.x = (double)Math.abs(this.a(((gK)cy3).g(), ((gK)cy3).f())) < 0.5 && (double)Math.abs(f12) < 0.5;
                return;
            }
            if (!this.y) {
                return;
            }
        } else {
            this.D = eJ2.U();
            this.I = eJ2.K();
        }
        if (this.w.v().equals(this.C)) {
            this.d(false);
        }
    }

    @Override
    public void a(kn kn2) {
        if (this.x && !this.y) {
            this.y = true;
        }
    }

    private boolean T() {
        eJ eJ2 = ds.k();
        for (int k = 36; k < 45; ++k) {
            fk fk2;
            if (!eJ2.aY().a(k).h() || !(fk2 = eJ2.aY().a(k).f().k()).a(A5.an)) continue;
            return true;
        }
        return false;
    }
}

