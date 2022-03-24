/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class io
extends gJ {
    public final bP a = this.a("doRender", true, Void.TYPE, A5.ba, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);

    public io() {
        super(A5.bj);
    }

    private void a(Object object, Object object2, double d10, double d11, double d12, float f10, float f11) {
        this.a.p(object, object2, d10, d11, d12, Float.valueOf(f10), Float.valueOf(f11));
    }

    static void a(io io2, Object object, Object object2, double d10, double d11, double d12, float f10, float f11) {
        io2.a(object, object2, d10, d11, d12, f10, f11);
    }
}

