/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;
import manthe.ku;
import manthe.kx;

public class lL
extends kl {
    private final float d;

    public lL(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        kx kx2 = new kx(this.d);
        boolean bl = kx2.fire();
        ku ku2 = new ku(this.d);
        boolean bl2 = ku2.fire();
        return bl || bl2;
    }
}

