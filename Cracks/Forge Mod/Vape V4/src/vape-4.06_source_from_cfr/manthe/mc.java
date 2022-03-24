/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.d0;
import manthe.ds;
import manthe.mq;

public class mc
extends mq {
    public mc(String string, int n6) {
        super(null, n6);
        a.mfv2(this.b(), n6, string);
    }

    @Override
    public void a(String string, double d10, double d11, int n6, boolean bl) {
        d0 d02 = ds.p();
        int n10 = d02.f();
        a.dsv2(this.b(), string, d10 *= (double)n10, d11 *= (double)n10, n6, 1.0f);
    }

    @Override
    public double a(String string) {
        return this.a(string, true);
    }

    @Override
    public double a(String string, boolean bl) {
        d0 d02 = ds.p();
        int n6 = d02.f();
        return a.gshv2(this.b(), string) / (double)n6;
    }

    @Override
    public double b(String string, boolean bl) {
        d0 d02 = ds.p();
        int n6 = d02.f();
        return a.gswv2(this.b(), string) / (double)n6;
    }

    @Override
    public double b(String string) {
        return this.b(string, true);
    }
}

