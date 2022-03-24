/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgEgLiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d;
    private iReSqtkUVgkgTiReSqtkUVg e;

    public iReSqtkUVgEgLiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.aB);
        iReSqtkUVgoFRiReSqtkUVg.a(iReSqtkUVgauSiReSqtkUVg.d() == 13);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.b = this.a("xCoord", true, Integer.TYPE);
            this.c = this.a("yCoord", true, Integer.TYPE);
            this.d = this.a("zCoord", true, Integer.TYPE);
        } else {
            this.e = this.a("pos", true, iReSqtkUVgSzRiReSqtkUVg.bT);
        }
    }

    public int a(Object object) {
        return this.b.d(object);
    }

    public int b(Object object) {
        return this.c.d(object);
    }

    public int c(Object object) {
        return this.d.d(object);
    }

    public Object d(Object object) {
        return this.e.h(object);
    }
}

