/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class k3
extends gJ {
    private final BG d;
    private final bP a = V.c() == 13 ? this.a("getEntitiesWithinAABBForEntity", true, Void.TYPE, A5.ba, A5.b4, List.class, A5.ds) : this.a("getEntitiesWithinAABBForEntity", true, Void.TYPE, A5.ba, A5.b4, List.class, A5.cO);

    public k3() {
        super(A5.dF);
        this.d = this.b("isChunkLoaded", true, Boolean.TYPE);
    }

    public void a(Object object, Object object2, Object object3, List list, Object object4) {
        this.a.p(object, object2, object3, list, object4);
    }

    public boolean a(Object object) {
        return this.d.d(object);
    }
}

