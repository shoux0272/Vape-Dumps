/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class iS
extends gJ {
    private final bP e = this.a("func_148090_a", cy.c, Void.TYPE, Float.TYPE);
    private final bP d = this.a("func_148087_a", cy.c, Void.TYPE, Float.TYPE, Float.TYPE);
    private static cy[] a;

    public iS() {
        super(A5.di);
    }

    public void a(Object object, float f10) {
        this.e.p(object, Float.valueOf(f10));
    }

    public void a(Object object, float f10, float f11) {
        this.d.p(object, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static void b(cy[] arrcy) {
        a = arrcy;
    }

    public static cy[] d() {
        return a;
    }

    static {
        if (iS.d() == null) {
            iS.b(new cy[4]);
        }
    }
}

