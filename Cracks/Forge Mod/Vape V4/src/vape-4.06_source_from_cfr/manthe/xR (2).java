/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.CD;
import manthe.ds;
import manthe.e3;
import manthe.k9;
import manthe.o7;
import manthe.on;
import manthe.ra;
import manthe.uW;
import manthe.wJ;
import manthe.wM;
import org.lwjgl.opengl.GL11;

public class xR
extends wM {
    public static xR A;
    private CD B;
    private wJ z;

    public xR(wJ wJ2) {
        A = this;
        this.z = wJ2;
    }

    @Override
    public void a() {
        this.l();
    }

    @Override
    public void k() {
        this.l();
    }

    private void l() {
        if (this.B == null || !this.z.ai()) {
            ra ra2 = ra.al();
            double d10 = this.f();
            double d11 = this.e();
            k9.a(Color.WHITE, (float)(this.d() + (d11 *= ra2.ae.a().doubleValue()) / 2.0 - 10.0), (float)(this.c() + (d10 *= ra2.ae.a().doubleValue()) / 2.0 - 10.0), "camera", 16.0f, 16.0f, false);
            return;
        }
        if (ds.s().w() > 0) {
            on.p.E().c("Disable Optifine AA to use this feature", this.d() + 4.0, this.c() + 4.0, -65536);
            return;
        }
        if (!ds.s().z()) {
            on.p.E().c("Enable FBO to use this feature", this.d() + 4.0, this.c() + 4.0, -65536);
            return;
        }
        if (ds.s().f() || ds.s().f()) {
            on.p.E().c("Disable fast render to use this feature", this.d() + 4.0, this.c() + 4.0, -65536);
            return;
        }
        if (this.B.g()) {
            ra ra3 = ra.al();
            double d12 = this.f();
            double d13 = this.e();
            d12 *= ra3.ae.a().doubleValue();
            d13 *= ra3.ae.a().doubleValue();
            boolean bl = GL11.glIsEnabled((int)3553);
            boolean bl2 = GL11.glIsEnabled((int)3008);
            boolean bl3 = GL11.glIsEnabled((int)3042);
            if (bl) {
                e3.j();
            }
            if (!bl2) {
                e3.k();
            }
            if (!bl3) {
                e3.r();
            }
            GL11.glColor4f((float)0.1f, (float)0.1f, (float)0.1f, (float)0.2f);
            o7.a((float)this.d(), (float)this.c(), (float)(this.d() + d13), (float)(this.c() + d12));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.B.a(this.z.ai(), this.d() + 0.5, this.c() + 0.5, this.d() + d13 - 0.5, this.c() + d12 - 0.5);
            if (bl) {
                e3.p();
            }
            if (!bl2) {
                e3.i();
            }
            if (!bl3) {
                e3.f();
            }
        }
    }

    public void m() {
        if (ds.k().e() || ds.t().e()) {
            return;
        }
        if (!this.z.ai() || !this.z.b()) {
            return;
        }
        if (this.B != null) {
            ra ra2 = ra.al();
            this.B.a(1000 / ra2.ah.a().intValue());
            this.B.d(ra2.ai.u());
            this.B.b(ra2.af.a().intValue());
            this.B.f();
        } else {
            this.B = new CD();
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 61.0;
    }
}

