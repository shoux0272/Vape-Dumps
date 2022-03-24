/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class jP
extends gJ {
    private final bP d;
    private final BG a = this.b("username", true, String.class);

    public jP() {
        super(A5.bu);
        this.d = this.a("<init>", false, Void.TYPE, String.class, String.class, String.class, String.class);
    }

    public String a(Object object) {
        return (String)this.a.f(object);
    }

    private Object a(String string, String string2, String string3, String string4) {
        return this.d.a(new Object[]{string, string2, string3, string4});
    }

    static Object a(jP jP2, String string, String string2, String string3, String string4) {
        return jP2.a(string, string2, string3, string4);
    }
}

