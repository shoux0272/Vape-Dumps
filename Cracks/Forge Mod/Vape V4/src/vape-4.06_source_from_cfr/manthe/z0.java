/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.A5;
import manthe.CQ;
import manthe.Cf;
import manthe.DB;
import manthe.DE;
import manthe.Ds;
import manthe.Dy;
import manthe.L;
import manthe.V;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ef;
import manthe.ej;
import manthe.ex;
import manthe.kx;
import manthe.nc;
import manthe.o7;
import manthe.oC;
import manthe.on;
import manthe.pf;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class z0
extends y5 {
    private final DB G = DB.a(this, "Enemy Only", false);
    private final DB I = DB.a(this, "Enemies List Only", false);
    private final DB K = DB.a(this, "Render Players", true);
    private final DB C = DB.a(this, "Render Mobs", false);
    private final DB E = DB.a(this, "Render Animals", false);
    private final DB J = DB.a(this, "Distance Check", false);
    private final DB L = DB.a(this, "Distance Check", false);
    private final DB A = DB.a(this, "Distance Check", false);
    private final DB u = DB.a(this, "Invisibles", false);
    private final DB B = DB.a(this, "Color by distance", false);
    private final DB x = DB.a((Object)this, "Highlight if focusing", false, "If another player is looking at you their tracer will be highlighted");
    private final Dy w = Dy.a(this, "Player Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final Dy F = Dy.a(this, "Mob Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final Dy y = Dy.a(this, "Animal Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final DE z = DE.a((Object)this, "Player Color", new Color(0, 150, 255));
    private final DE H = DE.a((Object)this, "Mob Color", 0.0);
    private final DE M = DE.a((Object)this, "Animal Color", 0.0);
    private final Map<ej, Cf> v = new HashMap<ej, Cf>();
    private double D;
    private List<ej> N;

    public z0() {
        super("Tracers", -12274966, CQ.d);
        this.K.a(this.G, this.J, this.z);
        this.C.a(this.L, this.H);
        this.E.a(this.A, this.M);
        this.J.a(new Ds[]{this.w});
        this.L.a(new Ds[]{this.F});
        this.A.a(new Ds[]{this.y});
        this.a(this.u, this.B, this.x, this.K, this.G, this.J, this.w, this.z, this.E, this.A, this.y, this.M, this.C, this.L, this.F, this.H);
    }

    private void U() {
        if (this.B.u().booleanValue()) {
            eJ eJ2 = ds.k();
            for (ej ej2 : this.N) {
                double d10 = eJ2.a(ej2);
                float f10 = 0.35f;
                double d11 = (double)(Math.round(d10 / 3.0) * 3L) - this.D / 3.0;
                float f11 = (float)((double)f10 * (d11 / this.D));
                if (d10 > this.D) {
                    f11 = f10;
                }
                Color color = new Color(Color.HSBtoRGB(f11, 1.0f, 1.0f));
                int n6 = 255;
                if (d10 > this.D && (n6 = (int)(255.0 / (d10 / this.D))) < 150) {
                    n6 = 150;
                }
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n6);
                this.v.get(ej2).a(color);
            }
        }
    }

    private void S() {
        if (this.x.u().booleanValue()) {
            ArrayList<ej> arrayList = new ArrayList<ej>();
            eJ eJ2 = ds.k();
            for (ej ej2 : this.N) {
                if (!ej2.c(eJ2) || !(pf.d(ej2, eJ2) < 5.0)) continue;
                arrayList.add(ej2);
            }
            if (!arrayList.isEmpty()) {
                for (ej ej2 : this.N) {
                    Cf cf = this.v.get(ej2);
                    if (arrayList.contains(ej2)) {
                        cf.a(3.0);
                        cf.a(true);
                        continue;
                    }
                    cf.a(0.75);
                }
            }
        }
    }

    private void T() {
        eJ eJ2 = ds.k();
        Collections.sort(this.N, new nc(this, eJ2));
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (Map.Entry<ej, Cf> entry : this.v.entrySet()) {
            ej ej2 = entry.getKey();
            arrayList.add(Double.valueOf(eJ2.a(ej2)));
        }
        Collections.sort(arrayList);
        this.D = (Double)arrayList.get(arrayList.size() / 2);
    }

    @Override
    public void b(kx kx2) {
        eJ eJ2 = ds.k();
        ef ef2 = ds.r();
        this.V();
        if (this.v.size() == 0) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        ds.M().a(0.0);
        double d10 = ef2.m();
        double d11 = ef2.n();
        double d12 = ef2.j();
        double d13 = V.c() > 13 ? (double)eJ2.am() : 0.0;
        this.N = new ArrayList<ej>(this.v.keySet());
        this.T();
        this.U();
        this.S();
        Collections.reverse(this.N);
        for (ej ej2 : this.N) {
            L l;
            Cf cf = this.v.get(ej2);
            Color color = cf.c();
            if (ej2.a(A5.cc) && (l = on.p.t().b(new eC(ej2))) != null) {
                color = l;
            }
            this.a(ej2, color, (float)cf.a(), kx2.getTicks(), d10, d11, d12, d13, cf.b());
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        ds.M().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        this.v.clear();
    }

    private void V() {
        for (Object e10 : ds.t().k()) {
            ex ex2 = new ex(e10);
            if (!ex2.a(A5.cF) || ex2.equals(ds.k())) continue;
            ej ej2 = new ej(ex2);
            if (!this.u.u().booleanValue() && pf.b(ej2) || on.p.t().b(ej2) || this.G.u().booleanValue() && (this.I.u() != false ? !on.p.b().a(ex2.S()) : !on.p.t().a(ex2, false))) continue;
            float f10 = ej2.a(ds.k());
            if (ex2.a(A5.L)) {
                if (!this.K.u().booleanValue() || this.J.u().booleanValue() && ((double)f10 < this.w.v()[0] || (double)f10 > this.w.v()[1])) continue;
                if (on.p.N().c(ej2.S()) && on.p.N().c.u().booleanValue()) {
                    this.v.put(ej2, new Cf(on.p.N().e.K(), null));
                    continue;
                }
                if (on.p.b().a(ej2.S()) && on.p.b().c.u().booleanValue()) {
                    this.v.put(ej2, new Cf(on.p.b().e.K(), null));
                    continue;
                }
                this.v.put(ej2, new Cf(this.z.K(), null));
                continue;
            }
            if (ex2.a(A5.P)) {
                if (!this.C.u().booleanValue() || this.L.u().booleanValue() && ((double)f10 < this.F.v()[0] || (double)f10 > this.F.v()[1])) continue;
                this.v.put(ej2, new Cf(this.H.K(), null));
                continue;
            }
            if (!this.E.u().booleanValue() || this.A.u().booleanValue() && ((double)f10 < this.y.v()[0] || (double)f10 > this.y.v()[1])) continue;
            this.v.put(ej2, new Cf(this.M.K(), null));
        }
    }

    private void a(ex ex2, Color color, float f10, float f11, double d10, double d11, double d12, double d13, boolean bl) {
        double d14 = ex2.T() + (ex2.z() - ex2.T()) * (double)f11 - d10;
        double d15 = ex2.R() + (ex2.l() - ex2.R()) * (double)f11 - d11;
        double d16 = ex2.X() + (ex2.g() - ex2.X()) * (double)f11 - d12;
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        if (bl3) {
            GL11.glDisable((int)2896);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        double d17 = 0.0;
        double d18 = 0.0;
        if (V.c() >= 23) {
            eJ eJ2 = ds.k();
            oC oC2 = new oC(0.0, 0.0, 1.0);
            oC2.a((float)(-Math.toRadians(eJ2.K())));
            oC2.b((float)(-Math.toRadians(eJ2.U())));
            d17 = oC2.a();
            d13 += oC2.b();
            d18 = oC2.d();
        }
        if (bl) {
            GL11.glLineWidth((float)(f10 + f10 * 0.5f));
            GL11.glBegin((int)1);
            o7.a(Color.black);
            GL11.glVertex3d((double)d17, (double)d13, (double)d18);
            GL11.glVertex3d((double)d14, (double)(d15 + (double)ex2.am()), (double)d16);
            GL11.glEnd();
        }
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)1);
        o7.a(color);
        GL11.glVertex3d((double)d17, (double)d13, (double)d18);
        GL11.glVertex3d((double)d14, (double)(d15 + (double)ex2.am()), (double)d16);
        GL11.glEnd();
        if (bl3) {
            GL11.glEnable((int)2896);
        }
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
    }
}

