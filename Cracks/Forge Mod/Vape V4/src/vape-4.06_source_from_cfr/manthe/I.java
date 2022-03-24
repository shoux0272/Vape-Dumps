/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.ke;
import manthe.oA;

public abstract class I {
    float c;
    float f;
    float b = 3.0f;
    float e = 1.0f;
    private boolean a;
    private static String d;

    public void b() {
        if (ds.x().d()) {
            return;
        }
        boolean bl = this.f();
        boolean bl2 = this.d();
        if (bl && bl2) {
            this.a = true;
        }
    }

    public void a(ke ke2) {
        float f10 = ds.s().r();
        int n6 = (int)this.c;
        int n10 = (int)(-this.f);
        float f11 = f10 * 0.6f + 0.2f;
        float f12 = f11 * f11 * f11 * 8.0f;
        float f13 = (float)n6 * f12;
        float f14 = (float)n10 * f12;
        oA.b(f13, f14);
        this.c = 0.0f;
        this.f = 0.0f;
    }

    public abstract boolean f();

    public abstract boolean d();

    public boolean e() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public I a(float f10) {
        this.b = f10;
        return this;
    }

    public float a() {
        return this.e;
    }

    public I b(float f10) {
        this.e = f10;
        return this;
    }

    public static void b(String string) {
        d = string;
    }

    public static String c() {
        return d;
    }

    static {
        if (I.c() == null) {
            I.b("svfEpc");
        }
    }
}

