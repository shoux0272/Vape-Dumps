/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.w3;
import manthe.ws;
import manthe.x4;

public class xG
extends x4 {
    private int M;
    private boolean O;
    private ws N;

    public xG(ws ws2, String string, boolean bl) {
        super(string);
        this.N = ws2;
        this.O = bl;
        this.G = ((w3)ws2.m()).S() ? xG.b.j : xG.b.i;
    }

    public xG(ws ws2, String string) {
        this(ws2, string, false);
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        String string = this.N();
        ((w3)this.N.m()).Q().a(string, -1);
        ((w3)this.N.m()).Q().d();
        this.N.ak();
        this.c("");
    }

    @Override
    public double l() {
        return this.e() - 35.0;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public int S() {
        return this.M;
    }

    public boolean R() {
        return this.O;
    }
}

