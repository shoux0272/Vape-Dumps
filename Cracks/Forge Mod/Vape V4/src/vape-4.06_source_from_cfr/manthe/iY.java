/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iY
extends gJ {
    private final bP a;
    private final BG d;

    public iY() {
        super(A5.bO);
        if (V.c() >= 15) {
            this.a = this.a("getDamageVsEntity", true, Float.TYPE, new Class[0]);
            this.d = this.b("material", true, A5.az);
        } else {
            this.a = this.a("func_150931_i", false, Float.TYPE, new Class[0]);
            this.d = this.b("field_150933_b", false, A5.az);
        }
    }

    private float b(Object object) {
        return this.a.f(object, new Object[0]);
    }

    private Object a(Object object) {
        return this.d.f(object);
    }

    static float a(iY iY2, Object object) {
        return iY2.b(object);
    }

    static Object b(iY iY2, Object object) {
        return iY2.a(object);
    }
}

