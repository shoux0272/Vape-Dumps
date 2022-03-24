/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.P;
import manthe.kl;
import manthe.on;
import manthe.y5;
import manthe.zu;

public class ve
implements P {
    private final zu c = on.p.H().b(zu.class);
    private static String[] b;

    @Override
    public void a(kl kl2) {
        this.c.W();
        for (y5 y52 : on.p.H().f()) {
            y52.t();
        }
        on.p.r().c();
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (ve.b() != null) {
            ve.b(new String[4]);
        }
    }
}

