/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Map;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class jg
extends gJ {
    private final BG e = this.b("tagMap", true, Map.class);
    private final bP a = this.a("getShort", true, Short.TYPE, String.class);
    private final bP d = this.a("getTag", true, A5.cr, String.class);

    public jg() {
        super(A5.au);
    }

    private Object a(Object object, String string) {
        return this.d.e(object, string);
    }

    private Map a(Object object) {
        return (Map)this.e.f(object);
    }

    private short b(Object object, String string) {
        return this.a.b(object, string);
    }

    static short a(jg jg2, Object object, String string) {
        return jg2.b(object, string);
    }

    static Map a(jg jg2, Object object) {
        return jg2.a(object);
    }

    static Object b(jg jg2, Object object, String string) {
        return jg2.a(object, string);
    }
}

