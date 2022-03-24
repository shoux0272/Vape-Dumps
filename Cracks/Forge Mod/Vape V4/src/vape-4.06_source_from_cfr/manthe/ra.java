/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.d;
import manthe.CD;
import manthe.D7;
import manthe.DB;
import manthe.DF;
import manthe.ds;
import manthe.e3;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import org.lwjgl.opengl.GL11;

public class ra
extends r1 {
    public final DF ae = DF.a(this, "Size", "#.#", "", 0.5, 1.0, 2.0);
    public final DF ah = DF.a(this, "FPS", "#", "", 1.0, 30.0, 60.0);
    public final DF af = DF.a(this, "FOV", "#", "", 50.0, 90.0, 150.0);
    public final DB ai = DB.a(this, "Level view", true);
    public CD aj;
    private static ra ag;

    public ra() {
        super("Rearview", true);
        this.aj().a(new D7(0.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(130.0);
        this.b(20.0);
        this.l(false);
        this.m(false);
        this.ah().add((p1)this.ae.c());
        this.ah().add((p1)this.ah.c());
        this.ah().add((p1)this.af.c());
        this.ah().add((p1)this.ai.c());
        ag = this;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        try {
            this.c(130.0);
            if (!this.e()) {
                return;
            }
            if (this.aj == null) {
                return;
            }
            if (ds.s().w() > 0) {
                on.p.j().c("Disable Optifine AA to use this feature", this.t(), this.k() + 20.0, -65536);
                return;
            }
            if (!ds.s().z()) {
                return;
            }
            if (ds.s().f() || ds.s().f()) {
                on.p.j().c("Disable fast render to use this feature", this.t(), this.k() + 20.0, -65536);
                return;
            }
            if (this.aj.g()) {
                double d10 = 73.0;
                double d11 = 130.0;
                d10 *= this.ae.a().doubleValue();
                d11 *= this.ae.a().doubleValue();
                boolean bl2 = GL11.glIsEnabled((int)3553);
                boolean bl3 = GL11.glIsEnabled((int)3008);
                boolean bl4 = GL11.glIsEnabled((int)3042);
                if (bl2) {
                    e3.j();
                }
                if (!bl3) {
                    e3.k();
                }
                if (!bl4) {
                    e3.r();
                }
                GL11.glColor4f((float)0.1f, (float)0.1f, (float)0.1f, (float)0.2f);
                o7.a((float)this.t(), (float)(this.k() + 19.5), (float)(this.t() + d11), (float)(this.k() + 19.5 + d10));
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                this.aj.a(true, this.t() + 0.5, this.k() + 19.5 + 0.5, this.t() + d11 - 0.5, this.k() + 19.5 + d10 - 0.5);
                if (bl2) {
                    e3.p();
                }
                if (!bl3) {
                    e3.i();
                }
                if (!bl4) {
                    e3.f();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void am() {
        if (!this.e() || !this.ai() && !d.getGuiObject().equals(ds.x().a())) {
            return;
        }
        if (ds.k().e() || ds.t().e()) {
            return;
        }
        if (this.aj != null) {
            this.aj.a((int)(1000.0 / this.ah.a()));
            this.aj.d(this.ai.u());
            this.aj.b(this.af.a().intValue());
            this.aj.f();
        } else {
            this.aj = new CD();
        }
    }

    public static ra al() {
        return ag;
    }
}

