/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgoceiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;

    public iReSqtkUVgoceiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.ad);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.e = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ac, Integer.TYPE, Integer.TYPE);
            this.b = this.a("potion", true, iReSqtkUVgSzRiReSqtkUVg.ac);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.f = this.a("getPotionID", true, Integer.TYPE, new Class[0]);
        }
        this.c = this.a("getAmplifier", true, Integer.TYPE, new Class[0]);
        this.g = this.a("getDuration", true, Integer.TYPE, new Class[0]);
    }

    private int a(Object object) {
        return this.c.e(object, new Object[0]);
    }

    private Object a(int n, int n2, int n3) {
        return this.d.a(new Object[]{n, n2, n3});
    }

    private int b(Object object) {
        return this.f.e(object, new Object[0]);
    }

    private int c(Object object) {
        return this.g.e(object, new Object[0]);
    }

    public Object a(Object object, int n, int n2) {
        return this.e.a(new Object[]{object, n, n2});
    }

    private Object d(Object object) {
        return this.b.h(object);
    }

    static /* synthetic */ int a(iReSqtkUVgoceiReSqtkUVg iReSqtkUVgoceiReSqtkUVg2, Object object) {
        return iReSqtkUVgoceiReSqtkUVg2.a(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgoceiReSqtkUVg iReSqtkUVgoceiReSqtkUVg2, int n, int n2, int n3) {
        return iReSqtkUVgoceiReSqtkUVg2.a(n, n2, n3);
    }

    static /* synthetic */ Object b(iReSqtkUVgoceiReSqtkUVg iReSqtkUVgoceiReSqtkUVg2, Object object) {
        return iReSqtkUVgoceiReSqtkUVg2.d(object);
    }

    static /* synthetic */ int c(iReSqtkUVgoceiReSqtkUVg iReSqtkUVgoceiReSqtkUVg2, Object object) {
        return iReSqtkUVgoceiReSqtkUVg2.b(object);
    }

    static /* synthetic */ int d(iReSqtkUVgoceiReSqtkUVg iReSqtkUVgoceiReSqtkUVg2, Object object) {
        return iReSqtkUVgoceiReSqtkUVg2.c(object);
    }
}

