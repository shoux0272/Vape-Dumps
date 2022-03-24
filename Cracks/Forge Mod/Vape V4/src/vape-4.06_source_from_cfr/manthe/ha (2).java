/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.cy;
import manthe.gJ;

public class ha
extends gJ {
    private static cy[] a;

    public ha() {
        super(A5.c7);
    }

    public static void b(cy[] arrcy) {
        a = arrcy;
    }

    public static cy[] d() {
        return a;
    }

    static {
        if (ha.d() == null) {
            ha.b(new cy[1]);
        }
    }
}

