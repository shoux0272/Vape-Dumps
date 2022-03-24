/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.ex;
import manthe.gJ;

public class hE
extends gJ {
    private final BG e = this.b("entityList", true, Set.class);
    private final bP a = this.a("getEntityByID", true, A5.ba, Integer.TYPE);
    private final bP d = this.a("addEntityToWorld", true, Void.TYPE, Integer.TYPE, A5.ba);

    public hE() {
        super(A5.b6);
    }

    public Set a(Object object) {
        return (Set)this.e.f(object);
    }

    public Object a(Object object, int n6) {
        return this.a.e(object, n6);
    }

    public void a(Object object, int n6, ex ex2) {
        this.d.p(object, n6, ex2.a());
    }
}

