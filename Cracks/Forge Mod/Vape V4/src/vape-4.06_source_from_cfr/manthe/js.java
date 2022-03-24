/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cM;
import manthe.gJ;

public class js
extends gJ {
    private BG g;
    private BG i;
    private BG a;
    private BG l;
    private BG e;
    private BG d;
    private bP f;
    private bP m;
    private bP j;
    private bP k;
    private bP h;

    public js() {
        super(A5.aY);
        if (V.c() > 13) {
            this.j = this.b("values", false, cM.b(A5.aY), new Class[0]);
            this.f = this.a("getOpposite", true, A5.aY, new Class[0]);
            this.h = this.a("ordinal", false, Integer.TYPE, new Class[0]);
            this.m = this.a("getDirectionVec", true, A5.aL, new Class[0]);
        } else {
            this.g = this.b("faceList", true, "[Lnet/minecraft/util/EnumFacing;");
            this.i = this.b("order_b", true, Integer.TYPE);
            this.a = this.b("order_a", true, Integer.TYPE);
            this.l = this.b("frontOffsetX", true, Integer.TYPE);
            this.e = this.b("frontOffsetY", true, Integer.TYPE);
            this.d = this.b("frontOffsetZ", true, Integer.TYPE);
        }
    }

    public int d(Object object) {
        return this.h.o(object, new Object[0]);
    }

    public Object f(Object object) {
        return this.k.e(object, new Object[0]);
    }

    public Object[] e() {
        return this.j.g(null, new Object[0]);
    }

    public Object[] d() {
        return this.g.e(null);
    }

    public Object h(Object object) {
        return this.m.e(object, new Object[0]);
    }

    public Object c(Object object) {
        return this.f.e(object, new Object[0]);
    }

    private int a(Object object) {
        return this.i.c(object);
    }

    private int b(Object object) {
        return this.a.c(object);
    }

    private int e(Object object) {
        return this.l.c(object);
    }

    private int g(Object object) {
        return this.e.c(object);
    }

    private int i(Object object) {
        return this.d.c(object);
    }

    static int a(js js2, Object object) {
        return js2.b(object);
    }

    static int b(js js2, Object object) {
        return js2.a(object);
    }

    static int e(js js2, Object object) {
        return js2.e(object);
    }

    static int d(js js2, Object object) {
        return js2.g(object);
    }

    static int c(js js2, Object object) {
        return js2.i(object);
    }
}

