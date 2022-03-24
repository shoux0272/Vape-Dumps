/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.cM;
import manthe.kO;
import manthe.lB;
import manthe.lc;
import manthe.lq;
import manthe.lu;
import manthe.on;
import manthe.u2;
import manthe.y;
import manthe.y9;

public class ur
extends u2 {
    private static String[] g;

    public ur() {
        super(A5.d0);
    }

    @Override
    public void c() {
        bP bP2 = on.p.M().bW.k;
        this.a(bP2, lc.class, new y[0]);
        this.b(bP2, lq.class, new y[0]);
        this.a(on.p.M().bW.i, lu.class, new y[0]);
        this.a(on.p.M().bW.h, kO.class, new y9(1, cM.a(A5.aE)).b(Object.class));
        this.a(on.p.M().bW.P, lB.class, new y[0]);
    }

    public static void b(String[] arrstring) {
        g = arrstring;
    }

    public static String[] i() {
        return g;
    }

    static {
        if (ur.i() == null) {
            ur.b(new String[4]);
        }
    }
}

