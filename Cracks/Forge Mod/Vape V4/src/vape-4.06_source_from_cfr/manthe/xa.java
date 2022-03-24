/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.BS;
import manthe.DB;
import manthe.DE;
import manthe.k9;
import manthe.mq;
import manthe.o7;
import manthe.pc;
import manthe.pe;
import manthe.qw;
import manthe.sp;
import manthe.uW;
import manthe.wK;
import manthe.wM;
import manthe.wh;
import manthe.xq;
import org.lwjgl.opengl.GL11;

public class xa
extends wM {
    private boolean G;
    private boolean F;
    private final DB H = DB.a(null, "", false);
    private final wK D = new wK(this.H);
    private final wh A = new wh("newclose");
    private final xq B;
    private final xq z;
    private final xq I;
    private final DE E;
    private final qw C;

    public xa(qw qw2) {
        this.C = qw2;
        this.E = DE.a(null, qw2.i(), qw2.b());
        this.B = new xq(sp.RAINBOW, this.E, "Color", 100.0, 1.0);
        this.B.a((wM)this);
        this.z = new xq(sp.SATURATION, this.E, "", 100.0, 1.0);
        this.I = new xq(sp.VIBRANCE, this.E, "", 100.0, 1.0);
        this.B.c(true);
        this.B.b(99.0);
        this.z.c(true);
        this.z.b(99.0);
        this.I.c(true);
        this.I.b(99.0);
        this.B.a(xa.b.m);
        this.z.a(xa.b.m);
        this.I.a(xa.b.m);
        this.H.a((Boolean)qw2.a());
        this.D.c(new BS(this, qw2));
        qw2.a(this.E.s());
        this.a(this.D, this.A, this.B, this.z, this.I);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        String string = this.C.i();
        double d10 = mq2.a(string);
        double d11 = 18.0;
        double d12 = this.f() - 3.0;
        Color color = this.l() ? xa.b.r : xa.b.r;
        pe.a(this.d() + 5.0 - 0.5, this.c() + 1.0 - 0.5, this.e() - 10.0 + 1.0, d12 - 2.0 + 1.0, this.C.b());
        pe.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, d12 - 2.0, xa.b.m);
        k9.a(Color.WHITE, (float)this.d() + 10.0f, (float)(this.c() + 10.0) - 2.0f, this.F ? "upcollapse" : "downexpand", 2.0f, 2.0f, false);
        double d13 = this.d() + this.e() - 30.0;
        double d14 = this.c() + d11 / 2.0 - d10 / 2.0;
        o7.a(this.d(), this.c(), d13 - this.d(), d11);
        mq2.a(string, this.d() + 15.0 + 8.0, d14, color);
        GL11.glDisable((int)3089);
        double d15 = mq2.a(string);
        double d16 = d13;
        double d17 = d16 - 10.0;
        double d18 = d14 - 2.0;
        double d19 = d18 + d15 + 2.0;
        o7.a(new Color(xa.b.m.getRed(), xa.b.m.getGreen(), xa.b.m.getBlue(), 0), xa.b.m, d16, d19, d16, d18, d17, d18, d17, d19);
        this.A.c(this.d() + this.e() - 10.0 - 8.0);
        this.A.a(this.c());
        this.A.d(d11);
        this.D.e(false);
        this.D.c(d13);
        this.D.a(this.c());
        this.D.b(12.0);
        this.D.d(d11);
        this.D.c(true);
        this.B.a(this.F);
        this.z.a(this.F);
        this.I.a(this.F);
        this.B.c(this.d() + 6.0);
        this.z.c(this.d() + 6.0);
        this.I.c(this.d() + 6.0);
        this.B.a(this.c() + 18.0);
        this.z.a(this.c() + 40.0);
        this.I.a(this.c() + 65.0);
        this.C.a(this.E.s());
    }

    public xa a(pc pc2) {
        this.A.c(pc2);
        return this;
    }

    public void f(boolean bl) {
        this.D.f(bl);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.G && !this.x()) {
            this.G = false;
        }
    }

    @Override
    public void a(uW uW2) {
        if ((double)uW2.b() > this.c() + 20.0 - 2.0) {
            return;
        }
        this.F = !this.F;
        this.F().M();
    }

    @Override
    public void i() {
        this.G = true;
    }

    public boolean l() {
        return this.D.T();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return (this.F ? 95.0 : 18.0) + 3.0;
    }

    static DB a(xa xa2) {
        return xa2.H;
    }
}

