/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;

public class lU
extends kl {
    static float e = 0.0f;
    private static String d;

    @Override
    public boolean fire() {
        if ((e += 1.0f) >= 100.0f) {
            e = 0.0f;
        }
        if (e > 0.0f) {
            this.a(true);
        }
        return this.d();
    }

    static {
        lU.b("B8Tlub");
    }

    public static void b(String string) {
        d = string;
    }

    public static String e() {
        return d;
    }
}

