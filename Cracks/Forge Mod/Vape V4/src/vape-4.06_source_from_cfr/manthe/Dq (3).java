/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DU;
import manthe.sk;

class Dq
extends DU {
    final sk e;

    Dq(sk sk2, double d10, double d11, double d12, double d13) {
        this.e = sk2;
        super(d10, d11, d12, d13);
    }

    @Override
    public double a() {
        return sk.a(this.e);
    }

    @Override
    public double d() {
        return this.e.q();
    }
}

