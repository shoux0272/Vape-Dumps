/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.kl;
import manthe.ku;
import manthe.kx;

public class le
extends kl {
    private String d;

    public le(String string) {
        this.d = string;
    }

    @Override
    public boolean fire() {
        if (this.d.equals("hand")) {
            float f10 = ds.O().g();
            kx kx2 = new kx(f10);
            boolean bl = kx2.fire();
            ku ku2 = new ku(f10);
            boolean bl2 = ku2.fire();
        }
        return super.fire();
    }
}

