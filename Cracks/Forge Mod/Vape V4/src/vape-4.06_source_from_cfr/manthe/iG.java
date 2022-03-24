/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.gJ;

public class iG
extends gJ {
    private static String a;

    public iG() {
        super(A5.cw);
    }

    public static void b(String string) {
        a = string;
    }

    public static String d() {
        return a;
    }

    static {
        if (iG.d() != null) {
            iG.b("Bij6uc");
        }
    }
}

