/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.cy;

public class kl {
    protected int a = Da.b;
    private boolean c;
    private static cy[] b;

    public boolean fire() {
        return this.c;
    }

    public boolean c() {
        return this.a == Da.b;
    }

    public boolean d() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public int a() {
        return this.a;
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] b() {
        return b;
    }

    static {
        if (kl.b() == null) {
            kl.b(new cy[4]);
        }
    }
}

