/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVghzpiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    double p;
    double q;
    double r;
    private iReSqtkUVggvziReSqtkUVg s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private iReSqtkUVgDfKiReSqtkUVg y;
    private iReSqtkUVgilmiReSqtkUVg z;
    private iReSqtkUVgAwKiReSqtkUVg A;
    private iReSqtkUVgAwKiReSqtkUVg B;

    public iReSqtkUVghzpiReSqtkUVg() {
        super("Duel Info", true);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 2.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(2, 2, 2, 2)));
        this.c(130.0);
        double d2 = this.k() - 8.0;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(true);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg2.a(l);
        iReSqtkUVgwgUiReSqtkUVg2.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.d(15.0);
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg2 = new iReSqtkUVgCABiReSqtkUVg("di_target", 0.45f, 0.0f, 0.0f);
        iReSqtkUVgCABiReSqtkUVg2.a_("Current target");
        iReSqtkUVgCABiReSqtkUVg2.f(true);
        iReSqtkUVgCABiReSqtkUVg2.d(15.0);
        iReSqtkUVgCABiReSqtkUVg2.c(15.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2);
        this.z = new iReSqtkUVgilmiReSqtkUVg("Archyb0t", iReSqtkUVgIqLiReSqtkUVg.b, 1.0);
        this.z.d(15.0);
        this.z.c(d2 - iReSqtkUVgCABiReSqtkUVg2.k());
        this.z.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.z);
        this.c(iReSqtkUVgwgUiReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3 = new iReSqtkUVgwgUiReSqtkUVg(true);
        iReSqtkUVgwgUiReSqtkUVg3.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg3.a(l);
        iReSqtkUVgwgUiReSqtkUVg3.c(false);
        iReSqtkUVgwgUiReSqtkUVg3.d(15.0);
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg3 = new iReSqtkUVgCABiReSqtkUVg("di_pot", 0.45f, 0.0f, 0.0f);
        iReSqtkUVgCABiReSqtkUVg3.a_("Difference of potions used");
        iReSqtkUVgCABiReSqtkUVg3.f(true);
        iReSqtkUVgCABiReSqtkUVg3.d(15.0);
        iReSqtkUVgCABiReSqtkUVg3.c(15.0);
        iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg3);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg4 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg4.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2)));
        this.A = new iReSqtkUVgAwKiReSqtkUVg();
        iReSqtkUVgwgUiReSqtkUVg4.a((iReSqtkUVgnCWiReSqtkUVg)this.A);
        this.A.c(d2 - iReSqtkUVgCABiReSqtkUVg3.k() - 4.0);
        this.A.d(15.0);
        this.A.c(false);
        this.A.f(true);
        this.A.a(new iReSqtkUVgHHMiReSqtkUVg(this, iReSqtkUVgwgUiReSqtkUVg3));
        iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg4);
        this.c(iReSqtkUVgwgUiReSqtkUVg3);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg5 = new iReSqtkUVgwgUiReSqtkUVg(true);
        iReSqtkUVgwgUiReSqtkUVg5.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg5.a(l);
        iReSqtkUVgwgUiReSqtkUVg5.c(false);
        iReSqtkUVgwgUiReSqtkUVg5.d(15.0);
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg4 = new iReSqtkUVgCABiReSqtkUVg("di_hit", 0.45f, 0.0f, 0.0f);
        iReSqtkUVgCABiReSqtkUVg4.a_("Difference of hits landed");
        iReSqtkUVgCABiReSqtkUVg4.f(true);
        iReSqtkUVgCABiReSqtkUVg4.d(15.0);
        iReSqtkUVgCABiReSqtkUVg4.c(15.0);
        iReSqtkUVgwgUiReSqtkUVg5.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg4);
        iReSqtkUVgwgUiReSqtkUVg4 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg4.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2)));
        this.B = new iReSqtkUVgAwKiReSqtkUVg();
        iReSqtkUVgwgUiReSqtkUVg4.a((iReSqtkUVgnCWiReSqtkUVg)this.B);
        this.B.c(d2 - iReSqtkUVgCABiReSqtkUVg4.k() - 4.0);
        this.B.d(15.0);
        this.B.c(false);
        this.B.a(new iReSqtkUVgHCRiReSqtkUVg(this, iReSqtkUVgwgUiReSqtkUVg5));
        iReSqtkUVgwgUiReSqtkUVg5.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg4);
        this.c(iReSqtkUVgwgUiReSqtkUVg5);
        this.S();
        this.c(130.0);
        this.d(20.0);
        this.h(false);
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d2 - 8.0);
        }
    }

    private boolean R() {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        if (this.s == null) {
            this.s = iReSqtkUVguqNiReSqtkUVg2;
            return true;
        }
        boolean bl = iReSqtkUVguqNiReSqtkUVg2.c() && !iReSqtkUVguqNiReSqtkUVg2.a().equals(this.s.a());
        this.s = iReSqtkUVguqNiReSqtkUVg2;
        return bl;
    }

    private void S() {
        this.z.a("Searching...");
        this.y = null;
        this.t = 0;
        this.u = 0;
        this.x = 0;
        this.v = 0;
        this.w = 0;
        this.A.b(0, 0);
        this.A.a((Color)null);
        this.B.b(0, 0);
        this.B.a((Color)null);
    }

    private void T() {
        this.A.b(this.t, this.u);
        this.B.b(this.v, this.w);
    }

    private void U() {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return;
        }
        this.z.a("Searching...");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(iReSqtkUVgeLLiReSqtkUVg.g().f());
        ArrayList<iReSqtkUVgDfKiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgDfKiReSqtkUVg>();
        for (Object e : copyOnWriteArrayList) {
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2;
            if (!iReSqtkUVgSzRiReSqtkUVg.d.isInstance(e) || (iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(e)).O() || iReSqtkUVgDfKiReSqtkUVg2.a().equals(iReSqtkUVgeLLiReSqtkUVg.e().a()) || iReSqtkUVgDfKiReSqtkUVg2.K() || iReSqtkUVgDfKiReSqtkUVg2.y() == -420) continue;
            arrayList.add(iReSqtkUVgDfKiReSqtkUVg2);
        }
        if (arrayList.size() > 1) {
            this.z.a("More than one target");
        } else if (arrayList.size() == 1) {
            this.y = (iReSqtkUVgDfKiReSqtkUVg)arrayList.get(0);
            this.z.a(this.y.x());
            this.T();
        }
    }

    public void a(iReSqtkUVgxsliReSqtkUVg iReSqtkUVgxsliReSqtkUVg2) {
        if (this.y == null || this.y.b()) {
            return;
        }
        if (!iReSqtkUVgxsliReSqtkUVg2.d().equals("game.player.hurt")) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.e().a(this.y) > 6.0f) {
            return;
        }
        if (iReSqtkUVgxsliReSqtkUVg2.g().a().equals(iReSqtkUVgeLLiReSqtkUVg.e().a())) {
            ++this.w;
        }
        if (iReSqtkUVgxsliReSqtkUVg2.g().a().equals(this.y.a())) {
            ++this.v;
        }
        this.T();
    }

    public void a(iReSqtkUVgRcsiReSqtkUVg iReSqtkUVgRcsiReSqtkUVg2) {
        if (!iReSqtkUVgRcsiReSqtkUVg2.g().a(iReSqtkUVgSzRiReSqtkUVg.br)) {
            return;
        }
        if (this.y == null || this.y.b()) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return;
        }
        iReSqtkUVgzyZiReSqtkUVg iReSqtkUVgzyZiReSqtkUVg2 = new iReSqtkUVgzyZiReSqtkUVg(iReSqtkUVgRcsiReSqtkUVg2.g());
        if (iReSqtkUVgzyZiReSqtkUVg2.d().b()) {
            return;
        }
        boolean bl = iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgzyZiReSqtkUVg2.d());
        if (!bl) {
            return;
        }
        if (this.x > 0) {
            ++this.t;
            --this.x;
        } else {
            ++this.u;
        }
        this.T();
    }

    public void a(iReSqtkUVgWjqiReSqtkUVg iReSqtkUVgWjqiReSqtkUVg2) {
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2;
        if (this.y == null || this.y.b()) {
            return;
        }
        if (iReSqtkUVgWjqiReSqtkUVg2.d() == 0 && iReSqtkUVgWjqiReSqtkUVg2.e() == 0 && iReSqtkUVgWjqiReSqtkUVg2.f() == 0 && iReSqtkUVgWjqiReSqtkUVg2.i() == -1 && iReSqtkUVgWjqiReSqtkUVg2.m().equals("RIGHT_CLICK_AIR") && (iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().aJ()).c() && iReSqtkUVgSzRiReSqtkUVg.x.isInstance(iReSqtkUVgyetiReSqtkUVg2.e().a()) && iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2)) {
            ++this.x;
        }
    }

    @Override
    public void c_() {
        super.c_();
        try {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (!this.G() || this.h_()) {
                this.S();
                return;
            }
            if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
                return;
            }
            boolean bl = Math.abs(iReSqtkUVgtlXiReSqtkUVg2.z() - this.p) > 120.0 || Math.abs(iReSqtkUVgtlXiReSqtkUVg2.A() - this.q) > 120.0 || Math.abs(iReSqtkUVgtlXiReSqtkUVg2.B() - this.r) > 120.0;
            this.p = iReSqtkUVgtlXiReSqtkUVg2.z();
            this.q = iReSqtkUVgtlXiReSqtkUVg2.A();
            this.r = iReSqtkUVgtlXiReSqtkUVg2.B();
            if (this.R() || bl) {
                this.S();
                return;
            }
            if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
                return;
            }
            if (this.y == null || this.y.b()) {
                this.U();
            } else {
                if (iReSqtkUVgtlXiReSqtkUVg2.K() || this.y.K()) {
                    this.S();
                    return;
                }
                boolean bl2 = false;
                for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().f()) {
                    if (this.y.a().equals(e)) {
                        bl2 = true;
                        break;
                    }
                    iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(e);
                    if (this.y.a().equals(iReSqtkUVgDfKiReSqtkUVg2.a()) || !this.y.x().equalsIgnoreCase(iReSqtkUVgDfKiReSqtkUVg2.x())) continue;
                    this.y = iReSqtkUVgDfKiReSqtkUVg2;
                }
                if (!bl2) {
                    this.y = null;
                    this.U();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* synthetic */ iReSqtkUVgAwKiReSqtkUVg a(iReSqtkUVghzpiReSqtkUVg iReSqtkUVghzpiReSqtkUVg2) {
        return iReSqtkUVghzpiReSqtkUVg2.A;
    }

    static /* synthetic */ iReSqtkUVgAwKiReSqtkUVg b(iReSqtkUVghzpiReSqtkUVg iReSqtkUVghzpiReSqtkUVg2) {
        return iReSqtkUVghzpiReSqtkUVg2.B;
    }
}

