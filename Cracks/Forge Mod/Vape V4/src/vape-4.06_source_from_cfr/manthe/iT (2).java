/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iT
extends gJ {
    private final bP d = V.c() >= 23 ? this.b(A5.x, "getEffectsFromStack", true, List.class, A5.bT) : this.a("getEffects", true, List.class, A5.bT);
    private final bP a = this.a("getItemStackDisplayName", true, String.class, A5.bT);

    public iT() {
        super(A5.dx);
    }

    private List b(Object object, Object object2) {
        return (List)this.d.e(object, object2);
    }

    private String a(Object object, Object object2) {
        return (String)this.a.e(object, object2);
    }

    static List b(iT iT2, Object object, Object object2) {
        return iT2.b(object, object2);
    }

    static String a(iT iT2, Object object, Object object2) {
        return iT2.a(object, object2);
    }
}

