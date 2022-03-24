/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.AS;
import manthe.Ah;
import manthe.D7;
import manthe.L;
import manthe.c7;
import manthe.o;
import manthe.on;
import manthe.p1;
import manthe.pI;
import manthe.pd;
import manthe.q;
import manthe.q_;
import manthe.r1;
import manthe.rL;
import manthe.rf;
import manthe.rg;
import manthe.sW;
import manthe.zu;

public class r2
extends r1 {
    private final c7 af;
    private boolean ah;
    private long ae = 0L;
    private Color ag;

    public r2() {
        super("Settings", false);
        this.aj().a(new D7(0.0, 1.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.af = new rf(false);
        this.af.a(new D7(0.0, 1.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.c(84.0);
        this.b(20.0);
        ((sW)on.p.t().r.c()).c(this.q());
        this.af.c(this.q() - 5.0);
        for (p1 p12 : on.p.t().e()) {
            this.af.b(p12);
            p12.c(this.af.q());
        }
        rg rg2 = on.p.t().s;
        rg2.b(15.0);
        rg2.c(this.af.q());
        rg2.b("Save your settings");
        rg2.a(new pI(this));
        rg2.b("Saves your profiles to the cloud.\nClick this every time you change your settings.");
        rg2.a(new AS(this, rg2));
        this.af.b(rg2);
        rg rg3 = new rg("Reload", true);
        rg3.a(new q(this));
        rg3.b(15.0);
        rg3.c(this.af.q());
        rg3.a(new q_(this, rg3));
        this.af.b(rg3);
        rg rg4 = new rg("Reload GUI", true);
        rg4.a(new o(this));
        rg4.b(15.0);
        rg4.c(this.af.q());
        rg4.a(new Ah(this, rg4));
        this.af.b(rg4);
        this.d(this.af);
    }

    public void al() {
        this.ag = null;
    }

    public void p(boolean bl) {
        L l = on.p.t().r.K();
        if (l.equals(this.ag)) {
            return;
        }
        zu zu2 = on.p.H().b(zu.class);
        for (r1 r12 : zu2.Y()) {
            if (r12 instanceof rL) {
                if (!on.p.t().r.J()) {
                    if (!this.ah) continue;
                    this.ah = false;
                    continue;
                }
                this.ah = true;
            }
            if (bl && !r12.ai()) continue;
            r12.a(on.p.t().r.K(), on.p.t().r.J());
        }
        this.ag = l;
        if (bl) {
            this.ag = null;
        }
    }

    @Override
    public void c(double d10) {
        super.c(d10);
    }

    static long a(r2 r22) {
        return r22.ae;
    }

    static long a(r2 r22, long l) {
        r22.ae = l;
        return r22.ae;
    }
}

