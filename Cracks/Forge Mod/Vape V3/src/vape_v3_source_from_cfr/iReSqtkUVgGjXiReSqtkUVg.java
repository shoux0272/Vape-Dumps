/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgGjXiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("pointedEntity", true, iReSqtkUVgSzRiReSqtkUVg.c);
    private final iReSqtkUVgkgTiReSqtkUVg c = this.a("resourceManager", true, iReSqtkUVgSzRiReSqtkUVg.Q);
    private final iReSqtkUVgkgTiReSqtkUVg d = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.b("SHADERS_TEXTURES", true, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.S)) : this.b("shaderResourceLocations", true, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.S));
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("theShaderGroup", true, iReSqtkUVgSzRiReSqtkUVg.T);
    private final iReSqtkUVgkgTiReSqtkUVg f = this.a("fogStandard", true, Boolean.TYPE);
    private iReSqtkUVgkgTiReSqtkUVg g;
    private final iReSqtkUVgYewiReSqtkUVg h = this.a("setupCameraTransform", true, Void.TYPE, Float.TYPE, Integer.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg i;
    private final iReSqtkUVgYewiReSqtkUVg j;
    private final iReSqtkUVgYewiReSqtkUVg k = this.a("updateShaderGroupSize", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg l;

    public iReSqtkUVgGjXiReSqtkUVg() {
        super("net/minecraft/client/renderer/EntityRenderer");
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.i = this.a("disableLightmap", true, Void.TYPE, new Class[0]);
            this.j = this.a("enableLightmap", true, Void.TYPE, new Class[0]);
            this.g = this.a("useShader", true, Boolean.TYPE);
            this.l = this.a("func_181560_a", false, Void.TYPE, Float.TYPE, Long.TYPE);
        } else {
            this.i = this.a("disableLightmap", true, Void.TYPE, Double.TYPE);
            this.j = this.a("enableLightmap", true, Void.TYPE, Double.TYPE);
            this.l = this.a("func_78480_b", false, Void.TYPE, Float.TYPE);
        }
    }

    private Object a(Object object) {
        return this.b.h(object);
    }

    private void a(Object object, Object object2) {
        this.b.a(object, object2);
    }

    private void a(Object object, float f, int n) {
        this.h.a(object, new Object[]{Float.valueOf(f), n});
    }

    private void a(Object object, double d2) {
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.i.a(object, new Object[0]);
        } else {
            this.i.a(object, new Object[]{d2});
        }
    }

    private void b(Object object, double d2) {
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.j.a(object, new Object[0]);
        } else {
            this.j.a(object, new Object[]{d2});
        }
    }

    private Object b(Object object) {
        return this.c.h(object);
    }

    private Object[] a() {
        return this.d.p(null);
    }

    private void b(Object object, Object object2) {
        this.e.a(object, object2);
    }

    private void a(Object object, boolean bl) {
        this.g.a(object, bl);
    }

    private boolean c(Object object) {
        return this.g.a(object);
    }

    private void a(Object object, int n, int n2) {
        this.k.a(object, new Object[]{n, n2});
    }

    private void a(Object object, float f, long l) {
        this.l.a(object, new Object[]{Float.valueOf(f)});
    }

    private void b(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    static /* synthetic */ Object a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object) {
        return iReSqtkUVgGjXiReSqtkUVg2.a(object);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, float f, int n) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, f, n);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, d2);
    }

    static /* synthetic */ void b(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgGjXiReSqtkUVg2.b(object, d2);
    }

    static /* synthetic */ Object b(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object) {
        return iReSqtkUVgGjXiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object[] a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2) {
        return iReSqtkUVgGjXiReSqtkUVg2.a();
    }

    static /* synthetic */ void b(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgGjXiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean c(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object) {
        return iReSqtkUVgGjXiReSqtkUVg2.c(object);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, int n, int n2) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, n, n2);
    }

    static /* synthetic */ void a(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, float f, long l) {
        iReSqtkUVgGjXiReSqtkUVg2.a(object, f, l);
    }

    static /* synthetic */ void b(iReSqtkUVgGjXiReSqtkUVg iReSqtkUVgGjXiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgGjXiReSqtkUVg2.b(object, bl);
    }
}

