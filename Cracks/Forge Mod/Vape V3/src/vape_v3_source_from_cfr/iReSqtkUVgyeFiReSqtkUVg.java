/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgyeFiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgZGNiReSqtkUVg b = (iReSqtkUVgZGNiReSqtkUVg)this.x();
    private iReSqtkUVggHniReSqtkUVg c;

    public iReSqtkUVgyeFiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d2 = this.b.e.e();
        double d3 = this.b.e.f();
        double d4 = this.b.e.g();
        if (this.c == null) {
            this.c = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVggHniReSqtkUVg.class);
        }
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            Color color;
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (iReSqtkUVgFuiiReSqtkUVg.e.r().b(iReSqtkUVgjSjiReSqtkUVg2) && this.b.b.i().booleanValue() || (color = this.b.a(e)) == null) continue;
            double d5 = iReSqtkUVgjSjiReSqtkUVg2.Q() + (iReSqtkUVgjSjiReSqtkUVg2.z() - iReSqtkUVgjSjiReSqtkUVg2.Q()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a();
            double d6 = iReSqtkUVgjSjiReSqtkUVg2.R() + (iReSqtkUVgjSjiReSqtkUVg2.A() - iReSqtkUVgjSjiReSqtkUVg2.R()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a();
            double d7 = iReSqtkUVgjSjiReSqtkUVg2.S() + (iReSqtkUVgjSjiReSqtkUVg2.B() - iReSqtkUVgjSjiReSqtkUVg2.S()) * (double)iReSqtkUVgDVPiReSqtkUVg2.a();
            float f = iReSqtkUVgjSjiReSqtkUVg2.X() + (this.b.c.i() != false && this.c.b() ? this.c.y() : 0.0f);
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.V().b(f, f, f);
            iReSqtkUVgoCkiReSqtkUVg.a(d5 - (iReSqtkUVgmXTiReSqtkUVg2.d() - iReSqtkUVgmXTiReSqtkUVg2.g()) / 2.0, d6 - (d6 - iReSqtkUVgmXTiReSqtkUVg2.e()), d7 - (iReSqtkUVgmXTiReSqtkUVg2.f() - iReSqtkUVgmXTiReSqtkUVg2.i()) / 2.0, iReSqtkUVgmXTiReSqtkUVg2.f() - iReSqtkUVgmXTiReSqtkUVg2.i(), iReSqtkUVgmXTiReSqtkUVg2.h() - iReSqtkUVgmXTiReSqtkUVg2.e(), iReSqtkUVgmXTiReSqtkUVg2.d() - iReSqtkUVgmXTiReSqtkUVg2.g(), 0.1, color, null, d2, d3, d4);
            if (!(this.c.x() > 0.0f) || !this.b.c.i().booleanValue() || !this.b.d.i().booleanValue()) continue;
            iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgjSjiReSqtkUVg2.V().b(f -= this.c.y(), f, f);
            Color color2 = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue(), 70);
            iReSqtkUVgoCkiReSqtkUVg.a(d5 - (iReSqtkUVgmXTiReSqtkUVg2.d() - iReSqtkUVgmXTiReSqtkUVg2.g()) / 2.0, d6 - (d6 - iReSqtkUVgmXTiReSqtkUVg2.e()), d7 - (iReSqtkUVgmXTiReSqtkUVg2.f() - iReSqtkUVgmXTiReSqtkUVg2.i()) / 2.0, iReSqtkUVgmXTiReSqtkUVg2.f() - iReSqtkUVgmXTiReSqtkUVg2.i(), iReSqtkUVgmXTiReSqtkUVg2.h() - iReSqtkUVgmXTiReSqtkUVg2.e(), iReSqtkUVgmXTiReSqtkUVg2.d() - iReSqtkUVgmXTiReSqtkUVg2.g(), 0.1, color2, null, d2, d3, d4);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }
}

