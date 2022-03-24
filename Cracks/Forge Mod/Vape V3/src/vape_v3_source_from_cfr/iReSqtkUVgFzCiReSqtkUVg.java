/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgFzCiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private final iReSqtkUVgqTOiReSqtkUVg p;
    private final iReSqtkUVguOciReSqtkUVg q;
    private final List<iReSqtkUVgJZmiReSqtkUVg> r = new ArrayList<iReSqtkUVgJZmiReSqtkUVg>();
    private final iReSqtkUVgFWjiReSqtkUVg s = new iReSqtkUVgFWjiReSqtkUVg("test", true);
    private double t;

    public iReSqtkUVgFzCiReSqtkUVg(iReSqtkUVgqTOiReSqtkUVg iReSqtkUVgqTOiReSqtkUVg2) {
        super(iReSqtkUVgqTOiReSqtkUVg2.N(), false);
        this.p = iReSqtkUVgqTOiReSqtkUVg2;
        this.q = new iReSqtkUVguOciReSqtkUVg(false);
        this.q.d(250.0);
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)this.q);
        this.s.d(5.0);
        this.s.D().e(0.5);
        this.s.a(new iReSqtkUVgpKAiReSqtkUVg(this));
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.c(88.0);
        this.d(20.0);
        this.I().a_(iReSqtkUVgqTOiReSqtkUVg2.d());
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.q.F()) {
            this.c(this.t + 5.0);
        } else {
            this.c(this.t);
        }
        int n = 0;
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : this.r) {
            if (iReSqtkUVgJZmiReSqtkUVg2.w()) continue;
            ++n;
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(false);
        }
        if (n == 0) {
            this.s.a_(false);
        } else {
            this.s.a_(true);
            this.s.D().a(n + " hidden modules");
        }
        this.s.c(this.k() - 3.0);
    }

    public iReSqtkUVgqTOiReSqtkUVg R() {
        return this.p;
    }

    public void a(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2) {
        this.r.add(iReSqtkUVgJZmiReSqtkUVg2);
    }

    public void S() {
        double d2 = this.k();
        double d3 = 0.0;
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : this.r) {
            iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2 = new iReSqtkUVgYTjiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg2);
            iReSqtkUVgJZmiReSqtkUVg2.a(iReSqtkUVgYTjiReSqtkUVg2);
            iReSqtkUVgYTjiReSqtkUVg2.f(iReSqtkUVgJZmiReSqtkUVg2.u());
            iReSqtkUVgYTjiReSqtkUVg2.g(true);
            iReSqtkUVgYTjiReSqtkUVg2.d(17.0);
            double d4 = iReSqtkUVgYTjiReSqtkUVg2.k();
            if (d4 > d3) {
                d3 = d4;
            }
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : iReSqtkUVgJZmiReSqtkUVg2.l()) {
                if (iReSqtkUVgWaoiReSqtkUVg2.c() == null) continue;
                iReSqtkUVgYTjiReSqtkUVg2.c((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2.c());
            }
            this.q.c(iReSqtkUVgYTjiReSqtkUVg2);
        }
        if (d3 > d2) {
            d2 = d3;
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : this.r) {
            iReSqtkUVgJZmiReSqtkUVg2.v().c(d2 - 4.0);
        }
        this.c(d2);
        this.t = this.k();
    }
}

