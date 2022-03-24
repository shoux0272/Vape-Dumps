/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class kM
extends gJ {
    private final bP d = this.a("getName", true, String.class, new Class[0]);
    private final bP e = this.a("hasCustomName", true, Boolean.TYPE, new Class[0]);
    private final bP a = this.a("getDisplayName", true, A5.bG, new Class[0]);

    public kM() {
        super(A5.dD);
    }

    public String c(Object object) {
        return this.d.e(object, new Object[0]).toString();
    }

    public boolean a(Object object) {
        return this.e.h(object, new Object[0]);
    }

    public Object b(Object object) {
        return this.a.e(object, new Object[0]);
    }
}

