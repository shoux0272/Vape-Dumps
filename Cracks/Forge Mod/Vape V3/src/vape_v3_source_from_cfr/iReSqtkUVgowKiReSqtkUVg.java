/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgowKiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private static final double p = 20.0;
    private static final double q = 18.0;
    private final iReSqtkUVgwgUiReSqtkUVg r;
    private final iReSqtkUVgOkOiReSqtkUVg s;
    private final iReSqtkUVgilmiReSqtkUVg t;
    private final iReSqtkUVguOciReSqtkUVg u;
    private final iReSqtkUVgZfciReSqtkUVg v;
    private iReSqtkUVgPzKiReSqtkUVg w = new iReSqtkUVgPzKiReSqtkUVg();

    public iReSqtkUVgowKiReSqtkUVg() {
        super("Search", false);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 1.0, 5, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 3.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 2, 2)));
        iReSqtkUVgwgUiReSqtkUVg2.c(125.0);
        this.c(iReSqtkUVgwgUiReSqtkUVg2);
        this.r = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.v = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "new block color", Color.RED);
        this.v.j();
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.v.c());
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)new iReSqtkUVgYTjiReSqtkUVg(iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVghUmiReSqtkUVg.class)));
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("Add", false);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(20.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgcmjiReSqtkUVg(this));
        this.s = new iReSqtkUVgmlHiReSqtkUVg(this, 64, iReSqtkUVgFWjiReSqtkUVg2);
        this.s.d(12.0);
        this.s.b("<block name>");
        this.r.a(new iReSqtkUVgLWWiReSqtkUVg(1.0, 1.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 1, 0)));
        this.r.a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        this.r.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.t = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.b, 0.8);
        this.t.d(15.0);
        this.t.a_(false);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.t);
        this.u = new iReSqtkUVguOciReSqtkUVg(false);
        this.u.d(130.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.u);
        this.c(125.0);
        this.d(20.0);
    }

    private void b(String string) {
        String string2 = string.replace(" ", "_");
        if (string2.contains(":")) {
            string2 = string2.split(":")[0];
        }
        iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgGrkiReSqtkUVg.a(string2);
        this.w.b();
        if (iReSqtkUVgGrkiReSqtkUVg2 == null) {
            this.t.a("Could not find block");
            return;
        }
        Color color = this.v.k();
        this.v.j();
        this.s.E().a("");
        this.t.a("Added " + string);
        this.a(string, color);
    }

    @Override
    public void c_() {
        super.c_();
        if (this.t.h() && this.w.a(2000L)) {
            this.t.a("");
            this.w.b();
        }
        if (this.t.D().isEmpty()) {
            this.t.a_(false);
        } else {
            this.t.a_(true);
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        double d3 = d2 - 9.0;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d3);
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgcvhiReSqtkUVg) || iReSqtkUVgnCWiReSqtkUVg2.equals(this.u)) continue;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : ((iReSqtkUVgcvhiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).o()) {
                iReSqtkUVgnCWiReSqtkUVg3.c(iReSqtkUVgnCWiReSqtkUVg2.k());
            }
        }
        this.s.c(d3 - 20.0);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.u.D().o()) {
            iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3;
            iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
            iReSqtkUVgnCWiReSqtkUVg3 = iReSqtkUVgwgUiReSqtkUVg2.o().get(0);
            iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 = iReSqtkUVgwgUiReSqtkUVg2.o().get(1);
            iReSqtkUVgnCWiReSqtkUVg3.c(d3 - 18.0 - 5.0);
            iReSqtkUVgnCWiReSqtkUVg4.c(18.0);
        }
    }

    private void a(String string, Color color) {
        iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 = new iReSqtkUVgowliReSqtkUVg(string, color.getRGB());
        this.a(iReSqtkUVgowliReSqtkUVg2);
        iReSqtkUVgFuiiReSqtkUVg.e.s().a(iReSqtkUVgowliReSqtkUVg2);
    }

    public void a(iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2) {
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.c(this.k() - 28.0);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(1.0, 1.0, 2, 2, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 0)));
        iReSqtkUVgDgxiReSqtkUVg iReSqtkUVgDgxiReSqtkUVg2 = new iReSqtkUVgDgxiReSqtkUVg(iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgowliReSqtkUVg2);
        iReSqtkUVgowliReSqtkUVg2.a(iReSqtkUVgDgxiReSqtkUVg2);
        this.u.c(iReSqtkUVgwgUiReSqtkUVg2);
    }

    public void a(iReSqtkUVgDgxiReSqtkUVg iReSqtkUVgDgxiReSqtkUVg2) {
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = this.u.D();
        iReSqtkUVgwgUiReSqtkUVg2.b(iReSqtkUVgDgxiReSqtkUVg2.F());
    }

    static /* synthetic */ iReSqtkUVgOkOiReSqtkUVg a(iReSqtkUVgowKiReSqtkUVg iReSqtkUVgowKiReSqtkUVg2) {
        return iReSqtkUVgowKiReSqtkUVg2.s;
    }

    static /* synthetic */ void a(iReSqtkUVgowKiReSqtkUVg iReSqtkUVgowKiReSqtkUVg2, String string) {
        iReSqtkUVgowKiReSqtkUVg2.b(string);
    }
}

