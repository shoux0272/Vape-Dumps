/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.I;
import manthe.Y;
import manthe.ds;

public class J
extends I {
    public static final float i = -999.0f;
    private final float h;
    private final float g;

    public J(float f10, float f11) {
        this.h = f10;
        this.g = f11;
    }

    @Override
    public boolean f() {
        if (this.h == -999.0f) {
            return true;
        }
        int n6 = (int)Y.a((double)((this.h - ds.k().U()) % 360.0f));
        if ((float)Math.abs(n6) > this.b) {
            this.c = n6 > 0 ? (this.c += this.a()) : (this.c -= this.a());
            return false;
        }
        return true;
    }

    @Override
    public boolean d() {
        if (this.g == -999.0f) {
            return true;
        }
        int n6 = (int)Y.a((double)((this.g - ds.k().K()) % 360.0f));
        if ((float)Math.abs(n6) > this.b) {
            this.f = n6 > 0 ? (this.f += this.a()) : (this.f -= this.a());
            return false;
        }
        return true;
    }
}

