/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.cg;
import manthe.kB;
import manthe.kR;
import manthe.kT;
import manthe.on;
import manthe.th;

public class tb
extends th {
    public tb() {
        super(A5.ba);
    }

    private void j() {
        bP bP2 = on.p.M().M.a;
        String string = V.c() >= 23 ? "$2, $3, $4" : "$1, $2, $3";
        String string2 = V.c() >= 23 ? "$2 = $event.getX();\n $3 = $event.getY();\n $4 = $event.getZ();" : "$1 = $event.getX();\n $2 = $event.getY();\n $3 = $event.getZ();";
        cg cg2 = new cg(bP2, kB.class);
        cg2.b(string);
        cg2.c(string2);
        cg2.a(A5.u);
        this.a(cg2);
        cg2 = new cg(bP2, kR.class);
        cg2.a(false);
        cg2.b(string);
        cg2.a(A5.u);
        this.a(cg2);
    }

    private void i() {
    }

    private void k() {
        bP bP2 = on.p.M().M.ag;
        this.a(bP2, kT.class, "$0, $1");
    }

    @Override
    public void c() {
        this.j();
        this.k();
    }
}

