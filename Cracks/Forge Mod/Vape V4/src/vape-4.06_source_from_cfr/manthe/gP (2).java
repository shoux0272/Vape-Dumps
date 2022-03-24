/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class gP
extends gJ {
    private final BG e;
    private final BG d = this.b("renderer", false, A5.b2);
    private final BG a;
    private final BG f;
    private final BG g;

    public gP() {
        super("net/minecraftforge/client/event/RenderLivingEvent");
        this.e = this.b("entity", false, A5.cF);
        this.a = this.b("x", false, Double.TYPE);
        this.f = this.b("y", false, Double.TYPE);
        this.g = this.b("z", false, Double.TYPE);
    }

    private Object e(Object object) {
        return this.e.f(object);
    }

    private Object b(Object object) {
        return this.d.f(object);
    }

    private double c(Object object) {
        return this.a.g(object);
    }

    private double d(Object object) {
        return this.f.g(object);
    }

    private double a(Object object) {
        return this.g.g(object);
    }

    static Object c(gP gP2, Object object) {
        return gP2.e(object);
    }

    static Object a(gP gP2, Object object) {
        return gP2.b(object);
    }

    static double e(gP gP2, Object object) {
        return gP2.c(object);
    }

    static double d(gP gP2, Object object) {
        return gP2.d(object);
    }

    static double b(gP gP2, Object object) {
        return gP2.a(object);
    }
}

