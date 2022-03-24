/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.k_;
import manthe.kl;

public class lj
extends kl {
    private final Object d;
    private final String e;

    public lj(Object object, String string) {
        this.d = object;
        this.e = string;
    }

    @Override
    public boolean fire() {
        return new k_(new ex(this.d), this.e).fire();
    }
}

