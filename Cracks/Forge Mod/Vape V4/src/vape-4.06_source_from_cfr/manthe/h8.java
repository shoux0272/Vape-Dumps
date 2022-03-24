/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class h8
extends gJ {
    private final bP a;
    private final bP d = this.a("setLivingAnimations", true, Void.TYPE, A5.cF, Float.TYPE, Float.TYPE, Float.TYPE);
    private final bP e;

    public h8() {
        super(A5.bw);
        this.a = this.a("setRotationAngles", true, Void.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, A5.ba);
        this.e = this.a("render", true, Void.TYPE, A5.ba, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
    }

    private void a(Object object, Object object2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.e.p(object, object2, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Float.valueOf(f14), Float.valueOf(f15));
    }

    private void a(Object object, Object object2, float f10, float f11, float f12) {
        this.d.p(object, object2, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12));
    }

    private void a(Object object, float f10, float f11, float f12, float f13, float f14, float f15, Object object2) {
        this.a.p(object, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Float.valueOf(f14), Float.valueOf(f15), object2);
    }

    static void a(h8 h82, Object object, Object object2, float f10, float f11, float f12) {
        h82.a(object, object2, f10, f11, f12);
    }

    static void a(h8 h82, Object object, float f10, float f11, float f12, float f13, float f14, float f15, Object object2) {
        h82.a(object, f10, f11, f12, f13, f14, f15, object2);
    }

    static void a(h8 h82, Object object, Object object2, float f10, float f11, float f12, float f13, float f14, float f15) {
        h82.a(object, object2, f10, f11, f12, f13, f14, f15);
    }
}

