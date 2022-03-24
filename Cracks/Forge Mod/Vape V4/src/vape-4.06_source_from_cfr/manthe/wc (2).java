/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.nio.IntBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Bo;
import manthe.By;
import manthe.DU;
import manthe.c2;
import manthe.o7;
import manthe.pe;
import manthe.uW;
import manthe.wM;
import manthe.x2;
import manthe.xg;
import manthe.zu;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class wc
extends wM {
    public double K = 300.0;
    private x2 A;
    protected boolean H;
    private DU B;
    private By G;
    private double C;
    protected DU F;
    private boolean z;
    private boolean E;
    private Bo L;
    private boolean I;
    private xg D;
    private static int J;

    public wc() {
        this.A = new x2(wc.b.y);
        this.G = new By(this);
        this.F = new DU(0.0, 0.0, 0.0, 0.0);
        this.E = true;
    }

    public abstract void V();

    public abstract void K();

    public abstract void S();

    @Override
    public void a() {
        this.V();
    }

    @Override
    public void C() {
        int n6;
        this.H = this.f() > this.K;
        this.a();
        if (this.B == null) {
            this.f(this.H);
        }
        int n10 = n6 = this.H && this.D != null ? 3 : 0;
        if (this.H) {
            if (this.B != null) {
                o7.a(this.B.a(), this.B.b(), this.B.d(), this.B.c());
            } else {
                o7.a(this.d(), this.c() + (double)n6, this.e(), this.K - (double)n6);
            }
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
            GL11.glGetInteger((int)3088, (IntBuffer)intBuffer);
        }
        if (!this.b()) {
            return;
        }
        if (this.B != null) {
            this.f(this.H);
        }
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.C();
        }
        if (this.P() != 0.0 && this.H && this.D != null) {
            pe.a(this.D.d(), this.D.c() + (double)n6, this.D.e(), this.D.f() - (double)n6, this.I());
            pe.c(this.D.d(), this.D.c(), this.D.e(), this.D.f(), this.I());
            this.D.C();
            this.A.c(this.d());
            this.A.a(this.D.c() + this.D.f());
            this.A.C();
        }
        if (this.H) {
            GL11.glDisable((int)3089);
            this.N();
            double d10 = this.D != null ? this.D.f() : 0.0;
            double d11 = this.c() + d10 - this.C / this.f() * (this.K - d10);
            double d12 = (this.K - d10) / this.f() * this.K;
            this.F = new DU(this.d() + this.e() - 3.0, d11, 2.0, d12);
            if (zu.W != null) {
                for (wM wM3 : this.w()) {
                    if (!zu.W.equals(wM3)) continue;
                    return;
                }
            }
            this.Z();
        }
    }

    public void Z() {
        pe.a(this.F.a(), this.F.b(), this.F.d(), this.F.c(), wc.b.y, false, 1.0f, 0.5f);
    }

    private void N() {
        if (!this.z) {
            return;
        }
        if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
            this.z = false;
            return;
        }
        Bo bo2 = o7.b();
        double d10 = bo2.b - this.L.b;
        this.L = bo2;
        this.h(this.C - (d10 *= this.f() / this.K));
    }

    @Override
    public void k() {
        this.K();
    }

    public void f(boolean bl) {
        pe.a(this.d(), this.c(), this.e(), bl ? this.K + 2.0 : this.f() + 2.0, this.I(), this.Y() != null, 2.0f, 1.0f);
    }

    @Override
    public void j() {
        this.S();
    }

    @Override
    public void i() {
    }

    @Override
    public void E() {
        Bo bo2;
        int n6 = Mouse.getDWheel();
        if (n6 != 0) {
            this.h(this.P() + (double)(n6 / 24));
        }
        if (this.F.a(bo2 = o7.b())) {
            return;
        }
        super.E();
    }

    @Override
    public void b(uW uW2) {
        if (this.F.b(uW2.a(), uW2.b())) {
            this.L = o7.b();
            this.z = true;
            return;
        }
        super.b(uW2);
    }

    @Override
    public DU q() {
        if (this.H) {
            return new DU(this.d(), this.c(), this.e(), this.L());
        }
        return new DU(this.d(), this.c(), this.e(), this.f());
    }

    public void M() {
        this.W().k();
        this.W().a();
        this.h(this.P());
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wc)) continue;
            ((wc)wM2).M();
        }
    }

    public void a(wM wM2, Object ... arrobject) {
        wM2.a(this);
        this.G.a(wM2, arrobject);
        this.M();
    }

    @Override
    public void a(wM ... arrwM) {
        for (wM wM2 : arrwM) {
            this.a(wM2, new Object[0]);
        }
    }

    public void a(wM wM2) {
        this.G.b(wM2);
        this.M();
    }

    public void J() {
        CopyOnWriteArrayList<wM> copyOnWriteArrayList = new CopyOnWriteArrayList<wM>(this.w());
        for (wM wM2 : copyOnWriteArrayList) {
            if (wM2 instanceof xg) continue;
            this.a(wM2);
        }
    }

    public void R() {
        CopyOnWriteArrayList<wM> copyOnWriteArrayList = new CopyOnWriteArrayList<wM>(this.w());
        for (wM wM2 : copyOnWriteArrayList) {
            this.a(wM2);
        }
    }

    public void a(xg xg2) {
        this.D = xg2;
        this.a((wM)xg2, "wrap");
    }

    public xg Y() {
        return this.D;
    }

    public By W() {
        return this.G;
    }

    @Override
    public List<wM> w() {
        return this.G.b();
    }

    public double P() {
        return this.C;
    }

    public void a(By by) {
        this.G = by;
    }

    public void i(boolean bl) {
        this.I = bl;
    }

    public void g(boolean bl) {
        this.H = bl;
    }

    public void a(DU dU2) {
        this.B = dU2;
    }

    public void h(double d10) {
        if (zu.W != null || this.f() < this.K || !this.E) {
            return;
        }
        this.f(d10);
    }

    public void f(double d10) {
        if (d10 > 0.0) {
            d10 = 0.0;
        }
        if (d10 < -(this.f() - this.K)) {
            d10 = -(this.f() - this.K);
        }
        this.C = d10;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg) continue;
            wM2.a(this.W().i().get(wM2).b() + d10);
        }
    }

    public DU Q() {
        return this.F;
    }

    public double L() {
        return this.K;
    }

    public void g(double d10) {
        this.K = d10;
    }

    public void h(boolean bl) {
        this.E = bl;
    }

    public boolean U() {
        return this.H;
    }

    public boolean O() {
        return this.I;
    }

    public static void b(int n6) {
        J = n6;
    }

    public static int X() {
        return J;
    }

    public static int T() {
        int n6 = wc.X();
        if (n6 == 0) {
            return 38;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (wc.X() == 0) {
            wc.b(89);
        }
    }
}

