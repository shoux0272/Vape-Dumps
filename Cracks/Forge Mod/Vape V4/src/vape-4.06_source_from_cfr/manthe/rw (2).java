/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.k9;
import manthe.qp;

public class rw
extends qp {
    private final boolean G;
    private float L;
    private boolean I;
    private String K;
    private float J;
    private float F;
    private Color H = Color.WHITE;

    public rw(String string, float f10, boolean bl) {
        this(string, f10, bl, true);
    }

    public rw(String string, float f10, boolean bl, boolean bl2) {
        this.K = string;
        this.L = f10;
        this.I = bl;
        this.b(Color.WHITE);
        this.G = bl2;
    }

    public rw(String string, float f10) {
        this(string, f10, false);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.e()) {
            k9.a(this.G ? this.f() : this.H, (float)this.t() + this.a(), (float)this.k() + this.x(), this.K, this.L, this.I);
        }
    }

    public float a() {
        return this.J;
    }

    public void c(float f10) {
        this.J = f10;
    }

    public float x() {
        return this.F;
    }

    public void a(float f10) {
        this.F = f10;
    }

    public void d(Color color) {
        this.H = color;
    }

    public void a(String string) {
        this.K = string;
    }

    public void b(float f10) {
        this.L = f10;
    }

    public void d(boolean bl) {
        this.I = bl;
    }
}

