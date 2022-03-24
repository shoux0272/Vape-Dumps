/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class iReSqtkUVgXVRiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Distance");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("FOV");
    private iReSqtkUVgZyLiReSqtkUVg d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Sort Target", this.b, this.b, this.c);
    private iReSqtkUVgkzHiReSqtkUVg e = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Max angle", "#", "", 35.0, 90.0, 360.0, 5.0);
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private iReSqtkUVgkzHiReSqtkUVg g = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Target invisibles", false);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Silent Aim", false, "Aims silently server side\nMay not bypass anti-cheats well");
    private float j;
    private float k;
    private HashMap<Integer, iReSqtkUVgksUiReSqtkUVg> l = new HashMap();

    public iReSqtkUVgXVRiReSqtkUVg() {
        super("BowAimbot", new Color(198, 53, 53).getRGB(), iReSqtkUVgqTOiReSqtkUVg.c, "Aims at a target with prediction + correction.");
        this.i.b(true);
        this.a(this.d, this.i, this.h, this.f, this.g, this.e);
    }

    private void b(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = this.x();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgVnKiReSqtkUVg2 != null && iReSqtkUVgVnKiReSqtkUVg2.c() && iReSqtkUVgtlXiReSqtkUVg2.bk() && iReSqtkUVgtlXiReSqtkUVg2.aJ().c() && iReSqtkUVgtlXiReSqtkUVg2.aJ().e().a(iReSqtkUVgSzRiReSqtkUVg.aW)) {
            float[] arrf = this.a(iReSqtkUVgVnKiReSqtkUVg2, 1.0f, this.j);
            float f = arrf[0];
            if (f > this.f.i().floatValue()) {
                f = this.f.i().floatValue();
            } else if (f < -this.f.i().floatValue()) {
                f = -this.f.i().floatValue();
            }
            float f2 = this.j + f;
            float f3 = -(this.k - arrf[1]);
            if (f3 > this.g.i().floatValue()) {
                f3 = this.g.i().floatValue();
            } else if (f3 < -this.g.i().floatValue()) {
                f3 = -this.g.i().floatValue();
            }
            float f4 = this.k + f3;
            if (this.i.j().booleanValue()) {
                this.j = f2;
                iReSqtkUVgTXviReSqtkUVg2.setRotationYaw(this.j);
                if (!Float.isNaN(f4)) {
                    this.k = f4;
                    iReSqtkUVgTXviReSqtkUVg2.setRotationPitch(this.k);
                }
            } else {
                this.j = f2;
                iReSqtkUVgtlXiReSqtkUVg2.f(this.j);
                if (!Float.isNaN(f4)) {
                    this.k = f4;
                    iReSqtkUVgtlXiReSqtkUVg2.g(this.k);
                }
            }
        } else {
            this.j = iReSqtkUVgtlXiReSqtkUVg2.F();
            this.k = iReSqtkUVgtlXiReSqtkUVg2.G();
            this.l.clear();
        }
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (a.a.ib()) {
            return;
        }
        this.b((iReSqtkUVgTXviReSqtkUVg)null);
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (iReSqtkUVgTXviReSqtkUVg2.isPre()) {
            this.b(iReSqtkUVgTXviReSqtkUVg2);
        }
    }

    private float[] a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, float f, float f2) {
        double[] arrd;
        double d2 = iReSqtkUVgVnKiReSqtkUVg2.z() - iReSqtkUVgVnKiReSqtkUVg2.Q();
        double d3 = iReSqtkUVgVnKiReSqtkUVg2.B() - iReSqtkUVgVnKiReSqtkUVg2.S();
        double d4 = iReSqtkUVgVnKiReSqtkUVg2.A() - iReSqtkUVgVnKiReSqtkUVg2.R();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (d2 != 0.0 || d3 != 0.0) {
            if (this.l.containsKey(iReSqtkUVgVnKiReSqtkUVg2.y())) {
                this.l.put(iReSqtkUVgVnKiReSqtkUVg2.y(), iReSqtkUVgksUiReSqtkUVg.a(this.l.get(iReSqtkUVgVnKiReSqtkUVg2.y()), d2, d3, iReSqtkUVgtlXiReSqtkUVg2.L()));
            } else {
                this.l.put(iReSqtkUVgVnKiReSqtkUVg2.y(), new iReSqtkUVgksUiReSqtkUVg(this, d2, d3, null));
            }
        }
        if (d2 == 0.0 && d3 == 0.0) {
            double[] arrd2 = new double[2];
            arrd2[0] = 0.0;
            arrd = arrd2;
            arrd2[1] = 0.0;
        } else {
            arrd = iReSqtkUVgksUiReSqtkUVg.a(this.l.get(iReSqtkUVgVnKiReSqtkUVg2.y()));
        }
        double[] arrd3 = arrd;
        double d5 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2);
        d5 -= d5 % 0.8;
        double d6 = d5 / 0.8 * arrd3[0] * 0.66;
        double d7 = d5 / 0.8 * arrd3[1] * 0.66;
        double d8 = 0.0;
        if (!iReSqtkUVgVnKiReSqtkUVg2.J() && !iReSqtkUVgVnKiReSqtkUVg2.am() && d4 < 0.0 && iReSqtkUVgVnKiReSqtkUVg2.ah() > 1.0f) {
            d6 *= 0.15;
            d7 *= 0.15;
            d8 = d5 / 0.8 * d4 * 0.5;
            d8 += d8 * 0.98 - 0.08;
        }
        double d9 = iReSqtkUVgVnKiReSqtkUVg2.z() + d6 - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d10 = iReSqtkUVgVnKiReSqtkUVg2.B() + d7 - iReSqtkUVgtlXiReSqtkUVg2.B();
        float f3 = this.a(d9, d10, f2);
        float f4 = iReSqtkUVgjbYiReSqtkUVg.a(new iReSqtkUVgeAuiReSqtkUVg(iReSqtkUVgVnKiReSqtkUVg2.z() + d6, iReSqtkUVgVnKiReSqtkUVg2.A() + (double)iReSqtkUVgVnKiReSqtkUVg2.aa() + d8, iReSqtkUVgVnKiReSqtkUVg2.B() + d7), (double)f * 2.93);
        return new float[]{f3, f4};
    }

    private float a(double d2, double d3, float f) {
        double d4 = d3 < 0.0 && d2 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d3 / d2)) : (d3 < 0.0 && d2 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d3 / d2)) : Math.toDegrees(-Math.atan(d2 / d3)));
        return iReSqtkUVgKexiReSqtkUVg.g(-(f - (float)d4));
    }

    private iReSqtkUVgVnKiReSqtkUVg x() {
        ArrayList<iReSqtkUVgVnKiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgVnKiReSqtkUVg>();
        ArrayList arrayList2 = new ArrayList(iReSqtkUVgeLLiReSqtkUVg.g().e());
        for (Object e : arrayList2) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2;
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (iReSqtkUVgVUTiReSqtkUVg.a && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bZ) || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n) || !this.a(iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(e))) continue;
            arrayList.add(iReSqtkUVgVnKiReSqtkUVg2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.d.i() == this.c) {
            arrayList.sort(new iReSqtkUVgoAYiReSqtkUVg(this, null));
        }
        if (this.d.i() == this.b) {
            arrayList.sort(new iReSqtkUVgIFgiReSqtkUVg(this, null));
        }
        return (iReSqtkUVgVnKiReSqtkUVg)arrayList.get(0);
    }

    private boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        if (iReSqtkUVgVnKiReSqtkUVg2.b()) {
            return false;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            return false;
        }
        if (!this.b(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.aF() <= 0.0f || iReSqtkUVgVnKiReSqtkUVg2.K()) {
            return false;
        }
        if (iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgeLLiReSqtkUVg.e(), iReSqtkUVgVnKiReSqtkUVg2) > this.e.i().intValue() / 2) {
            return false;
        }
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.j().c(iReSqtkUVgVnKiReSqtkUVg2.x());
        if (iReSqtkUVgMWviReSqtkUVg2 != null && !iReSqtkUVgMWviReSqtkUVg2.d()) {
            return false;
        }
        return iReSqtkUVgeLLiReSqtkUVg.e().b(iReSqtkUVgVnKiReSqtkUVg2);
    }

    private boolean b(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        return iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2, this.h.i() == false);
    }
}

