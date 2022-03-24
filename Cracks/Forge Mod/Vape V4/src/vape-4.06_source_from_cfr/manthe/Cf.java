/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.nc;

class Cf {
    private Color c;
    private double a = 1.0;
    private boolean b;

    private Cf(Color color) {
        this.c = color;
    }

    public Color c() {
        return this.c;
    }

    public void a(Color color) {
        this.c = color;
    }

    public double a() {
        return this.a;
    }

    public void a(double d10) {
        this.a = d10;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    Cf(Color color, nc nc2) {
        this(color);
    }
}

