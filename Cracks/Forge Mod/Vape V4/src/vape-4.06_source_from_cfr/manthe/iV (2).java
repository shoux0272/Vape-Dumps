/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iV
extends gJ {
    private final BG m;
    private final BG f;
    private final BG l;
    private final BG a;
    private final BG d;
    private final BG i;
    private final BG g;
    private final BG e;
    private final bP j;
    public final bP k;
    private BG h;

    public iV() {
        super(A5.a);
        if (V.c() > 13) {
            this.m = this.b("renderPosX", true, Double.TYPE);
            this.f = this.b("renderPosY", true, Double.TYPE);
            this.l = this.b("renderPosZ", true, Double.TYPE);
        } else {
            this.m = this.a("renderPosX", true, Double.TYPE);
            this.f = this.a("renderPosY", true, Double.TYPE);
            this.l = this.a("renderPosZ", true, Double.TYPE);
            this.h = this.a("instance", true, A5.a);
        }
        this.a = this.b("playerViewX", true, Float.TYPE);
        this.d = this.b("playerViewY", true, Float.TYPE);
        this.i = this.b("viewerPosX", true, Double.TYPE);
        this.g = this.b("viewerPosY", true, Double.TYPE);
        this.e = this.b("viewerPosZ", true, Double.TYPE);
        this.j = this.a("getEntityRenderObject", true, A5.bj, A5.ba);
        this.k = this.a("doRenderEntity", true, Boolean.TYPE, A5.ba, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE);
    }

    private double d(Object object) {
        return this.m.g(object);
    }

    private double g(Object object) {
        return this.f.g(object);
    }

    private double f(Object object) {
        return this.l.g(object);
    }

    private Object d() {
        return this.h.f(null);
    }

    private float e(Object object) {
        return this.a.b(object);
    }

    private float c(Object object) {
        return this.d.b(object);
    }

    private double a(Object object) {
        return this.i.g(object);
    }

    private double b(Object object) {
        return this.g.g(object);
    }

    private double h(Object object) {
        return this.e.g(object);
    }

    private Object a(Object object, Object object2) {
        return this.j.e(object, object2);
    }

    static Object a(iV iV2) {
        return iV2.d();
    }

    static float b(iV iV2, Object object) {
        return iV2.e(object);
    }

    static float d(iV iV2, Object object) {
        return iV2.c(object);
    }

    static double c(iV iV2, Object object) {
        return iV2.a(object);
    }

    static double e(iV iV2, Object object) {
        return iV2.b(object);
    }

    static double a(iV iV2, Object object) {
        return iV2.h(object);
    }

    static Object a(iV iV2, Object object, Object object2) {
        return iV2.a(object, object2);
    }
}

