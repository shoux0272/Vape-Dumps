/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class jJ
extends gJ {
    private final bP a = this.a("<init>", false, Void.TYPE, String.class);
    private final BG d = this.b("text", true, String.class);

    public jJ() {
        super(A5.b3);
    }

    private Object a(String string) {
        return this.a.a(string);
    }

    private void a(Object object, String string) {
        this.d.a(object, string);
    }

    private String a(Object object) {
        return this.d.f(object).toString();
    }

    static Object a(jJ jJ2, String string) {
        return jJ2.a(string);
    }

    static String a(jJ jJ2, Object object) {
        return jJ2.a(object);
    }

    static void a(jJ jJ2, Object object, String string) {
        jJ2.a(object, string);
    }
}

