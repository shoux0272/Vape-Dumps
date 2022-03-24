/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.w7;
import manthe.wM;
import manthe.wc;
import manthe.we;
import manthe.zu;

public abstract class w8<T extends w7>
extends we {
    private T V;
    private double X;
    private double W;

    public w8(T t2) {
        this.a(w8.b.k);
        this.W().e(false);
        this.W().b("wrap");
        this.c(300.0);
        this.a(100.0);
        this.V = t2;
        this.k(false);
        this.j(false);
    }

    public void n() {
        if (((wM)this.V).d() != this.X || ((wM)this.V).c() != this.W) {
            double d10 = ((wM)this.V).c();
            wc wc2 = ((wM)this.V).F();
            if (wc2.U()) {
                d10 = Math.min(d10, wc2.c() + wc2.L() - ((wM)this.V).f());
                d10 = Math.max(d10, wc2.c() + wc2.Y().f());
            }
            if (((wM)this.V).d() + ((wM)this.V).e() + this.e() > (double)ds.p().g()) {
                this.a(((wM)this.V).d() - this.e(), d10);
            } else {
                this.a(((wM)this.V).d() + ((wM)this.V).e(), d10);
            }
            this.X = ((wM)this.V).d();
            this.W = ((wM)this.V).c();
        }
    }

    public T m() {
        return this.V;
    }

    @Override
    public void V() {
        if (zu.ap().equals(((wM)this.V).F())) {
            zu.a(this);
        }
    }

    @Override
    public boolean b() {
        return ((wM)this.V).b() && ((wM)this.V).F().b() && ((w7)this.V).O();
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "sidecar_" + this.V.hashCode();
    }
}

