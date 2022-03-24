/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgSeRiReSqtkUVg
extends iReSqtkUVgbqSiReSqtkUVg {
    private int C = 0;
    private long D = 0L;
    private boolean E = false;

    public iReSqtkUVgSeRiReSqtkUVg(double d2, double d3, String string, String string2, String string3) {
        super(d2, d3, string, string2, string3);
        this.B = false;
        if (string3 != null && !string3.isEmpty()) {
            this.o().clear();
            this.w = true;
            this.x = new iReSqtkUVgilmiReSqtkUVg(string3, iReSqtkUVgIqLiReSqtkUVg.b, 0.5, false);
            this.x.d(this.j().a(string3) * 0.5);
            this.v = new iReSqtkUVgSeRiReSqtkUVg(d2, d3, string, string2, null);
            this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 2, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.x);
            this.a((iReSqtkUVgnCWiReSqtkUVg)this.v);
        }
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.w) {
            this.x.d(this.j().a(this.u) + 2.0);
        }
        if (this.h() && !this.w) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3553);
            iReSqtkUVguKSiReSqtkUVg.a(this.g_() ? this.m().darker().darker().darker() : this.n(), this.d(), this, 4);
            float f = 0.0f;
            float f2 = this.D();
            iReSqtkUVgZfciReSqtkUVg iReSqtkUVgZfciReSqtkUVg2 = (iReSqtkUVgZfciReSqtkUVg)this.x();
            double d2 = this.d() + this.c() + 0.1;
            double d3 = this.e_() + this.l() - this.d();
            double d4 = this.c() + this.d();
            double d5 = this.e_() + this.l() - this.d();
            double d6 = this.c() + this.d();
            double d7 = this.e_() + this.d();
            double d8 = this.d() + this.c() + 0.1;
            double d9 = this.e_() + this.d();
            while (f < f2) {
                Color color = Color.WHITE;
                if (this.C == 0) {
                    color = new Color(Color.HSBtoRGB(f / f2, iReSqtkUVgZfciReSqtkUVg2.p(), iReSqtkUVgZfciReSqtkUVg2.q()));
                } else if (this.C == 1) {
                    color = new Color(Color.HSBtoRGB(iReSqtkUVgZfciReSqtkUVg2.o(), iReSqtkUVgZfciReSqtkUVg2.p(), f / f2));
                } else if (this.C == 2) {
                    color = new Color(Color.HSBtoRGB(iReSqtkUVgZfciReSqtkUVg2.o(), f / f2, iReSqtkUVgZfciReSqtkUVg2.q()));
                }
                iReSqtkUVguKSiReSqtkUVg.a(color, d2 + (double)f, d3, d4 + (double)f, d5, d6 + (double)f, d7, d8 + (double)f, d9);
                f = (float)((double)f + 0.1);
            }
            GL11.glEnable((int)3042);
            double d10 = -2.5;
            double d11 = -1.0;
            if (this.L() <= 1.0) {
                d11 = -d10 - 1.0;
                d10 = 0.0;
            } else if (this.L() >= 1.0 && this.L() <= 3.0) {
                d11 = -d10 - 1.5;
                d10 = -0.5;
            } else if (this.L() >= 3.0 && this.L() <= 5.0) {
                d11 = -d10 - 2.0;
                d10 = -1.0;
            } else if (this.L() >= 5.0 && this.L() <= 7.0) {
                d11 = -d10 - 2.5;
                d10 = -1.5;
            }
            iReSqtkUVguKSiReSqtkUVg.a(this.m().darker().darker().darker(), this.c() + this.L() + this.d() + d10, this.e_() + this.d() + this.K(), this.c() + this.L() + this.d() + d11, this.e_() + this.d() + this.K(), this.c() + this.L() + this.d() + d11, this.e_() + this.d(), this.c() + this.L() + this.d() + d10, this.e_() + this.d());
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
        }
    }

    public float D() {
        return (float)(this.k() - this.d() * 2.0);
    }

    public Color E() {
        return new Color(Color.HSBtoRGB(this.G().floatValue() / (float)this.p, ((iReSqtkUVgZfciReSqtkUVg)this.x()).p(), ((iReSqtkUVgZfciReSqtkUVg)this.x()).q()));
    }

    public boolean F() {
        if (this.w) {
            return ((iReSqtkUVgSeRiReSqtkUVg)this.v).F();
        }
        return ((iReSqtkUVgZfciReSqtkUVg)this.x()).m();
    }

    public void f(boolean bl) {
        ((iReSqtkUVgZfciReSqtkUVg)this.x()).b(bl);
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (!this.w && this.t()) {
            if (Keyboard.isKeyDown((int)42)) {
                if (this.C++ > 1) {
                    this.C = 0;
                }
                this.e(this.G());
                return true;
            }
            if (System.currentTimeMillis() - this.D < 300L) {
                this.f(!this.F());
            }
            this.D = System.currentTimeMillis();
        }
        return super.a(n, n2, n3);
    }

    @Override
    public Double G() {
        if (this.C == 0) {
            return ((iReSqtkUVgZfciReSqtkUVg)this.x()).r().i();
        }
        if (this.C == 1) {
            return ((iReSqtkUVgZfciReSqtkUVg)this.x()).s().i();
        }
        if (this.C == 2) {
            return ((iReSqtkUVgZfciReSqtkUVg)this.x()).t().i();
        }
        return super.G();
    }

    @Override
    public void e(double d2) {
        if (this.C == 0) {
            ((iReSqtkUVgZfciReSqtkUVg)this.x()).r().a(d2);
        } else if (this.C == 1) {
            ((iReSqtkUVgZfciReSqtkUVg)this.x()).s().a(d2);
        } else if (this.C == 2) {
            ((iReSqtkUVgZfciReSqtkUVg)this.x()).t().a(d2);
        }
        super.e(d2);
    }
}

