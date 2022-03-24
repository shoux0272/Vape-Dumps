/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AE;
import manthe.BP;
import manthe.Cw;
import manthe.cB;
import manthe.ds;
import manthe.gw;
import manthe.ng;
import manthe.on;
import manthe.pL;
import manthe.qA;
import manthe.rD;

class pm
extends Thread {
    final rD a;

    pm(rD rD2) {
        this.a = rD2;
    }

    @Override
    public void run() {
        String string = rD.c(this.a).z().E();
        rD.d(true);
        AE aE = on.p.e();
        try {
            rD.c(this.a).z().a("Authenticating...");
            qA qA2 = new qA(rD.e(this.a).c(), rD.e(this.a).b());
            BP bP2 = new BP();
            boolean bl = rD.e(this.a).c().toLowerCase().endsWith("@alt.com");
            on.a("" + bl);
            aE.a(bl ? pL.d : pL.b);
            Cw cw = bP2.a("authenticate", qA2, Cw.class);
            if (cw == null) {
                rD.c(this.a).z().a(cB.v + "cServer error");
            } else if (cw.h() != null) {
                String[] arrstring;
                String string2 = cw.h();
                if (string2.contains(".") && (arrstring = string2.split("\\.")).length >= 2) {
                    string2 = arrstring[1];
                }
                rD.c(this.a).z().a(cB.v + "c" + string2);
            } else {
                gw gw2 = gw.a(cw.b().a(), cw.b().b(), cw.d(), cw.b().c() ? "legacy" : "mojang");
                ds.a(gw2);
                rD.c(this.a).z().a(cB.v + "aLogged in to " + gw2.f());
                ng.i.ao().a(true);
                ng.i.u().b();
            }
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

