/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.U;
import manthe.ds;
import manthe.eK;
import manthe.eh;
import manthe.fG;
import manthe.fk;
import manthe.rg;
import org.lwjgl.opengl.GL11;

public class rM
extends rg {
    private fk K;
    private int M;
    private float L = 1.0f;
    private fG J;

    public rM(int n6, boolean bl) {
        super(bl);
        this.a(n6);
    }

    @Override
    public void c(boolean bl) {
        super.c(true);
        String string = "";
        if (this.J != null && this.J.d()) {
            string = this.J.j();
            GL11.glPushMatrix();
            eK eK2 = ds.J();
            float f10 = eK2.g();
            eK2.a(150.0f);
            eh.h();
            eh.g();
            double d10 = 1.0f / this.L;
            GL11.glScaled((double)this.L, (double)this.L, (double)this.L);
            eK2.a(ds.m(), ds.l(), this.J, (int)((this.t() + 3.0) * d10), (int)((this.k() + 3.0) * d10));
            GL11.glScaled((double)d10, (double)d10, (double)d10);
            eh.h();
            eK2.a(f10);
            GL11.glPopMatrix();
        }
        this.b(string);
    }

    public void a(float f10) {
        this.L = f10;
    }

    public void a(int n6) {
        this.M = n6;
        this.K = fk.a(n6);
        this.J = this.K.d() ? fG.a(this.K) : null;
    }

    public void a(fk fk2) {
        this.M = fk2.h();
        this.K = fk2;
        if (fk2 != null && fk2.d()) {
            this.J = fG.a(fk2);
        }
    }

    public void a(fG fG2) {
        this.K = fG2.k();
        this.M = this.K.h();
        this.J = fG2;
    }

    public void B() {
        this.K = null;
        this.M = 0;
        this.J = null;
    }

    public fG C() {
        return this.J;
    }

    public fk D() {
        return this.K;
    }

    public U x() {
        U u6 = new U(this.M);
        if (this.J != null) {
            u6.a(this.J.m());
        }
        return u6;
    }

    public rM a(U u6) {
        this.M = u6.c();
        this.K = fk.a(this.M);
        if (this.K.d()) {
            this.J = fG.a(this.K);
            this.J.a(u6.h());
        } else {
            this.J = null;
        }
        return this;
    }
}

