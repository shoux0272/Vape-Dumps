/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.As;
import manthe.DB;
import manthe.mq;
import manthe.pe;
import manthe.wK;
import manthe.wM;
import manthe.zu;

public class wf
extends wK {
    private String T;
    private int U;
    private Class S;

    public wf(String string, String string2, double d10, int n6) {
        super(string, d10);
        this.T = string2;
        this.U = n6;
        this.g(true);
    }

    public wf(String string, String string2) {
        super(string);
        this.T = string2;
        this.g(true);
    }

    public wf(DB dB2, String string) {
        super(dB2);
        this.T = string;
        this.g(true);
    }

    @Override
    protected void S() {
        if (this.S != null && ((wM)zu.b(this.S)).b() != this.T() && !this.P()) {
            this.N();
        }
        super.S();
    }

    @Override
    protected void R() {
        mq mq2 = this.e(this.E);
        double d10 = mq2.a(this.I);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        pe.a(this.T, this.d() + 5.0 + 4.0, this.c() + this.f() / 2.0, (double)this.U, (double)this.U, this.L);
        mq2.a(this.I, this.d() + (double)this.U + 10.0, d11, this.L);
    }

    @Override
    public double h() {
        return 20.0;
    }

    public void a(Class class_) {
        this.S = class_;
        this.c(new As(this, class_));
    }
}

