/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.net.URL;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class gL
extends gJ {
    public final BG f = this.a("BASE_URL", false, String.class);
    public final BG d = this.a("JOIN_URL", false, URL.class);
    public final BG e = this.a("CHECK_URL", false, URL.class);
    public final BG g = this.a("WHITELISTED_DOMAINS", false, String[].class);
    private static int[] a;

    public gL() {
        super(A5.aR);
    }

    public static void b(int[] arrn) {
        a = arrn;
    }

    public static int[] d() {
        return a;
    }

    static {
        if (gL.d() == null) {
            gL.b(new int[3]);
        }
    }
}

