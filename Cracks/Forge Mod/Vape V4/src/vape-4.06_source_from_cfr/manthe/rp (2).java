/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rd;
import manthe.rf;

class rp
extends rf {
    final rd I;

    rp(rd rd2, boolean bl) {
        this.I = rd2;
        super(bl);
    }

    @Override
    public double b() {
        return super.b() + 2.0;
    }
}

