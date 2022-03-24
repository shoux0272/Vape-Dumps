/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.A;
import manthe.Aj;
import manthe.Ak;
import manthe.BO;
import manthe.D7;
import manthe.DA;
import manthe.my;
import manthe.of;
import manthe.oh;
import manthe.on;
import manthe.pF;
import manthe.pd;
import manthe.qp;
import manthe.rG;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.yI;

public class so
extends qp {
    private final Ak J;
    private final rg K;
    private final rG G;
    private final rf F;
    private final rf I;
    private boolean H;

    public so(Ak ak) {
        this.J = ak;
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
        this.F = new rf(false);
        this.I = new rf(true);
        this.F.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        D7 d72 = new D7(2.0, 0.0, 1, 3, new pd(1, 1, 0, 0));
        d72.h();
        d72.g();
        this.I.a(d72);
        this.b(this.F);
        this.b(this.I);
        this.I.a(false);
        this.I.b(e);
        this.K = new rg(ak.r(), true);
        this.G = new rG("Settings", 10.0f, 10.0f, 0.8f, false);
        this.F.b(this.K);
        this.F.b(this.G);
        rg rg2 = new rg("Load states", true);
        rg2.b("Enables all modules that were saved, and disables all other modules\n\nYou can make these automatically enable upon loading Vape, or loading this profile, by enabling \"Auto-load module states\" under the client settings");
        rg2.z().e(0.75);
        rg2.c(52.0);
        rg2.b(10.0);
        this.I.b(rg2);
        rg rg3 = new rg("Save states", true);
        rg3.b("Saves the enabled states of currently enabled modules\nClick \"Load states\", or right click the profile, to enable them again\n\nFor example;\nIf you have AimAssist and AutoClicker currently enabled, this will remember that you had those enabled and everything else disabled");
        rg3.z().e(0.75);
        rg3.c(52.0);
        rg3.b(10.0);
        this.I.b(rg3);
        rg rg4 = new rg("X", true);
        rg4.b("Deletes profile");
        rg4.z().e(0.75);
        rg4.c(10.0);
        rg4.b(10.0);
        rg4.a(new Color(245, 0, 0));
        this.I.b(rg4);
        oh oh2 = new oh(this, ak, this.K, ak);
        this.K.a(new pF(this, oh2, ak));
        this.K.z().b(my.c);
        this.G.a(new BO(this));
        rg4.a(new DA(this, ak));
        rg3.a(new of(this, ak, rg3));
        rg2.a(new Aj(this, ak, rg2));
        this.j(false);
    }

    @Override
    public void c() {
        super.c();
        this.K.a(on.p.t().r.K());
        Ak ak = on.p.l().c();
        if (ak == null) {
            return;
        }
        this.K.e(ak.equals(this.J));
        if (this.K.y()) {
            this.K.z().b(yI.a());
        } else {
            this.K.z().b(Color.WHITE);
        }
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        this.K.c(this.q() - this.G.q());
        this.I.c(d10);
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.K.b(this.b());
        this.I.b(12.0);
    }

    public Ak x() {
        return this.J;
    }

    public rg a() {
        return this.K;
    }

    private void a(rl rl2, String string, String string2, long l) {
        new A(this, rl2, string, l, string2).start();
    }

    static rg c(so so2) {
        return so2.K;
    }

    static void a(so so2, rl rl2, String string, String string2, long l) {
        so2.a(rl2, string, string2, l);
    }

    static boolean a(so so2, boolean bl) {
        so2.H = bl;
        return so2.H;
    }

    static boolean b(so so2) {
        return so2.H;
    }

    static rf a(so so2) {
        return so2.I;
    }
}

