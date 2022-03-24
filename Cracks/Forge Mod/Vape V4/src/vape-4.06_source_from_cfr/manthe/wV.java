/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.pe;
import manthe.wI;

public class wV
extends wI {
    private String G;
    protected double H;
    protected boolean E;
    private Color D;
    private static boolean F;

    public wV(String string, double d10) {
        this.G = string;
        this.H = d10;
        this.b(wV.b.o);
        this.c(wV.b.a);
        this.b(13.0);
    }

    public wV(String string) {
        this(string, 1.0);
    }

    @Override
    public void a() {
        float f10 = 8.0f * (float)this.H;
        if (this.D != null) {
            pe.a(this.G, this.d() + this.e() / 2.0, this.c() + this.f() / 2.0, (double)f10, (double)f10, this.D);
        } else {
            pe.a(this.G, this.d() + this.e() / 2.0, this.c() + this.f() / 2.0, (double)f10, (double)f10, this.E ? this.K() : this.M());
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.E && !this.x()) {
            this.g(false);
        }
    }

    @Override
    public void i() {
        this.g(true);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    public String O() {
        return this.G;
    }

    public void g(boolean bl) {
        this.E = bl;
    }

    public void b(String string) {
        this.G = string;
    }

    public void d(Color color) {
        this.D = color;
    }

    public static void f(boolean bl) {
        F = bl;
    }

    public static boolean N() {
        return F;
    }

    public static boolean P() {
        boolean bl = wV.N();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (wV.P()) {
            wV.f(true);
        }
    }
}

