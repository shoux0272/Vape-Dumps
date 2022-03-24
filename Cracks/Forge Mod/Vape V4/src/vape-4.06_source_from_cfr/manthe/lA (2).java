/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.kn;

public class lA
extends kl {
    private final Object d;

    public lA(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        return new kn(new ex(this.d)).fire();
    }
}

