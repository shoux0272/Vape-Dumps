/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cB;
import manthe.ds;
import manthe.gw;
import manthe.rD;

class qv
extends Thread {
    final rD a;

    qv(rD rD2) {
        this.a = rD2;
    }

    @Override
    public void run() {
        String string = rD.c(this.a).z().E();
        rD.d(true);
        try {
            rD.c(this.a).z().a("Authenticating...");
            gw gw2 = gw.a(rD.e(this.a).c(), "", "", "mojang");
            ds.a(gw2);
            rD.c(this.a).z().a(cB.v + "aLogged in to " + gw2.f() + " (Offline)");
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            Thread.sleep(2000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        rD.d(false);
        rD.c(this.a).z().a(string);
    }
}

