/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgjzViReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgZGNiReSqtkUVg b = (iReSqtkUVgZGNiReSqtkUVg)this.x();

    public iReSqtkUVgjzViReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        float f = 57.29578f;
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        iReSqtkUVgeLLiReSqtkUVg.n().a(0.0);
        double d2 = iReSqtkUVgvwXiReSqtkUVg2.e();
        double d3 = iReSqtkUVgvwXiReSqtkUVg2.f();
        double d4 = iReSqtkUVgvwXiReSqtkUVg2.g();
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            iReSqtkUVghfWiReSqtkUVg iReSqtkUVghfWiReSqtkUVg2;
            iReSqtkUVgplRiReSqtkUVg iReSqtkUVgplRiReSqtkUVg2;
            Color color;
            if (!iReSqtkUVgSzRiReSqtkUVg.d.isAssignableFrom(e.getClass()) || (color = this.b.a(e)) == null) continue;
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(e);
            if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgDfKiReSqtkUVg2) && this.b.b.i().booleanValue()) continue;
            if (iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgDfKiReSqtkUVg2)) {
                color = Color.BLUE;
            }
            double d5 = iReSqtkUVgDfKiReSqtkUVg2.Q() + (iReSqtkUVgDfKiReSqtkUVg2.z() - iReSqtkUVgDfKiReSqtkUVg2.Q()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d2;
            double d6 = iReSqtkUVgDfKiReSqtkUVg2.R() + (iReSqtkUVgDfKiReSqtkUVg2.A() - iReSqtkUVgDfKiReSqtkUVg2.R()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d3;
            double d7 = iReSqtkUVgDfKiReSqtkUVg2.S() + (iReSqtkUVgDfKiReSqtkUVg2.B() - iReSqtkUVgDfKiReSqtkUVg2.S()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a() - d4;
            boolean bl = GL11.glIsEnabled((int)3042);
            GL11.glPushMatrix();
            GL11.glBlendFunc((int)770, (int)771);
            if (!bl) {
                GL11.glEnable((int)3042);
            }
            GL11.glBlendFunc((int)770, (int)771);
            iReSqtkUVguKSiReSqtkUVg.a(color);
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)4.0f);
            GL11.glDisable((int)3553);
            GL11.glTranslated((double)d5, (double)d6, (double)d7);
            iReSqtkUVgtfiiReSqtkUVg iReSqtkUVgtfiiReSqtkUVg2 = this.b.e.a(iReSqtkUVgDfKiReSqtkUVg2);
            if (iReSqtkUVgtfiiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bq) && (iReSqtkUVgplRiReSqtkUVg2 = (iReSqtkUVghfWiReSqtkUVg2 = new iReSqtkUVghfWiReSqtkUVg(iReSqtkUVgtfiiReSqtkUVg2.a())).f()).c() && iReSqtkUVgplRiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bp)) {
                iReSqtkUVgAHOiReSqtkUVg iReSqtkUVgAHOiReSqtkUVg2 = new iReSqtkUVgAHOiReSqtkUVg(iReSqtkUVgplRiReSqtkUVg2.a());
                boolean bl2 = iReSqtkUVgDfKiReSqtkUVg2.M();
                float f2 = bl2 ? 0.6f : 0.75f;
                GL11.glRotatef((float)iReSqtkUVgDfKiReSqtkUVg2.aV(), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d8 = bl2 ? -0.2 : 0.0;
                GL11.glTranslated((double)-0.15, (double)f2, (double)d8);
                float f3 = iReSqtkUVgAHOiReSqtkUVg2.h().d() * f;
                float f4 = iReSqtkUVgAHOiReSqtkUVg2.h().e() * f;
                float f5 = iReSqtkUVgAHOiReSqtkUVg2.h().f() * f;
                GL11.glRotatef((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f5), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f5, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f3), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.3, (double)0.0, (double)0.0);
                f3 = iReSqtkUVgAHOiReSqtkUVg2.i().d() * f;
                f4 = iReSqtkUVgAHOiReSqtkUVg2.i().e() * f;
                f5 = iReSqtkUVgAHOiReSqtkUVg2.i().f() * f;
                GL11.glRotatef((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f5), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f5, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f3), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.15, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.15, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.15, (double)0.0, (double)0.0);
                GL11.glEnd();
                if (iReSqtkUVgDfKiReSqtkUVg2.M()) {
                    GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)0.65, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)0.0, (double)0.65, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.35, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.35, (double)0.0, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                f3 = iReSqtkUVgAHOiReSqtkUVg2.f().d() * f;
                f4 = iReSqtkUVgAHOiReSqtkUVg2.f().e() * f;
                f5 = iReSqtkUVgAHOiReSqtkUVg2.f().f() * f;
                GL11.glRotatef((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f5), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f5, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f3), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.7, (double)0.0, (double)0.0);
                f3 = iReSqtkUVgAHOiReSqtkUVg2.g().d() * f;
                f4 = iReSqtkUVgAHOiReSqtkUVg2.g().e() * f;
                f5 = iReSqtkUVgAHOiReSqtkUVg2.g().f() * f;
                GL11.glRotatef((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f5), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f5, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f3), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                GL11.glRotatef((float)(-iReSqtkUVgDfKiReSqtkUVg2.aV()), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d9 = 0.4;
                GL11.glRotated((double)iReSqtkUVgDfKiReSqtkUVg2.F(), (double)0.0, (double)-999.0, (double)0.0);
                GL11.glRotated((double)iReSqtkUVgDfKiReSqtkUVg2.G(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d9, (double)0.0);
                GL11.glEnd();
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)d9, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d9, (double)0.25);
                GL11.glEnd();
                GL11.glRotated((double)iReSqtkUVgDfKiReSqtkUVg2.G(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glRotated((double)(-iReSqtkUVgDfKiReSqtkUVg2.F()), (double)0.0, (double)999.0, (double)0.0);
            }
            if (!bl) {
                GL11.glDisable((int)3042);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)2848);
            GL11.glPopMatrix();
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }
}

