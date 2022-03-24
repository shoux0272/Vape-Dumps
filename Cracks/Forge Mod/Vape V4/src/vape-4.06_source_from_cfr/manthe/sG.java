/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rq;
import manthe.sb;

class sG
extends sb {
    final rq S;

    sG(rq rq2, int n6) {
        this.S = rq2;
        super(n6);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y() && n6 == 28) {
            rq.a(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

