/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgjFliReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b;
    private final iReSqtkUVgkgTiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;

    public iReSqtkUVgjFliReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.V);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.b = this.b("AIR", true, iReSqtkUVgSzRiReSqtkUVg.V);
            this.c = this.b("WATER", true, iReSqtkUVgSzRiReSqtkUVg.V);
        } else {
            this.b = this.b("air", true, iReSqtkUVgSzRiReSqtkUVg.V);
            this.c = this.b("water", true, iReSqtkUVgSzRiReSqtkUVg.V);
        }
        this.d = this.a("isReplaceable", true, Boolean.TYPE, new Class[0]);
    }

    public boolean a(Object object) {
        return this.d.b(object, new Object[0]);
    }

    public Object a() {
        return this.b.h(null);
    }

    public Object b() {
        return this.c.h(null);
    }
}

