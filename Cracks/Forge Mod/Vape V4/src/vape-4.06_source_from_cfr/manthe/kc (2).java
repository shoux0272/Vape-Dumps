/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.eC;
import manthe.el;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kc
extends kl {
    private final el g;
    private final eC e;
    private final float i;
    private double f;
    private double h;
    private double d;

    public kc(Object object, Object object2, double d10, double d11, double d12, float f10) {
        this.g = new el(object);
        this.e = new eC(object2);
        this.i = f10;
        this.f = d10;
        this.h = d11;
        this.d = d12;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }

    public eC getEntityPlayer() {
        return this.e;
    }

    public el getRenderer() {
        return this.g;
    }

    public float getPartialTicks() {
        return this.i;
    }

    public double getX() {
        return this.f;
    }

    public double getY() {
        return this.h;
    }

    public double getZ() {
        return this.d;
    }
}

