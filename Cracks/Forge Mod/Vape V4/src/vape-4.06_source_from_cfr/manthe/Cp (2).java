/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.AO;
import manthe.cy;
import manthe.ds;
import manthe.e3;
import manthe.eN;
import manthe.ex;
import manthe.o7;
import org.lwjgl.opengl.GL11;

public class Cp {
    private static boolean d;
    private final eN e;
    private final AO j = new AO();
    public float m;
    public float c;
    public double k;
    public double o;
    public double i;
    private int h = 720;
    private int f = 400;
    private int a = 30;
    private int l;
    private boolean n;
    private boolean b;
    private static cy[] g;

    public Cp() {
        this(false);
    }

    public Cp(boolean bl) {
        this.b = bl;
        this.e = eN.a(this.h, this.f, true);
        this.a();
    }

    public static boolean e() {
        return d;
    }

    public static void c(boolean bl) {
        d = bl;
    }

    protected void b(boolean bl) {
        if (bl) {
            this.e.a(true);
        } else {
            this.e.h();
        }
        d = bl;
    }

    public void f() {
        try {
            if (d || !this.c()) {
                return;
            }
            if (ds.s().w() > 0 || !ds.s().z()) {
                return;
            }
            if (ds.s().f() || ds.s().f()) {
                return;
            }
            if (ds.B().e()) {
                return;
            }
            int n6 = ds.F();
            int n10 = ds.H();
            float f10 = ds.B().U();
            float f11 = ds.B().ag();
            float f12 = ds.B().K();
            float f13 = ds.B().aa();
            boolean bl = ds.s().h();
            int n11 = ds.s().i();
            boolean bl2 = ds.s().q();
            double d10 = ds.B().z();
            double d11 = ds.B().aq();
            double d12 = ds.B().T();
            double d13 = ds.B().l();
            double d14 = ds.B().an();
            double d15 = ds.B().R();
            double d16 = ds.B().g();
            double d17 = ds.B().ap();
            double d18 = ds.B().X();
            float f14 = ds.s().k();
            float f15 = ds.M().g();
            float f16 = ds.M().f();
            ds.B().h(this.k);
            ds.B().a(this.k);
            ds.B().b(this.k);
            ds.B().i(this.o);
            ds.B().j(this.o);
            ds.B().f(this.o);
            ds.B().e(this.i);
            ds.B().g(this.i);
            ds.B().f(this.i);
            ds.c(this.h);
            ds.d(this.f);
            ds.B().i(this.m);
            ds.B().f(this.m);
            ds.B().d(this.c);
            ds.B().e(this.c);
            ds.s().b(0);
            ds.s().c(false);
            ds.s().a(true);
            ds.s().a((float)this.l);
            ds.M().a(1.0f);
            ds.M().b(1.0f);
            this.b(true);
            this.e.j();
            if (this.j.a(this.a)) {
                ds.M().a(ds.O().g(), 0L);
                this.j.d();
            }
            this.b(false);
            ds.c(n6);
            ds.d(n10);
            ds.B().i(f10);
            ds.B().f(f11);
            ds.B().d(f12);
            ds.B().e(f13);
            ds.s().b(n11);
            ds.s().a(bl);
            ds.s().c(bl2);
            ds.B().h(d10);
            ds.B().a(d11);
            ds.B().b(d12);
            ds.B().i(d13);
            ds.B().j(d14);
            ds.B().c(d15);
            ds.B().e(d16);
            ds.B().g(d17);
            ds.B().f(d18);
            ds.s().a(f14);
            ds.M().a(f15);
            ds.M().b(f16);
            this.e.h();
            ds.w().a(true);
            this.n = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private boolean c() {
        return true;
    }

    public void a(boolean bl, double d10, double d11, double d12, double d13) {
        GL11.glEnable((int)2903);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        boolean bl3 = GL11.glIsEnabled((int)2896);
        boolean bl4 = GL11.glIsEnabled((int)3008);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        if (!bl2) {
            e3.p();
        }
        if (bl3) {
            e3.l();
        }
        e3.i();
        e3.f();
        if (bl) {
            this.e.j();
            if (this.b) {
                o7.b(d10, d11, d12, d13);
            }
            this.e.g();
        }
        if (!bl2) {
            e3.j();
        }
        if (bl3) {
            e3.n();
        }
        if (bl4) {
            e3.k();
        }
        if (bl5) {
            e3.r();
        }
    }

    protected void a(ex ex2) {
        this.k = ex2.T() - (ex2.T() - ex2.z()) * (double)ds.O().f();
        this.o = ex2.R() - (ex2.R() - ex2.l()) * (double)ds.O().f();
        this.i = ex2.X() - (ex2.X() - ex2.g()) * (double)ds.O().f();
    }

    protected void b(ex ex2) {
        this.a(ex2);
        this.m = ex2.U();
        this.c = ex2.K();
    }

    public void a() {
        this.e.b(this.h, this.f);
    }

    public int d() {
        return this.h;
    }

    public void d(int n6) {
        this.h = n6;
        this.n = false;
    }

    public int b() {
        return this.f;
    }

    public void c(int n6) {
        this.f = n6;
        this.n = false;
    }

    public boolean g() {
        return this.n;
    }

    public Cp a(boolean bl) {
        this.b = bl;
        return this;
    }

    public void a(int n6) {
        this.a = n6;
    }

    public void b(int n6) {
        this.l = n6;
    }

    public static void b(cy[] arrcy) {
        g = arrcy;
    }

    public static cy[] h() {
        return g;
    }

    static {
        if (Cp.h() != null) {
            Cp.b(new cy[4]);
        }
    }
}

