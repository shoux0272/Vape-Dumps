/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.eJ;
import manthe.kt;
import manthe.vE;
import manthe.y5;

public class A3
extends y5 {
    private static boolean u;
    private final DB w = DB.a(this, "Use buckets", true);
    private final DB y = DB.a(this, "Use cobwebs", true);
    private boolean v;
    private boolean x;

    public A3() {
        super("MLG", -16764673, CQ.e, "Automatically places water under you when you fall");
        this.a(this.w, this.y);
    }

    @Override
    public void s() {
    }

    @Override
    public void b(kt kt2) {
        if (ds.x().d()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.a8().h()) {
            this.v = false;
            return;
        }
        if (this.v && !eJ2.v()) {
            this.x = true;
        }
        if (this.x && eJ2.t() >= 3.0f && !u) {
            u = true;
            this.x = false;
            new Thread(new vE(this, null)).start();
        }
        if (eJ2.v()) {
            this.x = false;
        }
        this.v = eJ2.v();
    }

    static DB a(A3 a3) {
        return a3.w;
    }

    static DB b(A3 a3) {
        return a3.y;
    }

    static boolean e(boolean bl) {
        u = bl;
        return u;
    }
}

