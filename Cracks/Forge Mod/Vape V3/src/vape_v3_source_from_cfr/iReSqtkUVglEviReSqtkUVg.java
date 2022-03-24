/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVglEviReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private Color b = new Color(20, 20, 20, 64);
    private Color c = new Color(115, 0, 4, 128);
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Ignore Invisibles", false, "Determines if we draw a nametag\nfor invisible entities");
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Players", true);
    private iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a(this, "Health", false);
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance", false);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Equipment", false);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Animals", false);
    private iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a(this, "Health", false);
    private iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance", false);
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Mobs", false);
    private iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a(this, "Health", false);
    private iReSqtkUVgoRmiReSqtkUVg n = iReSqtkUVgoRmiReSqtkUVg.a(this, "Distance", false);
    private iReSqtkUVgoRmiReSqtkUVg o = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Hide bots", true, "Hides bots if you're using antibot");
    private iReSqtkUVgkzHiReSqtkUVg p = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private iReSqtkUVgLcXiReSqtkUVg q = new iReSqtkUVgLcXiReSqtkUVg(1);
    private iReSqtkUVgnbDiReSqtkUVg[] r = new iReSqtkUVgnbDiReSqtkUVg[]{iReSqtkUVgnbDiReSqtkUVg.d(), iReSqtkUVgnbDiReSqtkUVg.e(), iReSqtkUVgnbDiReSqtkUVg.f(), iReSqtkUVgnbDiReSqtkUVg.g(), iReSqtkUVgnbDiReSqtkUVg.h(), iReSqtkUVgnbDiReSqtkUVg.i(), iReSqtkUVgnbDiReSqtkUVg.j(), iReSqtkUVgnbDiReSqtkUVg.k(), iReSqtkUVgnbDiReSqtkUVg.l(), iReSqtkUVgnbDiReSqtkUVg.m(), iReSqtkUVgnbDiReSqtkUVg.n(), iReSqtkUVgnbDiReSqtkUVg.o(), iReSqtkUVgnbDiReSqtkUVg.p()};
    private iReSqtkUVgnbDiReSqtkUVg[] s = iReSqtkUVgnbDiReSqtkUVg.q();

    public iReSqtkUVglEviReSqtkUVg() {
        super("NameTags", -16711936, iReSqtkUVgqTOiReSqtkUVg.e, "Renders nametags on entities through walls.");
        this.e.a(this.f, this.g, this.h);
        this.i.a(this.j, this.k);
        this.l.a(this.m, this.n);
        this.a(this.d, this.p, this.o, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override
    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgWkmiReSqtkUVg2.a();
        if (!this.a(iReSqtkUVgjSjiReSqtkUVg2)) {
            return;
        }
        iReSqtkUVgWkmiReSqtkUVg2.h().d(true);
    }

    private boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return false;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgSzRiReSqtkUVg.bZ != null && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bZ)) {
            return false;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.a().equals(iReSqtkUVgjSjiReSqtkUVg2.a())) {
            return false;
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgjSjiReSqtkUVg2) && this.o.i().booleanValue()) {
            return false;
        }
        if (!iReSqtkUVgeLLiReSqtkUVg.g().e().contains(iReSqtkUVgjSjiReSqtkUVg2.a())) {
            return false;
        }
        if (iReSqtkUVgjSjiReSqtkUVg2.b()) {
            return false;
        }
        if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n)) {
            return false;
        }
        if (this.d.i().booleanValue() && iReSqtkUVgjSjiReSqtkUVg2.O()) {
            return false;
        }
        return !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d) || this.e.i() != false;
    }

    void a(String string, int n, int n2, double d2) {
        double d3 = 1.0 / d2;
        GL11.glPushMatrix();
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        GL11.glScaled((double)d2, (double)d2, (double)d2);
        iReSqtkUVgeLLiReSqtkUVg.h().a(string, (double)n, (double)n2, -1);
        GL11.glScaled((double)d3, (double)d3, (double)d3);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glPopMatrix();
    }

    private void a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2, int n, int n2) {
        iReSqtkUVgAEkiReSqtkUVg iReSqtkUVgAEkiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.h();
        if (iReSqtkUVgAEkiReSqtkUVg2.b()) {
            return;
        }
        try {
            int n3 = 0;
            block2: for (int i = 0; i < iReSqtkUVgAEkiReSqtkUVg2.d(); ++i) {
                iReSqtkUVgnbDiReSqtkUVg iReSqtkUVgnbDiReSqtkUVg2;
                short s = iReSqtkUVgAEkiReSqtkUVg2.a(i).a("id");
                short s2 = iReSqtkUVgAEkiReSqtkUVg2.a(i).a("lvl");
                if (s >= this.s.length - 1 || (iReSqtkUVgnbDiReSqtkUVg2 = this.s[s]).b()) continue;
                for (iReSqtkUVgnbDiReSqtkUVg iReSqtkUVgnbDiReSqtkUVg3 : this.r) {
                    if (!iReSqtkUVgnbDiReSqtkUVg2.equals(iReSqtkUVgnbDiReSqtkUVg3)) continue;
                    String string = iReSqtkUVgnbDiReSqtkUVg2.a(s2).substring(0, 1).toLowerCase();
                    string = s2 > 99 ? string + "99+" : string + s2;
                    double d2 = 0.7;
                    double d3 = 1.0 / d2;
                    this.a(string, (int)((double)n * d3), (int)((double)(-2 + (n2 + n3)) * d3), d2);
                    n3 += 6;
                    continue block2;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        double d2 = iReSqtkUVgeLLiReSqtkUVg.s().e();
        double d3 = iReSqtkUVgeLLiReSqtkUVg.s().f();
        double d4 = iReSqtkUVgeLLiReSqtkUVg.s().g();
        boolean bl = GL11.glIsEnabled((int)3042);
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (!this.a(iReSqtkUVgjSjiReSqtkUVg2) || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n)) continue;
            GL11.glPushMatrix();
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2);
            double d5 = iReSqtkUVgVnKiReSqtkUVg2.Q() + (iReSqtkUVgVnKiReSqtkUVg2.z() - iReSqtkUVgVnKiReSqtkUVg2.Q()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d2;
            double d6 = iReSqtkUVgVnKiReSqtkUVg2.R() + (iReSqtkUVgVnKiReSqtkUVg2.A() - iReSqtkUVgVnKiReSqtkUVg2.R()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d3;
            double d7 = iReSqtkUVgVnKiReSqtkUVg2.S() + (iReSqtkUVgVnKiReSqtkUVg2.B() - iReSqtkUVgVnKiReSqtkUVg2.S()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d4;
            if (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d) && this.e.i().booleanValue()) {
                this.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2, d5, d6, d7, this.f.i(), this.g.i(), this.h.i());
            } else if (iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgjSjiReSqtkUVg2) && this.i.i().booleanValue()) {
                this.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2, d5, d6, d7, this.j.i(), this.k.i(), false);
            } else if (iReSqtkUVgrseiReSqtkUVg.c(iReSqtkUVgjSjiReSqtkUVg2) && this.l.i().booleanValue()) {
                this.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2, d5, d6, d7, this.m.i(), this.n.i(), false);
            }
            GL11.glPopMatrix();
        }
    }

    public void a(iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2, boolean bl, int n) {
        Object[] arrobject;
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        double d2 = 1.1;
        double d3 = 1.0 / d2;
        GL11.glPushMatrix();
        GL11.glScaled((double)d2, (double)d2, (double)d2);
        int n2 = -5;
        int n3 = -26;
        for (Object object : arrobject = iReSqtkUVgDfKiReSqtkUVg2.aZ().f()) {
            if (object == null) continue;
            n2 -= 10;
        }
        iReSqtkUVgoOBiReSqtkUVg.f();
        if (!iReSqtkUVgDfKiReSqtkUVg2.aJ().b()) {
            n2 += 5;
            if (!iReSqtkUVgDfKiReSqtkUVg2.aJ().e().b()) {
                if (!bl) {
                    iReSqtkUVgeLLiReSqtkUVg.v().a(iReSqtkUVgeLLiReSqtkUVg.h(), iReSqtkUVgeLLiReSqtkUVg.t(), iReSqtkUVgyetiReSqtkUVg.a(iReSqtkUVgDfKiReSqtkUVg2.aJ().e()), n2, n3);
                } else {
                    iReSqtkUVgeLLiReSqtkUVg.v().b(iReSqtkUVgeLLiReSqtkUVg.h(), iReSqtkUVgeLLiReSqtkUVg.t(), iReSqtkUVgDfKiReSqtkUVg2.aJ(), n2, n3);
                    this.a(iReSqtkUVgDfKiReSqtkUVg2.aJ(), n2, n3);
                }
                GL11.glEnable((int)3008);
            }
        }
        n2 += 5;
        for (int i = arrobject.length - 1; i > -1; --i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(arrobject[i]);
            if (iReSqtkUVgyetiReSqtkUVg2.b()) continue;
            n2 += 15;
            if (!bl) {
                iReSqtkUVgeLLiReSqtkUVg.v().a(iReSqtkUVgeLLiReSqtkUVg.h(), iReSqtkUVgeLLiReSqtkUVg.t(), iReSqtkUVgyetiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2.e()), n2, n3);
            } else {
                iReSqtkUVgeLLiReSqtkUVg.v().b(iReSqtkUVgeLLiReSqtkUVg.h(), iReSqtkUVgeLLiReSqtkUVg.t(), iReSqtkUVgyetiReSqtkUVg2, n2, n3);
                this.a(iReSqtkUVgyetiReSqtkUVg2, n2, n3);
            }
            GL11.glEnable((int)3008);
        }
        GL11.glScaled((double)d3, (double)d3, (double)d3);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }

    private void a(iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, double d2, double d3, double d4, boolean bl, boolean bl2, boolean bl3) {
        float f;
        double d5;
        double d6;
        double d7;
        Object object;
        Object object2;
        String string = iReSqtkUVgVnKiReSqtkUVg2.aB().e();
        String string2 = iReSqtkUVgVUTiReSqtkUVg.b + "a" + iReSqtkUVgVUTiReSqtkUVg.b + "r" + string;
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        boolean bl4 = iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d);
        int n = 0xFFFFFF;
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2) && iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
            n = -12417292;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.O()) {
            n = 65530;
        }
        if (bl4 && (object2 = iReSqtkUVgFuiiReSqtkUVg.e.j().c(iReSqtkUVgVnKiReSqtkUVg2.x())) != null) {
            string2 = ((iReSqtkUVgMWviReSqtkUVg)object2).b();
            if (iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
                n = iReSqtkUVgFuiiReSqtkUVg.e.j().e.l();
            } else {
                int n2;
                object = string.toCharArray();
                for (int i = n2 = string.indexOf(string2); i > 0; --i) {
                    Object object3 = object[i];
                    if (object3 != 167) continue;
                    object3 = object[i + 1];
                    String string3 = new String(new char[]{(char)object3});
                    string2 = '\u00a7' + string3 + string2;
                    break;
                }
            }
        }
        if (bl2) {
            string2 = iReSqtkUVgVUTiReSqtkUVg.b + "a[" + iReSqtkUVgVUTiReSqtkUVg.b + "f" + (int)iReSqtkUVgDfKiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2) + iReSqtkUVgVUTiReSqtkUVg.b + "a]" + iReSqtkUVgVUTiReSqtkUVg.b + "r " + string2;
        }
        Object object4 = object2 = iReSqtkUVgVnKiReSqtkUVg2.M() ? this.c : this.b;
        if (iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d) && ((iReSqtkUVgDfKiReSqtkUVg)(object = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgVnKiReSqtkUVg2))).bg().d()) {
            string2 = iReSqtkUVgVUTiReSqtkUVg.b + "a[C] " + iReSqtkUVgVUTiReSqtkUVg.b + "r" + string2;
        }
        String string4 = (d7 = 100.0 * ((d6 = (double)(iReSqtkUVgVnKiReSqtkUVg2.aF() / 2.0f)) / (d5 = (double)(iReSqtkUVgVnKiReSqtkUVg2.aR() / 2.0f)))) > 75.0 ? "2" : (d7 > 50.0 ? "e" : (d7 > 25.0 ? "6" : "4"));
        String string5 = this.q.b(Math.floor((d6 + 0.25) / 0.5) * 0.5);
        if (bl) {
            string2 = String.format("%s %s%s%s", string2, iReSqtkUVgVUTiReSqtkUVg.b, string4, string5);
        }
        float f2 = (f = iReSqtkUVgDfKiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2)) / 5.0f <= 2.0f ? 2.0f : f / 5.0f;
        float f3 = (float)(0.01666666753590107 * ((double)f2 * this.p.i()));
        GL11.glPushMatrix();
        iReSqtkUVgnsxiReSqtkUVg.e();
        GL11.glTranslated((double)(d2 + 0.0), (double)(d3 + (double)iReSqtkUVgVnKiReSqtkUVg2.T() + 0.5), (double)d4);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (iReSqtkUVgeLLiReSqtkUVg.i().u() == 2) {
            GL11.glRotatef((float)(-iReSqtkUVgeLLiReSqtkUVg.s().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)iReSqtkUVgeLLiReSqtkUVg.s().h(), (float)-1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)(-iReSqtkUVgeLLiReSqtkUVg.s().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)iReSqtkUVgeLLiReSqtkUVg.s().h(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScalef((float)(-f3), (float)(-f3), (float)f3);
        iReSqtkUVgoOBiReSqtkUVg.f();
        iReSqtkUVgoOBiReSqtkUVg.a(false);
        iReSqtkUVgoOBiReSqtkUVg.h();
        iReSqtkUVgoOBiReSqtkUVg.i();
        iReSqtkUVgoOBiReSqtkUVg.a(770, 771, 1, 0);
        int n3 = iReSqtkUVgpeziReSqtkUVg2.a(string2) / 2;
        int n4 = -(iReSqtkUVgpeziReSqtkUVg2.b(string2) - 1);
        iReSqtkUVgoOBiReSqtkUVg.f();
        iReSqtkUVguKSiReSqtkUVg.a((double)(-n3) - 2.0, (double)n4, (double)n3 + 2.0, 2.0, (Color)object2);
        iReSqtkUVgoOBiReSqtkUVg.k();
        iReSqtkUVgpeziReSqtkUVg2.b(string2, (double)(-n3), (double)(n4 + 2), n);
        if (bl3) {
            GL11.glPushMatrix();
            if (iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d)) {
                iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg3 = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgVnKiReSqtkUVg2);
                GL11.glPushMatrix();
                if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                    float f4 = -110.0f;
                    float f5 = iReSqtkUVgeLLiReSqtkUVg.v().e();
                    if (f5 != 0.0f) {
                        f4 -= f5 + 20.0f;
                    }
                    GL11.glTranslated((double)0.0, (double)0.0, (double)f4);
                }
                this.a(iReSqtkUVgDfKiReSqtkUVg3, false, (int)f2);
                GL11.glPopMatrix();
                this.a(iReSqtkUVgDfKiReSqtkUVg3, true, (int)f2);
            }
            GL11.glPopMatrix();
        }
        iReSqtkUVgoOBiReSqtkUVg.e();
        iReSqtkUVgoOBiReSqtkUVg.g();
        iReSqtkUVgoOBiReSqtkUVg.a(true);
        iReSqtkUVgoOBiReSqtkUVg.e();
        iReSqtkUVgoOBiReSqtkUVg.j();
        iReSqtkUVgoOBiReSqtkUVg.a(1.0f, 1.0f, 1.0f, 1.0f);
        iReSqtkUVgnsxiReSqtkUVg.d();
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }
}

