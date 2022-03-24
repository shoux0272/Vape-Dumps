/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hG
extends gJ {
    private final BG a = this.b("entityLiving", false, A5.cF);
    private static int[] d;

    public hG() {
        super(A5.cB);
    }

    public Object a(Object object) {
        return this.a.f(object);
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (hG.d() != null) {
            hG.b(new int[5]);
        }
    }
}

