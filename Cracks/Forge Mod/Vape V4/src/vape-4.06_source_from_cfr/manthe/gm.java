/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class gm
extends gJ {
    private final BG e = this.b("red", false, Float.TYPE);
    private final BG a = this.b("green", false, Float.TYPE);
    private final BG d = this.b("blue", false, Float.TYPE);

    public gm() {
        super(A5.bh);
    }

    private float a(Object object) {
        return this.e.b(object);
    }

    private float b(Object object) {
        return this.a.b(object);
    }

    private float c(Object object) {
        return this.d.b(object);
    }

    private void b(Object object, float f10) {
        this.e.a(object, f10);
    }

    private void c(Object object, float f10) {
        this.a.a(object, f10);
    }

    private void a(Object object, float f10) {
        this.d.a(object, f10);
    }

    static float a(gm gm2, Object object) {
        return gm2.a(object);
    }

    static void b(gm gm2, Object object, float f10) {
        gm2.b(object, f10);
    }

    static float b(gm gm2, Object object) {
        return gm2.b(object);
    }

    static void c(gm gm2, Object object, float f10) {
        gm2.c(object, f10);
    }

    static float c(gm gm2, Object object) {
        return gm2.c(object);
    }

    static void a(gm gm2, Object object, float f10) {
        gm2.a(object, f10);
    }
}

