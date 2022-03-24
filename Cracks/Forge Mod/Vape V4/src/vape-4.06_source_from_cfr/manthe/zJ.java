/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Sphere
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.ef;
import manthe.es;
import manthe.kx;
import manthe.o7;
import manthe.y5;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;

public class zJ
extends y5 {
    public DB u = DB.a((Object)this, "Blast ring", true, "Shows the blast radius where blocks will be broken");

    public zJ() {
        super("Explosions", 11534100, CQ.d, "Shows the explosion radius of TNT");
        this.a(this.u);
    }

    @Override
    public void a(kx kx2) {
        ef ef2 = ds.r();
        double d10 = ef2.m();
        double d11 = ef2.n();
        double d12 = ef2.j();
        boolean bl = GL11.glIsEnabled((int)3042);
        double d13 = 4.0;
        double d14 = 8.0;
        for (Object e10 : ds.t().k()) {
            Sphere sphere;
            if (!A5.bl.isAssignableFrom(e10.getClass())) continue;
            es es2 = new es(e10);
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            float f10 = kx2.getTicks();
            double d15 = es2.T() + (es2.z() - es2.T()) * (double)f10;
            double d16 = es2.R() + (es2.l() - es2.R()) * (double)f10;
            double d17 = es2.X() + (es2.g() - es2.X()) * (double)f10;
            double d18 = ds.k().a(d15, d16, d17);
            GL11.glTranslated((double)(d15 - d10), (double)(d16 - d11), (double)(d17 - d12));
            float f11 = ((float)(es2.at() % 5) - f10 + 1.0f) / 5.0f;
            float f12 = es2.at() / 5 % 2 == 0 ? 1.0f : f11 * f11;
            int n6 = Math.max(Math.min((int)(255.0f * f12), 255), 0);
            if (this.u.u().booleanValue()) {
                o7.a(255, 255, 0, (int)((float)n6 * 0.75f));
                sphere = new Sphere();
                sphere.setDrawStyle(100011);
                sphere.draw((float)d13, 24, 24);
            }
            o7.a(255, 0, 0, (int)((float)n6 * 0.4f));
            sphere = new Sphere();
            sphere.setDrawStyle(100012);
            sphere.setOrientation(d18 < d14 ? 100021 : 100020);
            sphere.draw((float)d14, 32, 32);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
        }
        if (bl) {
            GL11.glEnable((int)3042);
        }
    }
}

