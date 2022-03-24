/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.D7;
import manthe.DB;
import manthe.DE;
import manthe.DX;
import manthe.Dp;
import manthe.Ds;
import manthe.b_;
import manthe.k9;
import manthe.mq;
import manthe.nm;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.pb;
import manthe.pd;
import manthe.r1;
import manthe.y5;
import manthe.yM;
import org.lwjgl.opengl.GL11;

public class rL
extends r1 {
    public final pb ai = new pb("Alphabetical");
    public final pb ap = new pb("Length");
    public final DX ag = DX.a((Object)this, "Sort", this.ai, this.ai, this.ap);
    public final DB ao = DB.a((Object)this, "Shadow", true, "Renders shadowed text.");
    public final DB am = DB.a(this, "Use Category Color", false);
    public final DB aq = DB.a((Object)this, "Watermark", false, "Renders a vape watermark");
    public final DB ae = DB.a(this, "Render background", false);
    public final DB al = DB.a((Object)this, "Hide Modules", false, "Allows you to blacklist certain modules from being shown.");
    public final Dp an = Dp.a((Object)this, "module-show-blacklist", "Hidden Modules", "Name of module to hide.", Dp.r, Arrays.asList("ESP", "NameTags", "StorageESP"));
    public DB ar = DB.a((Object)this, "Rescale", true, "Rescales text GUI");
    double ah;
    double aj;
    double af;
    private List<y5> ak = new CopyOnWriteArrayList<y5>();
    private static rL as;

    public rL() {
        super("Text GUI", true);
        D7 d72 = new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0));
        d72.g();
        this.aj().a(d72);
        this.g(false);
        this.aj().g(false);
        this.c(100.0);
        this.b(20.0);
        this.f(false);
        this.m(true);
        this.al.a(new Ds[]{this.an});
        this.ah().add((p1)this.ag.c());
        this.ah().add((p1)this.ao.c());
        this.ah().add((p1)this.am.c());
        this.ah().add((p1)this.al.c());
        this.ah().add((p1)this.an.c());
        this.ah().add((p1)this.aq.c());
        this.ah().add((p1)this.ar.c());
        this.ah().add((p1)this.ae.c());
        this.n(true);
        this.l(false);
        this.ak.addAll(on.p.H().e());
        this.ag.a(new yM(this));
        as = this;
    }

    public void an() {
        if (this.ag.v() == this.ai) {
            this.ak.sort(new nm());
        } else if (this.ag.v() == this.ap) {
            this.ak.sort(new b_(null));
        }
    }

    @Override
    public mq r() {
        return super.r();
    }

    @Override
    public void c(boolean bl) {
        Object object;
        super.c(bl);
        if (this.z() || !this.e() || !this.ai()) {
            return;
        }
        mq mq2 = on.p.a(1.0);
        this.b(on.p.t().r.K());
        double d10 = this.aj().t();
        double d11 = this.aj().k() + (double)(bl ? -20 : 2);
        boolean bl2 = this.Y();
        float[] arrf = new float[3];
        DE dE2 = on.p.t().r;
        arrf = Color.RGBtoHSB(dE2.K().getRed(), dE2.K().getGreen(), dE2.K().getBlue(), arrf);
        float f10 = arrf[0];
        if (this.ae.u().booleanValue() && this.af != this.aj) {
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            o7.a(new Color(20, 20, 20, 180), this.af - 1.0, this.ah - 1.0, this.aj + 1.0, this.ah - 1.0, this.aj + 1.0, d11 - 2.0, this.af - 1.0, d11 - 2.0);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
        }
        double d12 = d10;
        double d13 = this.aj;
        if (this.aq.u().booleanValue()) {
            double d14 = bl2 ? d10 + 17.0 : d10 + 1.0;
            GL11.glPushMatrix();
            if (this.ao.u().booleanValue()) {
                k9.a(new Color(0, 0, 0, 90), (float)d14 + 0.5f, (float)d11 - 1.0f + 0.5f, "vapelogo", 15.0f, 15.0f, false);
                k9.a(new Color(0, 0, 0, 90), (float)d14 + 50.0f + 0.5f, (float)d11 - 1.0f + 0.5f, "v4", 15.0f, 15.0f, false);
            }
            object = Color.WHITE;
            if (dE2.J()) {
                object = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
                if ((f10 -= 0.05f) <= 0.0f) {
                    f10 = 1.0f;
                }
                arrf[0] = f10;
                Color color = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
                k9.a((Color)object, color, (float)d14, (float)d11 - 1.0f, "vapelogo", 15.0f, 15.0f, false);
                k9.a((Color)object, color, (float)d14 + 50.0f, (float)d11 - 1.0f, "v4", 15.0f, 15.0f, false);
            } else {
                k9.a((Color)dE2.K(), (float)d14, (float)d11 - 1.0f, "vapelogo", 15.0f, 15.0f, false);
                k9.a(Color.WHITE, (float)d14 + 50.0f, (float)d11 - 1.0f, "v4", 15.0f, 15.0f, false);
            }
            GL11.glPopMatrix();
            d11 += 15.0;
            d12 = d10 + 73.0;
            if (d14 < d13) {
                d13 = d14;
            }
        }
        for (y5 y52 : this.ak) {
            if (!y52.N() || y52.y() == 0 || this.al.u().booleanValue() && this.an.d(y52.H())) continue;
            object = y52.H() + y52.w();
            double d15 = mq2.b((String)object);
            double d16 = bl2 ? d10 + 87.0 - d15 : d10 + 2.0;
            Color color = new Color(this.am.u() != false ? y52.Q().c() : y52.y());
            if (dE2.J()) {
                if ((f10 -= 0.025f) <= 0.0f) {
                    f10 = 1.0f;
                }
                arrf[0] = f10;
                color = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
            }
            if (this.ao.u().booleanValue()) {
                mq2.c((String)object, d16, d11, color);
            } else {
                mq2.a((String)object, d16, d11, color);
            }
            this.a(this.af - 1.0, d11 - 1.5, this.aj - this.af + 2.0);
            d11 += 10.0;
            if (d16 + d15 > d12) {
                d12 = d16 + d15 + 1.0;
            }
            if (!(d16 < d13)) continue;
            d13 = d16 - 1.0;
        }
        this.aj = d12;
        this.ah = d11;
        this.af = d13;
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
    }

    private void a(double d10, double d11, double d12) {
        if (!this.ae.u().booleanValue()) {
            return;
        }
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glColor4d((double)0.1, (double)0.1, (double)0.1, (double)0.25);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)(d10 + d12), (double)d11);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    @Override
    public void c() {
        super.c();
        this.b(20.0);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        for (p1 p12 : this.aj().v()) {
            p12.c(d10 - 0.0);
        }
    }

    public String al() {
        CopyOnWriteArrayList<y5> copyOnWriteArrayList = new CopyOnWriteArrayList<y5>(on.p.H().e());
        if (this.ag.v() == this.ai) {
            copyOnWriteArrayList.sort(new nm());
        } else if (this.ag.v() == this.ap) {
            copyOnWriteArrayList.sort(new b_(null));
        }
        String string = "  ";
        for (y5 y52 : copyOnWriteArrayList) {
            if (!y52.N() || y52.y() == 0) continue;
            string = string + y52.H() + ", ";
        }
        if (string.length() > 2) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }

    public static rL am() {
        return as;
    }
}

