/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.cg;
import manthe.l4;
import manthe.lW;
import manthe.lo;
import manthe.on;
import manthe.th;

public class tH
extends th {
    public tH() {
        super(A5.F);
    }

    @Override
    public void c() {
        bP bP2 = on.p.M().a.q;
        cg cg2 = new cg(bP2, l4.class);
        cg2.b("$0");
        cg2.a("true");
        this.a(cg2);
        bP bP3 = on.p.M().a.i;
        cg cg3 = new cg(bP3, lo.class);
        cg3.b("$0");
        cg3.a("($r) $event.getBlockLayer()");
        this.a(cg3);
        bP bP4 = on.p.M().a.j;
        cg cg4 = new cg(bP4, lW.class);
        cg4.a(true);
        cg4.a("($r) 1");
        this.a(cg4);
    }
}

