/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class jx
extends gJ {
    private final BG f = this.b("lidAngle", true, Float.TYPE);
    private final BG e = this.b("numPlayersUsing", true, Integer.TYPE);
    private final BG d = V.c() >= 23 ? this.b("cachedChestType", true, A5.ak) : this.b("cachedChestType", true, Integer.TYPE);
    private static String a;

    public jx() {
        super(A5.N);
    }

    public float a(Object object) {
        return this.f.b(object);
    }

    public int c(Object object) {
        return this.e.c(object);
    }

    public int b(Object object) {
        return this.d.c(object);
    }

    public Object d(Object object) {
        return this.d.f(object);
    }

    public static void b(String string) {
        a = string;
    }

    public static String d() {
        return a;
    }

    static {
        if (jx.d() == null) {
            jx.b("zbWKfb");
        }
    }
}

