/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DE;
import manthe.k9;
import manthe.pe;
import manthe.sp;
import manthe.uH;
import manthe.uW;
import manthe.wM;
import manthe.wV;
import manthe.xn;
import manthe.xq;
import manthe.xu;

public class xC
extends wM {
    private boolean E = true;
    private DE A;
    private xu C;
    private xq B;
    private xq F;
    private xq z;
    private wV D = new wV("", 0.3);

    public xC(DE dE2) {
        this.A = dE2;
        this.a(dE2);
        this.C = new xu("GUI Theme", dE2, new Color[]{new Color(250, 50, 56), new Color(242, 99, 33), new Color(252, 179, 22), xC.b.i, new Color(47, 122, 229), new Color(126, 84, 217), new Color(232, 96, 152)});
        this.B = new xq(this.C);
        this.F = new xq(sp.SATURATION, dE2);
        this.z = new xq(sp.VIBRANCE, dE2);
        this.C.a(this.I());
        this.B.a(xC.b.u);
        this.F.a(xC.b.u);
        this.z.a(xC.b.u);
        this.C.a((xn)null);
        this.B.a("Double click for rainbow");
        this.F.a((xn)null);
        this.z.a((xn)null);
        this.D.c(new uH(this));
        this.a(this.D, this.C, this.B, this.F, this.z);
    }

    @Override
    public void a() {
        this.C.c(this.d());
        this.C.a(this.c());
        this.D.c(this.d() + this.C.N() + 5.0);
        this.D.a(this.c() + 2.5);
        this.D.d(this.C.f() / 2.0);
        this.D.b(this.E ? "downexpand" : "upcollapse");
        k9.a((Color)this.A.K(), (float)(this.d() + this.e() - 5.0 - 6.0), (float)this.c() + 5.0f, "colorpreview", 6.0f, 6.0f, false);
        if (this.E) {
            this.B.a(false);
            this.F.a(false);
            this.z.a(false);
        } else {
            float f10 = 7.0f;
            double d10 = this.C.Y().a() - (double)(f10 / 2.0f);
            double d11 = this.c() + this.C.f() + 2.5 + 3.0;
            double d12 = d10 + (double)f10;
            double d13 = d11 - 3.0;
            double d14 = d10 + (double)(f10 * 2.0f);
            double d15 = d11;
            pe.a(d10, d11, d12, d13, d14, d15, xC.b.u);
            this.B.a(true);
            this.B.c(this.d());
            this.B.a(this.c() + 20.0 + 5.0);
            this.F.a(true);
            this.F.c(this.d());
            this.F.a(this.c() + 40.0 + 10.0);
            this.z.a(true);
            this.z.c(this.d());
            this.z.a(this.c() + 60.0 + 15.0);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.C.f(false);
        this.C.M();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.E ? 25.0 : 100.0;
    }

    public void l() {
        this.C.L();
    }

    static boolean a(xC xC2, boolean bl) {
        xC2.E = bl;
        return xC2.E;
    }

    static boolean a(xC xC2) {
        return xC2.E;
    }
}

