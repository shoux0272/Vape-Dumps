/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.AR;
import manthe.L;
import manthe.Y;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ex;
import manthe.gO;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.pe;
import manthe.rj;
import manthe.uW;
import manthe.w2;
import manthe.wM;
import org.lwjgl.opengl.GL11;

public class xs
extends wM {
    private w2 z;

    public xs(w2 w22) {
        this.z = w22;
    }

    @Override
    public void a() {
        this.f(false);
    }

    @Override
    public void k() {
        this.f(true);
    }

    private void f(boolean bl) {
        mq mq2 = on.p.a(1.0);
        double d10 = this.d();
        double d11 = (float)((double)((float)this.c()) - (bl ? this.z.Y().f() : -2.0));
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        if (gO2.e() || eJ2.e()) {
            return;
        }
        List list = gO2.j();
        rj rj2 = rj.al();
        if (rj2.aj.v() == rj2.ak) {
            boolean bl2;
            boolean bl3 = GL11.glIsEnabled((int)3042);
            double d12 = rj2.at.a();
            double d13 = d12 / 2.0;
            double d14 = rj2.av.a();
            double d15 = rj2.aw.a();
            boolean bl4 = bl2 = rj2.au.v() == rj2.ax;
            if (rj2.al.u().booleanValue()) {
                if (bl2) {
                    pe.a(d10, d11, d12, d12, new Color(-1877995504, true), false, 3.0f, 1.0f);
                } else {
                    o7.a(d10, d11, 0.0, d12, 0.0, 0.0, 0.0, 0.5);
                }
            }
            if (rj2.af.u().booleanValue()) {
                o7.a((d10 -= 0.5) + d12 / 2.0 - 0.5, (d11 -= 0.5) + 0.5, d10 + d12 / 2.0 + 0.5, d11 + d12 - 0.5, new Color(-10132123, true));
                o7.a(d10 + 0.5, d11 + d12 / 2.0 - 0.5, d10 + d12 - 0.5, d11 + d12 / 2.0 + 0.5, new Color(-10132123, true));
            }
            if (rj2.al.u().booleanValue() && bl2) {
                pe.a(d10 + 1.0, d11 + 0.5, d12 - 2.0, 1.5, (Color)on.p.t().r.K(), false, 1.0f, 1.0f);
                L l = new L(xs.b.u);
                l.d(100);
                pe.a(d10, d11, d12, d12, (Color)l, 3.0f, 1.0f, 1.0f);
            }
            for (Object e10 : list) {
                double d16;
                double d17;
                if (e10 == eJ2.a()) continue;
                eC eC2 = new eC(e10);
                double d18 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)ds.O().g();
                double d19 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)ds.O().g();
                double d20 = eC2.T() + (eC2.z() - eC2.T()) * (double)ds.O().g();
                double d21 = eC2.X() + (eC2.g() - eC2.X()) * (double)ds.O().g();
                double d22 = d20 - d18;
                double d23 = d21 - d19;
                double d24 = d10 + d13;
                double d25 = d11 + d13;
                float f10 = (float)Math.cos((double)eJ2.U() * (Math.PI / 180));
                float f11 = (float)Math.sin((double)eJ2.U() * (Math.PI / 180));
                double d26 = -(d22 * (double)f10 + d23 * (double)f11) * d14;
                double d27 = -(d23 * (double)f10 - d22 * (double)f11) * d14;
                if (bl2) {
                    d17 = d24 + (rj2.aq.u() == false ? d26 : Y.a(d26, -d13 + d15 / 2.0, d13 - d15 / 2.0));
                    d16 = d25 + (rj2.aq.u() == false ? d27 : Y.a(d27, -d13 + d15 / 2.0, d13 - d15 / 2.0));
                    d16 = Math.max(d16, d11 + 4.0);
                } else {
                    if (rj2.aq.u().booleanValue() && Math.sqrt(d26 * d26 + d27 * d27) > d13) {
                        float f12 = (float)Math.atan2(d27, d26);
                        d26 = (float)((d13 - 0.5) * Math.cos(f12));
                        d27 = (float)((d13 - 0.5) * Math.sin(f12));
                    }
                    d17 = d24 + d26;
                    d16 = d25 + d27;
                }
                Color color = Color.WHITE;
                if (rj2.aB.v() == rj2.ag) {
                    color = rj2.az.K();
                } else if (rj2.aB.v() == rj2.aC) {
                    L l = on.p.t().a(eC2, true);
                    if (l != null) {
                        color = l;
                    }
                } else if (rj2.aB.v() == rj2.am) {
                    Color color2 = color = on.p.t().a((ex)eC2) ? rj2.ar.K() : rj2.ap.K();
                }
                if (on.p.N().c(eC2.S()) && on.p.N().c.u().booleanValue()) {
                    color = on.p.N().e.K();
                }
                if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
                    color = on.p.b().e.K();
                }
                if (rj2.an.v() == rj2.ae) {
                    o7.a(d17 - d15 / 2.0, d16 - d15 / 2.0, d17 + d15 / 2.0, d16 + d15 / 2.0, 0.5, color, new Color(0x50000000, true));
                    continue;
                }
                double d28 = d15 / 2.0;
                pe.b(d17 - d28, d16 - d28, d15, 0.5, color);
                pe.a((float)(d17 - d28), (float)(d16 - d28), (float)d15, 1.0f, 0.75f, new Color(-16777216, true));
            }
            if (bl3 && !GL11.glIsEnabled((int)3042)) {
                GL11.glEnable((int)3042);
            }
        } else {
            List<eC> list2 = new ArrayList<eC>();
            ArrayList arrayList = new ArrayList();
            int n6 = rj2.aA.a().intValue();
            for (Object e11 : list) {
                if (!A5.cc.isAssignableFrom(e11.getClass()) || e11 == eJ2.a() || arrayList.contains(e11)) continue;
                eC eC3 = new eC(e11);
                if (n6 != 0 && !(eJ2.a(eC3) <= (float)n6) || on.p.t().b((ex)eC3)) continue;
                list2.add(eC3);
                arrayList.add(e11);
            }
            if (list2.isEmpty()) {
                return;
            }
            list2.sort(new AR(this, eJ2));
            int n10 = rj2.ai.a().intValue();
            int n11 = 0;
            if (rj2.ai.a() != 0.0 && list2.size() > n10) {
                n11 = list2.size() - n10;
                list2 = list2.subList(0, n10);
            }
            int n12 = 0;
            for (eC eC4 : list2) {
                int n13 = (int)eJ2.a(eC4);
                String string = n13 > 100 ? "a" : (n13 > 50 ? "e" : "c");
                String string2 = String.format("\u00a7%s%dm", string, n13);
                if (rj2.al.u().booleanValue()) {
                    o7.a(d10, d11 + (double)n12, d10 + this.e(), d11 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d10, d11 + (double)n12 + 9.5, d10 + this.e(), d11 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                int n14 = on.p.N().a(eC4) ? on.p.N().e.s() : (on.p.b().a(eC4) ? on.p.b().e.s() : -1);
                mq2.a(eC4.S(), d10 + 1.0, d11 + 2.0 + (double)n12, n14);
                mq2.a(string2, d10 + this.e() - mq2.b(string2) - 1.0, d11 + 2.0 + (double)n12, -1);
                n12 += 10;
            }
            if (n11 > 0) {
                if (rj2.al.u().booleanValue()) {
                    o7.a(d10, d11 + (double)n12, d10 + this.e(), d11 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d10, d11 + (double)n12 + 9.5, d10 + this.e(), d11 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                mq2.a(n11 + " more...", d10 + 1.0, d11 + 2.0 + (double)n12, -1);
            }
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
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }
}

