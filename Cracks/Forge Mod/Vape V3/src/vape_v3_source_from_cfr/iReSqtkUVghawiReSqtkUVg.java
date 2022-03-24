/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVghawiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;

    public iReSqtkUVghawiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.bq);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.c = this.a("getMainModel", true, iReSqtkUVgSzRiReSqtkUVg.cd, new Class[0]);
        } else {
            this.b = this.a("modelBipedMain", true, iReSqtkUVgSzRiReSqtkUVg.bp);
        }
    }

    private Object a(Object object) {
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            return this.c.j(object, new Object[0]);
        }
        return this.b.h(object);
    }

    static /* synthetic */ Object a(iReSqtkUVghawiReSqtkUVg iReSqtkUVghawiReSqtkUVg2, Object object) {
        return iReSqtkUVghawiReSqtkUVg2.a(object);
    }
}

