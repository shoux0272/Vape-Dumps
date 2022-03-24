/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class iw
extends gJ {
    public final bP g;
    public final bP h;
    public final bP a;
    public final bP f;
    public final bP d;
    private final BG e = this.b("pressed", true, Boolean.TYPE);
    private static int i;

    public iw() {
        super(A5.ci);
        this.g = this.a("getKeyCode", true, Integer.TYPE, new Class[0]);
        this.h = this.a("isPressed", true, Boolean.TYPE, new Class[0]);
        this.a = this.b("setKeyBindState", true, Void.TYPE, Integer.TYPE, Boolean.TYPE);
        this.f = this.b("onTick", true, Void.TYPE, Integer.TYPE);
        this.d = this.a("func_151470_d", cy.c, Boolean.TYPE, new Class[0]);
    }

    public boolean b(Object object) {
        return this.d.h(object, new Object[0]);
    }

    public int a(Object object) {
        return this.g.o(object, new Object[0]);
    }

    public boolean c(Object object) {
        return this.h.h(object, new Object[0]);
    }

    public void a(Object object, int n6, boolean bl) {
        this.a.p(object, n6, bl);
    }

    public void c(int n6) {
        this.f.p(null, n6);
    }

    public boolean d(Object object) {
        return this.e.d(object);
    }

    public static void a(int n6) {
        i = n6;
    }

    public static int d() {
        return i;
    }

    public static int e() {
        int n6 = iw.d();
        if (n6 == 0) {
            return 84;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (iw.d() != 0) {
            iw.a(77);
        }
    }
}

