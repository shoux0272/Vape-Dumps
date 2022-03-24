/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgASyiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgZfciReSqtkUVg b = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Color", new Color(255, 0, 0));
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Show Distance", false, "Renders the distance next to the arrow.");
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Scale Opacity", false, "Lowers the opacity the farther they are.");
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Healthbar", false, "Renders a healthbar under the distance.");
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Radius Scale", "#.##", "%", 0.0, 0.5, 1.0, 0.05);
    private Map<iReSqtkUVgDfKiReSqtkUVg, double[]> g = new HashMap<iReSqtkUVgDfKiReSqtkUVg, double[]>();

    public iReSqtkUVgASyiReSqtkUVg() {
        super("Arrows", 14223934, iReSqtkUVgqTOiReSqtkUVg.e, "Draws arrows on screen when players\nare out of your field of view.");
        this.a(this.b, this.f, this.c, this.d);
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        this.g.clear();
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            if (!iReSqtkUVgSzRiReSqtkUVg.d.isAssignableFrom(e.getClass()) || iReSqtkUVgSzRiReSqtkUVg.e.isAssignableFrom(e.getClass())) continue;
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(e);
            double d2 = iReSqtkUVgDfKiReSqtkUVg2.Q() + (iReSqtkUVgDfKiReSqtkUVg2.z() - iReSqtkUVgDfKiReSqtkUVg2.Q()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgvwXiReSqtkUVg2.e();
            double d3 = iReSqtkUVgDfKiReSqtkUVg2.R() + (iReSqtkUVgDfKiReSqtkUVg2.A() - iReSqtkUVgDfKiReSqtkUVg2.R()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgvwXiReSqtkUVg2.f();
            double d4 = iReSqtkUVgDfKiReSqtkUVg2.S() + (iReSqtkUVgDfKiReSqtkUVg2.B() - iReSqtkUVgDfKiReSqtkUVg2.S()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - iReSqtkUVgvwXiReSqtkUVg2.g();
            double[] arrd = iReSqtkUVgoCkiReSqtkUVg.a(d2, d3, d4);
            this.g.put(iReSqtkUVgDfKiReSqtkUVg2, arrd);
        }
    }

    @Override
    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgWkmiReSqtkUVg2.a();
        if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d)) {
            return;
        }
        if (iReSqtkUVgVUTiReSqtkUVg.a && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bZ)) {
            return;
        }
        iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
        double d2 = iReSqtkUVgWkmiReSqtkUVg2.b();
        double d3 = iReSqtkUVgWkmiReSqtkUVg2.c();
        double d4 = iReSqtkUVgWkmiReSqtkUVg2.d();
        double[] arrd = iReSqtkUVgoCkiReSqtkUVg.a(d2, d3, d4);
        this.g.put(iReSqtkUVgDfKiReSqtkUVg2, arrd);
    }

    @Override
    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.b() || iReSqtkUVgtlXiReSqtkUVg2.ag().b()) {
            return;
        }
        if (iReSqtkUVgrbbiReSqtkUVg2.k() || !iReSqtkUVgrbbiReSqtkUVg2.d()) {
            return;
        }
        iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgdAbiReSqtkUVg.a(new iReSqtkUVgeLLiReSqtkUVg(), iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
        float f = iReSqtkUVgdAbiReSqtkUVg2.e() / 2;
        float f2 = iReSqtkUVgdAbiReSqtkUVg2.f() / 2;
        double d2 = (double)f2 * this.f.i();
        iReSqtkUVguKSiReSqtkUVg.a(Color.WHITE, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        for (iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 : this.g.keySet()) {
            Color color;
            Object object;
            double[] arrd = this.g.get(iReSqtkUVgjSjiReSqtkUVg2);
            double d3 = arrd[0];
            double d4 = (double)iReSqtkUVgeLLiReSqtkUVg.q() - arrd[1];
            if (arrd[2] < 1.0 && this.a(d3, d4, iReSqtkUVgdAbiReSqtkUVg2)) continue;
            float f3 = this.a(f, d3 / (double)iReSqtkUVgdAbiReSqtkUVg2.d(), f2, d4 / (double)iReSqtkUVgdAbiReSqtkUVg2.d()) + (float)(arrd[2] > 1.0 ? 180 : 0);
            double d5 = d2 * Math.cos(Math.toRadians(f3));
            double d6 = d2 * Math.sin(Math.toRadians(f3));
            int n = (int)(iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2) * 2.0f);
            if (n > 255) {
                n = 255;
            }
            if (this.c.i().booleanValue() && n < 225) {
                GL11.glPushMatrix();
                object = String.valueOf((int)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgjSjiReSqtkUVg2)) + "m";
                GL11.glTranslated((double)(d5 + (double)(iReSqtkUVgdAbiReSqtkUVg2.e() / 2)), (double)(d6 + (double)(iReSqtkUVgdAbiReSqtkUVg2.f() / 2)), (double)0.0);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
                iReSqtkUVgoOBiReSqtkUVg.i();
                color = new Color(255, 255, 255, 255 - (this.d.i() != false ? n : 0));
                iReSqtkUVgpeziReSqtkUVg2.a((String)object, (double)(-iReSqtkUVgpeziReSqtkUVg2.a((String)object) / 2), -iReSqtkUVgpeziReSqtkUVg2.c((String)object), iReSqtkUVgLHHiReSqtkUVg.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                iReSqtkUVgoOBiReSqtkUVg.j();
                GL11.glPopMatrix();
            }
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d5 + (double)(iReSqtkUVgdAbiReSqtkUVg2.e() / 2)), (double)(d6 + (double)(iReSqtkUVgdAbiReSqtkUVg2.f() / 2)), (double)0.0);
            GL11.glRotatef((float)(f3 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.375, (double)0.5, (double)0.0);
            object = this.b.k();
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - (this.d.i() != false ? n : 0));
            iReSqtkUVgMSwiReSqtkUVg.a(color, -16.0f, 0.0f, "exo", 1.0f, false);
            GL11.glPopMatrix();
        }
        this.g.clear();
    }

    private boolean a(double d2, double d3, iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        return d2 > 0.0 && d3 > 0.0 && d2 < (double)iReSqtkUVgeLLiReSqtkUVg.p() && d3 < (double)iReSqtkUVgeLLiReSqtkUVg.q();
    }

    private float a(double d2, double d3, double d4, double d5) {
        return (float)Math.toDegrees(Math.atan2(d5 - d4, d3 - d2));
    }
}

