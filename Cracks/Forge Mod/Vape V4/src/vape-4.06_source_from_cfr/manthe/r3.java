/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.U;
import manthe.on;
import manthe.rM;
import manthe.rg;
import manthe.ry;

class r3
extends rg {
    final List J;
    final ry K;

    r3(ry ry2, boolean bl, List list) {
        this.K = ry2;
        this.J = list;
        super(bl);
    }

    @Override
    public void c(boolean bl) {
        U u6;
        int n6;
        super.c(bl);
        if (ry.b(this.K)) {
            this.a(g);
            this.e(1.0);
            this.c(new Color(65, 65, 65));
        } else {
            this.a(g);
            this.e(0.0);
        }
        boolean bl2 = true;
        for (n6 = 0; n6 < 9; ++n6) {
            u6 = (U)this.J.get(n6);
            if (u6.c() == 0) continue;
            bl2 = false;
        }
        if (!bl2) {
            for (n6 = 0; n6 < 9; ++n6) {
                u6 = (U)this.J.get(n6);
                rM rM2 = new rM(u6.c(), false);
                rM2.b(5.0);
                rM2.a(u6);
                rM2.a(-2.0 + this.t() + (double)(n6 * 7));
                rM2.d(this.k() - 2.0);
                rM2.a(0.5f);
                rM2.c(false);
            }
        } else if (this.g()) {
            on.p.E().c("Click to configure", this.t() + 2.0, this.k() + 2.5, -1);
        }
    }
}

