/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.Dh;
import manthe.aS;
import manthe.o1;
import manthe.o7;
import manthe.p1;
import manthe.rg;
import org.lwjgl.opengl.GL11;

public class r4
extends rg
implements o1 {
    private boolean K = false;
    private Color J;

    public r4(String string, boolean bl) {
        super(string, bl);
        this.a(new aS(this));
        this.a(new Dh(this));
        this.j(false);
        this.z().j(false);
        this.z().b(Color.WHITE);
    }

    @Override
    public void b(Color color) {
        super.b(color);
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            float f10 = 0.0f;
            o7.a(new Color(0x20303030, true), (double)f10, this, 4);
            if (this.J == null) {
                o7.a(this.f(), this.t() + (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + (double)f10, this.t() + (double)f10, this.k() + (double)f10);
            } else {
                o7.a(this.f(), this.J, this.t() + (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + (double)f10, this.t() + (double)f10, this.k() + (double)f10);
            }
            if (this.g()) {
                o7.a(new Color(0x30000000, true), this.t() + (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + this.b() - (double)f10, this.t() + this.q() - (double)f10, this.k() + (double)f10, this.t() + (double)f10, this.k() + (double)f10);
            }
            GL11.glEnable((int)3553);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
            for (p1 p12 : this.v()) {
                p12.c(bl);
            }
        }
    }

    @Override
    public void F() {
        this.g(!this.G());
    }

    @Override
    public boolean G() {
        return this.K;
    }

    @Override
    public void g(boolean bl) {
        this.K = bl;
        this.j(this.G());
        if (this.p() != null) {
            this.p().d();
        }
    }

    public void d(Color color) {
        this.J = color;
    }
}

