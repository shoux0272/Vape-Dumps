/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgaKUiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e;
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;
    private iReSqtkUVgkgTiReSqtkUVg i;
    private iReSqtkUVgkgTiReSqtkUVg j;
    private iReSqtkUVgkgTiReSqtkUVg k;
    private iReSqtkUVgkgTiReSqtkUVg l;
    private iReSqtkUVgkgTiReSqtkUVg m;
    private iReSqtkUVgkgTiReSqtkUVg n;
    private iReSqtkUVgkgTiReSqtkUVg o;
    private iReSqtkUVgkgTiReSqtkUVg p;
    private iReSqtkUVgkgTiReSqtkUVg q;
    private iReSqtkUVgYewiReSqtkUVg r;
    private iReSqtkUVgYewiReSqtkUVg s;

    public iReSqtkUVgaKUiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.aQ);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.q = this.b("REGISTRY", true, iReSqtkUVgSzRiReSqtkUVg.cE);
            this.s = this.b("getEnchantmentByID", true, iReSqtkUVgSzRiReSqtkUVg.aQ, Integer.TYPE);
        } else {
            this.b = this.a("effectId", true, Integer.TYPE);
            this.p = this.b("enchantmentsList", true, "[Lnet/minecraft/enchantment/Enchantment;");
        }
        this.r = this.a("getTranslatedName", true, String.class, Integer.TYPE);
    }

    private int a(Object object) {
        return this.b.d(object);
    }

    private Object[] a() {
        return this.p.p(null);
    }

    private String a(Object object, int n) {
        return (String)this.r.j(object, n);
    }

    private Object a(int n) {
        return this.s.j(null, n);
    }

    private Object b() {
        return this.q.h(null);
    }

    static /* synthetic */ String a(iReSqtkUVgaKUiReSqtkUVg iReSqtkUVgaKUiReSqtkUVg2, Object object, int n) {
        return iReSqtkUVgaKUiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ Object a(iReSqtkUVgaKUiReSqtkUVg iReSqtkUVgaKUiReSqtkUVg2) {
        return iReSqtkUVgaKUiReSqtkUVg2.b();
    }

    static /* synthetic */ Object[] b(iReSqtkUVgaKUiReSqtkUVg iReSqtkUVgaKUiReSqtkUVg2) {
        return iReSqtkUVgaKUiReSqtkUVg2.a();
    }

    static /* synthetic */ Object a(iReSqtkUVgaKUiReSqtkUVg iReSqtkUVgaKUiReSqtkUVg2, int n) {
        return iReSqtkUVgaKUiReSqtkUVg2.a(n);
    }

    static /* synthetic */ int a(iReSqtkUVgaKUiReSqtkUVg iReSqtkUVgaKUiReSqtkUVg2, Object object) {
        return iReSqtkUVgaKUiReSqtkUVg2.a(object);
    }
}

