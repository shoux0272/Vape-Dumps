/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kA;
import manthe.kl;

public class l8
extends kl {
    private final Object d;
    private final double e;
    private final double f;
    private final double g;

    public l8(Object object, double d10, double d11, double d12) {
        this.d = object;
        this.e = d10;
        this.f = d11;
        this.g = d12;
    }

    @Override
    public boolean fire() {
        boolean bl = new kA(new ex(this.d), this.e, this.f, this.g).fire();
        return bl;
    }
}

