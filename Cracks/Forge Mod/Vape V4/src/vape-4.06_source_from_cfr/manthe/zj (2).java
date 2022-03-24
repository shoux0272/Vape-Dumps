/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.CQ;
import manthe.DB;
import manthe.E;
import manthe.dA;
import manthe.ds;
import manthe.dx;
import manthe.e3;
import manthe.eJ;
import manthe.eh;
import manthe.gO;
import manthe.gS;
import manthe.gg;
import manthe.gl;
import manthe.kx;
import manthe.n5;
import manthe.nk;
import manthe.on;
import manthe.pe;
import manthe.pf;
import manthe.to;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zj
extends y5 {
    private DB x = DB.a(this, "Show distance", true);
    private gS v;
    private List<n5> w = new CopyOnWriteArrayList<n5>();
    private HashMap<n5, nk> u = new HashMap();

    public zj() {
        super("BedPlates", new Color(245, 0, 37).getRGB(), CQ.h);
        this.a(10L, true);
        this.a(this.x);
    }

    @Override
    public void q() {
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        if (gO2.e() || !gO2.equals(this.v)) {
            this.w.clear();
            this.u.clear();
        }
        int n6 = 100;
        for (int k = -n6; k < n6; ++k) {
            for (int i10 = -n6; i10 < n6; ++i10) {
                int n10 = 0;
                while (n10 != -1) {
                    n10 = n10 == 0 ? 1 : -1;
                    for (int i11 = 0; i11 < 20; ++i11) {
                        int n11;
                        int n12;
                        if (eJ2.e() || gO2.e()) {
                            return;
                        }
                        int n13 = i11 * n10;
                        int n14 = (int)eJ2.z() + k;
                        dx dx2 = gO2.b(n14, n12 = (int)eJ2.l() + n13, n11 = (int)eJ2.g() + i10);
                        int n15 = dx.a(dx2);
                        if (n15 != 26) continue;
                        n5 n52 = new n5(n14, n12, n11);
                        dA dA2 = new dA(dx2);
                        boolean bl = dA2.b(gO2, n14, n12, n11);
                        if (this.w.contains(n52) || bl) continue;
                        this.w.add(n52);
                    }
                }
            }
        }
        this.v = gO2;
    }

    private void S() {
        gO gO2 = ds.t();
        for (n5 n52 : this.w) {
            this.u.computeIfAbsent(n52, arg_0 -> this.lambda$updateExisting$0(n52, arg_0));
            nk nk2 = this.u.get(n52);
            nk2.c();
            dx dx2 = gO2.b(n52.d(), n52.e(), n52.c());
            dA dA2 = new dA(dx2);
            gg gg2 = dA2.c(gO2, n52.d(), n52.e(), n52.c());
            int n6 = gg2.h();
            int n10 = 4;
            for (int k = 1; k < n10; ++k) {
                int n11 = -k;
                int n12 = -k;
                int n13 = k;
                int n14 = k;
                int n15 = 0;
                int n16 = 0;
                if (n6 == 2) {
                    ++n14;
                    ++n16;
                }
                if (n6 == 3) {
                    --n12;
                    --n16;
                }
                if (n6 == 4) {
                    ++n13;
                    ++n15;
                }
                if (n6 == 5) {
                    --n11;
                    --n15;
                }
                for (int i10 = 0; i10 <= k; ++i10) {
                    for (int i11 = n11; i11 <= n13; ++i11) {
                        for (int i12 = n12; i12 <= n14; ++i12) {
                            int n17;
                            if (i11 != n11 && i11 != n13 && i12 != n12 && i12 != n14 && Math.abs(i10) != Math.abs(k)) continue;
                            double d10 = pf.a(n52.d(), n52.c(), n52.d() + i11, n52.c() + i12) + (double)i10;
                            double d11 = pf.a(n52.d() + n15, n52.c() + n16, n52.d() + i11, n52.c() + i12) + (double)i10;
                            boolean bl = false;
                            if (d10 > (double)k && d11 > (double)k) {
                                bl = true;
                            }
                            dx dx3 = gO2.b(n52.d() + i11, n52.e() + i10, n52.c() + i12);
                            int n18 = dx.a(dx3);
                            int n19 = dx3.a(n52.d() + i11, n52.e() + i10, n52.c() + i12);
                            int n20 = n17 = bl ? k + 1 : k;
                            if (n17 >= n10) continue;
                            nk.a(nk2, n17, n18, n19);
                        }
                    }
                }
            }
        }
    }

    private void a(nk nk2) {
        eJ eJ2 = ds.k();
        double d10 = ds.r().m();
        double d11 = ds.r().n();
        double d12 = ds.r().j();
        double d13 = (double)nk2.a().d() - d10 + 0.5;
        double d14 = (double)nk2.a().e() - d11;
        double d15 = (double)nk2.a().c() - d12 + 0.5;
        gl gl2 = ds.O();
        double d16 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)gl2.g() - d10;
        double d17 = eJ2.R() + (eJ2.l() - eJ2.R()) * (double)gl2.g() - d11;
        double d18 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)gl2.g() - d12;
        ds.M().a(1.0);
        for (int k = 1; k < 4; ++k) {
            List<to> list = nk2.a(k);
            for (int i10 = 0; i10 < list.size(); ++i10) {
                to to2 = list.get(i10);
                E.a(to2.b, to2.a);
            }
        }
        Color color = new Color(0, 0, 0, 170);
        double d19 = pf.a(d13, d14, d15, d16, d17, d18);
        double d20 = d19 / 5.0;
        double d21 = 0.01666666753590107 * (d20 * 0.3 * 3.0);
        GL11.glPushMatrix();
        eh.f();
        GL11.glTranslated((double)(d13 + 0.0), (double)(d14 + 1.0), (double)d15);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ds.s().i() == 2) {
            GL11.glRotatef((float)(-ds.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds.r().g(), (float)-1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)(-ds.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds.r().g(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScaled((double)(-d21), (double)(-d21), (double)d21);
        e3.l();
        e3.a(false);
        e3.u();
        e3.r();
        e3.a(770, 771, 1, 0);
        e3.l();
        ArrayList<to> arrayList = new ArrayList<to>();
        for (int k = 1; k < 4; ++k) {
            List<to> list = nk2.a(k);
            int n6 = 0;
            for (int i11 = 0; i11 < list.size(); ++i11) {
                to to3 = list.get(i11);
                if (to3.a()) continue;
                ++n6;
                if (arrayList.contains(to3)) continue;
                arrayList.add(to3);
            }
            if (n6 == 0) break;
        }
        String string = (int)d19 + "m";
        int n10 = Math.max(arrayList.size(), 1);
        float f10 = 22.0f;
        float f11 = n10 * 18 + 6;
        if (this.x.u().booleanValue()) {
            f11 = Math.max((float)(ds.m().c(string) + 4), f11);
        }
        float f12 = -f11 / 2.0f;
        float f13 = -f10;
        if (this.x.u().booleanValue()) {
            f13 -= 8.0f;
            f10 += 8.0f;
        }
        pe.a((double)f12, (double)f13, (double)f11, (double)f10, color);
        float f14 = f12 + 4.0f;
        float f15 = f13 + f10 - 20.0f;
        for (to to4 : arrayList) {
            if (to4.a()) continue;
            E.a(to4.b, to4.a, f14, f15, 16, 16);
            f14 += 18.0f;
        }
        if (arrayList.size() == 0) {
            pe.a(f12 + f11 / 2.0f - 5.0f, f15 + 3.0f, 10.0f, 1.5f, 1.0f, new Color(120, 120, 120, 255));
        }
        if (this.x.u().booleanValue()) {
            ds.m().a(string, (double)(f12 + f11 / 2.0f), (double)(f13 + 2.0f), -1);
        }
        e3.p();
        e3.n();
        e3.g();
        e3.a(true);
        e3.n();
        e3.f();
        e3.a(1.0f, 1.0f, 1.0f, 1.0f);
        eh.h();
        GL11.glPopMatrix();
        ds.M().b(1.0);
    }

    @Override
    public void a(kx kx2) {
        Object object;
        gO gO2 = ds.t();
        if (gO2.e()) {
            return;
        }
        if (!gO2.equals(this.v)) {
            this.w.clear();
            this.u.clear();
            return;
        }
        for (n5 n52 : this.w) {
            object = gO2.b(n52.d(), n52.e(), n52.c());
            int n6 = dx.a((dx)object);
            if (n6 == 26) continue;
            this.w.remove(n52);
            this.u.remove(n52);
        }
        try {
            this.S();
            for (n5 n52 : this.u.keySet()) {
                object = this.u.get(n52);
                this.a((nk)object);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private nk lambda$updateExisting$0(n5 n52, n5 n53) {
        return this.u.put(n53, new nk(n52));
    }
}

