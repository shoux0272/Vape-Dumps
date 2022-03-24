/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class jF
extends gJ {
    private final BG a = this.b("deltaX", true, Integer.TYPE);
    private final BG d = this.b("deltaY", true, Integer.TYPE);

    public jF() {
        super(A5.q);
    }

    private int b(Object object) {
        return this.a.c(object);
    }

    private int a(Object object) {
        return this.d.c(object);
    }

    static int b(jF jF2, Object object) {
        return jF2.b(object);
    }

    static int a(jF jF2, Object object) {
        return jF2.a(object);
    }
}

