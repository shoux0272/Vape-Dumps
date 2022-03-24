/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import manthe.AA;
import manthe.AO;
import manthe.BV;
import manthe.c2;
import manthe.g;
import manthe.mq;
import manthe.pe;
import manthe.uW;
import manthe.um;
import manthe.wM;
import manthe.wV;
import manthe.zu;
import org.lwjgl.input.Keyboard;

public abstract class x4
extends wM {
    private String z = "";
    private String E;
    private boolean L;
    private boolean B = true;
    protected int J = 0;
    protected g K;
    private Color H;
    protected wV I;
    protected Color G;
    private final AO A;
    private final AO F;
    private List<AA> C;
    private static int[] D;

    public x4(String string) {
        this.K = new g(0.15, x4.b.m, x4.b.y);
        this.H = x4.b.u;
        this.I = new wV("newadd");
        this.G = null;
        this.A = new AO();
        this.F = new AO();
        this.C = new ArrayList<AA>();
        this.E = string;
        this.I.c(new um(this));
        this.a(new BV(this));
        this.a(this.I);
    }

    public abstract void Q();

    public void K() {
        boolean bl;
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.O());
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        String string = this.N();
        boolean bl2 = bl = this.J() && this.B;
        if (!(this.N() != null && this.N().length() >= 1 || bl)) {
            string = this.O();
        }
        if (string == null) {
            string = "";
        }
        mq2.a(string, this.d() + 10.0, d11, x4.b.c);
        if (bl) {
            if (this.J > string.length()) {
                this.J = string.length();
            }
            if (this.J < 0) {
                this.J = 0;
            }
            double d12 = mq2.b(string.substring(0, this.J));
            this.a(this.e(1.2), this.d() + 10.0 + d12, this.c() + this.f() / 2.0 - mq2.a(this.O()) / 2.0);
        }
        if (bl && Keyboard.isKeyDown((int)14) && this.M().a(100L)) {
            this.M().d();
        }
    }

    public void a(mq mq2, double d10, double d11) {
        if (!this.P().a(500L)) {
            mq2.a("|", d10, d11, x4.b.r);
        }
        if (this.P().a(1000L)) {
            this.P().d();
        }
    }

    public boolean L() {
        return this.N().replaceAll(" ", "").length() > 0;
    }

    @Override
    public void a() {
        this.o();
        this.I.d(this.G != null ? this.G : b.e());
        this.I.c(this.d() + this.n() - 10.0 - 8.0);
        this.I.a(this.c());
        this.I.d(this.f());
        this.I.b(8.0);
        pe.a(this.d() + 5.0, this.c() + 2.5, this.n() - 10.0, this.f() - 5.0, this.K.q());
        pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.n() - 10.0 - 1.0, this.f() - 5.0 - 1.0, this.H);
        this.K();
    }

    @Override
    public void j() {
        if (this.L && !this.x() && !this.J()) {
            this.K.c();
            this.L = false;
        }
    }

    @Override
    public void i() {
        if (!this.L) {
            this.K.c();
        }
        this.L = true;
    }

    @Override
    public void a(uW uW2) {
        if (uW2.c().equals((Object)c2.RIGHT_CLICK)) {
            this.c("");
        }
        zu.W = zu.W != null && !this.q().b(uW2.a(), uW2.b()) ? null : this;
    }

    @Override
    public void k() {
    }

    public double l() {
        return this.n() - 25.0;
    }

    public double n() {
        return this.e();
    }

    public AO M() {
        return this.F;
    }

    public AO P() {
        return this.A;
    }

    public boolean J() {
        return zu.W != null && zu.W.equals(this);
    }

    public String N() {
        return this.z;
    }

    public String O() {
        return this.E;
    }

    public void c(String string) {
        this.z = string;
    }

    public void b(String string) {
        this.E = string;
    }

    public void b(Color color) {
        this.H = color;
    }

    public void f(boolean bl) {
        this.B = bl;
    }

    public static void b(int[] arrn) {
        D = arrn;
    }

    public static int[] m() {
        return D;
    }

    static {
        if (x4.m() == null) {
            x4.b(new int[1]);
        }
    }
}

