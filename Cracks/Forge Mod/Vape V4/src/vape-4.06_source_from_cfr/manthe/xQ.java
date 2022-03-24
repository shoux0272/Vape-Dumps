/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.uG;
import manthe.wV;
import manthe.we;
import manthe.x3;

public class xQ
extends x3 {
    private wV I = new wV("newsettings");
    private boolean H;

    public xQ(we we2, String string, String string2, double d10) {
        super(we2, string, string2, d10);
        this.I.c(new uG(this));
        this.a(this.I);
    }

    public xQ(we we2, String string, String string2) {
        this(we2, string, string2, 1.0);
    }

    @Override
    public void a() {
        super.a();
        this.I.d(this.H ? xQ.b.a : null);
        double d10 = this.d() + this.e() - 12.5;
        this.getClass();
        this.I.c(d10 - (double)(8.0f * 2.0f));
        this.I.a(this.c());
        this.I.d(this.f());
    }

    public boolean J() {
        return this.H;
    }

    public void f(boolean bl) {
        this.H = bl;
    }

    public void K() {
    }

    static boolean a(xQ xQ2, boolean bl) {
        xQ2.H = bl;
        return xQ2.H;
    }

    static boolean a(xQ xQ2) {
        return xQ2.H;
    }
}

