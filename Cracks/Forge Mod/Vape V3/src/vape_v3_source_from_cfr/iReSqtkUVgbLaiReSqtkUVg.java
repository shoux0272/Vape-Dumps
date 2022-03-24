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

public class iReSqtkUVgbLaiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgZGNiReSqtkUVg b = (iReSqtkUVgZGNiReSqtkUVg)this.x();
    private List<double[]> c = new ArrayList<double[]>();

    public iReSqtkUVgbLaiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgWkmiReSqtkUVg2.a();
        double d2 = iReSqtkUVgWkmiReSqtkUVg2.b();
        double d3 = iReSqtkUVgWkmiReSqtkUVg2.c();
        double d4 = iReSqtkUVgWkmiReSqtkUVg2.d();
        double d5 = iReSqtkUVgjSjiReSqtkUVg2.T() / 2.0f;
        double[] arrd = iReSqtkUVgoCkiReSqtkUVg.a(d2, d3 - d5, d4);
        double[] arrd2 = iReSqtkUVgoCkiReSqtkUVg.a(d2, d3 + d5, d4);
        Color color = this.b.a(iReSqtkUVgjSjiReSqtkUVg2.a());
        if (color == null) {
            return;
        }
        if (arrd[2] < 0.9 || arrd2[2] < 0.9) {
            return;
        }
        this.c.add(new double[]{arrd[0], arrd[1], arrd2[0], arrd2[1], iReSqtkUVgjSjiReSqtkUVg2.U() / iReSqtkUVgjSjiReSqtkUVg2.T(), color.getRGB()});
    }

    @Override
    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
        for (double[] arrd : this.c) {
            iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgdAbiReSqtkUVg.a(new iReSqtkUVgeLLiReSqtkUVg(), iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
            float f = iReSqtkUVgeLLiReSqtkUVg.q();
            double d2 = ((double)f - arrd[1]) / (double)iReSqtkUVgdAbiReSqtkUVg2.d();
            double d3 = arrd[2] / (double)iReSqtkUVgdAbiReSqtkUVg2.d();
            double d4 = ((double)f - arrd[3]) / (double)iReSqtkUVgdAbiReSqtkUVg2.d();
            double d5 = d4 - d2;
            double d6 = d5 * arrd[4] / 2.0;
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            iReSqtkUVguKSiReSqtkUVg.a(new Color((int)arrd[5]));
            GL11.glLineWidth((float)1.5f);
            GL11.glEnable((int)2848);
            GL11.glBegin((int)2);
            GL11.glVertex2d((double)(d3 - d6), (double)(d2 += d5 / 2.0));
            GL11.glVertex2d((double)(d3 + d6), (double)d2);
            GL11.glVertex2d((double)(d3 + d6), (double)(d4 += d5 / 2.0));
            GL11.glVertex2d((double)(d3 - d6), (double)d4);
            GL11.glEnd();
            GL11.glDisable((int)2848);
            GL11.glEnable((int)3553);
        }
        this.c.clear();
    }
}

