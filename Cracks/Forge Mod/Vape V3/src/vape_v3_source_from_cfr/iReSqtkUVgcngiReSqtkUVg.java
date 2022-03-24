/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgcngiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d = this.a("hitVec", true, iReSqtkUVgSzRiReSqtkUVg.ce);
    private iReSqtkUVgkgTiReSqtkUVg e = this.a("entityHit", true, iReSqtkUVgSzRiReSqtkUVg.c);
    private iReSqtkUVgkgTiReSqtkUVg f = this.a("typeOfHit", true, iReSqtkUVgSzRiReSqtkUVg.ch);
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;
    private iReSqtkUVgkgTiReSqtkUVg i;
    private iReSqtkUVgkgTiReSqtkUVg j;
    private iReSqtkUVgkgTiReSqtkUVg k;

    public iReSqtkUVgcngiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.cg);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.g = this.a("blockX", true, Integer.TYPE);
            this.h = this.a("blockY", true, Integer.TYPE);
            this.i = this.a("blockZ", true, Integer.TYPE);
            this.k = this.a("sideHit", true, Integer.TYPE);
        } else {
            this.j = this.a("blockPos", true, iReSqtkUVgSzRiReSqtkUVg.bT);
            this.k = this.a("sideHit", true, iReSqtkUVgSzRiReSqtkUVg.bU);
        }
        this.b = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.c, iReSqtkUVgSzRiReSqtkUVg.ce);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.c = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ch, iReSqtkUVgSzRiReSqtkUVg.ce, iReSqtkUVgSzRiReSqtkUVg.bU, iReSqtkUVgSzRiReSqtkUVg.bT);
        }
    }

    public Object a(Object object) {
        return this.d.h(object);
    }

    public Object a(Object object, Object object2) {
        return this.b.a(new Object[]{object, object2});
    }

    public Object a(Object object, Object object2, Object object3, Object object4) {
        return this.c.a(new Object[]{object, object2, object3, object4});
    }

    public Object b(Object object) {
        return this.e.h(object);
    }

    public void b(Object object, Object object2) {
        this.e.a(object, object2);
    }

    private Object i(Object object) {
        return this.f.h(object);
    }

    public int c(Object object) {
        return this.g.d(object);
    }

    public int d(Object object) {
        return this.h.d(object);
    }

    public int e(Object object) {
        return this.i.d(object);
    }

    public Object f(Object object) {
        return this.j.h(object);
    }

    public int g(Object object) {
        return this.k.d(object);
    }

    public Object h(Object object) {
        return this.k.h(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgcngiReSqtkUVg iReSqtkUVgcngiReSqtkUVg2, Object object) {
        return iReSqtkUVgcngiReSqtkUVg2.i(object);
    }
}

