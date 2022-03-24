/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgOdRiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;
    private final iReSqtkUVgYewiReSqtkUVg e;
    private final iReSqtkUVgYewiReSqtkUVg f;
    private final iReSqtkUVgYewiReSqtkUVg g;
    private final iReSqtkUVgYewiReSqtkUVg h;
    private final iReSqtkUVgYewiReSqtkUVg i;
    private final iReSqtkUVgkgTiReSqtkUVg j = this.a("width", true, Integer.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg k = this.a("height", true, Integer.TYPE);

    public iReSqtkUVgOdRiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.f);
        this.b = this.a("initGui", true, Void.TYPE, new Class[0]);
        this.c = this.a("onGuiClosed", true, Void.TYPE, new Class[0]);
        this.d = this.a("updateScreen", true, Void.TYPE, new Class[0]);
        this.e = this.a("keyTyped", true, Void.TYPE, Character.TYPE, Integer.TYPE);
        this.f = this.a("mouseClicked", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        this.g = iReSqtkUVgauSiReSqtkUVg.d() == 13 ? this.a("mouseMovedOrUp", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE) : this.a("mouseReleased", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        this.h = this.a("handleMouseInput", true, Void.TYPE, new Class[0]);
        this.i = this.a("drawScreen", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE);
    }

    public void a(Object object) {
        this.b.s(object, new Object[0]);
    }

    public void b(Object object) {
        this.c.s(object, new Object[0]);
    }

    public void c(Object object) {
        this.d.s(object, new Object[0]);
    }

    public void a(Object object, char c2, int n) {
        this.e.s(object, Character.valueOf(c2), n);
    }

    public void a(Object object, int n, int n2, int n3) {
        this.f.s(object, n, n2, n3);
    }

    public void b(Object object, int n, int n2, int n3) {
        this.g.s(object, n, n2, n3);
    }

    public void d(Object object) {
        this.h.s(object, new Object[0]);
    }

    public void a(Object object, int n, int n2, float f) {
        this.i.s(object, n, n2, Float.valueOf(f));
    }

    private int e(Object object) {
        return this.j.d(object);
    }

    private int f(Object object) {
        return this.k.d(object);
    }

    static /* synthetic */ int a(iReSqtkUVgOdRiReSqtkUVg iReSqtkUVgOdRiReSqtkUVg2, Object object) {
        return iReSqtkUVgOdRiReSqtkUVg2.e(object);
    }

    static /* synthetic */ int b(iReSqtkUVgOdRiReSqtkUVg iReSqtkUVgOdRiReSqtkUVg2, Object object) {
        return iReSqtkUVgOdRiReSqtkUVg2.f(object);
    }
}

