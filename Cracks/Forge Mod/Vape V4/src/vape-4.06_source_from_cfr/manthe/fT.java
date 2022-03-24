/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.g1;

public class fT
extends cy {
    private static boolean e;

    public fT(Object object) {
        super(object);
    }

    public int f() {
        if (e) {
            return fT.a.M().L.c(this.b);
        }
        return this.i().h();
    }

    public int g() {
        if (e) {
            return fT.a.M().L.b(this.b);
        }
        return this.i().f();
    }

    public int h() {
        if (e) {
            return fT.a.M().L.d(this.b);
        }
        return this.i().g();
    }

    public g1 i() {
        return new g1(fT.a.M().L.a(this.b));
    }

    static boolean a(boolean bl) {
        e = bl;
        return e;
    }
}

