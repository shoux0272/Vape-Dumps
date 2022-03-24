/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class iv
extends gJ {
    private final BG e = this.b("toolMaterial", true, A5.az);
    private final BG d;
    private final BG a = this.b("efficiencyOnProperMaterial", true, Float.TYPE);

    public iv() {
        super(A5.aP);
        this.d = this.b("damageVsEntity", true, Float.TYPE);
    }

    private float a(Object object) {
        return this.a.b(object);
    }

    private Object b(Object object) {
        return this.e.f(object);
    }

    private float c(Object object) {
        return this.d.b(object);
    }

    static Object a(iv iv2, Object object) {
        return iv2.b(object);
    }

    static float b(iv iv2, Object object) {
        return iv2.c(object);
    }

    static float c(iv iv2, Object object) {
        return iv2.a(object);
    }
}

