/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DC;
import manthe.cj;
import manthe.mq;
import manthe.pe;
import manthe.sk;
import manthe.xH;
import manthe.xc;
import manthe.zu;

public class xS
extends xH {
    private xc R;
    private DC Q;

    public xS(xc xc2, DC dC2) {
        this.R = xc2;
        this.Q = dC2;
        this.I.a(false);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.75);
        String string = this.S() ? this.N() : this.U();
        mq2.a(string, this.d() + (this.l() - mq2.b(string)), this.c(), xS.b.r);
        if (this.J()) {
            this.J = string.length();
            this.a(mq2, this.d() + this.l(), this.c());
        }
        pe.c(this.d(), this.c() + mq2.a(string) + 2.0, this.e(), 1.0, this.T());
    }

    @Override
    public void Q() {
        try {
            double d10 = Double.parseDouble(this.N());
            switch (cj.a[this.Q.ordinal()]) {
                case 1: {
                    if (d10 > ((sk)this.R.K().c()).z()) {
                        ((sk)this.R.K().c()).g(((sk)this.R.K().c()).z());
                        ((sk)this.R.K().c()).i(d10);
                        break;
                    }
                    ((sk)this.R.K().c()).g(d10);
                    break;
                }
                case 2: {
                    if (d10 < ((sk)this.R.K().c()).F()) {
                        ((sk)this.R.K().c()).i(((sk)this.R.K().c()).F());
                        ((sk)this.R.K().c()).g(d10);
                        break;
                    }
                    ((sk)this.R.K().c()).i(d10);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        zu.W = null;
    }

    @Override
    public void R() {
        this.c(this.U());
    }

    public String U() {
        switch (cj.a[this.Q.ordinal()]) {
            case 1: {
                return this.R.K().r();
            }
            case 2: {
                return this.R.K().u();
            }
        }
        return null;
    }
}

