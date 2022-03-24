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
import java.util.Iterator;
import manthe.A5;
import manthe.BC;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.E;
import manthe.L;
import manthe.ab;
import manthe.cB;
import manthe.dE;
import manthe.dR;
import manthe.ds;
import manthe.e3;
import manthe.e5;
import manthe.eC;
import manthe.eJ;
import manthe.eh;
import manthe.ej;
import manthe.eq;
import manthe.ex;
import manthe.f4;
import manthe.fE;
import manthe.fG;
import manthe.fV;
import manthe.fX;
import manthe.fb;
import manthe.ff;
import manthe.gO;
import manthe.gS;
import manthe.kA;
import manthe.kf;
import manthe.kx;
import manthe.o7;
import manthe.on;
import manthe.pe;
import manthe.pf;
import manthe.qN;
import manthe.xp;
import manthe.y5;
import manthe.zs;
import manthe.zt;
import org.lwjgl.opengl.GL11;

public class zR
extends y5 {
    private final String x = cB.v + "r";
    private final String z = cB.v + "e=";
    private final String V = cB.v + "c-";
    private final String ab = cB.v + "a+";
    private final Color O = new Color(20, 20, 20, 128);
    private final Color L = new Color(115, 0, 4, 128);
    private final DB K = DB.a((Object)this, "Ignore Invisibles", false, "Determines if we draw a nametag\nfor invisible entities");
    private final DB P = DB.a((Object)this, "Auto Scale", true, "Automatically scales up nametags\nthe further the distance.");
    private final DB Q = DB.a((Object)this, "Hide bots", true, "Hides bots if you're using antibot");
    private final DB aa = DB.a(this, "Render Players", true);
    private final DB Z = DB.a(this, "Health", false);
    private final DB y = DB.a(this, "Distance", false);
    private final DB T = DB.a(this, "Equipment", false);
    private final DB G = DB.a(this, "Effects", false);
    private final DF D = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final DB B = DB.a((Object)this, "Strength Indicator", false, "Gives you an indicator of your enemies\npossible damage relative to yours.\n    " + cB.v + "a+ " + this.x + "Enemy deals less damage than you\n    " + cB.v + "e= " + this.x + "Enemy deals equal damage to you\n    " + cB.v + "c- " + this.x + "Enemy deals more damage than you");
    private final DB U = DB.a((Object)this, "Calculate Effects", false, "Calculates potion effects to determine\ntotal possible damage. (Strength)");
    private final DB H = DB.a(this, "Render Animals", false);
    private final DB u = DB.a(this, "Health", false);
    private final DB w = DB.a(this, "Distance", false);
    private final DB v = DB.a(this, "Effects", false);
    private final DF R = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final DB I = DB.a(this, "Render Mobs", false);
    private final DB C = DB.a(this, "Health", false);
    private final DB W = DB.a(this, "Distance", false);
    private final DB Y = DB.a(this, "Effects", false);
    private final DF S = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final DF E = DF.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private final DF X = DF.a(this, "Opacity", "#.#", "", 0.0, 1.0, 1.0);
    private final qN N = new qN(1);
    private final e5[] J = new e5[]{e5.m(), e5.r(), e5.f(), e5.g(), e5.s(), e5.i(), e5.t(), e5.u(), e5.p(), e5.q(), e5.o(), e5.h(), e5.v()};
    private final e5[] F = e5.k();
    private final HashMap<Integer, fG> A = new HashMap();
    private Object M;

    public zR() {
        super("NameTags", -16711936, CQ.d, "Renders nametags on entities through walls.");
        this.aa.a(this.Z, this.y, this.G, this.D, this.T, this.B);
        this.H.a(this.u, this.w, this.v, this.R);
        this.I.a(this.C, this.W, this.Y, this.S);
        this.B.a(new Ds[]{this.U});
        this.a(this.K, this.P, this.E, this.Q, this.aa, this.Z, this.y, this.G, this.D, this.T, this.B, this.U, this.H, this.u, this.w, this.v, this.R, this.I, this.C, this.W, this.Y, this.S);
    }

    @Override
    public void a(kA kA2) {
        if (ds.t().e()) {
            return;
        }
        eJ eJ2 = ds.k();
        ex ex2 = kA2.getEntity();
        if (!this.a(ex2, ds.t(), eJ2)) {
            return;
        }
        kA2.a(true);
    }

    @Override
    public void a(kf kf2) {
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        if (eJ2.d() && this.aa.u().booleanValue() && this.B.u().booleanValue()) {
            if (this.M == null || gO2.a() != this.M) {
                this.A.clear();
                this.M = gO2.a();
            }
            if (gO2.d()) {
                for (Object e10 : gO2.l()) {
                    fG fG2;
                    eC eC2;
                    ex ex2 = new ex(e10);
                    if (!this.a(ex2, gO2, eJ2) || !ex2.a(A5.cc) || !(eC2 = new eC(e10)).aG().d() || !(fG2 = eC2.aG()).k().a(A5.bO) && !fG2.k().a(A5.aP)) continue;
                    if (this.A.containsKey(eC2.q())) {
                        if (this.a(fG2) >= this.a(this.A.get(eC2.q()))) {
                            this.A.put(eC2.q(), eC2.aG());
                        }
                        return;
                    }
                    this.A.put(eC2.q(), eC2.aG());
                }
            }
        } else if (!this.A.isEmpty()) {
            this.A.clear();
        }
    }

    private boolean a(ex ex2, gS gS2, eJ eJ2) {
        if (gS2.e()) {
            return false;
        }
        if (A5.a8 != null && ex2.a(A5.a8)) {
            return false;
        }
        if (eJ2.a().equals(ex2.a())) {
            return false;
        }
        if (on.p.t().b(ex2) && this.Q.u().booleanValue()) {
            return false;
        }
        if (!gS2.k().contains(ex2.a())) {
            return false;
        }
        if (ex2.e()) {
            return false;
        }
        if (!ex2.a(A5.cF)) {
            return false;
        }
        if (this.K.u().booleanValue() && ex2.ae()) {
            return false;
        }
        if (ex2.a(A5.cc)) {
            if (!this.aa.u().booleanValue()) {
                return false;
            }
            if (this.D.a() != 0.0 && (double)eJ2.a(ex2) > this.D.a()) {
                return false;
            }
        }
        if (pf.f(ex2)) {
            if (!this.H.u().booleanValue()) {
                return false;
            }
            if (this.R.a() != 0.0 && (double)eJ2.a(ex2) > this.R.a()) {
                return false;
            }
        }
        if (pf.d(ex2)) {
            if (!this.I.u().booleanValue()) {
                return false;
            }
            return this.S.a() == 0.0 || !((double)eJ2.a(ex2) > this.S.a());
        }
        return true;
    }

    void a(String string, int n6, int n10, double d10, double d11) {
        int n11 = ((int)d11 & 0xFF) << 24 | 0xFFFFFF;
        double d12 = 1.0 / d10;
        GL11.glPushMatrix();
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        GL11.glScaled((double)d10, (double)d10, (double)d10);
        ds.m().d(string, (double)n6, (double)n10, n11);
        GL11.glScaled((double)d12, (double)d12, (double)d12);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glPopMatrix();
    }

    private void a(fG fG2, int n6, int n10, double d10) {
        double d11;
        double d12;
        int n11;
        try {
            ff ff2 = fG2.l();
            if (ff2.d()) {
                int n12 = 0;
                block2: for (int k = 0; k < ff2.f(); ++k) {
                    e5 e52;
                    short s = ff2.a(k).a("id");
                    short s10 = ff2.a(k).a("lvl");
                    if (s >= this.F.length - 1 || (e52 = this.F[s]).e()) continue;
                    for (e5 e53 : this.J) {
                        if (!e52.equals(e53)) continue;
                        String string = e52.b(s10).substring(0, 1).toLowerCase();
                        string = s10 > 99 ? string + "99+" : string + s10;
                        double d13 = 0.7;
                        double d14 = 1.0 / d13;
                        this.a(string, (int)((double)n6 * d14), (int)((double)(-2 + (n10 + n12)) * d14), d13, d10);
                        n12 += 6;
                        continue block2;
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((n11 = fG2.k().f()) > 0 && (d12 = 1.0 - (d11 = (double)fG2.m() / (double)n11)) < 1.0) {
            int n13 = (int)Math.round(255.0 - d11 * 255.0);
            pe.a(n6 + 2, n10 + 13, 13.0f, 2.0f, Color.BLACK);
            pe.a(n6 + 2, n10 + 13, 12.0f, 1.0f, new Color((255 - n13) / 4, 64, 0, 255));
            pe.c(n6 + 2, n10 + 13, 13.0 * d12, 1.0, o7.a((float)d12));
        }
    }

    @Override
    public void a(kx kx2) {
        ex ex2;
        if (this.B.u().booleanValue() && (this.M == null || ds.t().a() != this.M)) {
            this.A.clear();
            this.M = ds.t().a();
        }
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        double d10 = ds.r().m();
        double d11 = ds.r().n();
        double d12 = ds.r().j();
        double d13 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)kx2.getTicks() - d10;
        double d14 = eJ2.R() + (eJ2.l() - eJ2.R()) * (double)kx2.getTicks() - d11;
        double d15 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)kx2.getTicks() - d12;
        ArrayList<ex> arrayList = new ArrayList<ex>();
        for (Object object : gO2.k()) {
            ex2 = new ex(object);
            if (!this.a(ex2, gO2, eJ2)) continue;
            arrayList.add(ex2);
        }
        Collections.sort(arrayList, new BC(this, eJ2));
        for (ex ex3 : arrayList) {
            if (!ex3.a(A5.cF)) continue;
            GL11.glPushMatrix();
            ex2 = new ej(ex3);
            double d16 = ex2.T() + (ex2.z() - ex2.T()) * (double)kx2.getTicks() - d10;
            double d17 = ex2.R() + (ex2.l() - ex2.R()) * (double)kx2.getTicks() - d11;
            double d18 = ex2.X() + (ex2.g() - ex2.X()) * (double)kx2.getTicks() - d12;
            double d19 = pf.a(d16, d17, d18, d13, d14, d15);
            try {
                if (ex3.a(A5.cc) && this.aa.u().booleanValue()) {
                    this.a(eJ2, (ej)ex2, d16, d17, d18, this.Z.u(), this.y.u(), this.T.u(), this.B.u(), this.G.u(), d19);
                } else if (pf.f(ex3) && this.H.u().booleanValue()) {
                    this.a(eJ2, (ej)ex2, d16, d17, d18, this.u.u(), this.w.u(), false, false, this.v.u(), d19);
                } else if (pf.d(ex3) && this.I.u().booleanValue()) {
                    this.a(eJ2, (ej)ex2, d16, d17, d18, this.C.u(), this.W.u(), false, false, this.Y.u(), d19);
                }
            }
            catch (Exception exception) {
                on.a(exception);
            }
            GL11.glPopMatrix();
        }
    }

    public void a(eC eC2, double d10) {
        Object[] arrobject;
        ds.M().a(1.0);
        double d11 = 1.1;
        double d12 = 1.0 / d11;
        GL11.glPushMatrix();
        GL11.glScaled((double)d11, (double)d11, (double)d11);
        int n6 = -5;
        int n10 = -26;
        for (Object object : arrobject = eC2.aU().g()) {
            if (object == null) continue;
            n6 -= 10;
        }
        e3.l();
        if (!eC2.aG().e()) {
            n6 += 5;
            if (!eC2.aG().k().e()) {
                manthe.E.a(eC2.aG(), (float)n6, (float)n10, 16, 16, (float)d10);
                this.a(eC2.aG(), n6, n10, d10);
            }
        }
        n6 += 5;
        for (int k = arrobject.length - 1; k > -1; --k) {
            fG fG2 = new fG(arrobject[k]);
            if (fG2.e()) continue;
            fG fG3 = fG.a(fG2.k());
            manthe.E.a(fG3, (float)(n6 += 15), (float)n10, 16, 16, (float)d10);
            this.a(fG2, n6, n10, d10);
        }
        GL11.glScaled((double)d12, (double)d12, (double)d12);
        GL11.glPopMatrix();
        ds.M().b(1.0);
    }

    private void a(eC eC2) {
        Object[] arrobject = eC2.aU().g();
        if (!eC2.aG().e()) {
            fG fG2 = eC2.aG();
            manthe.E.a(fG2.k().h(), fG2.m());
        }
        for (int k = arrobject.length - 1; k > -1; --k) {
            fG fG3 = new fG(arrobject[k]);
            if (fG3.e()) continue;
            manthe.E.a(fG3.k().h(), fG3.m());
        }
    }

    private String a(eJ eJ2, ej ej2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        String string = xp.a(ej2);
        String string2 = cB.v + "a" + cB.v + "r" + string;
        ds.M().a(1.0);
        boolean bl5 = ej2.a(A5.cc);
        if (bl) {
            string2 = cB.v + "a[" + cB.v + "f" + (int)eJ2.a(ej2) + cB.v + "a]" + cB.v + "r " + string2;
        }
        if (bl5) {
            double d10;
            float f10;
            double d11;
            double d12;
            Object object;
            ab ab2 = on.p.N().b(ej2.S());
            if (ab2 != null) {
                string2 = ab2.b();
                if (!on.p.N().c.u().booleanValue() && !on.p.N().c.u().booleanValue()) {
                    int n6;
                    object = string.toCharArray();
                    for (int k = n6 = string.indexOf(string2); k > 0; --k) {
                        Object object2 = object[k];
                        if (object2 != 167) continue;
                        object2 = object[k + 1];
                        String string3 = new String(new char[]{(char)object2});
                        string2 = '\u00a7' + string3 + string2;
                        break;
                    }
                }
            }
            if (ej2.a(A5.cc) && ((eC)(object = new eC(ej2))).a8().g()) {
                string2 = cB.v + "a[C] " + cB.v + "r" + string2;
            }
            String string4 = (d12 = 100.0 * ((d11 = (double)((f10 = ej2.a(A5.cc) ? on.p.H().b(zt.class).b(new eC(ej2.a())) : ej2.aD()) / 2.0f)) / (d10 = (double)(ej2.at() / 2.0f)))) > 75.0 ? "2" : (d12 > 50.0 ? "e" : (d12 > 25.0 ? "6" : "4"));
            String string5 = this.N.b(Math.floor((d11 + 0.25) / 0.5) * 0.5);
            if (bl2) {
                string2 = String.format("%s %s%s%s", string2, cB.v, string4, string5);
            }
            if (bl4 && ej2.aR() > 0.0f) {
                String string6 = this.N.b(Math.floor(((double)ej2.aR() + 0.25) / 0.5) * 0.5);
                string2 = String.format("%s %s%s%s", string2, cB.v, "6", string6);
            }
            if (bl3) {
                string2 = String.format("%s %s", string2, this.a(eJ2, ej2));
            }
        }
        return string2;
    }

    private void a(eJ eJ2, ej ej2, double d10, double d11, double d12, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, double d13) {
        Object object;
        Object object2;
        Object object3;
        double d14 = this.X.a();
        if (eJ2.c(ej2)) {
            d14 = 1.0;
        }
        dR dR2 = ds.m();
        boolean bl6 = ej2.a(A5.cc);
        if (bl3 && ej2.a(A5.cc)) {
            object3 = new eC(ej2);
            this.a((eC)object3);
        }
        object3 = this.a(eJ2, ej2, bl2, bl, bl4, bl5);
        L l = new L(ej2.af() ? this.L : this.O);
        L l6 = new L(l);
        int n6 = 0xFFFFFF;
        if ((on.p.t().a(ej2) || on.p.N().a(ej2)) && on.p.N().c.u().booleanValue()) {
            n6 = -12417292;
            l6 = new L(36, 255, 255, (int)(64.0 * d14));
        }
        if (on.p.b().a(ej2) && on.p.b().c.u().booleanValue()) {
            n6 = -12417292;
            l6 = new L(255, 29, 29, (int)(128.0 * d14));
        }
        if (on.p.H().b(zs.class).a(ej2)) {
            n6 = -59882;
        }
        if (ej2.ae()) {
            n6 = 65530;
        }
        if (bl6 && (object2 = on.p.N().b(ej2.S())) != null) {
            object3 = ((ab)object2).b();
            if (on.p.N().c.u().booleanValue() && !on.p.N().c.u().booleanValue()) {
                n6 = on.p.N().e.s();
            }
        }
        l.d((int)((double)l.getAlpha() * d14));
        l6.d((int)((double)l6.getAlpha() * d14));
        object2 = new L(n6);
        ((L)object2).d((int)((double)((L)object2).getAlpha() * d14));
        n6 = ((L)object2).a();
        float f10 = (float)(0.03333335 * this.E.a());
        if (this.P.u().booleanValue()) {
            float f11 = (float)d13;
            float f12 = (double)f11 / 5.0 <= 2.0 ? 2.0f : (float)((double)f11 / 5.0);
            f10 = (float)(0.01666666753590107 * ((double)f12 * this.E.a()));
        }
        int n10 = dR2.c((String)object3) / 2;
        int n11 = -(dR2.b((String)object3) - 1);
        GL11.glPushMatrix();
        eh.f();
        GL11.glTranslated((double)(d10 + 0.0), (double)(d11 + (double)ej2.n() + 0.5), (double)d12);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ds.s().i() == 2) {
            GL11.glRotatef((float)(-ds.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds.r().g(), (float)-1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)(-ds.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds.r().g(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScalef((float)(-f10), (float)(-f10), (float)f10);
        e3.l();
        e3.a(false);
        e3.u();
        e3.r();
        e3.a(770, 771, 1, 0);
        o7.a((double)(-n10) - 2.0, (double)n11, (double)n10 + 2.0, 2.0, 1.0, l, l6);
        e3.p();
        dR2.c((String)object3, (double)(-n10), (double)(n11 + 2), n6);
        boolean bl7 = false;
        if (bl5) {
            object = ej2.aJ();
            int n12 = -((int)object.stream().filter(zR::lambda$renderNametag$0).count() * 10) - 5;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object e10 = iterator.next();
                fE fE2 = new fE(e10);
                if (fE2.f() <= 0) continue;
                fX fX2 = fX.i()[fE2.g()];
                e3.a(1.0f, 1.0f, 1.0f, 1.0f);
                ds.l().a(dE.q());
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
                if (fX2.p()) {
                    int n13 = fX2.j();
                    o7.a(n12 + 6, n11 - 30, n13 % 8 * 18, 198 + n13 / 8 * 18, 18, 18);
                    dR2.d(this.e(fE2.h() + 1), (double)(n12 + 6), (double)(n11 - 30), -1);
                    n12 += 20;
                    bl7 = true;
                }
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            }
        }
        if (bl3) {
            GL11.glPushMatrix();
            if (ej2.a(A5.cc)) {
                object = new eC(ej2);
                if (bl7) {
                    GL11.glTranslated((double)0.0, (double)-8.0, (double)0.0);
                }
                this.a((eC)object, d14);
            }
            GL11.glPopMatrix();
        }
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

    private String e(int n6) {
        String[] arrstring = new String[]{"", "M", "MM", "MMM"};
        String[] arrstring2 = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] arrstring3 = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] arrstring4 = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String string = arrstring[n6 / 1000];
        String string2 = arrstring2[n6 % 1000 / 100];
        String string3 = arrstring3[n6 % 100 / 10];
        String string4 = arrstring4[n6 % 10];
        return string + string2 + string3 + string4;
    }

    private float a(fG fG2) {
        float f10;
        if (fG2 == null || !fG2.k().a(A5.bO) && !fG2.k().a(A5.aP)) {
            return 0.0f;
        }
        if (fG2.k().a(A5.bO)) {
            fb fb2 = new fb(fG2.k().a());
            f10 = fb2.l();
        } else {
            f4 f42 = new f4(fG2.k().a());
            f10 = f42.k();
        }
        return (float)eq.a(e5.f().l(), fG2) * 1.25f + f10 + (float)eq.a(e5.g().l(), fG2) * 0.01f;
    }

    private double b(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            return (double)fV2.m() + (double)((100 - fV2.m()) * eq.a(e5.m().l(), fG2)) * 0.0075;
        }
        return 0.0;
    }

    private float a(eJ eJ2) {
        float f10 = 0.0f;
        for (int k = 0; k < 45; ++k) {
            fG fG2;
            float f11;
            if (!eJ2.aY().a(k).h() || !((f11 = this.a(fG2 = eJ2.aY().a(k).f())) > f10)) continue;
            f10 = f11;
        }
        return f10;
    }

    private String a(eJ eJ2, ej ej2) {
        String string = this.z;
        eC eC2 = new eC(ej2.a());
        if (eJ2.d() && eC2.d()) {
            fE fE2;
            fG fG2 = this.A.getOrDefault(eC2.q(), null);
            float f10 = 0.0f;
            if (fG2 != null && fG2.d()) {
                Object object;
                f10 += this.a(fG2);
                if (eC2.a(fX.o()) && ((fE)(object = eC2.b(fX.o()))).f() > 0) {
                    f10 = (float)((double)f10 * (1.375 * (double)((fE)object).h()));
                }
            }
            for (Object object : eC2.aU().g()) {
                Object object2 = new fG(object);
                f10 = (float)((double)f10 + this.b((fG)object2));
            }
            float f11 = this.a(eJ2);
            if (this.U.u().booleanValue() && eJ2.a(fX.o()) && (fE2 = eJ2.b(fX.o())).f() > 0) {
                f11 = (float)((double)f11 * (1.375 * (double)fE2.h()));
            }
            for (Object object2 : eJ2.aU().g()) {
                fG fG3 = new fG(object2);
                f11 = (float)((double)f11 + this.b(fG3));
            }
            if (f11 > f10) {
                string = this.ab;
            } else if (f11 < f10) {
                string = this.V;
            }
        }
        return string;
    }

    private static boolean lambda$renderNametag$0(Object object) {
        return new fE(object).f() > 0;
    }
}

