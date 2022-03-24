/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.nv;
import manthe.w9;
import manthe.wF;
import manthe.x4;

public class xw
extends x4 {
    private boolean N = false;
    private String M;
    private w9 O;

    public xw(wF wF2) {
        super("");
        this.I.b("newnext");
        this.a(new nv(this, wF2));
    }

    @Override
    public void a() {
        if (this.O != null) {
            if (!this.O.b()) {
                this.O = null;
                this.F().M();
            } else {
                this.I.a(false);
                this.O.c(this.d());
                this.O.a(this.c());
                return;
            }
        }
        this.I.a(true);
        if (this.N) {
            this.c("");
            this.b(xw.b.m);
            this.b("Press a key to bind");
            this.I.b("newbind");
            this.f(false);
        } else {
            this.b(xw.b.u);
            this.b("Type name");
            this.I.b("newnext");
            this.f(true);
        }
        super.a();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.O != null ? this.O.f() : 20.0;
    }

    @Override
    public void Q() {
        if (!this.N) {
            if (!this.L()) {
                this.c("");
                return;
            }
            this.M = this.N();
        }
        this.N = !this.N;
        this.G = this.N ? xw.b.t : null;
    }

    static boolean a(xw xw2) {
        return xw2.N;
    }

    static String c(xw xw2) {
        return xw2.M;
    }

    static w9 a(xw xw2, w9 w92) {
        xw2.O = w92;
        return xw2.O;
    }

    static w9 b(xw xw2) {
        return xw2.O;
    }
}

