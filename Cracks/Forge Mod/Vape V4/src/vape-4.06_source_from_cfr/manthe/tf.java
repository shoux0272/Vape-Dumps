/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.cg;
import manthe.lV;
import manthe.on;
import manthe.th;

public class tf
extends th {
    public tf() {
        super(A5.ae);
    }

    @Override
    public void c() {
        bP bP2 = on.p.M().a.i;
        cg cg2 = new cg(bP2, lV.class);
        cg2.b("$0");
        cg2.a("($r) $event.getBlockLayer()");
        this.a(cg2);
    }
}

