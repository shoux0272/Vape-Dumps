/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgQBEiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg {
    private final float h;
    private final boolean p;
    private final boolean q;
    private String r;
    private float s;
    private float t;
    private Color u = Color.WHITE;

    public iReSqtkUVgQBEiReSqtkUVg(String string, float f, boolean bl) {
        this(string, f, bl, true);
    }

    public iReSqtkUVgQBEiReSqtkUVg(String string, float f, boolean bl, boolean bl2) {
        this.r = string;
        this.h = f;
        this.p = bl;
        this.a(Color.WHITE);
        this.q = bl2;
    }

    public iReSqtkUVgQBEiReSqtkUVg(String string, float f) {
        this(string, f, false);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.h()) {
            iReSqtkUVgMSwiReSqtkUVg.a(this.q ? this.m() : this.u, (float)this.c() + this.D(), (float)this.e_() + this.E(), this.r, this.h, this.p);
        }
    }

    public float D() {
        return this.s;
    }

    public void a(float f) {
        this.s = f;
    }

    public float E() {
        return this.t;
    }

    public void b(float f) {
        this.t = f;
    }

    public void c(Color color) {
        this.u = color;
    }

    public void b(String string) {
        this.r = string;
    }
}

