/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class gE
extends gJ {
    private final BG d = this.b("fogMode", false, Integer.TYPE);
    private final BG a = this.b("farPlaneDistance", false, Float.TYPE);

    public gE() {
        super(A5.M);
    }

    private int b(Object object) {
        return this.d.c(object);
    }

    private float a(Object object) {
        return this.a.b(object);
    }

    static int b(gE gE2, Object object) {
        return gE2.b(object);
    }

    static float a(gE gE2, Object object) {
        return gE2.a(object);
    }
}

