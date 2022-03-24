/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class j9
extends gJ {
    private bP d;
    private bP a;

    public j9() {
        super(A5.bH);
        if (V.c() > 13) {
            this.a = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE);
        }
    }

    public Object a(double d10, double d11, double d12, double d13, float f10, float f11, boolean bl) {
        return this.d.a(new Object[]{d10, d11, d12, d13, Float.valueOf(f10), Float.valueOf(f11), bl});
    }

    private Object a(double d10, double d11, double d12, float f10, float f11, boolean bl) {
        return this.a.a(new Object[]{d10, d11, d12, Float.valueOf(f10), Float.valueOf(f11), bl});
    }

    static Object a(j9 j92, double d10, double d11, double d12, float f10, float f11, boolean bl) {
        return j92.a(d10, d11, d12, f10, f11, bl);
    }
}

