/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Y;
import manthe.g1;
import manthe.gg;

public class bH {
    private final int c;
    private final int b;
    private final int a;
    private static String d;

    public bH(int n6, int n10, int n11) {
        this.c = n6;
        this.b = n10;
        this.a = n11;
    }

    public bH(double d10, double d11, double d12) {
        this(Y.c(d10), Y.c(d11), Y.c(d12));
    }

    public static bH a(g1 g12) {
        return new bH(g12.h(), g12.f(), g12.g());
    }

    public int d() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public bH a(gg gg2) {
        return new bH(this.d() + gg2.i(), this.c() + gg2.j(), this.a() + gg2.k());
    }

    public bH a(int n6, int n10, int n11) {
        return new bH(this.d() + n6, this.c() + n10, this.a() + n11);
    }

    public static void b(String string) {
        d = string;
    }

    public static String b() {
        return d;
    }

    static {
        if (bH.b() == null) {
            bH.b("HAs3");
        }
    }
}

