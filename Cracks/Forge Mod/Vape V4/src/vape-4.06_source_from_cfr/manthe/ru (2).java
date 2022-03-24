/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.B_;
import manthe.D7;
import manthe.ds;
import manthe.on;
import manthe.pd;
import manthe.r1;
import manthe.rg;
import manthe.zu;

public class ru
extends r1 {
    private final zu ae = on.p.H().b(zu.class);

    public ru() {
        super("Edit", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rg rg2 = new rg("Finish editing", false);
        rg2.c(120.0);
        rg2.b(30.0);
        rg2.a(new B_(this));
        this.aj().b(rg2);
        this.k(true);
        this.n(true);
    }

    @Override
    public void c(boolean bl) {
        super.c(true);
    }

    @Override
    public void c() {
        super.c();
        this.f(false);
        this.a((double)ds.p().g() - this.q());
        this.d(0.0);
        this.c(100.0);
        this.b(20.0);
        this.a(this.ae.Z());
    }

    @Override
    public boolean ag() {
        return false;
    }

    static zu a(ru ru2) {
        return ru2.ae;
    }
}

