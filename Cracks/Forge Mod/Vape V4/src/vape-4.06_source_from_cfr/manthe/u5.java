/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;

public class u5 {
    public static final int e = 1;
    public static final int a = 2;
    public static final int d = 1;
    public static final int b = 2;
    public static final int g = 513;
    public static final int c = 514;
    public static final int f = 516;
    public static final int h = 517;

    public static boolean e() {
        return (a.a.gks(1) & 0x100) != 0;
    }

    public static boolean f() {
        return (a.a.gks(2) & 0x100) != 0;
    }

    public static void a() {
        a.a.smd(1, 513);
    }

    public static void d() {
        a.a.smd(1, 514);
    }

    public static void c() {
        a.a.smd(2, 516);
    }

    public static void b() {
        a.a.smd(2, 517);
    }

    public static void b(int n6) {
        if (n6 == 0) {
            u5.a();
        }
        if (n6 == 1) {
            u5.c();
        }
    }

    public static void a(int n6) {
        if (n6 == 0) {
            u5.d();
        }
        if (n6 == 1) {
            u5.b();
        }
    }
}

