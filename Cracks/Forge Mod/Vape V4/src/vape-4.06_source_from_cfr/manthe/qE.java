/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.si;

public abstract class qE {
    private final si a;
    private static cy[] b;

    public qE(si si2) {
        this.a = si2;
    }

    public abstract void a(Object var1);

    public si a() {
        return this.a;
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] b() {
        return b;
    }

    static {
        if (qE.b() != null) {
            qE.b(new cy[1]);
        }
    }
}

