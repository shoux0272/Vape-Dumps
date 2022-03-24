/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.dx;
import manthe.ir;

public class eD
extends cy {
    private static dx g;
    private static dx e;
    private static dx f;

    public eD(Object object) {
        super(object);
    }

    public static dx f() {
        if (g == null) {
            g = new dx(ir.a(eD.a.M().an));
        }
        return g;
    }

    public static dx h() {
        if (e == null) {
            e = new dx(ir.b(eD.a.M().an));
        }
        return e;
    }

    public static dx g() {
        if (f == null) {
            f = new dx(ir.c(eD.a.M().an));
        }
        return f;
    }
}

