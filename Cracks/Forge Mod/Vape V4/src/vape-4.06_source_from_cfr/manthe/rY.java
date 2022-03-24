/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.p1;
import manthe.r6;
import manthe.rf;

class rY
extends rf {
    final r6 I;

    rY(r6 r62, boolean bl) {
        this.I = r62;
        super(bl);
    }

    @Override
    public void d(double d10) {
        super.d(d10 - r6.a(this.I));
    }

    @Override
    public void a(p1 p12) {
        super.a(p12);
        this.I.a((int)(-p12.b()));
    }
}

