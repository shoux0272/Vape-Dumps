/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class h2
extends gJ {
    private final bP f = this.a("getScaleFactor", true, Integer.TYPE, new Class[0]);
    private final bP a;
    private final bP g = this.a("getScaledHeight", true, Integer.TYPE, new Class[0]);
    private bP d;
    private bP e;

    public h2() {
        super(A5.dS);
        this.a = this.a("getScaledWidth", true, Integer.TYPE, new Class[0]);
        if (V.c() > 13) {
            this.e = this.a("<init>", false, Void.TYPE, A5.d0);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, A5.d0, Integer.TYPE, Integer.TYPE);
        }
    }

    public int d(Object object) {
        return this.f.o(object, new Object[0]);
    }

    public int b(Object object) {
        return this.a.o(object, new Object[0]);
    }

    public int c(Object object) {
        return this.g.o(object, new Object[0]);
    }

    public Object a(Object object, int n6, int n10) {
        return this.d.a(new Object[]{object, n6, n10});
    }

    public Object a(Object object) {
        return this.e.a(object);
    }
}

