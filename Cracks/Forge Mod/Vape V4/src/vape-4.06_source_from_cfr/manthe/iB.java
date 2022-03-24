/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class iB
extends gJ {
    private final BG e = this.b("slotIndex", true, Integer.TYPE);
    private final BG a = this.b("index", true, Integer.TYPE);
    private final BG d = this.a("MAINHAND", true, A5.cb);

    public iB() {
        super(A5.cb);
    }

    private int a(Object object) {
        return this.e.c(object);
    }

    private int b(Object object) {
        return this.a.c(object);
    }

    private Object d() {
        return this.d.f(null);
    }

    static Object a(iB iB2) {
        return iB2.d();
    }

    static int a(iB iB2, Object object) {
        return iB2.a(object);
    }

    static int b(iB iB2, Object object) {
        return iB2.b(object);
    }
}

