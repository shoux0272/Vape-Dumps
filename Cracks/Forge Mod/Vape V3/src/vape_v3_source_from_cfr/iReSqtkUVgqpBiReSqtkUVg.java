/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgqpBiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgvwXiReSqtkUVg b;
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Ghost Bow Charge", false, "Draws a ghost trajectory of a fully charged\nshot when not pulling back bow");
    private iReSqtkUVgZfciReSqtkUVg d = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Trajectory Color", 128.0);
    private iReSqtkUVgZfciReSqtkUVg e = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Target Color", 64.0);

    public iReSqtkUVgqpBiReSqtkUVg() {
        super("Trajectories", -16535661, iReSqtkUVgqTOiReSqtkUVg.e, "Shows a path of where your projectile will land\nTarget Color will only be used on the cross if there is an entity intersecting it");
        this.a(this.d, this.e, this.c);
        this.b = iReSqtkUVgeLLiReSqtkUVg.s();
    }

    public List a(iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2) {
        ArrayList arrayList = new ArrayList();
        int n = iReSqtkUVgKexiReSqtkUVg.c((iReSqtkUVgmXTiReSqtkUVg2.d() - 2.0) / 16.0);
        int n2 = iReSqtkUVgKexiReSqtkUVg.c((iReSqtkUVgmXTiReSqtkUVg2.g() + 2.0) / 16.0);
        int n3 = iReSqtkUVgKexiReSqtkUVg.c((iReSqtkUVgmXTiReSqtkUVg2.f() - 2.0) / 16.0);
        int n4 = iReSqtkUVgKexiReSqtkUVg.c((iReSqtkUVgmXTiReSqtkUVg2.i() + 2.0) / 16.0);
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        for (int i = n; i <= n2; ++i) {
            for (int k = n3; k <= n4; ++k) {
                if (!iReSqtkUVguqNiReSqtkUVg2.i().a(i, k)) continue;
                iReSqtkUVguqNiReSqtkUVg2.a(i, k).a(iReSqtkUVgeLLiReSqtkUVg.e(), iReSqtkUVgmXTiReSqtkUVg2, arrayList, null);
            }
        }
        return arrayList;
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        boolean bl = false;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.bd().c()) {
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.bd().e();
            if (!(iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aW) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.az) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.H) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aA))) {
                return;
            }
            if (iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aW)) {
                bl = true;
            }
        } else {
            return;
        }
        double d2 = this.b.e() - (double)(iReSqtkUVgKexiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2.F() / 180.0f * (float)Math.PI) * 0.16f);
        double d3 = this.b.f() + (double)iReSqtkUVgtlXiReSqtkUVg2.aa() - (double)0.1f;
        double d4 = this.b.g() - (double)(iReSqtkUVgKexiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.F() / 180.0f * (float)Math.PI) * 0.16f);
        double d5 = (double)(-iReSqtkUVgKexiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.F() / 180.0f * (float)Math.PI) * iReSqtkUVgKexiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2.G() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d6 = (double)(-iReSqtkUVgKexiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.G() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d7 = (double)(iReSqtkUVgKexiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2.F() / 180.0f * (float)Math.PI) * iReSqtkUVgKexiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2.G() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        boolean bl2 = false;
        int n = 40;
        if (!this.c.i().booleanValue() && iReSqtkUVgtlXiReSqtkUVg2.bm() <= 0 && bl) {
            return;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.bm() > 0 && bl) {
            n = iReSqtkUVgtlXiReSqtkUVg2.bm();
            bl2 = true;
        }
        int n2 = 72000 - n;
        float f = (float)n2 / 20.0f;
        if ((double)(f = (f * f + f * 2.0f) / 3.0f) < 0.1) {
            return;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        Color color = this.d.k();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), bl2 || !bl ? 255 : 100);
        iReSqtkUVguKSiReSqtkUVg.a(color2);
        GL11.glPushMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().a(0.0);
        boolean bl3 = GL11.glIsEnabled((int)2929);
        boolean bl4 = GL11.glIsEnabled((int)3553);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        if (bl3) {
            GL11.glDisable((int)2929);
        }
        if (bl4) {
            GL11.glDisable((int)3553);
        }
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl5) {
            GL11.glEnable((int)3042);
        }
        float f2 = iReSqtkUVgKexiReSqtkUVg.a(d5 * d5 + d6 * d6 + d7 * d7);
        d5 /= (double)f2;
        d6 /= (double)f2;
        d7 /= (double)f2;
        d5 *= (double)(bl ? f * 2.0f : 1.0f) * 1.5;
        d6 *= (double)(bl ? f * 2.0f : 1.0f) * 1.5;
        d7 *= (double)(bl ? f * 2.0f : 1.0f) * 1.5;
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        boolean bl6 = false;
        boolean bl7 = false;
        iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = new iReSqtkUVgVjsiReSqtkUVg(null);
        float f3 = (float)(bl ? 0.3 : 0.25);
        for (int i = 0; i <= 999 && !bl6; ++i) {
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(d2, d3, d4);
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(d2 + d5, d3 + d6, d4 + d7);
            iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg3 = iReSqtkUVgeLLiReSqtkUVg.g().a(iReSqtkUVgUjriReSqtkUVg2, iReSqtkUVgUjriReSqtkUVg3, false, true, false);
            iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(d2, d3, d4);
            iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(d2 + d5, d3 + d6, d4 + d7);
            if (iReSqtkUVgVjsiReSqtkUVg3.c()) {
                bl6 = true;
                iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgVjsiReSqtkUVg3;
            }
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgmXTiReSqtkUVg.a(d2 - (double)f3, d3 - (double)f3, d4 - (double)f3, d2 + (double)f3, d3 + (double)f3, d4 + (double)f3);
            List list = this.a(iReSqtkUVgmXTiReSqtkUVg2.a(d5, d6, d7).b(1.0, 1.0, 1.0));
            for (int k = 0; k < list.size(); ++k) {
                iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(list.get(k));
                if (!iReSqtkUVgjSjiReSqtkUVg2.W() || iReSqtkUVgjSjiReSqtkUVg2 == iReSqtkUVgtlXiReSqtkUVg2) continue;
                float f4 = 0.3f;
                iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg3 = iReSqtkUVgjSjiReSqtkUVg2.V().b(0.3f, 0.3f, 0.3f);
                iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg4 = iReSqtkUVgmXTiReSqtkUVg3.a(iReSqtkUVgUjriReSqtkUVg2, iReSqtkUVgUjriReSqtkUVg3);
                if (!iReSqtkUVgVjsiReSqtkUVg4.c()) continue;
                bl6 = true;
                bl7 = true;
                iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgVjsiReSqtkUVg4;
            }
            if (bl7) {
                iReSqtkUVguKSiReSqtkUVg.a(this.e.k());
            }
            float f5 = 0.99f;
            d6 *= (double)f5;
            GL11.glVertex3d((double)((d2 += (d5 *= (double)f5)) - this.b.e()), (double)((d3 += (d6 -= bl ? 0.05 : 0.03)) - this.b.f()), (double)((d4 += (d7 *= (double)f5)) - this.b.g()));
        }
        GL11.glEnd();
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glTranslated((double)(d2 - this.b.e()), (double)(d3 - this.b.f()), (double)(d4 - this.b.g()));
        if (iReSqtkUVgVjsiReSqtkUVg2.c()) {
            switch (iReSqtkUVgVjsiReSqtkUVg2.k()) {
                case 2: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
                case 5: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
            }
            if (bl7) {
                iReSqtkUVguKSiReSqtkUVg.a(this.e.k());
            }
        }
        this.x();
        GL11.glDisable((int)2848);
        if (bl3) {
            GL11.glEnable((int)2929);
        }
        if (bl4) {
            GL11.glEnable((int)3553);
        }
        if (!bl5) {
            GL11.glDisable((int)3042);
        }
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        GL11.glPopMatrix();
    }

    public boolean a(iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2, iReSqtkUVgSxxiReSqtkUVg iReSqtkUVgSxxiReSqtkUVg2) {
        int n = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.d());
        int n2 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.g() + 1.0);
        int n3 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.e());
        int n4 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.h() + 1.0);
        int n5 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.f());
        int n6 = iReSqtkUVgKexiReSqtkUVg.c(iReSqtkUVgmXTiReSqtkUVg2.i() + 1.0);
        if (!iReSqtkUVgeLLiReSqtkUVg.g().a(n, n3, n5, n2, n4, n6)) {
            return false;
        }
        boolean bl = false;
        iReSqtkUVgUjriReSqtkUVg.a(0.0, 0.0, 0.0);
        for (int i = n; i < n2; ++i) {
            for (int k = n3; k < n4; ++k) {
                for (int i2 = n5; i2 < n6; ++i2) {
                    double d2;
                    iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g().a(i, k, i2);
                    if (!iReSqtkUVgGrkiReSqtkUVg2.c() || iReSqtkUVgGrkiReSqtkUVg2.e() != iReSqtkUVgSxxiReSqtkUVg2 || !((double)n4 >= (d2 = (double)((float)(k + 1) - iReSqtkUVgqzYiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.g().b(i, k, i2)))))) continue;
                    bl = true;
                }
            }
        }
        return bl;
    }

    public void x() {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)-0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)-0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glEnd();
    }
}

