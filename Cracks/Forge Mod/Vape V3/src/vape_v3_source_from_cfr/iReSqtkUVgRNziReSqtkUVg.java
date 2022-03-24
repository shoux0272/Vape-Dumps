/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgRNziReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private final iReSqtkUVggVdiReSqtkUVg h;
    private final iReSqtkUVgilmiReSqtkUVg p;
    private double q;

    public iReSqtkUVgRNziReSqtkUVg(String string, double d2) {
        this(string, new iReSqtkUVggVdiReSqtkUVg());
        this.q = d2;
        this.h.c(d2);
    }

    public iReSqtkUVgRNziReSqtkUVg(String string, iReSqtkUVggVdiReSqtkUVg iReSqtkUVggVdiReSqtkUVg2) {
        this.q = iReSqtkUVggVdiReSqtkUVg2.k();
        iReSqtkUVgLWWiReSqtkUVg iReSqtkUVgLWWiReSqtkUVg2 = new iReSqtkUVgLWWiReSqtkUVg(3.0, 0.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0));
        this.a(iReSqtkUVgLWWiReSqtkUVg2);
        this.p = new iReSqtkUVgilmiReSqtkUVg(string, iReSqtkUVgIqLiReSqtkUVg.a, 0.6, false);
        this.h = iReSqtkUVggVdiReSqtkUVg2;
        iReSqtkUVggVdiReSqtkUVg2.a(0.5);
        this.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVggVdiReSqtkUVg2);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
    }

    @Override
    public void a(Color color) {
        super.a(color);
        this.h.a(color);
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        this.p.c(d2 - this.q - ((iReSqtkUVgLWWiReSqtkUVg)this.r()).d());
        this.h.c(this.q);
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.h.d(d2);
        this.p.d(d2);
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (this.A()) {
            return false;
        }
        if (this.t() && !this.h.t()) {
            this.h.d_().a(n, n2, n3);
        }
        return super.a(n, n2, n3);
    }

    @Override
    public void b_() {
        this.h.b_();
    }

    @Override
    public boolean b() {
        return this.h.b();
    }

    @Override
    public void b(boolean bl) {
        this.h.b(bl);
    }

    public iReSqtkUVggVdiReSqtkUVg D() {
        return this.h;
    }
}

