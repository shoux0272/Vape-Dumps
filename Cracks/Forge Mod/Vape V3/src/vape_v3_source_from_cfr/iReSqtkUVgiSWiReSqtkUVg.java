/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public class iReSqtkUVgiSWiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private static final double q = 20.0;
    private static final double r = 14.0;
    private static final double s = 12.0;
    public final iReSqtkUVguOciReSqtkUVg p;
    private final iReSqtkUVgOkOiReSqtkUVg t;

    public iReSqtkUVgiSWiReSqtkUVg() {
        super("Profiles", false);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 3.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 2, 2)));
        iReSqtkUVgwgUiReSqtkUVg2.c(120.0);
        this.c(iReSqtkUVgwgUiReSqtkUVg2);
        iReSqtkUVgmBwiReSqtkUVg iReSqtkUVgmBwiReSqtkUVg2 = new iReSqtkUVgmBwiReSqtkUVg(this, false);
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("Add", false);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(20.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgTFEiReSqtkUVg(this));
        this.t = new iReSqtkUVgMPKiReSqtkUVg(this, 16, iReSqtkUVgFWjiReSqtkUVg2);
        this.t.d(12.0);
        this.t.b("<name>");
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg2 = new iReSqtkUVgCABiReSqtkUVg("world", 0.3f, 1.0f, 1.0f);
        iReSqtkUVgCABiReSqtkUVg2.a_("Open public profiles");
        iReSqtkUVgCABiReSqtkUVg2.d(12.0);
        iReSqtkUVgCABiReSqtkUVg2.c(12.0);
        iReSqtkUVgCABiReSqtkUVg2.a(new iReSqtkUVgdSiiReSqtkUVg(this));
        iReSqtkUVgmBwiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(1.0, 0.0, 1, 3, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgmBwiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2);
        iReSqtkUVgmBwiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.t);
        iReSqtkUVgmBwiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgmBwiReSqtkUVg2);
        this.p = new iReSqtkUVguOciReSqtkUVg(false);
        this.p.d(150.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        this.c(120.0);
        this.d(20.0);
        this.I().a_("Hold SHIFT and RIGHT CLICK a profile button to save the state of currently enabled modules.\nRIGHT CLICK to enable those modules again.");
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        double d3 = (d2 -= 12.0) - 10.0;
        double d4 = d2 - 14.0;
        this.p.c(d3);
        this.t.c(d3 - 20.0);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.p.D().o()) {
            iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
            iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 = iReSqtkUVgwgUiReSqtkUVg2.o().get(0);
            iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 = iReSqtkUVgwgUiReSqtkUVg2.o().get(1);
            iReSqtkUVgnCWiReSqtkUVg3.c(d4 - 14.0 - 5.0 - 20.0);
            iReSqtkUVgnCWiReSqtkUVg4.c(-6.0);
        }
    }

    public void a(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        String string = iReSqtkUVgnWNiReSqtkUVg2.g();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 0)));
        iReSqtkUVgTveiReSqtkUVg iReSqtkUVgTveiReSqtkUVg2 = new iReSqtkUVgTveiReSqtkUVg(this, iReSqtkUVgnWNiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgnWNiReSqtkUVg2);
        iReSqtkUVgdWyiReSqtkUVg iReSqtkUVgdWyiReSqtkUVg2 = new iReSqtkUVgdWyiReSqtkUVg(this, string, iReSqtkUVgIqLiReSqtkUVg.a, 1.0, iReSqtkUVgTveiReSqtkUVg2, atomicBoolean, iReSqtkUVgnWNiReSqtkUVg2, string);
        iReSqtkUVgdWyiReSqtkUVg2.d(12.0);
        iReSqtkUVgdWyiReSqtkUVg2.c(this.k() - 14.0 - 5.0 - 10.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgdWyiReSqtkUVg2);
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("x", false);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(14.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgPmyiReSqtkUVg(this, iReSqtkUVgnWNiReSqtkUVg2));
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        if (iReSqtkUVgnWNiReSqtkUVg2 instanceof iReSqtkUVgntKiReSqtkUVg) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = (iReSqtkUVgntKiReSqtkUVg)iReSqtkUVgnWNiReSqtkUVg2;
            if (iReSqtkUVgntKiReSqtkUVg2.m()) {
                iReSqtkUVgwgUiReSqtkUVg2.a_("This profile is public!\nYou cannot remove this unless you\nunpublic the profile!");
            } else {
                iReSqtkUVgwgUiReSqtkUVg2.a_("You've downloaded this profile!");
            }
        }
        this.p.c(iReSqtkUVgwgUiReSqtkUVg2);
        this.p.c_();
    }

    private void a(iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2, String string, String string2, long l) {
        new iReSqtkUVgomQiReSqtkUVg(this, iReSqtkUVgilmiReSqtkUVg2, string, l, string2).start();
    }

    public void b(String string) {
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = null;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3 = this.p.D();
        String string2 = null;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : iReSqtkUVgwgUiReSqtkUVg3.o()) {
            iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg4 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
            iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = (iReSqtkUVgilmiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg4.o().get(0);
            string2 = iReSqtkUVgilmiReSqtkUVg2.a_();
            if (!string2.equals(string)) continue;
            iReSqtkUVgwgUiReSqtkUVg2 = iReSqtkUVgwgUiReSqtkUVg4;
            break;
        }
        if (iReSqtkUVgwgUiReSqtkUVg2 != null) {
            iReSqtkUVgFuiiReSqtkUVg.e.k().a().remove(string2);
            iReSqtkUVgwgUiReSqtkUVg3.b(iReSqtkUVgwgUiReSqtkUVg2);
        }
    }

    static /* synthetic */ iReSqtkUVgOkOiReSqtkUVg a(iReSqtkUVgiSWiReSqtkUVg iReSqtkUVgiSWiReSqtkUVg2) {
        return iReSqtkUVgiSWiReSqtkUVg2.t;
    }

    static /* synthetic */ void a(iReSqtkUVgiSWiReSqtkUVg iReSqtkUVgiSWiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2, String string, String string2, long l) {
        iReSqtkUVgiSWiReSqtkUVg2.a(iReSqtkUVgilmiReSqtkUVg2, string, string2, l);
    }
}

