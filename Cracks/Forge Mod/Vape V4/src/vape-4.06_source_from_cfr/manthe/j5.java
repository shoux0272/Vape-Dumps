/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class j5
extends gJ {
    public bP a = this.a("endStartSection", true, Void.TYPE, String.class);
    private static int[] d;

    public j5() {
        super(A5.X);
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (j5.d() != null) {
            j5.b(new int[1]);
        }
    }
}

