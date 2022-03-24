/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgrQliReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;

    public iReSqtkUVgrQliReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.aJ);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.c = this.a("getCachedEntity", true, iReSqtkUVgSzRiReSqtkUVg.c, new Class[0]);
        } else {
            this.b = this.a("getEntityNameToSpawn", true, String.class, new Class[0]);
        }
    }

    private String a(Object object) {
        return (String)this.b.j(object, new Object[0]);
    }

    private Object b(Object object) {
        return this.c.j(object, new Object[0]);
    }

    static /* synthetic */ Object a(iReSqtkUVgrQliReSqtkUVg iReSqtkUVgrQliReSqtkUVg2, Object object) {
        return iReSqtkUVgrQliReSqtkUVg2.b(object);
    }

    static /* synthetic */ String b(iReSqtkUVgrQliReSqtkUVg iReSqtkUVgrQliReSqtkUVg2, Object object) {
        return iReSqtkUVgrQliReSqtkUVg2.a(object);
    }
}

