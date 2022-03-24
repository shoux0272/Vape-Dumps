/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kS;
import manthe.kl;

public class ld
extends kl {
    private final Object d;

    public ld(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        kS kS2 = new kS(new ex(this.d));
        kS2.fire();
        return super.fire();
    }
}

