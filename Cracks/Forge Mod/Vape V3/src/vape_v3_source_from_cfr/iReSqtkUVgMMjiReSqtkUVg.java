/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgMMjiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgcmRiReSqtkUVg b = new iReSqtkUVgcmRiReSqtkUVg();
    private iReSqtkUVgxgYiReSqtkUVg c = new iReSqtkUVgxgYiReSqtkUVg();
    private iReSqtkUVgsOpiReSqtkUVg d = new iReSqtkUVgsOpiReSqtkUVg(Collections.singleton(iReSqtkUVgSzRiReSqtkUVg.by), new Color(173, 12, 255));
    private iReSqtkUVgsOpiReSqtkUVg e = new iReSqtkUVgsOpiReSqtkUVg(Collections.singleton(iReSqtkUVgSzRiReSqtkUVg.bz), new Color(255, 238, 154));
    private iReSqtkUVgsOpiReSqtkUVg f = new iReSqtkUVgsOpiReSqtkUVg(Collections.singleton(iReSqtkUVgSzRiReSqtkUVg.bx), new Color(255, 255, 255));
    private iReSqtkUVgvwXiReSqtkUVg g;
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show Arrows", true);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show Pearls", true);
    private iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show Potions", false);
    private iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show Eggs", false);
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show Snowballs", false);

    public iReSqtkUVgMMjiReSqtkUVg() {
        super("Projectiles", -16535661, iReSqtkUVgqTOiReSqtkUVg.e, "Shows projectile trajectories while in air");
        this.g = iReSqtkUVgeLLiReSqtkUVg.s();
        this.a(this.h, this.i, this.j, this.k, this.l);
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        for (Object e : iReSqtkUVguqNiReSqtkUVg2.d()) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bv)) continue;
            iReSqtkUVgkyRiReSqtkUVg iReSqtkUVgkyRiReSqtkUVg2 = new iReSqtkUVgkyRiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
            iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2 = new iReSqtkUVgbUCiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
            iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2 = this.a(iReSqtkUVgkyRiReSqtkUVg2);
            if (iReSqtkUVgqECiReSqtkUVg2 == null) continue;
            this.a(iReSqtkUVgbUCiReSqtkUVg2, iReSqtkUVgqECiReSqtkUVg2);
        }
    }

    private List<iReSqtkUVgqECiReSqtkUVg> x() {
        ArrayList<iReSqtkUVgqECiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgqECiReSqtkUVg>();
        if (this.h.i().booleanValue()) {
            arrayList.add(this.b);
        }
        if (this.j.i().booleanValue()) {
            arrayList.add(this.c);
        }
        if (this.i.i().booleanValue()) {
            arrayList.add(this.d);
        }
        if (this.k.i().booleanValue()) {
            arrayList.add(this.e);
        }
        if (this.l.i().booleanValue()) {
            arrayList.add(this.f);
        }
        return arrayList;
    }

    private iReSqtkUVgqECiReSqtkUVg a(iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2) {
        if (iReSqtkUVgbUCiReSqtkUVg2.J()) {
            return null;
        }
        for (iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2 : this.x()) {
            if (!iReSqtkUVgqECiReSqtkUVg2.a(iReSqtkUVgbUCiReSqtkUVg2)) continue;
            return iReSqtkUVgqECiReSqtkUVg2;
        }
        return null;
    }

    private void a(double d2, double d3, double d4) {
        GL11.glVertex3d((double)(d2 - this.g.e()), (double)(d3 - this.g.f()), (double)(d4 - this.g.g()));
    }

    private void a(iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2, iReSqtkUVgqECiReSqtkUVg iReSqtkUVgqECiReSqtkUVg2) {
        if (!iReSqtkUVgbUCiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bv)) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        Color color = iReSqtkUVgqECiReSqtkUVg2.a(iReSqtkUVgbUCiReSqtkUVg2.a());
        if (color == null) {
            color = new Color(255, 255, 255);
        }
        GL11.glPushMatrix();
        GL11.glLineWidth((float)1.5f);
        iReSqtkUVguKSiReSqtkUVg.a(color);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glBegin((int)3);
        double d2 = iReSqtkUVgbUCiReSqtkUVg2.z();
        double d3 = iReSqtkUVgbUCiReSqtkUVg2.A();
        double d4 = iReSqtkUVgbUCiReSqtkUVg2.B();
        double d5 = iReSqtkUVgbUCiReSqtkUVg2.C();
        double d6 = iReSqtkUVgbUCiReSqtkUVg2.D();
        double d7 = iReSqtkUVgbUCiReSqtkUVg2.E();
        this.a(d2, d3, d4);
        while (true) {
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2;
            float f = iReSqtkUVgqECiReSqtkUVg2.a();
            float f2 = iReSqtkUVgqECiReSqtkUVg2.b();
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgmXTiReSqtkUVg.a(d2 - (double)f, d3, d4 - (double)f, d2 + (double)f, d3 + (double)f2, d4 + (double)f);
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(d2, d3, d4);
            iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVguqNiReSqtkUVg2.a(iReSqtkUVgUjriReSqtkUVg3, iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(d2 + d5, d3 + d6, d4 + d7), false, iReSqtkUVgbUCiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bt), false);
            if (iReSqtkUVgVjsiReSqtkUVg2.c()) {
                iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgVjsiReSqtkUVg2.e().d(), iReSqtkUVgVjsiReSqtkUVg2.e().e(), iReSqtkUVgVjsiReSqtkUVg2.e().f());
            }
            List list = iReSqtkUVguqNiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg2.a(d5, d6, d7).b(1.0, 1.0, 1.0));
            double d8 = 0.0;
            for (Object e : list) {
                double d9;
                iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg3;
                iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
                if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n) || iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bw) || !iReSqtkUVgjSjiReSqtkUVg2.W() || iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2) || !(iReSqtkUVgVjsiReSqtkUVg3 = (iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.V().b(0.3, 0.3, 0.3)).a(iReSqtkUVgUjriReSqtkUVg3, iReSqtkUVgUjriReSqtkUVg2)).c() || !((d9 = iReSqtkUVgUjriReSqtkUVg3.b(iReSqtkUVgVjsiReSqtkUVg3.e())) < d8) && d8 != 0.0) continue;
                d8 = d9;
                iReSqtkUVgVjsiReSqtkUVg3.a(iReSqtkUVgjSjiReSqtkUVg2);
                iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgVjsiReSqtkUVg3;
            }
            d2 += d5;
            d3 += d6;
            d4 += d7;
            if (iReSqtkUVgVjsiReSqtkUVg2.c()) {
                d2 = iReSqtkUVgVjsiReSqtkUVg2.e().d();
                d3 = iReSqtkUVgVjsiReSqtkUVg2.e().e();
                d4 = iReSqtkUVgVjsiReSqtkUVg2.e().f();
                break;
            }
            if (d3 < -128.0) break;
            d6 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99;
            this.a(d2 + (d5 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99), d3 + (d6 -= 0.05), d4 + (d7 *= iReSqtkUVgbUCiReSqtkUVg2.as() ? 0.8 : 0.99));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }
}

