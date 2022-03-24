/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.qp;
import manthe.rl;
import manthe.s7;

class rK
extends rl {
    final qp N;

    rK(qp qp2, String string, int n6, double d10) {
        this.N = qp2;
        super(string, n6, d10);
    }

    @Override
    public String E() {
        boolean bl = a.ib();
        if (this.N instanceof s7) {
            s7 s72 = (s7)this.N;
            if (s72.ad() != null && s72.ad().n() && !bl) {
                return "Requires blatant mode";
            }
            if (s72.ad() != null && s72.ad().p() && s72.ad().c().isEmpty()) {
                return "Must be bound";
            }
        }
        if (this.N.N() && !bl) {
            return "Requires blatant mode";
        }
        return super.E();
    }
}

