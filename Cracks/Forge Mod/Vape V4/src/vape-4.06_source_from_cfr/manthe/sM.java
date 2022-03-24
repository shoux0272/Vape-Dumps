/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.Ak;
import manthe.BR;
import manthe.D3;
import manthe.DN;
import manthe.DZ;
import manthe.my;
import manthe.pd;
import manthe.rQ;
import manthe.rf;
import manthe.rl;
import manthe.t3;

public class sM
extends rf {
    private final Ak I;

    public sM(Ak ak, double d10) {
        super(true);
        this.I = ak;
        this.e(0.5);
        this.a(new Color(40, 40, 40, 100));
        this.a(new D3(0.0, 0.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(d10);
        this.b(75.0);
        rf rf2 = new rf(false);
        rf2.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 1)));
        rf2.b(c);
        rf2.j(false);
        rf2.c(this.q());
        rf2.b(20.0);
        rl rl2 = new rl(ak.r(), my.c, 1.0);
        rl2.c(rf2.q() * 0.75);
        rl2.b(10.0);
        rl2.j(false);
        rf2.b(rl2);
        rl rl3 = new rl(ak.m() + "", my.e, 1.0);
        rl3.b("Total profile usages");
        rl3.c(rf2.q() * 0.25);
        rl3.b(10.0);
        rl3.j(false);
        rl3.a(new t3(this, rl3, ak));
        rf2.b(rl3);
        this.b(rf2);
        rf rf3 = new rf(false);
        rf3.a(new D3(0.0, 0.0, 5000, 3, new pd(0, 0, 0, 0)));
        rf3.b(c);
        rf3.j(false);
        rf3.c(this.q());
        rf3.b(20.0);
        rf rf4 = new rf(false);
        rf4.a(new D3(0.0, 0.0, 5000, 1, new pd(2, 0, 0, 0)));
        rf4.b(c);
        rf4.j(false);
        rf4.c(this.q());
        rf4.b(20.0);
        rf3.b(rf4);
        rQ rQ2 = new rQ("copy", 0.2f, 0.1f, 0.1f, true);
        rQ2.b("Copy profile UUID");
        rQ2.a(c);
        rQ2.c(7.0);
        rQ2.b(7.0);
        rQ2.j(false);
        rQ2.a(new BR(this, ak, rQ2));
        rf4.b(rQ2);
        rl rl4 = new rl(ak.l().toString(), my.c, 0.5);
        rl4.c(rf3.q() * 0.8);
        rl4.b(10.0);
        rl4.j(false);
        rf3.b(rl4);
        rl rl5 = new rl("", my.c, 0.5);
        rl5.c(rf3.q() * 0.1);
        rl5.b(10.0);
        rl5.j(false);
        rf3.b(rl5);
        this.b(rf3);
        rf rf5 = new rf(false);
        rf5.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf5.b(c);
        rf5.j(false);
        rf5.c(this.q());
        rf5.b(20.0);
        rl rl6 = new rl("Updated:", my.c, 0.7);
        rl6.c(rf5.q() * 0.25);
        rl6.b(10.0);
        rl6.j(false);
        rf5.b(rl6);
        rl rl7 = new rl(ak.p().length() > 10 ? ak.p().substring(0, 10) : ak.p(), my.c, 0.7);
        rl7.c(rf5.q() * 0.75);
        rl7.b(10.0);
        rl7.j(false);
        rf5.b(rl7);
        this.b(rf5);
        this.a();
    }

    private void a() {
        rf rf2 = new rf(false);
        rf2.a(new D3(2.0, 0.0, 1, 3, new pd(0, 0, 0, 0)));
        rf2.b(c);
        rf2.c(this.q());
        rf2.b(20.0);
        rf rf3 = new rf(true);
        rf3.a(new D3(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        rf3.b(c);
        rf3.c(this.q() / 2.0 - 4.0);
        rf3.b(17.0);
        rQ rQ2 = new rQ("download", 0.5f, 20.0f, 0.0f);
        rQ2.c(rf3.q());
        rQ2.b(17.0);
        rQ2.e(0.5);
        rQ2.a(new Color(40, 40, 40, 100));
        rQ2.a(new DN(this, rQ2));
        rQ2.a(new DZ(this));
        rf3.b(rQ2);
        rf2.b(rf3);
        this.b(rf2);
    }

    @Override
    public Color f() {
        return c;
    }

    static Ak a(sM sM2) {
        return sM2.I;
    }
}

