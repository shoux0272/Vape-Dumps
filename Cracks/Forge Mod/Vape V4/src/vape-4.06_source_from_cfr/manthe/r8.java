/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.regex.Pattern;
import manthe.D3;
import manthe.D7;
import manthe.d0;
import manthe.ds;
import manthe.my;
import manthe.n8;
import manthe.nt;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.sK;
import manthe.sb;

public class r8
extends r1 {
    private final rf ae = new rf(false);
    private final int ah = 200;
    public sb ag;
    private rg ai;
    private final Pattern af = Pattern.compile("api-\\w{4}-\\w{4}-\\w{4}$");

    public r8() {
        super("TheAltening", false);
        this.aj().e(1.0);
        this.aj().c(new Color(100, 100, 100, 40));
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.c(this.q());
        rf2.b(20.0);
        rf2.a(new D3(2.0, 0.0, 5000, 2, new pd(2, 2, 0, 0)));
        rl rl2 = new rl("Altening", my.c, 1.25);
        rl2.c(66.0);
        rl2.b(20.0);
        rl2.j(false);
        rf2.b(rl2);
        this.aj().b(rf2);
        this.al();
    }

    private void al() {
        this.ae.a(new D7(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        rf rf2 = new rf(false);
        rf2.a(new D7(2.0, 2.0, 3, 1, new pd(0, 0, 0, 0)));
        this.ag = new sK(this, 18);
        this.ag.c(199.0);
        this.ag.b(15.0);
        this.ag.a(this.af);
        this.ag.a("Altening API Key");
        this.ag.e(1.0);
        this.ag.c(new Color(100, 100, 100, 40));
        rf2.b(this.ag);
        rf2.b((p1)on.p.D().e.c());
        this.ai = new rg(on.p.w() == null ? "Login to Altening" : "Generate Alt", true);
        this.ai.b(18.0);
        this.ai.c(199.0);
        this.ai.a(new n8(this));
        rf2.b(this.ai);
        this.ae.b(rf2);
        rg rg2 = new rg("Return to Alt Manager", true);
        rg2.b(18.0);
        rg2.c(199.0);
        rg2.a(new nt(this));
        this.ae.b(rg2);
        this.aj().b(this.ae);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0 d02 = ds.p();
        this.a((double)(d02.g() / 2) - this.q() / 2.0);
        this.d(d02.h() / 2 - 100);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        ds.x().i();
        super.c(false);
    }

    static rg b(r8 r82) {
        return r82.ai;
    }

    static Pattern a(r8 r82) {
        return r82.af;
    }
}

