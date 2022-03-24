/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class j0
extends gJ {
    private final bP j;
    private final BG f = this.b("hitVec", true, A5.aW);
    private final BG g = this.b("entityHit", true, A5.ba);
    private final BG l = this.b("typeOfHit", true, A5.d);
    private final BG a;
    private bP d;
    private BG e;
    private BG h;
    private BG i;
    private BG k;

    public j0() {
        super(A5.cH);
        if (V.c() == 13) {
            this.e = this.b("blockX", true, Integer.TYPE);
            this.h = this.b("blockY", true, Integer.TYPE);
            this.i = this.b("blockZ", true, Integer.TYPE);
            this.a = this.b("sideHit", true, Integer.TYPE);
        } else {
            this.k = this.b("blockPos", true, A5.ao);
            this.a = this.b("sideHit", true, A5.aY);
        }
        this.j = this.a("<init>", false, Void.TYPE, A5.ba, A5.aW);
        if (V.c() > 13) {
            this.d = this.a("<init>", false, Void.TYPE, A5.d, A5.aW, A5.aY, A5.ao);
        }
    }

    public Object a(Object object) {
        return this.f.f(object);
    }

    public Object b(Object object, Object object2) {
        return this.j.a(new Object[]{object, object2});
    }

    public Object a(Object object, Object object2, Object object3, Object object4) {
        return this.d.a(new Object[]{object, object2, object3, object4});
    }

    public Object e(Object object) {
        return this.g.f(object);
    }

    public void a(Object object, Object object2) {
        this.g.a(object, object2);
    }

    private Object i(Object object) {
        return this.l.f(object);
    }

    public int c(Object object) {
        return this.e.c(object);
    }

    public int f(Object object) {
        return this.h.c(object);
    }

    public int h(Object object) {
        return this.i.c(object);
    }

    public Object d(Object object) {
        return this.k.f(object);
    }

    public int g(Object object) {
        return this.a.c(object);
    }

    public Object b(Object object) {
        return this.a.f(object);
    }

    static Object a(j0 j02, Object object) {
        return j02.i(object);
    }
}

