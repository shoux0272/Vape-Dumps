/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.Da;
import manthe.Ds;
import manthe.Dy;
import manthe.V;
import manthe.aC;
import manthe.ds;
import manthe.e2;
import manthe.eA;
import manthe.eJ;
import manthe.eM;
import manthe.ex;
import manthe.gO;
import manthe.gS;
import manthe.ke;
import manthe.kf;
import manthe.pf;
import manthe.y5;

public class zZ
extends y5 {
    private final Dy u = Dy.a((Object)this, "Range", "#.##", "blocks", 3.0, 3.0, 3.2, 6.0, 0.01, "The range in which your reach will be increased to.");
    private final DB x = DB.a((Object)this, "Misplace", false, "Pulls players towards you rather than giving you extra reach distance. Uses the minimum slider value.");
    private final DB w = DB.a((Object)this, "Disadvantage", false, "Moves misplaced players in opposite direction. Useful for framing other players");
    private final DB A = DB.a((Object)this, "Vertical Check", false, "Prevents hitting players which are y0.2 above or below you\nfor more legitimate use");
    private final DB z = DB.a((Object)this, "Only while sprinting", false, "Only give extra reach while sprinting");
    private final DB v = DB.a((Object)this, "Disable in water", false, "Won't give any extra reach while standing in water");
    private final Map<Integer, aC> y = new HashMap<Integer, aC>();

    public zZ() {
        super("Reach", -16711936, CQ.c, "Extends attack reach");
        this.x.a(new Ds[]{this.w});
        this.a(this.u, this.x, this.w, this.A, this.z, this.v);
    }

    public double V() {
        if (!this.N() || this.x.x().booleanValue() || this.v.u().booleanValue() && (ds.k().H() || ds.k().w())) {
            return 3.0;
        }
        if (this.z.u().booleanValue() && !ds.k().C()) {
            return 3.0;
        }
        return this.u.t();
    }

    private float a(double d10, double d11, double d12, double d13) {
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

    private void e(boolean bl) {
        gO gO2 = ds.t();
        if (gO2.e()) {
            return;
        }
        for (Object e10 : gO2.k()) {
            ex ex2 = new ex(e10);
            if (!ex2.a(A5.L) || ex2.a(A5.u)) continue;
            e2 e22 = new e2(e10);
            int n6 = ex2.q();
            double d10 = ex2.z();
            double d11 = ex2.g();
            aC aC2 = null;
            if (this.y.containsKey(n6)) {
                aC2 = this.y.get(n6);
            } else {
                aC2 = new aC();
                aC2.g = n6;
            }
            this.y.put(n6, aC2);
            aC2.e = d10;
            aC2.q = d11;
            aC2.h = ex2.T();
            aC2.m = ex2.X();
            aC2.l = e22.bc();
            aC2.o = e22.a3();
            aC2.b = e22.a7();
            aC2.p = e22.ba();
            if (bl) {
                e22.h(aC2.c);
                e22.e(aC2.n);
                e22.b(aC2.k);
                e22.f(aC2.f);
                e22.r(aC2.i);
                e22.o(aC2.a);
                e22.c(ex2.z(), ex2.l(), ex2.g());
                continue;
            }
            e22.h(aC2.c);
            e22.e(aC2.n);
            e22.c(ex2.z(), ex2.l(), ex2.g());
            e22.h(aC2.e);
            e22.e(aC2.q);
        }
    }

    private void S() {
        gO gO2 = ds.t();
        eJ eJ2 = ds.k();
        if (gO2.e()) {
            return;
        }
        float f10 = this.w.u() != false ? -90.0f : 90.0f;
        for (Object e10 : gO2.k()) {
            double d10;
            ex ex2 = new ex(e10);
            if (!ex2.a(A5.L) || ex2.a(A5.u)) continue;
            e2 e22 = new e2(e10);
            double d11 = this.u.s() - 3.0;
            double d12 = Math.hypot(eJ2.z() - ex2.z(), eJ2.g() - ex2.g());
            float f11 = this.a(eJ2.z(), eJ2.g(), ex2.z(), ex2.g());
            double d13 = d12 - d11;
            if (d13 < 0.5 && (d11 += (d10 = d13 - 0.5)) < 0.0) {
                d11 = 0.0;
            }
            d10 = Math.cos(Math.toRadians(f11 + f10)) * d11;
            double d14 = Math.sin(Math.toRadians(f11 + f10)) * d11;
            int n6 = ex2.q();
            double d15 = ex2.z();
            double d16 = ex2.g();
            aC aC2 = null;
            boolean bl = false;
            if (this.y.containsKey(n6)) {
                aC2 = this.y.get(n6);
                bl = true;
            } else {
                aC2 = new aC();
                aC2.g = n6;
            }
            this.y.put(n6, aC2);
            aC2.e = d15;
            aC2.q = d16;
            aC2.h = ex2.T();
            aC2.m = ex2.X();
            aC2.l = e22.bc();
            aC2.o = e22.a3();
            aC2.b = e22.a7();
            aC2.p = e22.ba();
            aC2.c = aC2.e - d10;
            aC2.n = aC2.q - d14;
            aC2.k = aC2.h - d10;
            aC2.f = aC2.m - d14;
            aC2.i = aC2.l - d10;
            aC2.a = aC2.o - d14;
            if (!bl) continue;
            aC2.k = aC2.d;
            aC2.f = aC2.j;
        }
    }

    private void U() {
        float f10 = this.w.u() != false ? -90.0f : 90.0f;
        double d10 = this.u.s() - 3.0;
        eM eM2 = ds.y();
        if (eM2.e()) {
            return;
        }
        try {
            List<eA>[][] arrlist;
            List<eA>[][] arrlist2 = arrlist = eM2.f();
            int n6 = arrlist2.length;
            for (int k = 0; k < n6; ++k) {
                List<eA>[] arrlist3;
                for (List<eA> list : arrlist3 = arrlist2[k]) {
                    for (eA eA2 : list) {
                        eJ eJ2;
                        if (eA2.e() || !eA2.a(A5.cG) && !eA2.a(A5.dB) || (eJ2 = ds.k()).e() || !((double)eJ2.a(eA2) < this.u.w() + 2.0) || !(eA2.l() < eJ2.l() + 2.5) || pf.c(eJ2, eA2)) continue;
                        float f11 = this.a(eJ2.z(), eJ2.g(), eA2.z(), eA2.g());
                        double d11 = Math.cos(Math.toRadians(f11 + f10)) * d10;
                        double d12 = Math.sin(Math.toRadians(f11 + f10)) * d10;
                        eA2.h(eA2.z() - d11);
                        eA2.e(eA2.g() - d12);
                        eA2.b(eA2.T() - d11);
                        eA2.f(eA2.X() - d12);
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void f(boolean bl) {
        gO gO2 = ds.t();
        if (gO2.e()) {
            return;
        }
        for (Map.Entry<Integer, aC> entry : this.y.entrySet()) {
            aC aC2 = entry.getValue();
            ex ex2 = new ex(((gS)gO2).a(aC2.g));
            if (!ex2.d() || !ex2.a(A5.L)) continue;
            e2 e22 = new e2(((gS)gO2).a(aC2.g));
            if (bl) {
                aC2.d = aC2.c;
                aC2.j = aC2.n;
                e22.h(aC2.e);
                e22.e(aC2.q);
                e22.b(aC2.h);
                e22.f(aC2.m);
                e22.r(aC2.l);
                e22.o(aC2.o);
            }
            e22.c(e22.z(), e22.l(), e22.g());
        }
    }

    @Override
    public void a(kf kf2) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.S();
        if (kf2.a() == Da.b) {
            this.e(false);
        } else {
            this.f(false);
            if (V.c() <= 15) {
                this.U();
            }
        }
    }

    @Override
    public void b(ke ke2) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.e(true);
    }

    @Override
    public void a(ke ke2) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.f(true);
    }

    @Override
    public void J() {
        this.y.clear();
    }

    public DB T() {
        return this.x;
    }

    public boolean a(ex ex2) {
        if (!this.N()) {
            return true;
        }
        eJ eJ2 = ds.k();
        if (ex2.e() || eJ2.e()) {
            return false;
        }
        double d10 = eJ2.l() - (ex2.l() + (double)ex2.am());
        return this.A.u() == false || !(d10 >= 0.2) && !(d10 <= -0.2);
    }
}

