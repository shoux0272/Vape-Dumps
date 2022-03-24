/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVguOciReSqtkUVg
extends iReSqtkUVgwgUiReSqtkUVg
implements iReSqtkUVgmopiReSqtkUVg {
    public static final double h = 5.0;
    private final iReSqtkUVgFWjiReSqtkUVg p = new iReSqtkUVgFWjiReSqtkUVg("", true);
    private final iReSqtkUVgxxliReSqtkUVg q = new iReSqtkUVgxxliReSqtkUVg(0.0, 0.0, 0.0, 0.0);
    private double r = 0.0;
    private double s = 0.0;
    private double t = 0.0;
    private final iReSqtkUVgwgUiReSqtkUVg u = new iReSqtkUVgipoiReSqtkUVg(this, false);
    private boolean v = false;

    public iReSqtkUVguOciReSqtkUVg(boolean bl) {
        super(bl);
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.p.b(k);
        this.p.c(5.0);
        this.p.a(new iReSqtkUVgQIAiReSqtkUVg(this));
        iReSqtkUVgLWWiReSqtkUVg iReSqtkUVgLWWiReSqtkUVg2 = new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0));
        iReSqtkUVgLWWiReSqtkUVg2.g();
        this.u.a(iReSqtkUVgLWWiReSqtkUVg2);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.u);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
    }

    @Override
    public void a(boolean bl) {
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.k(), this.l());
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        GL11.glGetInteger((int)3088, (IntBuffer)intBuffer);
        this.q.a(intBuffer.get());
        this.q.b(intBuffer.get());
        this.q.c(intBuffer.get());
        this.q.d(intBuffer.get());
        this.a(this.q);
        super.a(bl);
        GL11.glDisable((int)3089);
    }

    @Override
    public void c_() {
        int n;
        super.c_();
        if (this.t() && (n = Mouse.getDWheel()) != 0) {
            this.a(n > 0 ? -2 : 2);
        }
        double d2 = this.E();
        double d3 = this.l() / d2;
        if (d2 > this.t) {
            double d4 = this.r;
            double d5 = d2 - this.u.l();
            this.r = d4;
            if (this.r > d5) {
                this.r = d5;
            } else if (this.r < 0.0) {
                this.r = 0.0;
            }
        }
        if (d2 > this.t) {
            this.d(this.t);
            this.p.d(d3 * this.l());
            this.p.a_(true);
            this.u.d(this.l());
        } else {
            this.r = 0.0;
            this.s = 0.0;
            this.p.d(0.0);
            this.p.a_(false);
            this.u.d(d2 + 2.0);
        }
        this.u.b(this.u.e_() + this.r);
        this.p.b(this.p.e_() + this.s);
        if (this.f_()) {
            this.a(this.v());
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.u.o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(this.k() - 5.0);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.t = d2;
        this.u.d(d2);
    }

    @Override
    public boolean f_() {
        return this.v;
    }

    @Override
    public void b_(boolean bl) {
        this.v = bl;
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        return super.a(n, n2, n3);
    }

    public void c(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.u.a(iReSqtkUVgnCWiReSqtkUVg2);
        this.c_();
    }

    public iReSqtkUVgwgUiReSqtkUVg D() {
        return this.u;
    }

    public double E() {
        double d2 = 0.0;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.u.o()) {
            if (!iReSqtkUVgnCWiReSqtkUVg2.h()) continue;
            d2 += iReSqtkUVgnCWiReSqtkUVg2.l();
        }
        return d2;
    }

    public void a(int n) {
        double d2 = this.E();
        double d3 = this.l() / d2;
        if (d2 > this.t) {
            double d4 = (double)n / d3 + this.r;
            double d5 = d2 - this.u.l();
            this.r = d4;
            if (this.r > d5) {
                this.r = d5;
            } else if (this.r < 0.0) {
                this.r = 0.0;
            }
            double d6 = this.s + (double)n;
            double d7 = this.l() - this.p.l();
            this.s = d6;
            if (this.s > d7) {
                this.s = d7;
            } else if (this.s < 0.0) {
                this.s = 0.0;
            }
        }
    }

    public boolean F() {
        return this.p.h();
    }

    static /* synthetic */ double a(iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2) {
        return iReSqtkUVguOciReSqtkUVg2.r;
    }
}

