/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.cy;
import manthe.gJ;

public class ix
extends gJ {
    private final BG d = this.b("fuse", true, Integer.TYPE);
    private static cy[] a;

    public ix() {
        super(A5.bl);
    }

    public int a(Object object) {
        return this.d.c(object);
    }

    public static void b(cy[] arrcy) {
        a = arrcy;
    }

    public static cy[] d() {
        return a;
    }

    static {
        if (ix.d() == null) {
            ix.b(new cy[4]);
        }
    }
}

