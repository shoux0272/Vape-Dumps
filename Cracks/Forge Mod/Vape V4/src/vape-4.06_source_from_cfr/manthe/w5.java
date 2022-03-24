/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Bo;
import manthe.DU;
import manthe.DX;
import manthe.g;
import manthe.k9;
import manthe.mq;
import manthe.o7;
import manthe.pb;
import manthe.pe;
import manthe.tR;
import manthe.uW;
import manthe.wM;
import manthe.zu;

public class w5<T>
extends wM {
    private List<T> H = new ArrayList<T>();
    private List<tR> C = new ArrayList<tR>();
    private T z;
    private String G;
    private boolean E;
    private g I;
    private boolean A;
    private float B;
    private DX F;
    private static int D;

    public w5(String string, T ... arrT) {
        this.I = new g(0.15, w5.b.y, w5.b.f);
        this.A = false;
        this.B = 2.0f;
        this.G = string;
        Collections.addAll(this.H, arrT);
    }

    public w5(DX dX2) {
        this(dX2.H(), (Object[])dX2.u());
        this.F = dX2;
        this.a((Object)dX2);
    }

    @Override
    public void a() {
        this.o();
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.G);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - (double)(this.B / 2.0f);
        Color color = w5.b.k;
        if (this.A) {
            double d13 = this.f() - 5.0 + (d10 + 5.0) * (double)this.H.size();
            pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, d13 - 1.0, color, false, 3.0f, 1.0f);
            pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, d13, this.I.q(), 3.0f, 0.75f, 1.0f);
            Bo bo2 = o7.b();
            for (int k = 0; k < this.H.size(); ++k) {
                double d14 = d11 + (d10 + 5.0) * (double)(k + 1);
                DU dU2 = new DU(this.d() + 5.0 + 0.5, d14 - 2.5, this.e() - 10.0 - 1.0, d10 + 5.0);
                if (dU2.a(bo2)) {
                    pe.c(dU2.a(), dU2.b(), dU2.d(), dU2.c(), w5.b.m);
                }
                mq2.a(this.H.get(k).toString(), this.d() + 10.0, d14, w5.b.r);
            }
        } else {
            pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color, false, 3.0f, 1.0f);
            pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.I.q(), 3.0f, 0.75f, 1.0f);
        }
        if (this.A) {
            mq2.a(this.F.v().toString(), this.d() + 10.0, d11, w5.b.r);
        } else {
            mq2.a(this.G + " - " + this.F.v().toString(), this.d() + 10.0, d11, w5.b.r);
        }
        k9.a(w5.b.o, (float)(this.d() + this.e()) - 15.0f, (float)d12, this.A ? "upcollapse" : "downexpand", this.B, this.B, false);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.E && !this.x() && !this.A) {
            this.I.c();
            this.E = false;
        }
    }

    @Override
    public void a(uW uW2) {
        boolean bl = this.A = !this.A;
        if (this.A) {
            zu.W = this;
        } else {
            mq mq2 = this.e(0.9);
            double d10 = mq2.a(this.G);
            double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
            for (int k = 0; k < this.H.size(); ++k) {
                double d12 = d11 + (d10 + 5.0) * (double)(k + 1);
                DU dU2 = new DU(this.d() + 5.0 + 0.5, d12 - 2.5, this.e() - 10.0 - 1.0, d10 + 5.0);
                if (!dU2.b(uW2.a(), uW2.b())) continue;
                this.z = this.H.get(k);
                if (this.F == null) continue;
                this.F.d();
                this.F.a(pb.a(this.F, this.z.toString()));
                for (tR tR2 : this.C) {
                    tR2.a();
                }
                if (this.F.t().size() <= 0) continue;
                this.F().M();
            }
            zu.W = null;
        }
    }

    @Override
    public void i() {
        if (!this.E) {
            this.I.c();
        }
        this.E = true;
    }

    public w5<T> a(tR tR2) {
        this.C.add(tR2);
        return this;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public void a(T t2) {
        this.J().add(t2);
    }

    public void a(T ... arrT) {
        Collections.addAll(this.J(), arrT);
    }

    public String K() {
        return this.G;
    }

    public T n() {
        return this.z;
    }

    public List<T> J() {
        return this.H;
    }

    public static void b(int n6) {
        D = n6;
    }

    public static int l() {
        return D;
    }

    public static int m() {
        int n6 = w5.l();
        if (n6 == 0) {
            return 51;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (w5.l() != 0) {
            w5.b(108);
        }
    }
}

