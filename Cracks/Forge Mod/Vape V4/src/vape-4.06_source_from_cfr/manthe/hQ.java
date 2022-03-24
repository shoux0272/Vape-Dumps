/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class hQ
extends gJ {
    private final bP d = this.a("isCancelable", false, Boolean.TYPE, new Class[0]);
    private final bP a = this.a("setCanceled", false, Void.TYPE, Boolean.TYPE);

    public hQ() {
        super(A5.a4);
    }

    public boolean a(Object object) {
        return this.d.h(object, new Object[0]);
    }

    public void a(Object object, boolean bl) {
        this.a.p(object, bl);
    }
}

