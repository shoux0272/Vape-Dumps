/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.ArrayList;
import manthe.A5;
import manthe.CQ;
import manthe.Cp;
import manthe.DB;
import manthe.DE;
import manthe.DX;
import manthe.Ds;
import manthe.L;
import manthe.V;
import manthe.dN;
import manthe.dn;
import manthe.ds;
import manthe.e3;
import manthe.eC;
import manthe.eJ;
import manthe.ef;
import manthe.ej;
import manthe.ew;
import manthe.ex;
import manthe.gS;
import manthe.k5;
import manthe.kA;
import manthe.kq;
import manthe.kx;
import manthe.lK;
import manthe.ll;
import manthe.o7;
import manthe.on;
import manthe.pb;
import manthe.pf;
import manthe.pw;
import manthe.y5;
import manthe.yJ;
import manthe.yL;
import manthe.yr;
import org.lwjgl.opengl.GL11;

public class z2
extends y5 {
    private final pb w = new pb("3D");
    private final pb x = new pb("2D");
    private final pb L = new pb("Outline");
    private final pb G = new pb("Skeleton");
    private final DX A;
    private final DE v = DE.a((Object)this, "Player Color", new Color(-14368924));
    private final DB B = DB.a((Object)this, "Invisibles", false, "Show invisibles.");
    private final yr D = new yr(this, "3D");
    private final yJ R = new yJ(this, "2D");
    private final yL K = new yL(this, "Skeleton");
    public DB J = DB.a((Object)this, "Enemy Only", false, "Only render enemies.");
    public DB T = DB.a((Object)this, "Priority Only", false, "Only shows the ESP box on friends/enemies.");
    public DB u = DB.a(this, "Enemies List Only", false);
    public DB z = DB.a(this, "Hide Bots", false);
    public DB M = DB.a((Object)this, "Hitbox", false, "Shows the current entity hitbox size.\n(HitBoxes expansion visible)\n(3D Only)");
    public DB I = DB.a((Object)this, "Show Normal", false, "Shows the true entity hitbox size.\n(3D Only)");
    public DB F = DB.a((Object)this, "Bounding Box", true, "Shows an ESP box that wraps around the players BoundingBox.");
    public DB P = DB.a((Object)this, "Health Bar", false, "Shows a healthbar next to the ESP box");
    public DB C = DB.a((Object)this, "Name", false, "Shows a nametag above the ESP box");
    public DB N = DB.a((Object)this, "Use Displayname", false, "Shows the tab list display name.");
    public DB y = DB.a((Object)this, "Show Background", false, "Renders a box behind the text.");
    public DB S = DB.a((Object)this, "Damage", false, "Shows enemy damage relative to yours");
    public ef E = ds.r();
    private boolean O = false;
    private int H = 0;
    private boolean Q;

    public z2() {
        super("ESP", -16711936, CQ.d, "Extra Sensory Perception\nRenders an ESP on players.");
        this.M.a(new Ds[]{this.I});
        this.A = DX.a((Object)this, "Mode", this.w, this.w, this.x, this.G, this.L);
        this.F.a(new Ds[]{this.T});
        this.C.a(this.N, this.y);
        this.A.a(this.M, this.F, this.T, this.P, this.C);
        this.A.a((Ds)this.F, this.x);
        this.A.a((Ds)this.T, this.x);
        this.A.a((Ds)this.N, this.x);
        this.A.a((Ds)this.y, this.x);
        this.A.a((Ds)this.P, this.x);
        this.A.a((Ds)this.C, this.x);
        this.A.a((Ds)this.M, this.w);
        this.a(this.v, this.A, this.M, this.I, this.F, this.T, this.P, this.C, this.N, this.y, this.B, this.z);
    }

    public boolean S() {
        return this.A.v() == this.L && this.Q;
    }

    @Override
    public void t() {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() == this.x) {
            this.R.t();
        }
    }

    @Override
    public void a(kq kq2) {
        if (this.A.v() == this.G) {
            this.K.a(kq2);
        }
    }

    @Override
    public void a(lK lK2) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b((ex)lK2.getClientPlayer()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(lK2.getClientPlayer().S()) : !on.p.t().a((ex)lK2.getClientPlayer(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds.t().e()) {
                return;
            }
            if (this.Q) {
                lK2.getForgeEvent().a(true);
                dN dN2 = (dN)lK2.getForgeEvent();
                dN2.c(false);
                dN2.e(false);
                dN2.d(false);
            }
        }
    }

    @Override
    public void a(ll ll2) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b(ll2.getEntity()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(ll2.getEntity().S()) : !on.p.t().a(ll2.getEntity(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds.t().e()) {
                return;
            }
            if (this.Q) {
                dn dn2 = (dn)ll2.getForgeEvent();
                dn2.a(0);
            }
        }
    }

    @Override
    public void a(kA kA2) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b(kA2.getEntity()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(kA2.getEntity().S()) : !on.p.t().a(kA2.getEntity(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds.t().e()) {
                return;
            }
            eJ eJ2 = ds.k();
            ex ex2 = kA2.getEntity();
            if (ex2.equals(eJ2)) {
                return;
            }
            if (this.Q) {
                kA2.a(true);
            }
            return;
        }
        if (this.A.v() == this.x) {
            this.R.a(kA2);
        }
    }

    @Override
    public void a(kx kx2) {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() == this.x) {
            this.R.a(kx2);
        }
        if (this.A.v() == this.G) {
            this.K.a(kx2);
        }
        if (this.A.v() == this.w) {
            this.D.a(kx2);
        }
        if (this.A.v() != this.L || !this.O || this.H < 10) {
            return;
        }
        ds.M().a(0.0);
        eJ eJ2 = ds.k();
        gS gS2 = eJ2.i();
        pw.j();
        int n6 = GL11.glGenLists((int)1);
        pw.b().e();
        GL11.glPushMatrix();
        ds.M().a(kx2.getTicks(), 0);
        GL11.glDisable((int)2929);
        pw.b().b(true);
        GL11.glNewList((int)n6, (int)4864);
        GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)1.0);
        o7.a(this.v.K().getRGB());
        for (Object e10 : gS2.k()) {
            ex ex2 = new ex(e10);
            if (on.p.t().b(ex2) && this.z.u().booleanValue() || this.J.u().booleanValue() && (this.u.u() == false ? !on.p.t().a(ex2, false) : !on.p.b().a(ex2.S()))) continue;
            if (ex2.equals(eJ2) || !ex2.a(A5.cc)) continue;
            GL11.glPushMatrix();
            GL11.glLineWidth((float)3.0f);
            GL11.glEnable((int)3042);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3553);
            double d10 = ex2.T() + (ex2.z() - ex2.T()) * (double)kx2.getTicks() - ds.r().m();
            double d11 = ex2.R() + (ex2.l() - ex2.R()) * (double)kx2.getTicks() - ds.r().n();
            double d12 = ex2.X() + (ex2.g() - ex2.X()) * (double)kx2.getTicks() - ds.r().j();
            ew ew2 = new ew(ds.r().a(ex2).a());
            if (ew2.d()) {
                this.Q = true;
                e3.l();
                ArrayList arrayList = null;
                if (V.c() > 13) {
                    arrayList = Lists.newArrayList(ew2.f());
                    ew2.f().clear();
                }
                GL11.glPushMatrix();
                ds.M().a(0.0);
                ew2.a(ex2, d10, d11, d12, kx2.getTicks(), kx2.getTicks());
                o7.a(this.v.K().getRGB());
                GL11.glPopMatrix();
                if (V.c() > 13) {
                    ew2.a(arrayList);
                }
                e3.n();
                this.Q = false;
            }
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            GL11.glPopMatrix();
        }
        ds.M().a(0.0);
        GL11.glEndList();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n6);
        pw.b().b(false);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glCallList((int)n6);
        pw.b().g();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6914);
        pw.b().i();
        GL11.glEnable((int)2929);
        GL11.glDeleteLists((int)n6, (int)1);
        GL11.glPopMatrix();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ds.M().b(1.0);
    }

    public Color a(Object object) {
        if (Cp.e()) {
            return null;
        }
        if (!A5.cF.isInstance(object)) {
            return null;
        }
        if (object.equals(ds.k())) {
            return null;
        }
        if (!this.B.u().booleanValue() && pf.b(new ej(object))) {
            return null;
        }
        ej ej2 = new ej(object);
        if (on.p.t().b(ej2) && this.z.u().booleanValue()) {
            return null;
        }
        if (A5.L.isInstance(object)) {
            L l = on.p.t().a(new eC(object));
            if (l == null) {
                l = this.v.K();
            }
            return l;
        }
        return null;
    }

    @Override
    public void a(k5 k52) {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() != this.L) {
            return;
        }
        if (this.Q && V.c() == 13) {
            o7.a(this.v.K());
            return;
        }
        if (!k52.getEntity().a(A5.u) && k52.getEntity().a(A5.cc)) {
            this.O = true;
            ++this.H;
        }
    }
}

