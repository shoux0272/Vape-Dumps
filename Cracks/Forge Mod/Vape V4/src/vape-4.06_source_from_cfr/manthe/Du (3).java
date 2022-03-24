/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DU;
import manthe.rH;

class Du
extends DU {
    final rH e;

    Du(rH rH2, double d10, double d11, double d12, double d13) {
        this.e = rH2;
        super(d10, d11, d12, d13);
    }

    @Override
    public double a() {
        return this.e.t();
    }

    @Override
    public double b() {
        return this.e.k();
    }

    @Override
    public double d() {
        return this.e.q();
    }

    @Override
    public double c() {
        return this.e.b();
    }
}

