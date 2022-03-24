/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class is
extends gJ {
    private final BG e = this.b("inventorySlots", true, List.class);
    private final BG a = this.b("windowId", true, Integer.TYPE);
    private final bP d = this.a("getSlot", true, A5.aF, Integer.TYPE);

    public is() {
        super(A5.aS);
    }

    public List a(Object object) {
        return (List)this.e.f(object);
    }

    public int b(Object object) {
        return this.a.c(object);
    }

    private Object a(Object object, int n6) {
        return this.d.e(object, n6);
    }

    static Object a(is is2, Object object, int n6) {
        return is2.a(object, n6);
    }
}

