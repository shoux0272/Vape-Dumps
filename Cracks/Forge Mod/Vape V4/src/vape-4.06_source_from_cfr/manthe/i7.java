/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.nio.IntBuffer;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class i7
extends gJ {
    public final bP f;
    public final bP k;
    public final bP i;
    public final bP j;
    public final bP a;
    public final bP g;
    public BG l = this.b("rawIntBuffer", true, IntBuffer.class);
    private bP e;
    private bP d;
    private bP h;

    public i7() {
        super(A5.cu);
        this.f = this.a("begin", true, Void.TYPE, Integer.TYPE, A5.cw);
        this.k = this.a("pos", true, A5.cu, Double.TYPE, Double.TYPE, Double.TYPE);
        this.i = this.a("color", true, A5.cu, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
        this.j = this.a("endVertex", true, Void.TYPE, new Class[0]);
        this.a = this.a("putColorMultiplier", true, Void.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
        this.g = this.a("getColorIndex", true, Integer.TYPE, Integer.TYPE);
        this.h = this.a("putColor4", true, Void.TYPE, Integer.TYPE);
        if (V.c() > 13) {
            // empty if block
        }
    }

    private void a(Object object, int n6) {
        this.h.p(object, n6);
    }

    private void a(Object object, float f10, float f11, float f12, int n6) {
        this.a.p(object, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), n6);
    }

    private void a(Object object, int n6, Object object2) {
        this.f.p(object, n6, object2);
    }

    private Object a(Object object, double d10, double d11, double d12) {
        return this.k.e(object, d10, d11, d12);
    }

    private Object a(Object object, float f10, float f11, float f12, float f13) {
        return this.i.e(object, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13));
    }

    private void a(Object object) {
        this.j.p(object, new Object[0]);
    }

    private int b(Object object, int n6) {
        return this.g.o(object, n6);
    }

    private Object b(Object object) {
        return this.l.f(object);
    }

    static void a(i7 i72, Object object, int n6, Object object2) {
        i72.a(object, n6, object2);
    }

    static Object a(i7 i72, Object object, double d10, double d11, double d12) {
        return i72.a(object, d10, d11, d12);
    }

    static Object a(i7 i72, Object object, float f10, float f11, float f12, float f13) {
        return i72.a(object, f10, f11, f12, f13);
    }

    static void b(i7 i72, Object object) {
        i72.a(object);
    }

    static int a(i7 i72, Object object, int n6) {
        return i72.b(object, n6);
    }

    static Object a(i7 i72, Object object) {
        return i72.b(object);
    }

    static void a(i7 i72, Object object, float f10, float f11, float f12, int n6) {
        i72.a(object, f10, f11, f12, n6);
    }

    static void b(i7 i72, Object object, int n6) {
        i72.a(object, n6);
    }
}

