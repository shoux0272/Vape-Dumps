/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.DB;
import manthe.Ds;
import manthe.my;
import manthe.o1;
import manthe.pd;
import manthe.qp;
import manthe.r9;
import manthe.rG;
import manthe.rg;
import manthe.rl;
import manthe.uy;
import org.lwjgl.opengl.GL11;

public class qD
extends qp
implements o1 {
    private final r9 H;
    private final rg G;
    private final rl I;
    private double J;
    private double F = 8.0;
    private static int[] K;

    public qD(String string, double d10) {
        this(string, new r9());
        this.J = d10;
        this.H.c(d10);
    }

    public qD(String string, r9 r92) {
        this.J = r92.q();
        D7 d72 = new D7(1.0, 0.0, 1, 3, new pd(0, 0, 0, 0));
        this.a(d72);
        this.I = new rl(string, my.c, 0.75, false);
        this.H = r92;
        r92.e(0.5);
        this.G = new rG("dots", (float)this.F, 10.0f, 1.0f, false);
        this.G.a(new uy(this));
        this.b(r92);
        this.b(this.I);
        this.b(this.G);
    }

    @Override
    public void b(Color color) {
        super.b(color);
        this.H.b(color);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        this.I.c(d10 - this.J - this.F - this.u().a() * 2.0);
        this.H.c(this.J);
        this.G.c(this.F);
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.H.b(d10);
        this.I.b(d10);
        this.G.b(d10);
    }

    @Override
    public void c(boolean bl) {
        if (this.p() != null && this.e()) {
            Object c3;
            Ds ds2;
            DB dB2 = (DB)this.p();
            if (dB2.t().size() == 0) {
                this.G.a(false);
            }
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            this.G.e(dB2.y());
            if (dB2.y() && !dB2.t().isEmpty() && (ds2 = dB2.r()) != null && (c3 = dB2.r().c()) != null) {
                GL11.glColor4d((double)0.25, (double)0.25, (double)0.25, (double)0.2);
                GL11.glBegin((int)7);
                GL11.glVertex2d((double)(this.t() - 1.0), (double)(c3.k() + c3.b()));
                GL11.glVertex2d((double)(this.t() + this.q() + 1.0), (double)(c3.k() + c3.b()));
                GL11.glVertex2d((double)(this.t() + this.q() + 1.0), (double)this.k());
                GL11.glVertex2d((double)(this.t() - 1.0), (double)this.k());
                GL11.glEnd();
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        super.c(bl);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.d()) {
            return false;
        }
        if (this.g()) {
            if (!this.H.g() && !this.G.g()) {
                this.H.a().a(n6, n10, n11);
            }
            this.R();
        }
        return super.a(n6, n10, n11);
    }

    @Override
    public void F() {
        this.H.F();
    }

    @Override
    public boolean G() {
        return this.H.G();
    }

    @Override
    public void g(boolean bl) {
        this.H.g(bl);
    }

    public r9 a() {
        return this.H;
    }

    public rl z() {
        return this.I;
    }

    public static void b(int[] arrn) {
        K = arrn;
    }

    public static int[] y() {
        return K;
    }

    static {
        if (qD.y() == null) {
            qD.b(new int[1]);
        }
    }
}

