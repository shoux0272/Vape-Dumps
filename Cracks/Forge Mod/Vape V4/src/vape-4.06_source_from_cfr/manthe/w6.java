/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.d0;
import manthe.ds;
import manthe.on;
import manthe.wM;
import manthe.wy;
import manthe.wz;
import manthe.xb;
import manthe.y5;
import manthe.zu;

public class w6
extends wy {
    public w6() {
        super(CQ.b);
        this.a(w6.b.u);
        this.W().e(false);
        this.W().b("wrap");
        this.P = false;
        this.a(new xb(this));
    }

    @Override
    public void V() {
        if (this.c() != 7.0) {
            this.aq();
        }
    }

    @Override
    public void K() {
    }

    @Override
    public void S() {
    }

    public void b(String string) {
        this.J();
        if (string == null || string.length() < 1) {
            return;
        }
        for (y5 y52 : on.p.H().e()) {
            if (y52.Q().equals(CQ.b) || !y52.H().toLowerCase().contains(string.toLowerCase())) continue;
            wz wz2 = new wz(this, y52);
            this.a((wM)wz2, new Object[0]);
            wz2.R();
        }
    }

    public void aq() {
        d0 d02 = ds.p();
        this.a((double)d02.g() / 2.0 - this.e() / 2.0, 7.0);
    }

    @Override
    public void n() {
    }

    @Override
    public String ad() {
        return "ModuleSearch";
    }

    @Override
    public boolean b() {
        return zu.T.R.v().equals(zu.T.O);
    }
}

