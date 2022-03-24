/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgFWjiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgXTEiReSqtkUVg,
iReSqtkUVgupGiReSqtkUVg {
    private final iReSqtkUVgilmiReSqtkUVg h = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.b, 1.0);
    private boolean p;
    private double q = 0.0;
    private iReSqtkUVgycViReSqtkUVg r;

    public iReSqtkUVgFWjiReSqtkUVg(String string, boolean bl) {
        this.p = bl;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.a(null, new iReSqtkUVgVMeiReSqtkUVg(this));
        this.h.a(string);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.h);
    }

    public iReSqtkUVgFWjiReSqtkUVg(boolean bl) {
        this.p = bl;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.a(null, new iReSqtkUVgqXjiReSqtkUVg(this));
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        this.h.c(this.k());
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.h.d(this.l());
    }

    @Override
    public void a(boolean bl) {
        if (this.h()) {
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.q > 0.0) {
                iReSqtkUVguKSiReSqtkUVg.a(this.n(), this.q, this, 4);
            }
            if (this.p) {
                iReSqtkUVguKSiReSqtkUVg.a(this.n(), this);
            }
            if (this.t()) {
                iReSqtkUVguKSiReSqtkUVg.a(k, this.c() + this.q, this.e_() + this.l() - this.q, this.c() + this.k() - this.q, this.e_() + this.l() - this.q, this.c() + this.k() - this.q, this.e_() + this.q, this.c() + this.q, this.e_() + this.q);
            }
            GL11.glEnable((int)3553);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
        }
        super.a(bl);
    }

    @Override
    public iReSqtkUVgycViReSqtkUVg d_() {
        return this.r;
    }

    @Override
    public void a(iReSqtkUVgycViReSqtkUVg iReSqtkUVgycViReSqtkUVg2) {
        this.r = iReSqtkUVgycViReSqtkUVg2;
    }

    @Override
    public double d() {
        return this.q;
    }

    @Override
    public void a(double d2) {
        this.q = d2;
    }

    public iReSqtkUVgilmiReSqtkUVg D() {
        return this.h;
    }

    public boolean E() {
        return this.p;
    }

    public void f(boolean bl) {
        this.p = bl;
    }

    static /* synthetic */ iReSqtkUVgycViReSqtkUVg a(iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2) {
        return iReSqtkUVgFWjiReSqtkUVg2.r;
    }
}

