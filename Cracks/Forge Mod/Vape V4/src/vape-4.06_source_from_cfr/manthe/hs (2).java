/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hs
extends gJ {
    private final BG a = this.b("bipedHead", true, A5.dZ);
    private final BG g = this.b("bipedHeadwear", true, A5.dZ);
    private final BG d = this.b("bipedRightArm", true, A5.dZ);
    private final BG f = this.b("bipedLeftArm", true, A5.dZ);
    private final BG e = this.b("bipedRightLeg", true, A5.dZ);
    private final BG h = this.b("bipedLeftLeg", true, A5.dZ);

    public hs() {
        super(A5.bz);
    }

    private Object e(Object object) {
        return this.a.f(object);
    }

    private Object f(Object object) {
        return this.g.f(object);
    }

    private Object a(Object object) {
        return this.d.f(object);
    }

    private Object b(Object object) {
        return this.f.f(object);
    }

    private Object d(Object object) {
        return this.e.f(object);
    }

    private Object c(Object object) {
        return this.h.f(object);
    }

    static Object f(hs hs2, Object object) {
        return hs2.e(object);
    }

    static Object c(hs hs2, Object object) {
        return hs2.f(object);
    }

    static Object b(hs hs2, Object object) {
        return hs2.a(object);
    }

    static Object d(hs hs2, Object object) {
        return hs2.b(object);
    }

    static Object e(hs hs2, Object object) {
        return hs2.d(object);
    }

    static Object a(hs hs2, Object object) {
        return hs2.c(object);
    }
}

