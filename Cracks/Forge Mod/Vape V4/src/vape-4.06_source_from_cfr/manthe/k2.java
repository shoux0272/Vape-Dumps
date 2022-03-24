/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kd;
import manthe.kl;

public class k2
extends kl {
    private final ex d;

    public k2(Object object) {
        this.d = new ex(object);
    }

    @Override
    public boolean fire() {
        this.d.c(kd.access$000());
        return super.fire();
    }
}

