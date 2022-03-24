/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.gf;
import manthe.js;

public class gg
extends cy {
    public gg(Object object) {
        super(object);
    }

    public static gg[] f() {
        Object[] arrobject = V.c() > 13 ? gg.a.M().bw.e() : gg.a.M().bw.d();
        gg[] arrgg = new gg[6];
        for (int k = 0; k < arrobject.length; ++k) {
            arrgg[k] = new gg(arrobject[k]);
        }
        return arrgg;
    }

    public int h() {
        if (V.c() > 13) {
            return gg.a.M().bw.d(this.b);
        }
        return js.a(gg.a.M().bw, this.b);
    }

    public gg g() {
        if (V.c() > 13) {
            return new gg(gg.a.M().bw.c(this.b));
        }
        return gg.f()[js.b(gg.a.M().bw, this.b)];
    }

    public gf l() {
        return new gf(gg.a.M().bw.h(this.b));
    }

    public String m() {
        return String.valueOf(gg.a.M().bw.f(this.b));
    }

    public int i() {
        return js.e(gg.a.M().bw, this.b);
    }

    public int j() {
        return js.d(gg.a.M().bw, this.b);
    }

    public int k() {
        return js.c(gg.a.M().bw, this.b);
    }
}

