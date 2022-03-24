/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hv
extends gJ {
    private BG a = this.b("capability", true, Integer.TYPE);
    private BG d = this.b("currentState", true, Boolean.TYPE);

    public hv() {
        super(A5.df);
    }

    public int b(Object object) {
        return this.a.c(object);
    }

    public boolean a(Object object) {
        return this.d.d(object);
    }

    public void a(Object object, boolean bl) {
        this.d.a(object, bl);
    }
}

