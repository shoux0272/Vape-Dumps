/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class i0
extends gJ {
    private final BG d = this.b("healAmount", true, Integer.TYPE);
    private final BG a = this.b("saturationModifier", true, Float.TYPE);

    public i0() {
        super(A5.c0);
    }

    private int b(Object object) {
        return this.d.c(object);
    }

    private float a(Object object) {
        return this.a.b(object);
    }

    static int a(i0 i02, Object object) {
        return i02.b(object);
    }

    static float b(i0 i02, Object object) {
        return i02.a(object);
    }
}

