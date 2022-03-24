/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgFYdiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e;
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;

    public iReSqtkUVgFYdiReSqtkUVg() {
        super("net/minecraftforge/event/entity/player/PlayerInteractEvent");
        if (iReSqtkUVgauSiReSqtkUVg.d() < 23) {
            this.b = this.a("action", false, iReSqtkUVgSzRiReSqtkUVg.cG);
        }
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.c = this.a("x", false, Integer.TYPE);
            this.d = this.a("y", false, Integer.TYPE);
            this.e = this.a("z", false, Integer.TYPE);
            this.f = this.a("face", false, Integer.TYPE);
        } else {
            this.g = this.a("pos", false, iReSqtkUVgSzRiReSqtkUVg.bT);
            this.f = this.a("face", false, iReSqtkUVgSzRiReSqtkUVg.bU);
        }
    }

    private int a(Object object) {
        return this.c.d(object);
    }

    private int b(Object object) {
        return this.d.d(object);
    }

    private int c(Object object) {
        return this.e.d(object);
    }

    private int d(Object object) {
        return this.f.d(object);
    }

    private Object e(Object object) {
        return this.f.h(object);
    }

    private Object f(Object object) {
        return this.g.h(object);
    }

    private String g(Object object) {
        Object object2 = this.b.h(object);
        return object2 == null ? "" : object2.toString();
    }

    static /* synthetic */ int a(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.a(object);
    }

    static /* synthetic */ int b(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.b(object);
    }

    static /* synthetic */ int c(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.c(object);
    }

    static /* synthetic */ int d(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.d(object);
    }

    static /* synthetic */ Object e(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.f(object);
    }

    static /* synthetic */ Object f(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.e(object);
    }

    static /* synthetic */ String g(iReSqtkUVgFYdiReSqtkUVg iReSqtkUVgFYdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFYdiReSqtkUVg2.g(object);
    }
}

