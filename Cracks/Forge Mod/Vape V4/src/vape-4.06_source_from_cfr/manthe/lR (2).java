/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.ke;
import manthe.kl;

public class lR
extends kl {
    private final float d;

    public lR(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        ke ke2 = new ke(Da.b, this.d);
        return ke2.fire();
    }
}

