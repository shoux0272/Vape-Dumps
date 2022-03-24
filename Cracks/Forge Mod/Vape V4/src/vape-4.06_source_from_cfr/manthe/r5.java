/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D7;
import manthe.cc;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.pr;
import manthe.qq;
import manthe.r1;
import manthe.r6;
import manthe.rI;
import manthe.rf;
import manthe.rg;
import manthe.rv;
import manthe.s9;
import manthe.sb;

public class r5
extends r1 {
    private static final double aj = 20.0;
    private static final double ah = 18.0;
    public final r6 ag;
    private final rf ai;
    private final rf ak;
    private final sb af;
    private final rg ae;

    public r5() {
        super("Enemies", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf2.c(125.0);
        this.d(rf2);
        this.ai = new rf(false);
        this.ai.a(new D7(0.0, 1.0, 5000, 1, new pd(2, 0, 1, 0)));
        this.ai.b((p1)on.p.b().e.c());
        this.ai.b((p1)on.p.b().c.c());
        this.ai.b((p1)on.p.b().f.c());
        this.ai.b((p1)on.p.b().d.c());
        this.ai.b((p1)on.p.b().b.c());
        rf2.b(this.ai);
        this.ak = new rv(this, false);
        this.ae = new rg("Add", false);
        this.ae.b(12.0);
        this.ae.c(20.0);
        this.ae.a(new qq(this));
        this.af = new s9(this, 33);
        this.af.b(12.0);
        this.af.a("<username> [alias]");
        this.ak.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 1, 0)));
        this.ak.b(this.af);
        this.ak.b(this.ae);
        rf2.b(this.ak);
        this.ag = new r6(false);
        this.ag.b(130.0);
        rf2.b(this.ag);
        this.c(120.0);
        this.b(20.0);
    }

    @Override
    public void c(double d10) {
        double d11 = d10 - 0.0;
        this.a(this.aj(), new cc(this, d11));
        this.af.c(d11 - 20.0);
        this.ae.c(20.0);
        for (p1 p12 : this.ag.A().v()) {
            rf rf2 = (rf)p12;
            p1 p13 = rf2.v().get(0);
            p1 p14 = rf2.v().get(1);
            p13.c(d11 - 18.0 - 5.0);
            p14.c(18.0);
        }
        super.c(d10 + 6.0);
    }

    public void a(pr pr2) {
        rf rf2 = new rf(false);
        rf2.c(103.0);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new rI(rf2, pr2);
        this.ag.d(rf2);
    }

    public void b(pr pr2) {
        rf rf2 = null;
        rf rf3 = this.ag.A();
        String string = null;
        for (p1 p12 : rf3.v()) {
            rf rf4 = (rf)p12;
            rI rI2 = (rI)rf4.v().get(0);
            string = rI2.H();
            if (!string.equals(pr2.b())) continue;
            rf2 = rf4;
            break;
        }
        if (rf2 != null) {
            on.p.b().e().remove(pr2);
            rf3.a((p1)rf2);
        }
    }

    static sb a(r5 r52) {
        return r52.af;
    }

    static rg b(r5 r52) {
        return r52.ae;
    }
}

