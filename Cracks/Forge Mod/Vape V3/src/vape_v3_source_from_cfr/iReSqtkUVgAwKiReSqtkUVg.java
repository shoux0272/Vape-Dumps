/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgAwKiReSqtkUVg
extends iReSqtkUVgbqSiReSqtkUVg {
    private int C;
    private int D;
    private int E;
    private iReSqtkUVgilmiReSqtkUVg F;
    private iReSqtkUVgilmiReSqtkUVg G;
    private iReSqtkUVgilmiReSqtkUVg H;
    private boolean I;
    private Color J = new Color(101, 194, 152);
    private Color K = new Color(208, 32, 38);

    public iReSqtkUVgAwKiReSqtkUVg() {
        super(100.0, 0.0, null, null, null);
        this.d(true);
        this.F = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.c, 0.6);
        this.G = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.b, 0.6);
        this.H = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 0.6);
        this.b(0, 0);
    }

    @Override
    public void a(boolean bl) {
        if (this.h() && !this.w && this.B) {
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            if (this.m() != null) {
                iReSqtkUVguKSiReSqtkUVg.a(this.m(), this.c() - 2.0, this.e_() + this.l(), this.c() + this.k() + 2.0, this.e_() + this.l(), this.c() + this.k() + 2.0, this.e_(), this.c() - 2.0, this.e_());
            }
            double d2 = 7.0;
            double d3 = 2.0;
            iReSqtkUVguKSiReSqtkUVg.a(m, this.c() + 0.5, this.e_() + this.K() + this.d() + this.d() - d3 - 0.5, this.c() + this.k() - 0.25, this.e_() + this.K() + this.d() + this.d() - d3 - 0.5, this.c() + this.k() - 0.25, this.e_() + d2 + 0.5, this.c() + 0.5, this.e_() + d2 + 0.5);
            iReSqtkUVguKSiReSqtkUVg.a(this.I ? this.J : this.K, this.c() + this.d(), this.e_() + this.d() + this.K() - d3, this.c() + this.k() - this.d(), this.e_() + this.d() + this.K() - d3, this.c() + this.k() - this.d(), this.e_() + this.d() + d2, this.c() + this.d(), this.e_() + this.d() + d2);
            iReSqtkUVguKSiReSqtkUVg.a(this.I ? this.K : this.J, this.c() + this.d(), this.e_() + this.d() + this.K() - d3, this.c() + this.L() - this.d(), this.e_() + this.d() + this.K() - d3, this.c() + this.L() - this.d(), this.e_() + this.d() + d2, this.c() + this.d(), this.e_() + this.d() + d2);
            if (this.F() != 0) {
                iReSqtkUVguKSiReSqtkUVg.a((this.I ? this.K : this.J).darker().darker().darker(), this.c() + this.L() + this.d() - 2.25, this.e_() + this.d() + this.K() - d3, this.c() + this.L() + this.d() - 1.5, this.e_() + this.d() + this.K() - d3, this.c() + this.L() + this.d() - 1.5, this.e_() + this.d() + d2, this.c() + this.L() + this.d() - 2.25, this.e_() + this.d() + d2);
            }
            double d4 = this.k() / 2.0 + 1.0;
            iReSqtkUVguKSiReSqtkUVg.a(k, this.c() + d4 + this.d() - 0.5 - 2.0, this.e_() + this.d() + this.K() - d3 + 1.5, this.c() + d4 + this.d() + 0.5 - 2.0, this.e_() + this.d() + this.K() - d3 + 1.5, this.c() + d4 + this.d() + 0.5 - 2.0, this.e_() + this.d() + d2 - 1.5, this.c() + d4 + this.d() - 0.5 - 2.0, this.e_() + this.d() + d2 - 1.5);
            GL11.glEnable((int)3553);
            this.F.c(10.0);
            this.F.d(10.0);
            this.F.a_(this.c() + d4 - 16.0);
            this.F.b(this.e_() - 1.0);
            this.F.a(false);
            this.G.c(10.0);
            this.G.d(10.0);
            this.G.a_(this.c() - 3.0);
            this.G.b(this.e_() - 1.0);
            this.G.a(false);
            if (this.D() > this.E()) {
                this.G.a(this.I ? this.K : this.J);
            } else if (this.E() > this.D()) {
                this.G.a(this.I ? this.J : this.K);
            } else {
                this.G.a(Color.WHITE);
            }
            this.H.c(10.0);
            this.H.d(10.0);
            this.H.a_(this.c() + d4 + 3.0);
            this.H.b(this.e_() - 1.0);
            this.H.a(false);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
        }
    }

    public void b(int n, int n2) {
        double d2;
        this.C = n;
        this.F.a(this.C + "");
        this.D = n2;
        this.H.a(this.D + "");
        this.E = this.I ? this.D - this.C : this.C - this.D;
        this.G.a(this.E + "");
        if (this.E > 0) {
            this.G.a("+" + this.E);
        }
        if ((d2 = (double)(this.C + this.D)) == 0.0) {
            this.e(50.0);
            return;
        }
        double d3 = (double)(d2 > 0.0 ? n : n2) / d2;
        this.e(100.0 * d3);
    }

    public int D() {
        return this.C;
    }

    public int E() {
        return this.D;
    }

    public int F() {
        return this.E;
    }

    public Color H() {
        return this.J;
    }

    public void c(Color color) {
        this.J = color;
    }

    public Color I() {
        return this.K;
    }

    public void d(Color color) {
        this.K = color;
    }

    public boolean J() {
        return this.I;
    }

    public void f(boolean bl) {
        this.I = bl;
    }
}

