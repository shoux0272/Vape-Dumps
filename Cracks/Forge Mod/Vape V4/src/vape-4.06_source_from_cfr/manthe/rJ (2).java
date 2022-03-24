/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D7;
import manthe.d0;
import manthe.pd;
import manthe.r1;
import manthe.rh;
import manthe.zu;

public class rJ
extends r1 {
    private rh ae;

    public rJ() {
        super("panel", false);
        this.aj().a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.l(false);
        this.f(false);
        this.a(true);
    }

    @Override
    public void c(boolean bl) {
        if (this.ae == null) {
            return;
        }
        zu.T.a(this);
        super.c(true);
    }

    public void a(rh rh2) {
        this.aj().J();
        if (rh2 == this.ae) {
            rh2 = null;
        }
        this.ae = rh2;
        if (rh2 == null) {
            this.a(false);
            return;
        }
        this.a(true);
        this.aj().b(rh2.x());
    }

    @Override
    public void c() {
        super.c();
        if (!this.ae.I()) {
            this.a((rh)null);
        }
        if (this.ae == null) {
            return;
        }
        r1 r12 = this.ae.Q();
        int n6 = (int)(r12.k() + r12.b()) - 5;
        this.a(this.ae.t() + this.ae.q() + 5.0);
        this.d(Math.min(this.ae.k(), (double)n6));
    }

    @Override
    public boolean a(d0 d02) {
        return false;
    }
}

