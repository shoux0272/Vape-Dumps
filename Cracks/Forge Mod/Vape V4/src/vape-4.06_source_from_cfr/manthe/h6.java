/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cM;
import manthe.cy;
import manthe.gJ;

public class h6
extends gJ {
    public final bP s;
    public final bP t;
    public final bP p;
    public final bP f;
    public final bP l;
    public final bP d;
    public final bP k;
    public final bP j;
    public final bP e;
    private final BG o = this.b("pointedEntity", true, A5.ba);
    private final BG h = this.b("resourceManager", true, A5.dX);
    private final BG i = V.c() >= 23 ? this.a("SHADERS_TEXTURES", true, cM.b(A5.ca)) : this.a("shaderResourceLocations", true, cM.b(A5.ca));
    private final BG r = this.b("theShaderGroup", true, A5.aD);
    private final BG n = this.b("fogStandard", true, Boolean.TYPE);
    private final BG a = this.b("fovModifierHand", true, Float.TYPE);
    private final BG q = this.b("fovModifierHandPrev", true, Float.TYPE);
    private BG g;
    private static int[] m;

    public h6() {
        super(A5.a9);
        this.s = this.a("setupCameraTransform", true, Void.TYPE, Float.TYPE, Integer.TYPE);
        this.f = this.a("updateShaderGroupSize", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.d = this.a("renderHand", true, Void.TYPE, Float.TYPE, Integer.TYPE);
        this.k = this.a("renderWorld", true, Void.TYPE, Float.TYPE, Long.TYPE);
        this.j = this.a("getMouseOver", true, Void.TYPE, Float.TYPE);
        this.e = this.a("updateLightmap", true, Void.TYPE, Float.TYPE);
        if (V.c() > 13) {
            this.t = this.a("disableLightmap", true, Void.TYPE, new Class[0]);
            this.p = this.a("enableLightmap", true, Void.TYPE, new Class[0]);
            this.g = this.b("useShader", true, Boolean.TYPE);
            this.l = this.a("func_181560_a", cy.c, Void.TYPE, Float.TYPE, Long.TYPE);
        } else {
            this.t = this.a("disableLightmap", true, Void.TYPE, Double.TYPE);
            this.p = this.a("enableLightmap", true, Void.TYPE, Double.TYPE);
            this.l = this.a("func_78480_b", false, Void.TYPE, Float.TYPE);
        }
    }

    private Object c(Object object) {
        return this.o.f(object);
    }

    private void a(Object object, Object object2) {
        this.o.a(object, object2);
    }

    private void a(Object object, float f10, int n6) {
        this.s.p(object, Float.valueOf(f10), n6);
    }

    private void b(Object object, double d10) {
        if (V.c() > 13) {
            this.t.p(object, new Object[0]);
        } else {
            this.t.p(object, d10);
        }
    }

    private void a(Object object, double d10) {
        if (V.c() > 13) {
            this.p.p(object, new Object[0]);
        } else {
            this.p.p(object, d10);
        }
    }

    private Object e(Object object) {
        return this.h.f(object);
    }

    private Object[] e() {
        return this.i.e(null);
    }

    private void b(Object object, Object object2) {
        this.r.a(object, object2);
    }

    private void a(Object object, boolean bl) {
        this.g.a(object, bl);
    }

    private boolean d(Object object) {
        return this.g.d(object);
    }

    private void a(Object object, int n6, int n10) {
        this.f.p(object, n6, n10);
    }

    private void a(Object object, float f10, long l) {
        this.l.p(object, Float.valueOf(f10));
    }

    private void b(Object object, boolean bl) {
        this.n.a(object, bl);
    }

    private void b(Object object, float f10, long l) {
        this.k.p(object, Float.valueOf(f10), l);
    }

    private float b(Object object) {
        return this.a.b(object);
    }

    private void b(Object object, float f10) {
        this.a.a(object, f10);
    }

    private float a(Object object) {
        return this.q.b(object);
    }

    private void a(Object object, float f10) {
        this.q.a(object, f10);
    }

    static Object[] a(h6 h62) {
        return h62.e();
    }

    static Object d(h6 h62, Object object) {
        return h62.c(object);
    }

    static void a(h6 h62, Object object, Object object2) {
        h62.a(object, object2);
    }

    static void a(h6 h62, Object object, float f10, int n6) {
        h62.a(object, f10, n6);
    }

    static void b(h6 h62, Object object, double d10) {
        h62.b(object, d10);
    }

    static void a(h6 h62, Object object, double d10) {
        h62.a(object, d10);
    }

    static Object b(h6 h62, Object object) {
        return h62.e(object);
    }

    static void b(h6 h62, Object object, Object object2) {
        h62.b(object, object2);
    }

    static boolean e(h6 h62, Object object) {
        return h62.d(object);
    }

    static void b(h6 h62, Object object, boolean bl) {
        h62.a(object, bl);
    }

    static void a(h6 h62, Object object, int n6, int n10) {
        h62.a(object, n6, n10);
    }

    static void a(h6 h62, Object object, float f10, long l) {
        h62.a(object, f10, l);
    }

    static void a(h6 h62, Object object, boolean bl) {
        h62.b(object, bl);
    }

    static void b(h6 h62, Object object, float f10, long l) {
        h62.b(object, f10, l);
    }

    static float c(h6 h62, Object object) {
        return h62.b(object);
    }

    static void b(h6 h62, Object object, float f10) {
        h62.b(object, f10);
    }

    static float a(h6 h62, Object object) {
        return h62.a(object);
    }

    static void a(h6 h62, Object object, float f10) {
        h62.a(object, f10);
    }

    public static void b(int[] arrn) {
        m = arrn;
    }

    public static int[] d() {
        return m;
    }

    static {
        if (h6.d() != null) {
            h6.b(new int[2]);
        }
    }
}

