/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class iN
extends gJ {
    private final BG d = this.b("damageModifier", true, Integer.TYPE);
    private final BG a = this.b("source", true, A5.bQ);
    private static String e;

    public iN() {
        super(A5.aQ);
    }

    public Object b(Object object) {
        return this.a.f(object);
    }

    public void a(Object object, Object object2) {
        this.a.a(object, object2);
    }

    public int a(Object object) {
        return this.d.c(object);
    }

    public void a(Object object, int n6) {
        this.d.a(object, n6);
    }

    public static void b(String string) {
        e = string;
    }

    public static String d() {
        return e;
    }

    static {
        if (iN.d() == null) {
            iN.b("EaoLac");
        }
    }
}

