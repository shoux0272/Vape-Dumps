/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgJCoiReSqtkUVg<T>
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgXTEiReSqtkUVg,
iReSqtkUVgqhUiReSqtkUVg {
    private static final int h = 2;
    private final iReSqtkUVgwgUiReSqtkUVg p = new iReSqtkUVgwgUiReSqtkUVg(false);
    private final iReSqtkUVgwgUiReSqtkUVg q = new iReSqtkUVgwgUiReSqtkUVg(false);
    private final iReSqtkUVgFWjiReSqtkUVg r;
    private iReSqtkUVgilmiReSqtkUVg s;
    private double t = 0.5;
    private T u;

    public iReSqtkUVgJCoiReSqtkUVg(String string, T ... arrT) {
        this.a((T)new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        if (string != null) {
            this.s = new iReSqtkUVgilmiReSqtkUVg(string, iReSqtkUVgIqLiReSqtkUVg.b, 0.7);
        }
        this.r = new iReSqtkUVgFWjiReSqtkUVg("", false);
        this.r.D().a(i);
        this.r.a(new iReSqtkUVgHqliReSqtkUVg(this));
        this.p.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.p.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.p.c(false);
        this.p.a(k);
        this.q.a_(false);
        this.q.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, arrT.length, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2)));
        for (T t : arrT) {
            iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg(this.b(t), false);
            iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVguokiReSqtkUVg(this, t));
            iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgGudiReSqtkUVg(this, t));
            this.q.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        }
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.q);
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        this.r.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.q.o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d2 - 4.0);
        }
        if (this.s != null) {
            this.s.c(d2);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.r.d(d2);
        this.p.d(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.q.o()) {
            iReSqtkUVgnCWiReSqtkUVg2.d(d2);
        }
        if (this.s != null) {
            this.s.d(d2 * 0.6);
        }
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.h()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            this.p.k(!this.h_());
            if (this.h_()) {
                iReSqtkUVguKSiReSqtkUVg.a(this.m().darker().darker().darker(), this.d(), this.p, 4);
            } else {
                iReSqtkUVguKSiReSqtkUVg.a(this.m().darker(), this.d(), this.p, 0, 2, 1);
                iReSqtkUVguKSiReSqtkUVg.a(this.m().darker(), this.d(), this.q, 0, 2, 3);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }

    @Override
    public boolean h_() {
        return !this.q.h();
    }

    @Override
    public void c_(boolean bl) {
        this.q.a_(!bl);
    }

    public T D() {
        return this.u;
    }

    public void a(T t) {
        this.u = t;
        this.r.D().a(this.b(t));
    }

    private String b(T t) {
        if (t instanceof iReSqtkUVgqXEiReSqtkUVg) {
            return ((iReSqtkUVgqXEiReSqtkUVg)t).N();
        }
        return t.toString();
    }

    @Override
    public double d() {
        return this.t;
    }

    @Override
    public void a(double d2) {
        this.t = d2;
    }

    static /* synthetic */ Object a(iReSqtkUVgJCoiReSqtkUVg iReSqtkUVgJCoiReSqtkUVg2) {
        return iReSqtkUVgJCoiReSqtkUVg2.u;
    }
}

