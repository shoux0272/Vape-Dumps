/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class jE
extends gJ {
    private final bP a = this.a("getFormattedText", true, String.class, new Class[0]);
    private final bP d = this.a("getUnformattedText", true, String.class, new Class[0]);

    public jE() {
        super(A5.bG);
    }

    private String b(Object object) {
        return (String)this.a.e(object, new Object[0]);
    }

    private String a(Object object) {
        return (String)this.d.e(object, new Object[0]);
    }

    static String b(jE jE2, Object object) {
        return jE2.b(object);
    }

    static String a(jE jE2, Object object) {
        return jE2.a(object);
    }
}

