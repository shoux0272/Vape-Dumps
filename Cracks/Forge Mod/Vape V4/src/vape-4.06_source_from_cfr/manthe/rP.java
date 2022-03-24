/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rf;
import manthe.rq;

class rP
extends rf {
    final rq I;

    rP(rq rq2, boolean bl) {
        this.I = rq2;
        super(bl);
    }

    @Override
    public double b() {
        return super.b() + 2.0;
    }
}

