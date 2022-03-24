/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jW
extends gJ {
    private final bP g = V.c() >= 23 ? this.a("<init>", false, Void.TYPE, A5.ba) : this.a("<init>", false, Void.TYPE, A5.ba, A5.b7);
    private final BG a;
    private final BG d;
    private bP e;
    private BG f;

    public jW() {
        super(A5.cU);
        if (V.c() >= 15) {
            this.a = this.b("action", true, A5.b7);
            this.d = this.b("entityId", true, Integer.TYPE);
        } else {
            this.a = this.b("field_149566_b", false, A5.b7);
            this.d = this.b("field_149567_a", false, Integer.TYPE);
        }
    }

    private Object a(Object object, Object object2) {
        return this.g.a(new Object[]{object, object2});
    }

    private Object c(Object object) {
        return this.g.a(object);
    }

    private Object b(Object object) {
        return this.a.f(object);
    }

    int a(Object object) {
        return this.d.c(object);
    }

    static Object a(jW jW2, Object object, Object object2) {
        return jW2.a(object, object2);
    }

    static Object b(jW jW2, Object object) {
        return jW2.c(object);
    }

    static Object a(jW jW2, Object object) {
        return jW2.b(object);
    }
}

