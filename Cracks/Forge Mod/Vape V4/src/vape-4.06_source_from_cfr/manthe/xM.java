/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.CV;
import manthe.k9;
import manthe.mq;
import manthe.pc;
import manthe.uW;
import manthe.we;
import manthe.wh;
import manthe.xg;

public class xM
extends xg {
    private float F;
    private String D;
    private String C;
    private wh B = new wh("newclose", 1.5);
    private pc E;

    public xM(we we2, String string, String string2, double d10) {
        super(we2);
        this.F = (float)d10;
        this.D = string;
        this.C = string2;
        this.B.c(new CV(this, we2));
        this.a(this.B);
    }

    public xM(we we2, String string, String string2) {
        this(we2, string, string2, 1.0);
    }

    public xM a(pc pc2) {
        this.E = pc2;
        return this;
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        Color color = xM.b.c;
        double d10 = mq2.a(this.C);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        if (this.D != null) {
            double d12 = this.c() + this.f() / 2.0 - (double)(8.0f * this.F / 2.0f);
            mq2.a(this.C, this.d() + 10.0 + 8.0, d11, color);
            k9.a(color, (float)this.d() + 5.0f, (float)d12, this.D, 8.0f * this.F, 8.0f * this.F, false);
        } else {
            mq2.a(this.C, this.d() + 5.0, d11, color);
        }
        this.B.c(this.d() + this.e() - 7.5 - 8.0);
        this.B.a(this.c());
        this.B.d(this.f());
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

    public wh n() {
        return this.B;
    }

    static pc a(xM xM2) {
        return xM2.E;
    }
}

