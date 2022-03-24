/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgrZziReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c = this.a("<init>", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg d;
    private final iReSqtkUVgYewiReSqtkUVg e;
    private final iReSqtkUVgYewiReSqtkUVg f;
    private final iReSqtkUVgYewiReSqtkUVg g;
    private final iReSqtkUVgYewiReSqtkUVg h;
    private final iReSqtkUVgkgTiReSqtkUVg i;

    public iReSqtkUVgrZziReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.R);
        this.b = this.a("createBindFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.d = this.a("bindFramebuffer", true, Void.TYPE, Boolean.TYPE);
        this.e = this.a("unbindFramebuffer", true, Void.TYPE, new Class[0]);
        this.f = this.a("bindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.g = this.a("unbindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.h = this.a("createFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.i = this.a("depthBuffer", true, Integer.TYPE);
    }

    private Object a(int n, int n2, boolean bl) {
        return this.c.a(new Object[]{n, n2, bl});
    }

    private void a(Object object, int n, int n2) {
        this.b.a(object, new Object[]{n, n2});
    }

    private void b(Object object, int n, int n2) {
        this.h.a(object, new Object[]{n, n2});
    }

    private void a(Object object, boolean bl) {
        this.d.a(object, new Object[]{bl});
    }

    private void a(Object object) {
        this.e.a(object, new Object[0]);
    }

    private void b(Object object) {
        this.f.a(object, new Object[0]);
    }

    private void c(Object object) {
        this.g.a(object, new Object[0]);
    }

    private int d(Object object) {
        return this.i.d(object);
    }

    private void a(Object object, int n) {
        this.i.a(object, n);
    }

    static /* synthetic */ Object a(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, int n, int n2, boolean bl) {
        return iReSqtkUVgrZziReSqtkUVg2.a(n, n2, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object, int n, int n2) {
        iReSqtkUVgrZziReSqtkUVg2.a(object, n, n2);
    }

    static /* synthetic */ void b(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object, int n, int n2) {
        iReSqtkUVgrZziReSqtkUVg2.b(object, n, n2);
    }

    static /* synthetic */ void a(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgrZziReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object) {
        iReSqtkUVgrZziReSqtkUVg2.a(object);
    }

    static /* synthetic */ void b(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object) {
        iReSqtkUVgrZziReSqtkUVg2.b(object);
    }

    static /* synthetic */ void c(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object) {
        iReSqtkUVgrZziReSqtkUVg2.c(object);
    }

    static /* synthetic */ int d(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object) {
        return iReSqtkUVgrZziReSqtkUVg2.d(object);
    }

    static /* synthetic */ void a(iReSqtkUVgrZziReSqtkUVg iReSqtkUVgrZziReSqtkUVg2, Object object, int n) {
        iReSqtkUVgrZziReSqtkUVg2.a(object, n);
    }
}

