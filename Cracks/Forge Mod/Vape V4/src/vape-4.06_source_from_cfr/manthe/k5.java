/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class k5
extends kl {
    private ex d;

    public k5(Object object) {
        this.d = new ex(object);
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().f()) {
            y52.a(this);
        }
        return super.fire();
    }

    public ex getEntity() {
        return this.d;
    }
}

