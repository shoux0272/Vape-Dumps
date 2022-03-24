/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class iReSqtkUVgpqqiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg,
iReSqtkUVgqhUiReSqtkUVg {
    public static final double h = 12.0;
    public static final int p = 5;
    private final iReSqtkUVgwgUiReSqtkUVg q;
    private final iReSqtkUVgwgUiReSqtkUVg r = new iReSqtkUVgwgUiReSqtkUVg(false);
    private final iReSqtkUVgIDdiReSqtkUVg s;
    private final iReSqtkUVgFWjiReSqtkUVg t;
    private final iReSqtkUVggVdiReSqtkUVg u = new iReSqtkUVggVdiReSqtkUVg();
    private boolean v;
    private iReSqtkUVgypOiReSqtkUVg w;
    private double x;
    private boolean y;
    private iReSqtkUVgwgUiReSqtkUVg z = new iReSqtkUVgwgUiReSqtkUVg(false);

    public iReSqtkUVgpqqiReSqtkUVg(String string, List<iReSqtkUVgnCWiReSqtkUVg> list) {
        this.b(o);
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 2, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.w = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        this.s = new iReSqtkUVgIDdiReSqtkUVg(string, false);
        this.s.a(new iReSqtkUVgTtBiReSqtkUVg(this));
        this.t = new iReSqtkUVgFWjiReSqtkUVg("+", false);
        this.t.a(new iReSqtkUVgXCLiReSqtkUVg(this));
        this.a(new iReSqtkUVgysiiReSqtkUVg(this));
        this.u.a_(true);
        this.u.b(true);
        this.u.c(10.0);
        this.u.d(10.0);
        this.q = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.q.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 3, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.z.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(3, 1, 0, 1)));
        this.z.a((iReSqtkUVgnCWiReSqtkUVg)this.u);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.z);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.t);
        this.r.a_(false);
        this.r.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 2.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(2, 5, 2, 5)));
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.q);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.a(new iReSqtkUVgSIDiReSqtkUVg(this));
        if (list != null) {
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : list) {
                this.c(iReSqtkUVgnCWiReSqtkUVg2);
            }
        }
        this.c(true);
        this.c(this.s.D().E() + 20.0);
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        this.D();
        this.x = d2;
    }

    private void D() {
        this.t.c(this.x * 0.15);
        this.r.c(this.k() - 10.0);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.r.o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(this.k() - 10.0);
        }
        double d2 = this.x;
        d2 -= this.t.k();
        if (!this.y && this.F().o().size() > 0) {
            d2 -= this.t.k();
        }
        if (this.K()) {
            if (this.w.G()) {
                this.z.a_(true);
                this.s.c(d2 - this.u.k());
                this.q.a_(true);
            } else {
                this.z.a_(false);
                this.s.c(d2);
            }
        } else {
            this.s.c(d2);
            this.z.a_(false);
        }
        try {
            this.E();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void E() {
        if (!this.b()) {
            this.s.D().a(this.s.D().m());
        } else {
            this.s.D().a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k());
        }
    }

    private void i(boolean bl) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.r.o()) {
            for (iReSqtkUVgBuwiReSqtkUVg iReSqtkUVgBuwiReSqtkUVg2 : iReSqtkUVgnCWiReSqtkUVg2.g()) {
                iReSqtkUVgBuwiReSqtkUVg2.a(bl);
            }
        }
    }

    @Override
    public void a(Color color) {
        super.a(color);
        this.G().a(color);
    }

    @Override
    public void a(boolean bl) {
        if (this.h()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.r.h()) {
                iReSqtkUVguKSiReSqtkUVg.a(k, this.r.c(), this.e_() + this.l(), this.r.c() + this.r.k(), this.e_() + this.l(), this.r.c() + this.r.k(), this.e_() + this.G().l(), this.r.c(), this.e_() + this.G().l());
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        super.a(bl);
    }

    @Override
    public boolean h_() {
        return !this.r.h();
    }

    @Override
    public void c_(boolean bl) {
        this.r.a_(!bl);
    }

    @Override
    public boolean t() {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.r.o()) {
            if (!iReSqtkUVgnCWiReSqtkUVg2.t()) continue;
            return false;
        }
        return super.t();
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.s.d(d2);
        this.t.d(d2);
    }

    public void c(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        if (this.r.o().contains(iReSqtkUVgnCWiReSqtkUVg2)) {
            return;
        }
        this.r.a(iReSqtkUVgnCWiReSqtkUVg2);
    }

    public iReSqtkUVgwgUiReSqtkUVg F() {
        return this.r;
    }

    public iReSqtkUVgIDdiReSqtkUVg G() {
        return this.s;
    }

    public iReSqtkUVgFWjiReSqtkUVg H() {
        return this.t;
    }

    public iReSqtkUVgwgUiReSqtkUVg I() {
        return this.q;
    }

    public iReSqtkUVggVdiReSqtkUVg J() {
        return this.u;
    }

    public void f(boolean bl) {
        this.u.b(bl);
    }

    public void g(boolean bl) {
        this.v = bl;
    }

    public boolean K() {
        return this.v;
    }

    public void h(boolean bl) {
        this.y = bl;
    }

    static /* synthetic */ iReSqtkUVgFWjiReSqtkUVg a(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2) {
        return iReSqtkUVgpqqiReSqtkUVg2.t;
    }

    static /* synthetic */ void a(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2, boolean bl) {
        iReSqtkUVgpqqiReSqtkUVg2.i(bl);
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg b(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2) {
        return iReSqtkUVgpqqiReSqtkUVg2.r;
    }

    static /* synthetic */ void c(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2) {
        iReSqtkUVgpqqiReSqtkUVg2.D();
    }
}

