/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgiWniReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;

    public iReSqtkUVgiWniReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.cq);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.c = this.b("getInstance", false, iReSqtkUVgSzRiReSqtkUVg.cq, new Class[0]);
            this.d = this.a("renderItemIntoGUI", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.o, iReSqtkUVgSzRiReSqtkUVg.P, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE);
            this.e = this.a("renderItemOverlayIntoGUI", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.o, iReSqtkUVgSzRiReSqtkUVg.P, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE);
        } else {
            this.b = this.a("zLevel", true, Float.TYPE);
            this.f = this.a("renderItemIntoGUI", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE);
            this.g = this.a("renderItemOverlays", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.o, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE, Integer.TYPE);
        }
    }

    private Object a() {
        return this.c.j(null, new Object[0]);
    }

    private void a(Object object, Object object2, Object object3, Object object4, int n, int n2) {
        this.d.a(object, new Object[]{object2, object3, object4, n, n2});
    }

    private void a(Object object, Object object2, int n, int n2) {
        this.f.a(object, new Object[]{object2, n, n2});
    }

    private void b(Object object, Object object2, Object object3, Object object4, int n, int n2) {
        this.e.a(object, new Object[]{object2, object3, object4, n, n2});
    }

    private void a(Object object, Object object2, Object object3, int n, int n2) {
        this.g.a(object, new Object[]{object2, object3, n, n2});
    }

    private float a(Object object) {
        return this.b.f(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2) {
        return iReSqtkUVgiWniReSqtkUVg2.a();
    }

    static /* synthetic */ void a(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2, Object object, Object object2, Object object3, Object object4, int n, int n2) {
        iReSqtkUVgiWniReSqtkUVg2.a(object, object2, object3, object4, n, n2);
    }

    static /* synthetic */ void a(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2, Object object, Object object2, int n, int n2) {
        iReSqtkUVgiWniReSqtkUVg2.a(object, object2, n, n2);
    }

    static /* synthetic */ void b(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2, Object object, Object object2, Object object3, Object object4, int n, int n2) {
        iReSqtkUVgiWniReSqtkUVg2.b(object, object2, object3, object4, n, n2);
    }

    static /* synthetic */ void a(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2, Object object, Object object2, Object object3, int n, int n2) {
        iReSqtkUVgiWniReSqtkUVg2.a(object, object2, object3, n, n2);
    }

    static /* synthetic */ float a(iReSqtkUVgiWniReSqtkUVg iReSqtkUVgiWniReSqtkUVg2, Object object) {
        return iReSqtkUVgiWniReSqtkUVg2.a(object);
    }
}

