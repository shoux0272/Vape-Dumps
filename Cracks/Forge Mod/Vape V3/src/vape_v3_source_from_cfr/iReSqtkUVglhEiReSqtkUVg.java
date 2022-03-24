/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVglhEiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgkgTiReSqtkUVg d;

    public iReSqtkUVglhEiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.am);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.d = this.a("field_194148_c", false, Float.TYPE);
        } else {
            this.b = this.a("timerSpeed", true, Float.TYPE);
            this.d = this.a("elapsedPartialTicks", true, Float.TYPE);
        }
        this.c = this.a("renderPartialTicks", true, Float.TYPE);
    }

    private void a(Object object, float f) {
        this.b.a(object, f);
    }

    private float a(Object object) {
        return this.c.f(object);
    }

    private float b(Object object) {
        return this.d.f(object);
    }

    static /* synthetic */ void a(iReSqtkUVglhEiReSqtkUVg iReSqtkUVglhEiReSqtkUVg2, Object object, float f) {
        iReSqtkUVglhEiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ float a(iReSqtkUVglhEiReSqtkUVg iReSqtkUVglhEiReSqtkUVg2, Object object) {
        return iReSqtkUVglhEiReSqtkUVg2.a(object);
    }

    static /* synthetic */ float b(iReSqtkUVglhEiReSqtkUVg iReSqtkUVglhEiReSqtkUVg2, Object object) {
        return iReSqtkUVglhEiReSqtkUVg2.b(object);
    }
}

