/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgbMziReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e = this.a("loadedEntityList", true, List.class);
    private iReSqtkUVgkgTiReSqtkUVg f = this.a("playerEntities", true, List.class);
    private iReSqtkUVgkgTiReSqtkUVg g = this.a("loadedTileEntityList", true, List.class);
    private iReSqtkUVgkgTiReSqtkUVg h = this.a("provider", true, iReSqtkUVgSzRiReSqtkUVg.l);
    private iReSqtkUVgYewiReSqtkUVg i;
    private iReSqtkUVgYewiReSqtkUVg j;
    private iReSqtkUVgYewiReSqtkUVg k;
    private iReSqtkUVgYewiReSqtkUVg l;
    private iReSqtkUVgYewiReSqtkUVg m;
    private iReSqtkUVgYewiReSqtkUVg n;
    private iReSqtkUVgYewiReSqtkUVg o;
    private iReSqtkUVgYewiReSqtkUVg p;
    private iReSqtkUVgYewiReSqtkUVg q;
    private iReSqtkUVgYewiReSqtkUVg r;
    private iReSqtkUVgYewiReSqtkUVg s;

    public iReSqtkUVgbMziReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.k);
        this.b = this.a("getEntitiesWithinAABBExcludingEntity", true, List.class, iReSqtkUVgSzRiReSqtkUVg.c, iReSqtkUVgSzRiReSqtkUVg.cf);
        this.d = this.a("func_147470_e", false, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf);
        this.l = this.a("removeEntity", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
        this.o = this.a("getChunkFromChunkCoords", true, iReSqtkUVgSzRiReSqtkUVg.bi, Integer.TYPE, Integer.TYPE);
        this.p = this.a("getChunkProvider", true, iReSqtkUVgSzRiReSqtkUVg.bj, new Class[0]);
        this.s = this.a("getEntityByID", true, iReSqtkUVgSzRiReSqtkUVg.c, Integer.TYPE);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.n = this.a("checkChunksExist", true, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.i = this.a("getBlock", true, iReSqtkUVgSzRiReSqtkUVg.G, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.m = this.a("func_147447_a", false, iReSqtkUVgSzRiReSqtkUVg.cg, iReSqtkUVgSzRiReSqtkUVg.ce, iReSqtkUVgSzRiReSqtkUVg.ce, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
            this.q = this.a("getBlockMetadata", true, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.r = this.a("blockExists", true, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        } else {
            this.n = this.a("func_175707_a", false, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.bT);
            this.j = this.a("getBlockState", true, iReSqtkUVgSzRiReSqtkUVg.bV, iReSqtkUVgSzRiReSqtkUVg.bT);
            this.k = this.a("isFlammableWithin", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf);
            this.m = this.a("rayTraceBlocks", true, iReSqtkUVgSzRiReSqtkUVg.cg, iReSqtkUVgSzRiReSqtkUVg.ce, iReSqtkUVgSzRiReSqtkUVg.ce, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
            this.r = this.a("isValid", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.bT);
        }
        this.c = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("getCollisionBoxes", true, List.class, iReSqtkUVgSzRiReSqtkUVg.c, iReSqtkUVgSzRiReSqtkUVg.cf) : this.a("getCollidingBoundingBoxes", true, List.class, iReSqtkUVgSzRiReSqtkUVg.c, iReSqtkUVgSzRiReSqtkUVg.cf);
    }

    public Object a(Object object) {
        return this.p.j(object, new Object[0]);
    }

    public Object a(Object object, Object object2, Object object3, boolean bl, boolean bl2, boolean bl3) {
        return this.m.j(object, object2, object3, bl, bl2, bl3);
    }

    public List b(Object object) {
        return (List)this.e.h(object);
    }

    public List c(Object object) {
        return (List)this.f.h(object);
    }

    public List d(Object object) {
        return (List)this.g.h(object);
    }

    public List a(Object object, Object object2, Object object3) {
        return (List)this.b.j(object, object2, object3);
    }

    public Object a(Object object, int n, int n2, int n3) {
        return this.i.j(object, n, n2, n3);
    }

    public Object a(Object object, Object object2) {
        return this.j.j(object, object2);
    }

    public List b(Object object, Object object2, Object object3) {
        return (List)this.c.j(object, object2, object3);
    }

    private boolean b(Object object, Object object2) {
        return this.d.b(object, object2);
    }

    private boolean c(Object object, Object object2) {
        return this.k.b(object, object2);
    }

    private void d(Object object, Object object2) {
        this.l.a(object, new Object[]{object2});
    }

    private Object e(Object object) {
        return this.h.h(object);
    }

    private boolean a(Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        return this.n.b(object, n, n2, n3, n4, n5, n6);
    }

    private boolean c(Object object, Object object2, Object object3) {
        return this.n.b(object, object2, object3);
    }

    private Object a(Object object, int n, int n2) {
        return this.o.j(object, n, n2);
    }

    private int b(Object object, int n, int n2, int n3) {
        return this.q.e(object, n, n2, n3);
    }

    private boolean c(Object object, int n, int n2, int n3) {
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            return this.r.b(object, n, n2, n3);
        }
        return this.r.b(object, iReSqtkUVgSafiReSqtkUVg.a(n, n2, n3).a());
    }

    private Object a(Object object, int n) {
        return this.s.j(object, n);
    }

    static /* synthetic */ boolean a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgbMziReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ boolean b(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgbMziReSqtkUVg2.c(object, object2);
    }

    static /* synthetic */ void c(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgbMziReSqtkUVg2.d(object, object2);
    }

    static /* synthetic */ Object a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object) {
        return iReSqtkUVgbMziReSqtkUVg2.e(object);
    }

    static /* synthetic */ boolean a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        return iReSqtkUVgbMziReSqtkUVg2.a(object, n, n2, n3, n4, n5, n6);
    }

    static /* synthetic */ boolean a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, Object object2, Object object3) {
        return iReSqtkUVgbMziReSqtkUVg2.c(object, object2, object3);
    }

    static /* synthetic */ Object a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, int n, int n2) {
        return iReSqtkUVgbMziReSqtkUVg2.a(object, n, n2);
    }

    static /* synthetic */ int a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, int n, int n2, int n3) {
        return iReSqtkUVgbMziReSqtkUVg2.b(object, n, n2, n3);
    }

    static /* synthetic */ boolean b(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, int n, int n2, int n3) {
        return iReSqtkUVgbMziReSqtkUVg2.c(object, n, n2, n3);
    }

    static /* synthetic */ Object a(iReSqtkUVgbMziReSqtkUVg iReSqtkUVgbMziReSqtkUVg2, Object object, int n) {
        return iReSqtkUVgbMziReSqtkUVg2.a(object, n);
    }
}

