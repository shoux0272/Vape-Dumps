/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.d;
import manthe.CQ;
import manthe.cy;
import manthe.ds;
import manthe.kf;
import manthe.nx;
import manthe.on;
import manthe.y5;
import manthe.zu;

public class zx
extends y5 {
    private static cy[] u;

    public zx() {
        super("SelfDestruct", 1, CQ.b, "You can press LEFT CONTROL + HOME on your keyboard to self destruct at any time, including while in a portal, GUI, or menu");
    }

    @Override
    public void a(kf kf2) {
    }

    @Override
    public void s() {
        on.p.s = true;
        if (!ds.k().e()) {
            ds.a(null);
            ds.z();
            d.onGuiClosed(d.getGuiObject());
            nx.c().a();
        }
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N() || y52.getClass().equals(zu.class)) continue;
            y52.d(false);
        }
        try {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        on.p.b(false);
    }

    public static void a(cy[] arrcy) {
        u = arrcy;
    }

    public static cy[] S() {
        return u;
    }

    static {
        if (zx.S() == null) {
            zx.a(new cy[5]);
        }
    }
}

