/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.pd;
import manthe.rg;
import manthe.rw;

public class rQ
extends rg {
    private final rw J;

    public rQ(String string, float f10, float f11, float f12) {
        this(string, f10, f11, f12, false);
    }

    public rQ(String string, float f10, float f11, float f12, boolean bl) {
        super(bl);
        this.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.J = new rw(string, f10, false, false);
        this.b(this.J);
        this.J.c(f11);
        this.J.a(f12);
    }

    public rQ(String string, String string2, float f10, float f11, float f12, boolean bl) {
        super(bl);
        this.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.J = new rw(string, f10, false, false);
        this.b(this.J);
        this.J.c(f11);
        this.J.a(f12);
        this.z().a(string2);
        this.b(this.z());
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        if (this.z().E().equalsIgnoreCase("")) {
            this.J.c(d10);
        }
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.J.b(d10);
    }

    public void d(Color color) {
        this.J.d(color);
    }

    public rw x() {
        return this.J;
    }
}

