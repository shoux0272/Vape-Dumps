/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgrKSiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b = this.a("renderer", false, iReSqtkUVgSzRiReSqtkUVg.r);
    private iReSqtkUVgkgTiReSqtkUVg c = this.a("entity", false, iReSqtkUVgSzRiReSqtkUVg.c);
    private iReSqtkUVgkgTiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e = this.a("renderPartialTicks", false, Double.TYPE);

    public iReSqtkUVgrKSiReSqtkUVg() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent");
        this.d = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("state", false, iReSqtkUVgSzRiReSqtkUVg.bV) : this.a("block", false, iReSqtkUVgSzRiReSqtkUVg.G);
    }

    private Object a(Object object) {
        return this.b.h(object);
    }

    private Object b(Object object) {
        return this.c.h(object);
    }

    private Object c(Object object) {
        return this.d.h(object);
    }

    private double d(Object object) {
        return this.e.f(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgrKSiReSqtkUVg iReSqtkUVgrKSiReSqtkUVg2, Object object) {
        return iReSqtkUVgrKSiReSqtkUVg2.a(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgrKSiReSqtkUVg iReSqtkUVgrKSiReSqtkUVg2, Object object) {
        return iReSqtkUVgrKSiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object c(iReSqtkUVgrKSiReSqtkUVg iReSqtkUVgrKSiReSqtkUVg2, Object object) {
        return iReSqtkUVgrKSiReSqtkUVg2.c(object);
    }

    static /* synthetic */ double d(iReSqtkUVgrKSiReSqtkUVg iReSqtkUVgrKSiReSqtkUVg2, Object object) {
        return iReSqtkUVgrKSiReSqtkUVg2.d(object);
    }
}

