/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class iReSqtkUVgxHBiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private final iReSqtkUVgfXGiReSqtkUVg b = iReSqtkUVgfXGiReSqtkUVg.a(this, "Range", "#.#", "blocks", 3.0, 3.0, 3.4, 6.0);
    private final iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Misplace", false, "Pulls players towards you rather than giving you extra reach distance. Uses the minimum slider value.");
    private final iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Disadvantage", false, "Moves misplaced players in opposite direction. Useful for framing other players");
    private final iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Vertical Check", false, "Prevents hitting players which are y0.2 above or below you\nfor more legitimate use");
    private final iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Only while sprinting", false, "Only give extra reach while sprinting");
    private final iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Disable in water", false, "Won't give any extra reach while standing in water");
    private Map<Integer, iReSqtkUVgjJriReSqtkUVg> h = new HashMap<Integer, iReSqtkUVgjJriReSqtkUVg>();

    public iReSqtkUVgxHBiReSqtkUVg() {
        super("Reach", -16711936, iReSqtkUVgqTOiReSqtkUVg.c, "Extends attack reach");
        this.c.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.d});
        this.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public double x() {
        if (!this.b() || this.c.j().booleanValue() || this.g.i().booleanValue() && iReSqtkUVgeLLiReSqtkUVg.e().as()) {
            return 3.0;
        }
        if (this.f.i().booleanValue() && !iReSqtkUVgeLLiReSqtkUVg.e().N()) {
            return 3.0;
        }
        return this.b.l();
    }

    private float a(double d2, double d3, double d4, double d5) {
        double d6 = d4 - d2;
        double d7 = d5 - d3;
        float f = (float)Math.toDegrees(-Math.atan(d6 / d7));
        if (d7 < 0.0 && d6 < 0.0) {
            f = (float)(90.0 + Math.toDegrees(Math.atan(d7 / d6)));
        } else if (d7 < 0.0 && d6 > 0.0) {
            f = (float)(-90.0 + Math.toDegrees(Math.atan(d7 / d6)));
        }
        return f;
    }

    private void c(boolean bl) {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        if (iReSqtkUVguqNiReSqtkUVg2.b()) {
            return;
        }
        for (Object e : iReSqtkUVguqNiReSqtkUVg2.e()) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) continue;
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(e);
            int n = iReSqtkUVgjSjiReSqtkUVg2.y();
            double d2 = iReSqtkUVgjSjiReSqtkUVg2.z();
            double d3 = iReSqtkUVgjSjiReSqtkUVg2.B();
            iReSqtkUVgjJriReSqtkUVg iReSqtkUVgjJriReSqtkUVg2 = null;
            if (this.h.containsKey(n)) {
                iReSqtkUVgjJriReSqtkUVg2 = this.h.get(n);
            } else {
                iReSqtkUVgjJriReSqtkUVg2 = new iReSqtkUVgjJriReSqtkUVg();
                iReSqtkUVgjJriReSqtkUVg2.a = n;
            }
            this.h.put(n, iReSqtkUVgjJriReSqtkUVg2);
            iReSqtkUVgjJriReSqtkUVg2.b = d2;
            iReSqtkUVgjJriReSqtkUVg2.c = d3;
            iReSqtkUVgjJriReSqtkUVg2.d = iReSqtkUVgjSjiReSqtkUVg2.Q();
            iReSqtkUVgjJriReSqtkUVg2.e = iReSqtkUVgjSjiReSqtkUVg2.S();
            iReSqtkUVgjJriReSqtkUVg2.l = iReSqtkUVgtBCiReSqtkUVg2.bn();
            iReSqtkUVgjJriReSqtkUVg2.m = iReSqtkUVgtBCiReSqtkUVg2.bp();
            iReSqtkUVgjJriReSqtkUVg2.p = iReSqtkUVgtBCiReSqtkUVg2.bq();
            iReSqtkUVgjJriReSqtkUVg2.q = iReSqtkUVgtBCiReSqtkUVg2.bs();
            if (bl) {
                iReSqtkUVgtBCiReSqtkUVg2.n(iReSqtkUVgjJriReSqtkUVg2.f);
                iReSqtkUVgtBCiReSqtkUVg2.p(iReSqtkUVgjJriReSqtkUVg2.g);
                iReSqtkUVgtBCiReSqtkUVg2.k(iReSqtkUVgjJriReSqtkUVg2.h);
                iReSqtkUVgtBCiReSqtkUVg2.m(iReSqtkUVgjJriReSqtkUVg2.i);
                iReSqtkUVgtBCiReSqtkUVg2.t(iReSqtkUVgjJriReSqtkUVg2.n);
                iReSqtkUVgtBCiReSqtkUVg2.v(iReSqtkUVgjJriReSqtkUVg2.o);
                iReSqtkUVgtBCiReSqtkUVg2.b(iReSqtkUVgjSjiReSqtkUVg2.z(), iReSqtkUVgjSjiReSqtkUVg2.A(), iReSqtkUVgjSjiReSqtkUVg2.B());
                continue;
            }
            iReSqtkUVgtBCiReSqtkUVg2.n(iReSqtkUVgjJriReSqtkUVg2.f);
            iReSqtkUVgtBCiReSqtkUVg2.p(iReSqtkUVgjJriReSqtkUVg2.g);
            iReSqtkUVgtBCiReSqtkUVg2.b(iReSqtkUVgjSjiReSqtkUVg2.z(), iReSqtkUVgjSjiReSqtkUVg2.A(), iReSqtkUVgjSjiReSqtkUVg2.B());
            iReSqtkUVgtBCiReSqtkUVg2.n(iReSqtkUVgjJriReSqtkUVg2.b);
            iReSqtkUVgtBCiReSqtkUVg2.p(iReSqtkUVgjJriReSqtkUVg2.c);
        }
    }

    private void z() {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVguqNiReSqtkUVg2.b()) {
            return;
        }
        float f = this.d.i() != false ? -90.0f : 90.0f;
        for (Object e : iReSqtkUVguqNiReSqtkUVg2.e()) {
            double d2;
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) continue;
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(e);
            double d3 = this.b.m() - 3.0;
            double d4 = Math.hypot(iReSqtkUVgtlXiReSqtkUVg2.z() - iReSqtkUVgjSjiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.B() - iReSqtkUVgjSjiReSqtkUVg2.B());
            float f2 = this.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgjSjiReSqtkUVg2.z(), iReSqtkUVgjSjiReSqtkUVg2.B());
            double d5 = d4 - d3;
            if (d5 < 0.5 && (d3 += (d2 = d5 - 0.5)) < 0.0) {
                d3 = 0.0;
            }
            d2 = Math.cos(Math.toRadians(f2 + f)) * d3;
            double d6 = Math.sin(Math.toRadians(f2 + f)) * d3;
            int n = iReSqtkUVgjSjiReSqtkUVg2.y();
            double d7 = iReSqtkUVgjSjiReSqtkUVg2.z();
            double d8 = iReSqtkUVgjSjiReSqtkUVg2.B();
            iReSqtkUVgjJriReSqtkUVg iReSqtkUVgjJriReSqtkUVg2 = null;
            boolean bl = false;
            if (this.h.containsKey(n)) {
                iReSqtkUVgjJriReSqtkUVg2 = this.h.get(n);
                bl = true;
            } else {
                iReSqtkUVgjJriReSqtkUVg2 = new iReSqtkUVgjJriReSqtkUVg();
                iReSqtkUVgjJriReSqtkUVg2.a = n;
            }
            this.h.put(n, iReSqtkUVgjJriReSqtkUVg2);
            iReSqtkUVgjJriReSqtkUVg2.b = d7;
            iReSqtkUVgjJriReSqtkUVg2.c = d8;
            iReSqtkUVgjJriReSqtkUVg2.d = iReSqtkUVgjSjiReSqtkUVg2.Q();
            iReSqtkUVgjJriReSqtkUVg2.e = iReSqtkUVgjSjiReSqtkUVg2.S();
            iReSqtkUVgjJriReSqtkUVg2.l = iReSqtkUVgtBCiReSqtkUVg2.bn();
            iReSqtkUVgjJriReSqtkUVg2.m = iReSqtkUVgtBCiReSqtkUVg2.bp();
            iReSqtkUVgjJriReSqtkUVg2.p = iReSqtkUVgtBCiReSqtkUVg2.bq();
            iReSqtkUVgjJriReSqtkUVg2.q = iReSqtkUVgtBCiReSqtkUVg2.bs();
            iReSqtkUVgjJriReSqtkUVg2.f = iReSqtkUVgjJriReSqtkUVg2.b - d2;
            iReSqtkUVgjJriReSqtkUVg2.g = iReSqtkUVgjJriReSqtkUVg2.c - d6;
            iReSqtkUVgjJriReSqtkUVg2.h = iReSqtkUVgjJriReSqtkUVg2.d - d2;
            iReSqtkUVgjJriReSqtkUVg2.i = iReSqtkUVgjJriReSqtkUVg2.e - d6;
            iReSqtkUVgjJriReSqtkUVg2.n = iReSqtkUVgjJriReSqtkUVg2.l - d2;
            iReSqtkUVgjJriReSqtkUVg2.o = iReSqtkUVgjJriReSqtkUVg2.m - d6;
            if (!bl) continue;
            iReSqtkUVgjJriReSqtkUVg2.h = iReSqtkUVgjJriReSqtkUVg2.j;
            iReSqtkUVgjJriReSqtkUVg2.i = iReSqtkUVgjJriReSqtkUVg2.k;
        }
    }

    private void A() {
        float f = this.d.i() != false ? -90.0f : 90.0f;
        double d2 = this.b.m() - 3.0;
        iReSqtkUVgrEHiReSqtkUVg iReSqtkUVgrEHiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.D();
        if (iReSqtkUVgrEHiReSqtkUVg2.b()) {
            return;
        }
        try {
            List<iReSqtkUVgJCGiReSqtkUVg>[][] arrlist;
            List<iReSqtkUVgJCGiReSqtkUVg>[][] arrlist2 = arrlist = iReSqtkUVgrEHiReSqtkUVg2.e();
            int n = arrlist2.length;
            for (int i = 0; i < n; ++i) {
                List<iReSqtkUVgJCGiReSqtkUVg>[] arrlist3;
                for (List<iReSqtkUVgJCGiReSqtkUVg> list : arrlist3 = arrlist2[i]) {
                    for (iReSqtkUVgJCGiReSqtkUVg iReSqtkUVgJCGiReSqtkUVg2 : list) {
                        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2;
                        if (iReSqtkUVgJCGiReSqtkUVg2.b() || !iReSqtkUVgJCGiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cW) && !iReSqtkUVgJCGiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cV) || (iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e()).b()) continue;
                        float f2 = this.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgJCGiReSqtkUVg2.z(), iReSqtkUVgJCGiReSqtkUVg2.B());
                        double d3 = Math.cos(Math.toRadians(f2 + f)) * d2;
                        double d4 = Math.sin(Math.toRadians(f2 + f)) * d2;
                        iReSqtkUVgJCGiReSqtkUVg2.n(iReSqtkUVgJCGiReSqtkUVg2.z() - d3);
                        iReSqtkUVgJCGiReSqtkUVg2.p(iReSqtkUVgJCGiReSqtkUVg2.B() - d4);
                        iReSqtkUVgJCGiReSqtkUVg2.k(iReSqtkUVgJCGiReSqtkUVg2.Q() - d3);
                        iReSqtkUVgJCGiReSqtkUVg2.m(iReSqtkUVgJCGiReSqtkUVg2.S() - d4);
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void d(boolean bl) {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        if (iReSqtkUVguqNiReSqtkUVg2.b()) {
            return;
        }
        for (Map.Entry<Integer, iReSqtkUVgjJriReSqtkUVg> entry : this.h.entrySet()) {
            iReSqtkUVgjJriReSqtkUVg iReSqtkUVgjJriReSqtkUVg2 = entry.getValue();
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(((iReSqtkUVggvziReSqtkUVg)iReSqtkUVguqNiReSqtkUVg2).a(iReSqtkUVgjJriReSqtkUVg2.a));
            if (!iReSqtkUVgjSjiReSqtkUVg2.c() || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) continue;
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(((iReSqtkUVggvziReSqtkUVg)iReSqtkUVguqNiReSqtkUVg2).a(iReSqtkUVgjJriReSqtkUVg2.a));
            if (bl) {
                iReSqtkUVgjJriReSqtkUVg2.j = iReSqtkUVgjJriReSqtkUVg2.f;
                iReSqtkUVgjJriReSqtkUVg2.k = iReSqtkUVgjJriReSqtkUVg2.g;
                iReSqtkUVgtBCiReSqtkUVg2.n(iReSqtkUVgjJriReSqtkUVg2.b);
                iReSqtkUVgtBCiReSqtkUVg2.p(iReSqtkUVgjJriReSqtkUVg2.c);
                iReSqtkUVgtBCiReSqtkUVg2.k(iReSqtkUVgjJriReSqtkUVg2.d);
                iReSqtkUVgtBCiReSqtkUVg2.m(iReSqtkUVgjJriReSqtkUVg2.e);
                iReSqtkUVgtBCiReSqtkUVg2.t(iReSqtkUVgjJriReSqtkUVg2.l);
                iReSqtkUVgtBCiReSqtkUVg2.v(iReSqtkUVgjJriReSqtkUVg2.m);
            }
            iReSqtkUVgtBCiReSqtkUVg2.b(iReSqtkUVgtBCiReSqtkUVg2.z(), iReSqtkUVgtBCiReSqtkUVg2.A(), iReSqtkUVgtBCiReSqtkUVg2.B());
        }
    }

    @Override
    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
        if (!this.c.i().booleanValue()) {
            return;
        }
        this.z();
        if (iReSqtkUVgYAGiReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            this.c(false);
        } else {
            this.d(false);
            if (iReSqtkUVgauSiReSqtkUVg.d() <= 15) {
                this.A();
            }
        }
    }

    @Override
    public void a(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        if (!this.c.i().booleanValue()) {
            return;
        }
        this.c(true);
    }

    @Override
    public void b(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        if (!this.c.i().booleanValue()) {
            return;
        }
        this.d(true);
    }

    @Override
    public void h() {
        this.h.clear();
    }

    public iReSqtkUVgoRmiReSqtkUVg y() {
        return this.c;
    }

    public boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        if (!this.b()) {
            return true;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d2 = iReSqtkUVgtlXiReSqtkUVg2.A() - (iReSqtkUVgjSjiReSqtkUVg2.A() + (double)iReSqtkUVgjSjiReSqtkUVg2.aa());
        return this.e.i() == false || !(d2 >= 0.2) && !(d2 <= -0.2);
    }
}

