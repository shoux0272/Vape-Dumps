/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;
import manthe.on;
import manthe.y5;

public class ks
extends kl {
    private double d;
    private double f;
    private double e;

    public ks(int n6, double d10, double d11, double d12) {
        this.a = n6;
        this.d = d10;
        this.f = d11;
        this.e = d12;
    }

    public double getX() {
        return this.d;
    }

    public ks setX(double d10) {
        this.d = d10;
        return this;
    }

    public double getY() {
        return this.f;
    }

    public ks setY(double d10) {
        this.f = d10;
        return this;
    }

    public double getZ() {
        return this.e;
    }

    public ks setZ(double d10) {
        this.e = d10;
        return this;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return super.fire();
    }
}

