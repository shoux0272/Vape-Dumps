/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.D7;
import manthe.p1;
import manthe.pd;
import manthe.q3;
import manthe.q5;
import manthe.r1;
import manthe.r6;
import manthe.rQ;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.rp;
import manthe.sb;
import manthe.so;
import manthe.sw;
import manthe.u4;

public class rd
extends r1 {
    private static final double ah = 20.0;
    private static final double ag = 14.0;
    private static final double af = 12.0;
    public final r6 ae;
    private final sb ai;

    public rd() {
        super("Profiles", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf2.c(120.0);
        this.d(rf2);
        rp rp2 = new rp(this, false);
        rg rg2 = new rg("Add", false);
        rg2.b(12.0);
        rg2.c(20.0);
        rg2.a(new u4(this));
        this.ai = new sw(this, 16, rg2);
        this.ai.b(12.0);
        this.ai.a("<name>");
        rQ rQ2 = new rQ("world", 0.3f, 1.0f, 1.0f);
        rQ2.b("Open public profiles");
        rQ2.b(12.0);
        rQ2.c(12.0);
        rQ2.a(new q5(this));
        rp2.a(new D7(1.0, 0.0, 1, 3, new pd(0, 0, 0, 0)));
        rp2.b(rQ2);
        rp2.b(this.ai);
        rp2.b(rg2);
        rf2.b(rp2);
        this.ae = new r6(false);
        this.ae.b(150.0);
        rf2.b(this.ae);
        this.c(120.0);
        this.b(20.0);
        this.X().b("A profile is a configuration which allows you to have multiple sets of different settings\n\nAdding a profile will make a copy of your current settings and save them into a new profile");
    }

    @Override
    public void c(double d10) {
        super.c(d10 + 7.0);
        double d11 = (d10 -= 12.0) - 0.0;
        double d12 = d10 - 0.0;
        this.ae.c(d11);
        this.ai.c(d11 - 20.0);
        for (p1 p12 : this.ae.A().v()) {
            rf rf2 = (rf)p12;
            p1 p13 = rf2.v().get(0);
            p1 p14 = rf2.v().get(1);
            p13.c(d12 - 14.0 - 5.0 - 20.0);
            p14.c(-6.0);
        }
    }

    public void a(Ak ak) {
        so so2 = new so(ak);
        so2.b(10.0);
        so2.c(120.0);
        this.ae.d(so2);
        this.ae.c();
    }

    private void a(rl rl2, String string, String string2, long l) {
        new q3(this, rl2, string, l, string2).start();
    }

    public void b(Ak ak) {
        so so2 = null;
        rf rf2 = this.ae.A();
        for (p1 p12 : rf2.v()) {
            so so3;
            if (!(p12 instanceof so) || !(so3 = (so)p12).x().equals(ak)) continue;
            so2 = so3;
            break;
        }
        if (so2 != null) {
            rf2.a((p1)so2);
            rf2.c();
        }
    }

    static sb a(rd rd2) {
        return rd2.ai;
    }
}

