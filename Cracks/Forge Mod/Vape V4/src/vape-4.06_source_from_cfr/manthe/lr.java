/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;
import manthe.on;

public class lr
extends kl {
    private final float d;

    public lr(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        on.p.u().a(this.getClass()).a(this);
        return super.fire();
    }
}

