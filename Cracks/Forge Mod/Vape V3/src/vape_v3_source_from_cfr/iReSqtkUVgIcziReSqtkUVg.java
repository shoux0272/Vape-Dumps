/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

public class iReSqtkUVgIcziReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private iReSqtkUVgwgUiReSqtkUVg p;
    private iReSqtkUVgwgUiReSqtkUVg q;
    private iReSqtkUVguOciReSqtkUVg r;
    private iReSqtkUVguOciReSqtkUVg s;

    public iReSqtkUVgIcziReSqtkUVg() {
        super("Public Publish Profiles", false);
        this.J().a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.T();
        this.U();
        this.c(90.0);
        this.d(20.0);
        this.a(new iReSqtkUVgimuiReSqtkUVg(this));
    }

    private void a(iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2) {
        Iterator<iReSqtkUVgnCWiReSqtkUVg> iterator = iReSqtkUVguOciReSqtkUVg2.D().o().iterator();
        while (iterator.hasNext()) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2;
            iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2;
            iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 = iterator.next();
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgQsfiReSqtkUVg) || !((iReSqtkUVgQsfiReSqtkUVg2 = (iReSqtkUVgQsfiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).D() instanceof iReSqtkUVgntKiReSqtkUVg) || (iReSqtkUVgntKiReSqtkUVg2 = (iReSqtkUVgntKiReSqtkUVg)iReSqtkUVgQsfiReSqtkUVg2.D()).m()) continue;
            iterator.remove();
        }
    }

    private void T() {
        this.q = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.q.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 0)));
        this.c(this.q);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("Your Private Profiles:", iReSqtkUVgIqLiReSqtkUVg.b, 0.7);
        iReSqtkUVgilmiReSqtkUVg2.c(85.0);
        iReSqtkUVgilmiReSqtkUVg2.d(12.0);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
        this.s = new iReSqtkUVguOciReSqtkUVg(false);
        this.s.c(100.0);
        this.s.d(70.0);
        this.c(this.s);
    }

    private void U() {
        this.p = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.p.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.c(this.p);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("Your Public Profiles:", iReSqtkUVgIqLiReSqtkUVg.b, 0.7);
        iReSqtkUVgilmiReSqtkUVg2.a_("");
        iReSqtkUVgilmiReSqtkUVg2.a(new iReSqtkUVgyamiReSqtkUVg(this, iReSqtkUVgilmiReSqtkUVg2));
        iReSqtkUVgilmiReSqtkUVg2.c(85.0);
        iReSqtkUVgilmiReSqtkUVg2.d(12.0);
        this.p.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
        this.r = new iReSqtkUVguOciReSqtkUVg(false);
        this.r.c(100.0);
        this.r.d(70.0);
        this.c(this.r);
        for (int i = 0; i < 25; ++i) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = new iReSqtkUVgntKiReSqtkUVg("public  " + i, "6.9");
            iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2 = new iReSqtkUVgQsfiReSqtkUVg(iReSqtkUVgntKiReSqtkUVg2, 85.0);
            this.r.c(iReSqtkUVgQsfiReSqtkUVg2);
            this.r.c_();
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d2);
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVguOciReSqtkUVg)) continue;
            iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2 = (iReSqtkUVguOciReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : iReSqtkUVguOciReSqtkUVg2.D().o()) {
                iReSqtkUVgnCWiReSqtkUVg3.c(d2 - 4.0);
            }
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.r.d((d2 -= 24.0) * 0.5);
        this.s.d(d2 * 0.5);
        this.p.d(12.0);
        this.q.d(12.0);
    }

    @Override
    public void c_() {
        this.b_(false);
        this.c_(false);
        this.L().a_(false);
        this.a_(iReSqtkUVgFCaiReSqtkUVg.f.c() + iReSqtkUVgFCaiReSqtkUVg.f.k() + 3.0);
        this.b(iReSqtkUVgFCaiReSqtkUVg.f.e_());
        this.d(iReSqtkUVgFCaiReSqtkUVg.f.l());
        super.c_();
    }

    @Override
    public void a(boolean bl) {
        super.a(false);
    }

    public void a(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        if (iReSqtkUVgnWNiReSqtkUVg2.g().equalsIgnoreCase("default")) {
            return;
        }
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(1, 2, 1, 2)));
        iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2 = new iReSqtkUVgQsfiReSqtkUVg(iReSqtkUVgnWNiReSqtkUVg2, 85.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgQsfiReSqtkUVg2);
        if (iReSqtkUVgnWNiReSqtkUVg2 instanceof iReSqtkUVgntKiReSqtkUVg) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = (iReSqtkUVgntKiReSqtkUVg)iReSqtkUVgnWNiReSqtkUVg2;
            if (iReSqtkUVgntKiReSqtkUVg2.m()) {
                this.r.c(iReSqtkUVgwgUiReSqtkUVg2);
                this.r.c_();
            }
        } else {
            this.s.c(iReSqtkUVgwgUiReSqtkUVg2);
            this.s.c_();
        }
    }

    public void b(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2;
        iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 = null;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : this.s.D().o()) {
            if (!(iReSqtkUVgnCWiReSqtkUVg3 instanceof iReSqtkUVgwgUiReSqtkUVg) || (iReSqtkUVgwgUiReSqtkUVg2 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg3).o().isEmpty() || !(iReSqtkUVgwgUiReSqtkUVg2.o().get(0) instanceof iReSqtkUVgQsfiReSqtkUVg) || !(iReSqtkUVgQsfiReSqtkUVg2 = (iReSqtkUVgQsfiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg2.o().get(0)).D().f().toString().equalsIgnoreCase(iReSqtkUVgnWNiReSqtkUVg2.f().toString())) continue;
            iReSqtkUVgnCWiReSqtkUVg2 = iReSqtkUVgnCWiReSqtkUVg3;
        }
        if (iReSqtkUVgnCWiReSqtkUVg2 == null) {
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : this.r.D().o()) {
                if (!(iReSqtkUVgnCWiReSqtkUVg3 instanceof iReSqtkUVgwgUiReSqtkUVg) || (iReSqtkUVgwgUiReSqtkUVg2 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg3).o().isEmpty() || !(iReSqtkUVgwgUiReSqtkUVg2.o().get(0) instanceof iReSqtkUVgQsfiReSqtkUVg) || !(iReSqtkUVgQsfiReSqtkUVg2 = (iReSqtkUVgQsfiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg2.o().get(0)).D().f().toString().equalsIgnoreCase(iReSqtkUVgnWNiReSqtkUVg2.f().toString())) continue;
                iReSqtkUVgnCWiReSqtkUVg2 = iReSqtkUVgnCWiReSqtkUVg3;
            }
        }
        if (iReSqtkUVgnCWiReSqtkUVg2 != null) {
            this.s.D().b(iReSqtkUVgnCWiReSqtkUVg2);
            this.s.c_();
            this.r.D().b(iReSqtkUVgnCWiReSqtkUVg2);
            this.r.c_();
        }
    }

    public iReSqtkUVguOciReSqtkUVg R() {
        return this.r;
    }

    public iReSqtkUVguOciReSqtkUVg S() {
        return this.s;
    }

    static /* synthetic */ iReSqtkUVguOciReSqtkUVg a(iReSqtkUVgIcziReSqtkUVg iReSqtkUVgIcziReSqtkUVg2) {
        return iReSqtkUVgIcziReSqtkUVg2.r;
    }

    static /* synthetic */ void a(iReSqtkUVgIcziReSqtkUVg iReSqtkUVgIcziReSqtkUVg2, iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2) {
        iReSqtkUVgIcziReSqtkUVg2.a(iReSqtkUVguOciReSqtkUVg2);
    }

    static /* synthetic */ iReSqtkUVguOciReSqtkUVg b(iReSqtkUVgIcziReSqtkUVg iReSqtkUVgIcziReSqtkUVg2) {
        return iReSqtkUVgIcziReSqtkUVg2.s;
    }
}

