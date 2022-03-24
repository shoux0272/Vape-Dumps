/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D7;
import manthe.DB;
import manthe.DY;
import manthe.aj;
import manthe.p1;
import manthe.pd;
import manthe.qp;
import manthe.rf;

public class rT
extends rf {
    public rT(DY dY2) {
        super(true);
        DB[] arrdB;
        aj aj2 = dY2.r();
        this.j(false);
        this.b(qp.c);
        this.a(new D7(0.0, 1.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(120.0);
        this.a(true);
        for (DB dB2 : arrdB = new DB[]{aj2.e(), aj2.i(), aj2.b(), aj2.h(), aj2.g(), aj2.d(), aj2.a()}) {
            this.b((p1)dB2.c());
        }
        this.a(this.m(), null);
    }
}

