/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.UUID;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class i5
extends gJ {
    private final bP a = this.a("getID", true, UUID.class, new Class[0]);
    private final bP d = this.a("getAmount", true, Double.TYPE, new Class[0]);

    public i5() {
        super(A5.ar);
    }

    private UUID b(Object object) {
        return (UUID)this.a.e(object, new Object[0]);
    }

    public double a(Object object) {
        return this.d.m(object, new Object[0]);
    }

    static UUID a(i5 i52, Object object) {
        return i52.b(object);
    }
}

