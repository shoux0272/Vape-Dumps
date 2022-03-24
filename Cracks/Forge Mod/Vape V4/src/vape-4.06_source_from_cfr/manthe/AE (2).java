/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bA;
import manthe.cy;
import manthe.pL;

public class AE {
    private final bA c = new bA();
    private pL d = pL.b;
    private static cy[] b;

    public void a(pL pL2) {
        if (this.d == pL2) {
            return;
        }
        this.d = pL2;
        if (this.d == pL.d) {
            this.c.d();
        } else {
            this.c.c();
        }
    }

    public pL d() {
        if (this.d == null) {
            this.d = pL.b;
        }
        return this.d;
    }

    public void c() {
        this.c.c();
        this.d = pL.b;
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] b() {
        return b;
    }

    static {
        if (AE.b() == null) {
            AE.b(new cy[5]);
        }
    }
}

