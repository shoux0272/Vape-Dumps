/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.AO;
import manthe.D7;
import manthe.DE;
import manthe.L;
import manthe.dx;
import manthe.mE;
import manthe.my;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qw;
import manthe.r1;
import manthe.r6;
import manthe.rW;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.s7;
import manthe.sW;
import manthe.sb;
import manthe.sl;
import manthe.zE;

public class rC
extends r1 {
    private static final double ag = 20.0;
    private static final double ae = 18.0;
    private final rf ah;
    private final sb ak;
    private final rl aj;
    private final r6 al;
    private final DE af;
    private final AO ai = new AO();

    public rC() {
        super("Search", false);
        this.aj().a(new D7(0.0, 1.0, 5, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.d(rf2);
        this.ah = new rf(false);
        this.af = DE.a((Object)this, "new block color", Color.RED);
        ((sW)this.af.c()).c(95.0);
        this.af.t();
        rf2.b((p1)this.af.c());
        s7 s72 = new s7(on.p.H().b(zE.class));
        s72.b(14.0);
        s72.c(95.0);
        rf2.b(s72);
        rg rg2 = new rg("Add", false);
        rg2.b(12.0);
        rg2.c(20.0);
        rg2.a(new mE(this));
        this.ak = new sl(this, 64, rg2);
        this.ak.z().e(0.8);
        this.ak.b(12.0);
        this.ak.c(73.0);
        this.ak.a("<block name>");
        this.ah.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 0, 0)));
        this.ah.b(this.ak);
        this.ah.b(rg2);
        rf2.b(this.ah);
        this.aj = new rl("", my.i, 0.8);
        this.aj.b(10.0);
        this.aj.c(95.0);
        this.aj.a(false);
        rf2.b(this.aj);
        this.al = new r6(false);
        this.al.b(130.0);
        rf2.b(this.al);
        this.c(100.0);
        this.b(20.0);
    }

    private void a(String string) {
        String string2 = string.replace(" ", "_");
        if (string2.contains(":")) {
            string2 = string2.split(":")[0];
        }
        dx dx2 = dx.a(string2);
        this.ai.d();
        if (dx2 == null) {
            this.aj.a("Could not find block");
            return;
        }
        L l = this.af.K();
        this.af.t();
        this.ak.C().a("");
        this.aj.a("Added " + string);
        this.a(string, l);
    }

    @Override
    public void c() {
        super.c();
        if (this.aj.e() && this.ai.a(2000L)) {
            this.aj.a("");
            this.ai.d();
        }
        this.aj.a(!this.aj.E().isEmpty());
    }

    @Override
    public void c(double d10) {
        super.c(d10);
    }

    private void a(String string, Color color) {
        qw qw2 = new qw(string, color.getRGB());
        this.a(qw2);
        on.p.d().a(qw2);
    }

    public void a(qw qw2) {
        rf rf2 = new rf(false);
        rf2.c(76.0);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        rW rW2 = new rW(rf2, qw2);
        qw2.a(rW2);
        this.al.d(rf2);
    }

    public void a(rW rW2) {
        rf rf2 = this.al.A();
        rf2.a((p1)rW2.V());
    }

    static sb a(rC rC2) {
        return rC2.ak;
    }

    static void a(rC rC2, String string) {
        rC2.a(string);
    }
}

