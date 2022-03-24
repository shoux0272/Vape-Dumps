/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgFCdiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.b("INSTANCE", true, iReSqtkUVgSzRiReSqtkUVg.K) : this.b("instance", true, iReSqtkUVgSzRiReSqtkUVg.K);
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;
    private iReSqtkUVgYewiReSqtkUVg h;

    public iReSqtkUVgFCdiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.K);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.c = this.a("worldRenderer", true, iReSqtkUVgSzRiReSqtkUVg.cx);
            this.d = this.a("draw", true, Void.TYPE, new Class[0]);
        } else {
            this.e = this.a("startDrawingQuads", true, Void.TYPE, new Class[0]);
            this.f = this.a("addVertex", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
            this.d = this.a("draw", true, Integer.TYPE, new Class[0]);
            this.g = this.a("startDrawing", true, Void.TYPE, Integer.TYPE);
            this.h = this.a("addVertexWithUV", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        }
    }

    private Object a() {
        return this.b.h(null);
    }

    private Object a(Object object) {
        return this.c.h(object);
    }

    private void b(Object object) {
        this.d.a(object, new Object[0]);
    }

    private void c(Object object) {
        this.e.a(object, new Object[0]);
    }

    private void a(Object object, double d2, double d3, double d4) {
        this.f.a(object, new Object[]{d2, d3, d4});
    }

    private void a(Object object, double d2, double d3, double d4, double d5, double d6) {
        this.h.a(object, new Object[]{d2, d3, d4, d5, d6});
    }

    private void a(Object object, int n) {
        this.g.a(object, new Object[]{n});
    }

    static /* synthetic */ Object a(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2) {
        return iReSqtkUVgFCdiReSqtkUVg2.a();
    }

    static /* synthetic */ Object a(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object) {
        return iReSqtkUVgFCdiReSqtkUVg2.a(object);
    }

    static /* synthetic */ void b(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object) {
        iReSqtkUVgFCdiReSqtkUVg2.b(object);
    }

    static /* synthetic */ void c(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object) {
        iReSqtkUVgFCdiReSqtkUVg2.c(object);
    }

    static /* synthetic */ void a(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object, double d2, double d3, double d4) {
        iReSqtkUVgFCdiReSqtkUVg2.a(object, d2, d3, d4);
    }

    static /* synthetic */ void a(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgFCdiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ void a(iReSqtkUVgFCdiReSqtkUVg iReSqtkUVgFCdiReSqtkUVg2, Object object, double d2, double d3, double d4, double d5, double d6) {
        iReSqtkUVgFCdiReSqtkUVg2.a(object, d2, d3, d4, d5, d6);
    }
}

