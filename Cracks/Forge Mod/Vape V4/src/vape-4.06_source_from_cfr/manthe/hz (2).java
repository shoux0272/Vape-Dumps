/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hz
extends gJ {
    private final BG a = this.b("itemStack", false, A5.bT);
    private final BG d = this.b("toolTip", false, List.class);

    public hz() {
        super(A5.da);
    }

    public Object b(Object object) {
        return this.a.f(object);
    }

    public Object a(Object object) {
        return this.d.f(object);
    }
}

