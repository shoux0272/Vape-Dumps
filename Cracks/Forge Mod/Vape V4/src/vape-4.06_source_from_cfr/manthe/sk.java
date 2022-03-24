/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.Be;
import manthe.Bo;
import manthe.D5;
import manthe.D7;
import manthe.Dq;
import manthe.Ds;
import manthe.Dy;
import manthe.Y;
import manthe.k9;
import manthe.mU;
import manthe.mq;
import manthe.my;
import manthe.o7;
import manthe.on;
import manthe.p;
import manthe.pd;
import manthe.qN;
import manthe.qp;
import manthe.rl;
import manthe.s6;
import manthe.vn;
import manthe.yI;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class sk
extends qp
implements p,
s6,
Be {
    private static final double J = 0.8;
    private final sk F;
    private final qN G;
    private final double I;
    private final double O;
    private final String S;
    private final String M;
    private final boolean P;
    private final String V;
    private final double T;
    private rl W;
    private double Q = 1.0;
    private double H = 0.0;
    private double X = 0.0;
    private boolean U = false;
    private int L = 0;
    private boolean Z = false;
    private double K = 0.0;
    private double N = 0.0;
    private double Y;
    private double R;

    public sk(double d10, double d11, double d12, String string, String string2, String string3) {
        this.I = d10;
        this.O = d11;
        this.T = d12;
        this.S = string2;
        this.M = string;
        this.V = string3;
        this.G = new qN(string);
        if (string3 == null) {
            this.F = this;
            this.P = false;
        } else {
            this.P = true;
            this.W = new rl(string3, my.i, 0.8, false);
            this.W.b(this.r().a(string3) * 0.8);
            this.F = new sk(d10, d11, d12, string, string2, null);
            this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
            this.b(this.W);
            this.b(this.F);
        }
        this.a(new D5(this, 0.0, 0.0, 0.0, 100.0), new vn(this));
        this.a(new Dq(this, 0.0, 0.0, 0.0, 100.0), new mU(this));
        this.e(0.5);
        this.b(Color.green);
        this.a(new Color(110, 110, 110, 70));
    }

    @Override
    public void b(Color color) {
        super.b(color);
        if (this.P) {
            this.F.b(color);
        }
    }

    @Override
    public void c(boolean bl) {
        if (this.x() && !Mouse.isButtonDown((int)0)) {
            this.d(false);
        }
        mq mq2 = on.p.a(0.6f);
        if (this.P) {
            this.W.b(mq2.a(this.V) + this.A() + 3.0);
        }
        if (this.e() && !this.P) {
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            double d10 = this.q() - 3.0;
            double d11 = 3.0;
            double d12 = 1.0;
            double d13 = this.t() - 0.5;
            double d14 = this.t() + d10 - d12;
            double d15 = this.k() + 2.0;
            Color color = Color.BLACK.brighter();
            k9.a(color, (float)d13, (float)d15, "togglefront", (float)d12 * 2.0f, (float)d11, false);
            k9.a(color, (float)d14, (float)d15, "togglefront", (float)d12 * 2.0f, (float)d11, false);
            double d16 = d13 + d12;
            o7.a(color, d16, d15 + d11, d16 + d10 - d12, d15 + d11, d16 + d10 - d12, d15, d16, d15);
            o7.a(this.f(), this.t() + this.V() + d12, d15 + d11, d16 + this.D() - d12, d15 + d11, d16 + this.D() - d12, d15, this.t() + this.V() + d12, d15);
            double d17 = -2.5;
            double d18 = -1.0;
            o7.a(yI.a(this.f(), 80, 150), this.t() + this.D() + this.A() + d17, this.k() + this.A() + this.G(), this.t() + this.D() + this.A() + d18, this.k() + this.A() + this.G(), this.t() + this.D() + this.A() + d18, this.k() + this.A(), this.t() + this.D() + this.A() + d17, this.k() + this.A());
            double d19 = 0.0;
            double d20 = 1.5;
            o7.a(yI.a(this.f(), 80, 150), this.t() + this.V() + this.A() + d19, this.k() + this.A() + this.G(), this.t() + this.V() + this.A() + d20, this.k() + this.A() + this.G(), this.t() + this.V() + this.A() + d20, this.k() + this.A(), this.t() + this.V() + this.A() + d19, this.k() + this.A());
            GL11.glEnable((int)3553);
            String string = this.G.b(this.H);
            mq2.c(string, this.t(), this.k() - this.G() / 2.0 - 1.0, -1);
            String string2 = this.G.b(this.X);
            mq2.c(string2, this.t() + (this.q() - mq2.b(string2)) - 2.0, this.k() - this.G() / 2.0 - 1.0, -1);
            GL11.glDisable((int)3042);
        }
        super.c(bl);
    }

    @Override
    public mq r() {
        return on.p.E();
    }

    @Override
    public void c() {
        super.c();
        if (!this.P) {
            Object object;
            if (this.x()) {
                object = o7.b();
                double d10 = this.t() - this.A();
                double d11 = this.q() - this.A() * 2.0;
                if (this.L == 1) {
                    boolean bl;
                    double d12 = (double)(((Bo)object).a - 1) - d10;
                    double d13 = d12 / d11;
                    double d14 = this.I - this.O;
                    double d15 = d13 * d14 + this.O;
                    double d16 = Math.abs(this.k() - (double)((Bo)object).b);
                    boolean bl2 = bl = this.R == 0.0;
                    if (d16 < 3.0) {
                        d16 = 0.0;
                        this.N = d12;
                        this.Y = 0.0;
                        this.R = d15;
                    }
                    if (d16 != 0.0 && !bl) {
                        double d17 = (50.0 - d16) / 50.0;
                        if (d17 < 0.0) {
                            d17 = 0.01;
                        }
                        d13 = this.N / d11;
                        double d18 = d13 * d14 + this.O;
                        double d19 = d15 - this.R;
                        if (d19 != 0.0) {
                            this.Y += d19 * d17;
                        }
                        this.R = d15;
                        d15 = this.Y + d18;
                    }
                    if (d15 > this.W()) {
                        this.h(this.W());
                    } else if (d15 < this.E()) {
                        this.h(this.E());
                    } else {
                        this.h(d15);
                    }
                } else if (this.L == 2) {
                    boolean bl;
                    double d20 = (double)(((Bo)object).a - 1) - d10;
                    double d21 = d20 / d11;
                    double d22 = this.I - this.O;
                    double d23 = d21 * d22 + this.O;
                    double d24 = Math.abs(this.k() - (double)((Bo)object).b);
                    boolean bl3 = bl = this.R == 0.0;
                    if (d24 < 3.0) {
                        d24 = 0.0;
                        this.N = d20;
                        this.Y = 0.0;
                        this.R = d23;
                    }
                    if (d24 != 0.0 && !bl) {
                        double d25 = (50.0 - d24) / 50.0;
                        if (d25 < 0.0) {
                            d25 = 0.01;
                        }
                        d21 = this.N / d11;
                        double d26 = d21 * d22 + this.O;
                        double d27 = d23 - this.R;
                        if (d27 != 0.0) {
                            this.Y += d27 * d25;
                        }
                        this.R = d23;
                        d23 = this.Y + d26;
                    }
                    if (d23 > this.W()) {
                        this.f(this.W());
                    } else if (d23 < this.E()) {
                        this.f(this.E());
                    } else {
                        this.f(d23);
                    }
                }
            } else {
                this.N = 0.0;
                this.Y = 0.0;
                this.R = 0.0;
            }
            object = (Dy)this.p();
            if (((Dy)object).r().equals(((Dy)object).u())) {
                if (this.L == 2) {
                    this.f(this.z() + this.T);
                } else {
                    this.h(this.F() - this.T);
                }
            }
            this.K = (this.V() + this.D()) / 2.0;
        }
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        if (this.P) {
            this.W.c(d10);
            this.F.c(d10);
        }
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        if (this.P) {
            this.F.b(d10);
        }
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (!this.g()) {
            this.e(false);
        }
        return super.a(n6, n10, n11);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y()) {
            double d10 = this.T;
            double d11 = 10.0 * d10;
            double d12 = 1.0 * d10;
            double d13 = 0.1 * d10;
            if (n6 == 203) {
                if (this.L == 1) {
                    this.h(this.F() - (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? 1.0 : d12)));
                } else {
                    this.f(this.z() - (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? 1.0 : d12)));
                }
                return true;
            }
            if (n6 == 205) {
                if (this.L == 1) {
                    this.h(this.F() + (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? 1.0 : d12)));
                } else {
                    this.f(this.z() + (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? 1.0 : d12)));
                }
                return true;
            }
        }
        return super.a(c3, n6);
    }

    public Double F() {
        if (this.P) {
            return this.F.F();
        }
        return this.H;
    }

    public void h(double d10) {
        if (this.P) {
            this.F.h(manthe.Y.a(d10, this.T));
        } else {
            if (d10 > this.Y()) {
                d10 = this.Y() - this.T;
            } else if (d10 > this.I) {
                d10 = this.I;
            } else if (d10 < this.O) {
                d10 = this.O;
            }
            this.H = manthe.Y.a(d10, this.T);
            this.R();
        }
    }

    public void g(double d10) {
        d10 = manthe.Y.a(d10, this.T);
        if (this.P) {
            this.F.g(d10);
        } else {
            this.H = d10;
        }
        this.R();
    }

    public Double z() {
        if (this.P) {
            return this.F.z();
        }
        return this.X;
    }

    public void f(double d10) {
        if (this.P) {
            this.F.f(manthe.Y.a(d10, this.T));
        } else {
            if (d10 < this.C()) {
                d10 = this.C() + this.T;
            } else if (d10 > this.I) {
                d10 = this.I;
            } else if (d10 < this.O) {
                d10 = this.O;
            }
            this.X = manthe.Y.a(d10, this.T);
        }
        this.R();
    }

    public void i(double d10) {
        d10 = manthe.Y.a(d10, this.T);
        if (this.P) {
            this.F.i(d10);
        } else {
            this.X = d10;
        }
        this.R();
    }

    public double E() {
        return this.O;
    }

    public double W() {
        return this.I;
    }

    @Override
    public boolean x() {
        return this.U && !this.d();
    }

    @Override
    public void d(boolean bl) {
        this.U = bl;
    }

    @Override
    public double A() {
        return this.Q;
    }

    @Override
    public void e(double d10) {
        this.Q = d10;
    }

    @Override
    public boolean y() {
        return this.Z;
    }

    @Override
    public void e(boolean bl) {
        if (this.d()) {
            return;
        }
        this.Z = bl;
    }

    private double G() {
        return this.b() - this.A() * 2.0;
    }

    private double V() {
        return (this.H - this.O) / (this.I - this.O) * this.q();
    }

    private double D() {
        return (this.X - this.O) / (this.I - this.O) * this.q();
    }

    private double C() {
        return this.H;
    }

    private double Y() {
        return this.X;
    }

    public qN B() {
        return this.G;
    }

    public Double[] H() {
        return new Double[]{this.F(), this.z()};
    }

    @Override
    public void a(Ds ds2) {
        if (this.P) {
            this.F.a(ds2);
        }
        super.a(ds2);
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        if (this.P) {
            this.F.b(bl);
        }
    }

    public double X() {
        return this.T;
    }

    static double a(sk sk2) {
        return sk2.K;
    }

    static int a(sk sk2, int n6) {
        sk2.L = n6;
        return sk2.L;
    }
}

