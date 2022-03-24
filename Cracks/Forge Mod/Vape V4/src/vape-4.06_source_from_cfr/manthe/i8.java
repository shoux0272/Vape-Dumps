/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class i8
extends gJ {
    private final BG g = this.a("PICKUP", true, A5.cy);
    private final BG a = this.a("QUICK_MOVE", true, A5.cy);
    private final BG i = this.a("SWAP", true, A5.cy);
    private final BG e = this.a("CLONE", true, A5.cy);
    private final BG f = this.a("THROW", true, A5.cy);
    private final BG h = this.a("QUICK_CRAFT", true, A5.cy);
    private final BG d = this.a("PICKUP_ALL", true, A5.cy);

    public i8() {
        super(A5.cy);
    }

    private Object h() {
        return this.g.f(null);
    }

    private Object d() {
        return this.a.f(null);
    }

    private Object g() {
        return this.i.f(null);
    }

    private Object i() {
        return this.e.f(null);
    }

    private Object j() {
        return this.f.f(null);
    }

    private Object f() {
        return this.h.f(null);
    }

    private Object e() {
        return this.d.f(null);
    }

    static Object e(i8 i82) {
        return i82.h();
    }

    static Object d(i8 i82) {
        return i82.d();
    }

    static Object a(i8 i82) {
        return i82.g();
    }

    static Object g(i8 i82) {
        return i82.i();
    }

    static Object b(i8 i82) {
        return i82.j();
    }

    static Object c(i8 i82) {
        return i82.f();
    }

    static Object f(i8 i82) {
        return i82.e();
    }
}

