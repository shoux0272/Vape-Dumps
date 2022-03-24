/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.k9;
import manthe.rg;

public class rG
extends rg {
    private final String K;
    private final float N;
    private final float J;
    private final float L;
    private Color M = Color.WHITE;

    public rG(String string, float f10, float f11, float f12, boolean bl) {
        super(bl);
        this.K = string;
        this.N = f10;
        this.J = f11;
        this.L = f12;
        this.c(f10);
        this.b(f11);
    }

    public rG(String string, float f10, float f11, float f12) {
        this(string, f10, f11, f12, true);
    }

    @Override
    public void c(boolean bl) {
        if (!this.e()) {
            return;
        }
        super.c(bl);
        float f10 = this.L;
        float f11 = (float)((this.q() - (double)(this.N * f10)) / 2.0);
        float f12 = (float)((this.b() - (double)(this.J * f10)) / 2.0);
        k9.a(this.M, (float)this.t() + f11, (float)this.k() + f12, this.K, this.N * f10, this.J * f10, false);
    }

    public void d(Color color) {
        this.M = color;
    }
}

