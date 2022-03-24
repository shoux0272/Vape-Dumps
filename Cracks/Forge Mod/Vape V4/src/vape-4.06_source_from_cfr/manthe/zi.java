/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.util.Random;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Y;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.f2;
import manthe.fn;
import manthe.fs;
import manthe.gS;
import manthe.kF;
import manthe.kn;
import manthe.pf;
import manthe.qN;
import manthe.y5;

public class zi
extends y5 {
    private final DB I = DB.a((Object)this, "Only when targeting", false, "Only reduce knockback while being face to face with opponent");
    private final DB u = DB.a((Object)this, "Water check", false, "Won't reduce knockback if in water");
    private final DB F = DB.a((Object)this, "Kite mode", false, "Increases knockback while not facing opponent");
    private final DB J = DB.a((Object)this, "Always Kite", false, "Increase knockback regardless if not facing opponent");
    private final DB H = DB.a((Object)this, "Anti-Combo", false, "Helps prevent a combo on you.");
    private final DB C = DB.a((Object)this, "Air Only", false, "Only count hits in air.");
    private final DF y = DF.a(this, "Horizontal", "#", "%", 0.0, 90.0, 100.0);
    private final DF B = DF.a(this, "Vertical", "#", "%", 0.0, 100.0, 100.0);
    private final DF A = DF.a(this, "Chance", "#", "%", 0.0, 90.0, 100.0);
    private final DF w = DF.a(this, "Kite horizontal", "#", "%", 100.0, 120.0, 300.0);
    private final DF K = DF.a(this, "Kite vertical", "#", "%", 100.0, 120.0, 300.0);
    private final DF x = DF.a((Object)this, "Combo Amount", "#", "hits", 1.0, 3.0, 5.0, 1.0);
    private final AO G = new AO();
    private float E = -999.0f;
    private gS v;
    private eJ z;
    private int D;

    public zi() {
        super("Velocity", -65404, CQ.c, "Reduces knockback taken");
        this.F.a(this.w, this.K, this.J);
        this.H.a(this.C, this.x);
        this.a(this.y, this.B, this.A, this.I, this.u, this.H, this.C, this.x, this.F, this.w, this.K, this.J);
    }

    private boolean S() {
        eJ eJ2 = ds.k();
        if (eJ2.e()) {
            return true;
        }
        if (this.u.u().booleanValue() && eJ2.H()) {
            return true;
        }
        if (this.H.u().booleanValue()) {
            return (double)this.D < this.x.a();
        }
        return false;
    }

    @Override
    public void a(kF kF2) {
        this.a(this.H.u() != false ? this.D + "" : "");
        if (this.S()) {
            return;
        }
        try {
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            double d15;
            double d16;
            double d17;
            double d18;
            int n6;
            double d19;
            Random random;
            boolean bl;
            boolean bl2;
            eJ eJ2;
            fn fn2;
            if (kF2.getPacketInstance() == null) {
                return;
            }
            fn fn3 = kF2.getPacket();
            if (fn3.a(A5.cJ)) {
                fn2 = new fs(fn3);
                eJ2 = ds.k();
                bl2 = pf.e(eJ2);
                bl = pf.b((ex)eJ2);
                if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                    bl = false;
                }
                if (bl2 && !bl && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                    return;
                }
                random = new Random();
                d19 = random.nextDouble();
                n6 = Y.a(random, 0, 100);
                if ((double)n6 >= 100.0 - this.A.a()) {
                    d18 = ((fs)fn2).i();
                    d17 = ((fs)fn2).h();
                    d16 = ((fs)fn2).g();
                    if (bl2 && !bl && this.F.u().booleanValue()) {
                        double d20 = this.w.a() / 100.0;
                        double d21 = this.K.a() / 100.0;
                        double d22 = this.a(d18, d20);
                        double d23 = this.a(d17, d21);
                        double d24 = this.a(d16, d20);
                        ((fs)fn2).b((float)d22);
                        ((fs)fn2).a((float)d23);
                        ((fs)fn2).c((float)d24);
                        return;
                    }
                    d15 = this.y.a();
                    d14 = d15 + (d15 + 5.0 - d15) * d19;
                    if (d14 >= 100.0) {
                        d14 = 100.0;
                    }
                    if ((d13 = (d12 = this.B.a().doubleValue()) + (d12 + 5.0 - d12) * d19) >= 90.0) {
                        d13 = 100.0;
                    }
                    d11 = d14 / 100.0;
                    d10 = d13 / 100.0;
                    double d25 = this.a(d18, d11);
                    double d26 = this.a(d17, d10);
                    double d27 = this.a(d16, d11);
                    ((fs)fn2).b((float)d25);
                    ((fs)fn2).a((float)d26);
                    ((fs)fn2).c((float)d27);
                    if (d15 == 0.0 && d12 == 0.0) {
                        kF2.a(true);
                    }
                }
            }
            if (fn3.a(A5.cQ)) {
                fn2 = new f2(fn3);
                eJ2 = ds.k();
                if (eJ2.e()) {
                    return;
                }
                if (((f2)fn2).h() == eJ2.q()) {
                    bl2 = pf.e(eJ2);
                    bl = pf.b((ex)eJ2);
                    if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                        bl = false;
                    }
                    if (!bl2 && !bl && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                        return;
                    }
                    random = new Random();
                    d19 = random.nextDouble();
                    n6 = Y.a(random, 0, 100);
                    if ((double)n6 >= 100.0 - this.A.a()) {
                        d18 = ((f2)fn2).j();
                        d17 = ((f2)fn2).g();
                        d16 = ((f2)fn2).i();
                        if (bl2 && !bl && this.F.u().booleanValue()) {
                            d15 = this.w.a() / 100.0;
                            d14 = this.K.a() / 100.0;
                            int n10 = (int)(d18 * d15);
                            int n11 = (int)(d17 * d14);
                            int n12 = (int)(d16 * d15);
                            ((f2)fn2).a(n10);
                            ((f2)fn2).c(n11);
                            ((f2)fn2).b(n12);
                            return;
                        }
                        d15 = this.y.a();
                        d14 = d15 + (d15 + 5.0 - d15) * d19;
                        if (d14 >= 100.0) {
                            d14 = 100.0;
                        }
                        if ((d13 = (d12 = this.B.a().doubleValue()) + (d12 + 5.0 - d12) * d19) >= 90.0) {
                            d13 = 100.0;
                        }
                        d11 = d14 / 100.0;
                        d10 = d13 / 100.0;
                        int n13 = (int)(d18 * d11);
                        int n14 = (int)(d17 * d10);
                        int n15 = (int)(d16 * d11);
                        ((f2)fn2).a(n13);
                        ((f2)fn2).c(n14);
                        ((f2)fn2).b(n15);
                        if (d15 == 0.0 && d12 == 0.0) {
                            kF2.a(true);
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a(kn kn2) {
        eJ eJ2;
        this.a(this.H.u() != false ? this.D + "" : "");
        if (this.H.u().booleanValue() && kn2.getEntity().a(A5.u)) {
            eJ2 = ds.k();
            if (!(eJ2.aN() != 10 || this.C.u().booleanValue() && eJ2.v())) {
                ++this.D;
                this.G.d();
            }
            if (this.D > 0 && eJ2.v() && this.G.a(200L)) {
                this.D = 0;
            }
        }
        if (a.ib() || this.S()) {
            return;
        }
        if (this.v == null || !this.v.equals(ds.t())) {
            this.v = ds.t();
            this.E = -999.0f;
            return;
        }
        if (this.z == null || !this.z.equals(ds.k())) {
            this.z = ds.k();
            this.E = -999.0f;
            return;
        }
        eJ2 = ds.k();
        if (kn2.getEntity().equals(eJ2)) {
            boolean bl = pf.e(eJ2);
            boolean bl2 = pf.b((ex)eJ2);
            if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                bl2 = false;
            }
            float f10 = eJ2.aD();
            if (this.E == -999.0f || f10 > this.E) {
                this.E = f10;
            } else if (f10 < this.E && (eJ2.k() != 0.0 || eJ2.D() != 0.0 || eJ2.u() != 0.0)) {
                this.E = f10;
                if (bl && !bl2 && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                    return;
                }
                Random random = new Random();
                double d10 = random.nextDouble();
                int n6 = random.nextInt(100);
                if ((double)n6 > 100.0 - this.A.a()) {
                    double d11;
                    double d12;
                    if (bl && !bl2 && this.F.u().booleanValue()) {
                        double d13 = this.w.a() / 100.0;
                        double d14 = this.K.a() / 100.0;
                        eJ2.k(this.a(eJ2.k(), d13));
                        eJ2.l(this.a(eJ2.D(), d14));
                        eJ2.d(this.a(eJ2.u(), d13));
                        return;
                    }
                    double d15 = this.y.a();
                    double d16 = d15 + (d15 + 5.0 - d15) * d10;
                    if (d16 >= 100.0) {
                        d16 = 100.0;
                    }
                    if ((d12 = (d11 = this.B.a().doubleValue()) + (d11 + 5.0 - d11) * d10) >= 90.0) {
                        d12 = 100.0;
                    }
                    double d17 = d16 / 100.0;
                    double d18 = d12 / 100.0;
                    eJ2.k(this.a(eJ2.k(), d17));
                    eJ2.l(this.a(eJ2.D(), d18));
                    eJ2.d(this.a(eJ2.u(), d17));
                    if (d15 <= 1.0) {
                        eJ2.k(0.0);
                        eJ2.d(0.0);
                    }
                    if (d11 <= 1.0) {
                        eJ2.l(0.0);
                    }
                }
            }
        }
    }

    private double a(double d10, double d11) {
        String string = Double.toString(Math.abs(d10));
        String string2 = string.contains(",") ? "," : ".";
        int n6 = string.indexOf(string2);
        int n10 = string.length() - n6 - 1;
        qN qN2 = new qN(n10);
        return qN2.a(d10 * d11);
    }
}

