/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.HashMap;
import manthe.cm;
import manthe.ds;
import manthe.eN;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public final class pw {
    private static final pw c = new pw();
    private final HashMap<Integer, cm> a = new HashMap();
    private int d = 1;
    private boolean b;

    public static pw b() {
        return c;
    }

    public static void j() {
        eN eN2 = ds.w();
        if (eN2.d() && eN2.f() > -1) {
            pw.a(eN2);
            eN2.a(-1);
        }
    }

    public static void a(eN eN2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)eN2.f());
        int n6 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n6);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)ds.F(), (int)ds.H());
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n6);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n6);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void e() {
        if (this.d == 1) {
            GL11.glClearStencil((int)0);
            GL11.glClear((int)1024);
        }
        GL11.glEnable((int)2960);
        ++this.d;
        if (this.d > this.k()) {
            System.out.println("StencilUtil: Reached maximum amount of layers!");
            this.d = 1;
        }
    }

    public void i() {
        if (this.d == 1) {
            System.out.println("StencilUtil: No layers found!");
            return;
        }
        --this.d;
        if (this.d == 1) {
            GL11.glDisable((int)2960);
        } else {
            cm cm2 = this.a.remove(this.d);
            if (cm2 != null) {
                cm2.a();
            }
        }
    }

    public void c() {
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        this.a.clear();
        this.d = 1;
    }

    public void a() {
        this.a(new cm(this, this.b ? 519 : 512, this.d, this.k(), 7681, 7680, 7680));
    }

    public void b(boolean bl) {
        this.a(new cm(this, this.b ? 519 : 512, bl ? this.d : this.d - 1, this.k(), 7681, 7681, 7681));
    }

    public void f() {
        this.a(new cm(this, 517, this.d, this.k(), 7680, 7680, 7680));
    }

    public void g() {
        this.a(new cm(this, 514, this.d, this.k(), 7680, 7680, 7680));
    }

    public cm l() {
        return this.a.get(this.d);
    }

    public void a(cm cm2) {
        GL11.glStencilFunc((int)cm.a, (int)cm.d, (int)cm.e);
        GL11.glStencilOp((int)cm.b, (int)cm.f, (int)cm.c);
        this.a.put(this.d, cm2);
    }

    public int h() {
        return this.d;
    }

    public int d() {
        return GL11.glGetInteger((int)3415);
    }

    public int k() {
        return (int)(Math.pow(2.0, this.d()) - 1.0);
    }

    public void a(double d10, double d11, double d12) {
        GL11.glBegin((int)6);
        for (int k = 0; k <= 360; ++k) {
            double d13 = Math.sin((double)k * Math.PI / 180.0) * d12;
            double d14 = Math.cos((double)k * Math.PI / 180.0) * d12;
            GL11.glVertex2d((double)(d10 + d13), (double)(d11 + d14));
        }
        GL11.glEnd();
    }

    public void a(double d10, double d11, double d12, double d13) {
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d10, (double)d13);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glVertex2d((double)d12, (double)d11);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glEnd();
    }
}

