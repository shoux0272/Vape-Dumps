/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.eC;
import manthe.el;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kq
extends kl {
    private final el e;
    private final eC d;
    private final float f;

    public kq(Object object, Object object2, float f10) {
        this.e = new el(object);
        this.d = new eC(object2);
        this.f = f10;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }

    public eC getEntityPlayer() {
        return this.d;
    }

    public el getRenderer() {
        return this.e;
    }

    public float getPartialTicks() {
        return this.f;
    }
}

