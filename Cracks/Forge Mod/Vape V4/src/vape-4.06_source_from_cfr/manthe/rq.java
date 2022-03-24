/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Cx;
import manthe.D7;
import manthe.ab;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qT;
import manthe.r1;
import manthe.r6;
import manthe.r7;
import manthe.rP;
import manthe.rf;
import manthe.rg;
import manthe.sG;
import manthe.sb;

public class rq
extends r1 {
    private static final double ag = 20.0;
    private static final double af = 18.0;
    public final r6 ah;
    private final rf aj;
    private final rf ai;
    private final sb ae;
    private final rg ak;

    public rq() {
        super("Friends", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf2.c(125.0);
        this.d(rf2);
        this.aj = new rf(false);
        this.aj.a(new D7(0.0, 1.0, 5000, 1, new pd(2, 0, 1, 0)));
        this.aj.b((p1)on.p.N().c.c());
        this.aj.b((p1)on.p.N().e.c());
        this.aj.b((p1)on.p.N().d.c());
        this.aj.b((p1)on.p.N().g.c());
        this.aj.b((p1)on.p.N().b.c());
        rf2.b(this.aj);
        this.ai = new rP(this, false);
        this.ak = new rg("Add", false);
        this.ak.b(12.0);
        this.ak.c(20.0);
        this.ak.a(new qT(this));
        this.ae = new sG(this, 33);
        this.ae.b(12.0);
        this.ae.a("<username> [alias]");
        this.ai.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 1, 0)));
        this.ai.b(this.ae);
        this.ai.b(this.ak);
        rf2.b(this.ai);
        this.ah = new r6(false);
        this.ah.b(130.0);
        rf2.b(this.ah);
        this.c(120.0);
        this.b(20.0);
    }

    @Override
    public void c(double d10) {
        double d11 = d10 - 0.0;
        this.a(this.aj(), new Cx(this, d11));
        this.ae.c(d11 - 20.0);
        this.ak.c(20.0);
        for (p1 p12 : this.ah.A().v()) {
            rf rf2 = (rf)p12;
            p1 p13 = rf2.v().get(0);
            p1 p14 = rf2.v().get(1);
            p13.c(d11 - 18.0 - 5.0);
            p14.c(18.0);
        }
        super.c(d10 + 6.0);
    }

    public void a(ab ab2) {
        rf rf2 = new rf(false);
        rf2.c(103.0);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new r7(rf2, ab2);
        this.ah.d(rf2);
    }

    public void b(ab ab2) {
        rf rf2 = null;
        rf rf3 = this.ah.A();
        String string = null;
        for (p1 p12 : rf3.v()) {
            rf rf4 = (rf)p12;
            r7 r72 = (r7)rf4.v().get(0);
            string = r72.H();
            if (!string.equals(ab2.a())) continue;
            rf2 = rf4;
            break;
        }
        if (rf2 != null) {
            on.p.N().e().remove(ab2);
            rf3.a((p1)rf2);
        }
    }

    static sb b(rq rq2) {
        return rq2.ae;
    }

    static rg a(rq rq2) {
        return rq2.ak;
    }
}

