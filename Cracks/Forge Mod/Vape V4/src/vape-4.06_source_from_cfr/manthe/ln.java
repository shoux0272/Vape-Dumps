/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.d4;
import manthe.ex;
import manthe.kA;
import manthe.l9;

public class ln
extends l9 {
    private final d4 f;

    public ln(d4 d42) {
        super(d42);
        this.f = d42;
    }

    @Override
    public boolean fire() {
        kA kA2 = new kA(this.f.g(), this.f.k(), this.f.h(), this.f.i());
        kA2.fire();
        this.f.a(kA2.d());
        return kA2.d();
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
}

