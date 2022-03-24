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
import manthe.B4;
import manthe.Be;
import manthe.Bo;
import manthe.D7;
import manthe.Ds;
import manthe.Y;
import manthe.k9;
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
import manthe.yI;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class sV
extends qp
implements p,
s6,
Be {
    protected static final double T = 0.75;
    protected final double I;
    protected final double R;
    protected final double V;
    protected final String H;
    protected final String O;
    protected final String W;
    protected sV F;
    protected boolean S;
    protected rl M;
    protected double P = 0.5;
    protected double K = 0.0;
    protected boolean J = false;
    protected boolean X = true;
    private boolean N = false;
    private qN Q;
    private double L = 0.0;
    private double G;
    private double U;

    public sV(double d10, double d11, double d12, String string, String string2, String string3) {
        this.I = d10;
        this.R = d11;
        this.V = d12;
        this.H = string2;
        this.W = string3;
        this.O = string;
        if (string != null) {
            this.Q = new qN(string);
        }
        if (string3 == null) {
            this.F = this;
            this.S = false;
        } else {
            this.S = true;
            this.M = new rl(string3, my.c, 0.75, false);
            this.M.b(this.r().a(string3) * 0.75);
            this.F = new sV(d10, d11, d12, string, string2, null);
            this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
            this.b(this.M);
            this.b(this.F);
        }
        this.a(null, new B4(this));
        this.b(this.f());
        this.a(new Color(110, 110, 110, 70));
    }

    public sV(double d10, double d11, String string, String string2, String string3) {
        this(d10, d11, 0.1, string, string2, string3);
    }

    @Override
    public void b(Color color) {
        super.b(color);
        if (this.S) {
            this.F.b(color);
        }
    }

    @Override
    public void c(boolean bl) {
        if (this.x() && !Mouse.isButtonDown((int)0)) {
            this.d(false);
        }
        if (this.S) {
            this.M.b(this.r().a(this.W) + 2.0);
        }
        if (this.e() && !this.S && this.X) {
            Object object;
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3008);
            GL11.glDisable((int)3553);
            double d10 = this.q() - 3.0;
            double d11 = 3.0;
            double d12 = 1.0;
            double d13 = this.t() - 0.5;
            double d14 = this.t() + d10 - d12;
            double d15 = this.k() + 2.0;
            Color color = Color.BLACK.brighter();
            k9.a(color, (float)d13, (float)d15, "circle", 2.0f, 3.0f, false);
            k9.a(color, (float)d14, (float)d15, "togglefront", (float)d12 * 2.0f, (float)d11, false);
            double d16 = d13 + d12;
            o7.a(color, d16, d15 + d11, d16 + d10 - d12, d15 + d11, d16 + d10 - d12, d15, d16, d15);
            double d17 = -2.5;
            if (this.G() <= 1.0) {
                d17 = 0.0;
            } else if (this.G() >= 1.0 && this.G() <= 3.0) {
                d17 = -0.5;
            } else if (this.G() >= 3.0 && this.G() <= 5.0) {
                d17 = -1.0;
            } else if (this.G() >= 5.0 && this.G() <= 7.0) {
                d17 = -1.5;
            }
            o7.a(this.f(), d16, d15 + d11, d16 + this.G() - d12, d15 + d11, d16 + this.G() - d12, d15, d16, d15);
            Color color2 = this.f();
            Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 255);
            k9.a(color3, (float)d13, (float)d15, "circle", 2.0f, 3.0f, false);
            d14 = this.t() + this.G() + this.A() + d17 - 1.0;
            k9.a(this.f(), (float)d14, (float)d15, "togglefront", (float)d12 * 2.0f, (float)d11, false);
            if (this.y()) {
                object = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 150);
                k9.a((Color)object, (float)d14 - 1.5f, (float)d15 - 2.0f, "circle", 7.0f, 7.0f, false);
            }
            k9.a(yI.a(this.f(), 80, 240), (float)d14 - 1.0f, (float)d15 - 1.5f, "circle", 6.0f, 6.0f, false);
            GL11.glEnable((int)3553);
            object = "";
            if (this.Q != null) {
                object = this.O.isEmpty() ? (int)this.K + "" : this.Q.b(this.K);
                object = (String)object + this.H;
            }
            mq mq2 = on.p.a(0.75);
            mq2.c((String)object, this.t() + (this.q() - mq2.b((String)object)) - 2.0, this.k() - this.z() + 1.0, -1);
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
        if (this.x() && !this.S) {
            boolean bl;
            Bo bo2 = o7.b();
            double d10 = this.t() - this.A();
            double d11 = this.q() - this.A() * 2.0;
            double d12 = (double)bo2.a - d10;
            double d13 = d12 / d11;
            double d14 = Math.abs(this.k() - (double)bo2.b);
            double d15 = this.I - this.R;
            double d16 = Y.a(d13 * d15 + this.R, this.V);
            boolean bl2 = bl = this.U == 0.0;
            if (d14 < 3.0) {
                d14 = 0.0;
                this.L = d12;
                this.G = 0.0;
                this.U = d16;
            }
            if (d14 != 0.0 && !bl) {
                double d17 = (50.0 - d14) / 50.0;
                if (d17 < 0.0) {
                    d17 = 0.01;
                }
                d13 = this.L / d11;
                double d18 = Y.a(d13 * d15 + this.R, this.V);
                double d19 = d16 - this.U;
                if (d19 != 0.0) {
                    this.G += d19 * d17;
                }
                this.U = d16;
                d16 = this.G + d18;
            }
            if (d16 > this.I) {
                this.f(this.I);
            } else if (d16 < this.R) {
                this.f(this.R);
            } else {
                this.f(d16);
            }
        } else {
            this.L = 0.0;
            this.G = 0.0;
            this.U = 0.0;
        }
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        if (this.S) {
            this.M.c(d10);
            this.F.c(d10);
        }
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        if (this.S) {
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

    public Double B() {
        if (this.S) {
            return this.F.B();
        }
        return this.K;
    }

    public void f(double d10) {
        d10 = Y.a(d10, this.V);
        if (this.S) {
            this.F.f(d10);
        } else {
            if (d10 > this.I) {
                d10 = this.I;
            } else if (d10 < this.R) {
                d10 = this.R;
            }
            this.K = d10;
        }
        this.R();
    }

    public void g(double d10) {
        d10 = Y.a(d10, this.V);
        if (this.S) {
            this.F.g(d10);
        } else {
            this.K = d10;
        }
    }

    @Override
    public boolean x() {
        return this.J && !this.d();
    }

    @Override
    public void d(boolean bl) {
        this.J = bl;
    }

    @Override
    public double A() {
        return this.P;
    }

    @Override
    public void e(double d10) {
        this.P = d10;
    }

    protected double z() {
        return this.b() - this.A() * 2.0;
    }

    protected double G() {
        return (this.K - this.R) / (this.I - this.R) * this.q();
    }

    public double C() {
        return this.I;
    }

    public double D() {
        return this.R;
    }

    @Override
    public boolean y() {
        if (this.d()) {
            return false;
        }
        if (this.S) {
            return this.F.y();
        }
        return this.N;
    }

    @Override
    public void e(boolean bl) {
        if (this.S) {
            this.F.e(bl);
        } else {
            this.N = bl;
        }
    }

    @Override
    public boolean a(char c3, int n6) {
        double d10 = 1.0;
        if (this.Q != null && this.Q.a() == 2) {
            d10 = 0.1;
        }
        double d11 = 10.0 * d10;
        double d12 = 1.0 * d10;
        double d13 = 0.1 * d10;
        if (this.y()) {
            if (n6 == 203) {
                this.f(this.B() - (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? d13 : d12)));
                return true;
            }
            if (n6 == 205) {
                this.f(this.B() + (Keyboard.isKeyDown((int)29) ? d11 : (Keyboard.isKeyDown((int)42) ? d13 : d12)));
                return true;
            }
        }
        return super.a(c3, n6);
    }

    public String F() {
        return this.H;
    }

    public String E() {
        return this.O;
    }

    @Override
    public void a(Ds ds2) {
        super.a(ds2);
        if (this.S) {
            this.F.a(ds2);
        }
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        if (this.S) {
            this.F.b(bl);
        }
    }
}

