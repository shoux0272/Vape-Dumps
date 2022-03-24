/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgGuhiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;

    public iReSqtkUVgGuhiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.aP);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.b = this.b("getEnchantmentLevel", true, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.aQ, iReSqtkUVgSzRiReSqtkUVg.v);
            this.d = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, Iterable.class, iReSqtkUVgSzRiReSqtkUVg.aV);
        } else {
            this.b = this.b("getEnchantmentLevel", true, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.v);
            this.d = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.v), iReSqtkUVgSzRiReSqtkUVg.aV);
        }
        this.c = this.b("func_152377_a", false, Float.TYPE, iReSqtkUVgSzRiReSqtkUVg.v, iReSqtkUVgSzRiReSqtkUVg.aU);
    }

    private int a(int n, Object object) {
        return this.b.e(null, n, object);
    }

    private int b(Object object, Object object2) {
        return this.b.e(null, object, object2);
    }

    public float a(Object object, Object object2) {
        return this.c.g(null, object, object2);
    }

    private int a(Object[] arrobject, Object object) {
        return this.d.e(null, arrobject, object);
    }

    private int a(Iterable iterable, Object object) {
        return this.d.e(null, iterable, object);
    }

    static /* synthetic */ int a(iReSqtkUVgGuhiReSqtkUVg iReSqtkUVgGuhiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgGuhiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ int a(iReSqtkUVgGuhiReSqtkUVg iReSqtkUVgGuhiReSqtkUVg2, int n, Object object) {
        return iReSqtkUVgGuhiReSqtkUVg2.a(n, object);
    }

    static /* synthetic */ int a(iReSqtkUVgGuhiReSqtkUVg iReSqtkUVgGuhiReSqtkUVg2, Iterable iterable, Object object) {
        return iReSqtkUVgGuhiReSqtkUVg2.a(iterable, object);
    }

    static /* synthetic */ int a(iReSqtkUVgGuhiReSqtkUVg iReSqtkUVgGuhiReSqtkUVg2, Object[] arrobject, Object object) {
        return iReSqtkUVgGuhiReSqtkUVg2.a(arrobject, object);
    }
}

