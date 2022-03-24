/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.CQ;
import manthe.D7;
import manthe.Ds;
import manthe.no;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rg;
import manthe.s7;
import manthe.y5;
import manthe.zE;

public class rA
extends r1 {
    private final CQ ah;
    private final r6 ae;
    private final List<y5> ai = new ArrayList<y5>();
    private final rg ag = new rg("test", true);
    private double af;

    public rA(CQ cQ) {
        super(cQ.H(), false);
        this.ah = cQ;
        this.ae = new r6(false);
        this.ae.b(250.0);
        this.aj().b(this.ae);
        this.ag.b(5.0);
        this.ag.z().e(0.5);
        this.ag.a(new no(this));
        this.aj().b(this.ag);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(82.0);
        this.b(20.0);
        this.X().b(cQ.d());
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.ae.z()) {
            this.c(this.af + 5.0);
        } else {
            this.c(this.af);
        }
        int n6 = 0;
        for (y5 y52 : this.ai) {
            if (y52.x()) continue;
            ++n6;
            if (!y52.N()) continue;
            y52.d(false);
        }
        if (n6 == 0) {
            this.ag.a(false);
        } else {
            this.ag.a(true);
            this.ag.z().a(n6 + " hidden modules");
        }
        this.ag.c(this.q() - 3.0);
    }

    public CQ am() {
        return this.ah;
    }

    public void a(y5 y52) {
        this.ai.add(y52);
    }

    public void al() {
        double d10 = this.q();
        double d11 = 0.0;
        for (y5 y52 : this.ai) {
            s7 s72 = new s7(y52);
            y52.a(s72);
            s72.m(y52.v());
            s72.k(true);
            s72.b(14.0);
            double d12 = s72.q();
            if (d12 > d11) {
                d11 = d12;
            }
            for (Ds ds2 : y52.r()) {
                if (ds2.c() == null) continue;
                s72.d((p1)ds2.c());
            }
            if (y52.getClass().equals(zE.class)) continue;
            this.ae.d(s72);
        }
        if (d11 > d10) {
            d10 = d11;
        }
        d10 += 2.0;
        for (y5 y52 : this.ai) {
            y52.l().c(d10 - 4.0);
        }
        this.c(d10);
        this.af = this.q();
    }
}

