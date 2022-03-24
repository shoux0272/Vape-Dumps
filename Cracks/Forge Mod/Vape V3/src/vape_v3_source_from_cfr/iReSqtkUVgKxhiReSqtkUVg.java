/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class iReSqtkUVgKxhiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private boolean b;
    private boolean c;
    private boolean d;
    private iReSqtkUVgzAciReSqtkUVg e = new iReSqtkUVgzAciReSqtkUVg("On bind");
    private iReSqtkUVgzAciReSqtkUVg f = new iReSqtkUVgzAciReSqtkUVg("Aggro");
    private iReSqtkUVgZyLiReSqtkUVg g = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "On bind - searches for thrown pearls and throws upon pressing bind\nAggro - Throws pearl as soon as enemy throws theirs", this.e, this.e, this.f);
    private iReSqtkUVgkzHiReSqtkUVg h = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Angle Limit", "#", "", 30.0, 180.0, 360.0, 5.0);
    private iReSqtkUVgkzHiReSqtkUVg i = iReSqtkUVgkzHiReSqtkUVg.a(this, "Distance Limit", "#.#", "m", 0.0, 6.0, 10.0, 0.1, "The minimum distance a pearl needs to land away from you\nin order to pearl towards it.");
    private iReSqtkUVgkzHiReSqtkUVg j = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private iReSqtkUVgkzHiReSqtkUVg k = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Silent Throw", false, "Throws the enderpearl without swapping your hand.");
    private iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Vertical Check", false, "Checks if the pearl landing positions Y is higher a certain amount above you.");
    private iReSqtkUVgbUCiReSqtkUVg n;
    private int o;
    private boolean p;
    private float q;
    private float r;
    private iReSqtkUVgPzKiReSqtkUVg s = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgsOpiReSqtkUVg t = new iReSqtkUVgsOpiReSqtkUVg(Collections.singleton(iReSqtkUVgSzRiReSqtkUVg.by), Color.WHITE);

    public iReSqtkUVgKxhiReSqtkUVg() {
        super("AutoPearl", -16711936, iReSqtkUVgqTOiReSqtkUVg.d, "Aims and throws a pearl at an enemies pearl trajectory.");
        this.a(this.g, this.j, this.k, this.h, this.i, this.m, this.l);
    }

    @Override
    public void g() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.c()) {
            this.q = iReSqtkUVgtlXiReSqtkUVg2.F();
            this.r = iReSqtkUVgtlXiReSqtkUVg2.G();
        }
        if (this.b && this.g.i().equals(this.e)) {
            this.a(false);
            return;
        }
        if (this.z() || this.g.i().equals(this.f)) {
            this.b = true;
        } else {
            this.a(false);
        }
    }

    @Override
    public void h() {
        this.b = false;
    }

    private void a(iReSqtkUVgbiGiReSqtkUVg iReSqtkUVgbiGiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2, int n) {
        iReSqtkUVgbiGiReSqtkUVg2.a(n);
        if (this.l.i().booleanValue()) {
            iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgJmViReSqtkUVg.a(n));
            iReSqtkUVgeLLiReSqtkUVg.k().g();
        }
    }

    private iReSqtkUVgqECiReSqtkUVg a(iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2) {
        if (iReSqtkUVgbUCiReSqtkUVg2.J()) {
            return null;
        }
        for (iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2 : this.x()) {
            if (!iReSqtkUVgqECiReSqtkUVg2.a(iReSqtkUVgbUCiReSqtkUVg2)) continue;
            return iReSqtkUVgqECiReSqtkUVg2;
        }
        return null;
    }

    private List<iReSqtkUVgqECiReSqtkUVg> x() {
        ArrayList<iReSqtkUVgqECiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgqECiReSqtkUVg>();
        arrayList.add(this.t);
        return arrayList;
    }

    private iReSqtkUVgUjriReSqtkUVg b(iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2) {
        if (!iReSqtkUVgbUCiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bv)) {
            return null;
        }
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        double d2 = iReSqtkUVgbUCiReSqtkUVg2.z();
        double d3 = iReSqtkUVgbUCiReSqtkUVg2.A();
        double d4 = iReSqtkUVgbUCiReSqtkUVg2.B();
        double d5 = iReSqtkUVgbUCiReSqtkUVg2.C();
        double d6 = iReSqtkUVgbUCiReSqtkUVg2.D();
        double d7 = iReSqtkUVgbUCiReSqtkUVg2.E();
        while (true) {
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(d2, d3, d4);
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(d2 + d5, d3 + d6, d4 + d7);
            iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVguqNiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg2, iReSqtkUVgUjriReSqtkUVg3, false, iReSqtkUVgbUCiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bt), false);
            d2 += d5;
            d3 += d6;
            d4 += d7;
            if (iReSqtkUVgVjsiReSqtkUVg2.c()) {
                d2 = iReSqtkUVgVjsiReSqtkUVg2.e().d();
                d3 = iReSqtkUVgVjsiReSqtkUVg2.e().e();
                d4 = iReSqtkUVgVjsiReSqtkUVg2.e().f();
                iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                return (double)Math.abs(this.a(d2, d4)) <= this.h.i() / 2.0 && iReSqtkUVgtlXiReSqtkUVg2.a(d2, d3, d4) > this.i.i() && (this.m.i() == false || d3 - iReSqtkUVgtlXiReSqtkUVg2.A() < 7.0) ? iReSqtkUVgUjriReSqtkUVg.a(d2, d3, d4) : null;
            }
            if (d3 < -128.0) break;
            d5 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99;
            d6 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99;
            d7 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99;
            d6 -= 0.05;
        }
        return null;
    }

    private float a(double d2, double d3) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d4 = d2 - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d5 = d3 - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d6 = d5 < 0.0 && d4 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d5 / d4)) : (d5 < 0.0 && d4 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d5 / d4)) : Math.toDegrees(-Math.atan(d4 / d5)));
        return iReSqtkUVgKexiReSqtkUVg.g(-(iReSqtkUVgtlXiReSqtkUVg2.F() - (float)d6));
    }

    @Override
    public void a(iReSqtkUVgRcsiReSqtkUVg iReSqtkUVgRcsiReSqtkUVg2) {
        if (!this.g.i().equals(this.f)) {
            return;
        }
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgRcsiReSqtkUVg2.g();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bv)) {
            iReSqtkUVgkyRiReSqtkUVg iReSqtkUVgkyRiReSqtkUVg2 = new iReSqtkUVgkyRiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
            iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2 = new iReSqtkUVgbUCiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
            iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2 = this.a(iReSqtkUVgkyRiReSqtkUVg2);
            if (iReSqtkUVgqECiReSqtkUVg2 != null) {
                iReSqtkUVgeAuiReSqtkUVg iReSqtkUVgeAuiReSqtkUVg2;
                float f;
                iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = this.y();
                if (iReSqtkUVgtBCiReSqtkUVg2 == null || iReSqtkUVgtBCiReSqtkUVg2.b()) {
                    return;
                }
                float f2 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgbUCiReSqtkUVg2);
                float f3 = iReSqtkUVgtBCiReSqtkUVg2.a(iReSqtkUVgbUCiReSqtkUVg2);
                if (f3 < f2 && !Float.isNaN(f = iReSqtkUVgjbYiReSqtkUVg.a(iReSqtkUVgeAuiReSqtkUVg2 = new iReSqtkUVgeAuiReSqtkUVg(iReSqtkUVgbUCiReSqtkUVg2.z(), iReSqtkUVgbUCiReSqtkUVg2.A(), iReSqtkUVgjSjiReSqtkUVg2.B()), 1.5))) {
                    this.n = iReSqtkUVgbUCiReSqtkUVg2;
                    this.s.b();
                }
            }
        }
    }

    private iReSqtkUVgtBCiReSqtkUVg y() {
        float f = 999.0f;
        int n = 0;
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (Object e : iReSqtkUVguqNiReSqtkUVg2.d()) {
            float f2;
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2) || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B) || !((f2 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2)) < f)) continue;
            n = iReSqtkUVgjSjiReSqtkUVg2.y();
            f = f2;
        }
        if (n == 0) {
            return null;
        }
        return new iReSqtkUVgtBCiReSqtkUVg(iReSqtkUVguqNiReSqtkUVg2.a(n));
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (!this.d) {
            return;
        }
        for (int i = 36; i < 45; ++i) {
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f() || !(iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d().e()).a(iReSqtkUVgSzRiReSqtkUVg.H)) continue;
            iReSqtkUVgbiGiReSqtkUVg iReSqtkUVgbiGiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.aZ();
            this.o = iReSqtkUVgbiGiReSqtkUVg2.d();
            if (iReSqtkUVgbiGiReSqtkUVg2.d() != i - 36) {
                this.a(iReSqtkUVgbiGiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2, i - 36);
            }
            if (!iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.ag(), iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d())) continue;
            if (this.g.i().equals(this.e)) {
                if (this.l.i().booleanValue()) {
                    this.a(iReSqtkUVgbiGiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2, this.o);
                }
                this.a(false);
            } else {
                this.p = true;
            }
            this.n = null;
            this.c = false;
            this.d = false;
            return;
        }
    }

    @Override
    public void a(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.b()) {
            return;
        }
        if (this.s.a(1000L) && this.n != null) {
            this.n = null;
        }
        if (this.p) {
            iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.aZ();
            this.a((iReSqtkUVgbiGiReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2, this.o);
            this.p = false;
            this.n = null;
        }
        iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg3 = null;
        if (this.g.i().equals(this.f)) {
            if (this.n != null) {
                if (!this.z()) {
                    this.n = null;
                    return;
                }
                iReSqtkUVgbBTiReSqtkUVg3 = this.b(this.n);
            }
        } else {
            for (Object e : ((iReSqtkUVguqNiReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg2).d()) {
                iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
                if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bv)) continue;
                iReSqtkUVgkyRiReSqtkUVg iReSqtkUVgkyRiReSqtkUVg2 = new iReSqtkUVgkyRiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
                iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2 = new iReSqtkUVgbUCiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
                iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2 = this.a(iReSqtkUVgkyRiReSqtkUVg2);
                if (iReSqtkUVgqECiReSqtkUVg2 == null) continue;
                iReSqtkUVgbBTiReSqtkUVg3 = this.b(iReSqtkUVgbUCiReSqtkUVg2);
            }
        }
        if (iReSqtkUVgbBTiReSqtkUVg3 != null && iReSqtkUVgbBTiReSqtkUVg3.c()) {
            float f = this.a(((iReSqtkUVgUjriReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg3).d(), ((iReSqtkUVgUjriReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg3).f());
            if (f > this.j.i().floatValue()) {
                f = this.j.i().floatValue();
            } else if (f < -this.j.i().floatValue()) {
                f = -this.j.i().floatValue();
            }
            float f2 = this.q + f;
            float f3 = -(this.r - iReSqtkUVgjbYiReSqtkUVg.a(((iReSqtkUVgUjriReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg3).g(), 1.5));
            if (f3 > this.k.i().floatValue()) {
                f3 = this.k.i().floatValue();
            } else if (f3 < -this.k.i().floatValue()) {
                f3 = -this.k.i().floatValue();
            }
            float f4 = this.r + f3;
            this.q = f2;
            iReSqtkUVgtlXiReSqtkUVg2.f(this.q);
            if (!Float.isNaN(f4)) {
                this.r = f4;
                iReSqtkUVgtlXiReSqtkUVg2.g(this.r);
            }
            if (!this.c) {
                this.c = (double)Math.abs(this.a(((iReSqtkUVgUjriReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg3).d(), ((iReSqtkUVgUjriReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg3).f())) < 0.5 && (double)Math.abs(f3) < 0.5;
                return;
            }
            if (!this.d) {
                return;
            }
        } else {
            this.q = iReSqtkUVgtlXiReSqtkUVg2.F();
            this.r = iReSqtkUVgtlXiReSqtkUVg2.G();
        }
        if (this.g.i().equals(this.e)) {
            this.a(false);
        }
    }

    @Override
    public void a(iReSqtkUVgXsFiReSqtkUVg iReSqtkUVgXsFiReSqtkUVg2) {
        if (this.c && !this.d) {
            this.d = true;
        }
    }

    private boolean z() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (int i = 36; i < 45; ++i) {
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f() || !(iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d().e()).a(iReSqtkUVgSzRiReSqtkUVg.H)) continue;
            return true;
        }
        return false;
    }
}

