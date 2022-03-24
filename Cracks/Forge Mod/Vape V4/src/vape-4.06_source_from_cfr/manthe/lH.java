/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dh;
import manthe.ew;
import manthe.ex;
import manthe.k5;
import manthe.l9;

public class lH
extends l9 {
    private final dh f;

    public lH(dh dh2) {
        super(dh2);
        this.f = dh2;
    }

    public ew getRenderer() {
        return this.f.j();
    }

    public ex getEntity() {
        return this.f.g();
    }

    public double getX() {
        return this.f.k();
    }

    public double getY() {
        return this.f.h();
    }

    public double getZ() {
        return this.f.i();
    }

    @Override
    public boolean fire() {
        k5 k52 = new k5(this.getEntity().a());
        k52.fire();
        return k52.d();
    }
}

