/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kA
extends kl {
    private final ex d;
    private final double g;
    private final double e;
    private final double f;

    public kA(ex ex2, double d10, double d11, double d12) {
        this.d = ex2;
        this.g = d10;
        this.e = d11;
        this.f = d12;
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

    public double getX() {
        return this.g;
    }

    public double getY() {
        return this.e;
    }

    public double getZ() {
        return this.f;
    }
}

