/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jD
extends gJ {
    private final bP h;
    private final bP e;
    private final bP g;
    private final bP i;
    private final BG d = this.b("xCoord", true, Double.TYPE);
    private final BG a = this.b("yCoord", true, Double.TYPE);
    private final BG f = this.b("zCoord", true, Double.TYPE);

    public jD() {
        super(A5.aW);
        this.e = this.a("addVector", true, A5.aW, Double.TYPE, Double.TYPE, Double.TYPE);
        this.g = this.a("distanceTo", true, Double.TYPE, A5.aW);
        this.i = V.c() >= 23 ? this.a("func_72436_e", false, Double.TYPE, A5.aW) : this.a("squareDistanceTo", true, Double.TYPE, A5.aW);
        this.h = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
    }

    public Object a(Object object, double d10, double d11, double d12) {
        return this.e.e(object, d10, d11, d12);
    }

    public double b(Object object, Object object2) {
        return this.i.m(object, object2);
    }

    public double c(Object object) {
        return this.d.g(object);
    }

    public double a(Object object) {
        return this.a.g(object);
    }

    public double b(Object object) {
        return this.f.g(object);
    }

    public double a(Object object, Object object2) {
        return this.g.m(object, object2);
    }

    public Object a(double d10, double d11, double d12) {
        return this.h.a(new Object[]{d10, d11, d12});
    }
}

