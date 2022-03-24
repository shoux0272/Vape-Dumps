/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashMap;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public final class iReSqtkUVgCviiReSqtkUVg {
    private static final iReSqtkUVgCviiReSqtkUVg a = new iReSqtkUVgCviiReSqtkUVg();
    private final HashMap<Integer, iReSqtkUVghTxiReSqtkUVg> b = new HashMap();
    private int c = 1;
    private boolean d;

    public static iReSqtkUVgCviiReSqtkUVg a() {
        return a;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public static void b() {
        iReSqtkUVgbiBiReSqtkUVg iReSqtkUVgbiBiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.u();
        if (iReSqtkUVgbiBiReSqtkUVg2.c() && iReSqtkUVgbiBiReSqtkUVg2.g() > -1) {
            iReSqtkUVgCviiReSqtkUVg.a(iReSqtkUVgbiBiReSqtkUVg2);
            iReSqtkUVgbiBiReSqtkUVg2.a(-1);
        }
    }

    public static void a(iReSqtkUVgbiBiReSqtkUVg iReSqtkUVgbiBiReSqtkUVg2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)iReSqtkUVgbiBiReSqtkUVg2.g());
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)iReSqtkUVgeLLiReSqtkUVg.p(), (int)iReSqtkUVgeLLiReSqtkUVg.q());
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n);
    }

    public void c() {
        if (this.c == 1) {
            GL11.glClearStencil((int)0);
            GL11.glClear((int)1024);
        }
        GL11.glEnable((int)2960);
        ++this.c;
        if (this.c > this.l()) {
            System.out.println("StencilUtil: Reached maximum amount of layers!");
            this.c = 1;
        }
    }

    public void d() {
        if (this.c == 1) {
            System.out.println("StencilUtil: No layers found!");
            return;
        }
        --this.c;
        if (this.c == 1) {
            GL11.glDisable((int)2960);
        } else {
            iReSqtkUVghTxiReSqtkUVg iReSqtkUVghTxiReSqtkUVg2 = this.b.remove(this.c);
            if (iReSqtkUVghTxiReSqtkUVg2 != null) {
                iReSqtkUVghTxiReSqtkUVg2.a();
            }
        }
    }

    public void e() {
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        this.b.clear();
        this.c = 1;
    }

    public void f() {
        this.a(new iReSqtkUVghTxiReSqtkUVg(this, this.d ? 519 : 512, this.c, this.l(), 7681, 7680, 7680));
    }

    public void b(boolean bl) {
        this.a(new iReSqtkUVghTxiReSqtkUVg(this, this.d ? 519 : 512, bl ? this.c : this.c - 1, this.l(), 7681, 7681, 7681));
    }

    public void g() {
        this.a(new iReSqtkUVghTxiReSqtkUVg(this, 517, this.c, this.l(), 7680, 7680, 7680));
    }

    public void h() {
        this.a(new iReSqtkUVghTxiReSqtkUVg(this, 514, this.c, this.l(), 7680, 7680, 7680));
    }

    public void a(iReSqtkUVghTxiReSqtkUVg iReSqtkUVghTxiReSqtkUVg2) {
        GL11.glStencilFunc((int)iReSqtkUVghTxiReSqtkUVg.a, (int)iReSqtkUVghTxiReSqtkUVg.b, (int)iReSqtkUVghTxiReSqtkUVg.c);
        GL11.glStencilOp((int)iReSqtkUVghTxiReSqtkUVg.d, (int)iReSqtkUVghTxiReSqtkUVg.e, (int)iReSqtkUVghTxiReSqtkUVg.f);
        this.b.put(this.c, iReSqtkUVghTxiReSqtkUVg2);
    }

    public iReSqtkUVghTxiReSqtkUVg i() {
        return this.b.get(this.c);
    }

    public int j() {
        return this.c;
    }

    public int k() {
        return GL11.glGetInteger((int)3415);
    }

    public int l() {
        return (int)(Math.pow(2.0, this.k()) - 1.0);
    }

    public void a(double d2, double d3, double d4) {
        GL11.glBegin((int)6);
        for (int i = 0; i <= 360; ++i) {
            double d5 = Math.sin((double)i * Math.PI / 180.0) * d4;
            double d6 = Math.cos((double)i * Math.PI / 180.0) * d4;
            GL11.glVertex2d((double)(d2 + d5), (double)(d3 + d6));
        }
        GL11.glEnd();
    }

    public void a(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d5);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glVertex2d((double)d4, (double)d3);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glEnd();
    }
}

