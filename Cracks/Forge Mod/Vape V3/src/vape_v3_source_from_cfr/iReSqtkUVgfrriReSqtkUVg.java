/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgfrriReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg k;
    private final iReSqtkUVgkgTiReSqtkUVg l;
    public final iReSqtkUVgYewiReSqtkUVg b;
    public final iReSqtkUVgYewiReSqtkUVg c;
    public final iReSqtkUVgYewiReSqtkUVg d;
    public final iReSqtkUVgYewiReSqtkUVg e;
    public final iReSqtkUVgYewiReSqtkUVg f;
    public final iReSqtkUVgYewiReSqtkUVg g;
    public final iReSqtkUVgYewiReSqtkUVg h;
    public final iReSqtkUVgYewiReSqtkUVg i;
    public final iReSqtkUVgYewiReSqtkUVg j;

    public iReSqtkUVgfrriReSqtkUVg() {
        super("net/minecraft/client/multiplayer/PlayerControllerMP");
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.k = this.a("connection", true, iReSqtkUVgSzRiReSqtkUVg.aa);
            this.d = this.a("windowClick", true, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.cM, iReSqtkUVgSzRiReSqtkUVg.d);
            this.h = this.a("processRightClick", true, iReSqtkUVgSzRiReSqtkUVg.cN, iReSqtkUVgSzRiReSqtkUVg.d, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.cL);
        } else {
            this.k = this.a("netClientHandler", true, iReSqtkUVgSzRiReSqtkUVg.aa);
            this.d = this.a("windowClick", true, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.d);
            this.h = this.a("sendUseItem", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.d, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.v);
        }
        this.l = this.a("isHittingBlock", true, Boolean.TYPE);
        this.b = this.a("getBlockReachDistance", true, Float.TYPE, new Class[0]);
        this.c = this.a("extendedReach", true, Boolean.TYPE, new Class[0]);
        this.e = this.a("attackEntity", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.d, iReSqtkUVgSzRiReSqtkUVg.c);
        this.f = this.a("syncCurrentPlayItem", true, Void.TYPE, new Class[0]);
        this.i = this.a("updateController", true, Void.TYPE, new Class[0]);
        this.j = this.a("onStoppedUsingItem", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.d);
        this.g = iReSqtkUVgauSiReSqtkUVg.d() > 13 ? (iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("processRightClickBlock", true, iReSqtkUVgSzRiReSqtkUVg.cN, iReSqtkUVgSzRiReSqtkUVg.e, iReSqtkUVgSzRiReSqtkUVg.m, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.bU, iReSqtkUVgSzRiReSqtkUVg.ce, iReSqtkUVgSzRiReSqtkUVg.cL) : this.a("onPlayerRightClick", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.e, iReSqtkUVgSzRiReSqtkUVg.m, iReSqtkUVgSzRiReSqtkUVg.v, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.bU, iReSqtkUVgSzRiReSqtkUVg.ce)) : this.a("onPlayerRightClick", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.d, iReSqtkUVgSzRiReSqtkUVg.k, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.ce);
    }

    public void a(Object object) {
        this.i.a(object, new Object[0]);
    }

    public boolean a(Object object, Object object2, Object object3, Object object4) {
        return this.h.b(object, object2, object3, object4);
    }

    public Object b(Object object, Object object2, Object object3, Object object4) {
        return this.h.j(object, object2, object3, object4);
    }

    public void a(Object object, Object object2) {
        this.j.a(object, new Object[]{object2});
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.g.b(object, object2, object3, object4, object5, object6, object7);
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, int n, int n2, int n3, int n4, Object object5) {
        return this.g.b(object, object2, object3, object4, n, n2, n3, n4, object5);
    }

    public boolean b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.g.b(object, object2, object3, object4, object5, object6, object7);
    }

    public float b(Object object) {
        return this.b.g(object, new Object[0]);
    }

    public boolean c(Object object) {
        return this.c.b(object, new Object[0]);
    }

    public Object a(Object object, int n, int n2, int n3, int n4, Object object2) {
        return this.d.j(object, n, n2, n3, n4, object2);
    }

    public Object a(Object object, int n, int n2, int n3, Object object2, Object object3) {
        return this.d.j(object, n, n2, n3, object2, object3);
    }

    private void a(Object object, Object object2, Object object3) {
        this.e.a(object, new Object[]{object2, object3});
    }

    private void d(Object object) {
        this.f.a(object, new Object[0]);
    }

    private Object e(Object object) {
        return this.k.h(object);
    }

    private boolean f(Object object) {
        return this.l.a(object);
    }

    static /* synthetic */ void a(iReSqtkUVgfrriReSqtkUVg iReSqtkUVgfrriReSqtkUVg2, Object object, Object object2, Object object3) {
        iReSqtkUVgfrriReSqtkUVg2.a(object, object2, object3);
    }

    static /* synthetic */ void a(iReSqtkUVgfrriReSqtkUVg iReSqtkUVgfrriReSqtkUVg2, Object object) {
        iReSqtkUVgfrriReSqtkUVg2.d(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgfrriReSqtkUVg iReSqtkUVgfrriReSqtkUVg2, Object object) {
        return iReSqtkUVgfrriReSqtkUVg2.e(object);
    }

    static /* synthetic */ boolean c(iReSqtkUVgfrriReSqtkUVg iReSqtkUVgfrriReSqtkUVg2, Object object) {
        return iReSqtkUVgfrriReSqtkUVg2.f(object);
    }
}

