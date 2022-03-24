/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class jY
extends gJ {
    private final bP d = this.a("getKeys", true, Set.class, new Class[0]);
    private final bP a = this.a("getObject", true, Object.class, Object.class);

    public jY() {
        super(A5.z);
    }

    public Set a(Object object) {
        return (Set)this.d.e(object, new Object[0]);
    }

    private Object a(Object object, Object object2) {
        return this.a.e(object, object2);
    }

    static Object a(jY jY2, Object object, Object object2) {
        return jY2.a(object, object2);
    }
}

