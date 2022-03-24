/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgeAoiReSqtkUVg
extends iReSqtkUVgpqqiReSqtkUVg {
    private iReSqtkUVgCMeiReSqtkUVg q;

    public iReSqtkUVgeAoiReSqtkUVg(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        super(iReSqtkUVgCMeiReSqtkUVg2.I().D(), iReSqtkUVgCMeiReSqtkUVg2.K());
        this.q = iReSqtkUVgCMeiReSqtkUVg2;
        this.d(20.0);
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        iReSqtkUVgIDdiReSqtkUVg iReSqtkUVgIDdiReSqtkUVg2 = this.G();
        iReSqtkUVgIDdiReSqtkUVg2.a(new iReSqtkUVgqBbiReSqtkUVg(this, iReSqtkUVgCMeiReSqtkUVg2, iReSqtkUVgypOiReSqtkUVg2));
        this.a(new iReSqtkUVgOWYiReSqtkUVg(this, iReSqtkUVgypOiReSqtkUVg2, iReSqtkUVgCMeiReSqtkUVg2));
        this.c(97.0);
        if (!(iReSqtkUVgCMeiReSqtkUVg2 instanceof iReSqtkUVgYAniReSqtkUVg)) {
            this.g(true);
        }
        this.b(true);
        this.h(false);
    }

    @Override
    public boolean y() {
        return this.q.h();
    }

    @Override
    public void b_() {
        if (this.q.h()) {
            this.q.a_(false);
            this.G().D().a(Color.WHITE);
        } else {
            this.q.a_(true);
            this.G().D().a(this.m());
        }
    }

    @Override
    public void E() {
        if (!this.b()) {
            this.G().D().a(Color.WHITE);
        } else {
            this.G().D().a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k());
        }
    }

    @Override
    public boolean b() {
        return this.q.h();
    }

    @Override
    public void b(boolean bl) {
        if (this.b() != bl) {
            this.b_();
        }
    }
}

