/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.A0;
import manthe.D7;
import manthe.DD;
import manthe.DL;
import manthe.aN;
import manthe.c7;
import manthe.dR;
import manthe.ds;
import manthe.fG;
import manthe.fk;
import manthe.k9;
import manthe.mD;
import manthe.my;
import manthe.o1;
import manthe.o7;
import manthe.pd;
import manthe.rg;
import manthe.rl;
import org.lwjgl.opengl.GL11;

public class ro
extends rg
implements o1 {
    private final mD J;
    private final DD K;

    public ro(c7 c72, mD mD2, DD dD2) {
        super("", false);
        this.K = dD2;
        this.J = mD2;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new DL(this));
        rg rg2 = new rg("x", true);
        rg2.b(12.0);
        rg2.c(12.0);
        rg2.a(new A0(this, dD2, mD2));
        c72.b(this);
        c72.b(rg2);
        rl rl2 = new rl("", my.c, 1.0);
        rl2.b(2.0);
        c72.b(rl2);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        dR dR2 = ds.m();
        fk fk2 = null;
        String string = null;
        try {
            fk2 = fk.a(Integer.parseInt(this.J.d()));
        }
        catch (Exception exception) {
            fk2 = aN.a(this.J.d());
        }
        if (fk2 != null && fk2.d()) {
            string = fk2.a(fG.a(fk2));
            if (this.J.b() != -1) {
                string = this.J.d() + ":" + this.J.b();
            }
        }
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), this.g() ? this.K.r().darker() : this.K.r());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (string != null) {
            dR2.a(string, this.t() + 15.0, this.k() + 4.0, -1, 0.5);
        } else {
            dR2.a(this.J.d(), this.t() + 15.0, this.k() + 4.0, -1, 0.5);
        }
        if (this.J.f() != -1) {
            dR2.d(this.J.f() + "", this.t() + this.q() - (double)dR2.c(this.J.f() + "") - 2.0, this.k() + 2.0, -1);
        }
        o7.a(this.t(), this.k(), this.t() + 12.0, this.k() + 12.0, 0x50000000);
        o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, -16777216);
        if (this.G()) {
            o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, Color.WHITE);
            k9.a(Color.BLACK, (float)this.t() + 2.0f, (float)this.k() + 2.0f, "check", 8.0f, 8.0f, false);
        }
    }

    @Override
    public void F() {
        this.J.a(!this.J.c());
    }

    @Override
    public boolean G() {
        return this.J.c();
    }

    @Override
    public void g(boolean bl) {
        this.J.a(bl);
    }

    public mD H() {
        return this.J;
    }
}

