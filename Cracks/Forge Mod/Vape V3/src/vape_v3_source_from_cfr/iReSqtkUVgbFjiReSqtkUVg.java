/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgbFjiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Hide Bots", false, "Doesn't apply chams on bots.");
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Colored", false, "Colors entities.");
    private iReSqtkUVgZfciReSqtkUVg d = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Visible Color", new Color(255, 0, 0));
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Color Behind Walls", true, "Renders a different color when\nplayers are behind walls.");
    private iReSqtkUVgZfciReSqtkUVg f = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Invisible Color", new Color(255, 255, 0));
    private boolean g;
    private iReSqtkUVgVnKiReSqtkUVg h;
    private int i;

    public iReSqtkUVgbFjiReSqtkUVg() {
        super("Chams", -16711936, iReSqtkUVgqTOiReSqtkUVg.e, "Render players through walls.");
        this.a(this.b, this.c.a(this.d, this.e.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.f})), this.d, this.e, this.f);
    }

    @Override
    public void a(iReSqtkUVgpUSiReSqtkUVg iReSqtkUVgpUSiReSqtkUVg2) {
        if (iReSqtkUVgpUSiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.e)) {
            return;
        }
        iReSqtkUVgkqMiReSqtkUVg iReSqtkUVgkqMiReSqtkUVg2 = (iReSqtkUVgkqMiReSqtkUVg)iReSqtkUVgpUSiReSqtkUVg2.h();
        if (!this.g) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        iReSqtkUVgpUSiReSqtkUVg2.h().d(true);
        iReSqtkUVgkqMiReSqtkUVg2.b(false);
        iReSqtkUVgkqMiReSqtkUVg2.a(false);
        iReSqtkUVgkqMiReSqtkUVg2.c(false);
    }

    @Override
    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
        if (!this.g) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgWkmiReSqtkUVg2.a();
        if (iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2)) {
            return;
        }
        iReSqtkUVgWkmiReSqtkUVg2.h().d(true);
    }

    @Override
    public void a(iReSqtkUVgDhPiReSqtkUVg iReSqtkUVgDhPiReSqtkUVg2) {
        if (this.g) {
            if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
                return;
            }
            iReSqtkUVgQbYiReSqtkUVg iReSqtkUVgQbYiReSqtkUVg2 = (iReSqtkUVgQbYiReSqtkUVg)iReSqtkUVgDhPiReSqtkUVg2.h();
            iReSqtkUVgQbYiReSqtkUVg2.a(0);
        }
    }

    @Override
    public void a(iReSqtkUVgLSmiReSqtkUVg iReSqtkUVgLSmiReSqtkUVg2) {
        if (iReSqtkUVgLSmiReSqtkUVg2.b().a(iReSqtkUVgSzRiReSqtkUVg.d) && !iReSqtkUVgLSmiReSqtkUVg2.b().a(iReSqtkUVgSzRiReSqtkUVg.e) && this.c.i().booleanValue() && this.g) {
            if (this.i == 1) {
                iReSqtkUVguKSiReSqtkUVg.a(this.e.i() != false ? this.f.k() : this.d.k());
            }
            if (this.i == 2) {
                iReSqtkUVguKSiReSqtkUVg.a(this.d.k());
            }
        }
    }

    @Override
    public void a(iReSqtkUVgkqhiReSqtkUVg iReSqtkUVgkqhiReSqtkUVg2) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgkqhiReSqtkUVg2.a()) && this.b.i().booleanValue()) {
            return;
        }
        iReSqtkUVgZGNiReSqtkUVg iReSqtkUVgZGNiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgZGNiReSqtkUVg.class);
        if (this.g || this.i == 3 || iReSqtkUVgZGNiReSqtkUVg2.b() && iReSqtkUVgZGNiReSqtkUVg2.x()) {
            return;
        }
        if (!this.c.i().booleanValue()) {
            if (iReSqtkUVgkqhiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.d) && !iReSqtkUVgkqhiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.e)) {
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-1100000.0f);
            }
        } else if (iReSqtkUVgkqhiReSqtkUVg2.a().c() && iReSqtkUVgkqhiReSqtkUVg2.b().c() && !iReSqtkUVgkqhiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.e)) {
            if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
                iReSqtkUVgkqhiReSqtkUVg2.h().d(true);
            }
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = iReSqtkUVgkqhiReSqtkUVg2.a();
            double d2 = iReSqtkUVgDfKiReSqtkUVg2.Q() + (iReSqtkUVgDfKiReSqtkUVg2.z() - iReSqtkUVgDfKiReSqtkUVg2.Q()) * (double)iReSqtkUVgkqhiReSqtkUVg2.c() - iReSqtkUVgeLLiReSqtkUVg.s().e();
            double d3 = iReSqtkUVgDfKiReSqtkUVg2.R() + (iReSqtkUVgDfKiReSqtkUVg2.A() - iReSqtkUVgDfKiReSqtkUVg2.R()) * (double)iReSqtkUVgkqhiReSqtkUVg2.c() - iReSqtkUVgeLLiReSqtkUVg.s().f();
            double d4 = iReSqtkUVgDfKiReSqtkUVg2.S() + (iReSqtkUVgDfKiReSqtkUVg2.B() - iReSqtkUVgDfKiReSqtkUVg2.S()) * (double)iReSqtkUVgkqhiReSqtkUVg2.c() - iReSqtkUVgeLLiReSqtkUVg.s().g();
            float f = iReSqtkUVgDfKiReSqtkUVg2.H() + (iReSqtkUVgDfKiReSqtkUVg2.F() - iReSqtkUVgDfKiReSqtkUVg2.H()) * iReSqtkUVgkqhiReSqtkUVg2.c();
            GL11.glPushMatrix();
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3553);
            iReSqtkUVgoOBiReSqtkUVg.f();
            iReSqtkUVguKSiReSqtkUVg.a(this.e.i() != false ? this.f.k() : this.d.k());
            ArrayList arrayList = null;
            if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                arrayList = Lists.newArrayList(iReSqtkUVgkqhiReSqtkUVg2.b().g());
                iReSqtkUVgkqhiReSqtkUVg2.b().g().clear();
            }
            try {
                this.g = true;
                this.i = 1;
                iReSqtkUVgkqhiReSqtkUVg2.b().a(iReSqtkUVgDfKiReSqtkUVg2, d2, d3, d4, f, iReSqtkUVgkqhiReSqtkUVg2.c());
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.g = false;
            GL11.glEnable((int)2929);
            GL11.glEnable((int)3553);
            if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
                this.i = 3;
                GL11.glPushMatrix();
                GL11.glEnable((int)2896);
                iReSqtkUVgkqhiReSqtkUVg2.b().a(iReSqtkUVgDfKiReSqtkUVg2, d2, d3, d4, f, iReSqtkUVgkqhiReSqtkUVg2.c());
                GL11.glDepthMask((boolean)false);
                GL11.glDisable((int)2896);
                GL11.glPopMatrix();
            }
            this.g = true;
            iReSqtkUVguKSiReSqtkUVg.a(this.d.k());
            GL11.glDisable((int)3553);
            try {
                this.i = 2;
                iReSqtkUVgkqhiReSqtkUVg2.b().a(iReSqtkUVgDfKiReSqtkUVg2, d2, d3, d4, f, iReSqtkUVgkqhiReSqtkUVg2.c());
                this.g = false;
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                iReSqtkUVgkqhiReSqtkUVg2.b().a(arrayList);
            }
            GL11.glEnable((int)3553);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            iReSqtkUVgoOBiReSqtkUVg.e();
            GL11.glPopMatrix();
            this.i = -1;
            if (!iReSqtkUVgDfKiReSqtkUVg2.O()) {
                this.h = iReSqtkUVgDfKiReSqtkUVg2;
                iReSqtkUVgDfKiReSqtkUVg2.l(true);
            }
        }
    }

    @Override
    public void a(iReSqtkUVgKYjiReSqtkUVg iReSqtkUVgKYjiReSqtkUVg2) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgKYjiReSqtkUVg2.a()) && this.b.i().booleanValue()) {
            return;
        }
        if (this.c.i().booleanValue()) {
            if (this.h != null) {
                iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = iReSqtkUVgKYjiReSqtkUVg2.a();
                iReSqtkUVgDfKiReSqtkUVg2.l(false);
                this.h = null;
            }
            return;
        }
        if (iReSqtkUVgKYjiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.d) && !iReSqtkUVgKYjiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.e)) {
            GL11.glDisable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)1100000.0f);
        }
    }
}

