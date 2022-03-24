/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.dx;
import manthe.kl;
import manthe.on;

public class l4
extends kl {
    private final dx d;

    public l4(Object object) {
        this.d = new dx(object);
    }

    public dx getBlock() {
        return this.d;
    }

    @Override
    public boolean fire() {
        if (!on.p.H().a(Ao.class)) {
            return super.fire();
        }
        on.p.H().b(Ao.class).a(this);
        return super.fire();
    }
}

