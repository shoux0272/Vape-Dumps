/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;

public class tV {
    public int a;
    public int b;
    public int f;
    public int g;
    public Color c;
    private final AtomicBoolean e;
    private static int[] d;

    public tV(int n6, int n10, int n11, int n12, Color color, AtomicBoolean atomicBoolean) {
        this.a = n6;
        this.b = n10;
        this.f = n11;
        this.g = n12;
        this.c = color;
        this.e = atomicBoolean;
    }

    public tV(int n6, int n10, int n11, int n12, Color color) {
        this(n6, n10, n11, n12, color, null);
    }

    public boolean a() {
        if (this.e == null) {
            return true;
        }
        return this.e.get();
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public static int[] b() {
        return d;
    }

    static {
        if (tV.b() != null) {
            tV.b(new int[2]);
        }
    }
}

