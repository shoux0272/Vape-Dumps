/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgnzBiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Players", true);
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Mobs", false);
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Animals", false);
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance Check", false);
    private iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance Check", false);
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance Check", false);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Invisibles", false);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a(this, "Color by distance", false);
    private iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Highlight if focusing", false, "If another player is looking at you their tracer will be highlighted");
    private iReSqtkUVgfXGiReSqtkUVg k = iReSqtkUVgfXGiReSqtkUVg.a(this, "Player Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private iReSqtkUVgfXGiReSqtkUVg l = iReSqtkUVgfXGiReSqtkUVg.a(this, "Mob Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private iReSqtkUVgfXGiReSqtkUVg m = iReSqtkUVgfXGiReSqtkUVg.a(this, "Animal Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private iReSqtkUVgZfciReSqtkUVg n = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Player Color", 0.0);
    private iReSqtkUVgZfciReSqtkUVg o = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Mob Color", 0.0);
    private iReSqtkUVgZfciReSqtkUVg p = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Animal Color", 0.0);
    private double q;
    private Map<iReSqtkUVgVnKiReSqtkUVg, iReSqtkUVgcObiReSqtkUVg> r = new HashMap<iReSqtkUVgVnKiReSqtkUVg, iReSqtkUVgcObiReSqtkUVg>();
    private List<iReSqtkUVgVnKiReSqtkUVg> s;

    public iReSqtkUVgnzBiReSqtkUVg() {
        super("Tracers", -12274966, iReSqtkUVgqTOiReSqtkUVg.e);
        this.b.a(this.e, this.n);
        this.c.a(this.f, this.o);
        this.d.a(this.g, this.p);
        this.e.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.k});
        this.f.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.l});
        this.g.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.m});
        this.a(this.h, this.i, this.j, this.b, this.e, this.k, this.n, this.d, this.g, this.m, this.p, this.c, this.f, this.l, this.o);
    }

    private void x() {
        if (this.i.i().booleanValue()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.s) {
                double d2 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2);
                float f = 0.35f;
                double d3 = (double)(Math.round(d2 / 3.0) * 3L) - this.q / 3.0;
                float f2 = (float)((double)f * (d3 / this.q));
                if (d2 > this.q) {
                    f2 = f;
                }
                Color color = new Color(Color.HSBtoRGB(f2, 1.0f, 1.0f));
                int n = 255;
                if (d2 > this.q && (n = (int)(255.0 / (d2 / this.q))) < 150) {
                    n = 150;
                }
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
                this.r.get(iReSqtkUVgVnKiReSqtkUVg2).a(color);
            }
        }
    }

    private void y() {
        if (this.j.i().booleanValue()) {
            ArrayList<iReSqtkUVgVnKiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgVnKiReSqtkUVg>();
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.s) {
                if (!iReSqtkUVgVnKiReSqtkUVg2.b(iReSqtkUVgtlXiReSqtkUVg2) || !(iReSqtkUVgrseiReSqtkUVg.d(iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2) < 5.0)) continue;
                arrayList.add(iReSqtkUVgVnKiReSqtkUVg2);
            }
            if (!arrayList.isEmpty()) {
                for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.s) {
                    iReSqtkUVgcObiReSqtkUVg iReSqtkUVgcObiReSqtkUVg2 = this.r.get(iReSqtkUVgVnKiReSqtkUVg2);
                    if (arrayList.contains(iReSqtkUVgVnKiReSqtkUVg2)) {
                        iReSqtkUVgcObiReSqtkUVg2.a(3.0);
                        iReSqtkUVgcObiReSqtkUVg2.a(true);
                        continue;
                    }
                    iReSqtkUVgcObiReSqtkUVg2.a(0.75);
                }
            }
        }
    }

    private void z() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        Collections.sort(this.s, new iReSqtkUVgDNPiReSqtkUVg(this, iReSqtkUVgtlXiReSqtkUVg2));
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (Map.Entry<iReSqtkUVgVnKiReSqtkUVg, iReSqtkUVgcObiReSqtkUVg> entry : this.r.entrySet()) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = entry.getKey();
            arrayList.add(Double.valueOf(iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2)));
        }
        Collections.sort(arrayList);
        this.q = (Double)arrayList.get(arrayList.size() / 2);
    }

    @Override
    public void b(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        this.A();
        if (this.r.size() == 0) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        iReSqtkUVgeLLiReSqtkUVg.n().a(0.0);
        double d2 = iReSqtkUVgvwXiReSqtkUVg2.e();
        double d3 = iReSqtkUVgvwXiReSqtkUVg2.f();
        double d4 = iReSqtkUVgvwXiReSqtkUVg2.g();
        double d5 = iReSqtkUVgauSiReSqtkUVg.d() > 13 ? (double)iReSqtkUVgtlXiReSqtkUVg2.aa() : 0.0;
        this.s = new ArrayList<iReSqtkUVgVnKiReSqtkUVg>(this.r.keySet());
        this.z();
        this.x();
        this.y();
        Collections.reverse(this.s);
        for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.s) {
            iReSqtkUVgcObiReSqtkUVg iReSqtkUVgcObiReSqtkUVg2 = this.r.get(iReSqtkUVgVnKiReSqtkUVg2);
            Color color = iReSqtkUVgcObiReSqtkUVg2.a();
            if (iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2) && iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
                color = Color.BLUE;
            }
            this.a(iReSqtkUVgVnKiReSqtkUVg2, color, (float)iReSqtkUVgcObiReSqtkUVg2.b(), iReSqtkUVgDVPiReSqtkUVg2.a(), d2, d3, d4, d5, iReSqtkUVgcObiReSqtkUVg2.c());
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        this.r.clear();
    }

    private void A() {
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n) || iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgeLLiReSqtkUVg.e())) continue;
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2);
            if (!this.h.i().booleanValue() && iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2) || iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgVnKiReSqtkUVg2)) continue;
            float f = iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgeLLiReSqtkUVg.e());
            if (this.b.i().booleanValue() && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) {
                if (this.e.i().booleanValue() && ((double)f < this.k.i()[0].doubleValue() || (double)f > this.k.i()[1].doubleValue())) continue;
                if (iReSqtkUVgFuiiReSqtkUVg.e.j().b(iReSqtkUVgVnKiReSqtkUVg2.x()) && iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
                    this.r.put(iReSqtkUVgVnKiReSqtkUVg2, new iReSqtkUVgcObiReSqtkUVg(iReSqtkUVgFuiiReSqtkUVg.e.j().e.k(), null));
                    continue;
                }
                this.r.put(iReSqtkUVgVnKiReSqtkUVg2, new iReSqtkUVgcObiReSqtkUVg(this.n.k(), null));
                continue;
            }
            if (this.c.i().booleanValue() && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.D)) {
                if (this.f.i().booleanValue() && ((double)f < this.l.i()[0].doubleValue() || (double)f > this.l.i()[1].doubleValue())) continue;
                this.r.put(iReSqtkUVgVnKiReSqtkUVg2, new iReSqtkUVgcObiReSqtkUVg(this.o.k(), null));
                continue;
            }
            if (!this.d.i().booleanValue() || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.E) || this.g.i().booleanValue() && ((double)f < this.m.i()[0].doubleValue() || (double)f > this.m.i()[1].doubleValue())) continue;
            this.r.put(iReSqtkUVgVnKiReSqtkUVg2, new iReSqtkUVgcObiReSqtkUVg(this.p.k(), null));
        }
    }

    private void a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, Color color, float f, float f2, double d2, double d3, double d4, double d5, boolean bl) {
        double d6 = iReSqtkUVgjSjiReSqtkUVg2.Q() + (iReSqtkUVgjSjiReSqtkUVg2.z() - iReSqtkUVgjSjiReSqtkUVg2.Q()) * (double)f2 - d2;
        double d7 = iReSqtkUVgjSjiReSqtkUVg2.R() + (iReSqtkUVgjSjiReSqtkUVg2.A() - iReSqtkUVgjSjiReSqtkUVg2.R()) * (double)f2 - d3;
        double d8 = iReSqtkUVgjSjiReSqtkUVg2.S() + (iReSqtkUVgjSjiReSqtkUVg2.B() - iReSqtkUVgjSjiReSqtkUVg2.S()) * (double)f2 - d4;
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
        double d9 = 0.0;
        double d10 = 0.0;
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            iReSqtkUVgeAuiReSqtkUVg iReSqtkUVgeAuiReSqtkUVg2 = new iReSqtkUVgeAuiReSqtkUVg(0.0, 0.0, 1.0);
            iReSqtkUVgeAuiReSqtkUVg2.a((float)(-Math.toRadians(iReSqtkUVgtlXiReSqtkUVg2.G())));
            iReSqtkUVgeAuiReSqtkUVg2.b((float)(-Math.toRadians(iReSqtkUVgtlXiReSqtkUVg2.F())));
            d9 = iReSqtkUVgeAuiReSqtkUVg2.a();
            d5 += iReSqtkUVgeAuiReSqtkUVg2.b();
            d10 = iReSqtkUVgeAuiReSqtkUVg2.c();
        }
        if (bl) {
            GL11.glLineWidth((float)(f + f * 0.5f));
            GL11.glBegin((int)1);
            iReSqtkUVguKSiReSqtkUVg.a(Color.black);
            GL11.glVertex3d((double)d9, (double)d5, (double)d10);
            GL11.glVertex3d((double)d6, (double)(d7 + (double)iReSqtkUVgjSjiReSqtkUVg2.aa()), (double)d8);
            GL11.glEnd();
        }
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        iReSqtkUVguKSiReSqtkUVg.a(color);
        GL11.glVertex3d((double)d9, (double)d5, (double)d10);
        GL11.glVertex3d((double)d6, (double)(d7 + (double)iReSqtkUVgjSjiReSqtkUVg2.aa()), (double)d8);
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

