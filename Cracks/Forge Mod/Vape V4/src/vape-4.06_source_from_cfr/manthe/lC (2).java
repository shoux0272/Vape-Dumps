/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;

public class lC
extends kl {
    protected Object e;
    private static String[] d;

    public lC(Object object, int n6) {
        this.a = n6;
        this.e = object;
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    public static String[] e() {
        return d;
    }

    static {
        if (lC.e() != null) {
            lC.b(new String[3]);
        }
    }
}

