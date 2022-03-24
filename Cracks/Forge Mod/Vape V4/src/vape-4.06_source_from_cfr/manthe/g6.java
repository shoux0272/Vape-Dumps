/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class g6
extends gJ {
    private final BG a = this.b("button", false, Integer.TYPE);
    private final BG d = this.b("buttonstate", false, Boolean.TYPE);

    public g6() {
        super(A5.dH);
    }

    public void a(Object object, int n6) {
        this.a.a(object, n6);
    }

    public int a(Object object) {
        return this.a.c(object);
    }

    public void a(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    public boolean b(Object object) {
        return this.d.d(object);
    }
}

