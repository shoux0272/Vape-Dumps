/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class hC
extends gJ {
    private final bP m;
    private final bP h;
    private final bP j;
    private final bP a;
    private final bP d;
    private final bP g;
    private final bP o;
    private final bP n;
    private final bP e;
    private final bP l;
    private final BG f = this.b("width", true, Integer.TYPE);
    private final BG i = this.b("height", true, Integer.TYPE);
    private static boolean k;

    public hC() {
        super(A5.aE);
        this.m = this.a("initGui", true, Void.TYPE, new Class[0]);
        this.h = this.a("onGuiClosed", true, Void.TYPE, new Class[0]);
        this.j = this.a("updateScreen", true, Void.TYPE, new Class[0]);
        this.a = this.a("keyTyped", true, Void.TYPE, Character.TYPE, Integer.TYPE);
        this.d = this.a("mouseClicked", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        this.l = this.a("doesGuiPauseGame", true, Boolean.TYPE, new Class[0]);
        this.g = V.c() == 13 ? this.a("mouseMovedOrUp", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE) : this.a("mouseReleased", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        this.o = this.a("handleMouseInput", true, Void.TYPE, new Class[0]);
        this.n = this.a("drawScreen", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE);
        this.e = this.a("drawDefaultBackground", true, Void.TYPE, new Class[0]);
    }

    public boolean d(Object object) {
        return this.l.h(object, new Object[0]);
    }

    public void e(Object object) {
        this.m.a(object, new Object[0]);
    }

    public void a(Object object) {
        this.h.a(object, new Object[0]);
    }

    public void f(Object object) {
        this.j.a(object, new Object[0]);
    }

    public void a(Object object, char c3, int n6) {
        this.a.a(object, new Object[]{Character.valueOf(c3), n6});
    }

    public void a(Object object, int n6, int n10, int n11) {
        this.d.a(object, new Object[]{n6, n10, n11});
    }

    public void b(Object object, int n6, int n10, int n11) {
        this.g.a(object, new Object[]{n6, n10, n11});
    }

    public void h(Object object) {
        this.o.a(object, new Object[0]);
    }

    public void a(Object object, int n6, int n10, float f10) {
        this.n.a(object, new Object[]{n6, n10, Float.valueOf(f10)});
    }

    private int c(Object object) {
        return this.f.c(object);
    }

    private int g(Object object) {
        return this.i.c(object);
    }

    private void b(Object object) {
        this.e.p(object, new Object[0]);
    }

    static int a(hC hC2, Object object) {
        return hC2.c(object);
    }

    static int b(hC hC2, Object object) {
        return hC2.g(object);
    }

    static void c(hC hC2, Object object) {
        hC2.b(object);
    }

    public static void b(boolean bl) {
        k = bl;
    }

    public static boolean f() {
        return k;
    }

    public static boolean e() {
        boolean bl = hC.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hC.e()) {
            hC.b(true);
        }
    }
}

