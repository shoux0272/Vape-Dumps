/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.cg;
import manthe.kF;
import manthe.ky;
import manthe.on;
import manthe.th;

public class t9
extends th {
    public t9() {
        super(A5.aU);
    }

    private void i() {
        cg cg2;
        bP bP2 = on.p.M().ao.e;
        bP bP3 = on.p.M().ao.l;
        if (!bP2.a()) {
            cg2 = new cg(bP2, kF.class);
            cg2.b("$0, $2");
            cg2.c("$2 = (" + A5.aH.getName() + ") $event.getPacketInstance();");
            this.a(cg2);
        }
        cg2 = new cg(bP3, ky.class);
        cg2.b("$0, $1");
        cg2.c("$1 = (" + A5.aH.getName() + ") $event.getPacketInstance();");
        this.a(cg2);
    }

    @Override
    public void c() {
        this.i();
    }
}

