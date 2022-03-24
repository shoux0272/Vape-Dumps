/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgbudiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b = this.a("getUnlocalizedNameInefficiently", true, String.class, iReSqtkUVgSzRiReSqtkUVg.v);
    private final iReSqtkUVgYewiReSqtkUVg c = this.a("getItemStackDisplayName", true, String.class, iReSqtkUVgSzRiReSqtkUVg.v);
    private final iReSqtkUVgYewiReSqtkUVg d = this.b("getIdFromItem", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.w);
    private final iReSqtkUVgYewiReSqtkUVg e = this.b("getItemById", true, iReSqtkUVgSzRiReSqtkUVg.w, Integer.TYPE);
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;

    public iReSqtkUVgbudiReSqtkUVg() {
        super("net/minecraft/item/Item");
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.f = this.a("getIconString", true, String.class, new Class[0]);
        } else {
            this.g = this.b("getByNameOrId", true, iReSqtkUVgSzRiReSqtkUVg.w, String.class);
        }
        this.h = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.b("REGISTRY", true, iReSqtkUVgSzRiReSqtkUVg.cE) : this.b("itemRegistry", true, iReSqtkUVgSzRiReSqtkUVg.cE);
    }

    private Object a(String string) {
        return this.g.j(null, string);
    }

    private String a(Object object, Object object2) {
        return this.b.j(object, object2).toString();
    }

    private String a(Object object) {
        return this.f.j(object, new Object[0]).toString();
    }

    private String b(Object object, Object object2) {
        return this.c.j(object, object2).toString();
    }

    private int b(Object object) {
        return this.d.e(null, object);
    }

    private Object a(int n) {
        return this.e.j(null, n);
    }

    private Object a() {
        return this.h.h(null);
    }

    static /* synthetic */ Object a(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, String string) {
        return iReSqtkUVgbudiReSqtkUVg2.a(string);
    }

    static /* synthetic */ int a(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, Object object) {
        return iReSqtkUVgbudiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, int n) {
        return iReSqtkUVgbudiReSqtkUVg2.a(n);
    }

    static /* synthetic */ String b(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, Object object) {
        return iReSqtkUVgbudiReSqtkUVg2.a(object);
    }

    static /* synthetic */ String a(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgbudiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ String b(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgbudiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ Object a(iReSqtkUVgbudiReSqtkUVg iReSqtkUVgbudiReSqtkUVg2) {
        return iReSqtkUVgbudiReSqtkUVg2.a();
    }
}

