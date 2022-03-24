/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class jq
extends gJ {
    private final bP a = this.a("isSameTeam", true, Boolean.TYPE, A5.dJ);
    private static String[] d;

    public jq() {
        super(A5.dJ);
    }

    private boolean a(Object object, Object object2) {
        return this.a.h(object, object2);
    }

    static boolean a(jq jq2, Object object, Object object2) {
        return jq2.a(object, object2);
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    public static String[] d() {
        return d;
    }

    static {
        if (jq.d() == null) {
            jq.b(new String[5]);
        }
    }
}

