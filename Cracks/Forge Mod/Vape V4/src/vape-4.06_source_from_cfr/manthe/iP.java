/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.cy;
import manthe.gJ;

public class iP
extends gJ {
    private final BG d = this.a("GOLD", cy.c, A5.az);
    private static int[] a;

    public iP() {
        super(A5.az);
    }

    private Object d() {
        return this.d.f(null);
    }

    static Object a(iP iP2) {
        return iP2.d();
    }

    public static void b(int[] arrn) {
        a = arrn;
    }

    public static int[] e() {
        return a;
    }

    static {
        if (iP.e() != null) {
            iP.b(new int[5]);
        }
    }
}

