/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dh;
import manthe.ex;
import manthe.l9;
import manthe.on;
import manthe.y5;

public class l1
extends l9 {
    private final dh f;

    public l1(dh dh2) {
        super(dh2);
        this.f = dh2;
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
        for (y5 y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }
}

