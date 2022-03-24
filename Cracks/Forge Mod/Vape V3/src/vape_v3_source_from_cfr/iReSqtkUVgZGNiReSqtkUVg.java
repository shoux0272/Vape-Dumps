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

public class iReSqtkUVgZGNiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg f = new iReSqtkUVgzAciReSqtkUVg("3D");
    private iReSqtkUVgzAciReSqtkUVg g = new iReSqtkUVgzAciReSqtkUVg("2D");
    private iReSqtkUVgzAciReSqtkUVg h = new iReSqtkUVgzAciReSqtkUVg("Outline");
    private iReSqtkUVgzAciReSqtkUVg i = new iReSqtkUVgzAciReSqtkUVg("Skeleton");
    private iReSqtkUVgZyLiReSqtkUVg j = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", this.f, this.f, this.g, this.i, this.h);
    private iReSqtkUVgZfciReSqtkUVg k = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Player Color", Color.BLUE);
    public iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a(this, "Hide Bots", false);
    public iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Hitbox", false, "Shows the current entity hitbox size.\n(HitBoxes expansion visible)\n(3D Only)");
    public iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Show Normal", false, "Shows the true entity hitbox size.\n(3D Only)");
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Invisibles", false, "Show invisibles.");
    public iReSqtkUVgvwXiReSqtkUVg e;
    private boolean m = false;
    private int n = 0;
    private boolean o;
    private iReSqtkUVgyeFiReSqtkUVg p = new iReSqtkUVgyeFiReSqtkUVg(this, "3D");
    private iReSqtkUVgbLaiReSqtkUVg q = new iReSqtkUVgbLaiReSqtkUVg(this, "2D");
    private iReSqtkUVgjzViReSqtkUVg r = new iReSqtkUVgjzViReSqtkUVg(this, "Skeleton");

    public iReSqtkUVgZGNiReSqtkUVg() {
        super("ESP", -16711936, iReSqtkUVgqTOiReSqtkUVg.e, "Extra Sensory Perception\nRenders an ESP on players.");
        this.e = iReSqtkUVgeLLiReSqtkUVg.s();
        this.c.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.d});
        this.a(this.k, this.j, this.c, this.d, this.l, this.b);
    }

    public boolean x() {
        return this.j.i() == this.h && this.o;
    }

    @Override
    public void a(iReSqtkUVgpUSiReSqtkUVg iReSqtkUVgpUSiReSqtkUVg2) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgpUSiReSqtkUVg2.a()) && this.b.i().booleanValue()) {
            return;
        }
        if (this.j.i() == this.h) {
            if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
                return;
            }
            if (this.o) {
                iReSqtkUVgpUSiReSqtkUVg2.h().d(true);
                iReSqtkUVgkqMiReSqtkUVg iReSqtkUVgkqMiReSqtkUVg2 = (iReSqtkUVgkqMiReSqtkUVg)iReSqtkUVgpUSiReSqtkUVg2.h();
                iReSqtkUVgkqMiReSqtkUVg2.b(false);
                iReSqtkUVgkqMiReSqtkUVg2.a(false);
                iReSqtkUVgkqMiReSqtkUVg2.c(false);
            }
        }
    }

    @Override
    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
        if (this.j.i() == this.g) {
            this.q.a(iReSqtkUVgrbbiReSqtkUVg2);
        }
    }

    @Override
    public void a(iReSqtkUVgDhPiReSqtkUVg iReSqtkUVgDhPiReSqtkUVg2) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgDhPiReSqtkUVg2.a()) && this.b.i().booleanValue()) {
            return;
        }
        if (this.j.i() == this.h) {
            if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
                return;
            }
            if (this.o) {
                iReSqtkUVgQbYiReSqtkUVg iReSqtkUVgQbYiReSqtkUVg2 = (iReSqtkUVgQbYiReSqtkUVg)iReSqtkUVgDhPiReSqtkUVg2.h();
                iReSqtkUVgQbYiReSqtkUVg2.a(0);
            }
        }
    }

    @Override
    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgWkmiReSqtkUVg2.a()) && this.b.i().booleanValue()) {
            return;
        }
        if (this.j.i() == this.h) {
            if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
                return;
            }
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgWkmiReSqtkUVg2.a();
            if (iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2)) {
                return;
            }
            if (this.o) {
                iReSqtkUVgWkmiReSqtkUVg2.h().d(true);
            }
            return;
        }
        if (this.j.i() == this.g) {
            this.q.a(iReSqtkUVgWkmiReSqtkUVg2);
        }
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        if (this.j.i() == this.g) {
            return;
        }
        if (this.j.i() == this.i) {
            this.r.a(iReSqtkUVgDVPiReSqtkUVg2);
        }
        if (this.j.i() == this.f) {
            this.p.a(iReSqtkUVgDVPiReSqtkUVg2);
        }
        if (this.j.i() != this.h || !this.m || this.n < 10) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ag();
        iReSqtkUVgCviiReSqtkUVg.b();
        int n = GL11.glGenLists((int)1);
        iReSqtkUVgCviiReSqtkUVg.a().c();
        GL11.glPushMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgDVPiReSqtkUVg2.a(), 0);
        GL11.glDisable((int)2929);
        iReSqtkUVgCviiReSqtkUVg.a().b(true);
        GL11.glNewList((int)n, (int)4864);
        GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)1.0);
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        iReSqtkUVguKSiReSqtkUVg.a(this.k.k().getRGB());
        for (Object e : iReSqtkUVggvziReSqtkUVg2.e()) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgjSjiReSqtkUVg2) && this.b.i().booleanValue() || iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2) || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d)) continue;
            GL11.glPushMatrix();
            GL11.glLineWidth((float)3.0f);
            GL11.glEnable((int)3042);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3553);
            double d2 = iReSqtkUVgjSjiReSqtkUVg2.Q() + (iReSqtkUVgjSjiReSqtkUVg2.z() - iReSqtkUVgjSjiReSqtkUVg2.Q()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgeLLiReSqtkUVg.s().e();
            double d3 = iReSqtkUVgjSjiReSqtkUVg2.R() + (iReSqtkUVgjSjiReSqtkUVg2.A() - iReSqtkUVgjSjiReSqtkUVg2.R()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgeLLiReSqtkUVg.s().f();
            double d4 = iReSqtkUVgjSjiReSqtkUVg2.S() + (iReSqtkUVgjSjiReSqtkUVg2.B() - iReSqtkUVgjSjiReSqtkUVg2.S()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgeLLiReSqtkUVg.s().g();
            iReSqtkUVgOjIiReSqtkUVg iReSqtkUVgOjIiReSqtkUVg2 = new iReSqtkUVgOjIiReSqtkUVg(iReSqtkUVgeLLiReSqtkUVg.s().a(iReSqtkUVgjSjiReSqtkUVg2).a());
            if (iReSqtkUVgOjIiReSqtkUVg2.c()) {
                this.o = true;
                ArrayList arrayList = null;
                if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                    arrayList = Lists.newArrayList(iReSqtkUVgOjIiReSqtkUVg2.g());
                    iReSqtkUVgOjIiReSqtkUVg2.g().clear();
                }
                GL11.glPushMatrix();
                iReSqtkUVgOjIiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2, d2, d3, d4, iReSqtkUVgDVPiReSqtkUVg2.a(), iReSqtkUVgDVPiReSqtkUVg2.a());
                GL11.glPopMatrix();
                if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                    iReSqtkUVgOjIiReSqtkUVg2.a(arrayList);
                }
                this.o = false;
            }
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            GL11.glPopMatrix();
        }
        GL11.glEndList();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n);
        iReSqtkUVgCviiReSqtkUVg.a().b(false);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glCallList((int)n);
        iReSqtkUVgCviiReSqtkUVg.a().h();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n);
        GL11.glPolygonMode((int)1032, (int)6914);
        iReSqtkUVgCviiReSqtkUVg.a().d();
        GL11.glEnable((int)2929);
        GL11.glDeleteLists((int)n, (int)1);
        GL11.glPopMatrix();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }

    public Color a(Object object) {
        if (!iReSqtkUVgSzRiReSqtkUVg.n.isInstance(object)) {
            return null;
        }
        if (object.equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            return null;
        }
        if (!this.l.i().booleanValue() && iReSqtkUVgrseiReSqtkUVg.a(new iReSqtkUVgVnKiReSqtkUVg(object))) {
            return null;
        }
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(object);
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgVnKiReSqtkUVg2) && this.b.i().booleanValue()) {
            return null;
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2)) {
            return Color.blue;
        }
        if (iReSqtkUVgSzRiReSqtkUVg.B.isInstance(object)) {
            if (iReSqtkUVgFuiiReSqtkUVg.e.j().b(iReSqtkUVgVnKiReSqtkUVg2.x()) && iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
                return iReSqtkUVgFuiiReSqtkUVg.e.j().e.k();
            }
            return this.k.k();
        }
        return null;
    }

    @Override
    public void a(iReSqtkUVgLSmiReSqtkUVg iReSqtkUVgLSmiReSqtkUVg2) {
        if (this.j.i() != this.h) {
            return;
        }
        if (this.o && iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            iReSqtkUVguKSiReSqtkUVg.a(this.k.k());
            return;
        }
        if (!iReSqtkUVgLSmiReSqtkUVg2.b().a(iReSqtkUVgSzRiReSqtkUVg.e) && iReSqtkUVgLSmiReSqtkUVg2.b().a(iReSqtkUVgSzRiReSqtkUVg.d)) {
            this.m = true;
            ++this.n;
        }
    }
}

