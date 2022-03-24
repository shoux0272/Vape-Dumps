/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgPdQiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e;
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgYewiReSqtkUVg h;
    private iReSqtkUVgYewiReSqtkUVg i;
    private iReSqtkUVgYewiReSqtkUVg j;
    private iReSqtkUVgYewiReSqtkUVg k;
    private iReSqtkUVgYewiReSqtkUVg l;

    public iReSqtkUVgPdQiReSqtkUVg() {
        super("net/minecraft/util/EnumFacing");
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.j = this.b("values", false, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.bU), new Class[0]);
            this.h = this.a("getOpposite", true, iReSqtkUVgSzRiReSqtkUVg.bU, new Class[0]);
            this.l = this.a("ordinal", false, Integer.TYPE, new Class[0]);
            this.i = this.a("getDirectionVec", true, iReSqtkUVgSzRiReSqtkUVg.bS, new Class[0]);
        } else {
            this.b = this.b("faceList", true, "[Lnet/minecraft/util/EnumFacing;");
            this.c = this.a("order_b", true, Integer.TYPE);
            this.d = this.a("order_a", true, Integer.TYPE);
            this.e = this.a("frontOffsetX", true, Integer.TYPE);
            this.f = this.a("frontOffsetY", true, Integer.TYPE);
            this.g = this.a("frontOffsetZ", true, Integer.TYPE);
        }
    }

    public int a(Object object) {
        return this.l.e(object, new Object[0]);
    }

    public Object b(Object object) {
        return this.k.j(object, new Object[0]);
    }

    public Object[] a() {
        return this.j.r(null, new Object[0]);
    }

    public Object[] b() {
        return this.b.p(null);
    }

    public Object c(Object object) {
        return this.i.j(object, new Object[0]);
    }

    public Object d(Object object) {
        return this.h.j(object, new Object[0]);
    }

    private int e(Object object) {
        return this.c.d(object);
    }

    private int f(Object object) {
        return this.d.d(object);
    }

    private int g(Object object) {
        return this.e.d(object);
    }

    private int h(Object object) {
        return this.f.d(object);
    }

    private int i(Object object) {
        return this.g.d(object);
    }

    static /* synthetic */ int a(iReSqtkUVgPdQiReSqtkUVg iReSqtkUVgPdQiReSqtkUVg2, Object object) {
        return iReSqtkUVgPdQiReSqtkUVg2.f(object);
    }

    static /* synthetic */ int b(iReSqtkUVgPdQiReSqtkUVg iReSqtkUVgPdQiReSqtkUVg2, Object object) {
        return iReSqtkUVgPdQiReSqtkUVg2.e(object);
    }

    static /* synthetic */ int c(iReSqtkUVgPdQiReSqtkUVg iReSqtkUVgPdQiReSqtkUVg2, Object object) {
        return iReSqtkUVgPdQiReSqtkUVg2.g(object);
    }

    static /* synthetic */ int d(iReSqtkUVgPdQiReSqtkUVg iReSqtkUVgPdQiReSqtkUVg2, Object object) {
        return iReSqtkUVgPdQiReSqtkUVg2.h(object);
    }

    static /* synthetic */ int e(iReSqtkUVgPdQiReSqtkUVg iReSqtkUVgPdQiReSqtkUVg2, Object object) {
        return iReSqtkUVgPdQiReSqtkUVg2.i(object);
    }
}

