/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgUgiiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b = this.b("getIdFromBlock", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.G);
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;
    private iReSqtkUVgYewiReSqtkUVg h;
    private iReSqtkUVgYewiReSqtkUVg i;
    private iReSqtkUVgYewiReSqtkUVg j;
    private iReSqtkUVgYewiReSqtkUVg k;

    public iReSqtkUVgUgiiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.G);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.d = this.a("getMaterial", true, iReSqtkUVgSzRiReSqtkUVg.V, iReSqtkUVgSzRiReSqtkUVg.bV);
        } else {
            this.c = this.a("getRenderType", true, Integer.TYPE, new Class[0]);
            this.d = this.a("getMaterial", true, iReSqtkUVgSzRiReSqtkUVg.V, new Class[0]);
        }
        this.e = this.b("getBlockFromName", true, iReSqtkUVgSzRiReSqtkUVg.G, String.class);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.f = this.a("onEntityWalking", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, Integer.TYPE, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
            this.i = this.a("getCollisionBoundingBoxFromPool", true, iReSqtkUVgSzRiReSqtkUVg.cf, iReSqtkUVgSzRiReSqtkUVg.k, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.j = this.a("canCollideCheck", true, Boolean.TYPE, Integer.TYPE, Boolean.TYPE);
        } else {
            this.g = this.a("onLanded", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.c);
            this.j = this.a("canCollideCheck", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.bV, Boolean.TYPE);
            if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
                this.h = this.a("onEntityCollidedWithBlock", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.bV, iReSqtkUVgSzRiReSqtkUVg.c);
                this.i = this.a("getCollisionBoundingBox", true, iReSqtkUVgSzRiReSqtkUVg.cf, iReSqtkUVgSzRiReSqtkUVg.bV, iReSqtkUVgSzRiReSqtkUVg.cR, iReSqtkUVgSzRiReSqtkUVg.bT);
            } else {
                this.h = this.a("onEntityCollidedWithBlock", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.c);
                this.i = this.a("getCollisionBoundingBox", true, iReSqtkUVgSzRiReSqtkUVg.cf, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.bV);
            }
        }
        this.k = iReSqtkUVgauSiReSqtkUVg.d() <= 15 ? (iReSqtkUVgauSiReSqtkUVg.d() == 13 ? this.a("getDamageValue", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, Integer.TYPE, Integer.TYPE, Integer.TYPE) : this.a("getDamageValue", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.bT)) : this.a("getMetaFromState", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.bV);
    }

    private int a(Object object, Object object2, int n, int n2, int n3) {
        return this.k.e(object, object2, n, n2, n3);
    }

    private int a(Object object, Object object2, Object object3) {
        return this.k.e(object, object2, object3);
    }

    private int a(Object object, Object object2) {
        return this.k.e(object, object2);
    }

    public boolean a(Object object, Object object2, boolean bl) {
        return this.j.b(object, object2, bl);
    }

    private boolean a(Object object, int n, boolean bl) {
        return this.j.b(object, n, bl);
    }

    public int a(Object object) {
        return this.b.e(null, object);
    }

    private int b(Object object) {
        return this.c.e(object, new Object[0]);
    }

    public Object a(String string) {
        return this.e.j(null, string);
    }

    private Object c(Object object) {
        return this.d.j(object, new Object[0]);
    }

    private Object b(Object object, Object object2) {
        return this.d.j(object, object2);
    }

    private void a(Object object, Object object2, int n, int n2, int n3, Object object3) {
        this.f.a(object, new Object[]{object2, n, n2, n3, object3});
    }

    private void b(Object object, Object object2, Object object3) {
        this.g.a(object, new Object[]{object2, object3});
    }

    private void a(Object object, Object object2, Object object3, Object object4) {
        this.h.a(object, new Object[]{object2, object3, object4});
    }

    private Object b(Object object, Object object2, int n, int n2, int n3) {
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            return this.i.j(object, object2, n, n2, n3);
        }
        return this.i.j(object, object2, iReSqtkUVgSafiReSqtkUVg.a(n, n2, n3).a(), null);
    }

    static /* synthetic */ int a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object) {
        return iReSqtkUVgUgiiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgUgiiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ Object b(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object) {
        return iReSqtkUVgUgiiReSqtkUVg2.c(object);
    }

    static /* synthetic */ void a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, int n, int n2, int n3, Object object3) {
        iReSqtkUVgUgiiReSqtkUVg2.a(object, object2, n, n2, n3, object3);
    }

    static /* synthetic */ void a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, Object object3) {
        iReSqtkUVgUgiiReSqtkUVg2.b(object, object2, object3);
    }

    static /* synthetic */ void a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, Object object3, Object object4) {
        iReSqtkUVgUgiiReSqtkUVg2.a(object, object2, object3, object4);
    }

    static /* synthetic */ Object a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, int n, int n2, int n3) {
        return iReSqtkUVgUgiiReSqtkUVg2.b(object, object2, n, n2, n3);
    }

    static /* synthetic */ boolean a(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, int n, boolean bl) {
        return iReSqtkUVgUgiiReSqtkUVg2.a(object, n, bl);
    }

    static /* synthetic */ int b(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, int n, int n2, int n3) {
        return iReSqtkUVgUgiiReSqtkUVg2.a(object, object2, n, n2, n3);
    }

    static /* synthetic */ int b(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2, Object object3) {
        return iReSqtkUVgUgiiReSqtkUVg2.a(object, object2, object3);
    }

    static /* synthetic */ int b(iReSqtkUVgUgiiReSqtkUVg iReSqtkUVgUgiiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgUgiiReSqtkUVg2.a(object, object2);
    }
}

