/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jb
extends gJ {
    private bP a;
    private bP d;

    public jb() {
        super(A5.G);
        if (V.c() > 13) {
            this.d = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE);
        } else {
            this.a = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE);
        }
    }

    public Object a(double d10, double d11, double d12, double d13, boolean bl) {
        return this.a.a(new Object[]{d10, d11, d12, d13, bl});
    }

    private Object a(double d10, double d11, double d12, boolean bl) {
        return this.d.a(new Object[]{d10, d11, d12, bl});
    }

    static Object a(jb jb2, double d10, double d11, double d12, boolean bl) {
        return jb2.a(d10, d11, d12, bl);
    }
}

