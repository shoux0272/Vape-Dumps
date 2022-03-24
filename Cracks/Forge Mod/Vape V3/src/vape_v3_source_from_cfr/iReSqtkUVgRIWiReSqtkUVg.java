/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgRIWiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;
    private final iReSqtkUVgYewiReSqtkUVg e;
    private final iReSqtkUVgkgTiReSqtkUVg f = this.a("xCoord", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg g = this.a("yCoord", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg h = this.a("zCoord", true, Double.TYPE);

    public iReSqtkUVgRIWiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.ce);
        this.c = this.a("addVector", true, iReSqtkUVgSzRiReSqtkUVg.ce, Double.TYPE, Double.TYPE, Double.TYPE);
        this.d = this.a("distanceTo", true, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.ce);
        this.e = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("func_72436_e", false, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.ce) : this.a("squareDistanceTo", true, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.ce);
        this.b = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
    }

    public Object a(Object object, double d2, double d3, double d4) {
        return this.c.j(object, d2, d3, d4);
    }

    public double a(Object object, Object object2) {
        return this.e.h(object, object2);
    }

    public double a(Object object) {
        return this.f.g(object);
    }

    public double b(Object object) {
        return this.g.g(object);
    }

    public double c(Object object) {
        return this.h.g(object);
    }

    public double b(Object object, Object object2) {
        return this.d.h(object, object2);
    }

    public Object a(double d2, double d3, double d4) {
        return this.b.a(new Object[]{d2, d3, d4});
    }
}

