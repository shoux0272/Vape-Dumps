/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgGIYiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b = this.a("getScaleFactor", true, Integer.TYPE, new Class[0]);
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f = this.a("getScaledHeight", true, Integer.TYPE, new Class[0]);

    public iReSqtkUVgGIYiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.t);
        this.e = this.a("getScaledWidth", true, Integer.TYPE, new Class[0]);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.d = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.b);
        } else {
            this.c = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.b, Integer.TYPE, Integer.TYPE);
        }
    }

    public int a(Object object) {
        return this.b.e(object, new Object[0]);
    }

    public int b(Object object) {
        return this.e.e(object, new Object[0]);
    }

    public int c(Object object) {
        return this.f.e(object, new Object[0]);
    }

    public Object a(Object object, int n, int n2) {
        return this.c.a(new Object[]{object, n, n2});
    }

    public Object d(Object object) {
        return this.d.a(object);
    }
}

