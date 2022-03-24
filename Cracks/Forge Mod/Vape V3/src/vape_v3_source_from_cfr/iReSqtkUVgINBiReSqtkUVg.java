/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgINBiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b = this.a("getSizeInventory", true, Integer.TYPE, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg c = this.a("getStackInSlot", true, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE);
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;

    public iReSqtkUVgINBiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.al);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.d = this.a("getInventoryName", true, String.class, new Class[0]);
            this.e = this.a("hasCustomInventoryName", true, Boolean.TYPE, new Class[0]);
        }
    }

    private int a(Object object) {
        return this.b.e(object, new Object[0]);
    }

    private Object a(Object object, int n) {
        return this.c.j(object, n);
    }

    private String b(Object object) {
        return this.d.j(object, new Object[0]).toString();
    }

    private boolean c(Object object) {
        return this.e.b(object, new Object[0]);
    }

    static /* synthetic */ String a(iReSqtkUVgINBiReSqtkUVg iReSqtkUVgINBiReSqtkUVg2, Object object) {
        return iReSqtkUVgINBiReSqtkUVg2.b(object);
    }

    static /* synthetic */ int b(iReSqtkUVgINBiReSqtkUVg iReSqtkUVgINBiReSqtkUVg2, Object object) {
        return iReSqtkUVgINBiReSqtkUVg2.a(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgINBiReSqtkUVg iReSqtkUVgINBiReSqtkUVg2, Object object, int n) {
        return iReSqtkUVgINBiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ boolean c(iReSqtkUVgINBiReSqtkUVg iReSqtkUVgINBiReSqtkUVg2, Object object) {
        return iReSqtkUVgINBiReSqtkUVg2.c(object);
    }
}

