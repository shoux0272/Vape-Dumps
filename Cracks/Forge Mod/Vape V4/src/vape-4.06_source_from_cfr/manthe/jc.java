/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jc
extends gJ {
    private bP a;
    private bP d;

    public jc() {
        super(A5.k);
        if (V.c() >= 23) {
            this.d = this.a("getCachedEntity", true, A5.ba, new Class[0]);
        } else {
            this.a = this.a("getEntityNameToSpawn", true, String.class, new Class[0]);
        }
    }

    private String b(Object object) {
        return (String)this.a.e(object, new Object[0]);
    }

    private Object a(Object object) {
        return this.d.e(object, new Object[0]);
    }

    static Object b(jc jc2, Object object) {
        return jc2.a(object);
    }

    static String a(jc jc2, Object object) {
        return jc2.b(object);
    }
}

