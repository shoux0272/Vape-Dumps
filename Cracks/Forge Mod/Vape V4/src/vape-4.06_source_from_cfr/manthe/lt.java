/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;

public class lt
extends kl {
    static int d = 0;
    private static int[] e;

    @Override
    public boolean fire() {
        if (d > 0) {
            this.a(true);
        }
        if (++d > 100) {
            d = 0;
        }
        return this.d();
    }

    static {
        lt.b(null);
    }

    public static void b(int[] arrn) {
        e = arrn;
    }

    public static int[] e() {
        return e;
    }
}

